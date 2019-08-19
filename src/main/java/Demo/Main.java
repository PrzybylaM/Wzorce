package Demo;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public String read() {
        File plik = new File("C:\\Users\\admin\\Desktop\\Projekty\\Pizza\\src\\main\\java\\Demo\\PanTadeusz.txt");

        List<String> wordInBook = new ArrayList();

        try {
            String st;
            BufferedReader br = new BufferedReader(new FileReader(plik));
            while ((st = br.readLine()) != null) {
                String[] wordLine = st.toLowerCase()
                        .trim()
                        .replace("ę", "e").replace("ą", "a")
            }
            }catch(IOException e){
                System.out.println("Problem z odczytywaniem pliku");
            }
            return result;
        }

    public static int numberOfWords(FileReader reader) {
        Scanner scanner = new Scanner(reader);
        int count = 0;
        while (scanner.hasNext()) {
            scanner.next();
            count++;
        }
        scanner.close();
        return count;
    }
    }

