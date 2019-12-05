public class SelectionSort {
	 private int temp;

	/** Creates a new instance of SelectionSort */
    public SelectionSort() {
    }
    
    /* A simple SelectionSort algorithm
     * pre-condition: 
     * post-condition:
     * inputs:
     * outputs:
     * special conditions:
     */    
    public int[] basicSelectionSort(int[] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j= 0; j < x.length; j++) {
                if (x[i] < x[j]) {
                    temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                    /*for(int k = 0; k < x.length; k++) {
                    	System.out.print(x[k] + " ");
                    }
                    System.out.println("");*/
                }
            } // end of inner for loop
        } // end of outer for loop
        return x;
    } // end of basicSelectionSort method

}
