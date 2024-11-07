public class Variables {
    // declaration section for variables
    public int height;
    public String name;
    public double gasPrice;
    public boolean isRaining;
    public static void main(String[] args) {
       Variables myCode=new Variables();
    }

public Variables() {
    System.out.println("bye bye");
    System.out.println("hey hey");
    height=138;
    System.out.println("my height:" + height);
    name= "sara";
    System.out.println(name + " and " + height);
    gasPrice= .25;
    isRaining=true;
    System.out.println(name + " the gas is " + gasPrice + " and it is " +isRaining + " that it is raining");
}
}