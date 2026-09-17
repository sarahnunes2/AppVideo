package com.albedo.appvideo

import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var videoView: VideoView
    private lateinit var tvCredits: TextView
    private lateinit var btnPlayPause: Button

    private var isPlaying = false

    // Vídeos de domínio livre, carregados direto da internet
    private val video1Url = "https://www.w3schools.com/html/movie.mp4"
    private val video1Credit = "Big Buck Bunny — © Blender Foundation (CC BY 3.0)"

    private val video2Url =
        "https://interactive-examples.mdn.mozilla.net/media/cc0-videos/flower.mp4"
    private val video2Credit = "Flower — amostra da MDN/Mozilla (CC0, domínio público)"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        videoView = findViewById(R.id.videoView)
        tvCredits = findViewById(R.id.tvCredits)
        btnPlayPause = findViewById(R.id.btnPlayPause)

        val btnVideo1: Button = findViewById(R.id.btnVideo1)
        val btnVideo2: Button = findViewById(R.id.btnVideo2)
        val btnRestart: Button = findViewById(R.id.btnRestart)

        btnVideo1.setOnClickListener { loadVideo(video1Url, video1Credit) }
        btnVideo2.setOnClickListener { loadVideo(video2Url, video2Credit) }

        btnPlayPause.setOnClickListener {
            if (isPlaying) {
                videoView.pause()
                btnPlayPause.text = "Play"
            } else {
                videoView.start()
                btnPlayPause.text = "Pausar"
            }
            isPlaying = !isPlaying
        }

        btnRestart.setOnClickListener {
            videoView.seekTo(0)
            videoView.start()
            isPlaying = true
            btnPlayPause.text = "Pausar"
        }

        videoView.setOnCompletionListener {
            isPlaying = false
            btnPlayPause.text = "Play"
        }

        // Carrega o primeiro vídeo assim que a tela abre
        loadVideo(video1Url, video1Credit)
    }

    private fun loadVideo(url: String, credit: String) {
        videoView.setVideoURI(Uri.parse(url))
        videoView.setOnPreparedListener { videoView.start() }
        tvCredits.text = credit
        isPlaying = true
        btnPlayPause.text = "Pausar"
    }
}
