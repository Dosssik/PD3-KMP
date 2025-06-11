package dk.pd3.data.model

sealed class Pd3Exercise {
    abstract val id: String
    abstract val instruction: String
    abstract val baseText: String
}
