package javaworkspace;
//extends����д��implementsǰ��
public class Rabbit extends LandAnimal implements ClimbTree{
	public void climb()
	{
		System.out.println("Rabbit:I can climb");
	}
	public void eat()
	{
		System.out.println("Rabbit:I can eat~ ");
	}
	public static void main (String[] args)
	{
		Rabbit a= new Rabbit();
		a.climb();
		a.eat();
		a.move();
	}
}
