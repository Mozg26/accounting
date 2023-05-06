package com.accounting.accounting.test;

import com.accounting.accounting.entity.Cloathes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

class CloathesControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private Cloathes cloathes;
    @Test
    void createCloathes() {
    }
    @Test
    void updateCloathes() {
    }

    @Test
    void getCloathesById() {
    }

    @Test
    void deleteCloathesByID() {
    }
}