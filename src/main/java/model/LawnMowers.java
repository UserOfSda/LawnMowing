package model;

import javax.persistence.*;

@Entity
@Table(name = "lawnmowers")
public class LawnMowers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lawnmower_id")
    private int lawnMowerID;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lawnmower_name")
    private String lawnmowerName;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lawnmower_phoneNumber")
    private String lawnmowerPhoneNumber;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lawnmower_email")
    private String lawnmowerEmail;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lawnmower_salary")
    private int lawnmowerSalary;

    public LawnMowers(int lawnMowerID, String lawnmowerName, String lawnmowerPhoneNumber, String lawnmowerEmail, int lawnmowerSalary) {
        this.lawnMowerID = lawnMowerID;
        this.lawnmowerName = lawnmowerName;
        this.lawnmowerPhoneNumber = lawnmowerPhoneNumber;
        this.lawnmowerEmail = lawnmowerEmail;
        this.lawnmowerSalary = lawnmowerSalary;
    }

    public int getLawnMowerID() {
        return lawnMowerID;
    }

    public void setLawnMowerID(int lawnMowerID) {
        this.lawnMowerID = lawnMowerID;
    }

    public String getLawnmowerName() {
        return lawnmowerName;
    }

    public void setLawnmowerName(String lawnmowerName) {
        this.lawnmowerName = lawnmowerName;
    }

    public String getLawnmowerPhoneNumber() {
        return lawnmowerPhoneNumber;
    }

    public void setLawnmowerPhoneNumber(String lawnmowerPhoneNumber) {
        this.lawnmowerPhoneNumber = lawnmowerPhoneNumber;
    }

    public String getLawnmowerEmail() {
        return lawnmowerEmail;
    }

    public void setLawnmowerEmail(String lawnmowerEmail) {
        this.lawnmowerEmail = lawnmowerEmail;
    }

    public int getLawnmowerSalary() {
        return lawnmowerSalary;
    }

    public void setLawnmowerSalary(int lawnmowerSalary) {
        this.lawnmowerSalary = lawnmowerSalary;
    }

    @Override
    public String toString() {
        return "LawnMowers{" +
                "lawnMowerID=" + lawnMowerID +
                ", lawnmowerName='" + lawnmowerName + '\'' +
                ", lawnmowerPhoneNumber='" + lawnmowerPhoneNumber + '\'' +
                ", lawnmowerEmail='" + lawnmowerEmail + '\'' +
                ", lawnmowerSalary=" + lawnmowerSalary +
                '}';
    }
}
