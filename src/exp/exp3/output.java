package exp.exp3;

import java.io.*;
import java.util.*;

public class output {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            String str = null;
            FileReader input = new FileReader("in.txt");
            BufferedReader in = new BufferedReader(input);
            while((str = in.readLine())!=null) {
                System.out.println(str);
            }
            in.close();
            input.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
    }
}
