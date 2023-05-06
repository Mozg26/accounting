package com.accounting.accounting.controller;
import com.accounting.accounting.dto.ProductCheckAvailabilityDTO;
import com.accounting.accounting.entity.Cloathes;
import com.accounting.accounting.mapper.CloathesMapper;
import com.accounting.accounting.service.CloathesService;
import com.accounting.accounting.dto.ProductAvailabilityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/acc")
public class CloathesController {

    private final CloathesService cloathesService;
    private final CloathesMapper cloathesMapper;

    @Autowired
    public CloathesController(CloathesService cloathesService, CloathesMapper cloathesMapper) {
        this.cloathesService = cloathesService;
        this.cloathesMapper = cloathesMapper;
    }

    /*@RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Cloathes> createCloathes(@RequestBody ProductAvailabilityDTO productAvailabilityDTO) {
    Cloathes cloathes = cloathesService.createCloathes(productAvailabilityDTO.getCity(), productAvailabilityDTO.getAddress(),
            productAvailabilityDTO.getSize(), productAvailabilityDTO.getColor(), productAvailabilityDTO.getCount(),
            productAvailabilityDTO.getCost());
    return ResponseEntity.status(HttpStatus.CREATED).body(cloathes);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Cloathes> updateCloathes(@RequestBody ProductAvailabilityDTO productAvailabilityDTO) {
        Cloathes cloathes = cloathesService.updateCloathes(productAvailabilityDTO.getPartNumber(), productAvailabilityDTO.getCity(), productAvailabilityDTO.getAddress(),
                productAvailabilityDTO.getSize(), productAvailabilityDTO.getColor(), productAvailabilityDTO.getCount(), productAvailabilityDTO.getCost());
        return ResponseEntity.ok(cloathes);
    }*/
    @RequestMapping(method = RequestMethod.POST)
    @PostMapping("/availability")
    public ResponseEntity<ProductAvailabilityDTO> getCloathesById(@RequestBody ProductCheckAvailabilityDTO productCheckAvailabilityDTO) {
        return new ResponseEntity<>(cloathesMapper.cloathesToDTO(
                cloathesService.getCloathesById(productCheckAvailabilityDTO.getPartNumber())),HttpStatus.OK);
    }
    /*@RequestMapping(method = RequestMethod.DELETE)
    public void deleteCloathesByID(@RequestBody ProductAvailabilityDTO productAvailabilityDTO) {
        cloathesService.deleteTaskById(productAvailabilityDTO.getPartNumber());
    }*/
}
