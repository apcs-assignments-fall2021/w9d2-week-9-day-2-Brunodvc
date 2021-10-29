public class NinthGrader extends Student {
    // no more instance variables, bc all the ones needed are inherited by student
    //constructor w two parameters
public NinthGrader(String a, String b){
    super(a,b);
}
public NinthGrader(){
super("Bob", "Smith",2029);

}
public String doSomething() {
return "I am preparing for a Harkness discussion!";
}
public String toString(){
return this.getFirstName() + this.getLastname() + this.getClassYear() + "ninth grader";
   }

}
