
/*
 * Copyright (c) 2019. This code itself is copied. No point in copying from this code!!
 */

package ticketing;

import buyable.Purchaser;
import core.Buyable;

import java.time.LocalDate;
import java.util.Objects;

public class Ticket implements Buyable {
    private TicketType ticketType;
    private double     price;
    private LocalDate  purchaseDate;
    private Purchaser  purchaser;
    
    public Ticket(TicketType ticketType, double price, LocalDate purchaseDate, Purchaser purchaser) {
        this.ticketType = ticketType;
        this.price = price;
        this.purchaseDate = purchaseDate;
        this.purchaser = purchaser;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "ticketType='" + ticketType + '\'' +
                ", price=" + price +
                ", timestamp=" + purchaseDate +
                ", purchaser=" + purchaser +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Ticket)) return false;
        Ticket ticket = (Ticket) o;
        return Double.compare(ticket.price, price) == 0 &&
                ticketType == ticket.ticketType &&
                purchaseDate.equals(ticket.purchaseDate) &&
                purchaser.equals(ticket.purchaser);
    }

    public TicketType getTicketType() {
        return ticketType;
    }

    public void setTicketType(TicketType ticketType) {
        this.ticketType = ticketType;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public LocalDate getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(LocalDate purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public Purchaser getPurchaser() {
        return purchaser;
    }

    public void setPurchaser(Purchaser purchaser) {
        this.purchaser = purchaser;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ticketType, price, purchaseDate, purchaser);
    }
}

