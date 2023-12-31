package com.Logate.SpringBootVjezba.DTO;

public class UserCreateDTO {
    private String fullName;
    private String address;

    @Override
    public String toString() {
        return "UserCreateDTO{" +
                "fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
