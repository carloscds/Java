import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class App {

	public static void main(String[] args) {

		try {
			File f = new File("C:\\");
            ArrayList<File> files = new ArrayList<File>(Arrays.asList(f.listFiles()));
            for(File arq : files) {
				System.out.println(arq);
			}

		} catch (Exception e) {
			System.out.println();
			e.printStackTrace();
		}
	}
}