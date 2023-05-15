package com.pragma.powerup.smallsquaremicroservice.domain.usecase;

import com.pragma.powerup.smallsquaremicroservice.domain.datasource.IUserClientPort;
import com.pragma.powerup.smallsquaremicroservice.domain.exceptions.InvalidNitException;
import com.pragma.powerup.smallsquaremicroservice.domain.model.Restaurant;
import com.pragma.powerup.smallsquaremicroservice.domain.spi.IRestaurantPersistencePort;
import com.pragma.powerup.smallsquaremicroservice.domain.usercase.RestaurantUseCase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.pragma.powerup.smallsquaremicroservice.domain.utils.RestaurantModelValues.INSTANCE_RESTAURANT;
import static com.pragma.powerup.smallsquaremicroservice.domain.utils.RestaurantModelValues.INVALID_OWNER;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class RestaurantUseCaseTest {
    @Mock
    private IRestaurantPersistencePort restaurantPersistencePort;
    @Mock
    private IUserClientPort userClientPort;
    @Mock
    RestaurantUseCase restaurantUseCaseMock;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        restaurantUseCaseMock = new RestaurantUseCase(restaurantPersistencePort,userClientPort);
    }

    private Restaurant restaurantMock;

    @Test
    public void testSaveOwner() {
        when(userClientPort.getUser(INSTANCE_RESTAURANT.getIdOwner())).thenReturn(true);

        restaurantUseCaseMock.saveRestaurant(INSTANCE_RESTAURANT);

        verify(userClientPort).getUser(INSTANCE_RESTAURANT.getIdOwner());
        verify(restaurantPersistencePort).saveRestaurant(INSTANCE_RESTAURANT);
    }

    @Test
    public void testSaveOwnerNull(){
        assertThrows(NullPointerException.class, () -> restaurantUseCaseMock.saveRestaurant(null));
    }

}
