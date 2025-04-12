import java.util.Scanner;
public class TwoSum {

    public static void main (String...args) {
    
    Scanner sc = new Scanner (System.in);
    int[] nums = new int [4];

    for (int i = 0; i < nums.length; i++) {

        System.out.print ("Enter a number for position "+(i + 1)+" : ");
        nums[i] = sc.nextInt();
       
    }
	
	System.out.println();
    System.out.print ("Enter the TARGET number : ");
    int target = sc.nextInt();

	for (int j = 0; j < nums.length; j++) {

		int k = j + 1;
		
		while (k < nums.length) {
				
			if ((nums[j] + nums[k]) == target) {
			
				System.out.println (j+" "+k);
				break;
			
			} else {
			
				k++;
				
			}
		}

    }
	}
}