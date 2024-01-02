import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Toy> toyList = new ArrayList<>();
        toyList.add(new Toy("1", "конструктор",20));
        toyList.add(new Toy("2", "робот",20));
        toyList.add(new Toy("3", "кукла",60));

        Lottery lottery = new Lottery();
        lottery.put(toyList);

        FileWriterLotto fileWriterLotto = new FileWriterLotto();

        for (int i=0;i<10; i++) {
            fileWriterLotto.writeToFile(toyList.get(lottery.get()).toString());
        }
    }
}


