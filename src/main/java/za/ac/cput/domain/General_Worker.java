package za.ac.cput.domain;

import java.util.Objects;

public class General_Worker {

    private String empNum;


    private General_Worker() {
    }

    private General_Worker(Builder builder) {
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

        public Builder copy(General_Worker general_worker) {
            this.empNum = general_worker.empNum;
            return this;
        }

        public General_Worker build() {
            return new General_Worker(this);
        }
    }


    @Override
    public String toString() {
        return "General_Worker{" +
                "empNum='" + empNum + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        General_Worker general_worker = (General_Worker) o;
        return empNum.equals(general_worker.empNum);
    }

    @Override
    public int hashCode() {

        return Objects.hash(empNum);
    }

}
