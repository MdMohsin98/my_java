class mobile{
    String brand;
    String os;
    String type;
    public void calling() {
        System.out.println("This phone is used for calling.");

    }
    public void features(){
        System.out.println("Brand: " +this.brand);
        System.out.println("OS: " + this.os);
        System.out.println("Phone Type: " + this.type);
        System.out.println("======================");

    }
}


public class oops {
    public static void main(String[] args) {
        mobile mb = new mobile();
        mb.brand = "Apple";
        mb.os = "ios";
        mb.type = "screen touch";
        // mb.calling();   
        // mb.features();
        
        mobile mb2 = new mobile();
        mb2.brand = "OnePlus";
        mb2.os = "Android";
        mb2.type = "Screen Touch";
        // mb2.calling();
        mb2.features();
        mb.features();
    }
    
}
