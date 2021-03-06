package com.FineDiary.entity;
import javax.persistence.*;

@Entity
@Table(name = "SERVICES")
public class Services {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "SERVICE_NAME")
    private String serviceName;

    @Column(name="LINK")
    private String link;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
}
