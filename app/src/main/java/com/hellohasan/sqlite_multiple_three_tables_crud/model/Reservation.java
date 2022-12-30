package com.hellohasan.sqlite_multiple_three_tables_crud.model;

public class Reservation extends Product{
    private int status;
    private int rid;
    public Reservation(int rid, int status, int pid, int quantity){
        super(pid, quantity);
    }
}
