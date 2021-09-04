//package Gold;
//
//import java.util.Scanner;
//
//class Panda {
//	Scanner sc = new Scanner(System.in);
//	int[][] map;
//	int[][] pandaPos;
//	int n = sc.nextInt();
//
//	void mapInit() {
//		map = new int[n][n];
//		for (int i = 0; i < n; i++) {
//			for (int j = 0; j < n; j++) {
//				map[i][j] = sc.nextInt();
//			}
//		}
//	}
//
//	int dy[] = { -1, 0, 1, 0 };
//	int dx[] = { 0, -1, 0, 1 };
//
//	int solution(int[][] pandaPos, int curY, int curX) {
//		int nextY = curY;
//		int nextX = curX;
//
//		pandaPos[curY][curX] = 1;
//		for (int i = 0; i < 4; i++) {
//			nextY += dy[i];
//			nextX += dx[i];
//
//			if (nextY >= n || nextX >= n || nextY <= 0 || nextX <= 0) {
//				nextY -= dy[i];
//				nextX -= dx[i];
//				continue; 
//			}
//		}
//		if (map[curY][curX] < map[nextY][nextX]) {
//			pandaPos[curY][curX] = Math.max(pandaPos[curY][curX], solution(pandaPos, nextY, nextX) + 1);
//		}
//		nextY -= dy[i];
//		nextX -= dx[i];
//	}
//
//	void run() {
//		mapInit();
//		pandaPos = new int[n][n];
//		for (int i = 0; i < 4; i++) {
//			for (int j = 0; j < 4; j++) {
//
//			}
//		}
//	}
// 
//}
//
//public class Gold_1937 {
//
//	public static void main(String[] args) {
//		
//}
////class Node {
////	int yPos;
////	int xPos;
////	int value;
////	
////	public Node(int yPos, int xPos, int value) {
////		this.yPos = yPos;
////		this.xPos = xPos;
////		this.value = value;
////	}
////	
////	int check4Way() {
////		int life = 1;
////		
////		
////		if (life == 0)
////			return 0;
////		
////		else
////			return life + check4Way();
////	}
////}
////
////public class Gold_1937 {
////	
////	public static void main(String[] args) {
////		Scanner sc = new Scanner(System.in);
////		int n = sc.nextInt();
////		Node[] node = new Node[n * n];
////		
////		for (int i = 0; i < n; i++) {
////			for (int j = 0; j < n; j++) {
////				int value = sc.nextInt();
////				node[i] = new Node(i, j, value);
////			}
////		}
////		
////		
////	}
////}
////	Scanner sc = new Scanner(System.in);
////	int yPos = 0;
////	int xPos = 0;
////
////	int n;
////	int[][] map;
////
////	void mapInit() {
////		n = sc.nextInt();
////		map = new int[n][n];
////		for (int i = 0; i < n; i++) {
////			for (int j = 0; j < n; j++) {
////				map[i][j] = sc.nextInt();
////			}
////		}
////	}
////
////	void getPandaPos() {
////		int pandaPos = map[yPos][xPos];
////	}
////
////	void FourDirCheck(int yPos, int xPos) {
////		int pandaPos = map[yPos][xPos];
////		while (true) {
////			boolean check = false;
////			if (pandaPos < map[yPos + 1][xPos]) {
////				pandaPos = map[yPos + 1][xPos];
////			} else if (pandaPos < map[yPos][xPos + 1]) {
////				pandaPos = map[yPos][xPos + 1];
////			} else if (pandaPos < map[yPos - 1][xPos]) {
////				pandaPos = map[yPos - 1][xPos];
////			} else if (pandaPos < map[yPos][xPos - 1]) {
////				pandaPos = map[yPos][xPos + 1];
////			}
////		}
////	}
