package ru.netology.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.repository.OptionsRepository;
import ru.netology.ticketinfo.AvailableOptions;
import ru.netology.manager.OptionsManager;

public class OptionManagerTest {
    private OptionsManager manager = new OptionsManager();
    AvailableOptions first = new AvailableOptions(1, 4515, "GOJ", "VKO", 45);
    AvailableOptions second = new AvailableOptions(2, 7856, "GOJ", "LED", 150);
    AvailableOptions third = new AvailableOptions(3, 18356, "SVO", "ABA", 270);
    AvailableOptions fourth = new AvailableOptions(4, 6895, "VKO", "GZP", 205);
    AvailableOptions fifth = new AvailableOptions(5, 5635, "VKO", "LCA", 245);
    AvailableOptions sixth = new AvailableOptions(6, 7895, "DME", "GOA", 260);

    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
    }

    @Test
    void shouldFindByLocarion() {
        String from = "VKO";
        String to = "LCA";
        AvailableOptions[] expected = new AvailableOptions[]{fifth};
        AvailableOptions[] actual = manager.findByLocation(from, to);
        assertArrayEquals(expected, actual);
        System.out.println("Have a nice flight!");
    }

}


