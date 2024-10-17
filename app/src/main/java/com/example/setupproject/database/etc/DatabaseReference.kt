package com.example.setupproject.database.etc

enum class DatabaseReference {
    REFERENCE {
        override fun value() = "DatabaseReference"
    };

    abstract fun value(): String
}