/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusdungeon;

import java.util.ArrayList;

/**
 *
 * @author leahr
 */
public abstract class Potion {
    ArrayList<Integer> effects = new ArrayList();
    boolean usable = true;
    
    public Potion(int hp, int maxHP, int mana, int maxMana, int attack, int defense) {
        effects.add(hp);
        effects.add(maxHP);
        effects.add(mana);
        effects.add(maxMana);
        effects.add(attack);
        effects.add(defense);
    }
    
    public ArrayList<Integer> getEffects() {
        return effects;
    }
    
    public ArrayList<Integer> useEffects() {
        usable = false;
        return effects;
    }
    
    public void resetUse() {
        usable = true;
    }
    
}
