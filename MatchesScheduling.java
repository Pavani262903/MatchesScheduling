import java.util.Arraylist;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Sample7 {
    public static void main(String[] args) {
        ArrayList<String> as = new ArrayList<>();
   

        as.add("team1");
        as.add("team2");
        as.add("team3");
        as.add("team4");
        as.add("team5");
        ArrayList<Object> as2 = new ArrayList<>();
        Match one = new Match(as.get(0));
        Match two = new Match(as.get(1));
        Match three = new Match(as.get(2));
        Match four = new Match(as.get(3));
        Match five = new Match(as.get(4));
        as2.add(one);
        as2.add(two);
        as2.add(three);
        as2.add(four);
        as2.add(five);
       
          new Match(as2);
        }
    

 
}

class Match {
    String str;

    Match(String str) {
        this.str = str;
    }
    public String toString(){
        return str;
    }
    Match(ArrayList<Object> as){
      for(Object str2:as){
        System.out.println(str2);

      }
    }
}
