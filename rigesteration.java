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
public class rigesteration {
    protected Player obj;
    protected PlayGroundOwner obj2;
    protected Adminstraitor obj3;
    protected PlayGroundInfo obj4;
    public rigesteration(Player obj) {
        System.out.println(obj.getName());
        System.out.println(obj.geteMail());
        System.out.println(obj.getPassword());
        System.out.println(obj.getPhone());
        System.out.println(obj.getAddress());
    }

    public rigesteration(PlayGroundOwner obj2) {
        System.out.println(obj2.getName());
        System.out.println(obj2.geteMail());
        System.out.println(obj2.getPassword());
        System.out.println(obj2.getPhone());
        System.out.println(obj2.getAddress());
      
         
         
        
                
    }

    public rigesteration(PlayGroundInfo obj4) {
        System.out.println(obj4.getName());
        System.out.println(obj4.getPrice());
        System.out.println(obj4.getSize());
        System.out.println(obj4.getLocation());
        
    }
    

    public rigesteration(Adminstraitor obj3) {
        System.out.println(obj3.getName());
        System.out.println(obj3.geteMail());
        System.out.println(obj3.getPassword());
    }
    
}
