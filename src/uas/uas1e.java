package uas;

import java.util.ArrayList;
import java.util.Scanner;

public class uas1e {

    public String getUSERID() {
        return USERID;
    }

    public void setUSERID(String USERID) {
        this.USERID = USERID;
    }

    public String getUSERNAME() {
        return USERNAME;
    }

    public void setUSERNAME(String USERNAME) {
        this.USERNAME = USERNAME;
    }

    public String getWhatyourpost() {
        return whatyourpost;
    }

    public void setWhatyourpost(String whatyourpost) {
        this.whatyourpost = whatyourpost;
    }

    private String USERID;
    private String USERNAME;
    private String whatyourpost;

    public ArrayList<String> getMY_MESSAGES() {
        return MY_MESSAGES;
    }

    private ArrayList<String> MY_MESSAGES;

    public uas1e(){
    }
    public uas1e(String usrid,String usrnm,String whatyourpost,ArrayList<String>Whatyourpost ){
        this.USERID = usrid;
        this.USERNAME=usrnm;
        this.whatyourpost=whatyourpost;
    }static class messages {
public  void setUSERID(String USERID){

}public void setUSERNAME(String USERNAME){}
    }
    public void setMY_MESSAGES(ArrayList<messages>xMsg){
    }

    public static void main(String[] args) {
        uas1e social = new uas1e();
        social.setUSERID("108");
        social.setUSERNAME("Lonewanderer");
        System.out.println("USER ID"+social.getUSERID());
        System.out.println("USERNAME"+social.getUSERNAME());
        int jum_msg=3;
        Scanner sc=new Scanner(System.in);
        ArrayList<messages>xMsg=new ArrayList<>();
        for (int a=0;a<jum_msg;a++){
            int b = a +1;
            messages msg=new messages();
            msg.setUSERID(social.getUSERID());
            msg.setUSERNAME(social.getUSERNAME());
            System.out.println("post messages"+b+" = ");
            String _msg = sc.nextLine();
            xMsg.add(msg);
        }social.setMY_MESSAGES(xMsg);
        social.showpost(social);
    }

    private void showpost(uas1e social) {
    }

}
