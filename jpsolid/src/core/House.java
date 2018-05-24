package core;

import interfaces.HasKitchen;
import interfaces.HasRoom;
import interfaces.IProperty;

public class House extends Property implements IProperty, HasRoom, HasKitchen {
    private int numberOfRooms;
    private int kitchenDimension;
    @Override
    public int getNumberOfRooms(){
        return numberOfRooms;
    }

    @Override
    public int getKitchenDimension(){
        return kitchenDimension;
    }
}
