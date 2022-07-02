package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;

public class Silver_17478 {
	public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder ask = new StringBuilder();
        StringBuilder pre = new StringBuilder();
//        for (int i=0; i<n-1; i++) {
//        	pre.append("----");
//        }
		System.out.println(recurAsk(pre, ask, n));

	}

	static StringBuilder recurAsk(StringBuilder pre, StringBuilder ask, int num) {
		if (num == 1) {
			return ask;
		}

		ask.append(pre).append("재귀함수가 뭔가요?\n");
		ask.append(pre).append("잘 들어보게. 옛날옛날 한 산 꼭대기에 이세상 모든 지식을 통달한 선인이 있었어.\n");
		ask.append(pre).append("마을 사람들은 모두 그 선인에게 수많은 질문을 했고, 모두 지혜롭게 대답해 주었지.\n");
		ask.append(pre).append("그의 답은 대부분 옳았다고 하네. 그런데 어느 날, 그 선인에게 한 선비가 찾아와서 물었어.\n");
		return recurAsk(pre.append("----"), ask, num - 1);
	}

	static StringBuilder recurAnswer(StringBuilder pre, StringBuilder ask, int num) {
		
		if (num == 1) {
			return ask;
		}

		return ans.append("----").append(ask);
	}
}
