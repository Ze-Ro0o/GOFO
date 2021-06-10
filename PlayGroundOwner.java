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
public class PlayGroundOwner {
    protected String name;
    protected String password;
    protected String eMail;
    protected String address;
    protected String phone;
    protected PlayGroundInfo PGI;
    public PlayGroundOwner(String name, String password, String eMail, String address, String phone,PlayGroundInfo PGI) {
        this.name = name;
        this.password = password;
        this.eMail = eMail;
        this.address = address;
        this.phone = phone;
        this.PGI=PGI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PlayGroundInfo getPGI() {
        return PGI;
    }

    public void setPGI(PlayGroundInfo PGI) {
        this.PGI = PGI;
    }
    
    
}
