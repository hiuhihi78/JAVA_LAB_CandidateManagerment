/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Intern extends Candidates {

    private String Majors;
    private int Semester;
    private String University;

    public Intern() {
    }

    public Intern(int ID, String FirstName, String LastName, int Date, 
            String Address, String Phone, String Email, int Type, String Majors,
            int Semester, String University) 
    {
        super(ID, FirstName, LastName, Date, Address, Phone, Email, Type);
        this.Majors = Majors;
        this.Semester = Semester;
        this.University = University;
    }

    public String getMajors() {
        return Majors;
    }

    public void setMajors(String Majors) {
        this.Majors = Majors;
    }

    public int getSemester() {
        return Semester;
    }

    public void setSemester(int Semester) {
        this.Semester = Semester;
    }

    public String getUniversity() {
        return University;
    }

    public void setUniversity(String University) {
        this.University = University;
    }
//    String.format("%-10s%-15s%-15s%-10s%-15s%-10s%-30s%-5s%-10s%-7s%-10s", 
//            "First name","Last name", "Date", "Address", "Phone", "Email", "Type","Maojors", "Semester", "University");

    @Override
    public String toString() {
        return super.toString() + String.format("%-10s%-10d%-10s", Majors, Semester, University);
    }

}
