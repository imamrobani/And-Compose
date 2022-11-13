package id.imrob.myfirstapp.ui.artspace

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import id.imrob.myfirstapp.R

@Preview(showBackground = true)
@Composable
fun ArtSpaceApp() {
    ArtSpaceContent()
}

@Composable
fun ArtSpaceContent(
    art: Art = Art(
        id = 1,
        image = R.drawable.lukisan1,
        title = "Ini adalah lukisan",
        artist = "Yono",
        releaseYear = "2021"
    )
) {

    var id by remember { mutableStateOf(1) }
    var art = getArtById(id)!!

    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 20.dp)
                .padding(top = 20.dp),
            painter = painterResource(id = art.image),
            contentDescription = "Art",
            contentScale = ContentScale.FillWidth,
        )
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp)
            ) {
                Text(text = art.title, fontSize = 20.sp)
                Text(text = buildAnnotatedString {
                    withStyle(
                        style = SpanStyle(
                            color = Color.Black,
                            fontWeight = FontWeight.Bold
                        )
                    ) {
                        append(art.artist)
                    }
                    withStyle(SpanStyle(color = Color.Black)) {
                        append(" (${art.releaseYear})")
                    }
                }, fontSize = 14.sp)
            }
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp)
        ) {
            Button(
                modifier = Modifier.weight(1f),
                onClick = {
                    if (id > 0) {
                        if (id == 1) {
                            id = 3
                        } else {
                            id -= 1
                        }
                    }
                }
            ) {
                Text(text = "Previous")
            }
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                modifier = Modifier.weight(1f),
                onClick = {
                    if (id < 4) {
                        if (id == 3) {
                            id = 1
                        } else {
                            id += 1
                        }
                    }
                }
            ) {
                Text(text = "Next")
            }
        }
    }
}

fun getArtById(id: Int): Art? {
    Source.arts.map { if (it.id == id) return it }
    return null
}