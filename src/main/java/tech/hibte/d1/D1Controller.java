package tech.hibte.d1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.hibte.d1.model.entity.ArentD1;
import tech.hibte.d1.model.mapper.D1Mapper;
import tech.hibte.d1.model.view.ArentD1View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class D1Controller {

    private final ObjectMapper parser;
    private final D1Repository repository;

    public D1Controller(@Autowired ObjectMapper parser, @Autowired D1Repository repository) {
        this.parser = parser;
        this.repository = repository;
    }


    @GetMapping("/d1-load")
    public void hibLoad(String name) throws IOException {
        var res = Thread.currentThread().getContextClassLoader();

        try (var is = new InputStreamReader(Objects.requireNonNull(res.getResourceAsStream("static/%s.json".formatted(name))))) {
            var json = new BufferedReader(is).lines().collect(Collectors.joining("\n"));

            List<ArentD1View> views = parser.readerForListOf(ArentD1View.class).readValue(json);

            List<ArentD1> entities = views.stream().map(D1Mapper.INSTANCE::toArent).toList();

            for (var entity : entities) {
                repository.save(entity);
            }
        }
    }
}
