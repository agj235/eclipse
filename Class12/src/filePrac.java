

	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileWriter;
	import java.io.IOException;

	public class filePrac {

		
		public static void main(String[] args) throws IOException {
		// Step 1 create file
			File notePad = new File("/Users/angeljimenez/eclipse-workspace/Class12/src/configFile/hello.txt");
		notePad.createNewFile();
		//Step 2 : called a call to write inside the File
		FileWriter newFile = new FileWriter("/Users/angeljimenez/eclipse-workspace/Class12/src/configFile/hello.txt");
		//Step 3 Import BurfferedWriter class
		
		BufferedWriter bWriter = new BufferedWriter(newFile);
		
		bWriter.write("Hello my name is jeff");
		bWriter.newLine();
		bWriter.write("This thing sucks");
		bWriter.close();
		}

	}

