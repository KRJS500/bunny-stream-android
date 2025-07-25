package net.bunnystream.bunnystreamplayer.model

data class SeekThumbnail(
    val seekThumbnailUrls: List<String>,
    val frameDurationPerThumbnail: Int,
    val totalThumbnailCount: Int,
    val thumbnailsPerImage: Int,
)