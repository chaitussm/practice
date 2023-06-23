package abstraction;


//Drawing 
abstract class Graphicobject{
	//concrete method
   void graphics(){
        System.out.println(" contains information about diagrams");
        System.out.println("Used for");
        }
    abstract void shape();
    abstract void resize(); 
       }
       
class Rectangle extends Graphicobject{
      void shape()
        {
          System.out.println(" shape of rectangle");
        }  
      void resize()
        {
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
         Graphicobject ref = r;
         //Graphicobject ref;
         
         //I have taken object reference of rectangle r first 

          ref= r;
          ref.shape();
          ref.resize();
          ref.graphics();
          //Circle definition
          ref = c;
          ref.shape();
          ref.resize();
          ref.graphics();
      }

      }
          
 

