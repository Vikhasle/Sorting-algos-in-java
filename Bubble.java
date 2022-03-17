class Bubble extends Sorter{
    void sort() {
        int i = n;
        while(i > 0){
            int k = 0;
            for(int j = 1; lt(j, n); j++)
                if (gt(A[j -1], A[j])){
                    swap(j -1, j);
                    k = j;
                }
            i = k;
        }
    }

    String algorithmName() {
        return "bubblesort";
    }
}

