package dk.pd3.data.model

sealed class Pd3Task {
    abstract val id: String
    abstract val instruction: String
    abstract val taskText: String
}
