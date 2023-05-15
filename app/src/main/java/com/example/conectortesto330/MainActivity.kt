package com.example.conectortesto330

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.conectortesto330.ui.theme.ConectorTesto330Theme

class MainActivity : ComponentActivity() {

    val TenantID = null;
    val orgURL = null;
    val AppId = null;
    val EntityName = null;
    val EntityID = null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ConectorTesto330Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    if(Intent.ACTION_SEND == intent.action && intent.type == "text/xml"){
                        Funciona()
                    }
                }
            }
        }
    }
    @Composable
    fun Funciona(){
       val sharedText = remember{ mutableStateOf(intent.getStringExtra(Intent.EXTRA_TEXT)) }
        if(sharedText != null){
            Text(text = sharedText.toString())
        }
        else {
            Text(text = "El cuerpo esta vacío")
        }
    }

}

