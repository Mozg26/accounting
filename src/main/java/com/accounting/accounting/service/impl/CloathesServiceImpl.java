package com.accounting.accounting.service.impl;
import com.accounting.accounting.entity.Cloathes;
import com.accounting.accounting.repository.CloathesRepository;
import com.accounting.accounting.service.CloathesService;
import org.springframework.beans.factory.annotation.Autowired;

public class CloathesServiceImpl implements CloathesService{

    private CloathesRepository cloathesRepository;

    public CloathesServiceImpl(CloathesRepository cloathesRepository) {
        this.cloathesRepository = cloathesRepository;
    }

    @Override
    public Cloathes createCloathes(String city, String address, int size, String color, int count, double cost) {
        Cloathes cloathes = new Cloathes();
        cloathes.setCity(city);
        cloathes.setAddress(address);
        cloathes.setSize(size);
        cloathes.setColor(color);
        cloathes.setCount(count);
        cloathes.setCost(cost);

        return cloathesRepository.save(cloathes);
    }
}
