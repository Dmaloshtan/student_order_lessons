package edu.javacourse.studentorder.domain;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;

public class Adult extends Person{

    private String passportSerial;
    private String passportNumber;
    private LocalDate issueDate;        // дата выдачи
    private PassportOffice issueDepartment;    // где выдан
    private University university;         // универ, в котором он учится
    private String studentId;


    public Adult(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }

    public Adult() {
    }

    public String getPassportSerial() {

        return passportSerial;
    }

    public void setPassportSerial(String passportSerial) {

        this.passportSerial = passportSerial;
    }

    public String getPassportNumber() {

        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {

        this.passportNumber = passportNumber;
    }

    public LocalDate getIssueDate() {

        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {

        this.issueDate = issueDate;
    }

    public PassportOffice getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(PassportOffice issueDepartment) {
        this.issueDepartment = issueDepartment;
    }

    public University getUniversity() {
        return university;
    }

    public void setUniversity(University university) {
        this.university = university;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
}
