package dk.pd3.data.model

data class OpenEndedQuestionTask(
    override val id: String,
    override val instruction: String,
    override val taskText: String,
    val questions: List<OpenEndedQuestion>
) : Pd3Task()

data class OpenEndedQuestion(
    val id: String,
    val questionText: String,
    val correctAnswer: String
)
