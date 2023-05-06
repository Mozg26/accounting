package com.accounting.accounting.mapper;

import com.accounting.accounting.dto.ProductAvailabilityDTO;
import com.accounting.accounting.entity.Cloathes;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper
public interface CloathesMapper {
    @Mapping(source = "cloathes.id", target = "partNumber")
    ProductAvailabilityDTO cloathesToDTO (Cloathes cloathes);
}
