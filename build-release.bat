@echo off
echo Building Android App Bundle for Google Play...
echo.

REM Check if gradlew exists
if not exist "gradlew.bat" (
    echo ERROR: gradlew.bat not found!
    echo Please open this project in Android Studio first to generate Gradle wrapper files.
    echo.
    pause
    exit /b 1
)

echo Running Gradle build...
call gradlew.bat bundleRelease

if %ERRORLEVEL% EQU 0 (
    echo.
    echo ========================================
    echo BUILD SUCCESSFUL!
    echo ========================================
    echo.
    echo Your AAB file is located at:
    echo app\build\outputs\bundle\release\app-release.aab
    echo.
    echo Next steps:
    echo 1. Go to Google Play Console
    echo 2. Create a new app (if not done)
    echo 3. Upload this AAB file
    echo 4. Complete store listing and submit
    echo.
) else (
    echo.
    echo ========================================
    echo BUILD FAILED!
    echo ========================================
    echo.
    echo Please check the error messages above.
    echo Make sure you have Android SDK installed.
    echo.
)

pause

