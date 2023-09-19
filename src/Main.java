

class Main {
    public static void main(String[] args) {
        System.out.println("Randomize-In-Place Java Implementation");
        System.out.println("---------------------------------------");

        // declare input (an array of numbers)
        int arrayInts[] = new int[]{4, 7, 2, 0, 31, 20, 9, 46, -1, 11};

        // print original input for reference
        System.out.println("Input - Original Array: ");
        printArray(arrayInts);

        // loop through array of ints and swap each original index with a random (later) index
        for (int i = 0; i < arrayInts.length; i++){

            // generate a random Index between i and arrayInts.length - 1 (since starting index = 0, we decrease n by 1)
            int randomIndex = (int) (Math.random() * (arrayInts.length - i)) + i;

            // print iterator and random index to demonstrate algorithm working
            System.out.println(" ");
            System.out.println("Iterator i: " + i);
            System.out.println("Random(i,n) Index: " + randomIndex);

            // swap A[i] with A[Random(i,n)]
            int temp = arrayInts[randomIndex];
            arrayInts[randomIndex] = arrayInts[i];
            arrayInts[i] = temp;

            // print array again
            System.out.print("Current Array after we swap places of values " + arrayInts[randomIndex] + " and " + arrayInts[i] + ": ");
            printArray(arrayInts);
        }

        System.out.println(" ");
        // print output (permutation of array)
        System.out.println("Output - Randomized Array: ");
        printArray(arrayInts);
    }

    //method for printing array upon call
    static void printArray(int[] arrayInts){
        for (int j = 0; j < arrayInts.length; j++) {
            System.out.print(arrayInts[j] + " ");
        }
        System.out.println(" ");
    }

}