package models;

import java.io.Serializable;

public class Customers implements Serializable {
    String name, birthday, address, image;

    public Customers() {

    }

    public Customers(String name, String birthday, String address, String image) {
        this.name = name;
        this.birthday = birthday;
        this.address = address;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
