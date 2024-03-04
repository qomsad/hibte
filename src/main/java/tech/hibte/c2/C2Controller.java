package tech.hibte.c2;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.hibte.c2.model.entity.ArentC2;
import tech.hibte.c2.model.mapper.C2Mapper;
import tech.hibte.c2.model.view.ArentC2View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class C2Controller {

    private final ObjectMapper parser;
    private final C2Repository repository;

    public C2Controller(@Autowired ObjectMapper parser, @Autowired C2Repository repository) {
        this.parser = parser;
        this.repository = repository;
    }


    @GetMapping("/c2-load")
    public void hibLoad() throws IOException {
        var res = Thread.currentThread().getContextClassLoader();

        try (var is = new InputStreamReader(Objects.requireNonNull(res.getResourceAsStream("static/c2.json")))) {
            var json = new BufferedReader(is).lines().collect(Collectors.joining("\n"));

            List<ArentC2View> views = parser.readerForListOf(ArentC2View.class).readValue(json);

            List<ArentC2> entities = views.stream().map(C2Mapper.INSTANCE::toArent).toList();

            repository.saveAllAndFlush(entities);
        }
    }
}
