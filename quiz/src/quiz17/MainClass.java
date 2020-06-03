package quiz17;

public class MainClass {

	public static void main(String[] args) {
		
		Warrior me = new Warrior("강한친구대한전사");
		Wizard me2 = new Wizard("구르미");
		Wizard play2 = new Wizard("구르미그린마법사"); //체력 : 500
		Warrior play3 = new Warrior("전사약해요"); // 체력 : 1000

		System.out.println("---나의 케릭 배쉬스킬 사용---");
		me.bash(play2); //강한친구대한전사 bash스킬 사용(play2 적중)
		me.bash(play3); //강한친구대한전사 bash스킬 사용(play3 적중)
		
		me.bash(play2); //강한친구대한전사 bash스킬 사용(play2 적중)
		me.bash(play3); //강한친구대한전사 bash스킬 사용(play3 적중)
		
		play2.info();
		play3.info();
		System.out.println("========블리자드 사용========");
		Player[]p= {me,play2,play3};
		me2.blizzard(p);
		me2.blizzard(p);
		me2.blizzard(p);
		me2.blizzard(p);
		me2.blizzard(p);
	}
}
