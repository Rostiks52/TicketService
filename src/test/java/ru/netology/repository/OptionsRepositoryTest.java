package ru.netology.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.repository.OptionsRepository;
import ru.netology.ticketinfo.AvailableOptions;
import ru.netology.manager.OptionsManager;

public class OptionsRepositoryTest {
    private OptionsRepository repository = new OptionsRepository();

    AvailableOptions first = new AvailableOptions(1, 4515, "GOJ", "VKO", 45);
    AvailableOptions second = new AvailableOptions(2, 7856, "GOJ", "LED", 150);
    AvailableOptions third = new AvailableOptions(3, 18356, "SVO", "ABA", 270);
    AvailableOptions fourth = new AvailableOptions(4, 6895, "VKO", "GZP", 205);
    AvailableOptions fifth = new AvailableOptions(5, 5635, "VKO", "LCA", 245);
    AvailableOptions sixth = new AvailableOptions(6, 7895, "DME", "GOA", 260);

    @BeforeEach
    public void setUp() {
        repository.save(first);
        repository.save(second);
        repository.save(third);
        repository.save(fourth);
        repository.save(fifth);
        repository.save(sixth);
    }

    @Test
    void shouldSearchByRoute() {
        String from = "GOJ";
        String to = "LED";
        AvailableOptions[] expected = new AvailableOptions[]{second};
        AvailableOptions[] actual = repository.findByLocation(from, to);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIfExists() {
        int idToRemove = 3;
        repository.removeById(idToRemove);
        AvailableOptions[] expected = new AvailableOptions[]{first, second, fourth, fifth, sixth,};
        AvailableOptions[] actual = repository.findAll();
        assertArrayEquals(expected, actual);

    }
}
