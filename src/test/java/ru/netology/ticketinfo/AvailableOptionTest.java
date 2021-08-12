package ru.netology.ticketinfo;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AvailableOptionTest {

    AvailableOption first = new AvailableOption(1, 4515, "GOJ", "VKO", 45);
    AvailableOption second = new AvailableOption(2, 7856, "GOJ", "LED", 150);
    AvailableOption third = new AvailableOption(3, 18356, "SVO", "ABA", 270);
    AvailableOption fourth = new AvailableOption(4, 6895, "VKO", "GZP", 205);
    AvailableOption fifth = new AvailableOption(5, 5635, "VKO", "LCA", 245);
    AvailableOption sixth = new AvailableOption(6, 7895, "DME", "GOA", 260);


    @Test
    public void shouldSortByPrice() {
        AvailableOption[] expected = new AvailableOption[]{first, fifth, fourth, second, sixth, third};
        AvailableOption[] actual = new AvailableOption[]{first, second, third, fourth, fifth, sixth};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }


}

