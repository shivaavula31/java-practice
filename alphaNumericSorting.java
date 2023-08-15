import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class alphaNumericSorting {
	
	static void getAnswer(ArrayList words,int[] numbers) {
		words.sort(null);
		Arrays.sort(numbers);
		for(int i=0;i<numbers.length;i++)
			System.out.print(words.get(i)+" "+numbers[i]+" ");
		System.out.println();
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		ArrayList<String> words=new ArrayList<String>();
		int i=0;
		int t=sc.nextInt();
		sc.nextLine();
		for(i=0;i<t;i++) {
			String[] text=sc.nextLine().split(" ");
			int numbers[]=new int[text.length/2];
			int count=0;
			for(int j=0;j<text.length-1;j=j+2) {
				words.add(text[j]);
				numbers[count]=Integer.parseInt(text[j+1]);
				count++;
			}

			getAnswer(words, numbers);
			words.clear();
		}
	}

}