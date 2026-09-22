package lending.hexagon.inside.adapters.driven;

import lending.hexagon.inside.ports.driven.ForGeneratingMemberIds;

public class InMemoryMemberIdGenerator implements ForGeneratingMemberIds {
    private int nextId = 1;

    @Override
    public int nextId() {
        return nextId++;
    }
}
