package com.nogu66.payroll;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
class Employee {
    private @Id
    @GeneratedValue Long id;
    private String name;
    private String role;

    Employee() {
    }

    Employee(String name, String role) {
        this.name = name;
        this.role = role;
    }

    // nameを返すメソッド
    public String getName() {
        return this.name;
    }

    // roleを返すメソッド
    public String getRole() {
        return this.role;
    }

    // idを返すメソッド
    public Long getId() {
        return this.id;
    }

    // nameをセットするメソッド
    public void setName(String name) {
        this.name = name;
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
        return Objects.equals(this.id, employee.id) && Objects.equals(this.name, employee.name)
                && Objects.equals(this.role, employee.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.role);
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + this.id + ", name='" + this.name + '\'' + ", role='" + this.role + '\'' + '}';
    }
}