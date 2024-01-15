package dataTypesAndVariables;

public class dataTypes {
    public static void main(String[] args) {
        boolean myBool = true;
        myBool = false;
        byte myByte = 127; // I can assign only between -128 127
        short myShort = 5000; // 32600 or something. There is a limit
        int myInt = 7;
        long myLong = 111113737373773737L; // if byte, short and int cant keep the number then useit
        float myFloat = 20.4F; // if you give decimal then use F
        double myDouble = 42323949294242.323029302930293; // its for big floats
        char myChar = 'a';
        String myString = "3507";

        // Type Conversions
        String convertIntoString = Integer.toString(myInt);
        String anotherConversion = String.valueOf(myInt);
        String anotherMethod = "" + myInt;

        int stringToInt = Integer.parseInt(myString);
        int anotherToString = Integer.valueOf(myString);

        double convertIntToDouble = (double) myInt;

        System.out.println(convertIntToDouble);
    }

}

// Storaging Data in variabales

/*
 * Primitive
 * Numeric
 * Integer
 * Byte
 * short
 * int
 * long
 * Float
 * float
 * double
 * Non-Numeric
 * char
 * Boolean
 * Non-Primitive
 * Stirng
 * Array
 * classes
 * interfaces
 * user defined classes
 */