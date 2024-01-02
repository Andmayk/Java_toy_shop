import java.sql.Array;
import java.util.List;
import java.util.Random;

public class Lottery {
    private int allWeight;
    private int[] levelWeight;
    public void put(List<Toy> toyList){
        levelWeight = new int[toyList.size()];
        this.allWeight = 0;
        int i = 0;
        for (Toy toy: toyList
             ) {
            this.allWeight = this.allWeight + toy.getWeight();
            levelWeight[i] = this.allWeight;
            i++;
        }

    }
    public int get(){
        Random random = new Random();
        int rnd = random.nextInt(this.allWeight) + 1;
        int chance = 0;
        for (int i=0;i<levelWeight.length; i++) {
           if (rnd <= levelWeight[i]){
               chance =  i;
               break;
           }
        }
        return chance;
    }


}
