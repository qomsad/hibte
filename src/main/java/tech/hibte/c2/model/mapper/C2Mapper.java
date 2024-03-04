package tech.hibte.c2.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import tech.hibte.c2.model.entity.ArentC2;
import tech.hibte.c2.model.entity.DictC2;
import tech.hibte.c2.model.view.ArentC2View;
import tech.hibte.c2.model.view.ChildC2View;
import tech.hibte.c2.model.view.DictC2View;

@Mapper
public interface C2Mapper {

    C2Mapper INSTANCE = Mappers.getMapper(C2Mapper.class);

    @Mapping(target = "uuid", source = "uuid")
    @Mapping(target = "cpls", source = "cpls")
    @Mapping(target = "index", source = "index")
    @Mapping(target = "child", source = "child")
    ArentC2 toArent(ArentC2View el);

    @Mapping(target = "uuid", source = "uuid")
    @Mapping(target = "dict", source = "dict")
    ChildC2View toChild(ChildC2View el);

    @Mapping(target = "code", source = "code")
    @Mapping(target = "name", source = "name")
    DictC2 toDict(DictC2View el);
}
