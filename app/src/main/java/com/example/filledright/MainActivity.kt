package com.example.filledright

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
            
           Column(
               horizontalAlignment = Alignment.CenterHorizontally,
               modifier = Modifier.fillMaxSize()
           ) {
             Text(
                 text = "Welcome to Filled Right. Assisting with your dietary needs.",
                 fontSize = 30.sp,
                 fontWeight = FontWeight.Black
             )
               Divider()
               Spacer(modifier = Modifier.size(30.dp))

             Text(
                 text = "Hello Hera. Excited to be with you on this journey.",
                 fontSize = 20.sp,
                 fontWeight = FontWeight.Black

             )
               Divider()
               Spacer(modifier = Modifier.size(30.dp))
               
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
                   Button(onClick = {
                       suggested_meals = when(timeofday) {
                           "Morning" -> "Mabele porridge with peanutbutter (370kcal) OR Yoghurt and granola (355kcal)"
                           "Mid-morning" -> "Any fruit of your choice (100kcal)"
                           "Afternoon" -> "Chicken cajun salad (400kcal) OR Chicken sandwich with wholewheat bread (300kcal)"
                           "Mid-afternoon" -> "Dried fruit of your choice (480 kcal) OR Vegetable sticks with hummus (250 kcal)"
                           "Dinner" -> "Fish and roasted potatoes (393kcal) OR Bean stew with roti (450kcal)"
                           "After-dinner-snack" -> "Popcorn (90kcal) OR Flavoured tea (2kcal)"
                           else -> "Invalid input. Please try again."
                       }



                   }) {
                      Text(text = "Suggest")

                   }
                   Button(onClick = {
                       timeofday = ""
                       suggested_meals = ""
                   }) {
                       Text(text = "Reset")

                   }
               }
               
               Text(
                   text = "Meal Guide:",
                   fontSize = 15.sp,
                   fontWeight = FontWeight.Black

                   )
               Text(text = "1)Morning - Rise and Dine")
               Text(text = "2)Mid-morning - Tummy Teaser")
               Text(text = "3)Afternoon - Munch Break")
               Text(text = "4)Mid-afternoon - Snack Oclock")
               Text(text = "5)DinnerNightfall Grub")
               Text(text = "6)After-dinner-snack - Starlight Bites")


               Text(
                   text = "Your meal suggestions by $timeofday is:",
                   fontSize = 15.sp,
                   fontWeight = FontWeight.Black

               )
               Text(text = suggested_meals)

}                                      }


}                        }


