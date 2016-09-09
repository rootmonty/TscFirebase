package monty.tscf.Transitions;

import java.util.List;

/**
 * Created by monty on 5/9/16.
 */
public class FireObject {

    List<FirePOJO> value;

    public List<FirePOJO> getValue() {
        return value;
    }

    public void setValue(List<FirePOJO> value) {
        this.value = value;
    }

    public void addValue(FirePOJO obj) {
        value.add(obj);

    }


}
