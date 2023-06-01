package com.pragma.powerup.smallsquaremicroservice.domain.usecase;


import com.pragma.powerup.smallsquaremicroservice.domain.spi.IDishPersistencePort;
import com.pragma.powerup.smallsquaremicroservice.domain.usercase.DishUseCase;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.pragma.powerup.smallsquaremicroservice.domain.utils.DishModelValues.INSTANCE_DISH;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class DishUseCaseTest {
    @Mock
    private IDishPersistencePort dishPersistencePortMock;
    @InjectMocks
    private DishUseCase dishUseCaseMock;

    @Test
    public void testSaveDish() {
        dishUseCaseMock.saveDish(INSTANCE_DISH,1L);
        verify(dishPersistencePortMock).saveDish(INSTANCE_DISH,1L);
    }

    @Test
    public void testUpdateDish(){
        dishUseCaseMock.updateDish(INSTANCE_DISH,1L);
        verify(dishPersistencePortMock).updateDish(INSTANCE_DISH,1L);
    }

    @Test
    public void testUpdateDishStatus(){
        dishUseCaseMock.updateDishStatus(INSTANCE_DISH,1L);
        verify(dishPersistencePortMock).updateDishStatus(INSTANCE_DISH,1L);
    }

}
