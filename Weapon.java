/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusdungeon;

/**
 *
 * @author Leah
 * @autho Christine
 */
public abstract class Weapon {
    int force; //damage from impact. staff, tackle
    int pierce; //damage from stabbing or piercing. sword, gun
    int slash; //damage from slashing. sword, claw
    int magic; //damage by magic. staff, wand
    //image
    
    public Weapon(int f, int p, int s, int m) {
        force = f;
        pierce = p;
        slash = s;
        magic = m;
    }
}
