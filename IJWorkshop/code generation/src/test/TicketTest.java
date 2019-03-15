
/*
 * Copyright (c) 2019. This code itself is copied. No point in copying from this code!!
 */

package test;

import org.junit.Assert;
import buyable.Purchaser;
import ticketing.Ticket;
import ticketing.TicketType;

import java.time.LocalDate;
import java.util.ArrayList;

public class TicketTest {
    @org.junit.Test
    public void ToStringTest() {
        // Arrange
        Purchaser purchaser = new Purchaser(
                "Ganesh", "ganesh@konfhub.com", "9880164463", "KonfHub", new ArrayList<>());
        Ticket ticket = new Ticket(TicketType.REGULAR, 1000.00, LocalDate.now(), purchaser);

        // Act
        String ticketString = ticket.toString();
        String expectedString = "Ticket{ticketType='REGULAR', price=1000.0, timestamp=2019-03-14, purchaser=Purchaser{name='Ganesh', email='ganesh@konfhub.com', phoneNumber='9880164463', organization='KonfHub', ticketList=[]}}";

        // Assert
        Assert.assertEquals(ticketString, expectedString);
    }
}