package ru.netology.ticketinfo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class AvailableOptionsTest {

    AvailableOptions first = new AvailableOptions(1, 4515, "GOJ", "VKO", 45);
    AvailableOptions second = new AvailableOptions(2, 7856, "GOJ", "LED", 150);
    AvailableOptions third = new AvailableOptions(3, 18356, "SVO", "ABA", 270);
    AvailableOptions fourth = new AvailableOptions(4, 6895, "VKO", "GZP", 205);
    AvailableOptions fifth = new AvailableOptions(5, 5635, "VKO", "LCA", 245);
    AvailableOptions sixth = new AvailableOptions(6, 7895, "DME", "GOA", 260);


    @Test
    public void shouldSortByPrice() {
        AvailableOptions[] expected = new AvailableOptions[]{first, fifth, fourth, second, sixth, third};
        AvailableOptions[] actual = new AvailableOptions[]{first, second, third, fourth, fifth, sixth};
        Arrays.sort(actual);
        assertArrayEquals(expected, actual);
    }


}

