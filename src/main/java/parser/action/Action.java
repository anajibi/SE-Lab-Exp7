package parser.action;

public abstract class Action {
    public act action;
    //if action = shift : number is state
    //if action = reduce : number is number of rule
    public int number;

    public Action(act action, int number) {
        this.action = action;
        this.number = number;
    }

    public act getAction() {
        return action;
    }

    public String toString() {
        return action.toString() + number;
    }
}


