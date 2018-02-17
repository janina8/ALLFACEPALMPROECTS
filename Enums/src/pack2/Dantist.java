package pack2;

enum Category { HIGH_LEVEL, MIDDLE_LEVEL, LOW_LEVEL}

public class Dantist {
    private Category category;
    public String name;
    
    public static final Cabinet cabinet = new Cabinet("ulica Puskina", 10);

    public Dantist(String name) {
        this.name = name;
    }
    public Dantist(Category category, String name) {
        this.category = category;
        this.name = name;
    }
    
    public void drillTeeth(){
        
        MedicalDevice.BOR_MACHINE.start();
    }
    public void downArmchair(){
        MedicalDevice.ARMCHAIR.start();
    }
    public void breakDevices(MedicalDevice medicalDevice){
        medicalDevice.breakDevice();
        
    }
public void talkAboutCategory() {
    if(category == Category.HIGH_LEVEL)
    System.out.println("Высокая категория "+category.HIGH_LEVEL);
    
      if(category == Category.MIDDLE_LEVEL)
    System.out.println("Средняя категория "+category.MIDDLE_LEVEL);
      
        if(category == Category. LOW_LEVEL)
    System.out.println("Низкая категория "+category. LOW_LEVEL);
}
    
    public String cabAdress() {
        return cabinet.getAdress();
    }
    
}
