import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        HashMap<String,Integer> map = new HashMap<>();
    
        for(int i = 0; i<participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i],0) + 1);
        }
        for(int i = 0; i<completion.length; i++){
            map.put(completion[i], map.get(completion[i])-1);
        }
        List<String> list = new ArrayList<>(map.keySet());
        for(int i = 0; i < list.size(); i++){
            if(map.get(list.get(i))>0) return list.get(i);
        }
        return "false";
    }
}