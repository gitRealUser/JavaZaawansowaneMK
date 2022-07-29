
package powtorka.interfaces;
public interface FamilyMember {

    default void introduceYourself(){
        System.out.println("I'm just a simple family member");
    }

    boolean isAdult();


}


