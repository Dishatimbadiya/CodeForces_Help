public static void print1D(int arr[]) {
    int n = arr.length;
    for (int i = 0; i < n; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println("");
}
public static void print2D(int arr[][]) {
    int n = arr.length;
    int m = arr[0].length;
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            System.err.print(arr[i] + " ");
        }
        System.out.println("");
    }
}
