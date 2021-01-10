package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import org.hibernate.annotations.Table;


public class Client {
    private int clientID;
    private String login;
    private String email;
    private String adress;
    private String fullName;
    private long cardNumber;
}
