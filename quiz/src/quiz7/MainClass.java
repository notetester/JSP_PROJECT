package quiz7;

public class MainClass {
	public static void main(String[] args) {
		Wizard wizard=new Wizard();
		wizard.name="구르미그린달빛";
		wizard.hp=500;
		wizard.mp=1000;
		Warrior warrior=new Warrior();
		warrior.name="강한친구대한전사";
		warrior.hp=1000;
		warrior.mp=500;
		System.out.println("====마법사====");
		wizard.info();
		wizard.iceArrow();
		System.out.println("====전사====");
		warrior.info();
		warrior.bash();
	}
}
