package lending.hexagon.inside.adapters.driven;

import java.util.ArrayList;
import java.util.List;

import lending.hexagon.inside.domain.Member;
import lending.hexagon.inside.ports.driven.ForGeneratingMemberIds;
import lending.hexagon.inside.ports.driven.ForObtainingMembers;

public class InMemoryMemberRepository implements ForObtainingMembers {
    private final List<Member> members;
    private final ForGeneratingMemberIds memberIdGenerator;

    public InMemoryMemberRepository(ForGeneratingMemberIds memberIdGenerator) {
        this.members = new ArrayList<>();
        this.memberIdGenerator = memberIdGenerator;
    }

    @Override
    public void save(Member member) {
        members.add(member);
    }

    @Override
    public Member findById(int memberId) {
        if (memberId <= 0 || members.isEmpty()) {
            throw new IllegalArgumentException("Member ID must be greater than 0 and members list cannot be empty");
        }

        for (Member member : members) {
            if (member.getMemberId() == memberId) {
                return member;
            }
        }
        return null;
    }

    @Override
    public int nextId() {
        return memberIdGenerator.nextId();
    }
    // Implementation of the repository methods
}
