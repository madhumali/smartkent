package smartkent;

import java.util.Comparator;
import java.util.TreeSet;

public class Lift implements LiftInterface{
    public LiftState liftState;
    public int currentFloor;
    public LiftDirection liftDirection;
    int liftId;
    private int time = 0;
    int person=0;
    private TreeSet<Integer> upDestinationFloors;
    private TreeSet<Integer> downDestinationFloors;
    public Lift(int currentFloor, int liftId){
        this.currentFloor = currentFloor;
        this.liftState = LiftState.IDLE;
        this.liftId = liftId;
        this.liftDirection = LiftDirection.NAN;
        this.upDestinationFloors = new TreeSet<Integer>();
        this.downDestinationFloors = new TreeSet<Integer>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
    }
   
    public boolean updateState(LiftState liftState){
        this.liftState = liftState;
        return true;
        
    }
    
    public LiftState getLiftState(){
        return this.liftState;
    }
    
    public int getCurrentFloor(){
        return this.currentFloor;
    }
    
    public LiftDirection getDirection(){
        return this.liftDirection;
    }
    public int getId(){
        return this.liftId;
    }
    
    public int getNextDestionationFloor(){
        if(liftDirection == LiftDirection.DOWN){

        }else if(liftDirection == LiftDirection.UP){

        }else{
            return 0;
        }

        return 0;
    }
    
    public void pickAndDrop(int fromFloor, int toFloor){
        if(toFloor > fromFloor){
            this.time = (toFloor - fromFloor)*3;
        }else{
            this.time = (fromFloor - toFloor)*3;
        }
    }
    
    public int getTime(){
        return this.time;
    }
    

    
    public int getPerson(){
        return this.person;
    }
    
    public boolean moveAndCheckIfServed() {
        direction();
        if(liftDirection == LiftDirection.UP){

                currentFloor++;

        }else if(liftDirection == LiftDirection.DOWN){

                currentFloor--;

        }else{

        }
        return false;
    }
    
    private void direction() {
        if(liftDirection == LiftDirection.NAN){
            liftDirection = LiftDirection.UP;
        }

        }
    
    private boolean popUpDestionation() {
        upDestinationFloors.remove(upDestinationFloors.first());
        if (upDestinationFloors.size() == 0) {
            liftDirection = LiftDirection.NAN;
        }
        return true;
    }

    private boolean popDownDestionation() {
        downDestinationFloors.remove(downDestinationFloors.first());
        if(downDestinationFloors.size() == 0){
            liftDirection = LiftDirection.NAN;
        }
        return true;
    }
    
}
