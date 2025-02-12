public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static String evenOrOdd(int arg) {
		return arg % 2 == 0 ? "Even" : "Odd";
	}

	public static String teacherOrStudent(String arg) {
		return arg.equals("Kalisz") ? "Teacher" : "Student";
	}

	public static int fartherFromZero(int arg) {
		if (arg > 0) {
			return arg - 1;
		} 
		else if (arg < 0) {
			return arg + 1;
		} else {
			return arg;
		}
		}
	}

	public static String isFive(int arg) {
		return arg == 5 ? "The number is Five" : "The number is not Five";
	}

	public static String positiveOrNegative(double arg) {
		return arg > 0 ? "Positive" : "Negative";
	}

	public static String highOrLow(int arg) {
		return arg > 100 ? "High" : "Low";
	}

	public static String isHello(String arg) {
		return arg.equals("Hello") ? "The word is Hello" : "The word is not Hello";
	}
	//Write your functions here

}
/*
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-2972f46106e565e64193e422d61a12cf1da4916b45550586e14ef0a7c637dd04.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=18166302)
# Instructions  

  ## Questions

1. Create a function called _evenOrOdd_.  This function will accept an integer as a parameter and return the word "Even" when the number is even, and will return the word "Odd" when odd.

2. Create a function called _teacherOrStudent_.  This function will accept a String as a parameter and return the word "Teacher" when the word is "Kalisz", and will return "Student" if it is anythinge else.

3. Create a function called _fartherFromZero_.  This function will accept an integer as a parameter and increase by 5 if it is positive, and decrease it by 5 if it is negative.  If it is zero, simply return the 0.

4. Create a method called isFive().</br>
The method will take in a single integer as a parameter.</br>
If the integer is 5, return "The number is Five"</br>
Otherwise, return "The number is not Five"</br>
Use an else statement.</br>
</br>

5. Create a method called positiveOrNegative().</br>
The method will take in a single double as a parameter.</br>
If the double is positive, return "Positive"</br>
Otherwise, return "Negative" (This includes 0)</br>
Use an else statement</br>
</br>

6. Create a method called highOrLow().</br>
The method will take in a single integer as a parameter.</br>
If the integer is above 100, return "High"</br>
Otherwise, return "Low"</br>
Use an else statement</br>
</br>

7. Create a method called isHello().</br>
The method will take in a single String as a parameter.</br>
If the String is "Hello", return "The word is Hello"</br>
Otherwise, return "The word is not Hello"</br>
Use an else statement</br>
*/