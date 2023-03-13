package DZ_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class task2 {
    public static void main(String[] args) throws IOException {
        File file = new File("DZ_2\\journal.txt");
        if (!isFileExists(file)) {
            System.out.println("Файл не найден");            ;
        } 
        else {
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            for (String line = br.readLine(); line != null; line = br.readLine()) {
                line = line.replace("\"", "")
                        .replaceAll("[, :]", " ")
                        .replace("фамилия", "Студент")
                        .replace("оценка", "получил")
                        .replace("предмет", "по предмету");
                sb.append(line);
                sb.append("\n");
            }
            br.close();
            System.out.println(sb);            
        }

    }

    public static boolean isFileExists(File file) {
        return file.exists() && !file.isDirectory();
    }

}
