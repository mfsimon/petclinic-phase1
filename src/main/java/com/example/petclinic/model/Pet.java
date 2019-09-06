package com.example.petclinic.model;

import java.util.Objects;

/**
 * This class represents a pet.
 */
public class Pet implements Modifiable {

    private Long id;
    private String name;
    private String type;
    private String breed;
    private String age;
    private String gender;

    public Pet() {

    }

    public Pet(Long id) {
        this(id, null, null, null, null, null);
    }

    public Pet(Long id, String name, String type, String breed, String age, String gender) {

        this.id = id;
        this.name = name;
        this.type = type;
        this.breed = breed;
        this.age = age;
        this.gender = gender;

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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getAge() { return age; }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() { return gender; }

    public void setGender(String gender) {
        this.gender = gender;
    }


    /*
    Only include id when generating equals and hashcode
     */
    @Override
    public boolean equals(Object p) {
        if (this == p) return true;
        if (p == null || getClass() != p.getClass()) return false;
        Pet pet = (Pet) p;
        return id == pet.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pet{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", type='").append(type).append('\'');
        sb.append(", breed='").append(breed).append('\'');
        sb.append(", gender='").append(gender).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
    // TODO Using the Owner model class and based on the existing website, complete this model class

