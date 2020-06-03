package inter.basic2;

public class MainClass {

	public static void main(String[] args) {
		Animal baduk=new Dog();
		Animal nabi=new Cat();
		Animal hodol=new Tiger();
		//1. Animal[] 생성후 baduk, nabi, hodol를 저장한 후에 향상된 포문으로 Animal의 공통 기능을 출력
		//2. IPet[] 생성후 baduk, nabi, 금붕어를 저장하고 향상된 포문으로  IPet의 공통 기능을 출력
		Animal[]animal= {baduk,nabi,hodol};
		for(Animal a:animal) {
			a.eat();
		}
		System.out.println("================================");
		IPet[]iPet= {(IPet)baduk,(IPet)nabi,new GoldFish()};
		for(IPet i:iPet) {
			i.play();
		}
		System.out.println("================================");
		PetHouse petHouse=new PetHouse();
		petHouse.carePet((IPet)baduk);
		petHouse.carePet((IPet)nabi);
		petHouse.carePet(new GoldFish());
		petHouse.petInfo(iPet);
	}

}
