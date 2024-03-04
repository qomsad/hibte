package tech.hibte.c3.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;
import tech.hibte.c3.model.entity.ArentC3;
import tech.hibte.c3.model.entity.DictC3;
import tech.hibte.c3.model.view.ArentC3View;
import tech.hibte.c3.model.view.ChildC3View;
import tech.hibte.c3.model.view.DictC3View;

@Mapper
public interface C3Mapper {

    C3Mapper INSTANCE = Mappers.getMapper(C3Mapper.class);

    @Mapping(target = "uuid", source = "uuid")
    @Mapping(target = "cpls", source = "cpls")
    @Mapping(target = "index", source = "index")
    @Mapping(target = "child", source = "child")
    ArentC3 toArent(ArentC3View el);

    @Mapping(target = "uuid", source = "uuid")
    @Mapping(target = "dict", source = "dict")
    ChildC3View toChild(ChildC3View el);

    @Mapping(target = "code", source = "code")
    @Mapping(target = "name", source = "name")
    DictC3 toDict(DictC3View el);
}
