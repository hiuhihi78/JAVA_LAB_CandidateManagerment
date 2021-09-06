/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Candidates {

    private int ID;
    private String FirstName;
    private String LastName;
    private int Date;
    private String Address;
    private String Phone;
    private String Email;
    private int Type;

    public Candidates() {
    }

    public Candidates(int ID, String FirstName, String LastName, int Date, String Address, String Phone, String Email, int Type) {
        this.ID = ID;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Date = Date;
        this.Address = Address;
        this.Phone = Phone;
        this.Email = Email;
        this.Type = Type;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getDate() {
        return Date;
    }

    public void setDate(int Date) {
        this.Date = Date;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getType() {
        return Type;
    }

    public void setType(int Type) {
        this.Type = Type;
    }
   
    @Override
    public String toString() {
        return String.format("%-5d%-15s%-15s%-10d%-10s%-15s%-30s%-5d",ID ,FirstName, LastName, Date, Address, Phone, Email, Type);
    }
    
//    String.format("%-10s%-15s%-15s%-10s%-15s%-10s%-30s%-7s", "First name","Last name", "Date", "Address", "Phone", "Email", "Type");

}
