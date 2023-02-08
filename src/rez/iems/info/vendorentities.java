
package rez.iems.info;

public class vendorentities {
    String name,contactno,email,pass,address,img,bin;
    int code;
    double response;
    public vendorentities(){
        
    }
    public vendorentities(int code,String name,String bin,String email,String pass,String address,String img,String contactno,double response)
    {
       this.address=address;
       this.name=name;
       this.code=code;
       this.email=email;
       this.bin=bin;
       this.img=img;
       this.pass=pass;
       this.response = 0.0;
       this.contactno=contactno;
       this.response = response;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
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

    public String getBin() {
        return bin;
    }

    public void setBin(String bin) {
        this.bin = bin;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getResponse() {
        return response;
    }

    public void setResponse(double response) {
        this.response = response;
    }

    
}
