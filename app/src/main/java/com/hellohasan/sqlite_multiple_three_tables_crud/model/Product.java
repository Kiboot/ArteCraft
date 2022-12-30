package com.hellohasan.sqlite_multiple_three_tables_crud.model;

public class Product {
    private int pid;
    private String name;
    private int quantity;

    public Product(int pid, String name, int quantity){
        this.pid = pid;
        this.name = name;
        this.quantity = quantity;
    }
    public Product(int pid, int quantity){
        this.pid = pid;
        this.quantity = quantity;
    }

    public int getPid(){return pid;}
    public void setPid(int pid) {this.pid = pid;}

    public String getName(){return name;}
    public void setName(String name) {this.name = name;}

    public int getQuantity() {return quantity;}
    public void setQuantity(int quantity) {this.quantity = quantity;}


}
