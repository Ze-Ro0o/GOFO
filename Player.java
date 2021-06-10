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
public class Player {
    protected String name;
    protected String password;
    protected String eMail;
    protected String address;
    protected String phone;

    public Player(String name, String password, String eMail, String address, String phone) {
        this.name = name;
        this.password = password;
        this.eMail = eMail;
        this.address = address;
        this.phone = phone;
    }

    public Player() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String geteMail() {
        return eMail;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }
    
    
    
}
