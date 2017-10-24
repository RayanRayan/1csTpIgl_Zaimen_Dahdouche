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
         * @return il renvoit le tableau de l'entrée trié
         * ex: si tableau ={2,8,4,-3} il sera en sortie {-3,2,4,8}
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
     * @param tab1
     * @param tab2
     * @throws SommeTableauException
     */
    
    public void somme_tableau(int[]tab1,int[] tab2)throws SommeTableauException{
        
        if(tab1.length!=tab2.length) throw new SommeTableauException();
        else{
            for(int i=0;i<tab1.length;i++){
                tab1[i]=tab1[i]+tab2[i];
            }
        }
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

    
  
	
   public static void main(String[] args) {
      
    }
    
}
