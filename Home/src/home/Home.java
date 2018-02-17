/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

/**
 *
 * @author Cube
 */
public class Home {

    Apartament[][] apartaments;

 

    public Home(int[] homeInfo) {
   
       

       
        this.apartaments = new Apartament[homeInfo.length][];
        for (int i = 0; i < apartaments.length; i++) {
            apartaments[i] = new Apartament[homeInfo[i]];

        }
        int counter = 0;
        for (int i = 0; i < apartaments.length; i++) {
            for (int a = 0; a < apartaments[i].length; a++) {

                apartaments[i][a] = new Apartament(counter);
                counter++;
            }
        }
    }

    public void print() {
        for (int i = 0; i < apartaments.length; i++) {
            for (int a = 0; a < apartaments[i].length; a++) {
                System.out.print(apartaments[i][a] + "\t");
            }
            System.out.println();
        }
    }

    public Home(int a, int b) {
        this.apartaments = new Apartament[a][b];
    }

    /*int[][] flats = { { 0, 0, 0, 0, 0 },
                             { 0, 1, 2, 3, 4 },
                             { 0, 2, 4, 6, 8 },
                             { 0, 3, 6, 9, 12 },
                             { 0, 4, 8, 12, 16 } };

    public void print(){
        for (int i = 0; i < flats.length; i++) {
            for (int j = 0; j <  flats[i].length; j++) {
                System.out.print(flats[i][j]);
            }
            System.out.println();
        }
    }
     */
    public void zapolnitj() {
        for (int i = 0; i < apartaments.length; i++) {

            apartaments[i][0] = new Apartament(i);

            for (int a = 0; a < apartaments[i].length; a++) {
                apartaments[i][a] = new Apartament(a);
            }
        }

    }

    public Apartament[][] getApartaments() {
        return apartaments;
    }

    public void setApartaments(Apartament[][] apartaments) {
        this.apartaments = apartaments;
    }

    public void callToApartament(int kvartira) throws ReturnExeprion {
        for (int i = 0; i < apartaments.length; i++) {
            for (int a = 0; a < apartaments[i].length; a++) {
                if(apartaments[i][a].getNumber() == kvartira)
                    apartaments[i][a].speakerCall();
            }
        }

    }
}



/*  
    class Apartament {
        
        private int number;

        public int getNumber() {
            return number;
        }


        public Apartament(int number) {
            this.number = number;
        }
        
        
    }
}*/
