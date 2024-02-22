import java.util.Scanner;

public class fichier {
    public static void main (String[]args){
 /* Exercice 10
Une boutique propose à ces clients, une réduction de 15% pour les montants d’achat supérieurs à 200 dh. Écrire un programme 
en Java permettant de saisir le prix total HT et de calculer le  montant TTC en prenant en compte la réduction et la TVA=20%.
      */
      // float prix_HT,prix_TTC;

      Scanner sc = new Scanner (System.in);

      System.out.println("Entrer le montant HT");
      double prix_HT =sc.nextFloat();

      double prix_TTC=(prix_HT+prix_HT)*0.2;
      if(prix_TTC>200){
       prix_TTC=(prix_TTC-prix_TTC)*0.15;   

       System.out.println("le montant TTC est :"+prix_TTC);

      }
     
     else{
       System.out.println("le montant TTC est :" +prix_TTC);  

      } 
      


    }
}