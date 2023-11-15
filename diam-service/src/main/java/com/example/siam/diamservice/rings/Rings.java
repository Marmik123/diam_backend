package com.example.siam.diamservice.rings;

import jakarta.persistence.*;

@Entity
@Table(name = "RINGS")
public class Rings {

    public  Rings(){

    }

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    private String name;
    private String metalType;
    private String style;

    private int price;
    private String imageURL;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMetalType() {
        return metalType;
    }

    public void setMetalType(String metalType) {
        this.metalType = metalType;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public Rings(Long id, String name, String metalType, String style,int price,String imageURL) {
        this.id = id;
        this.name = name;
        this.metalType = metalType;
        this.style = style;
        this.price=price;
        this.imageURL = imageURL;
    }

    @Override
    public String toString() {
        return "Rings{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", metalType='" + metalType + '\'' +
                ", style='" + style + '\'' +
                ", imageURL='" + imageURL + '\'' +
                '}';
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
