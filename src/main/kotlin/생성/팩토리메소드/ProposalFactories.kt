package 생성.팩토리메소드

class ProposalFactories(
    private val factories: List<ProposalFactory>
) {
    fun create(proposalType: ProposalType): Proposal {
        val factory = factories.firstOrNull { it.types().contains(proposalType) }
            ?: throw Exception("factory not found")
        return factory.create()
    }
}