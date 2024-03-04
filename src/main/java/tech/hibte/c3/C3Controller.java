package tech.hibte.c3;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.hibte.c3.model.entity.ArentC3;
import tech.hibte.c3.model.mapper.C3Mapper;
import tech.hibte.c3.model.view.ArentC3View;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@RestController
public class C3Controller {

    private final ObjectMapper parser;
    private final C3Repository repository;

    public C3Controller(@Autowired ObjectMapper parser, @Autowired C3Repository repository) {
        this.parser = parser;
        this.repository = repository;
    }


    @GetMapping("/c3-load")
    public void hibLoad() throws IOException {
        var res = Thread.currentThread().getContextClassLoader();

        try (var is = new InputStreamReader(Objects.requireNonNull(res.getResourceAsStream("static/c2.json")))) {
            var json = new BufferedReader(is).lines().collect(Collectors.joining("\n"));

            List<ArentC3View> views = parser.readerForListOf(ArentC3View.class).readValue(json);

            List<ArentC3> entities = views.stream().map(C3Mapper.INSTANCE::toArent).toList();

            repository.saveAllAndFlush(entities);
        }
    }
}
