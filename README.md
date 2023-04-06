Create a class for processing 2D integer arrays.  You can assume that any array to be processed is rectangular (not jagged).  

The constructor should prompt the user for the number of rows and the number of columns, then input the ints from the keyboard.  

The class should containing the following methods:

displayArray()  print arrays with the ints in the proper position

displaySumRowColumn().  This method prints the sum of the values in each column and the sum of the values in each row.  Make sure users know what they are looking at.

transpose(). This method takes a two-dimensional array of integers M, representing a rectangular m × n matrix, and swaps the row and column of each element in M.  This method should return an n x m matrix 
For example: 

6 7 8 0		   6 3 1  
3 2 4 5  - >   7 2 5  
1 5 8 2 	   8 4 8  
    		   0 5 2  

findLargest().  Search the array for the largest element, and return its value and coordinates

