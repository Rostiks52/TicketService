package ru.netology.ticketinfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Objects;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AvailableOptions implements Comparable<AvailableOptions> {
    private int id;
    private int price;
    private String departure;
    private String arrival;
    private int flightTime;


    @Override
    public int compareTo(AvailableOptions o) {
        return price - o.price;
    }

    public AvailableOptions(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }
}
