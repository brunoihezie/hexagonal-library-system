package lending.hexagon.inside.ports.driven;

import lending.hexagon.inside.domain.Member;

public interface ForObtainingMembers {
    void save(Member member);
    Member findById(int memberId);
    int nextId();
}
