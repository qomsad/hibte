package tech.hibte.c1;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.hibte.c1.model.entity.ArentC1;
import tech.hibte.c1.model.mapper.C1Mapper;
import tech.hibte.c1.model.view.ArentC1View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class C1Controller {

    private final ObjectMapper parser;
    private final C1Repository repository;

    public C1Controller(@Autowired ObjectMapper parser, @Autowired C1Repository repository) {
        this.parser = parser;
        this.repository = repository;
    }


    @GetMapping("/c1-load")
    public void hibLoad() throws IOException {
        var res = Thread.currentThread().getContextClassLoader();

        try (var is = new InputStreamReader(Objects.requireNonNull(res.getResourceAsStream("static/c1.json")))) {
            var json = new BufferedReader(is).lines().collect(Collectors.joining("\n"));

            List<ArentC1View> views = parser.readerForListOf(ArentC1View.class).readValue(json);

            List<ArentC1> entities = views.stream().map(C1Mapper.INSTANCE::toArent).toList();

            repository.saveAllAndFlush(entities);
        }
    }
}
