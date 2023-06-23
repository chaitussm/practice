package javaBasics;


abstract class Graphicobject{
   void graphics(){
        System.out.println(" contains information about diagrams");
        }
    abstract void shape();
    abstract void resize(); 
       }
       
class Rectangle extends Graphicobject{
      void shape(){
          System.out.println(" shape of rectangle");
        }  
      void resize(){
          System.out.println(" changes in the shape of rectangle");
        } 
        } 
class Circle extends Graphicobject{
      void shape(){
          System.out.println(" shape of circle");
        }  
      void resize(){
          System.out.println(" changes in the shape of circle");
        }
        }  
class Graphic{
     public static void main(String args[]){
         Rectangle r = new Rectangle();
         Circle  c = new Circle();
          //Graphicobject ref = r;
         Graphicobject ref;

          ref= r;
          ref.shape();
          ref.resize();
          ref = c;
          ref.shape();
          ref.resize();
      }

      }
          
 

