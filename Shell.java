class Shell extends Sorter{

    void sort(){
        int [] gaps = {701, 301, 132, 57, 23, 10, 4, 1};  // Ciura (2001) gap seq
        for(int gap : gaps){
            for(int i = gap; lt(i,n); i++){
                int j;
                int temp = A[i];
                for(j = i; geq(j, gap) && gt(A[j-gap], temp); j-=gap){
                    A[j] = A[j-gap];
                    swaps++;
                }
                A[j] = temp;
            }
        }
    }

    String algorithmName(){
        return "shellsort";
    }
}
