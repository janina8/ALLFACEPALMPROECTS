/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SleepAction sleepAction = new SleepAction();
       
        
        sleepAction.execute();
        
        Action action1 = new Action(){
            @Override
            public void execute() {
                System.out.println("Сходить за водкой");
            }
        };
        action1.execute();
        /////////////////////////
        Action lambda1Action = ()-> System.out.println("Сходить за лямбда-водкой");
        lambda1Action.execute();
        /////////////////////////////
        new Action(){
            @Override
            public void execute() {
                System.out.println("Пойти поесть !!!");
            }
        }.execute();  
       new SimpleClass("Vasya"){
            @Override
            public void method(){
                System.out.println("Hello from annonymous class");
            }
            public void method2(String data){
                System.out.println(data);
            }
        }.method2("ha-ha");
   ///////////////////////////////////////////////////////////////////////////////////    
   Person person = new Person("Petya", true, 10);
       Action2 action2 = new Action2(){
            @Override
            public boolean execute() {
                  return person.isSleep();
            }
    };
       System.out.println(action2.execute());
    /////////////////////////////////////////////////////////////////////////////////////////   
    Action2 lambdaAction2 = ()-> person.isSleep(); 
    System.out.println(lambdaAction2.execute());
    /////////////////////////////////////////////////////////////////////////////////
       Action3 action3 = new Action3(){
            @Override
            public void execute(Boolean a, String b) {
                System.out.println(a+b);
            }
       
       };
       action3.execute(person.isSleep(), person.getName());
    ///////////////////////////////////////////////////////////////   
     Action3 lambdaAction3 = (a, b)-> System.out.println(a+b);
     lambdaAction3.execute(person.isSleep(), person.getName());
       
    /////////////////////////////////////////////////////////   
       Action4 action4 = new Action4(){
            @Override
            public int exucete(Person a) {
               
               return person.getTime();
                
            }
           
       };
    //   System.out.println(action4.exucete(person));
    ///////////////////////////////////////////////////////////////
    Action4 lambdaEction4 = (a)-> a.getTime();
    System.out.println(lambdaEction4.exucete(person));
    ///////////////////////////////////////////////////
       Executer executer = new Executer();
       executer.execute(action1);
       System.out.println(executer.executeAction4(action4,person));
       /////////////////////////////////////////////////////////////////////////////////////
        MacroCommand macroCommand = new  MacroCommand();
        macroCommand.addAction(action1);   
        
        macroCommand.addAction(sleepAction);
        Action myAction = new Action(){
            @Override
            public void execute() {
                System.out.println("Покормить чаек");
            }
            
        };
        macroCommand.addAction(new Action(){
            @Override
            public void execute() {
                System.out.println("annonimous action1 do it");
                System.out.println("annonimous action2 do it");
            }
        });        
        macroCommand.addAction(myAction);
///////////////////////////////////////////////////
        
      Action lambdaEction = ()-> {System.out.println("annonimous action1 do it");
                                  System.out.println("annonimous action2 do it");
                            };
      
      macroCommand.addAction(lambdaEction);
        macroCommand.addAction(()->{System.out.println("annonimous action1 do it");
                                  System.out.println("annonimous action2 do it");
                            });
///////////////////////////////////////
        macroCommand.execute();
        
    }
    
}
