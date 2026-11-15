package com.example.model

enum class ZolavorTab {
    OVERVIEW,
    README_SOURCE
}

data class RepositoryInfo(
    val repositoryName: String = "thoalphqarsadown-stack/Zolavor-",
    val title: String = "Built with AI Studio",
    val subtitle: String = "The fastest path from prompt to production with Gemini.",
    val actionUrl: String = "https://aistudio.google.com/apps",
    val rawReadme: String = """
        |<div align="center">
        |
        |<img width="1200" height="475" alt="GHBanner" src="https://github.com/user-attachments/assets/0aa67016-6eaf-458a-adb2-6e31a0763ed6" />
        |
        |  <h1>Built with AI Studio</h2>
        |
        |  <p>The fastest path from prompt to production with Gemini.</p>
        |
        |  <a href="https://aistudio.google.com/apps">Start building</a>
        |
        |</div>
    """.trimMargin()
)
