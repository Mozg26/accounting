package com.accounting.accounting.controller;
import com.accounting.accounting.entity.Cloathes;
import com.accounting.accounting.service.CloathesService;
import com.accounting.accounting.dto.CloathesDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/acc")
public class CloathesController {

    private final CloathesService cloathesService;

    @Autowired
    public CloathesController(CloathesService cloathesService) {
        this.cloathesService = cloathesService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<Cloathes> createCloathes(@RequestBody CloathesDto cloathesDto) {
    Cloathes cloathes = cloathesService.createCloathes(cloathesDto.getCity(), cloathesDto.getAddress(),
            cloathesDto.getSize(), cloathesDto.getColor(), cloathesDto.getCount(), cloathesDto.getCost());
    return ResponseEntity.status(HttpStatus.CREATED).body(cloathes);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<Cloathes> updateCloathes(@RequestBody CloathesDto cloathesDto) {
        Cloathes cloathes = cloathesService.updateCloathes(cloathesDto.getPartNumber(),cloathesDto.getCity(), cloathesDto.getAddress(),
                cloathesDto.getSize(), cloathesDto.getColor(), cloathesDto.getCount(), cloathesDto.getCost());
        return ResponseEntity.ok(cloathes);
    }
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Cloathes> getCloathesById(@RequestBody CloathesDto cloathesDto) {
        Cloathes cloathes = cloathesService.getCloathesById(cloathesDto.getPartNumber());
        return ResponseEntity.ok(cloathes);
    }
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCloathesByID(@RequestBody CloathesDto cloathesDto) {
        cloathesService.deleteTaskById(cloathesDto.getPartNumber());
    }
}
