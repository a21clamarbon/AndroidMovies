package claudia.movies.network

import kotlinx.serialization.Serializable
import kotlinx.serialization.SerialName
@Serializable
data class MoviePhoto(

    @SerialName(value = "img_src")
    val imgSrc: String
)