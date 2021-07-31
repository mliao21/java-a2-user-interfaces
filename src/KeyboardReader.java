import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Allowing reading from standard in through a BufferedReader.
 * 
 * As explained in Section 4.3 of Java, Java, Java 3e
 * 
 * @author Melissa Liao
 *
 */
public class KeyboardReader {

	private BufferedReader reader;
	
	public KeyboardReader() {
		reader = new BufferedReader(
					new InputStreamReader(System.in));
				
	}

	public String getKeyboardInput(){ 
		return readKeyboard(); 
	}
	
	public int getKeyboardInteger(){ 
		return Integer.parseInt(readKeyboard()); 
	}
	
	public double getKeyboardDouble(){ 
		return Double.parseDouble(readKeyboard()); 
	}
	
	public void prompt(String s){ 
		System.out.print(s);
	}
	
	public void display(String s){ 
		System.out.print(s);
	}
	
	private String readKeyboard(){ 
		String line = "";
		try{ 
			line = reader.readLine(); 
		} catch (IOException e){ 
			e.printStackTrace();
		}
		return line; 
	}
}

