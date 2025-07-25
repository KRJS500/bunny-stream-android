package net.bunnystream.android.demo.library.model

import net.bunnystream.api.upload.service.PauseState

sealed class VideoUploadUiState {

    object NotUploading : VideoUploadUiState()

    object Preparing : VideoUploadUiState()

    data class Uploading(val progress: Int, val pauseState: PauseState) : VideoUploadUiState()

    data class UploadError(val message: String) : VideoUploadUiState()
}
