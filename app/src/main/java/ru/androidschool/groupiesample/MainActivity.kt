package ru.androidschool.groupiesample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.xwray.groupie.GroupAdapter
import com.xwray.groupie.kotlinandroidextensions.GroupieViewHolder
import com.xwray.groupie.kotlinandroidextensions.Item
import kotlinx.android.synthetic.main.activity_main.*
import ru.androidschool.groupiesample.items.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val movies = listOf(
            getPopularMovies(),
            getPopularGames(),
            getPopularMovies(),
            getPopularGames()
        )

        items_container.adapter = GroupAdapter<GroupieViewHolder>().apply { addAll(movies) }

    }

    private fun getPopularMovies(): Item {
        return MainCardContainer(
            "Список фильмов", "Лучшие фильмы", ::onItemClick,
            listOf(
                MovieItem(
                    MovieContent(
                        "Джокер",
                        "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg"
                    )
                ),
                MovieItem(
                    MovieContent(
                        "Бладшот",
                        "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg"
                    )
                ),
                MovieItem(
                    MovieContent(
                        "Джентельмены",
                        "https://upload.wikimedia.org/wikipedia/en/0/06/The_Gentlemen_poster.jpg"
                    )
                ),
                MovieItem(
                    MovieContent(
                        "Ford против Ferrari",
                        "https://upload.wikimedia.org/wikipedia/en/a/a4/Ford_v._Ferrari_%282019_film_poster%29.png"
                    )
                ),
                MovieItem(
                    MovieContent(
                        "Бойцовский клуб",
                        "https://upload.wikimedia.org/wikipedia/ru/8/8a/Fight_club.jpg"
                    )
                )
            )
        )
    }

    private fun getPopularGames(): Item {
        return MainCardContainer(
            "Список игр", "Популярные игры для Xbox One", ::onItemClick,
            listOf(
                SquareItem(
                    Content(
                        "https://upload.wikimedia.org/wikipedia/en/a/a5/Grand_Theft_Auto_V.png"
                    )
                ),
                SquareItem(
                    Content(
                        "https://upload.wikimedia.org/wikipedia/ru/thumb/a/a7/Red_Dead_Redemption.jpg/548px-Red_Dead_Redemption.jpg"
                    )
                ),
                SquareItem(
                    Content(
                        "https://upload.wikimedia.org/wikipedia/en/9/99/ACOdysseyCoverArt.png"
                    )
                ),
                SquareItem(
                    Content(
                        "https://upload.wikimedia.org/wikipedia/en/0/03/ACSyndicate.jpg"
                    )
                ),
                SquareItem(
                    Content(
                        "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg"
                    )
                )
            )
        )
    }

    fun onItemClick(url: String) {
    }
}
