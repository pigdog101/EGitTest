package TestSort;

public class inserSort {

	public static void main(String[] args) {
    int[] r ={2,1,4,6,3,8,5,0,7,9};
   //  new inserSort().insertSort(r);
    //new inserSort().bubbleSort(r);
    new inserSort().selectSort(r);
    for(int i = 0;i<10;i++) {
    	System.out.println(r[i]);
    }
	}
    public void insertSort(int[] r) {
    	int i,j,temp;
    	for(i = 1;i<r.length;i++) {
    		temp  = r[i];
    		for(j=i-1;j>=0&&temp<r[j];j--) {
    			r[j+1] = r[j];
    		}
    		r[j+1]=temp;
    	}
    }
    public void bubbleSort(int[] r) {
    	int temp=0;
    	boolean flag = true;
    	for(int i = 0;i<r.length&&flag==true;i++) {
    		flag = false;
    		for(int j=0;j<r.length-i-1;j++) {
    			if(r[j+1]<r[j]) {
    				temp = r[j];
    				r[j] = r[j+1];
    				r[j+1] = temp;
    				flag=true;
    			}
    		}
    	}
    }
    public void selectSort(int[] r) {
    	int temp;
    	int j = 0;
    	for(int i=0;i<r.length-1;i++) {
    		int min=i;
    		for( j = i+1;j<r.length;j++) {
    			if(r[j]<r[min]) {
    				min = j;
    			}
    			
    		}
    		if(min!=i) {
    		temp = r[min];
    		r[min] = r[i];
    		r[i] = temp;
    		}
    	}
    }
}
