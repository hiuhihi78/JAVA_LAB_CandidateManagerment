/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Fresher extends Candidates{
    private int GraduationDate;
    private String GraduationRank;
    private String Education;

    public Fresher() {
    }

    public Fresher( int ID, String FirstName, String LastName, int Date, 
            String Address, String Phone, String Email, int Type, 
            int GraduationDate, String GraduationRank, String Education)
    {
        super(ID, FirstName, LastName, Date, Address, Phone, Email, Type);
            this.GraduationDate = GraduationDate;
        this.GraduationRank = GraduationRank;
        this.Education = Education;
    }

    public int getGraduationDate() {
        return GraduationDate;
    }

    public void setGraduationDate(int GraduationDate) {
        this.GraduationDate = GraduationDate;
    }

    public String getGraduationRank() {
        return GraduationRank;
    }

    public void setGraduationRank(String GraduationRank) {
        this.GraduationRank = GraduationRank;
    }

    public String getEducation() {
        return Education;
    }

    public void setEducation(String Education) {
        this.Education = Education;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10d%-10s%-15s", GraduationDate,GraduationRank,Education);
    }
    
    
    
}
