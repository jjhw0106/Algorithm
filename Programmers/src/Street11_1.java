import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Street11_1 {
	public static void main(String[] args) throws IOException {
//		String[] phone_numbers = { "234-567-890", "444-444-444", "321-543-234" };
//		String[] phone_owners = { "Harry", "Nick", "Michael" };
		String[] phone_numbers = { "123-123-123" };
		String[] phone_owners = { "Walter" };
		String number = "111-111-111";
		System.out.println(solution(phone_numbers, phone_owners, number));
	}

	static public String solution(String[] phone_numbers, String[] phone_owners, String number) {

		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < phone_numbers.length; i++) {
			map.put(phone_numbers[i], phone_owners[i]);
		}

		if (map.get(number) == null) {
			return number;
		} else {
			return map.get(number);
		}
	}
}
