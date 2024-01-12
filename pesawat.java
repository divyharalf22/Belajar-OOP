/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajaroop;

/**
 *
 * @author divya
 */
public class pesawat {
    //atribut
    int avtur;
    int kecepatan;
    String merek;
    
    //method
    void maju(){
        avtur--;
        if(avtur < 10){
            kecepatan++;
            System.out.println("Pesawatt melajuu goo....");
        }else{
            System.out.println("Bensin habis : pesawatnya haus tidak bisa terbang");
        }
    }
    
    void matiKanMesin(){
        avtur--;
        if(kecepatan < 0){
            System.out.println("Mesin tidak bisa mati karena sedang di udara");
        }else{
            System.out.println("Mesin dimatikan...");
        }
    }
    
    void berhenti(){
        //kecepatan berkurang, karena mau landing
        kecepatan--;
        avtur--;
        System.out.println("Pesawat berhenti");
    }
    
    void belok(){
        avtur--;
        System.out.println("Pesawatnya belok");
        //belok ke mana? yaa i don't know
    }
    
    void mundur(){
        avtur--;
        System.out.println("Pesawat mundur");
        kecepatan++;
    }
}
