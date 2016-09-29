package be.manucci.applicationms.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * Created by Utilisateur on 25-09-16.
 */
@Entity
public class App implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY ) private Long id;
    private String name;
    private String customer;

    public App(){

    }

    public App(long newId, String newName, String newCustomer){
        Objects.requireNonNull(newName);
        Objects.requireNonNull(newCustomer);
        name=newName;
        customer=newCustomer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
