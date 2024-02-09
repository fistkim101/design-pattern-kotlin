package 생성.팩토리메소드

class GeneralProposalFactory : ProposalFactory {
    override fun types(): List<ProposalType> {
        return listOf(ProposalType.GENERAL)
    }

    override fun create(command: ProposalCreateCommand): Proposal {
        return Proposal.GeneralProposal(
            title = command.title!!,
            content = command.content!!,
        )
    }
}