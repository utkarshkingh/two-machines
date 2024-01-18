package solver;

import java.util.function.Function;
import org.optaplanner.core.api.score.buildin.bendable.BendableScore;
import org.optaplanner.core.api.score.stream.Constraint;
import org.optaplanner.core.api.score.stream.ConstraintFactory;
import org.optaplanner.core.api.score.stream.ConstraintProvider;
import org.optaplanner.core.api.score.stream.uni.UniConstraintStream;

import faps.domain.Sequence;
import faps.domain.machines;
import org.optaplanner.core.api.score.stream.Joiners;
import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;



public class constraints implements ConstraintProvider {

    @Override
    public Constraint[] defineConstraints(ConstraintFactory constraintFactory) {
        return new Constraint[]{
                minimizeMakespan(constraintFactory),
            
        };
    }

    private Constraint minimizeMakespan(ConstraintFactory constraintFactory) {
        return constraintFactory.forEach(Sequence.class)
        .penalize(BendableScore.ofSoft(BENDABLE_SCORE_HARD_LEVELS_SIZE, BENDABLE_SCORE_SOFT_LEVELS_SIZE, 1, 1),
                //.join(machines.class, Joiners.equal((machine1, machine2) -> machine1, Function.identity()))
                .groupBy((machine1, machine2) -> machine1)
                .penalize("Minimize makespan", HardSoftScore.ONE_SOFT,
                        (machines1, machines2) -> calculateMakespanPenalty(machines1, machines2));
    }

    

    
    private int calculateMakespanPenalty(machines machines1, machines machines2) {
        
        return 0;
    }

   
}

