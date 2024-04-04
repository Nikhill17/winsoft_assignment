public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;  
        int n = Y.length; 

        int i = m - n - 1;
        int j = n - 1;
        int k = m - 1;

        while (i >= 0 && j >= 0) {
            if (X[i] > Y[j]) {
                X[k] = X[i];
                i--;
            } else {
                X[k] = Y[j];
                j--; class MergeArrays {

                    public static void mergeArrays(int[] arrayX, int[] arrayY) {
                        int lengthX = arrayX.length;
                        int lengthY = arrayY.length;
        
                        int index = lengthX - 1;
                        for (int i = lengthX - 1; i >= 0; i--) {
                            if (arrayX[i] != 0) {
                                arrayX[index] = arrayX[i];
                                index--;
                            }
                        }

                        int pointerX = index + 1;
                        int pointerY = 0;
                        int mergeIndex = 0;
                        while (mergeIndex < lengthX) {
                            if (pointerY < lengthY && (pointerX >= lengthX || arrayY[pointerY] < arrayX[pointerX])) {
                                arrayX[mergeIndex] = arrayY[pointerY];
                                pointerY++;
                            } else {
                                arrayX[mergeIndex] = arrayX[pointerX];
                                pointerX++;
                            }
                            mergeIndex++;
                        }
                    }
                
                    public static void main(String[] args) {
                        int[] arrayX = {0, 2, 0, 3, 0, 5, 6, 0, 0};
                        int[] arrayY = {1, 8, 9, 10, 15};
                
                        mergeArrays(arrayX, arrayY);

                        for (int num : arrayX) {
                            System.out.print(num + " ");
                        }
                    }
                }
            }
            k--;
        }

        while (j >= 0) {
            X[k] = Y[j];
            j--;
            k--;
        }
    }

    public static void main(String[] args) {
        int[] X = {0, 2, 0, 3, 0, 5, 6, 0, 0};
        int[] Y = {1, 8, 9, 10, 15};

        mergeArrays(X, Y);

        System.out.print("Merged Array: ");
        for (int num : X) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
