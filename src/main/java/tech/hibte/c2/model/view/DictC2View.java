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
public class DictC2View {

    @JsonProperty("code")
    private String code;

    @JsonProperty("name")
    private String name;
}
