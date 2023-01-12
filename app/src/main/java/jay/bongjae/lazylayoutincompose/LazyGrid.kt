package jay.bongjae.lazylayoutincompose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp


@Composable
fun LazyVerticalGridPractice() {
    val state = rememberLazyGridState()
    LazyVerticalGrid(
        columns = GridCells.Adaptive(64.dp),
        state = state,
    ) {
        item(span = {
            GridItemSpan(maxLineSpan)
        }) {
            Text(
                text = "제목", modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(16.dp)
            )
        }
        item {
            //성능 제약사항 / 하나의 아이템만 넣어야 한다.
            //divider 의 경우 예외
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = null
            )
        }
        itemsIndexed(dummy) { index, item ->
            Column(
                Modifier
                    .background(Color.LightGray)
            ) {
                Text(text = "name is ${item.name} / index : $index")
            }
        }
    }
}
