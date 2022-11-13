package id.imrob.myfirstapp.ui.artspace

import id.imrob.myfirstapp.R

object Source {

    val arts = listOf<Art>(
        Art(
            id = 1,
            image = R.drawable.lukisan1,
            title = "Ini adalah lukisan 1",
            artist = "Yono",
            releaseYear = "2020"
        ),
        Art(
            id = 2,
            image = R.drawable.lukisan2,
            title = "Ini adalah lukisan 2",
            artist = "Budi",
            releaseYear = "2021"
        ),
        Art(
            id = 3,
            image = R.drawable.lukisan3,
            title = "Ini adalah lukisan 3",
            artist = "Adi",
            releaseYear = "2022"
        )
    )
}