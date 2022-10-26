public class Praktikum9_Shalahuddin {

    public String atributBukanStatic = "Atribut Bukan Static";
    static String atributStatic = "Atribut Static";
    public void bukanStatic(){
        System.out.println("Method Non Static");
    }
    static void methodStatic(){
        System.out.println("Method Static");
    }
    public static void main(String[] args){
        Praktikum9_Shalahuddin Praktikum = new Praktikum9_Shalahuddin(); //object
      
        System.out.println(Praktikum.atributBukanStatic); //atribut non static
        System.out.println(atributStatic); //atribut static
        
        Praktikum.bukanStatic(); //method non static
        methodStatic(); //method static
        
        
    }
    
}
