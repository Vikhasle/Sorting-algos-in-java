class Quick extends Sorter {

    int partion(int lo, int hi){
        int p = A[(lo + hi)/ 2];
        int i = lo -1;
        int j = hi + 1;
        while(lt(i,j)){
            while(lt(A[++i],p));
            while(gt(A[--j], p));
            if(leq(j,i))
                return j;
            swap(i,j);
        }
        return j;
    }

    void quicksort(int lo, int hi){
        if(geq(lo, hi))
            return;
        int p = partion(lo,hi);
        quicksort(lo, p);
        quicksort(p+1, hi);
    }

    void sort() {
        quicksort(0, n-1);
    }

    String algorithmName() {
        return "quick";
    }
}
