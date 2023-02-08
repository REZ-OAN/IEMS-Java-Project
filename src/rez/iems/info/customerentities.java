
package rez.iems.info;

public class customerentities {
    String cnid,name,email,pass,contactno,address,img;
    public customerentities(){
        
    }
    public customerentities(String cnid,String name,String email,String contactno,String pass,String address,String img){
        this.cnid=cnid;
        this.name=name;
        this.email=email;
        this.pass=pass;
        this.contactno=contactno;
        this.address=address;
        this.img=img;
              
    }

    public String getCnid() {
        return cnid;
    }

    public void setCnid(String cnid) {
        this.cnid = cnid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
}
