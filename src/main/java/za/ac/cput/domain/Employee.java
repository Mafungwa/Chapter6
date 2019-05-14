package za.ac.cput.domain;

import java.util.Objects;

public class Employee {

    private int id;
    private String name;
    private String surname;
    private String gender;
    private int mobileNumber;
    private String role;
    private String address;
    private String email;

    private Employee() {
    }

    private Employee(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.surname = builder.surname;
        this.gender = builder.gender;
        this.mobileNumber = builder.mobileNumber;
        this.role = builder.role;
        this.address = builder.address;
        this.email = builder.email;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
    public String getGender() {
        return gender;
    }
    public int getMobileNumber() {
        return mobileNumber;
    }
    public String getRole() {
        return role;
    }

    public String getAddress() {
        return address;
    }
    public String getEmail() {
        return email;
    }


    public static class Builder {
        private int id;
        private String name;
        private String surname;
        private String gender;
        private int mobileNumber;
        private String role;
        private String address;
        private String email;

        public Builder id(int id) {
            this.id = id;
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
        public Builder gender(String gender) {
            this.gender = gender;
            return this;
        }
        public Builder mobileNumber(int mobileNumber) {
            this.mobileNumber = mobileNumber;
            return this;
        }
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder copy(Employee employee) {
            this.id = employee.id;
            this.name = employee.name;
            this.surname = employee.surname;
            this.gender = employee.gender;
            this.mobileNumber = employee.mobileNumber;
            this.role = employee.role;
            this.address = employee.address;
            this.email = employee.email;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }


    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", gender='" + gender + '\'' +
                "mobileNumber='" + mobileNumber + '\'' +
                ", role='" + role + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return  Integer.toString(id).equals(employee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}
