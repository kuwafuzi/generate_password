import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Sample1_1 {
	public static void main(String[] args) {
		
		// Initialize the list.
		List<String> list = new ArrayList<String>();
		
		// add number 0 to 9 to the list.
		list.add("0");
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("7");
		list.add("8");
		list.add("9");
		
		// add A to Z to the list and convert char to string.
		for(char charAtoZ = 'A'; charAtoZ <= 'Z'; charAtoZ++) {
			String s = Character.toString(charAtoZ);
			list.add(s);
		}
		
		// add a to z to the list and convert char to string
		for(char charatoz = 'a'; charatoz <= 'z'; charatoz++) {
			String s = Character.toString(charatoz);
			list.add(s);
		}
		
		// If you want to check the contents of the list, you will do this.
		//System.out.println(list);
		
		// Initialize random
		Random random = new Random();
		
		String password = "";
		
		// generate the password.
		for(int i = 0; i < 8; i++) {
			int value = random.nextInt(62);
			String getNum = list.get(value);
			//System.out.println(getNum);
			password += getNum;
		}
		
		System.out.println(password);
		
	}
}
