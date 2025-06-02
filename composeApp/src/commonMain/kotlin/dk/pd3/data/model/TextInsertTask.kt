package dk.pd3.data.model

data class TextInsertTask(
    override val id: String,
    override val instruction: String,
    override val taskText: String,
    val options: List<TextInsertOption>,
    val correctAnswers: List<GapAnswer>
) : Pd3Task()

data class TextInsertOption(
    val id: String,
    val text: String
)

data class GapAnswer(
    val gapNumber: Int,
    val correctOptionId: String
)
