package core;
import interfaces.*;
public class FlyerAnimal implements CanFly, CanSleep, CanEat, CanWalk, HasName {
	String name;
	
	public FlyerAnimal(String name) {
	 SetName(name);
	}
	
	@Override
	public void Eat() {
		System.out.println(this.GetName() + " can eat");
	}

	@Override
	public void Sleep() {
		System.out.println(this.GetName() + " can sleep");
	}

	@Override
	public void Fly() {
		System.out.println(this.GetName() + " can fly");
	}
	
	@Override
	public void Walk() {
		System.out.println(this.GetName() + " can walk");
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public String GetName() {
		return this.name;
	}

}
