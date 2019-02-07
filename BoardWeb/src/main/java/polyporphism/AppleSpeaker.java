package polyporphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{
	
	public AppleSpeaker() {
		super();
		System.out.println("AppleSpeaker ��ü ����");
	}

	public void volumeUp() {
		System.out.println("AppleSpeaker Up");
	}
	
	public void volumeDown()	{
		System.out.println("AppleSpeaker Down");
	}
	
}
