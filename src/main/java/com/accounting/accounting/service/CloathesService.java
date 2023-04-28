package com.accounting.accounting.service;

import com.accounting.accounting.entity.Cloathes;


public interface CloathesService {

    Cloathes createCloathes(String city, String address, int size, String color, int count, double cost);

    Cloathes updateCloathes(long id, String city, String address, int size, String color, int count, double cost);

    Cloathes getCloathesById(long id);

    void deleteTaskById(Long id);
}
