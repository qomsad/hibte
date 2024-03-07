package tech.hibte.d1.model.view;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ArentD1View {

    @JsonProperty("id")
    private Long id;

    @JsonProperty("info")
    private String info;

    @JsonProperty("child_many")
    private List<ChildManyD1View> childMany;

    @JsonProperty("child_one")
    private ChildOneD1View childOne;
}
