#include "firstlib.h"

int main() {
	printGreeting();
	weatherForecast(2);
	std::string name = "Graham";	
	getMyLocation(name);
	std::cout << "Location: \t" << name << std::endl;
	return 0;
}
