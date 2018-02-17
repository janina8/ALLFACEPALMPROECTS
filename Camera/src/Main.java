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

    public static void main(String[] args) {

        Battery battery = new Battery(100);
        MemoryCard memoryCard = new MemoryCard(100);
        Objective objective = new Objective(10);

        Camera camera = new Camera(battery, memoryCard, objective);

        for (int i = 0; i < 12; i++) {
            camera.photo();
        }

        objective.decreaseZoom();

        camera.photo();
        camera.cameraRecharge();

    }

}
