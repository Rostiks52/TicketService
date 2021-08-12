package ru.netology.repository;

import ru.netology.ticketinfo.*;

public class OptionsRepository {
    private AvailableOption[] items = new AvailableOption[0];


    public void save(AvailableOption item) {
        int length = items.length + 1;
        AvailableOption[] tmp = new AvailableOption[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public AvailableOption[] findAll() {
        return items;
    }

    public AvailableOption[] findByLocation(String from, String to) {
        AvailableOption[] result = new AvailableOption[0];
        for (AvailableOption item : items) {
            if ((item.getDeparture().equalsIgnoreCase(from)) && (item.getArrival().equalsIgnoreCase(to))) {
                AvailableOption[] tmp = new AvailableOption[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = item;
                result = tmp;
            }
        }
        return result;
    }

    public void removeById(int id) {
        int length = items.length - 1;
        AvailableOption[] tmp = new AvailableOption[length];
        int index = 0;
        for (AvailableOption item : items) {
            if (item.getId() != id) {
                tmp[index] = item;
                index++;
            }
        }
        items = tmp;
    }

}
