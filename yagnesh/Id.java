package java_spring;

public class Id {
    int id;
    public void setId(int id) {
        this.id=id;
    }
//    void display(){
//        System.out.println("Student_id: "+id);
//    }
    int getId(){
        return id;
    }
    Id(){
        System.out.println("Id is created");
    }
}
