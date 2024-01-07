package faps.domain;

import java.util.List;

import org.optaplanner.core.api.domain.solution.PlanningEntityCollectionProperty;
import org.optaplanner.core.api.domain.solution.PlanningScore;
import org.optaplanner.core.api.domain.solution.PlanningSolution;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@PlanningSolution

public class runner {

private List<Sequence> SequenceList;

private HardSoftScore score;


@PlanningEntityCollectionProperty
private List<Sequence> getSequence() {

    return getSequence();
}


@PlanningScore

public HardSoftScore getScore() {

    return score;

}


public void setScore (HardSoftScore score) {

    this.score=score;
}



}
