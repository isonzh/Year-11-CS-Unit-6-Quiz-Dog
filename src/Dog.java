public class Dog {
    //instant Variables
    private int age;
    private String name;
    private String color;

    //constructor
    public Dog(){
        age = 0;
        name = "";
        color = "";}
    public Dog(int a, String n, String c){
        age = a;
        name = n;
        color = c;}
    public int getAge() {
        return age;}
    public String getName(){
        return name;}
    public String getColor() {
        return color;}
    public void setAge(int age) {
        this.age=age;}
    public void setColor(String color) {
        this.color=color;}
    public void setName(String name) {
        this.name=name;}
    private void addOneAge(){
        age+=1;}
    public int birthday(){
        addOneAge();
        return age;}

    public String toString(){
        return ("The dog is named " + name + " and is " + age + " years old. This dog is " + color + ".");
    }
}