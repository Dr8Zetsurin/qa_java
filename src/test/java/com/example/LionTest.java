package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class LionTest {

    Feline felineMock = Mockito.mock(Feline.class);

    @Test
    public void testGetKittens() throws Exception {
        Mockito.when(felineMock.getKittens()).thenReturn(2);
        Lion lion = new Lion("Самец", felineMock);
        assertEquals(2, lion.getKittens());
    }

    @Test
    public void testGetFood() throws Exception {
        Mockito.when(felineMock.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        Lion lion = new Lion("Самка", felineMock);
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, lion.getFood());
    }

    @Test
    public void testInvalidSexException() {
        Exception exception = assertThrows(Exception.class, () -> {
            new Lion("Неопределён", felineMock);
        });
        assertEquals("Используйте допустимые значения пола животного - Самец или Самка", exception.getMessage());
    }
}
