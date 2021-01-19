/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.es1tipsit;
import java.math.*;
/**
 *
 * @author arlin
 */
public class Triangoli {
    
    private double l1;
    private double l2;
    private double l3;

    public Triangoli(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    
    
    
    public String tipologiaTriangolo(){
    
        if(this.l1 == this.l2 && this.l1 == this.l3){
        
            return "Equilatero";
        }
        
        if((this.l1 == this.l2 && this.l1 != this.l3) || (this.l1 == this.l3 && this.l1 != this.l2) || (this.l2 == this.l3 && this.l2 != this.l1)){
        
            return "Isoscele";
        }
        
        double max = this.l1;
        
        if(this.l2 > max){
        
            max = this.l2;
        }
        
        if(this.l3 > max){
        
            max = this.l3;
        }
        
        if(max == this.l1){
        
            if(Math.sqrt((Math.pow(this.l2, 2))+(Math.pow(this.l3, 2))) == this.l1){
            
                return "Rettangolo";
            }
        }
        if(max == this.l2){
        
            if(Math.sqrt((Math.pow(this.l1, 2))+(Math.pow(this.l3, 2))) == this.l2){
            
                return "Rettangolo";
            }
        }
        if(max == this.l3){
        
            if(Math.sqrt((Math.pow(this.l2, 2))+(Math.pow(this.l1, 2))) == this.l3){
            
                return "Rettangolo";
            }
        }
        
        
        
        return "Scaleno";
    }
    
    public double calcolaPerimetro(){
    
        return this.l1+this.l2+this.l3;
    }
    
    public double calcolaArea(){
    
        return Math.sqrt((calcolaPerimetro()/2)*(calcolaPerimetro()/2-this.l1)*(calcolaPerimetro()/2-this.l2)*(calcolaPerimetro()/2-this.l3));
    }
    
}
