package de.renoth.mapper;

import org.mapstruct.*;

import de.renoth.classes.SourceClass;
import de.renoth.classes.TargetClass;
import de.renoth.classes.*;

@Mapper(unmappedTargetPolicy = ReportingPolicy.ERROR)
public abstract class MyMapper {

	@Mapping(target = "aaaa", source = "memberA.CCCC")
	@Mapping(target = "BBBB", source = "ident")
	public abstract void mapBenutzer(SourceClass source, @MappingTarget TargetClass target);

	@InheritInverseConfiguration
	public abstract void mapBenutzer(TargetClass source, @MappingTarget SourceClass target);

	public abstract AAAA map(CCCC value);

	public abstract BBBB map(String value);

	public abstract CCCC map(AAAA value);


}