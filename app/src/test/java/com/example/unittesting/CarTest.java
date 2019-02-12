package com.example.unittesting;

import org.junit.Before;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(MockitoJUnitRunner.class)
public class CarTest {

    Car testCar;

    @Mock
    AutomotiveInformation mockAutoInfo;

    @Before
    public void setup() {
        Mockito.when(mockAutoInfo.getMake()).thenReturn("Toyota");
        testCar = new Car("V6",
                "2",
                "Auto",
                4,
                "Rust",
                false,
                mockAutoInfo);
    }
    @Test
    public void testAutoInfo(){

        Mockito.when(mockAutoInfo.getMake()).thenReturn("Toyota");
        assertEquals("Toyota", testCar.getAutomotiveInformation().getMake());
        Mockito.verify(mockAutoInfo, Mockito.times(1)).getMake();
    }
}
