package faps.domain;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.lookup.PlanningId;
import org.optaplanner.core.api.domain.solution.ProblemFactCollectionProperty;
import org.optaplanner.core.api.domain.variable.PlanningVariable;


public class machines {

     @ProblemFactCollectionProperty
     public int machine1car=10;
     @ProblemFactCollectionProperty
     public int machine2car=12;
     @ProblemFactCollectionProperty
     public int machine1truck=20;
     @ProblemFactCollectionProperty
     public int machine2truck=24;
     @ProblemFactCollectionProperty
     public float machine1change=0.5f;
     @ProblemFactCollectionProperty
     public float machine2change=0.5f;

}





}



