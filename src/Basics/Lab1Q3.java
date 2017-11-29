package Basics;

public class Lab1Q3 {

	public static void main(String[] args) {
		// 3 functions that take in an integer array and return the min, avg, max values
		
		// function #1
		// Sort the values into a new array and report the first and last entry + avg
		
		// function #2
		// Set default min and max values to position 0 in the array, then
		// loop through the array and compare next position to min, max, storing
		// a new value if found.  Also report the average
		
		// function #3
		// Compare adjacent positions in the high scores array and if the lower score is not in the lower position,
		// then swap them.  Continue until all scores are in order.
		
		System.out.println("Here are my top 6 scores in random order:");
		int[] MyHighScores = new int[]{1000000,2500000,300000,26875,88000010,2500};
		for (int i = 0; i < MyHighScores.length; ++i) {
			System.out.println("High score in position " + i + " is " + MyHighScores[i]);
		}
		System.out.println("************************************");
		
		// function 1:
		// This function will create a new array and place the scores into that array
		// ordered from the lowest score in the first position to the highest score in the final position.
		
		System.out.println("Function one:");
		
		System.out.println("I'm failing to come up with the algoritm I want for this function");
		System.out.println("I want to have nested for statements that run from 0 to length of my array.");
		System.out.println("If the value in position zero is less than the values of in all other positions, keep it");
		System.out.println("Else replace it with the lowest value in all positions.");
		System.out.println("if the value in positions 1-5 is greater than the value in position 0, but less than the remaining");
		System.out.println("positions, then keep it, else replace it with the lowest value in all remaining positions.");
		
		
		int sumFunctionOne = 0;
		for (int i = 0; i < MyHighScores.length; ++i) {
			sumFunctionOne += MyHighScores[i];
		}
		int avgFunctionOne = sumFunctionOne / MyHighScores.length;
		System.out.println("Average of MyHighScores is " + avgFunctionOne);
		int LowestScoreMethodOne = MyHighScores[0];
		for (int i = 0; i < MyHighScores.length; ++i) {
			System.out.println("Lowest score found is " + LowestScoreMethodOne); 
		}
		System.out.println("************************************");
		
		
		// function 2:
		// This function will start by assuming both a minimum and maximum high score equal to the first value in the original array. 
		// It will then check these every score stored in our array and update the minimum and maximum values based the comparisons.
		System.out.println("Function two:");
		int lowestFunctionTwo = MyHighScores[0];
		int highestFunctionTwo = MyHighScores[0];
		int totalScoresFunctionTwo = 0;
		int averageScoreFunctionTwo = 0;
		int i = 0;
		while (i < MyHighScores.length) {
			if (lowestFunctionTwo >= MyHighScores[i]) {
				lowestFunctionTwo = MyHighScores[i];
			}
			if (highestFunctionTwo <= MyHighScores[i]) {
				highestFunctionTwo = MyHighScores[i];
			}
			totalScoresFunctionTwo += MyHighScores[i];
			++i;
		}
		
		averageScoreFunctionTwo = totalScoresFunctionTwo / MyHighScores.length;
		System.out.println("Lowest score found by function two is: " + lowestFunctionTwo);
		System.out.println("Highest score found by function two is: " + highestFunctionTwo);
		System.out.println("Average score found by function two is: " + averageScoreFunctionTwo);
		System.out.println("************************************");
		
		
		// function 3:
		// compare the first two positions in our initial high scores array. If the lower score does not occupy the lower
		// position, then swap them.  Repeat, comparing each adjacent position. Process as many times as there are positions.
		// We'll use a copy of the array just to ensure we don't corrupt our data.
		
		System.out.println("Function three:");
		int[] HighScoresDuplicateArray = new int[6];
		for (int j = 0; j < MyHighScores.length; ++j) {
			HighScoresDuplicateArray[j] = MyHighScores[j];
		}
		
		for (int m = 0; m < HighScoresDuplicateArray.length; ++ m) {
		for (int l = 0; l < HighScoresDuplicateArray.length - 1; ++l) {
			int tempNumber = 0;
			if (HighScoresDuplicateArray[l+1] < HighScoresDuplicateArray[l]) {
				tempNumber = HighScoresDuplicateArray[l];
				HighScoresDuplicateArray[l] = HighScoresDuplicateArray[l+1];
				HighScoresDuplicateArray[l+1] = tempNumber;
			}
		}
		}
		int ScoresTotal = 0;
		for (int p = 0; p < HighScoresDuplicateArray.length; ++p) {
			ScoresTotal += HighScoresDuplicateArray[p];
		}
		int ScoresAverage = ScoresTotal/(HighScoresDuplicateArray.length);
		System.out.println("The lowest score found by function 3 is " + HighScoresDuplicateArray[0]);
		System.out.println("The highest score found by function 3 is " + HighScoresDuplicateArray[5]);
		System.out.println("The average score found by function 3 is " + ScoresAverage);
		
	
	}

}
