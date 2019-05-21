package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Update_Employee {
    private String empId;
    private String name;
    private String surname;
    private String address;
    private boolean gender;
    private int idNum;

    public Update_Employee() {
    }

    public Update_Employee(Builder builder) {
        this.empId = builder.empId;
        this.name = builder.name;
        this.surname = builder.surname;
        this.address = builder.address;
        this.gender = builder.gender;
        this.idNum = builder.idNum;
    }

    public String getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getAddress() {
        return address;
    }

    public boolean isGender() {
        return gender;
    }

    public int getIdNum() {
        return idNum;
    }

    public static class Builder{
        private String empId;
        private String name;
        private String surname;
        private String address;
        private boolean gender;
        private int idNum;

        public Builder empId(String empId) {
            this.empId = empId;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder gender(boolean gender) {
            this.gender = gender;
            return this;
        }

        public Builder idNum(int idNum) {
            this.idNum = idNum;
            return this;
        }
        public Update_Employee build(){return new Update_Employee(this);}
    }

    @Override
    public String toString() {
        return "Update_Employee{" +
                "empId='" + empId + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", gender=" + gender +
                ", idNum=" + idNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Update_Employee update_employee = (Update_Employee) o;
        return Integer.toString(idNum).equals(update_employee.idNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idNum);
    }
}
