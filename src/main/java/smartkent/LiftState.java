package smartkent;


public enum LiftState {
    IDLE, //no job.
    TO_PICKUP, // moving to the floor to pick up the person
    PICKUP, //picking up the person.
    TO_DROPOFF, // moving to the destination floor
    DROPOFF //dropping off the person on the floor
}
