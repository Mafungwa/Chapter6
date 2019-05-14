package za.ac.cput.domain;

import java.util.Objects;

public class Admin {
    private String empNum;
    private String qualification;
    private String name;

    private Admin() {
    }

    private Admin(Builder builder) {
        this.empNum = builder.empNum;
        this.qualification = builder.qualification;
        this.name = builder.name;
    }

    public String getEmpNum() {
        return empNum;
    }

    public String getQualification() {
        return qualification;
    }
    public String getName() {
        return name;
    }


    public static class Builder {
        private String empNum;
        private String qualification;
        private String name;

        public Builder empNum(String empNum) {
            this.empNum = empNum;
            return this;
        }

        public Builder qualification(String qualification) {
            this.qualification = qualification;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder copy(Admin admin) {
            this.empNum = admin.empNum;
            this.qualification = admin.qualification;
            this.name = admin.name;
            return this;
        }

        public Admin build() {
            return new Admin(this);
        }
    }


    @Override
    public String toString() {
        return "Admin{" +
                "empNum='" + empNum + '\'' +
                ", qualification='" + qualification + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return empNum.equals(admin.empNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(empNum);
    }
}
