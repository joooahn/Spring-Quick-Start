package polyporphism;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("tv")
public class LgTV implements TV{
	
	@Autowired
	private Speaker speaker;
	
	public LgTV() {
		System.out.println("=====> LgTV °´Ã¼ »ý¼º");
	}

	
	public void powerOn() {
		System.out.println("LG On");
	}
	
	public void powerOff()	{
		System.out.println("LG Off");
	}

	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown()	{
		speaker.volumeDown();
	}
	
}
