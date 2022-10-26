public class static_&non_static_method&atribute {

    public String atributBukanStatic = "Atribut Bukan Static";
    static String atributStatic = "Atribut Static";
    public void bukanStatic(){
        System.out.println("Method Non Static");
    }
    static void methodStatic(){
        System.out.println("Method Static");
    }
    public static void main(String[] args){
        static_&non_static_method&atribute Praktikum = new static_&non_static_method&atribute(); //object
      
        System.out.println(Praktikum.atributBukanStatic); //atribut non static
        System.out.println(atributStatic); //atribut static
        
        Praktikum.bukanStatic(); //method non static
        methodStatic(); //method static
        
        
    }
    
}
