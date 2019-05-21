package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan
public class Account {
    private String empId,username,password,role;

    private Account(){}

    private Account(Builder builder){
        this.empId = builder.empId;
        this.username = builder.username;
        this.password = builder.password;
        this.role = builder.role;
    }

    public String getEmpId(){
        return empId;
    }
    public String getUsername(){
        return username;
    }
    public String getPassword(){
        return password;
    }
    public String getRole(){
        return role;
    }

    public static class Builder{
        private  String empId,username,password,role;

        public Builder empId(String empId){
            this.empId = empId;
            return this;
        }
        private Builder username(String username){
            this.username = username;
            return this;
        }
        private Builder password(String password){
            this.password = password;
            return this;
        }
        private Builder role(String role){
            this.role = role;
            return this;
        }
        public Builder copy(Account account){
            this.empId=account.empId;
            this.username = account.username;
            this.password=account.password;
            this.role=account.role;
            return this;
        }
        public Account build(){
            return  new Account(this);
        }

    }

    @Override
    public  String toString(){
        return "Account{" +
                "empId='" + empId + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return  empId.equals(account.empId);
    }

    @Override
    public int hashCode(){
        return Objects.hash(empId);
    }

}
