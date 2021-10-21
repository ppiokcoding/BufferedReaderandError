package BufferedReader;

//º°µµÀÇ °ø°£¿¡ ÀÖ´Â Å¬·¡½º¸¦ »ç¿ëÇÏ°Ú´Ù°í ¼±¾ğ(°¡Á®¿À±â)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//java.lang ÆĞÅ°Áö
// - JDK ÀüÃ¼ Áß À¯ÀÏÇÑ ±âº» ÆĞÅ°Áö(°¡Àå ±âº»Àû + °¡Àå Áß¿äÇÑ Å¬·¡½º¸¦ ¸ğ¾Æ³õÀº ÆĞÅ°Áö)
// - java.lang ÆĞÅ°Áö´Â import¸¦ ÇÏÁö ¾Ê¾Æµµ ÀÚµ¿À¸·Î import°¡ µÈ´Ù.
// - import java.lang.String; // Á¤¼®´ë·Î´Â ½ºÆ®¸µµµ °¡Á®¿Í¾ßÇÔ ÇÏÁö¸¸ À§ÀÇ ÀÌÀ¯·Î ÀÌ ÀÛ¾÷ÀÌ ºÒÇÊ¿ä

public class BufferedReaderandError {
	
	public static void main(String[] args) throws IOException {
		
		//[BufferedReader]
		
		//ÄÜ¼ÖÀÔÃâ·Â
		// - print(), println(), printf()
		// - read(), BufferedReader, Scanner
		
		//Å¬·¡½º »ç¿ë¹ı
		// - Å¬·¡½º = ÀÚ·áÇü
		
		//ÀÚ·áÇü º¯¼ö¸í;
		//int n;
		//String str;
		//BufferedReader reader;
		
		//String, BufferedReader > Å¬·¡½º
		//String > Ç×»ó Á¢±ÙÇÒ ¼ö ÀÖ´Â °ø°£¿¡ µé¾îÀÖ´Â Å¬·¡½º
		//BufferedReader > µû·Î º¸°üÇØ³õÀº °ø°£¿¡ µé¾îÀÖ´Â Å¬·¡½º
		
		int sum = 10 + 20;
		
		//½¦ÇÁ > ¾ç³äÀå > ÁÖº¯ÀÎµé¿¡°Ô Àü´Ş
		//1. ¾ç³äÀå ·¹½ÃÇÇ Àü´Ş > x > ¼Ò½º ÀÚÃ¼ Àü´Ş
		//2. ¿Ï¼ºµÈ ¾ç³äÀå ÀÚÃ¼ Àü´Ş > o >  Å¬·¡½º ´ÜÀ§(ÄÄÆÄÀÏ °á°ú, *.class) Àü´Ş
		
		//Å¬·¡½º > ÄÚµåÀÇ ÁıÇÕ > ±¸ÇöµÈ ±â´ÉÀÇ ÁıÇÕ > °³¹ßÀÚ°¡ Æ¯Á¤ ±â´ÉµéÀ» ¸¸µé¾î ³õÀº »óÀÚ(Å¬·¡½º) 
		//	> ´Ù¸¥ °³¹ßÀÚµé¿¡°Ô »ç¿ëÇÏ¶ó°í Àü´Ş °¡´É!! (Å¬·¡½º ´ÜÀ§·Î ÁÖ°í ¹Ş´Â´Ù.)
		
		//Çö½ÃÁ¡ > ¼ö¸¹Àº Å¬·¡½º¸¦ º¸À¯(JDK - 8Ãµ¿©°³) > ÀÌ µÑ Áß µü 1°ø°£¿¡ µé¾îÀÖ´Â Å¬·¡½º¸¸ ¹Ù·Î »ç¿ëÀÌ °¡´ÉÇÏ°í, 
		//³ª¸ÓÁö °ø°£¿¡ µé¾îÀÖ´Â Å¬·¡½º´Â °¡Á®¿À´Â Çàµ¿ÀÌ ÇÊ¿äÇÏ´Ù.
		
		
		//¿ä±¸»çÇ×] ¹®ÀÚ 1°³¸¦ ÀÔ·Â¹Ş¾Æ ±×´ë·Î Ãâ·ÂÇÏ½Ã¿À.
		//System.in.read();
		
		int n = 10;
		String str = "¹®ÀÚ¿­";
		
		//System.in.read() -> °¨½Ñ µÚ -> °³·® -> Wrapper Class
		BufferedReader reader 
		= new BufferedReader(new InputStreamReader(System.in)); //µµ±¸ »ı¼º
		System.out.print("¹®ÀÚÀÔ·Â: ");
		int code = reader.read();
		System.out.println(code);
		System.out.printf("%c\r\n", code); //int -> code
		
		//ÇöÀç ¹öÆÛ¾È¿¡ \r\n°¡ ³²¾ÆÀÖ´Ù. > »èÁ¦!!!
		reader.readLine(); // °øÈ¸Àü > \r\n¸¦ Áö¿ì±â À§ÇØ¼­
		
		//code = reader.read();		
		//System.out.println(code);
		//System.out.printf("%c\n", code);
				
		//code = reader.read();		
		//System.out.println(code);
		//System.out.printf("%c\n", code);
		
		//°¡(44032) ~ ÆR(55203) -> 11,172°³
		
		//------------------------------------
		
		//¿ä±¸»çÇ×] »ç¿ëÀÚ¿¡°Ô ÀÌ¸§(3¹®ÀÚ)À» ÀÔ·Â¹Ş¾Æ ÀÎ»ç¸¦ ÇÏ½Ã¿À.
		// -> reader() x 3È¸
		
		System.out.print("ÀÌ¸§ ÀÔ·Â: ");
		
		//reader.read() > 1¹®ÀÚÀÔ·Â > ¹®ÀÚÄÚµå(int) ¹İÈ¯
		//reader.readLine() > N¹®ÀÚ(¹®ÀÚ¿­) ÀÔ·Â > ¹®ÀÚ¿­(String) ¹İÈ¯
		//reader.readLine() > ÀÔ·Â ¹öÆÛ¾È¿¡¼­ ¿£ÅÍ°ªÀ» ¸¸³ª±â Àü±îÁöÀÇ ¹®ÀÚ¿­À» ¹İÈ¯ + ³²¾ÆÀÖ´Â \r\n´Â Áö¿ö¹ö¸°´Ù.
		
		String name = reader.readLine();
		System.out.printf("¾È³çÇÏ¼¼¿ä. %s´Ô. \n", name);
		
		System.out.print("³ªÀÌ ÀÔ·Â: ");
		String age = reader.readLine();
		System.out.printf("´ç½ÅÀÇ ³ªÀÌ´Â %s»ìÀÌ±º¿ä. \n", age);
		
		
		//======================================================================
		
		//¿ä±¸»çÇ×] ¼ıÀÚ 2°³¸¦ ÀÔ·Â¹Ş¾Æ µÎ ¼öÀÇ ÇÕÀ» ±¸ÇÏ½Ã¿À.
		
		//ÀüÃ¼ import ´ÜÃàÅ°
		//Ctrl + Shift + o

		// ÄÚµå Á¶°¢
		//BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("¼ıÀÚ ÀÔ·Â: ");
		String input1 = reader.readLine();

		System.out.print("¼ıÀÚ ÀÔ·Â: ");
		String input2 = reader.readLine();

		System.out.println(input1 + input2); // String + String

		// BufferedReader´Â ¸ğµç ÀÔ·Â°ªÀ» *String*À¸·Î ¹İÈ¯ÇÑ´Ù.
		// ÀÔ·Â¹ŞÀº StringÀ» ¿øÇÏ´Â ´Ù¸¥ ÀÚ·áÇüÀ¸·Î º¯È¯ÇØ¾ß ÇÑ´Ù.
		
		
		//À¯Æ¿ Å¬·¡½º »ç¿ë
		//String -> int
		//String -> double
		//String -> boolean
		
		//"100" : ¹®ÀÚ¿­ -> 100 : ÀÚ·áÇü
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		
		System.out.println(num1 + num2);
		
		
		//"100" -> 100   : Integer.parseInt()
		//                 Byte.parseByte()
		//                 Short.parseShort()
		//                 Long.parseLong()
		//"3.14" -> 3.14 : Double.parseDouble() 
		//                 Float.parseFloat()
		//"true" -> true : Boolean.parseBoolean()
		
		
		
		//======================================================
		
		//[Error]
		/*
		  ¿¡·¯, Error
		 - ¿À·ù, ¹ö±×(Bug), ¿¹¿Ü(Exception) µî...
		 
		  1. ÄÄÆÄÀÏ ¿¡·¯
		  - ÄÄÆÄÀÏ ÀÛ¾÷Áß¿¡ ¹ß»ıÇÏ´Â ¿¡·¯
		  - ÄÄÆÄÀÏ·¯ ¹ß°ß > ¹®¹ıÀÌ Æ²·È´Ù!!
		  - ÀÌÅ¬¸³½º ÆíÁı±âÀÇ »¡°£ÁÙ
		  - ÄÄÆÄÀÏ ÀÛ¾÷ Áß´Ü > ¹ø¿ª Áß´Ü > ÇÁ·Î±×·¥ »ı¼º ºÒ°¡ > ¹İµå½Ã ÇØ°á!!!
		  - ³­ÀÌµµ °¡Àå ³·À½ > ¹ß°ßÀÌ ½±´Ù > °íÄ¡±â ½±´Ù.
		  - ÄÄÆÄÀÏ·¯°¡ Ä£ÀıÇÏ°Ô »óÈ²À» ¾Ë·ÁÁØ´Ù.(¿¡·¯ ¸Ş½ÃÁö)
		  - ¿ÀÅ¸!!
		  - ÇØ°á ¹æ¹ı > ¿¡·¯ ¸Ş½ÃÁö È®ÀÎ > ¼öÁ¤
		  
		  
		  2. ·±Å¸ÀÓ ¿¡·¯
		  - ÄÄÆÄÀÏ¶§´Â ¹ß°ßÀÌ ¾ÈµÆ´Âµ¥, ½ÇÇà Áß¿¡ ¹ß°ßµÇ´Â ¿¡·¯
		  - ¹®¹ı¿¡´Â ¿À·ù°¡ ¾ø´Âµ¥ ´Ù¸¥¿øÀÎÀ¸·Î ¹ß»ıÇÏ´Â ¿¡·¯
		  - ¿¹¿Ü(Exception)
		  - ³­ÀÌµµ Áß°£ > ¹ß°ß Áß°£ > º¹ºÒº¹ > Å×½ºÆ® ¹ß°ßo -> Á¶Ä¡o, Å×½ºÆ® ¹ß°ßx ->Á¶Ä¡x
		  - ·±Å¸ÀÓ(=ÇÁ·Î±×·¥À» ½ÇÇàÁß)
		  - Áö±¸»óÀÇ ´ëºÎºĞ ÇÁ·Î±×·¥Àº ·±Å¸ÀÓ ¿À·ù¸¦ °¡Áö°í ÀÖ´Ù.
		  - Á¶Ä¡ ¹æ¹ı > ½Ã°£ + µ·(ÀÎ·Â, ÀÚµ¿È­ Å×½ºÆ® ÇÁ·Î±×·¥)
		  - °ÔÀÓ Ãâ½Ã > RPG > ¼Ò¼öÀÇ °³¹ßÀÚ ¸ğµç ±â´É Å×½ºÆ® ºÒ°¡´É > Å¬·ÎÁîµå ¾ËÆÄ, Å¬·ÎÁîµå º£Å¸, ¿ÀÇÂ ¾ËÆÄ, ¿ÀÇÂ º£Å¸ > º£Å¸ Å×½ºÅÍ 
		  > ·±Å¸ÀÓ ¿À·ù ¹ß°ßÇÏ´Â »ç¶÷µé!! > ¿À·ù ¹ß°ß -> ÆĞÄ¡, ¾÷±×·¹ÀÌµå
		  
		  
		  3. ³í¸® ¿¡·¯
		  - ¹®¹ıµµ Æ²¸°°÷ÀÌ ¾ø°í, ½ÇÇàµµ ÀßµÇ´Âµ¥...? > °á°ú°¡ ÀÌ»óÇÔ;;
		  - ¹ß°ß ÃÖ¾Ç, ¼öÁ¤ ÃÖ¾Ç > Ã£±â°¡ ³Ê¹« Èûµê > ¹®¹ıÆ²¸°µ¥x, ½ÇÇào
		  - ÇØ°á ¹æ¹ı > ÇÑÁÙ ÇÑÁÙ Á÷Á¢ ´«À¸·Î È®ÀÎ
		  
		  ÄÄÆÄÀÏ ¿¡·¯ + ·±Å¸ÀÓ ¿¡·¯
		  - Á¤¸® ³ëÆ® ¸¸µé±â
		  - ¿öµå, ¿ø³ëÆ®, ³ë¼Ç, ¸Ş¸ğÀå µî ²À Á¤¸®ÇÏ±â
		  
		 
		 */
		
		// »ç¿ëÀÚ¿¡°Ô ¼ıÀÚ¸¦ 1°³ ÀÔ·Â > ¿¬»ê °á°ú Ãâ·Â
		// - ÄÄÆÄÀÏO, ½ÇÇàO, Å×½ºÆ®O > Ãâ½Ã!!! > ¿¡·¯!!
		
		//Exception in thread "main" java.lang.ArithmeticException: / by zero
		//at com.test.java.Ex09_BufferedReader.main(Ex09_BufferedReader.java:135)
		
		//divide by zero
		
		//»ç¿ëÀÚ°¡ ÀÔ·ÂÇÏ´Â ¼ıÀÚ > °æ¿ìÀÇ ¼ö? > 42¾ï°¡Áö > ±× Áß¿¡ µü 1°¡Áö(0)À» ÀÔ·Â½Ã ¿¡·¯ 
		//int num = 0; //Å°º¸µå ÀÔ·Â
		//System.out.println(100 / num);
		
		
	}//main

}
