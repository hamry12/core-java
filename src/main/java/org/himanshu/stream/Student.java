package org.himanshu.stream;

import java.util.List;

public class Student {

    private Integer id;
    private String firstName;
    private Integer age;
    private Integer rank;
    private List<String> contact;

    private String gender;

    public Student(Integer id, String firstName, Integer age, Integer rank, List<String> contact, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.age = age;
        this.rank = rank;
        this.contact = contact;
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public List<String> getContact() {
        return contact;
    }

    public void setContact(List<String> contact) {
        this.contact = contact;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", age='" + age + '\'' +
                ", rank=" + rank +
                ", contact=" + contact +
                ", gender='" + gender + '\'' +
                '}';
    }
}
