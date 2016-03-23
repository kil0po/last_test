public class qsort {
public static int[] array = {9,8,7,6,5,4,3,2,1};;
	
	public static void qSort(int l, int r) {
        int i = l;
        int j = r;
        int x = array[l];
        while (i <= j) {
            while (array[i] < x) {
                i++;
            }
            while (array[j] > x) {
                j--;--
            }
            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;1
                j--;
            }
        }
        System.out.println("===================");
        for(int ii=0;ii<9;ii++){
        	
			System.out.print(array[ii]);
        }
        System.out.println();
        
        if (l<j){
            qSort( l, j);
        }
        if(i<r){
            qSort( i, r);
        }
        
    }
	
	
	public static void main(String[] args) {
		
		qSort(0, 8);

		//for(int ii=0;ii<9;ii++)
		//	System.out.println(array[ii]);
	}


}
