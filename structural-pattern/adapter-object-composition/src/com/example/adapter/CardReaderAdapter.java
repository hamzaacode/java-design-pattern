package com.example.adapter;

public class CardReaderAdapter implements MemoryCard { //CardReader is adapter
    Laptop laptop;  // adaptee or wall socket


    public CardReaderAdapter() {
    }

    public CardReaderAdapter(Laptop laptop) {
        this.laptop = laptop;
    }

    @Override
    public void read() {
        System.out.println("This is memoryCard");
        laptop.read();
    }

    @Override
    public void write() {
        laptop.write();
    }

    @Override
    public void remove() {

    }
}
