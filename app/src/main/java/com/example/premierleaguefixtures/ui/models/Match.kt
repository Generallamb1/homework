package com.example.premierleaguefixtures.ui.model

import java.time.LocalDateTime


data class Match(
    val matchNumber: Int,
    val roundNumber: Int,
    val dateUtc: String,
    val location: String,
    val homeTeam: String,
    val awayTeam: String,
    val group: String?,
    val homeTeamScore: Int,
    val awayTeamScore: Int
)
