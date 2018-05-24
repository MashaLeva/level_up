package core;

import interfaces.HasKitchen;
import interfaces.IProperty;

public class Office extends Property implements IProperty, HasKitchen {
    private int numberOfRooms;
    private int kitchenDimension;

    @Override
    public int getKitchenDimension(){
        return kitchenDimension;
    }
}
