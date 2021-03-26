package labs_examples.objects_classes_methods.examples;

public class Practice {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4};
        int currentSum = arr[0];

        for (int x = 1; x <= arr.length - 1; x++) {
            if (arr[x] <= currentSum) {
                System.out.println("false");
                break;
            }
            System.out.println(currentSum);
            currentSum += arr[x];
            }
        currentSum -= arr[arr.length- 1];
        System.out.println(arr[arr.length - 1]);

        if (currentSum < arr[arr.length - 1]) {
            System.out.println("true");
        }
    }
}

/*
Have the function Superincreasing(arr) take the array of numbers stored in arr and determine if the array forms a
superincreasing sequence where each element in the array is greater than the sum of all previous elements.
The array will only consist of positive integers. For example: if arr is [1, 3, 6, 13, 54] then your program should
return the string "true" because it forms a superincreasing sequence. If a superincreasing sequence isn't formed,
then your program should return the string "false"
 */