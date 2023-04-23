package hashcode_examplle;

public class Employee {
    Integer id ;
    String name ;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if(obj==null || getClass() !=obj.getClass())
//            return false;
//        if(obj==this)
//            return true;
//        Employee employee =(Employee) obj;
//        return  (this.getId()==employee.getId());
//    }
}
