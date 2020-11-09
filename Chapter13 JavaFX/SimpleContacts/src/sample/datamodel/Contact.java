package sample.datamodel;

import javafx.beans.property.SimpleStringProperty;

public class Contact {
    private final SimpleStringProperty firstName = new SimpleStringProperty("");
    private final SimpleStringProperty lastName = new SimpleStringProperty("");
    private final SimpleStringProperty phoneNumber = new SimpleStringProperty("");
    private final SimpleStringProperty notes = new SimpleStringProperty("");

    public Contact() {
    }

    public Contact(String firstName, String lastName, String phoneNumber, String notes) {
        this.firstName.set(firstName);
        this.lastName.set(lastName);
        this.phoneNumber.set(phoneNumber);
        this.notes.set(notes);
    }

    public final String getFirstName() { return firstName.get(); }

    public final void setFirstName(String firstName) { this.firstName.set(firstName); }

    public final String getLastName() { return lastName.get(); }

    public final void setLastName(String lastName) { this.lastName.set(lastName); }

    public final String getPhoneNumber() { return phoneNumber.get(); }

    public final void setPhoneNumber(String phoneNumber) { this.phoneNumber.set(phoneNumber); }

    public final String getNotes() { return notes.get(); }

    public final void setNotes(String notes) { this.notes.set(notes); }

    @Override
    public String toString() {
        return "Contact{" +
                "firstName=" + firstName +
                ", lastName=" + lastName +
                ", phoneNumber=" + phoneNumber +
                ", notes=" + notes +
                '}';
    }
}
