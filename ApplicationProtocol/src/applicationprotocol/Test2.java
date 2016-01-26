import java.io.*;

public class Test2 {
  public static void main(String[] args) throws IOException {
    FileWriter output = new FileWriter("out.txt");
    output.write("199"); // Output string "199" to the stream
    output.close();

    // Read and display three characters
    FileReader input = new FileReader("out.txt");
    System.out.print((char)input.read());
    System.out.print((char)input.read());
    System.out.println((char)input.read());
    input.close();
  }
}
