package core;

import com.sun.xml.internal.ws.api.message.ExceptionHasMessage;
import interfaces.HasKitchen;
import interfaces.HasRoom;
import interfaces.IProperty;

public class Apartment extends Property implements IProperty, HasRoom, HasKitchen {
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
