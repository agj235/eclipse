import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileReader {

	public static void main(String[] args) throws IOException {
	
		FileReader fReader = new FileReader("/Users/angeljimenez/eclipse-workspace/Class12/src/configFile/hello.txt");

			BufferedReader bReader = new BufferedReader(fReader);
		
		//System.out.println(bReader.readLine());
		
	String i = "";
		while((i= bReader.readLine())!=null) {
		System.out.println(i);
		}
	}

}
