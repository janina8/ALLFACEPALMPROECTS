/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printing;

/**
 *
 * @author Cube
 */
public class Print3D implements Printer {

    @Override
    public void print(String info) {
        System.out.println(info + " " + getClass().getName());
    }

}
