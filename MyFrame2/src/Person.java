/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Cube
 */
public class Person {
    private String client;
    private String adress;
    private String problem;

    public String getClient() {
        return client;
    }

    public String getAdress() {
        return adress;
    }

    public String getProblem() {
        return problem;
    }

    public Person(String client, String adress, String problem) {
        this.client = client;
        this.adress = adress;
        this.problem = problem;
    }
    
    
    
}
