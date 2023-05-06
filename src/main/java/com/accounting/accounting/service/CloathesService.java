package com.accounting.accounting.service;

import com.accounting.accounting.dto.ProductAvailabilityDTO;
import com.accounting.accounting.entity.Cloathes;
import com.accounting.accounting.entity.Color;


public interface CloathesService {

    /*Cloathes createCloathes(String city, String address, int size, Color color, int count, double cost);

    Cloathes updateCloathes(long id, String city, String address, int size, Color color, int count, double cost);*/

    Cloathes getCloathesById(long id);

    //void deleteTaskById(long id);
}
