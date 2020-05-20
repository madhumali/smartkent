package smartkent;


public class LiftCnotrol implements LiftControlInterface{
    
    private Lift[] lifts;
    private int liftCount = 2;
    private int activeRequests;
    
    
    public LiftCnotrol(){
        this.lifts = new Lift[liftCount];
        for(int i = 0; i < 2 ; i++){
            lifts[i] = new Lift(0,i);
        }
    }
    
    public void updateState(LiftState liftState,int liftId){
        Lift lift = new Lift(0, liftId);
        
    }
    
    public boolean isRequest(int fromfloor){
        for(Lift lift : lifts){
            if(lift.getLiftState() == LiftState.IDLE){
                return true;
            }
        }
        return false;
    }
    
    public void response(){
        
    }
    
    public Lift[] getLift(){
        return this.lifts;
    }
    public void step() {
        for (Lift lift : lifts) {
            if(lift.moveAndCheckIfServed()){
                activeRequests--;
            }
        }
    }
    
}
