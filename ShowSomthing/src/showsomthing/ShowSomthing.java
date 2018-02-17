/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package showsomthing;

/**
 *
 * @author Cube
 */
public class ShowSomthing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Car car = new Car("BMV", 9);

        Monitor monitor = new Monitor();

        Computer computer = new Computer();
        computer.setMonitor(monitor);
        computer.connect(car);

        Cow cow = new Cow("Asja", 55);
        computer.connect(cow);

        USB usb = new USB() {
            @Override
            public String info() {
                
                return "Вы подсоединили веник";
            }

        };
        
        computer.connect(usb);
        
        computer.connect(new USB(){
            @Override
            public String info() {
               return "Вы подсоединили метлу";
            }
            
        });
        
        computer.connect(()-> "Вы подсоединили метлу");
        
        computer.connect(()-> "Вы подсоединили сферического котэ в вакууме");
    }
}
//Подключить к компу неведомое устройство с помощью лямбды и сделать Jar фаил 
//дженерики почитать