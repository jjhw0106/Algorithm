package level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class RankSearch {

	static class Info {
		String lang;
		String role;
		String pos;
		String food;
		int score;
	}

	public static void main(String[] args) throws IOException {
		String[] info = { "java backend junior pizza 150", "python frontend senior chicken 210",
				"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
				"python backend senior chicken 50" };
		String[] query = { "java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
				"- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };
		solution(info, query);
	}

	static int checkCondition(List<Info> infList, List<Info> qryList) {
		int pass = 0;

		List<Info> filteredList = new ArrayList<RankSearch.Info>();

		// 언어
		for (Info qry : qryList) {
			for (Info info : infList) {
				if (qry.lang.equals("-") || qry.lang.equals(info.lang)) {
					filteredList.add(qry);
					continue;
				}
			}
		}

		// role
		for (Info qry : qryList) {
			for (Iterator<Info> info = filteredList.iterator(); info.hasNext();)
				if (!qry.role.equals(info.next().role)) {
					filteredList.remove(qry);
					continue;
				}
		}
		System.out.println(filteredList.size());
		return pass;
	}

	static public int[] solution(String[] info, String[] query) throws IOException {
		int[] answer = {};
		List<Info> qryList = new ArrayList<RankSearch.Info>();
		List<Info> infList = new ArrayList<RankSearch.Info>();
		StringBuilder sb = new StringBuilder();
		String str = "";
		for (int i = 0; i < info.length; i++) {
			StringTokenizer st = new StringTokenizer(info[i], " ");
			Info inf = new Info();
			inf.lang = st.nextToken();
			inf.role = st.nextToken();
			inf.pos = st.nextToken();
			inf.food = st.nextToken();
			inf.score = Integer.parseInt(st.nextToken());

			infList.add(inf);

		}
		for (int i = 0; i < query.length; i++) {
			StringTokenizer st = new StringTokenizer(query[i], " ");
			Info qry = new Info();
			qry.lang = st.nextToken();
			st.nextToken();
			qry.role = st.nextToken();
			st.nextToken();
			qry.pos = st.nextToken();
			st.nextToken();
			qry.food = st.nextToken();
			qry.score = Integer.parseInt(st.nextToken());

			qryList.add(qry);
		}
		checkCondition(infList, qryList);
		return answer;
	}
}
