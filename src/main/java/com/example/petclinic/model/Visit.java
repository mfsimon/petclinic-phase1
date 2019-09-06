package com.example.petclinic.model;

import java.util.Objects;

public class Visit implements Modifiable {

    private Long id;
    private String date;
    private String time;
    private String vetName;
    private String ownerName;

    public Visit(Long id) {
        this(id, null, null, null, null);
    }

    public Visit(Long id, String date, String time, String vetName, String ownerName) {

        this.id = id;
        this.date = date;
        this.time = time;
        this.vetName = vetName;
        this.ownerName = ownerName;

    }

    @Override
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getVetName() {
        return vetName;
    }

    public void setVetName(String vetName) {
        this.vetName = vetName;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }


    /*
    Only include id when generating equals and hashcode
     */
    @Override
    public boolean equals(Object i) {
        if (this == i) return true;
        if (i == null || getClass() != i.getClass()) return false;
        Visit visit = (Visit) i;
        return id == visit.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Visit{");
        sb.append("id=").append(id);
        sb.append(", date='").append(date).append('\'');
        sb.append(", time='").append(time).append('\'');
        sb.append(", vetName='").append(vetName).append('\'');
        sb.append(", ownerName='").append(ownerName).append('\'');
        sb.append('}');
        return sb.toString();

    }

}
    // TODO Using the Owner model class and based on the existing website, complete this model class