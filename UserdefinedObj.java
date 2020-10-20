import java.util.ArrayList;
import java.util.Iterator;

public class userDefinedObjects {
    public static void main(String args[]){  
     Student s1=new Student(101,"charitha",23);  
     Student s2=new Student(102,"vihitha",21);  
     Student s3=new Student(103,"manasa",25);  
     ArrayList<Student> al=new ArrayList<Student>();  
     al.add(s1);//
     al.add(s2);  
     al.add(s3);    
     Iterator itr=al.iterator();  
     while(itr.hasNext()){  
       Student st=(Student)itr.next();  
       System.out.println(st.rollno+" "+st.name+" "+st.age);  
     }  
    }  
   }
