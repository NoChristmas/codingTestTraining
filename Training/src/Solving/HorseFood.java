package Solving;

import java.util.HashMap;

public class HorseFood {
    public static void main(String[] args) {
        String[] players = { "mumu", "soe", "poe", "kai", "mine" };
        // 0 1 2 3 4
        String[] callings = { "kai", "kai", "mine", "mine" };
        // 0 1 2 3
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < players.length; i++) { // Hashmap으로 각 key값 별로 index가 추가 됨
            map.put(players[i], i);
        }
        
        for (String player : callings){
            int ownRank = map.get(player);
            String beforePlayer = players[ownRank-1];

            //players 배열 갱신
            players[ownRank-1] = player;
            players[ownRank] = beforePlayer;

            map.put(player, ownRank-1);
            map.put(beforePlayer, ownRank);
        }
        
        for(int i=0; i<players.length; i++){
            System.out.println(players[i]);
        }
    }
}
