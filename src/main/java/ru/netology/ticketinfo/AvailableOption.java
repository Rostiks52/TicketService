package ru.netology.ticketinfo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class AvailableOption implements Comparable<AvailableOption> {
    private int id;
    private int price;
    private String departure;
    private String arrival;
    private int flightTime;


    @Override
    public int compareTo(AvailableOption o) {
        return price - o.price;
    }

    public AvailableOption(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }
}
