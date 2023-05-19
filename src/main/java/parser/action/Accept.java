package parser.action;

public class Accept extends Action {
    public Accept(int number) {
        super(act.accept, number);
    }

    public String toString() {
        return "acc";
    }
}
