
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Cube
 */
public class Theatre {

    ArrayList<Viewer> list = new ArrayList<>();

    public void addViewer(Viewer viewer) {
       
            list.add(viewer);
        }
    

    public void startShow() {
        System.out.println("Предсталение началось!");
        clapAll();

    }

    public void clapAll() {
        for (Viewer a : list) {
            a.clap();
        }

    }
    
    public void showSize(){
       System.out.println(list.size());
    }
}