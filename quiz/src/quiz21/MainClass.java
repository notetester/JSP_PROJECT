package quiz21;

public class MainClass {

	public static void main(String[] args) {
		Marine marine1=new Marine();
		Marine marine2=new Marine();
		Marine marine3=new Marine();
		Marine marine4=new Marine();
		Tank tank1=new Tank();
		Tank tank2=new Tank();
		DropShip dropShip=new DropShip();
		marine1.location();
		dropShip.location();
		marine1.move(5, 7);
		dropShip.move(6, 5);
		marine1.move(0, 0);
		dropShip.move(0, 0);
		dropShip.ride(marine1);
		dropShip.ride(marine2);
		dropShip.ride(marine3);
		dropShip.ride(marine4);
		dropShip.ride(tank1);
		dropShip.ride(tank2);
		tank1.location();
		tank2.location();
		dropShip.location();
		dropShip.move(9, 8);
		tank1.location();
		tank2.location();
	}

}
