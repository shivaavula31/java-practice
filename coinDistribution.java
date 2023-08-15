import java.util.Scanner;

public class coinDistribution
{
    
    static void solution(int number)
    {
        int no_of_fives = (number - 4)/5;
        int no_of_one,no_of_two;
    
        if ((number-5*no_of_fives)%2 == 0)
            no_of_one = 2;
        else
            no_of_one = 1;
    
        no_of_two = (number - 5*no_of_fives - no_of_one)/2 ;
        System.out.print(no_of_one+no_of_two+no_of_fives+" "+no_of_fives+" "+no_of_two+" "+no_of_one);
}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		solution(number);
	}
}