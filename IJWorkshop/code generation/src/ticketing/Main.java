
/*
 * Copyright (c) 2019. This code itself is copied. No point in copying from this code!!
 */

package ticketing;

import buyable.Purchaser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Purchaser purchaser = new Purchaser(
                "Ganesh", "ganesh@konfhub.com", "9880164463", "KonfHub", new ArrayList<>());
        List<Ticket> tickets = Arrays.asList(
                new Ticket(TicketType.REGULAR,1000.00, LocalDate.now(), purchaser),
                new Ticket(TicketType.REGULAR,1000.00, LocalDate.now(), purchaser));
        tickets.forEach(System.out::println);
    }
}
