interface Connectable {
	public abstract void useInternet();
}

interface Playable {
   void play();
}

//인터페이스는 다중구현이 가능하다.
class Device implements Connectable, Playable {
	
	@Override
   public void useInternet() {
      System.out.println("Device가 인터넷을 이용한다.");
   }

   @Override
   public void play() {
      System.out.println("");
      
   }
}

class SmartPhone extends Device{
   
	@Override
	public void useInternet() {
		System.out.println("SmartPhone 으로 인터넷을 이용한다.");
	}
}

class TabletPC extends Device{
	
	@Override
	public void useInternet() {
		System.out.println("TabletPC 으로 인터넷을 이용한다.");
	}
}

class Refrigerator implements Connectable {

	@Override
	public void useInternet() {
		System.out.println("Refrigerator 으로 인터넷을 이용한다.");
	}
	
}

public class ConnectInternet2 {
   
   //   상속을 이용하는 경우
   //   파라미터의 다형성에 의해 Device 타입은 모두 받아 들일 수 있다 
   public void serveInternet(Connectable c) {
      c.useInternet();
   }
   
   public static void main(String[] args) {
      ConnectInternet2 ci = new ConnectInternet2();
      
      Connectable phone = new SmartPhone();
      ci.serveInternet(phone) ;
      
      Connectable pc = new TabletPC();
      ci.serveInternet(pc);
      
      Connectable ref = new Refrigerator();
      ci.serveInternet(ref);
      
   }

}