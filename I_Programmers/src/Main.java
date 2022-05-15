import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
//        Solution sol = new Solution();
//        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
//        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi", "apeach muzi"};
//        sol.solution(id_list, report, 2);
////        sol.checkReport(report,2);
        Map<String, ArrayList<String>> map = new HashMap<>();
        map.put("A",new ArrayList<>());
        map.put("B",new ArrayList<>());
        map.put("C",new ArrayList<>());
        map.put("D",new ArrayList<>());
        map.get("A").add("B");
        map.get("B").add("F");
        map.get("C").add("D");
        map.get("D").add("F");
        map.get("A").add("A");
        map.get("A").add("A");

        Map<String, HashSet<String>> map2 = new HashMap<>();
        map2.put("A",new HashSet<String>());
        map2.put("C",new HashSet<String>());
        map2.put("B",new HashSet<String>());
        map2.put("D",new HashSet<String>());
        map2.get("A").add("B");
        map2.get("B").add("F");
        map2.get("C").add("D");
        map2.get("D").add("F");
        map2.get("A").add("A");
        map2.get("A").add("A");

        Map<String, String> map3 = new HashMap<>();
        map3.put("A", "B");
        map3.put("B", "F");
        map3.put("C", "D");
        map3.put("D", "F");
        map3.put("A", "A");

        System.out.println(map.toString());
    }
}

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        ArrayList<String> accusedMembers = checkReport(report, k);
        Map<String, Integer> repoResult = new HashMap<>();

        for(int i=0; i<id_list.length;i++){
            repoResult.put(id_list[i],0);
        }

        for(int i=0; i<report.length;i++){
            if(accusedMembers.contains(report[i].split(" ")[1])){
                repoResult.put(report[i].split(" ")[0], repoResult.get(report[i].split(" ")[0])+1  );
            }
        }

        for(int i=0; i<id_list.length;i++){
            answer[i]=repoResult.get(id_list[i]);
        }

        return answer;
    }

    public ArrayList<String> checkReport(String[] report, int k){
        // 중복제거
        Set<String> reportSet = new HashSet<>(Arrays.asList(report));
        Map<String, Integer> map = new LinkedHashMap<>();
        ArrayList accusedMembers = new ArrayList();
        // 신고접수 체크
        for (String repo : reportSet){
            String accused = repo.split(" ")[1];
            if(map.containsKey(accused)){
                map.put(accused, map.get(accused)+1);
            }else{
                map.put(accused, 1);
            }
        }
        for(Map.Entry<String, Integer> entry : map.entrySet() ){
            if(entry.getValue()>=k){
                accusedMembers.add(entry.getKey());
            }
        }

        return accusedMembers;
    }
}
