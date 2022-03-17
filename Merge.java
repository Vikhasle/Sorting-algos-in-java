class Merge extends Sorter{
    void merge(int lo, int hi){
        int mid = (lo+hi)/2;
        int j = lo;
        int k = mid;
        int[] B = new int[n];
        copyArray(A,B);
        for(int i = lo; lt(i,hi); i++){
            if(lt(j,mid) && (geq(k, hi) || leq(A[j], A[k]))){
                A[i]=B[j];
                swaps++;
                j++;
            }else{
                A[i]=B[k];
                swaps++;
                k++;
            }
        }
    }

    void split(int lo, int hi){
        if(geq(lo,hi))
            return;
        int mid = (lo+hi)/2;
        split(lo,mid);
        split(mid+1, hi);
        merge(lo,  hi);
    }

    void copyArray(int[] A, int[] B){
        for(int i = 0; lt(i,A.length); i++)
            B[i]=A[i];
    }

    void sort(){
        split(0, n);
    }

    String algorithmName(){
        return "mergesort";
    }
}
