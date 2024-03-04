package tech.hibte.c1.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import tech.hibte.c1.model.entity.ArentC1;
import tech.hibte.c1.model.entity.DictC1;
import tech.hibte.c1.model.view.ArentC1View;
import tech.hibte.c1.model.view.ChildC1View;
import tech.hibte.c1.model.view.DictC1View;

@Mapper
public interface C1Mapper {

    C1Mapper INSTANCE = Mappers.getMapper(C1Mapper.class);

    @Mapping(target = "uuid", source = "uuid")
    @Mapping(target = "cpls", source = "cpls")
    @Mapping(target = "index", source = "index")
    @Mapping(target = "child", source = "child")
    ArentC1 toArent(ArentC1View el);

    @Mapping(target = "uuid", source = "uuid")
    @Mapping(target = "dict", source = "dict")
    ChildC1View toChild(ChildC1View el);

    @Mapping(target = "code", source = "code")
    @Mapping(target = "name", source = "name")
    DictC1 toDict(DictC1View el);
}
