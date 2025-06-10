package dk.pd3.data.model

data class TextInsertExercise(
    override val id: String,
    override val instruction: String,
    override val baseText: String,
    val options: List<TextInsertOption>,
    val correctAnswers: List<GapAnswer>
) : Pd3Exercise()

data class TextInsertOption(
    val id: String,
    val text: String
)

data class GapAnswer(
    val gapNumber: Int,
    val correctOptionId: String
)
