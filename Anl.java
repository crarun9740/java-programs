public class Anl {
    String name;
    int numbers;
    Anl(String name,int numbers){
        this.name=name;
        this.numbers=numbers;
    }
    public void info(){
        System.out.println("name of animal is:"+this.name);
        System.out.println("number of animals is:"+this.numbers);
    }
}
class Animal{
    public static void main(String[] args) {
        Anl a1=new Anl("ritika", 20);
        a1.info();       
    }
}
