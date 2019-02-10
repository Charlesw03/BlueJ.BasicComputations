 


public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int highest = 0;
        
          
        for(int i=0; i < integers.length-1; i++){
             if(integers[0] > integers[1] && integers[0] >  integers[2]){
                highest = integers[0];
                }
            
            //if(integers[i] >integers[i+1] )
             //highest = integers[i];
            }
        
        
        return highest;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int highestNumber = 0;
        
        for(int i = 0; i < integers.length - 1;i++) {
             highestNumber = Math.max(integers[i],integers[i+1]);
             
        }
        
        return highestNumber;
    }
}
