import java.io.*;

public class Test {
  public static void main(String[] args) throws IOException {
    FileOutputStream output = new FileOutputStream("out.dat");
    output.write(199); // Output byte 199 to the stream
    output.close();
	 
    FileInputStream input = new FileInputStream("out.dat");
    System.out.println(input.read()); // Read and display a byte
    input.close();
  }
}
