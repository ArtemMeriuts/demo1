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





}

