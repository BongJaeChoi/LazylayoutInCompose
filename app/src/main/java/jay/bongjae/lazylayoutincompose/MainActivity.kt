package jay.bongjae.lazylayoutincompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import jay.bongjae.lazylayoutincompose.ui.theme.LazylayoutInComposeTheme
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LazylayoutInComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    ScrollStateLazyColumn()
                    LazyVerticalGridPractice()
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LazylayoutInComposeTheme {
        Greeting("Android")
    }
}

@Composable
fun ScrollStateLazyColumn() {
    val state = rememberLazyListState()
    val coroutineScope = rememberCoroutineScope()
    Box {
        LazyColumn(state = state) {
            items(dummy) { item ->
                Row(Modifier.padding(4.dp)) {
                    Text(item.name)
                    Text("${item.age}")
                }
            }
        }
        OutlinedButton(onClick = { coroutineScope.launch { state.animateScrollToItem(0) } }) {
            Text("맨위로")
        }
    }
}


val dummy = listOf(
    Data("가", 1),
    Data("나", 1),
    Data("다", 1),
    Data("라", 1),
    Data("마", 1),
    Data("바", 1),
    Data("사", 1),
    Data("가", 1),
    Data("나", 1),
    Data("다", 1),
    Data("라", 1),
    Data("마", 1),
    Data("바", 1),
    Data("사", 1),
    Data("가", 1),
    Data("나", 1),
    Data("다", 1),
    Data("라", 1),
    Data("마", 1),
    Data("바", 1),
    Data("사", 1),
    Data("가", 1),
    Data("나", 1),
    Data("다", 1),
    Data("라", 1),
    Data("마", 1),
    Data("바", 1),
    Data("사", 1),
    Data("가", 1),
    Data("나", 1),
    Data("다", 1),
    Data("라", 1),
    Data("마", 1),
    Data("바", 1),
    Data("사", 1),
    Data("가", 1),
    Data("나", 1),
    Data("다", 1),
    Data("라", 1),
    Data("마", 1),
    Data("바", 1),
    Data("사", 1),
)
