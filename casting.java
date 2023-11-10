public class casting {
    public static void main(String[] args) {
        // Casting
        // Converting one data type to another is called casting
        // Implicit conversion

        double volume = 100.30;
        // Adding integer value to the float value
        double fullVolume = volume + 10; 
        System.out.println(fullVolume);

        // Adding float value to an integer

        int v = 100;
        // int fv = v + 10.40; // This can't be added 
        
        // Here we should use 
        // Explicit conversion

        int fv = v+ (int)10.40;
        System.out.println(fv);

        float pie = 3.14f;
        // we can change the value of pi at any time like as 
        // pi = 3;
        // pi = 22/7;
        // To make the value of pi as universal constant
        // we can use final keyword
        // lets assume pie = pi

        final float pi = 3.14f;
        System.out.println(pi);
        // pi = 3.2222f; now it can't be changed after making pi as final variable
        

    }
    
}
