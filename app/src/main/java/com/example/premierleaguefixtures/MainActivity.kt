package com.example.premierleaguefixtures

import android.app.ActionBar
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.premierleaguefixtures.ui.model.Match
import com.example.premierleaguefixtures.ui.theme.PremierLeagueFixturesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PremierLeagueFixturesTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Column {
                        TopAppBar(
                            backgroundColor = Color.Cyan,
                            title = { Text("Matches") }
                        )
                        MatchesJson(
                            match =
                            Match(
                                1,
                                1,
                                "2021-08-13 19:00:00Z",
                                "Brentford Community Stadium",
                                "Brentford",
                                "Arsenal",
                                null,
                                2,
                                0
                            )
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun MatchesJson(match: Match) {
    Column {
        Text("Match number: ${match.matchNumber}")
        Text("Round number: ${match.roundNumber}")
        Text("Date UTC: ${match.dateUtc}")
        Text("Location: ${match.location}")
        Text("Home team: ${match.homeTeam}")
        Text("Away team: ${match.awayTeam}")
        Text("Group: ${match.group ?: "null"}")
        Text("Home team score: ${match.homeTeamScore}")
        Text("Away team score: ${match.awayTeamScore}")
    }
}