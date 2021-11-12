package Silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Silver_Recursion_5568 {
	static int[] arr;
	static HashSet<String> set;
	static boolean[]visited;
	static int n;
	static int k;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		k = Integer.parseInt(br.readLine());
		set = new HashSet<String>();
		arr = new int[n];
		visited = new boolean[n];
		
		for(int i=0; i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		dfs("",k);
		System.out.println(set.size());
	}

	public static void dfs(String value, int remain) {
		if(remain == 0) {
			set.add(value);
			value="";
			return;
		}
		for(int i=0; i<arr.length;i++) {
			if(visited[i]==true	) continue;
			visited[i]=true;
			dfs(value+arr[i],remain-1);
			visited[i]=false;
		}
	}
}
