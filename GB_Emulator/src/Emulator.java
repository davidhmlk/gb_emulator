
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;
public class Emulator {

	public static void main(String[] args) {
		//System.out.println(args[0]);
		//File ROM = new File(args[0]);
		
		String filePath = "/home/david/TLOZ.gb";
		//String content=new String();
		StringBuilder contentBuilder = new StringBuilder();
		try {
			
			byte[] content = Files.readAllBytes( Paths.get(filePath));
			for(int i = 0; i<100;i++) {
				System.out.print(content[i]);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
