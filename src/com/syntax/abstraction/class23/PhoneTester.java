package com.syntax.abstraction.class23;

public class PhoneTester {
    public static void main(String[] args) {


    //Phone phone=new Phone(); we can't create the object of abstract class because some abstract claas method are not define
       Iphone iphone=new Iphone();
       iphone.displayPictures();
       iphone.unlockPhone();
       iphone.makePhoneCalls();
       iphone.sendText();

       Phone []phone={new Iphone(), new Samsung()};
        for(Phone ph:phone){
            ph.displayPictures();
            ph.makePhoneCalls();
            ph.unlockPhone();
            ph.sendText();
        }
    }
}
