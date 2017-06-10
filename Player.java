/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package plusdungeon;

import java.util.ArrayList;


/**
 *
 * @author Leah
 * @author Christine
 */
public abstract class Player {
    int hp;
    int maxHP;
    int mana;
    int maxMana;
    Weapon weapon;
    ArrayList<Weapon> weapons = new ArrayList();
    Armor armor;
    ArrayList<Armor> armors;
    Potion potion;
    ArrayList<Potion> potions;
    
    Player(int maxHP, int maxMana, Weapon weapon, Armor armor, Potion potion) {
        this.hp = maxHP;
        this.maxHP = maxHP;
        this.mana = maxMana;
        this.maxMana = maxMana;
        this.weapon = weapon;
        weapons.add(weapon);
        this.armor = armor;
        armors.add(armor);
        this.potion = potion;
        potions.add(potion);
    }
    
    public int getHP() {
        return hp;
    }
    
    public void setHP(int newHP) {
        if (newHP <= maxHP) {
            hp = newHP;
        } else {
            hp = maxHP;
        }
    }
    
    public void setMaxHP(int newHP) {
        maxHP = newHP;
        if (hp > maxHP) {
            hp = maxHP;
        }
    }
    
    public int getMana() {
        return mana;
    }
    
    public void setMana(int newMana) {
        if (newMana <= maxMana) {
            mana = newMana;
        } else {
            mana = maxMana;
        }
    }
    
    public void setMaxMana(int newMana) {
        maxMana = newMana;
        if (mana > maxMana) {
            mana = maxMana;
        }
    }
    
    public Weapon getWeapon() {
        return weapon;
    }
    
    public void addWeapon(Weapon newWeapon) {
        weapons.add(newWeapon);
    }
    
    public void setWeapon(int newWeapon) {
        weapon = weapons.get(newWeapon);
    }
    
    public Armor getArmor() {
        return armor;
    }
    
    public void addArmor(Armor newArmor) {
        armors.add(newArmor);
    }
    
    public void setArmor(int newArmor) {
        armor = armors.get(newArmor);
    }
    
    public Potion getPotion() {
        return potion;
    }
    
    public void addPotion(Potion newPotion) {
        potions.add(newPotion);
    }
    
    public void setPotion(int newPotion) {
        potion = potions.get(newPotion);
    }
    
    public void usePotion() {
        ArrayList<Integer> effects = potion.useEffects();
        hp += effects.get(0);
        maxHP += effects.get(1);
        mana += effects.get(2);
        maxMana += effects.get(3);
        //do something to increase Player's attack by effects.get(4)
        //do something to increase Player's defense by effects.get(5)
    }
    
}
