public class Stmanag {

    int id ;
    String name;
    String dept;
    int year;

    //constructor
   Stmanag(){

   }
    Stmanag( int id,String name,String dept,int year){
       this.id=id;
       this.name=name;
       this.dept=dept;
       this.year=year;
    }

 public int add(){
       this.id=id;

     return year;
 }

    public void remove(){
        this.year=year;
        //return year;
    }

    @Override
    public String toString() {
        return "Stmanag{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
