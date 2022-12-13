package com.perscholas.polymorphismProject;

/*
				 Practice Assignment 
				Polymorphism and Inheritance

  In our game app, we have many types of monsters that can attack. 
  You will design a superclass called Monster and define the method of attack() 
  in the superclass. You will design subclasses called FireMonster, WaterMonster, 
  and StoneMonster. The subclasses will then provide their actual implementation. 
  In the main program, we declare instances of the superclass, 
  substitute them with the actual subclass, 
  and invoke the method defined in the superclass.
 */
public class Monster {

	private String name;

	public Monster(String name) {
		this.name = name;
	}
	
	public String attack() {
		return "!^_&^$@+%$* I don't know how to attack!";
		}
	 
}


	class FireMonster extends Monster{

		public FireMonster(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}
		
		public String attack() {
			return "attack fire";
			}

	}
	 
	class WaterMonster extends Monster{

		public WaterMonster(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}
		
		public String attack() {
			return "attack water";
			}
		
	}
	 
	class StoneMonster extends Monster{

		public StoneMonster(String name) {
			super(name);
			// TODO Auto-generated constructor stub
		}
		
		public String attack() {
			return "attack stone";
			}
		 
	}
	

	
	
