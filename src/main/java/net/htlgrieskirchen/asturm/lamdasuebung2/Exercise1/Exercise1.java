/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.asturm.lamdasuebung2.Exercise1;

import java.io.*;
import java.util.*;
import java.util.logging.*;

/**
 *
 * @author user
 */
public class Exercise1 
{
        
    private static String filename = "C:\\Users\\user\\Documents\\NetBeansProjects\\asturm_LambdasUebung2\\weapons.csv";
    private static List<Weapon> weaponList = new ArrayList<Weapon>();
    
    //"C:\\Users\\user\\Documents\\NetBeansProjects\\asturm_LambdasUebung2\\weapons.csv";
   
    //--------------------------------Constructor---------------------------------
    public Exercise1()
    {
                
    }
    
    
    //--------------------------------main----------------------------------------
    public static void main(String[] args) throws IOException 
    {
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            br.readLine();
            String s = br.readLine();
            
            int longestName = 0;
            int longestCombatType = 6;
            int longestDamageType = 8;
            int longestDamage = 0;
            int longestSpeed = 0;
            int longestStrength = 0;
            int longestValue = 0;
            int counter = 0;
            while(s != null)
            {
               
                Weapon weapon = new Weapon();
                String[] parts = s.split(";");
                weapon.setName(parts[0]);
                weapon.setCombatType(CombatType.valueOf(parts[1]));
                weapon.setDamageType(DamageType.valueOf(parts[2]));
                weapon.setDamage(Integer.parseInt(parts[3]));
                weapon.setSpeed(Integer.parseInt(parts[4]));
                weapon.setStrength(Integer.parseInt(parts[5]));
                weapon.setValue(Integer.parseInt(parts[6]));
                
                weaponList.add(weapon);
                
                s = br.readLine();
                
                System.out.println(weaponList.get(counter));
                
                if(weapon.getName().length() > longestName)
                {
                    longestName = weapon.getName().length();
                    System.out.println("längster Name:" + longestName);
                }
                if(weapon.getDamage() > longestDamage)
                {
                    longestDamage = weapon.getDamage();
                    System.out.println("größter Damage:" + longestDamage);
                }
                if(weapon.getSpeed() > longestSpeed)
                {
                    longestSpeed = weapon.getSpeed();
                    System.out.println("längster Speed:" + longestSpeed);
                }
                if(weapon.getStrength() > longestStrength)
                {
                    longestStrength = weapon.getStrength();
                    System.out.println("längster Stärke:" + longestStrength);
                }
                if(weapon.getValue() > longestValue)
                {
                    longestValue = weapon.getValue();
                    System.out.println("längster Value:" + longestValue);
                }
                
                
                
                    counter++;
                //System.out.println(parts[5]);
            } 
            Printable printable =  (weaponList) -> System.out.println(weaponList);
            
            
            //---------------------Liste in Tabelle ausgeben-----------------------------------
            
            String str = 13 + " ";
            System.out.println(str);
            
            
            
            
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Exercise1.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void sortDamage()
    {
    Comparator<Weapon> sortByDamage = (Weapon o1, Weapon o2)->o1.getDamage()-o2.getDamage();
    //TODO: Unit Test.
    }
    
    public void sortCombatType()
    {
    Comparator<Weapon> sortByCombatType = (Weapon o1, Weapon o2)->o1.getCombatType().compareTo(o2.getCombatType());
        //TODO: Unit Test.
    }
    
    public void sortDamageType()
    {
        Comparator<Weapon> sortByDamageType = (Weapon o1, Weapon o2)->o1.getDamageType().compareTo(o2.getDamageType());
        //TODO: Unit Test.
    }
    
    public void sortName()
    {
        Comparator<Weapon> sortByName = (Weapon o1, Weapon o2)->o1.getName().compareTo(o2.getName());
        //TODO: Unit Test.
    }
   
}
