package ru.st.skilltracker

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SkillTrackerApplication

fun main(args: Array<String>) {
    runApplication<SkillTrackerApplication>(*args)
}
