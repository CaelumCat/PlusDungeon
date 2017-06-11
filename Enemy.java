/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusdungeon;

/**
 *
 * @author leahr
 */
public abstract class Enemy {
    double hp;
    Weapon weapon;
    Armor armor;
    double attackPer = 1;
    double defensePer = 1;
    
    public Enemy(double hp, Weapon w, Armor a) {
        this.hp = hp;
        weapon = w;
        armor = a;
    }
    
    public void attack(Player p) {
        p.takeDamage(0,weapon.getForce()*attackPer);
        p.takeDamage(1,weapon.getPierce()*attackPer);
        p.takeDamage(2,weapon.getSlash()*attackPer);
        p.takeDamage(3,weapon.getMagic()*attackPer);
    }
    
    public void takeDamage(int attackType, double damage) {
        if(attackType == 0) {
            double forceDamage = armor.getForce()*defensePer - damage;
            if(forceDamage > 0) {
                hp -= forceDamage;
            }
        } else if (attackType == 1) {
            double pierceDamage = armor.getPierce()*defensePer - damage;
            if (pierceDamage > 0) {
                
            }
        }
    }
    
}
