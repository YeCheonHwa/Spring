package week2;

public class Nullccheck {
	public static void main(String[] args) {
		
		String nullCk = null;
		
		if(nullCk == null || "".equals(nullCk)) {
			nullCk = "";
		}
		nullCk.length();
	}
}
