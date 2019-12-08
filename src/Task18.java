/** Задача №18
 * Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
 * а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
 * Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
import java.io.*;

public class Task18 {
    public static void main (String [] args) throws IOException {
        // Чтение из файла task_18.txt и ввод на экран текста и кол-во строк
        String fileName = "C:\\Users\\Иван\\IdeaProjects\\task_18\\src\\resources\\task_18.txt";
        File file = new File(fileName);
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        String line;
        int rowCount = 0;
        System.out.println("Текст в файле task_18.txt такой:");
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            rowCount++;
        }
        System.out.println("Кол-во строк: " + rowCount);

        // Перезапись текста в файле task_18.txt
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileWriter fileWriter = new FileWriter(fileName);
        BufferedWriter out = new BufferedWriter(fileWriter);
        System.out.println("Введите текст, который будет перезаписан в файл task_18.txt: ");
        for (int i = 0; i < rowCount; i++) {
            line = reader.readLine();
            out.write(line);
            out.newLine();
        }
        out.close();
    }
}
