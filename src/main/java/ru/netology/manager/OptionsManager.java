package ru.netology.manager;

import java.util.Arrays;

import ru.netology.ticketinfo.*;
import ru.netology.repository.*;


public class OptionsManager {

    private OptionsRepository repository = new OptionsRepository();


    public void add(AvailableOption item) {
        repository.save(item);
    }

    public AvailableOption[] getAll(String from, String to) {

        return repository.findAll();
    }


    public AvailableOption[] findByLocation(String from, String to) {
        AvailableOption[] result = repository.findByLocation(from, to);
        Arrays.sort(result);
        return result;
    }


}

