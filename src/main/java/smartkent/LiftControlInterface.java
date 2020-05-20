
package smartkent;


public interface LiftControlInterface {
    public void updateState(LiftState liftState,int liftId);
    
    public boolean isRequest(int fromfloor);
    
    public void response();
    
}
