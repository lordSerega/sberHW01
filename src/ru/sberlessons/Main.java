package ru.sberlessons;

public class Main {

    public static void main(String[] args) {
        int[] myList = new int[]{1,3,5,7,9};

        System.out.println(binarySearch(myList, 90));

    }

    public static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int height = list.length-1;

        while (low <= height) {
            int mid = (low + height) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                height = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return null;
    }

}
