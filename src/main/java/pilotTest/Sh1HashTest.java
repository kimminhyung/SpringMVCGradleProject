package pilotTest;

import org.springframework.util.Base64Utils;

public class Sh1HashTest {

	public static void main(String[] args){		
		new Sh1HashTest();		
	}	
	
	public Sh1HashTest(){
		String src = "Base64 Encoding Test";
		try{
			log("Enc Before :" + src);
			byte[] encByte = Base64Utils.encode(src.getBytes("utf-8"));
			log("Enc After :"+ new String(encByte, "utf-8"));
			
		}catch(Exception e){
			log(e.toString());
		}
	}
	
	public void log(String msg){
		System.out.println(msg);
	}
}
