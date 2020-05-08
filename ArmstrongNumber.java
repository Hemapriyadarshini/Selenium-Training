package Week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int num = 153, number, temp, result = 0;

        number = num;
        while (number != 0)
        {
            temp = number % 10;
            result = result + temp*temp*temp;
           number /= 10;
        }

        if(result == num)
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

	}

}
