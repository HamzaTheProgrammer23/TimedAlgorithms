//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] testArr1 = {1,3,5,7,9};
        int[] testArr2 = {1,2,3};
        int[] testArr3 = {1};

        System.out.println("Test Array 1");
        printArray(testArr1);
        System.out.println("Test Array 2");
        printArray(testArr2);
        System.out.println("Test Array 3");
        printArray(testArr3);

    }
        public static void printArray(int [] arr){
        for (int i = 0; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}