# Zolavor (Android)

Android (Kotlin + Jetpack Compose) rewrite of the imported `thoalphqarsadown-stack/Zolavor-` repository.

## Overview

The imported repository contained only a starter `README.md` ("Built with AI Studio — The fastest path from prompt to production with Gemini" with a link to `https://aistudio.google.com/apps`). This Android application preserves those elements in a Material 3 Jetpack Compose UI:

- **Overview Tab**: Hero banner, repository headline and subtitle, **Start building** external browser action, clipboard copy action, and a **Repository Snapshot** showing the imported file count and target runtime.
- **README.md Tab**: Formatted source view of the original `README.md` with one-tap copy support.

## Tech Stack

- Kotlin & Jetpack Compose (Material 3, Edge-to-Edge)
- Gradle Kotlin DSL (`AGP 9.1.1`, `compileSdk 36`, `minSdk 24`)
- Local typography (`Space Grotesk` and `Plus Jakarta Sans`) and custom adaptive launcher icons
