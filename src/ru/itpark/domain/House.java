package ru.itpark.domain;

public class House {
    private int id;
    private String nameHouse;
    private String nameDistrict;
    private int price;

    public House(int id, String nameHouse, String nameDistrict, int price) {
        this.id = id;
        this.nameHouse = nameHouse;
        this.nameDistrict = nameDistrict;
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "id=" + id +
                ", nameHouse='" + nameHouse + '\'' +
                ", nameDistrict='" + nameDistrict + '\'' +
                ", price=" + price +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameHouse() {
        return nameHouse;
    }

    public void setNameHouse(String nameHouse) {
        this.nameHouse = nameHouse;
    }

    public String getNameDistrict() {
        return nameDistrict;
    }

    public void setNameDistrict(String nameDistrict) {
        this.nameDistrict = nameDistrict;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
