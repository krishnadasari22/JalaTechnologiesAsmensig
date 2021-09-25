import java.io.*;

public class FileReaderWithBufferedReader {

    public static void main(String[] args) throws IOException{We
        String file = "src/file.txt";
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));

        String curLine;
        while ((curLine = bufferedReader.readLine()) != null){
            //process the line as required
            System.out.println(curLine);
        }
        bufferedReader.close();
    }
}