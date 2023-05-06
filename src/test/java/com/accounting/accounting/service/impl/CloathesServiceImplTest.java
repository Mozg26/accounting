package com.accounting.accounting.service.impl;

import com.accounting.accounting.entity.Cloathes;
import com.accounting.accounting.repository.CloathesRepository;
import com.accounting.accounting.service.CloathesService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class CloathesServiceImplTest {
    private static final long ID = 1L;

    @Mock
    private CloathesRepository cloathesRepository;

    @InjectMocks
    private CloathesService cloathesService;

    @Test
    void findCloathes_shouldCallRepository() {
        final Cloathes cloathes = mock(Cloathes.class);
        when(cloathesRepository.findById(ID)).thenReturn(Optional.ofNullable(cloathes));

        final Cloathes actual = cloathesService.getCloathesById(ID);

        assertNotNull(actual);
        assertEquals(cloathes, actual);
        verify(cloathesRepository).findById(ID);
    }

}