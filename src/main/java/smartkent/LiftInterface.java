package smartkent;

public interface LiftInterface {
    public boolean updateState(LiftState liftState);
    
    public LiftState getLiftState();
    
    public int getCurrentFloor();
    
    public LiftDirection getDirection();
}
