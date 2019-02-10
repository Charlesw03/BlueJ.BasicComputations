

public class IntegerPrinter {

    public String printIntegerAsBinary(int value){
        int x = value; 
        return Integer.toBinaryString(x);
    }

    public String printIntegerAsOctal(int value){
        int x = value;
        
        return Integer.toOctalString(x);
    }

    public String printIntegerAsHexadecimal(int value){
        int x = value;
        return Integer.toHexString(x);
    }

    public static void main(String[] args){

    }
}
