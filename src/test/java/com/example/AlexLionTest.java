package com.example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class AlexLionTest {

    Feline felineMock = Mockito.mock(Feline.class);

    @Test
    public void testGetKittens() throws Exception {
        AlexLion alexLion = new AlexLion(felineMock);
        assertEquals(0, alexLion.getKittens());
    }

    @Test
    public void testGetFriends() throws Exception {
        AlexLion alexLion = new AlexLion(felineMock);
        List<String> expected = List.of("Марти", "Глория", "Мелман");
        assertEquals(expected, alexLion.getFriends());
    }

    @Test
    public void testGetPlaceOfLiving() throws Exception {
        AlexLion alexLion = new AlexLion(felineMock);
        assertEquals("Нью-Йоркский зоопарк", alexLion.getPlaceOfLiving());
    }
}
