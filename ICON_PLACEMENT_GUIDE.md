# Where to Place Launcher Icons in Your Android Project

## 📁 Folder Structure

Place your icons in these specific folders:

```
app/src/main/res/
├── mipmap-mdpi/
│   ├── ic_launcher.png (48x48)
│   └── ic_launcher_round.png (48x48)
├── mipmap-hdpi/
│   ├── ic_launcher.png (72x72)
│   └── ic_launcher_round.png (72x72)
├── mipmap-xhdpi/
│   ├── ic_launcher.png (96x96)
│   └── ic_launcher_round.png (96x96)
├── mipmap-xxhdpi/
│   ├── ic_launcher.png (144x144)
│   └── ic_launcher_round.png (144x144)
└── mipmap-xxxhdpi/
    ├── ic_launcher.png (192x192)
    └── ic_launcher_round.png (192x192)
```

---

## 📍 Exact File Locations

### Current Project Path:
`D:\android-pro\app\src\main\res\`

### You Need to Create/Update:

1. **mdpi (48x48):**
   - `app/src/main/res/mipmap-mdpi/ic_launcher.png`
   - `app/src/main/res/mipmap-mdpi/ic_launcher_round.png`

2. **hdpi (72x72):**
   - `app/src/main/res/mipmap-hdpi/ic_launcher.png`
   - `app/src/main/res/mipmap-hdpi/ic_launcher_round.png`

3. **xhdpi (96x96):**
   - `app/src/main/res/mipmap-xhdpi/ic_launcher.png`
   - `app/src/main/res/mipmap-xhdpi/ic_launcher_round.png`

4. **xxhdpi (144x144):**
   - `app/src/main/res/mipmap-xxhdpi/ic_launcher.png`
   - `app/src/main/res/mipmap-xxhdpi/ic_launcher_round.png`

5. **xxxhdpi (192x192):**
   - `app/src/main/res/mipmap-xxxhdpi/ic_launcher.png`
   - `app/src/main/res/mipmap-xxxhdpi/ic_launcher_round.png`

---

## 🔧 Step-by-Step Instructions

### Step 1: Create Folders (if they don't exist)

In Android Studio:
1. Right-click on `app/src/main/res/`
2. New → Android Resource Directory
3. Resource type: `mipmap`
4. Available qualifiers: Select density → mdpi, hdpi, xhdpi, xxhdpi, xxxhdpi
5. Create each folder separately

**OR** manually create folders:
- `app/src/main/res/mipmap-mdpi/`
- `app/src/main/res/mipmap-hdpi/`
- `app/src/main/res/mipmap-xhdpi/`
- `app/src/main/res/mipmap-xxhdpi/`
- `app/src/main/res/mipmap-xxxhdpi/`

### Step 2: Place Icon Files

For each density folder, add:

1. **ic_launcher.png** (square icon)
2. **ic_launcher_round.png** (round icon - same design but round)

### Step 3: File Naming

**Important:** Files must be named exactly:
- `ic_launcher.png` (not `icon.png` or `launcher.png`)
- `ic_launcher_round.png` (for round icons)

---

## 📋 Quick Checklist

- [ ] Created `mipmap-mdpi` folder
- [ ] Created `mipmap-hdpi` folder
- [ ] Created `mipmap-xhdpi` folder
- [ ] Created `mipmap-xxhdpi` folder
- [ ] Created `mipmap-xxxhdpi` folder
- [ ] Added `ic_launcher.png` to each folder (correct sizes)
- [ ] Added `ic_launcher_round.png` to each folder (round versions)
- [ ] Files are PNG format
- [ ] File names are exactly `ic_launcher.png` and `ic_launcher_round.png`

---

## 🎨 Icon Sizes Summary

| Density | Folder | Size | File Name |
|---------|--------|------|-----------|
| mdpi | mipmap-mdpi | 48x48 | ic_launcher.png |
| hdpi | mipmap-hdpi | 72x72 | ic_launcher.png |
| xhdpi | mipmap-xhdpi | 96x96 | ic_launcher.png |
| xxhdpi | mipmap-xxhdpi | 144x144 | ic_launcher.png |
| xxxhdpi | mipmap-xxxhdpi | 192x192 | ic_launcher.png |

**Plus round versions:** `ic_launcher_round.png` in each folder

---

## ✅ After Placing Icons

1. **Sync Project:** File → Sync Project with Gradle Files
2. **Clean Build:** Build → Clean Project
3. **Rebuild:** Build → Rebuild Project
4. **Test:** Run app on device/emulator to see icon
5. **Build Release:** Build → Generate Signed Bundle / APK

---

## 🔍 Verify Icons Are Working

1. **In AndroidManifest.xml**, check:
   ```xml
   android:icon="@mipmap/ic_launcher"
   android:roundIcon="@mipmap/ic_launcher_round"
   ```

2. **In Android Studio:**
   - Open `app/src/main/res/`
   - You should see all `mipmap-*` folders
   - Each should contain `ic_launcher.png` and `ic_launcher_round.png`

3. **Run app:**
   - Install on device/emulator
   - Check launcher icon appears correctly

---

## 💡 Tips

- **Use same design** for all sizes (just different resolutions)
- **Round icons** should be the same design but in round shape
- **PNG format only** (not JPG, SVG, or other formats)
- **Exact file names** are required (`ic_launcher.png`)

---

## 🚀 Quick Method: Use Android Asset Studio

1. Go to: https://romannurik.github.io/AndroidAssetStudio/icons-launcher.html
2. Upload your 512x512 icon
3. Download the zip file
4. Extract the `res` folder
5. Copy all `mipmap-*` folders to `app/src/main/res/`
6. Done! All icons are in the right place

---

**After placing icons, rebuild your app and upload new AAB to fix the rejection!**

