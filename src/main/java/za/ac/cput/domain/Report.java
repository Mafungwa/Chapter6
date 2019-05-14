package za.ac.cput.domain;

import java.util.Objects;

public class Report {
    private String type,filepath;

    public Report() {
    }

    public Report(Builder builder) {
        this.type = builder.type;
        this.filepath = builder.filepath;
    }

    public String getType() {
        return type;
    }
    public String getFilepath() {
        return filepath;
    }

    public static class Builder{
        private String type,filepath;

        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public Builder filepath(String filepath) {
            this.filepath = filepath;
            return this;
        }

        public Builder copy(Report report){
            this.type = report.type;
            this.filepath = report.filepath;
            return this;
        }
        public Report build(){return new Report(this);}
    }

    @Override
    public String toString() {
        return "Report{" +
                "type='" + type + '\'' +
                ", filepath='" + filepath + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Report report = (Report) o;
        return Objects.equals(type, report.type) &&
                Objects.equals(filepath, report.filepath);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, filepath);
    }
}
