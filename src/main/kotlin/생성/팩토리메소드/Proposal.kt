package 생성.팩토리메소드

sealed class Proposal {
    data class GeneralProposal(
        val title: String,
        val content: String,
    ) : Proposal()

    data class BudgetProposal(
        val budget: Int,
    ) : Proposal()
}

data class ProposalCreateCommand(
    val title: String? = null,
    val content: String? = null,
    val budget: Int? = null,
)

class User {

}

class NormalUser : User {

}