package java_list_05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Study {
    public static void main(String[] args) {
        List<ScoccerPlayer> sc = new ArrayList<>();

        ScoccerPlayer sc1 = new ScoccerPlayer("메시" , "공격수",22);
        ScoccerPlayer sc2 = new ScoccerPlayer("호날두" , "공격수",22);
        ScoccerPlayer sc3 = new ScoccerPlayer("박주영" , "공격수",22);
        ScoccerPlayer sc4 = new ScoccerPlayer("가봉" , "공격수",22);

        sc.add(sc1);
        sc.add(sc2);
        sc.add(sc3);
        sc.add(sc4);
        for (ScoccerPlayer s : sc){
            System.out.println(s.getName());
        }
        System.out.println("-----------------------------------");

        Collections.sort(sc, new Comparator<ScoccerPlayer>(){
            @Override
            public int compare(ScoccerPlayer o1, ScoccerPlayer o2) {
                if(o1.getName().charAt(0) > o2.getName().charAt(0)) return 1;
                else if(o1.getName().charAt(0) < o2.getName().charAt(0)) return -1;
                return 0;
            }
        });

        for (ScoccerPlayer s : sc){
            System.out.println(s.getName());
        }

    }
}
