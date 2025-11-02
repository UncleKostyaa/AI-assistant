package com.unclekostya.ai_assistant.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.unclekostya.ai_assistant.presentation.chat.ChatScreen
import com.unclekostya.ai_assistant.presentation.login.LoginScreen
import com.unclekostya.ai_assistant.presentation.register.RegisterScreen

@Composable
fun NavGraph(
    navController: NavHostController
) {
    NavHost(startDestination = "login", navController = navController) {
        composable("login") {
            LoginScreen()
        }
        composable("chat") {
            ChatScreen()
        }
        composable("register") {
            RegisterScreen()
        }

    }
}