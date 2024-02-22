import java.util.Scanner;

public class test {
    public static void main (String[]args){


        Scanner sc = new Scanner (System.in);

System.out.println("Taper un nombre");
int mois =sc.nextInt();
  switch (mois) {
    case 1: System.out.println("janvier");
        
        break;

        case 2: System.out.println("fevrier");
        
        break;

        case 3: System.out.println("mars");
        
        break;

        case 4: System.out.println("avril");
        
        break;

        case 5: System.out.println("mai");
        
        break;

        case 6: System.out.println("juin");
        
        break;

        case 7: System.out.println("juillet");
        
        break;

        case 8: System.out.println("aout");
        
        break;

        case 9: System.out.println("septembre");
        
        break;

        case 10: System.out.println("octobre");
        
        break;

        case 11: System.out.println("novembre");
        
        break;

        case 12: System.out.println("decembre");
        
        break;

        default: System.out.println("le numero ne correspondant a aucun mois ");
        break;
  
    
  }
    }
}