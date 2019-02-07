package polyporphism;

public class SamsungTV implements TV{
	
	private Speaker speaker;
	private int price;
	
	public SamsungTV() {
		System.out.println("=====> SamsungTV(1) ��ü ����");
	}
	
	public void setSpeaker(Speaker speaker) {
		System.out.println("setSpeaker ȣ��");
		this.speaker = speaker;
	}

	public void setPrice(int price) {
		System.out.println("setPrice ȣ��");
		this.price = price;
	}

	public SamsungTV(Speaker speaker) {
		System.out.println("=====> SamsungTV(2) ��ü ����");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("=====> SamsungTV(3) ��ü ���� (���� : " + price + ")");
		this.speaker = speaker;
	}
	
	public void initMethod() {
		System.out.println("��ü �ʱ�ȭ �۾� ó��..");
	}
	
	public void powerOn() {
		System.out.println("Samsung On(���� :" + price +")");
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
		System.out.println("��ü ���� ���� ó���� ����");
	}
}
