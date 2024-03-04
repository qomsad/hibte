package tech.hibte.c1.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChildC1View {

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("dict")
    private DictC1View dict;
}
