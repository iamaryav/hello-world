// Program for Binary Search
// Binary search only works on sorted data
#include <iostream>
#include <conio.h>
using namespace std;
int BSearch(int arr[], int val, int low, int up)
{
	int mid;
	mid = (low + up) / 2;
	while (arr[mid] != val && low <= up) //conditions for finding data in logrithmic time polynomial
	{
		if (arr[mid] > val)
		{
			up = mid - 1;
		}
		else
		{
			low = mid + 1;
		}
		mid = (low + up) / 2;
	}
	if (arr[mid] == val)
		return (mid + 1);
	else
		return (0);
}
int main()
{
	int arr[30], val, size;
	cout << "Enter the size of array :";
	cin >> size;
	cout << "Enter Sorted Array :" << endl;
	for (int i = 0; i < size; i++)
	{
		cin >> arr[i];
	}
	cout << "Enter value for search :";
	cin >> val;
	int index = BSearch(arr, val, 0, size - 1);
	if (index)
	{
		cout << "Value found at position :" << index;
	}
	else
	{
		cout << "Value not foud";
	}
	getch();
	return (0);
}
