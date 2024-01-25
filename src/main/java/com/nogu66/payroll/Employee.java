package com.nogu66.payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
class Employee {
    private @Id
    @GeneratedValue Long id;
    private String firstName;
    private String lastName;
    private String role;

    Employee() {
    }

    Employee(String firstName, String lastName, String role) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.role = role;
    }

    // nameを返すメソッド
    public String getName() {
        return this.firstName + " " + this.lastName;
    }

    // newをfirsNameとlastNameからセットする
    public void setName(String name) {
        String[] parts = name.split(" ");
        this.firstName = parts[0];
        this.lastName = parts[1];
    }


    // firstNameを返すメソッド
    public String getFirstName() {
        return this.firstName;
    }

    // lastNameを返すメソッド
    public String getLastName() {
        return this.lastName;
    }

    // roleを返すメソッド
    public String getRole() {
        return this.role;
    }

    // idを返すメソッド
    public Long getId() {
        return this.id;
    }

    // firstNameをセットするメソッド
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    // lastNameをセットするメソッド
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // roleをセットするメソッド
    public void setRole(String role) {
        this.role = role;
    }

    // idをセットするメソッド
    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee employee = (Employee) o;
        return Objects.equals(this.id, employee.id) && Objects.equals(this.firstName, employee.firstName)
                && Objects.equals(this.lastName, employee.lastName) && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.firstName, this.lastName, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", firstName='" + this.firstName + '\'' + ", lastName='" + this.lastName
                + '\'' + ", role='" + this.role + '\'' + '}';
    }
}