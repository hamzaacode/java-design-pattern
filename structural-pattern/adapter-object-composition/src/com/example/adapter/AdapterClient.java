package com.example.adapter;

public class AdapterClient {

    public static void main(String[] args) {
     MemoryCard adapter=new CardReaderAdapter (new AppleLaptop());
     adapter.read();




          }
}
