/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hw4;

/**
 *
 * @author 20106
 */
public class HW4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlayGroundInfo PGF=new PlayGroundInfo("Manchester",20,50,"dareslam");
       Player obj=new Player("Ahmed","flashplayer","a@yahoo.com","dareslam","01000000");
       PlayGroundOwner obj2=new PlayGroundOwner("Ahmed","flashplayer","a@yahoo.com","dareslam","01000000",PGF);
       rigesteration rig=new rigesteration(obj);
       System.out.println();
       rigesteration rig2=new rigesteration(obj2);
       Adminstraitor obj3=new Adminstraitor("Ahmed","flashplayer","a@yahoo.com");
       System.out.println();
       rigesteration rig3=new rigesteration(obj3);
       rigesteration rig4=new rigesteration(PGF);
        
    }
    
}
