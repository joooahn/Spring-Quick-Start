package polyporphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("=====> SamsungTV(1) 객체 생성");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker 호출");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("setPrice 호출");
		this.price = price;
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("=====> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("=====> SamsungTV(3) 객체 생성 (가격 : " + price + ")");
		this.speaker = speaker;
	}
	
	public void initMethod() {
		System.out.println("객체 초기화 작업 처리..");
	}
	
	public void powerOn() {
		System.out.println("Samsung On(가격 :" + price +")");
	}
	
	public void powerOff()	{
		System.out.println("Samsung Off");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown()	{
		speaker.volumeDown();
	}
	
	public void destroyMethod() {
		System.out.println("객체 삭제 전에 처리할 로직");
	}
}
