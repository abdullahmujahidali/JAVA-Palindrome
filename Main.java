import java.util.Scanner;

class Main {

static boolean isPalidnrome(int input ){

int palin = 0, left, temp;

temp = input;

while( input != 0 )

{ // this will get us the reversed number

left = input % 10;

palin = palin * 10 + left;

input = input/10;

}

if (temp == palin) // if they are equal means plaindrome

return true;

else

return false;

}

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

int num;

System.out.print("Enter a number: ");

num = sc.nextInt();

System.out.println("palindrome: "+ isPalidnrome(num));

}

}