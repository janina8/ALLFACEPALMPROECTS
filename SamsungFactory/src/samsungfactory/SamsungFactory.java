/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package samsungfactory;

import java.util.ArrayList;

/**
 *
 * @author Cube
 */
public class SamsungFactory {
    
   private PackDept packDept;
   private KeyboardDept keyboardDept;
   private DisplayDept displayDept;
   private ArrayList <Box> boxList;

    public SamsungFactory() {
        this.packDept = new PackDept();
        this.keyboardDept = new KeyboardDept();
        this.displayDept = new DisplayDept();
        displayDept.setKeyboardDept(keyboardDept);
        this.boxList = new ArrayList<>();
    }
   
   
   public void showProducts(){
     for(int i = 0; i < boxList.size();i++){
         Box currentBox = boxList.get(i);
         Phone phone = currentBox.boxOpen();
         String phoneInfo = phone.show();
         System.out.println(phoneInfo);
     }
       
   }

   public void addPhone(Phone phone){
       displayDept.receive(phone);
   }
   
   
   public class PackDept {
   
    public Box packPhone(Phone phone){
        Box box = new Box("blue");
        putPhone(box, phone);
        return box;
    }
    
    public void putPhone(Box box,Phone phone){
       box.putPhone(phone);
       
    }
    
    public void recieve(Phone phone){
        boxList.add(packPhone(phone));
    }
    
   }
    public class KeyboardDept {

        public Keyboard createKeyboard() {
            Keyboard keyboard = new Keyboard(10);

            return keyboard;
        }

        public void receive(Phone phone) {
            Keyboard keyboard = new Keyboard(2);
            phone.setKeyboard(keyboard);
            packDept.recieve(phone);
        }
    }
}
