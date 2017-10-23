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
public class SommeTableauException extends Exception {
    
    public SommeTableauException(){
        System.out.print("les tailles des tableaux à sommer n'est pas égales ,Veuillez les revoir svp");
    }
}
