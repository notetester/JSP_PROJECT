package quiz16;

public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요
	private KeyBoard keyBoard;
	private Monitor monitor;
	private Mouse mouse;
	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요
	public Computer(){
		keyBoard=new KeyBoard();
		monitor=new Monitor();
		mouse=new Mouse();
	}
	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요
	public void computerInfo() {
		keyBoard.info();
		monitor.info();
		mouse.info();
	}
	
	public Computer(KeyBoard keyBoard, Monitor monitor, Mouse mouse) {
		super();
		this.keyBoard = keyBoard;
		this.monitor = monitor;
		this.mouse = mouse;
	}
	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	public KeyBoard getKeyBoard() {
		return keyBoard;
	}
	public void setKeyBoard(KeyBoard keyBoard) {
		this.keyBoard = keyBoard;
	}
	public Monitor getMonitor() {
		return monitor;
	}
	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}
	public Mouse getMouse() {
		return mouse;
	}
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	
	
	
}
