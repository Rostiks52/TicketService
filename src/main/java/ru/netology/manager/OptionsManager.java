package ru.netology.manager;

import java.util.Arrays;

import ru.netology.ticketinfo.*;
import ru.netology.repository.*;

import java.util.Arrays;


public class OptionsManager {

    private OptionsRepository repository = new OptionsRepository();


    public void add(AvailableOptions item) {
        repository.save(item);
    }

    public AvailableOptions[] getAll(String from, String to) {

        return repository.findAll();
    }


    public AvailableOptions[] findByLocation(String from, String to) {
        AvailableOptions[] result = repository.findByLocation(from, to);
        Arrays.sort(result);
        return result;
    }


}

