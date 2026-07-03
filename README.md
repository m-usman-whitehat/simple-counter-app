# Simple Counter

A lightweight Android counter app for tracking counts and tallies. Built with Kotlin, Material Design, and Android 15 (SDK 35) compatibility.

**Repository:** [github.com/m-usman-whitehat/simple-counter-app](https://github.com/m-usman-whitehat/simple-counter-app)

## Features

- One-tap counting with a large, easy-to-read display
- Quick reset to zero
- Edge-to-edge display with proper system bar inset handling (Android 15+)
- No permissions required — works fully offline
- No ads, no tracking, no data collection
- View Binding for type-safe UI access

## App Details

| Field | Value |
|---|---|
| **App name** | Simple Counter |
| **Package name** | `com.simplecounter.app` |
| **Version name** | 1.0.4 |
| **Version code** | 5 |
| **Min SDK** | 21 (Android 5.0) |
| **Target SDK** | 35 (Android 15) |
| **Compile SDK** | 35 |
| **Category** | Tools / Utilities |
| **Content rating** | Everyone |

## Tech Stack

| Component | Version |
|---|---|
| Kotlin | 1.9.24 |
| Android Gradle Plugin | 8.7.3 |
| Gradle | 8.9 |
| Java compatibility | 17 |
| Material Components | 1.12.0 |
| AndroidX Activity KTX | 1.10.1 |

## Requirements

- **Android Studio** Ladybug (2024.2.1) or newer recommended
- **JDK 17+** (JDK 21 embedded in Android Studio works)
- **Android SDK 35** installed via SDK Manager

## Getting Started

### 1. Clone the repository

```powershell
git clone https://github.com/m-usman-whitehat/simple-counter-app.git
cd simple-counter-app
```

### 2. Open in Android Studio

1. **File → Open** → select the project folder
2. Wait for Gradle sync to finish (Gradle 8.9 downloads on first sync)
3. Confirm **Gradle JDK** is set to **17+** under **Settings → Build, Execution, Deployment → Build Tools → Gradle**

### 3. Run the app

1. Select a device or emulator (API 21+)
2. Click **Run** (or press Shift+F10)

## Building a Release

Google Play requires a signed **Android App Bundle (AAB)**.

### Using Android Studio (recommended)

1. **Build → Generate Signed App Bundle or APK**
2. Select **Android App Bundle** → **Next**
3. Choose or create a keystore (save passwords securely — required for all future updates)
4. Select **release** build type → **Create**

Output: `app/release/app-release.aab`

### Using command line

```powershell
.\gradlew bundleRelease
```

Output: `app/build/outputs/bundle/release/app-release.aab`

## Publishing to Google Play

### Release notes (v1.0.4)

```
• Android 15 compatibility improvements
• Edge-to-edge display support with proper inset handling
• Updated build tools and dependencies for SDK 35
• Bug fixes and stability improvements
```

### Upload steps

1. Go to [Google Play Console](https://play.google.com/console)
2. Select **Simple Counter** (`com.simplecounter.app`)
3. **Release → Production** → **Create new release**
4. Upload `app-release.aab`
5. Confirm version shows **1.0.4 (5)** and target SDK **35**
6. Add release notes → **Review release** → **Start rollout to Production**

### Before publishing — checklist

- [ ] Store listing complete (name, descriptions, icon, 2+ screenshots)
- [ ] Privacy policy URL added (see `PRIVACY_POLICY.md`)
- [ ] Data safety form completed (no data collected)
- [ ] Content rating questionnaire done
- [ ] Signed AAB built with the correct keystore
- [ ] `versionCode` incremented for each new upload

### Updating to a new version

In `app/build.gradle`, bump both values before building:

```gradle
versionCode 6        // must be higher than any previous upload
versionName "1.0.5"
```

## Project Structure

```
app/
├── src/main/
│   ├── java/com/simplecounter/app/
│   │   └── MainActivity.kt          # Main counter logic & edge-to-edge setup
│   ├── res/
│   │   ├── layout/activity_main.xml # Counter UI layout
│   │   ├── values/                  # Strings, colors, themes
│   │   └── drawable/                # App icon assets
│   └── AndroidManifest.xml
└── build.gradle                     # App-level build config
```

## Recent Changes (v1.0.4)

- **Android 15 edge-to-edge** — `enableEdgeToEdge()` with system bar and display cutout inset handling
- **Theme** — switched to `Theme.MaterialComponents.DayNight.NoActionBar` for edge-to-edge compatibility
- **Build tooling** — AGP 8.7.3, Gradle 8.9, Java 17
- **Dependencies** — updated AndroidX libraries for SDK 35 support
- **View Binding** — enabled for safer view access in `MainActivity`

## Store Listing Content

### Short description (80 characters max)

```
A simple and lightweight counter app for tracking counts and tallies
```

### Full description

```
Simple Counter is a clean and easy-to-use counting app perfect for tracking tallies, counts, and numbers.

Features:
• Simple one-tap counting
• Large, easy-to-read display
• Quick reset function
• Lightweight and fast
• No ads, no tracking, no permissions required
• Works offline

Perfect for:
• Keeping track of daily counts
• Tallying items
• Counting repetitions
• Any simple counting task

Simple Counter - Count made simple!
```

## Related Documentation

| File | Description |
|---|---|
| `PRIVACY_POLICY.md` | Privacy policy for Play Console |
| `QUICK_START.md` | Quick publishing checklist |
| `PUBLISHING_STEPS.md` | Detailed Play Console guide |
| `APP_SUMMARY.md` | App overview and store content |

## Troubleshooting

| Issue | Fix |
|---|---|
| Gradle sync fails | Set Gradle JDK to 17+ in Android Studio settings |
| Blank screen on launch | Clean rebuild (**Build → Clean Project → Rebuild**), uninstall app from device, run again |
| `compileSdk 35` warning | Already resolved — project uses AGP 8.7.3 |
| Deobfuscation file warning | Safe to ignore — `minifyEnabled` is `false` |
| Edge-to-edge Play Console warning | Advisory only; comes from Material library internals, does not block publishing |

## License

This project is provided as-is for personal and commercial use.
