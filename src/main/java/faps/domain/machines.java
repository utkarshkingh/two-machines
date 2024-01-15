package faps.domain;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.lookup.PlanningId;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.variable.PlanningVariable;


public class machines {
     @ProblemFactCollectionProperty
     String name;
     @ProblemFactCollectionProperty
     int carTime;
     @ProblemFactCollectionProperty
     int truckTime;
     @ProblemFactCollectionProperty
     float changeTime;

     

     public machines(String name,int carTime,int truckTime,float changeTime) {

          this.name = name;
          this.carTime= carTime;
          this.truckTime=truckTime;
          this.changeTime=changeTime;

     }


     public String getName() {
          return this.name;
     }

     public void setName(String name) {
          this.name = name;
     }

     public int getCarTime() {
          return this.carTime;
     }

     public void setCarTime(int carTime) {
          this.carTime = carTime;
     }

     public int getTruckTime() {
          return this.truckTime;
     }

     public void setTruckTime(int truckTime) {
          this.truckTime = truckTime;
     }

     public float getChangeTime() {
          return this.changeTime;
     }

     public void setChangeTime(int changeTime) {
          this.changeTime = changeTime;
     }







     
    // public int machine1car=10;
    
   // public int machine2car=12;
     
   // public int machine1truck=20;
     
  //  public int machine2truck=24;
     
   //  public float machine1change=0.5f;
     
     // public float machine2change=0.5f;

}



