/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vectorhelper;

/**
 *
 * @author khaoukha
 */
public class VectorHelper {

         /**
	 * @param tableau : un tableau des entiers pour le trier
         * ex: si tableau ={2,8,4,-3} il sera en sortie {-3,2,4,8}
         * @return il renvoit le tableau de l'entrée trié
	 */
    public  int[] triBulle(int tableau[])
        {
        int longueur=tableau.length;
        boolean inversion;
        int swap;
        
        do
            {
            inversion=false;

            for(int i=0;i<longueur-1;i++)
                {
                if(tableau[i]>tableau[i+1])
                    {
                    swap=tableau[i];
                    tableau[i]=tableau [i+1];
                    tableau[i+1]=swap;
                    inversion=true;
                    }
                }
             }
        while(inversion);
        return tableau;
        }

    
    
    	/**
	 * @param tableau : un tableau en entrée qui contient des entiers
	 * @return cc'est un tableau de taille 2 ,il contient dans ça 1 ére case 
         * le max et dans la 2 ème cas le min
         * ex: si tableau ={10,57,-3} alors la méthode renvoit un tableau ={57,-3}
	 */
    
    /**
	 * @param tableau
	 * @return
	 */

    public int [] min_max_tab(int tableau[]){
        //cette methode renvoit dans un tableau de taille 2 
        //le max(dans la 1 ére case du tableau) et le min(dans la 2 éme case du tableau) 
        int tab []= new int[2];
        int max,min,i;
         max=tableau[0];// initialisation du max et du min
	 min=tableau[0];
        for(i=0;i<tableau.length;i++)
        {
            if (tableau[i]<min)min=tableau[i];
             if (tableau[i]>max)max=tableau[i];
           
        }
        tab[0]=max;
        tab[1]=min;
        return tab;// un tableau de taille 2 qui contient  le min et le max
        
    }

    
         /**
	 * @param tableau :cette méthode va doubler tout les éléménts du tableau
         * ex:si tableau={2,3,5} en sortie il sera {4,3,10}
         * @return le tableau de l'entrée dont les elements intitiaux sont multipliés fois 2 
	 */
	public int[] formule(int [] tableau)
	 {
		 for(int i=0;i<tableau.length;i++){
			 tableau[i]=tableau[i]*2;
		 }
                 return tableau;
	 } 
    
    
    
         /**
	 * @param tableau : il sera inversé par la méthode inverser
         * ex si tableau={1,2,3,4} en sortie il sera {4,3,2,1}
          * @return  il revoit le tableau de l'entrée trié
	 */
	public int[] inverser(int [] tableau){
		 int swap;// cette var va servir pour stockerun elem avant de le changer
		 for (int i=0;i<(tableau.length)/2;i++){
			swap= tableau[i];
			tableau[i]=tableau[tableau.length-1-i];
			tableau[tableau.length-1-i]=swap;
		 }
                 return tableau;
	 }

        
	
   public static void main(String[] args) {
      
    }
    
}
