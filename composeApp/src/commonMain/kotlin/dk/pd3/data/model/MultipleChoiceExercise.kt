package dk.pd3.data.model

data class MultipleChoiceExercise(
    override val id: String,
    override val instruction: String,
    override val baseText: String,
    val questions: List<MultipleChoiceQuestion>
) : Pd3Exercise()

data class MultipleChoiceQuestion(
    val id: String,
    val questionText: String,
    val options: List<MultipleChoiceOption>,
    val correctAnswerId: String
)

data class MultipleChoiceOption(
    val id: String,
    val text: String
)
