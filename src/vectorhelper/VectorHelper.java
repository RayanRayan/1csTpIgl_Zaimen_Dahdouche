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
			 tableau[i]=tableau[i]*3;
		 }
                 return tableau;
	 } 
    
    	

  
	
   public static void main(String[] args) {
      
    }
    
}
