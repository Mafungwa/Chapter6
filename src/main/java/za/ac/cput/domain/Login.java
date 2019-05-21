package za.ac.cput.domain;

import java.util.Objects;

import  org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan

public class Login {

    private String username;
    private  String password;

    public Login() {
    }

    public Login(Builder builder) {
        this.username = builder.username;
        this.password = builder.password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public static class Builder{
        private String username;
        private  String password;

        public Builder username(String username) {
            this.username = username;
            return this;
        }

        public Builder password(String password) {
            this.password = password;
            return this;
        }

        public Builder copy(Login login) {
            this.username = login.username;
            this.password = login.password;
            return this;
        }
        public Login build(){
            return new Login(this);
        }
    }

    @Override
    public String toString() {
        return "Login{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Login login = (Login) o;
        return username.equals(login.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username);
    }
}

