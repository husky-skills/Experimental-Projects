package models;
import javax.persistence.*;
import javax.persistence.Id;
import javax.persistence.Column;
/**
 * Created by Mahendra on 26-06-2016.
 *
 * */
 @Entity
public class UserDetails {
     @Id
    private int userId;
     @Column
    private String userName;
    public UserDetails() {
}

    public UserDetails(int userId, String userName) {
        this.userId = userId;
        this.userName = userName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
