package lending.hexagon.inside.adapters.driven;

import lending.hexagon.inside.ports.driven.ForGeneratingLoanIds;

public class InMemoryLoanIdGenerator implements ForGeneratingLoanIds {
    private int nextId = 1;

    @Override
    public int nextId() {
        return nextId++;
    }
}