package com.example.roomcronoapp.views

import android.widget.Space
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.roomcronoapp.components.FloatButton
import com.example.roomcronoapp.components.MainIconButton
import com.example.roomcronoapp.components.MainTitle
import com.example.roomcronoapp.ui.theme.BabyPowder
import com.example.roomcronoapp.ui.theme.Coral
import com.example.roomcronoapp.ui.theme.RaisinBlack

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DevView(navController: NavController){
    Scaffold(
        contentColor =  BabyPowder,
        containerColor = RaisinBlack,
        topBar = {
            CenterAlignedTopAppBar(
                title = { MainTitle(title = "DEVELOPER") },
                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                    containerColor = Coral
                ),
                navigationIcon = {
                    MainIconButton(icon = Icons.Default.ArrowBack) {
                        navController.popBackStack()
                    }
                }
            )
        }
    ) {
        ContentDevView(it = it, navController = navController)
    }
}

@Composable
fun ContentDevView(it: PaddingValues, navController: NavController){

    Column (modifier = Modifier
        .padding(it)
        .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = "Eliel Andrade Matos Godoy",
            textAlign = TextAlign.Center,
            fontSize = 24.sp
        )
        Spacer(modifier = Modifier.height(10.dp))
        Text(
            text = "Feito baseado no arquivo disponibilizado pelo professor Marcelo Collado",
            textAlign = TextAlign.Center,
            fontSize = 18.sp
        )
    }

}