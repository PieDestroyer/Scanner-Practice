import java.util.Scanner;

public class ScannerPractice {

	public static void main(String[] args) {
		Scanner puppy=new Scanner(System.in);
		
		int key;
		System.out.println("Whats your favorite interger?");
		key=puppy.nextInt();
		System.out.println("What a coincidence, " + key + " is my favorite number too!");
	}

}
