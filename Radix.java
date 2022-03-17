class LSDRadix extends Sorter{
    int max(){
        int temp = A[0];
        for (int i =1; lt(i, n); i++)
            if(gt(A[i],temp))
                temp = A[i];
        return temp;
    }

    void copyArray(int[] A, int[] B){
        for (int i = 0; lt(i,A.length); i++)
            B[i]= A[i];
    }

    void sort(){
        int digit = 1;
        int largest = max();
        int[] temp = new int[A.length];
        copyArray(A, temp);
        while(gt(largest/digit,0)){
            int [] count = new int[10];
            for(int j =0; lt(j, 10); j++)
                count[j] = 0;
            for(int j =0; lt(j, n); j++)
                count[(A[j]/digit)%10]++;
            for(int j = 1; lt(j, 10); j++)
                count[j]+=count[j-1];
            for(int j = n-1; geq(j,0); j--)
                temp[--count[(A[j]/digit)%10]] = A[j];
            copyArray(temp, A);
            digit*=10;
        }
    }

    String algorithmName(){
        return "lsdradix";
    }
}
