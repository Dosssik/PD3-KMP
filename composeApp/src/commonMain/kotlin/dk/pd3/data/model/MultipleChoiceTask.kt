package dk.pd3.data.model

data class MultipleChoiceTask(
    override val id: String,
    override val instruction: String,
    override val taskText: String,
    val questionsAnswers: List<MultipleChoiceQuestion>
) : Pd3Task()

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
