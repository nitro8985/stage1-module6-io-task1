package com.epam.mjc.io;

import java.util.Objects;

public class Profile {

    private String name;
    private Integer age;
    private String email;
    private Long phone;

    public Profile() {

    }

    public Profile(String name, Integer age, String email, Long phone) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public Long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Profile{" + "name='" + name + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Profile profile = (Profile) o;
        return getName().equals(profile.getName())
                && getAge().equals(profile.getAge())
                && getEmail().equals(profile.getEmail())
                && getPhone().equals(profile.getPhone());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getEmail(), getPhone());
    }
}
