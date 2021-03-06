package za.ac.cput.domain;

import java.util.Date;
import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Job_History {

    private String empId;
    private Date startDate;
    private Date endDate;
    private String departmentId;

    public Job_History() {
    }

    public Job_History(Builder builder) {
        this.empId = builder.empId;
        this.startDate = builder.startDate;
        this.endDate = builder.endDate;
        this.departmentId = builder.departmentId;
    }

    public String getEmpId() {
        return empId;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public static class Builder{
        private String empId;
        private Date startDate;
        private Date endDate;
        private String departmentId;

        public Builder EmpId(String empId) {
            this.empId = empId;
            return  this;
        }

        public  Builder StartDate(Date startDate) {
            this.startDate = startDate;
            return this;
        }

        public Builder EndDate(Date endDate) {
            this.endDate = endDate;
            return this;
        }

        public Builder DepartmentId(String departmentId) {
            this.departmentId = departmentId;
            return this;
        }

        public Builder copy(Job_History job_history){
            this.empId = empId;
            this.startDate = startDate;
            this.endDate = endDate;
            this.departmentId = departmentId;
            return this;
        }

        public Job_History build(){return new Job_History(this);}
    }

    @Override
    public String toString() {
        return "Job_History{" +
                "empId='" + empId + '\'' +
                ", startDate=" + startDate +
                ", endDate='" + endDate + '\'' +
                ", departmentId='" + departmentId + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job_History job_history = (Job_History) o;
        return empId.equals(job_history.empId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }
}
