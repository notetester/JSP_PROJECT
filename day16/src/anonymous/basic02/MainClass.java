package anonymous.basic02;

public class MainClass {

	public static void main(String[] args) {
		Computer com=new Computer();
		com.getRemote().turnOn();
		com.getRemote().volumeUp();
		com.getRemote().volumeDown();
		com.getRemote().turnOff();
		com.setRemote(new RemoteControl() {
			
			@Override
			public void volumeUp() {
				System.out.println("볼륨업");
			}
			
			@Override
			public void volumeDown() {
				System.out.println("볼륨다운");
			}
			
			@Override
			public void turnOn() {
				System.out.println("턴온");
			}
			
			@Override
			public void turnOff() {
				System.out.println("턴오프");
			}
		});
		com.getRemote().turnOn();
		com.getRemote().volumeUp();
		com.getRemote().volumeDown();
		com.getRemote().turnOff();
		com.setRemote(new RemoteControl() {
			
			@Override
			public void volumeUp() {
				System.out.println("볼륨업2");
			}
			
			@Override
			public void volumeDown() {
				System.out.println("볼륨다운2");
			}
			
			@Override
			public void turnOn() {
				System.out.println("턴온2");
			}
			
			@Override
			public void turnOff() {
				System.out.println("턴오프2");
			}
			
		});
		com.getRemote().turnOn();
		com.getRemote().volumeUp();
		com.getRemote().volumeDown();
		com.getRemote().turnOff();
		com.getRemote().add();
		Computer com2=new Computer() {
			public void setRemote(RemoteControl remote) {
				System.out.println("ㅡㅡ");
			}
		};
		com2.getRemote().turnOn();
		com2.getRemote().volumeUp();
		com2.getRemote().volumeDown();
		com2.getRemote().turnOff();
		com2.getRemote().add();
		com2.setRemote(new RemoteControl() {
			
			@Override
			public void volumeUp() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void volumeDown() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
		});
		com2.getRemote().turnOn();
		com2.getRemote().volumeUp();
		com2.getRemote().volumeDown();
		com2.getRemote().turnOff();
		com2.getRemote().add();
		Computer com3=new Computer() {
			public void setRemote(RemoteControl remote) {
				System.out.println("ㅡㅡ3");
			}
//			public void run() {
//				System.out.println("달린다");
//			}
		};
//		com3.run();
		com3.getRemote().turnOn();
		com3.getRemote().volumeUp();
		com3.getRemote().volumeDown();
		com3.getRemote().turnOff();
		com3.getRemote().add();
		com3.setRemote(new RemoteControl() {
			
			@Override
			public void volumeUp() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void volumeDown() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOn() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}
		});
		com3.getRemote().turnOn();
		com3.getRemote().volumeUp();
		com3.getRemote().volumeDown();
		com3.getRemote().turnOff();
		com3.getRemote().add();
		Tv tv=new Tv();
		tv.getRemote().turnOn();
		tv.getRemote().volumeUp();
		tv.getRemote().volumeDown();
		tv.getRemote().turnOff();
	}

}
