package ru.netology.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.ticketinfo.AvailableOption;

public class OptionsRepositoryTest {
    private OptionsRepository repository = new OptionsRepository();

    AvailableOption first = new AvailableOption(1, 4515, "GOJ", "VKO", 45);
    AvailableOption second = new AvailableOption(2, 7856, "GOJ", "LED", 150);
    AvailableOption third = new AvailableOption(3, 18356, "SVO", "ABA", 270);
    AvailableOption fourth = new AvailableOption(4, 6895, "VKO", "GZP", 205);
    AvailableOption fifth = new AvailableOption(5, 5635, "VKO", "LCA", 245);
    AvailableOption sixth = new AvailableOption(6, 7895, "DME", "GOA", 260);

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
        AvailableOption[] expected = new AvailableOption[]{second};
        AvailableOption[] actual = repository.findByLocation(from, to);
        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldRemoveIfExists() {
        int idToRemove = 3;
        repository.removeById(idToRemove);
        AvailableOption[] expected = new AvailableOption[]{first, second, fourth, fifth, sixth,};
        AvailableOption[] actual = repository.findAll();
        assertArrayEquals(expected, actual);

    }
}
