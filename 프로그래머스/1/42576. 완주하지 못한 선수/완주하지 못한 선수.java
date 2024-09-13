import java.util.LinkedHashMap;

public class Solution {
    public static String solution(String[] participant, String[] completion) {

        LinkedHashMap<String, Integer> participantMap = new LinkedHashMap<>();
        for(String name : participant){
            participantMap.put(name, participantMap.getOrDefault(name, 0) + 1);
        }
        
        for(String name : completion) {
            participantMap.put(name, participantMap.get(name) - 1);
        }
        
        for (String name : participantMap.keySet()) {
            if (participantMap.get(name) > 0) {
                return name;
            }
        }
        return "";
    }
}