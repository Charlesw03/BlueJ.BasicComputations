 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        //setting big integer variable to the value of 1
        BigInteger result = BigInteger.valueOf(1);
        //set up a for loop starting at 1, as long as i is less then or equal to 
        //value  increment by1 ex: 1*2*3*4*5
        for(int i = 1; i <= value; i++){
            //multiplying the value of result by the position of i
            // setting the multiplication value back into result.
            result = result.multiply(BigInteger.valueOf(i));
        }  
        // returning the end result-- factorial!
        return result;
        
    }

}
