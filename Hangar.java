public class Hangar{

    public static void main (String[] args){
        Car citroen = new Car("citroën", 1);
        System.out.println (citroen.doStuff());

        Boat victoria = new Boat("victoria", 1);
        System.out.println (victoria.doStuff());
        
    }
}