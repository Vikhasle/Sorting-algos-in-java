class Insertion extends Sorter {
    void sort() {
        for(int i = 1; lt(i, n); i++)
            for(int j = i; gt(j,0) && lt(A[j],A[j-1]); j--)
                swap(j-1, j);
    }

    String algorithmName() {
        return "insertion";
    }
}
