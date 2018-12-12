package TutorialPoint;

import java.io.*;

public class StandardIoStream {

	public static void main(String[] args) throws IOException{
		InputStreamReader cin = null;
		try {
			cin = new InputStreamReader (System.in);
			System.out.println ("Enter, 'q' to quite.");
			char c;
			do {
				c = (char) cin .read(); 
				System.out.print(c);
			
			} while (c != 'q');
		}finally {
			if (cin != null ) {
				cin.close();
			}
		}
		

	}

}
