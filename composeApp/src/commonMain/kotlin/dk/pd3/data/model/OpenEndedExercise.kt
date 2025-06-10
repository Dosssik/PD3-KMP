package dk.pd3.data.model

data class OpenEndedExercise(
    override val id: String,
    override val instruction: String,
    override val baseText: String,
    val questions: List<OpenEndedQuestion>
) : Pd3Exercise()

data class OpenEndedQuestion(
    val id: String,
    val questionText: String,
    val correctAnswer: String
)
