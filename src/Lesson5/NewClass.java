package lesson5;

public class NewClass {
    private String name;
    private Integer age;

    public NewClass() {
    }

    public NewClass(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
    
    
    
    
    
    public NewClass(String[] s){
        name = s[1];
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
    
    public int sq(int a, int b){
        return a * b;
    }
    
    public int sq(int a){
        return a * a;
    }
}
