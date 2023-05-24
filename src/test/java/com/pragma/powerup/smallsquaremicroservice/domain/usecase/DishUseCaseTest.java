package com.pragma.powerup.smallsquaremicroservice.domain.usecase;


import com.pragma.powerup.smallsquaremicroservice.domain.spi.IDishPersistencePort;
import com.pragma.powerup.smallsquaremicroservice.domain.usercase.DishUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.pragma.powerup.smallsquaremicroservice.domain.utils.DishModelValues.INSTANCE_DISH;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class DishUseCaseTest {
    @Mock
    private IDishPersistencePort dishPersistencePortMock;
    @Mock
    DishUseCase dishUseCaseMock;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        dishUseCaseMock = new DishUseCase(dishPersistencePortMock);
    }

    @Test
    public void testSaveDish() {
        dishUseCaseMock.saveDish(INSTANCE_DISH,1L);
        verify(dishPersistencePortMock).saveDish(INSTANCE_DISH,1L);
    }

}
