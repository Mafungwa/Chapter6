package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Work {
    private int employeeNum;
    private int hoursWorked;
    private int rateOfPay;
    private int holidayRemaining;
    private String position;
    private String department;
    private double payment;

    public Work() {
    }

    public Work(Builder builder) {
        this.employeeNum = builder.employeeNum;
        this.hoursWorked = builder.hoursWorked;
        this.rateOfPay = builder.rateOfPay;
        this.holidayRemaining = builder.holidayRemaining;
        this.position = builder.position;
        this.department = builder.department;
        this.payment = builder.payment;
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public int getRateOfPay() {
        return rateOfPay;
    }

    public int getHolidayRemaining() {
        return holidayRemaining;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public double getPayment() {
        return payment;
    }

    public static class Builder{
        private int employeeNum;
        private int hoursWorked;
        private int rateOfPay;
        private int holidayRemaining;
        private String position;
        private String department;
        private double payment;

        public Builder employeeNum(int employeeNum) {
            this.employeeNum = employeeNum;
            return this;
        }

        public Builder hoursWorked(int hoursWorked) {
            this.hoursWorked = hoursWorked;
            return this;
        }

        public Builder rateOfPay(int rateOfPay) {
            this.rateOfPay = rateOfPay;
            return this;
        }

        public Builder holidayRemaining(int holidayRemaining) {
            this.holidayRemaining = holidayRemaining;
            return this;
        }

        public Builder position(String position) {
            this.position = position;
            return this;
        }

        public Builder department(String department) {
            this.department = department;
            return this;
        }

        public Builder payment(double payment) {
            this.payment = payment;
            return this;
        }
        public Builder copy(Work work){
            this.employeeNum = work.employeeNum;
            this.hoursWorked = work.hoursWorked;
            this.rateOfPay = work.rateOfPay;
            this.holidayRemaining = work.holidayRemaining;
            this.position = work.position;
            this.department = work.department;
            this.payment = work.payment;
            return this;
        }
        public Work build(){return new Work(this);}
    }

    @Override
    public String toString() {
        return "Work{" +
                "employeeNum=" + employeeNum +
                ", hoursWorked=" + hoursWorked +
                ", rateOfPay=" + rateOfPay +
                ", holidayRemaining=" + holidayRemaining +
                ", position='" + position + '\'' +
                ", department='" + department + '\'' +
                ", payment=" + payment +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Work work = (Work) o;
        return Integer.toString(employeeNum).equals(work.employeeNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNum);
    }
}
