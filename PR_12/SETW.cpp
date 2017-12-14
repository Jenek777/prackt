/*
Write the program to test the input of the integer value 12345 and the 
floating-point value of 1.2345 in the fields of different widths.
*/

#include<iostream>
#include<iomanip>

using namespace std;

main(){
	float g = 1.2345, m = 12345;
	cout << setiosflags(ios::fixed);
	cout << setw(20) << g << endl;
	cout << setw(20) << m << endl;
	system("pause");
}
