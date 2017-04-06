/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Federica
 */
public class JavaApplication2 {
    private String nome;
    private String cognome;
    private int nascita;
    
    //costruttore
    public JavaApplication2(String n,String c,int b)
    {
        nome = n;
        cognome = c;
        nascita = b;
    }
    
    public int calcolaEta(int anno_attuale)
    {
        int eta = anno_attuale - nascita;
        return eta;
    }
   
    public static void main(String[] args, int anno_attuale) {
        JavaApplication2 pers = new JavaApplication2("Franca","Mc",1993);
        int anni = pers.calcolaEta(anno_attuale);
        System.out.println(pers.calcolaEta(anno_attuale));
    }
    
}
