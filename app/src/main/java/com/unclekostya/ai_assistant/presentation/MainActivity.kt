package com.unclekostya.ai_assistant.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.unclekostya.ai_assistant.presentation.navigation.NavGraph
import com.unclekostya.ai_assistant.ui.theme.AIassistantTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            val navController = rememberNavController()
            AIassistantTheme {
                Scaffold(
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = {
                                Text(
                                    text = "AI - assistant"
                                )
                            },
                            actions = {

                            }
                        )
                    },
                    modifier = Modifier.Companion.fillMaxSize()
                ) { innerPadding ->
                    Surface(
                        modifier = Modifier.Companion
                            .padding(innerPadding)
                    ) {
                        NavGraph(
                            navController = navController
                        )
                    }
                }
            }
        }
    }
}