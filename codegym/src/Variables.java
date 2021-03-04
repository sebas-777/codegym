/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shebas
 */
public class Variables 
    {
  private static String TEXT = "The end.";
  
   public static void main (String[] args)
                     
         {
               System.out.println("Hi");
         String s = "Hi!";

 System.out.println(s);
        if (args != null)
             {
               String s2 = s;


         System.out.println(s2);

         }
         Variables variables = new Variables();
         System.out.println(variables.instanceVariable);
                 System.out.println(TEXT);

         }

       public String instanceVariable;

      public Variables()
      {
          instanceVariable = "Instance variable test.";
          }
    }



