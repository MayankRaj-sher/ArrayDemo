
package arraydemos23friam;


public class Student {
    private String sId;
    private String sName;
    private int phoneNumber;

    public Student(String sId, String sName) {
        this.sId = sId;
        this.sName = sName;
    }   
    
    public String getsId() {
        return sId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }//Yo

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsName() {
        return sName;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }
    
    
    
}
