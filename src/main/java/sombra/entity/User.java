package sombra.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by Владимир on 27.01.2016.
 */
@Entity
@Table(name = "Users")
public class User extends BaseEntity {

    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
