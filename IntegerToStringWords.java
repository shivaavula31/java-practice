import java.util.*;
public class IntegerToStringWords {
    private static final String[] units = {
        "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve", "thirteen", "fourteen",
        "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"
    };
    
    private static final String[] tens = {
        "", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"
    };
    
    private static String convertLessThanOneThousand(int number) {
        String current;
        
        if (number % 100 < 20) {
            current = units[number % 100];
            number /= 100;
        } else {
            current = units[number % 10];
            number /= 10;
            
            current = tens[number % 10] + current;
            number /= 10;
        }
        
        if (number == 0) return current;
        
        return units[number] + " hundred" + (current.isEmpty() ? "" : " " + current);
    }
    
    public static String convertNumberToString(int number) {
        if (number == 0) {
            return "zero";
        }
        
        String result = "";
        
        if (number < 0) {
            result = "minus ";
            number = Math.abs(number);
        }
        
        if (number < 1000) {
            result += convertLessThanOneThousand(number);
        } else {
            int count = 0;
            
            while (number > 0) {
                if (number % 1000 != 0) {
                    String current = convertLessThanOneThousand(number % 1000);
                    result = current + getSuffix(count) + (result.isEmpty() ? "" : " " + result);
                }
                number /= 1000;
                count++;
            }
        }
        
        return result.trim();
    }
    
    private static String getSuffix(int count) {
        String[] suffixes = {"", "thousand", "million", "billion", "trillion"};
        return suffixes[count];
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number = sc.nextInt();
        String words = convertNumberToString(number);
        System.out.println(number + " in words: " + words);
    }
}
