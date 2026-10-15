package com.astroloop.game.data

import com.astroloop.game.system.CrystalPhase

object CrystalFightLines {
    val opening = listOf(
        "You ran away, Vanya.",
        "I left the porch light on.",
        "So I came to get you."
    )

    fun taunt(p: CrystalPhase): Pair<String, String?> = when (p) {
        CrystalPhase.P1 -> "Come home, Vanya." to "Dinner's getting cold."
        CrystalPhase.P2 -> "One more loop, sweetheart." to "Nothing has to end."
        CrystalPhase.P3 -> "The stepdad is here too." to "Every one you lost."
        CrystalPhase.P4 -> "Mama's not angry now." to "Just come inside."
        CrystalPhase.P5 -> "STAY - STAY..." to null
    }

    val pauseDenial = listOf(
        "Not yet.",
        "You don't get to hang up.",
        "Don't you walk away from me."
    )

    const val farewell = "...Go on, then. Be good, Vanya."

    val barChatter = listOf(
        "TOBAR" to "Something out there's gone quiet.",
        "MEDIC" to "What was?",
        "TOBAR" to "...I don't know. But it's not waiting any more."
    )
}
