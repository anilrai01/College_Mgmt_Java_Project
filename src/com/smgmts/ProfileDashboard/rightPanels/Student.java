package com.smgmts.ProfileDashboard.rightPanels;

public class Student {
    private String id, fname, lname, DOB, email, contact, parent_name, parent_contact,
            semester, intake, faculty, usern, paswor;


    public Student(){

    }
    public Student(String id, String fname, String lname,
                   String DOB, String email, String contact,
                   String parent_name, String parent_contact,
                   String semester, String intake, String faculty,
                   String usern, String paswor) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.DOB = DOB;
        this.email = email;
        this.contact = contact;
        this.parent_name = parent_name;
        this.parent_contact = parent_contact;
        this.semester = semester;
        this.intake = intake;
        this.faculty = faculty;
        this.usern = usern;
        this.paswor = paswor;
    }


    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getParent_name() {
        return parent_name;
    }

    public void setParent_name(String parent_name) {
        this.parent_name = parent_name;
    }

    public String getParent_contact() {
        return parent_contact;
    }

    public void setParent_contact(String parent_contact) {
        this.parent_contact = parent_contact;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }

    public String getIntake() {
        return intake;
    }

    public void setIntake(String intake) {
        this.intake = intake;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    public String getUsern() {
        return usern;
    }

    public void setUsern(String usern) {
        this.usern = usern;
    }

    public String getPaswor() {
        return paswor;
    }

    public void setPaswor(String paswor) {
        this.paswor = paswor;
    }
}
