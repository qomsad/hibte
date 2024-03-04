package tech.hibte.c1.model.view;

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
public class ArentC1View {

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("cpls")
    private String cpls;

    @JsonProperty("index")
    private Integer index;

    @JsonProperty("child")
    private List<ChildC1View> child;
}
