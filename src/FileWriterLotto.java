import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class FileWriterLotto {
    public static void writeToFile(String line){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("toylotto.txt", StandardCharsets.UTF_8, true))) {
            writer.write(line);
            writer.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
