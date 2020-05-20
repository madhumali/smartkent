package smartkent;

public class Smartkent {

   
    public static void main(String[] args) {
        LiftCnotrol liftControl = new LiftCnotrol();
        for(int i = 1; i <= 10; i++){
            liftControl.isRequest(i);
        }


        for(Lift lift : liftControl.getLift()){
            System.out.println("LiftId" + lift.getId() + ", State:"+ lift.getLiftState()+", Direction:"+lift.getDirection()+", Person:"+lift.getPerson()+",Floor:"+lift.getCurrentFloor());

        }

        System.out.println("------------------------");
        liftControl.step();
        for(Lift lift : liftControl.getLift()){
            System.out.println("Lift[" + lift.getId() + "] - Current Floor " + lift.getCurrentFloor()+ lift.getLiftState());
        }

    }
    
}
