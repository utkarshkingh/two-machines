package faps.domain;

import java.util.List;
import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@PlanningSolution
public class runner {

@ValueRangeProvider    
public char[] Sequence;

@PlanningEntityCollectionProperty
public List<Sequence> SequenceList;

@PlanningScore
public HardSoftScore score;

public runner(){               //no arg constructor for @PlanningSolution annotated class
}



public List<Sequence> getSequence() {

    return getSequence();
}


public HardSoftScore getScore() {

    return score;

}


public void setScore (HardSoftScore score) {

    this.score=score;
}



}
