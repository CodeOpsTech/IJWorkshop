
/*
 * Copyright (c) 2019. This code itself is copied. No point in copying from this code!!
 */

package buyable;

import core.Buyable;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Purchaser {
    private String        name;
    private String        email;
    private String        phoneNumber;
    private String        organization;
    private List<Buyable> ticketList = new ArrayList<>();

    public Purchaser(String name, String email, String phoneNumber, String organization, List<Buyable> ticketList) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.organization = organization;
        this.ticketList = ticketList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public void addTicket(Buyable ticket) {
        ticketList.add(ticket);
    }

    public List<Buyable> getTicketList() {
        return ticketList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Purchaser)) return false;
        Purchaser purchaser = (Purchaser) o;
        return getName().equals(purchaser.getName()) &&
                getEmail().equals(purchaser.getEmail()) &&
                getPhoneNumber().equals(purchaser.getPhoneNumber()) &&
                getOrganization().equals(purchaser.getOrganization()) &&
                getTicketList().equals(purchaser.getTicketList());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail(), getPhoneNumber(), getOrganization(), getTicketList());
    }

    @Override
    public String toString() {
        return "Purchaser{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", organization='" + organization + '\'' +
                ", ticketList=" + ticketList +
                '}';
    }
}
