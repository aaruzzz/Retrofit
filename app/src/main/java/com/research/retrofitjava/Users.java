package com.research.retrofitjava;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Users {

    @SerializedName("users")
    public List<users> users;

    public List<Users.users> getUsers() {
        return users;
    }

    public void setUsers(List<Users.users> users) {
        this.users = users;
    }

    public class users{
        @SerializedName("id")
        public Integer id;

        @SerializedName("firstName")
        public String firstName;

        @SerializedName("lastName")
        public String lastName;

        @SerializedName("age")
        public Integer age;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }
    }


}
