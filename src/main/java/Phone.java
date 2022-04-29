public class Phone {

 public String caseMaterial;
 public String displayType;
 public Integer memory;
 public Integer displaySize;

 public Phone(String caseMaterial, String displayType, Integer memory, Integer displaySize) {
  this.caseMaterial = caseMaterial;
  this.displayType = displayType;
  this.memory = memory;
  this.displaySize = displaySize;
 }
 @Override
 public String toString() {
  return "Phone{" +
          "caseMaterial='" + caseMaterial + '\'' +
          ", displayType='" + displayType + '\'' +
          ", memory=" + memory +
          ", displaySize=" + displaySize +
          '}';
 }

 public static void main(String[] args) {
  Phone phone1 = new Phone("plastic", "ips", 128, 3);
  Phone phone2 = new Phone("metal", "lcd", 512, 6);
  Phone phone3 = new Phone("glass", "oled", 16, 5);


  System.out.println(phone1.toString());
  System.out.println(phone2.toString());
  System.out.println(phone3.toString());


 }

}