package com.example.petclinic.model;

import java.util.Objects;

public class Vet implements Modifiable {

    private Long id;
    private String name;
    private String phoneNumber;
    private String speciality;

    public Vet(Long id) {
        this(id, null, null, null);
    }

    public Vet(Long id, String name, String phoneNumber, String speciality) {

        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.speciality = speciality;

    }

    @Override
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }


    /*
    Only include id when generating equals and hashcode
     */
    @Override
    public boolean equals(Object v) {
        if (this == v) return true;
        if (v == null || getClass() != v.getClass()) return false;
        Vet vet = (Vet) v;
        return id == vet.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Vet{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", phoneNumber='").append(phoneNumber).append('\'');
        sb.append(", speciality='").append(speciality).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
    // TODO Using the Owner model class and based on the existing website, complete this model class
