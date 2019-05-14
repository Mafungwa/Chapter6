package za.ac.cput.domain;

import java.util.Objects;

public class Registration {
    private String fullname,empId,username,password;

    public Registration() {
    }

    public Registration(Builder builder) {
        this.fullname = builder.fullname;
        this.empId = builder.empId;
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmpId() {
        return empId;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder{
        private String fullname,empId,username,password;

        public Builder fullname(String fullname) {
            this.fullname = fullname;
            return this;
        }

        public Builder empId(String empId) {
            this.empId = empId;
            return this;
        }

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }
        public Builder copy(Registration registration){
            this.fullname = registration.fullname;
            this.empId = registration.empId;
            this.username = registration.username;
            this.password = registration.password;
            return this;
        }
        public Registration build(){return new Registration(this);}
    }

    @Override
    public String toString() {
        return "Registration{" +
                "fullname='" + fullname + '\'' +
                ", empId='" + empId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Registration that = (Registration) o;
        return empId.equals(that.empId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }
}
