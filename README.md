# Simple Counter - Emergency Google Play Publishing Guide

## ⚠️ URGENT: Account Closure Prevention

Your Google Play Developer account is at risk of closure (5 days remaining). This app is ready to publish immediately.

**App Name:** Simple Counter  
**Package:** com.simplecounter.app  
**Purpose:** A simple, lightweight counter app for tracking counts and tallies

## ✅ Immediate Action Steps

### Step 1: Verify Account Details (CRITICAL - Do First!)
1. Go to [Google Play Console](https://play.google.com/console)
2. Navigate to **Settings** → **Account details**
3. Verify your **email address** and **phone number** are confirmed
4. Complete any pending verification steps

### Step 2: Build the Release APK/AAB

#### Option A: Using Android Studio (Recommended)
1. Open Android Studio
2. Open this project folder (`android-pro`)
3. Wait for Gradle sync to complete
4. Go to **Build** → **Generate Signed Bundle / APK**
5. Select **Android App Bundle** (recommended by Google Play)
6. Create a new keystore or use existing one
7. Select **release** build variant
8. Click **Finish**

#### Option B: Using Command Line
```bash
# Windows PowerShell
.\gradlew bundleRelease

# The AAB file will be at: app/build/outputs/bundle/release/app-release.aab
```

### Step 3: Create App in Play Console
1. Go to [Google Play Console](https://play.google.com/console)
2. Click **Create app**
3. Fill in:
   - **App name**: Simple Counter
   - **Default language**: Your language
   - **App or game**: App
   - **Free or paid**: Free
   - **Declarations**: Accept all required declarations
4. Click **Create app**

### Step 4: Complete Store Listing (Minimum Required)
1. Go to **Store presence** → **Store listing**
2. Fill in:
   - **App name**: Simple Counter
   - **Short description**: A simple and lightweight counter app for tracking counts and tallies
   - **Full description**: 
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
   - **App icon**: Upload a 512x512 PNG icon (create one or use a simple colored square)
   - **Feature graphic**: Upload a 1024x500 PNG image (optional but recommended)
   - **Screenshots**: Upload at least 2 screenshots (phone screenshots)
     - Minimum: 1 phone screenshot
     - Recommended: 2-8 screenshots

### Step 5: Complete Content Rating
1. Go to **Policy** → **App content**
2. Click **Start questionnaire**
3. Answer questions (this app is safe for all ages)
4. Complete the rating process

### Step 6: Set Up Pricing & Distribution
1. Go to **Pricing & distribution**
2. Select **Free**
3. Select all countries (or your target countries)
4. Accept content guidelines
5. Click **Save**

### Step 7: Create Release
1. Go to **Production** → **Create new release**
2. Upload your **AAB file** (from Step 2)
3. Add **Release name**: Version 1.0.0
4. Add **Release notes**: 
   ```
   Initial release
   - Simple counter app for tracking counts and tallies
   - Clean and intuitive interface
   - One-tap counting with reset function
   - Lightweight and fast
   ```
5. Click **Save**
6. Click **Review release**
7. Review and click **Start rollout to Production**

### Step 8: Submit for Review
1. Complete any remaining required sections
2. Click **Submit for review** button
3. Wait for Google's review (usually 1-3 days, but can be faster)

## 📱 App Details

- **App Name**: Simple Counter
- **Package Name**: com.simplecounter.app
- **Version Code**: 1
- **Version Name**: 1.0.0
- **Min SDK**: 21 (Android 5.0)
- **Target SDK**: 34 (Android 14)
- **Category**: Tools / Utilities
- **Content Rating**: Everyone (no age restrictions)

## 🎯 Quick Checklist

- [ ] Email and phone verified in Play Console
- [ ] App created in Play Console
- [ ] Store listing completed (name, description, icon, screenshots)
- [ ] Content rating completed
- [ ] Pricing & distribution set
- [ ] Release AAB uploaded
- [ ] App submitted for review

## ⏱️ Time Estimate

- **Account verification**: 5-10 minutes
- **Building AAB**: 5-10 minutes
- **Play Console setup**: 30-60 minutes
- **Total**: ~1-2 hours

## 🚨 Important Notes

1. **Screenshots Required**: You MUST add screenshots. Take screenshots of the app running on an emulator or device.
2. **App Icon**: Create a simple 512x512 PNG icon. You can use any image editor or online tool.
3. **Privacy Policy**: A privacy policy is included in PRIVACY_POLICY.md. If Google asks for a privacy policy URL, you can host it on GitHub Pages, Google Sites, or paste the content directly in Play Console.
4. **Review Time**: Google Play review typically takes 1-3 days, but can be faster for simple apps.

## 🔧 Building Screenshots

To create screenshots:
1. Run the app on an emulator or device
2. Use Android Studio's screenshot tool or device screenshot
3. Ensure screenshots show the app interface clearly
4. Minimum size: 320px height, 16:9 or 9:16 aspect ratio

## 📞 Support

If you encounter issues:
- Check Play Console for specific error messages
- Ensure all required fields are completed
- Verify your account is in good standing

## ⚡ Fastest Path to Publication

1. Verify account (5 min)
2. Build AAB (10 min)
3. Create app + upload AAB (15 min)
4. Complete minimum store listing (20 min)
5. Submit (5 min)

**Total: ~55 minutes**

---

**Good luck! Your account should be safe once the app is submitted for review.**

