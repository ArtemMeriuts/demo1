public class ddd { public static void main (String [] args) {
    Phone phone1 = new Phone("plastic" , "ips" , 128 , 3);
    Phone phone2 = new Phone("metal" , "lcd" , 512 , 6);
    Phone phone3 = new Phone("glass" , "oled" , 16 , 5);

    System.out.println(phone1.toString());
    System.out.println(phone2.toString());
    System.out.println(phone3.toString());
}
}
