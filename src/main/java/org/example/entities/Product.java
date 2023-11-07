package org.example.entities;




public class Product {
    public Product (int id, String title,String status,double price)
    {
     this.id = id;
     this.title = title;
     this.status = status;
     this.price = price;
    }
    private int id;
    private String title;
    private String status;
    private double price;

    public int getId()
    {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getStatus()
    {
        return status;
    }
    public void setStatus(  String status)
    {
        this.status = status;
    }
    public String getTitle()
    {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public double getPrice()
    {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

}
