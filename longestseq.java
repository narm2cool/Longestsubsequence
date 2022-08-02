package longestsubsequence;

class longestseq{
  
    static int list(int arr[], int n)
    {
        int list[] = new int[n];
        int i, j, max = 0;
        for (i = 0; i < n; i++)
            list[i] = 1;
        for (i = 1; i < n; i++)
            for (j = 0; j < i; j++)
                if (arr[i] > arr[j] && list[i] < list[j] + 1)
                    list[i] = list[j] + 1;
        for (i = 0; i < n; i++)
            if (max < list[i])
                max = list[i];
        return max;
    }
    public static void main(String args[])
    {
        int arr[] = { 5,3,2,7,0,10,8,33};
        int n = arr.length;
        System.out.println("Length of lis is " + list(arr, n) + "\n");
    }
}