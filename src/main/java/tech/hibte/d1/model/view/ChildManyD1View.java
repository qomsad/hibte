package tech.hibte.d1.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChildManyD1View {

    @JsonProperty("path")
    private String path;

    @JsonProperty("dict")
    private DictD1View dict;
}
