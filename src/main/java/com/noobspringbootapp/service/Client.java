package com.noobspringbootapp.service;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
public class Client {

    @Id
    private int id;
    private String cname;
    private String cdescr;
    private Timestamp createdat;
    private Timestamp modifiedat;

    public Client() {  }

    public Client(int id, String cname, String cdescr, Timestamp createdat, Timestamp modifiedat) {
        this.id = id;
        this.cname = cname;
        this.cdescr = cdescr;
        this.createdat = createdat;
        this.modifiedat = modifiedat;
    }

    public int getId() {
        return id;
    }

    public String getCname() {
        return cname;
    }

    public String getCdescr() {
        return cdescr;
    }

    public Timestamp getCreatedat() { return createdat; }

    public Timestamp getModifiedat() { return modifiedat; }
}