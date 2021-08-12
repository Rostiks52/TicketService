package ru.netology.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.ticketinfo.AvailableOption;

public class OptionManagerTest {
    private OptionsManager manager = new OptionsManager();
    AvailableOption first = new AvailableOption(1, 4515, "GOJ", "VKO", 45);
    AvailableOption second = new AvailableOption(2, 7856, "GOJ", "LED", 150);
    AvailableOption third = new AvailableOption(3, 18356, "SVO", "ABA", 270);
    AvailableOption fourth = new AvailableOption(4, 6895, "VKO", "GZP", 205);
    AvailableOption fifth = new AvailableOption(5, 5635, "VKO", "LCA", 245);
    AvailableOption sixth = new AvailableOption(6, 7895, "DME", "GOA", 260);
    AvailableOption seventh = new AvailableOption(7,7856,"GOJ", "LED", 150);
    AvailableOption eighth = new AvailableOption(8, 46850, "SVO", "ABA", 270);
    AvailableOption ninth = new AvailableOption(9, 34520, "SVO", "ABA", 270);
    AvailableOption tenth = new AvailableOption(10, 8965, "SVO", "ABA", 270);
    AvailableOption eleventh = new AvailableOption(11, 15820,"SVO", "ABA", 362);


    @BeforeEach
    public void setUp() {
        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);

    }

    @Test
    void shouldFindByLocation() {
        String from = "VKO";
        String to = "LCA";
        AvailableOption[] expected = new AvailableOption[]{fifth};
        AvailableOption[] actual = manager.findByLocation(from, to);
        assertArrayEquals(expected, actual);
        System.out.println("Have a nice flight!");
    }

@Test
    void shouldFindByLocation2(){
        String from = "SVO";
        String to = "ABA";
        AvailableOption[] expected = new AvailableOption[]{tenth, eleventh, third, ninth, eighth};
        AvailableOption[] actual = manager.findByLocation(from, to);
        assertArrayEquals(expected, actual);
        System.out.println("Make a choice");
    }
    @Test
    void shouldFindByNonExistentLocation() {
        String from = "SVO";
        String to = "UOOO";
        AvailableOption[] expected = new AvailableOption[]{};
        AvailableOption[] actual = manager.findByLocation(from, to);
        assertArrayEquals(expected, actual);
        System.out.println("Sorry, this request did not match");
    }

}


