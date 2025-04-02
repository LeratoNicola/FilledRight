package com.example.filledright

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.filledright.ui.theme.FilledRightTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            var timeofday by remember {
                mutableStateOf("")
                
            }
            var suggested_meals by remember {
                mutableStateOf("")
                
            }
            
           Column {
             Text(text = "Welcome to Filled Right. Assisting with your dietary needs")
             Text(text = "Hello Hera. Excited to be with you on this journey")
               
               OutlinedTextField(
                   value = timeofday , 
                   onValueChange = { text ->
                       timeofday = text
                   },
                   placeholder = {
                       Text(text = "Enter time of day")
                   }
               )

               Row {
                   Button(onClick = { /*TODO*/ }) {
                      Text(text = "Suggest")

                   }
                   Button(onClick = {
                       timeofday = ""
                       suggested_meals = ""
                   }) {
                       Text(text = "Reset")

                   }
               }
               
               
               Text(text = "Your meal suggestions by $timeofday is:")
               Text(text = suggested_meals)

}                                      }


}                        }


