package level1;

public class Kakao_RecommendNewID {
	public static void main(String[] args) {
		String src = "slkdfjeij";
		src = src.toLowerCase();
		src = src.replaceAll("[^a-z0-9-_.]", "");
		src = src.replaceAll("[.]{2,}", ".");

	}

}
