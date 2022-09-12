package com.example.objectandclassadapter;

public class ObjectAndClassAdapterClient {

    public static void main(String[] args) {
        IntegerValueInterface classAdapter=new ClassAdapter();

        ObjectAdapter objectAdapter=new ObjectAdapter(new IntegerValue());

        System.out.println("Class adapter integer value " + classAdapter.getInteger());
        System.out.println("Object adapter integer value "+ objectAdapter.getInteger());
    }
}
