public class Actor {
    private String name;
    private String gender;//M or F
    private int age;
    private String country;

Actor(){}

Actor(String name , String gender , int age ,String country){
    this.name=name;
    this.gender=gender;
    this.age=age;
    this.country=country;
}
public String getName(){
    return name;
}
public String getGender(){
    return gender;
}
public int getAge(){
    return age;
}
public String getCountry(){
    return country;
}

    public void setName(String name){this.name=name;}
    public void setGender(String gender){this.gender=gender;}
    public void setAge(int age){this.age=age;}
    public void setCountry(String country){this.country=country;}


 public void displayInfo(){
    System.out.println(name);
    System.out.println(gender);
    System.out.println(age);
    System.out.println(country);
 }

}
