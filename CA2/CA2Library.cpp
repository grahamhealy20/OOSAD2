/* COMPILATION INSTRUCTIONS 
	
g++ -c CA2Library.cpp -o CA2Library.o
ar rcs libCA2Library.a CA2Library.o
g++ main.cpp -L. -lCA2Library -o main

*/

// Authored by X00104195

#include "CA2Library.h"

/* Method to test if library has compiled correctly */
void testMethod() {
	std::cout << "In LIBRARY" << std::endl;
}

NumberResult findMax(int* array, int length) {
	std::cout << "In findMax method" << std::endl;
	NumberResult nr;
	int highest = array[0];
	int pos = 0;
	for(int i = 0; i < length; i++) {
		if(array[i] > highest) {
			highest = array[i];
			pos = i;		
		}
	}
	nr.data = highest;
	nr.position = pos;
	// Debugging cout
	//std::cout << "Largest Integer in array: " << highest << " found at position: " << pos << std::endl;
	return nr;	
}

NumberResult findMin(int* array, int length) {
	std::cout << "In findMin method" << std::endl;
	NumberResult nr;
	int lowest = array[0];
	int pos = 0;
	for(int i = 0; i < length; i++) {
		if(array[i] < lowest) {
			lowest = array[i];
			pos = i;
		}
	}
	nr.data = lowest;
	nr.position = pos;
	// Debugging cout
	//std::cout << "Lowest Integer in array: " << lowest << " found at position: " << pos << std::endl;
	return nr;
}

DataHolder genData() {
	std::cout << "In genData method" << std::endl;
	DataHolder holder;
	holder.one = 1;
	holder.two = 3.14;
	holder.three = false;
	holder.four = true;
	holder.five = 5;
	return holder;
}

MinMaxResult findMinMax(int* array, int length) {
	std::cout << "In findMinMax method" << std::endl;
	MinMaxResult mr;
	NumberResult result;

	result = findMin(array, length);
	mr.lowest.data = result.data;
	mr.lowest.position = result.position;

	result = findMax(array, length);
	mr.highest.data = result.data;
	mr.highest.position = result.position;
	return mr;
}
