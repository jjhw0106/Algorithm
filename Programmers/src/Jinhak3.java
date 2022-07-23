
public class Jinhak3 {
	public String solution(String encrypted_text, String key, int rotation) {
		String answer = "";

		// 1. Reverse Rotation
		String preRotated = reverseRotation(encrypted_text, rotation);

		// 2. Decrypt
		String[] intKey = decryptKey(key);
		answer = decrypt(preRotated, intKey);

		return answer;
	}

	public String reverseRotation(String plain, int rotation) {

		if (rotation >= 0) {
			for (int i = 0; i < rotation; i++) {
				char temp = plain.charAt(0);
				plain = plain.substring(1) + temp;
			}
		} else {
			for (int i = 0; i < -1*rotation; i++) {
				char temp = plain.charAt(plain.length() - 1);
				plain = temp + plain.substring(0, plain.length() - 1);
			}
		}
		System.out.println("plain: "+plain);
		return plain;
	}

	public String[] decryptKey(String key) {
		String[] stoi = new String[key.length()];

		int temp = 0;

		for (int i = 0; i < key.length(); i++) {
			temp = (int) key.charAt(i) - 96;
			stoi[i] = String.valueOf(temp);
		}
		for (String string : stoi) {
			System.out.println("key: " + string);
		}
		return stoi;
	}

	public String decrypt(String preRotated, String[] intKey) {
		String decryptedText = "";

		for (int i = 0; i < preRotated.length(); i++) {
			int temp = preRotated.charAt(i) - Integer.parseInt(intKey[i]);
			if (temp <= 96) {
				temp += 26;
			}
			System.out.println("temp:"+temp);

			decryptedText += (char) temp;
		}
		System.out.println("decrypted:" +decryptedText);
		return decryptedText;
	}
//	public String decryptKey(String key) {
//		String stoi = "";
//		int temp = 0;
//		
//		for (int i = 0; i < key.length(); i++) {
//			temp = (int) key.charAt(i) - 96;
//			stoi += temp;
//		}
//		System.out.println("key: "+stoi);
//		return stoi;
//	}
//	public String decrypt(String preRotated, String[] intKey) {
//		String decryptedText = "";
//		
//		for (int i = 0; i < preRotated.length(); i++) {
//			int temp = preRotated.charAt(i) - Integer.parseInt(intKey.substring(i, i + 1));
//			if(temp < 96) {temp+=26;}
//			System.out.println(temp);
//			
//			decryptedText+=(char)temp;
//		}
//		System.out.println(decryptedText);
//		return decryptedText;
//	}
}
