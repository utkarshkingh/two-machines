package faps.domain;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.lookup.PlanningId;
import org.optaplanner.core.api.domain.variable.PlanningVariable;


public class machines {

     @PlanningId
     int machine1car=10;
     @PlanningId
     int machine2car=12;
     @PlanningId
     int machine1truck=20;
     @PlanningId
     int machine2truck=24;
     @PlanningId
     float machine1change=0.5f;
     @PlanningId
     float machine2change=0.5f;

}


