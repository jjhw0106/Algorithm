import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi", "apeach muzi"};
        sol.solution(id_list, report, 2);
//        sol.checkReport(report,2);
//        Map<String, ArrayList<String>> map = new HashMap<>();
//        map.put("A",new ArrayList<>());
//        map.put("B",new ArrayList<>());
//        map.put("C",new ArrayList<>());
//        map.put("D",new ArrayList<>());
//        map.get("A").add("B");
//        map.get("B").add("F");
//        map.get("C").add("D");
//        map.get("D").add("F");
//        map.get("A").add("A");
//        map.get("A").add("A");
//
//        Map<String, HashSet<String>> map2 = new HashMap<>();
//        map2.put("A",new HashSet<String>());
//        map2.put("C",new HashSet<String>());
//        map2.put("B",new HashSet<String>());
//        map2.put("D",new HashSet<String>());
//        map2.get("A").add("B");
//        map2.get("B").add("F");
//        map2.get("C").add("D");
//        map2.get("D").add("F");
//        map2.get("A").add("A");
//        map2.get("A").add("A");
//
//        Map<String, String> map3 = new HashMap<>();
//        map3.put("A", "B");
//        map3.put("B", "F");
//        map3.put("C", "D");
//        map3.put("D", "F");
//        map3.put("A", "A");
//
//        System.out.println(map.toString());
    }
}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];

        Map<String, HashSet<String>> reportMap = new HashMap<>();
        Map<String, Integer> mailMap;



        // [신고 당한애 : 신고당한 횟수]
        // [신고 한애 : 답장 수]
        //
        return answer;
    }

    public ArrayList<String> checkReport(String[] report, int k){

    }

}
