package com.accounting.accounting.service.impl;
import com.accounting.accounting.entity.Cloathes;
import com.accounting.accounting.repository.CloathesRepository;
import com.accounting.accounting.service.CloathesService;
import org.springframework.stereotype.Service;
import com.accounting.accounting.entity.Color;

@Service
public class CloathesServiceImpl implements CloathesService{

    private CloathesRepository cloathesRepository;

    public CloathesServiceImpl(CloathesRepository cloathesRepository) {
        this.cloathesRepository = cloathesRepository;
    }

    @Override
    public Cloathes createCloathes(String city, String address, int size, Color color, int count, double cost) {
        Cloathes cloathes = mapCloathes(city, address, size, color, count, cost);

        return cloathesRepository.save(cloathes);
    }

    @Override
    public Cloathes updateCloathes(long id, String city, String address, int size, Color color, int count, double cost) {
        Cloathes cloathes = mapCloathes(city, address, size, color, count, cost);
        cloathes.setPartNumber(id);
        return cloathesRepository.save(cloathes);
    }

    @Override
    public Cloathes getCloathesById(long id) {
        return cloathesRepository.getById(id);
    }

    @Override
    public void deleteTaskById(long id) {
        cloathesRepository.deleteById(id);
    }

    private Cloathes mapCloathes (String city, String address, int size, Color color, int count, double cost) {
        Cloathes cloathes = new Cloathes();
        cloathes.setCity(city);
        cloathes.setAddress(address);
        cloathes.setSize(size);
        cloathes.setColor(color);
        cloathes.setCount(count);
        cloathes.setCost(cost);

        return cloathes;
    }
}
