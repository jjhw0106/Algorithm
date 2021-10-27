import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class NHN_1 {
	public static void main(String[] args) {
	}

	private static void solution(int numOfOperation, Operation[] operations) {
		String operation = operations.;
	}
	
	private static class InputData {
		int numOfOperation;
		Operation[] operations;
	}

	private static class Operation {
		OperationType type;
		Integer value;

		public Operation(OperationType type, Integer value) {
			this.type = type;
			this.value = value;
		}
	}
	
	private static enum OperationType{
		branch,merge;
	}
}
