package eCommerceSim.entities.concretes;

import eCommerceSim.entities.abstracts.Entity;

public class User implements Entity {
    private int id;
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private boolean verified;

    public User(){

    }

    public User(int id, String firstName, String lastName, String mail, String password, boolean verified) {
        super();
        this.setId(id);
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setMail(mail);
        this.setPassword(password);
        this.setVerified((verified));

    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
}
