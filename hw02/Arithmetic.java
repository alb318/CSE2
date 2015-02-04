////////////////////////////////////////////////////////////////////////////////
// Alex Biester
// Due Date: 2/3/15
// CSE 02 Section 012
//
//
//
//  class
public class Arithmetic{
    
//  main method
public static void main (String[] args) {
    
// compute cost of the items, including 6% sales tax 
// I think we're supposed to pick different items and costs than the example, yeah?
// Well these will be different and hopely I'm doing it correctly


// tax percent
double taxPercent=0.06;

// number of plates
int plates=6;
// price of each plate (in dollars)
double platePrice=4.16;


// number of video games
int videogames=2;
// price of each video game (in dollars)
double videogamePrice=29.99;


// number of light bulbs
int lightbulbs=4;
// price of each light bulb (in dollars)
double lightbulbPrice=8;


// number of bottles of cough syrup
int coughsyrup=1;
// price of each bottle of cough syrup (in dollars)
double coughsyrupPrice=7.50;




// total cost
    System.out.println("Total price of plates is "+
        (plates*platePrice)+" dollars and the sales tax is "+
          plates*platePrice*taxPercent+" dollars.");

    System.out.println("Total price of video games is "+
        (videogames*videogamePrice)+" dollars and the sales tax is "+
            videogames*videogamePrice*taxPercent+" dollars.");
            
    System.out.println("Total price of lightbulbs is "+
        (lightbulbs*lightbulbPrice)+" dollars and the sales tax is "+
            lightbulbs*lightbulbPrice*taxPercent+" dollars.");
        
    System.out.println("Total price of coughsyrup is "+
        (coughsyrup*coughsyrupPrice)+" dollars and the sales tax is "+
            coughsyrup*coughsyrupPrice*taxPercent+" dollars.");


    System.out.println("Total price of items before tax is "+
        (plates*platePrice+lightbulbs*lightbulbPrice+videogames*videogamePrice+coughsyrup*coughsyrupPrice)+" dollars.");

    System.out.println("Total price of items with tax is "+
        (plates*platePrice+lightbulbs*lightbulbPrice+videogames*videogamePrice+coughsyrup*coughsyrupPrice
         +124.44*taxPercent)+" dollars.");
         
         
         
// my error log for this section was extremely long and took me forever to figure out
// you have no idea how excited I was when I got it to work

    


    
    }
}