package lrq;

public class StaSort {
       public static void doSort(Object ob[],StaCompare c){
    	   int N=ob.length;
    	   for(int i=0;i<N-1;i++){
    		   for(int j=0;j<N-1-i;j++){
    			   if(c.compare(ob[j],ob[j+1])>0){
    				   Object temp=ob[j];
    				   ob[j]=ob[j+1];
    				   ob[j+1]=temp;
    			   }
    		   }
    	   }
       }
}
