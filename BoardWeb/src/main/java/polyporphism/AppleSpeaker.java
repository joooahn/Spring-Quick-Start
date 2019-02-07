package polyporphism;

import org.springframework.stereotype.Component;

public class AppleSpeaker implements Speaker{
	
	public AppleSpeaker() {
		super();
		System.out.println("AppleSpeaker °´Ã¼ »ý¼º");
	}

	public void volumeUp() {
		System.out.println("AppleSpeaker Up");
	}
	
	public void volumeDown()	{
		System.out.println("AppleSpeaker Down");
	}
	
}
