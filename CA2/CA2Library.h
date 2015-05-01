/* COMPILATION INSTRUCTIONS 
	
g++ -c CA2Library.cpp -o CA2Library.o
ar rcs libCA2Library.a CA2Library.o
g++ main.cpp -L. -lCA2Library -o main

*/

// Authored by X00104195

#include <stdlib.h>
#include <string>
#include <iostream>

/* Struct to hold result of findMax and findMin methods */
struct NumberResult {
	int data;
	int position;
};

/* Struct to hold combined results of findMax and findMin */
struct MinMaxResult {
	//int lowest;
	//int highest;
	//int lowestPosition;
	//int highestPosition;
	NumberResult highest;
	NumberResult lowest;
};

/* Struct to hold generated data for genData method */
struct DataHolder {
	int one;
	float two;
	bool three;
	bool four;
	int five;
};

/* Test method to ensure library compiled correctly */
void testMethod();

/* Returns the largest integer in an array passed in by the calling code, and also the position it was found at. */
NumberResult findMax(int* array, int length);

/* Returns the smallest integer in an array passed in by the calling code, and also the position it was found at. */
NumberResult findMin(int* array, int length);

/* Generates data and returns it in a struct */
DataHolder genData();

/* Reutrns the compiled results of the findMin and findMax methods */
MinMaxResult findMinMax(int* array, int length);


