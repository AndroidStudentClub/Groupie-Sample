package ru.androidschool.groupiesample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.xwray.groupie.GroupieAdapter
import com.xwray.groupie.viewbinding.BindableItem
import ru.androidschool.groupiesample.databinding.ActivityMainBinding
import ru.androidschool.groupiesample.databinding.ItemCardBinding
import ru.androidschool.groupiesample.items.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val movies = listOf(
            getPopularMovies(),
            getPopularGames(),
            getPopularMovies(),
            getPopularGames()
        )

        val adapter = GroupieAdapter().apply { addAll(movies) }
        binding.itemsContainer.layoutManager = LinearLayoutManager(this)
        binding.itemsContainer.adapter = adapter
    }

    private fun getPopularMovies(): BindableItem<ItemCardBinding> {
        return MainCardContainer(
            "Movies", "Trending Now", ::onItemClick,
            listOf(
                MovieItem(
                    MovieContent(
                        "Joker",
                        "https://upload.wikimedia.org/wikipedia/en/e/e1/Joker_%282019_film%29_poster.jpg"
                    )
                ),
                MovieItem(
                    MovieContent(
                        "Bloodshot",
                        "https://upload.wikimedia.org/wikipedia/en/4/45/Bloodshot_-_official_film_poster.jpeg"
                    )
                ),
                MovieItem(
                    MovieContent(
                        "The Gentlemen",
                        "https://upload.wikimedia.org/wikipedia/en/0/06/The_Gentlemen_poster.jpg"
                    )
                ),
                MovieItem(
                    MovieContent(
                        "Ford v Ferrari",
                        "https://upload.wikimedia.org/wikipedia/en/a/a4/Ford_v._Ferrari_%282019_film_poster%29.png"
                    )
                ),
                MovieItem(
                    MovieContent(
                        "Fight Club",
                        "https://upload.wikimedia.org/wikipedia/ru/8/8a/Fight_club.jpg"
                    )
                )
            )
        )
    }

    private fun getPopularGames(): BindableItem<*> {
        return MainCardContainer(
            "Games", "For Xbox One", ::onItemClick,
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
