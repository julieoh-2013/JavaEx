package com.javaex.basic.oop.casting;

public class AnimalApp {
	public static void main(String[] args) {
		
		Animal dog1 = new Dog("Snoopy"); // Upcasting
		dog1.eat();
		dog1.walk();
//		dog1.bark(); // 못함
		
		Dog dog2 = new Dog("Doggy");
		dog2.eat();
		dog2.walk();
		dog2.bark();
		
		// Downcasting : 명시적으로 타입지정 해야함.
//		Dog dog3 = (Dog)dog1;;
//		dog3.bark();
		((Dog)dog1).bark();
        
		Animal pet = new Dog("Azi");
		pet.eat();
		pet.walk();
		
		pet = new Cat("Yaong");
		pet.eat();
		pet.walk();
		
//		pet.bark(); //에러		
		if(pet instanceof Dog) {
			 ((Dog) pet).bark();
		}else if(pet instanceof Cat) {
			((Cat) pet).meow();
		}
	}
}
