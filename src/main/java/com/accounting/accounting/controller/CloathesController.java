package com.accounting.accounting.controller;
import com.accounting.accounting.entity.Cloathes;
import com.accounting.accounting.service.CloathesService;
import com.accounting.accounting.dto.CloathesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("acc/availability")
public class CloathesController {

    private CloathesService cloathesService;

    @Autowired
    public CloathesController(CloathesService cloathesService) {
        this.cloathesService = cloathesService;
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Cloathes> createCloathes(@RequestBody CloathesDto cloathesDto) {
    Cloathes cloathes = cloathesService.createCloathes(cloathesDto.getCity(), cloathesDto.getAddress(),
            cloathesDto.getSize(), cloathesDto.getColor(), cloathesDto.getCount(), cloathesDto.getCost());
    return ResponseEntity.ok(cloathes);
    }

    /*public ResponseEntity<Cloathes> updateCloathes(Cloathes cloathes, Long id) {

    }

    public ResponseEntity<Cloathes> getCloathesById(Long id) {

    }

    public void deleteCloathesByID(Long id) {

    }*/
}
