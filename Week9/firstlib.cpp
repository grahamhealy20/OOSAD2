#include "firstlib.h"

/* printGreeting: Prints a greeting message to the user */
void printGreeting() {
	std::cout << "Welcome to the C++ programming language!" << std::endl;
}

void weatherForecast(int ndays) {
	double high = 0;
	double low = 0;
	double predictedRainfall = 0;
	std::string windspeed = "Very Windy!";
	std::string wind_direction = "South-Easterly";
	if(ndays > 0 && ndays <= 3) {
	std::cout << "===== " << ndays << " DAY WEATHER FORECAST =====" << std::endl;
		for(int i = 0; i < ndays; i++) {
			high += 10;
			low -= 10;
			predictedRainfall += 1000;
			std::cout << "\nDAY: \t" << i << std::endl;
			std::cout << "HIGH: \t" << high << " degC" << std::endl;
			std::cout << "LOW: \t" << low << " degC" << std::endl;
			std::cout << "PREDICTED RAINFALL: \t:" << predictedRainfall << "ml" << std::endl;
			std::cout << "WINDSPEED: \t" << windspeed << std::endl; 
			std::cout << "WIND-DIRECTION :\t" << wind_direction << std::endl;
		}	
	} else {
		std::cout << "Incorrect number of days passed in. Please enter a valid number from 0  - 3 " << 			std::endl;
	}
}

void getMyLocation(std::string& location) {
	location = "Dublin";
}


