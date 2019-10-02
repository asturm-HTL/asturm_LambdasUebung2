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
    public Exercise1(String filename)
    {
                this.filename = filename;
    }
    
    
    //--------------------------------main----------------------------------------
    public static void main(String[] args) throws IOException 
    {
    
        try 
        {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            br.readLine();
            String s = br.readLine();
            while(s != null)
            {
                Weapon weapon = new Weapon();
                String[] parts = s.split(";");
                weapon.setName(parts[0]);
                /*test*/System.out.println(weapon.name);
            }
                        
        } 
        catch (FileNotFoundException ex) 
        {
            Logger.getLogger(Exercise1.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }
    
}
