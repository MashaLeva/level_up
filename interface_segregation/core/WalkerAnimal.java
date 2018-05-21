package core;
import interfaces.*;
public class WalkerAnimal implements CanEat, CanSleep, CanWalk, HasName {
	String name;
	
    public WalkerAnimal(String name){
    	SetName(name);
    }

    public void PrintAbilities() {
		System.out.println("The abilities of " + this.name + " are:");
    	System.out.println("The animal can eat   ->" + Eat());
        System.out.println("The animal can sleep ->" + Sleep());
        System.out.println("The animal can walk  ->" + Walk());
	}

	@Override
	public boolean Walk() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean Sleep() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean Eat() {
		// TODO Auto-generated method stub
		return true;
		
	}
	public void SetName(String name) {
		this.name = name;
	}
	
	public String GetName() {
		return this.name;
	}
}
