//write a program for function call itself by recursive binary search
#include<iostream>
using namespace std;

int recursiveBinarySearch(int arr[], int left, int right, int key) {
	if (left > right) {
		return -1;
	}

	int mid = left + (right - left) / 2;

	if (arr[mid] == key) {
		return mid;
	}

	if (key < arr[mid]) {
		return recursiveBinarySearch(arr, left, mid - 1, key);
	}

	return recursiveBinarySearch(arr, mid + 1, right, key);
}

int main() {
	int arr[] = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
	int n = sizeof(arr) / sizeof(arr[0]);
	int key;

	cout << "Enter element to search: ";
	cin >> key;

	int result = recursiveBinarySearch(arr, 0, n - 1, key);

	if (result != -1) {
		cout << "Element found at index " << result << endl;
	} else {
		cout << "Element not found" << endl;
	}

	return 0;
}

