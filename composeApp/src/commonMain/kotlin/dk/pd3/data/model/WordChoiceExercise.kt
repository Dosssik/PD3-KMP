package dk.pd3.data.model

data class WordChoiceExercise(
    override val id: String,
    override val instruction: String,
    override val baseText: String,
    val blanks: List<BlankOption>,
    val correctAnswers: List<BlankAnswer>
) : Pd3Exercise()

data class BlankOption(
    val blankId: String,
    val options: List<String>
)

data class BlankAnswer(
    val blankId: String,
    val correctOption: String
)
