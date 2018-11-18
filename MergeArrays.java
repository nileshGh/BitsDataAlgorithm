class MergeArrays 
{ 
	/* Function to move m elements at the end of array mPlusF[] */
	void moveToEnd(int mPlusF[], int size) 
	{ 
		int i, j = size - 1; 
		for (i = size - 1; i >= 0; i--) 
		{ 
			if (mPlusF[i] != -1) 
			{ 
				mPlusF[j] = mPlusF[i]; 
				j--; 
			} 
		} 
	} 

	/* Merges array F[] of size n into array mPlusF[] 
	of size m+n*/
	void merge(int mPlusF[], int F[], int m, int n) 
	{ 
		int i = n; 
		
		/* Current index of i/p part of mPlusN[]*/
		int j = 0; 
		
		/* Current index of F[]*/
		int k = 0; 
		
		/* Current index of of output mPlusN[]*/
		while (k < (m + n)) 
		{ 
			/* Take an element from mPlusN[] if 
			a) value of the picked element is smaller and we have 
				not reached end of it 
			b) We have reached end of F[] */
			if ((i < (m + n) && mPlusN[i] <= F[j]) || (j == n)) 
			{ 
				mPlusN[k] = mPlusN[i]; 
				k++; 
				i++; 
			} 
			else // Otherwise take element from F[] 
			{ 
				mPlusN[k] = F[j]; 
				k++; 
				j++; 
			} 
		} 
	} 

	/* Utility that prints out an array on a line */
	void printArray(int arr[], int size) 
	{ 
		int i; 
		for (i = 0; i < size; i++) 
			System.out.print(arr[i] + " "); 

		System.out.println(""); 
	} 

	public static void main(String[] args) 
	{ 
		MergeArrays mergearray = new MergeArrays(); 
		
		/* Initialize arrays */
		int mPlusN[] = {2, 8, -1, -1, -1, 13, -1, 15, 20}; 
		int F[] = {5, 7, 9, 25}; 
		int n = F.length; 
		int m = mPlusN.length - n; 

		/*Move the m elements at the end of mPlusN*/
		mergearray.moveToEnd(mPlusN, m + n); 

		/*Merge F[] into mPlusN[] */
		mergearray.merge(mPlusN, F, m, n); 

		/* Print the resultant mPlusN */
		mergearray.printArray(mPlusN, m + n); 
	} 
} 

// This code has been contributed by Mayank Jaiswal 
