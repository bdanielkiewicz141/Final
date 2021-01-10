package pl.sda.zdjavapol4.moviesrentalwebapp.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "CLIENT")
public class Client {

     @Id
     @GeneratedValue
     int clientID;
     @Column(nullable = false)
     String login;
     @Column(nullable = false)
     String Password;
     String email;
     String adress;
     String fullName;
     long cardNumber;

     public int getClientID() {
          return clientID;
     }

     public void setClientID(int clientID) {
          this.clientID = clientID;
     }

     public String getLogin() {
          return login;
     }

     public void setLogin(String login) {
          this.login = login;
     }

     public String getPassword() {
          return Password;
     }

     public void setPassword(String password) {
          Password = password;
     }

     public String getEmail() {
          return email;
     }

     public void setEmail(String email) {
          this.email = email;
     }

     public String getAdress() {
          return adress;
     }

     public void setAdress(String adress) {
          this.adress = adress;
     }

     public String getFullName() {
          return fullName;
     }

     public void setFullName(String fullName) {
          this.fullName = fullName;
     }

     public long getCardNumber() {
          return cardNumber;
     }

     public void setCardNumber(long cardNumber) {
          this.cardNumber = cardNumber;
     }
}
