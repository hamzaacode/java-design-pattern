package com.example.objectandclassadapter;

public class ObjectAdapter {

    IntegerValueInterface integerValueInterface;

    ObjectAdapter(IntegerValueInterface integerValueInterface){
        this.integerValueInterface=integerValueInterface;
    }

    public int getInteger(){
        return 2+ integerValueInterface.getInteger();
    }
}
