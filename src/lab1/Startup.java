package lab1;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author jlombardo
 */
public class Startup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        final AbstractApplicationContext context = 
                new ClassPathXmlApplicationContext(
                    new String[] {"applicationContext.xml"});
        
        PetOwner owner = (PetOwner)context.getBean("petOwner");
//        PetOwner owner = new PetOwner("John Doe", new Cat("Sassy", 8));
        
        Pet pet = owner.getPet();
        
        System.out.println("Pet Name: " + pet.getName());
        System.out.println("Adjusted Age: " + pet.getAgeInAnimalYears());
    }

}
