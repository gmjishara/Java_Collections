import java.util.*;
import java.lang.*;

class TreeSetSorting {
    public static void main(String[] args) {
        //default sorting order
        TreeSet ts=new TreeSet();
        ts.add(new Student("janith",100));
        ts.add(new Student("ishara",101));
        ts.add(new Student("nethmi",102));
        ts.add(new Student("pathma",103));
        System.out.println(ts);
        
        //customized sorting order
        TreeSet custom=new TreeSet(new MyComparator());
        custom.add(new Student("janith",100));
        custom.add(new Student("ishara",101));
        custom.add(new Student("nethmi",102));
        custom.add(new Student("pathma",103));
        System.out.println(custom);
    }
}

//Student class
class Student implements Comparable{
    String name;
    int id;
    
    Student(String name, int id){
        this.name=name;
        this.id=id;
    }
    public String toString(){
        return this.name+"-"+this.id;
    }
    
    public int compareTo(Object obj){
        Student s=(Student)obj;
        int id1=this.id;
        int id2=s.id;
        if(id1>id2){
            return +1;
        } else if(id1<id2){
            return -1;
        } else {
            return 0;
        }
    }
}

//Comparator class
class MyComparator implements Comparator{
    public int compare(Object obj1,Object obj2){
        Student s1=(Student)obj1;
        Student s2=(Student)obj2;
        
        Integer I1=s1.id;
        Integer I2=s2.id;
        
        return I2.compareTo(I1);
    }
}