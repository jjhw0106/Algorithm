package level3;

public class Main {
	public static void main(String[] args) {
		Network sol = new Network();
		int n = 3;
		int[][] computers = {{1,1,0},{1,1,0},{0,0,1}};
		sol.solution(n, computers);
	}
}
