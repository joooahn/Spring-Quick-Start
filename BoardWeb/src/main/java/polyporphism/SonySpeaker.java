package polyporphism;

import org.springframework.stereotype.Component;

public class SonySpeaker implements Speaker{
	
	public SonySpeaker() {
		System.out.println("SonySpeaker ��ü ����");
	}

	public void volumeUp() {
		System.out.println("SonySpeaker Up");
	}
	
	public void volumeDown()	{
		System.out.println("SonySpeaker Down");
	}
	
}
