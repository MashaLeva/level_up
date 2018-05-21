import core.*;
import interfaces.CanWalk;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WalkerAnimal Dog = new WalkerAnimal("Firulais");
		FlyerAnimal Eagle = new FlyerAnimal("Falcon");
		CanWalk Rabbit = new WalkerAnimal("Serapio");
		
		Dog.Eat();
		Dog.Walk();
		Dog.Sleep();
		
		Eagle.Eat();
		Eagle.Fly();
		Eagle.Sleep();
		Eagle.Walk();
		
		Rabbit.Walk();
	}
	
}
