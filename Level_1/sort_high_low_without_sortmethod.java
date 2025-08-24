package Level_1;

import java.util.Scanner;

public class sort_high_low_without_sortmethod {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 5 numbers:");

        int highest = Integer.MIN_VALUE;// if there is array u can use arr[0]
        int s_highest = Integer.MIN_VALUE;//if there is array u can use arr[1]

        for (int i = 0; i < 5; i++) {
            int num = sc.nextInt();

            if (num > highest) {
                s_highest = highest;  // old highest becomes second highest
                highest = num;
            } else if (num > s_highest && num != highest) {
                s_highest = num;
            }
        }

        System.out.println("Highest is " + highest + " and Second highest is " + s_highest);
    }
}



//} else if (num > s_highest && num != highest) {

//Breakdown:
//🔹 num > s_highest
//Matlab: jo naya number mila hai, wo second highest se bada hona chahiye.
//👉 Example: Highest = 20, Second highest = 15, aur naya number = 18 → to ye second highest ban sakta hai.

//🔹 num != highest
//Matlab: ye number highest ke barabar nahi hona chahiye.
//👉 Example: Highest = 20, aur naya number bhi 20 hai → to hum second highest ko update nahi karenge.

