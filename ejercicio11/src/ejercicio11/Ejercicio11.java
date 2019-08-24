package ejercicio11;


public class Ejercicio11 {

  
    public static void main(String[] args) {
       int a=0;
       for (int i=0; i<=100;i++){
           for (int j=1; j<=100;j++){
               if(i%j==0){
                   a++;
               }
              
           }
           if(a==2){
               
               System.out.println("Primo: "+i);
               a=0;
           }
           else{
               a=0;
           }
          
       }
    }
    
}
