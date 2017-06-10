/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusdungeon;

/**
 *
 * @author Leah
 * @author Christine
 */
public class Cat extends Player {
    
    public Cat() {
        super(5, 20, new Peashooter(), new Fur(), new Water());
    }

}
