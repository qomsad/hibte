package tech.hibte.d1.model.mapper;

import org.mapstruct.AfterMapping;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;
import tech.hibte.d1.model.entity.ArentD1;
import tech.hibte.d1.model.entity.ChildManyD1;
import tech.hibte.d1.model.entity.ChildOneD1;
import tech.hibte.d1.model.entity.DictD1;
import tech.hibte.d1.model.view.ArentD1View;
import tech.hibte.d1.model.view.ChildManyD1View;
import tech.hibte.d1.model.view.ChildOneD1View;
import tech.hibte.d1.model.view.DictD1View;

import java.util.Optional;

@Mapper
public interface D1Mapper {

    D1Mapper INSTANCE = Mappers.getMapper(D1Mapper.class);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "info", source = "info")
    @Mapping(target = "childMany", source = "childMany")
    @Mapping(target = "childOne", source = "childOne")
    ArentD1 toArent(ArentD1View el);

    @Mapping(target = "path", source = "path")
    @Mapping(target = "dict", source = "dict")
    ChildManyD1 toChildMany(ChildManyD1View el);

    @Mapping(target = "additional", source = "additional")
    ChildOneD1 toChildOne(ChildOneD1View el);

    @Mapping(target = "code", source = "code")
    @Mapping(target = "name", source = "name")
    DictD1 toDict(DictD1View el);

    @AfterMapping
    default void setParent(@MappingTarget ArentD1 el) {
        Optional.ofNullable(el.getChildOne()).ifPresent(it -> it.setArent(el));
    }
}
