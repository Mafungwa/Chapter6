package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Manager extends Employee{

    private String empNum;


    private Manager() {
    }

    private Manager(Builder builder) {
        this.empNum = builder.empNum;
    }

    public String getEmpNum() {
        return empNum;
    }

    public static class Builder {
        private String empNum;

        public Builder empNum(String empNum) {
            this.empNum = empNum;
            return this;
        }

        public Builder copy(Manager manager) {
            this.empNum = manager.empNum;
            return this;
        }

        public Manager build() {
            return new Manager(this);
        }
    }


    @Override
    public String toString() {
        return "Manager{" +
                "empNum='" + empNum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return empNum.equals(manager.empNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(empNum);
    }

}
