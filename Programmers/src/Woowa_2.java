import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Woowa_2 {
	public static void main(String[] args) throws IOException {
		String[] log = { "08:30", "09:00", "14:00", "16:00", "16:01", "16:06", "16:07", "16:11" };
		solution(log);
	}

	static public String solution(String[] log) {
		String answer = "";
		List<Integer> start = new ArrayList<Integer>();
		List<Integer> end = new ArrayList<Integer>();
		int repeat = log.length;

		for (int i = 0; i < repeat; i++) {
			int hToM = Integer.parseInt(log[i].split(":")[0]) * 60;
			int minutes = Integer.parseInt(log[i].split(":")[1]);
			if (i % 2 == 0) {
				start.add(hToM + minutes);
			} else {
				end.add(hToM + minutes);
			}
		}

		int time = 0;
		for (int i = 0; i < end.size(); i++) {
			int result = end.get(i) - start.get(i);
			if (result >= 5) {
				if (result > 105) {
					result = 105;
				}
				time += result;
			}
		}
		
		return answer=sToTime(time);
	}
	static String sToTime(int time) {
		String h ="";
		String m ="";
		if(time/60<10) {
			h = "0"+String.valueOf(time/60);
		}else {
			h = String.valueOf(time/60);
		}
		if(time%60<10) {
			m = "0"+String.valueOf(time%60);
		}else {
			m = String.valueOf(time%60);
		}
		return (h+":"+m);
	}
}
