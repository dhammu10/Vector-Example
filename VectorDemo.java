import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Employee{
    int id;
    String name, address;
    Employee(int id, String name, String address){
        this.address = address;
        this.name = name;
        this.id = id;
    }

    void show(){
        System.out.println(id+" "+name+" "+address);
    }
    public int hashCode(){
        return id*10;
    }
    public boolean equals(Object o){
        Employee e = (Employee) o;
        if (this.id == e.id){
            return true;

        }
        else {
            return false;
        }
    }

    public String toString(){
        return  id+" "+name+" "+address;
    }
}
public class VecterDemo {
  public static void main(String [] args){

      Employee e = new Employee(1,"surya","GKP");
      Employee e1 = new Employee(2, "kuldeep","Gr.Noida");
      Employee e2 =  new Employee(3,"Tamal","Kolkatta");
      Employee e3 = new Employee(4,"Tamal", "Kolkatta");

      Set<Employee> s = new HashSet<>();
      s.add(e);
      s.add(e1);
      s.add(e2);
      s.add(e3);

      Iterator<Employee> i = s.iterator();
      while (i.hasNext()){
          Employee type = (Employee)i.next();
          type.show();
      }

  }
}
