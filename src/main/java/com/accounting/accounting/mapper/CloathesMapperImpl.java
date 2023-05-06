package com.accounting.accounting.mapper;

import com.accounting.accounting.dto.ProductAvailabilityDTO;
import com.accounting.accounting.entity.Cloathes;

public class CloathesMapperImpl implements CloathesMapper {
    @Override
    public ProductAvailabilityDTO cloathesToDTO(Cloathes cloathes) {

        ProductAvailabilityDTO productAvailabilityDTO = new ProductAvailabilityDTO();
        productAvailabilityDTO.setPartNumber(cloathes.getId());
        productAvailabilityDTO.setCity(cloathes.getCity());
        productAvailabilityDTO.setAddress(cloathes.getAddress());
        productAvailabilityDTO.setSize(cloathes.getSize());
        productAvailabilityDTO.setCount(cloathes.getCount());
        productAvailabilityDTO.setColor(cloathes.getColor());

        return productAvailabilityDTO;
    }
}
