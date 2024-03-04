package tech.hibte.c2.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ChildC2View {

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("dict")
    private DictC2View dict;
}
