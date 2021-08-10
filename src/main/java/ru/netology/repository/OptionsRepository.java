package ru.netology.repository;

import ru.netology.ticketinfo.*;

public class OptionsRepository {
    private AvailableOptions[] items = new AvailableOptions[0];


    public void save(AvailableOptions item) {
        int length = items.length + 1;
        AvailableOptions[] tmp = new AvailableOptions[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public AvailableOptions[] findAll() {
        return items;
    }

    public AvailableOptions[] findByLocation(String from, String to) {
        AvailableOptions[] result = new AvailableOptions[0];
        for (AvailableOptions item : items) {
            if ((item.getDeparture().equalsIgnoreCase(from)) && (item.getArrival().equalsIgnoreCase(to))) {
                AvailableOptions[] tmp = new AvailableOptions[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = item;
                result = tmp;
            }
        }
        return result;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        AvailableOptions[] tmp = new AvailableOptions[length];
        int index = 0;
        for (AvailableOptions item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

}
