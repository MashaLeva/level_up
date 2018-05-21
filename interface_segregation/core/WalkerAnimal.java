package core;
import interfaces.*;
public class WalkerAnimal implements CanEat, CanSleep, CanWalk, HasName {
	String name;
	
    public WalkerAnimal(String name){
    	SetName(name);
    }

	@Override
	public void Walk() {
		System.out.println(this.GetName() + " can walk");
	}

	@Override
	public void Sleep() {
		System.out.println(this.GetName() + " can sleep");
	}

	@Override
	public void Eat() {
		System.out.println(this.GetName() + " can eat");
	}
	public void SetName(String name) {
		this.name = name;
	}
	
	public String GetName() {
		return this.name;
	}
}
