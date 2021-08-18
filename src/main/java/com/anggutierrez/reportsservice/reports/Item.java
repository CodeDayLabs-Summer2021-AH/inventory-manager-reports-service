package com.anggutierrez.reportsservice.reports;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Item {
    @Id
    @SequenceGenerator(name = "product_sequence", sequenceName = "product_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_sequence")
    private long id;
    private int itemId;
    private String name;
    private String row;
    private String section;
    private double lastCount;
    private Date lastUpdate;


    public Item() {}

    public Item(int itemId, String name, String row, String section, double lastCount, Date lastUpdate) {
        this.id = itemId;
        this.name = name;
        this.row = row;
        this.section = section;
        this.lastCount = lastCount;
        this.lastUpdate = lastUpdate;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public double lastCount() {
        return lastCount;
    }

    public void setLastCount(double lastCount) {
        this.lastCount = lastCount;
    }

    public Date lastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

}
