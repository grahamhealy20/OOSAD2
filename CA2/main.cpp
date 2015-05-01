/* COMPILATION INSTRUCTIONS 
	
g++ -c CA2Library.cpp -o CA2Library.o
ar rcs libCA2Library.a CA2Library.o
g++ main.cpp -L. -lCA2Library -o main

*/

// Authored by X00104195

#include "CA2Library.h"

int main() {
	// Test to see if library has compiled correctly.
	testMethod();

	//int array[7] = {9, 2, 3, 10, 5, 6, 7};
	//int len = 7;

	//int array[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	//int len = 10;
	
	int array[11] = {1, 2, 3, 4, 5, 100, 5, 4, 3, 2, 1};
	int len = 11;
	
	std::cout << "========== Welcome to CA2 ==========" << std::endl;
	std::cout << "Array Contents: ";
	for(int i = 0; i < len; i++) {
		std::cout << array[i] << " ";
	}

	std::cout << " Array Length: " << len << std::endl;
	std::cout << "====================" << std::endl;
	std::cout << "Question 1" << std::endl;
	NumberResult max = findMax(array, len);
	std::cout << "Maximum Number: " << max.data << " at position: " << max.position << std::endl;

	std::cout << "Question 2" << std::endl;
	NumberResult min = findMin(array, len);
	std::cout << "Minimum Number: " << min.data << " at position: " << min.position << std::endl;
		
	std::cout << "Question 3" << std::endl;
	DataHolder holder = genData();
	std::cout << "Int value: " << holder.one << " Float value: " << holder.two << " Bool value: " << holder.three << " Bool value: " << holder.four << " Int value " << holder.five << std::endl;

	std::cout << "Question 4" << std::endl;
	MinMaxResult minMax = findMinMax(array, len);
	std::cout << "Minimum Number: " << minMax.lowest.data << " at position: " << minMax.lowest.position << std::endl;
	std::cout << "Maximum Number: " << minMax.highest.data << " at position: " << minMax.highest.position << std::endl;
}
