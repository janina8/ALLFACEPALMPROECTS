/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class MemoryCard {

    public int getMemorySize() {
        return memorySize;
    }

    public int memorySize; // как с приват сделать тогда?

    public MemoryCard(int memorySize) {
        this.memorySize = memorySize;
    }

    public int cardWriten() {
        if(memorySize - 10 <= 0){
        System.out.println("Карта памяти переполнена");
        memorySize = 0;
    }
        else
        memorySize = memorySize -10;
        return memorySize;
       
    }
}
