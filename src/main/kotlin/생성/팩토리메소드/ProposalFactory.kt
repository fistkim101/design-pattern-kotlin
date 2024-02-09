package 생성.팩토리메소드

interface ProposalFactory {
    fun types(): List<ProposalType>

    fun create(command: ProposalCreateCommand): Proposal
}