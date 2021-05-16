package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

import level1.Solution;

//선행 스킬이란 어떤 스킬을 배우기 전에 먼저 배워야 하는 스킬을 뜻합니다.
//
//예를 들어 선행 스킬 순서가 스파크 → 라이트닝 볼트 → 썬더일때, 썬더를 배우려면 먼저 라이트닝 볼트를 배워야 하고, 
//라이트닝 볼트를 배우려면 먼저 스파크를 배워야 합니다.
//
//위 순서에 없는 다른 스킬(힐링 등)은 순서에 상관없이 배울 수 있습니다. 
//따라서 스파크 → 힐링 → 라이트닝 볼트 → 썬더와 같은 스킬트리는 가능하지만, 
//썬더 → 스파크나 라이트닝 볼트 → 스파크 → 힐링 → 썬더와 같은 스킬트리는 불가능합니다.
//
//선행 스킬 순서 skill과 유저들이 만든 스킬트리1를 담은 배열 skill_trees가 
//매개변수로 주어질 때, 가능한 스킬트리 개수를 return 하는 solution 함수를 작성해주세요.
public class SkillTree {
	public static void main(String[] args) {
		String skill = "CBD";
		String[] skill_tress = { "BACDE", "CBADF", "AECB", "BDA" };
		System.out.println(solution(skill, skill_tress));
	}

	// 스킬트리에서 스킬에 해당하는 문자만 골라냄=>skillCheck
	// skillCheck의 인덱스와 skill의 인덱스가 다르면 순서대로 스킬이 찍히지 않은 것이므로 answer--
	static public int solution(String skill, String[] skill_trees) {
		int answer = 0;
		for (int i = 0; i < skill_trees.length; i++) {
			Queue<String> skillQ = new LinkedList<String>();
			for (int j = 0; j < skill_trees[i].length(); j++) {
				if (skill.contains(skill_trees[i].substring(j, j + 1))) {
					skillQ.add(skill_trees[i].substring(j, j + 1));
				}
			}
			String skillCheck = "";

			for (String temp : skillQ) {
				skillCheck += temp;
			}

			for (int n = 0; n < skillCheck.length(); n++) {
				if (skillCheck.charAt(n) != skill.charAt(n)) {
					answer--;
					break;
				}
			}
			answer++;
		}
		return answer;
	}

}

//다른풀이 ==> Iterator 공부해보기
//class Solution {
//    public int solution(String skill, String[] skill_trees) {
//        int answer = 0;
//        ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
//        //ArrayList<String> skillTrees = new ArrayList<String>();
//        Iterator<String> it = skillTrees.iterator();
//
//        while (it.hasNext()) {
//            if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
//                it.remove();
//            }
//        }
//        answer = skillTrees.size();
//        return answer;
//    }
//}
