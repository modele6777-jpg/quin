package io.sentry.android.core;

import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import defpackage.c6c;
import defpackage.pk1;
import io.sentry.q5;
import io.sentry.q6;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class u0 {
    public static volatile u0 i;
    public static final io.sentry.util.a j = new io.sentry.util.a();
    public final Context a;
    public final SentryAndroidOptions b;
    public final o0 c;
    public final Boolean d;
    public final c6c e;
    public final pk1 f;
    public final io.sentry.protocol.q g;
    public final Long h;

    public u0(Context context, SentryAndroidOptions sentryAndroidOptions) {
        String str;
        c6c c6cVar;
        pk1 pk1Var;
        Bundle bundle;
        this.a = context;
        this.b = sentryAndroidOptions;
        this.c = new o0(sentryAndroidOptions.getLogger());
        io.sentry.android.core.internal.util.f.c.a();
        io.sentry.protocol.q qVar = new io.sentry.protocol.q();
        qVar.a = "Android";
        qVar.b = Build.VERSION.RELEASE;
        qVar.d = Build.DISPLAY;
        io.sentry.z0 logger = sentryAndroidOptions.getLogger();
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (file.canRead()) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                try {
                    String line = bufferedReader.readLine();
                    bufferedReader.close();
                    property = line;
                } catch (Throwable th) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                logger.d(q5.ERROR, "Exception while attempting to read kernel information", e);
            }
        }
        if (property != null) {
            qVar.e = property;
        }
        if (sentryAndroidOptions.isEnableRootCheck()) {
            qVar.f = Boolean.valueOf(new io.sentry.android.core.internal.util.i(this.a, sentryAndroidOptions.getLogger(), this.c).a());
        }
        this.g = qVar;
        this.d = this.c.a();
        io.sentry.z0 logger2 = sentryAndroidOptions.getLogger();
        boolean z = false;
        try {
            PackageInfo packageInfoE = p0.e(context, this.c);
            PackageManager packageManager = context.getPackageManager();
            if (packageInfoE == null || packageManager == null) {
                c6cVar = null;
            } else {
                str = packageInfoE.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    c6cVar = new c6c(installerPackageName == null, installerPackageName);
                } catch (IllegalArgumentException unused) {
                    logger2.i(q5.DEBUG, "%s package isn't installed.", str);
                    c6cVar = null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        this.e = c6cVar;
        o0 o0Var = this.c;
        o0Var.getClass();
        ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) p0.d.a(context) : (ApplicationInfo) p0.e.a(context);
        PackageInfo packageInfoE2 = p0.e(context, o0Var);
        if (packageInfoE2 != null) {
            String[] strArr = packageInfoE2.splitNames;
            if (applicationInfo != null && (bundle = applicationInfo.metaData) != null) {
                z = bundle.getBoolean("com.android.vending.splits.required");
            }
            pk1Var = new pk1(z, strArr);
        } else {
            pk1Var = null;
        }
        this.f = pk1Var;
        ActivityManager.MemoryInfo memoryInfoC = p0.c(context, sentryAndroidOptions.getLogger());
        if (memoryInfoC != null) {
            this.h = Long.valueOf(memoryInfoC.totalMem);
        } else {
            this.h = null;
        }
    }

    public static Float b(Intent intent, q6 q6Var) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th) {
            q6Var.getLogger().d(q5.ERROR, "Error getting device battery level.", th);
            return null;
        }
    }

    public static u0 c(Context context, SentryAndroidOptions sentryAndroidOptions) {
        if (i == null) {
            io.sentry.util.a aVar = j;
            aVar.b();
            try {
                if (i == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    i = new u0(context, sentryAndroidOptions);
                }
                aVar.close();
            } catch (Throwable th) {
                try {
                    aVar.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return i;
    }

    public static Boolean d(Intent intent, q6 q6Var) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (intExtra != 1 && intExtra != 2) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th) {
            q6Var.getLogger().d(q5.ERROR, "Error getting device charging state.", th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0247  */
    /* JADX WARN: Code duplicated, block: B:103:0x0251 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:104:0x0253 A[Catch: all -> 0x0292, TryCatch #2 {all -> 0x0292, blocks: (B:101:0x024b, B:104:0x0253, B:106:0x0259, B:108:0x025d, B:117:0x0275, B:112:0x0264, B:115:0x026b, B:121:0x0288, B:118:0x0278), top: B:144:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:105:0x0258  */
    /* JADX WARN: Code duplicated, block: B:108:0x025d A[Catch: all -> 0x0292, TryCatch #2 {all -> 0x0292, blocks: (B:101:0x024b, B:104:0x0253, B:106:0x0259, B:108:0x025d, B:117:0x0275, B:112:0x0264, B:115:0x026b, B:121:0x0288, B:118:0x0278), top: B:144:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:110:0x0261  */
    /* JADX WARN: Code duplicated, block: B:111:0x0262  */
    /* JADX WARN: Code duplicated, block: B:118:0x0278 A[Catch: all -> 0x0292, TryCatch #2 {all -> 0x0292, blocks: (B:101:0x024b, B:104:0x0253, B:106:0x0259, B:108:0x025d, B:117:0x0275, B:112:0x0264, B:115:0x026b, B:121:0x0288, B:118:0x0278), top: B:144:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:121:0x0288 A[Catch: all -> 0x0292, TRY_LEAVE, TryCatch #2 {all -> 0x0292, blocks: (B:101:0x024b, B:104:0x0253, B:106:0x0259, B:108:0x025d, B:117:0x0275, B:112:0x0264, B:115:0x026b, B:121:0x0288, B:118:0x0278), top: B:144:0x024b }] */
    /* JADX WARN: Code duplicated, block: B:124:0x029f  */
    /* JADX WARN: Code duplicated, block: B:138:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:140:0x02a2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:148:0x0120 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:152:0x0069 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0285 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:25:0x008f  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:41:0x0101  */
    /* JADX WARN: Code duplicated, block: B:43:0x010d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0116  */
    /* JADX WARN: Code duplicated, block: B:54:0x013c  */
    /* JADX WARN: Code duplicated, block: B:57:0x014e  */
    /* JADX WARN: Code duplicated, block: B:64:0x0186  */
    /* JADX WARN: Code duplicated, block: B:65:0x018d  */
    /* JADX WARN: Code duplicated, block: B:67:0x0193  */
    /* JADX WARN: Code duplicated, block: B:70:0x01a8 A[Catch: all -> 0x01b1, TRY_LEAVE, TryCatch #1 {all -> 0x01b1, blocks: (B:68:0x019f, B:70:0x01a8), top: B:142:0x019f }] */
    /* JADX WARN: Code duplicated, block: B:74:0x01be  */
    /* JADX WARN: Code duplicated, block: B:78:0x01d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x01da  */
    /* JADX WARN: Code duplicated, block: B:88:0x0200  */
    public final io.sentry.protocol.h a(boolean z, boolean z2) {
        io.sentry.protocol.g gVar;
        Boolean bool;
        io.sentry.z0 logger;
        DisplayMetrics displayMetrics;
        Date date;
        TimeZone timeZone;
        String strA;
        Locale locale;
        ArrayList arrayListA;
        boolean zIsCollectExternalStorageContext;
        IntentFilter intentFilter;
        Intent intentRegisterReceiver;
        int i2;
        Boolean bool2;
        ActivityManager.MemoryInfo memoryInfoC;
        File dataDirectory;
        File externalFilesDir;
        StatFs statFs;
        Long lValueOf;
        File[] externalFilesDirs;
        File file;
        String absolutePath;
        int length;
        int i3;
        Long lValueOf2;
        Long lValueOf3;
        Float fValueOf;
        int intExtra;
        LocaleList locales;
        Locale locale2;
        io.sentry.protocol.g gVar2;
        Context context = this.a;
        io.sentry.protocol.h hVar = new io.sentry.protocol.h();
        hVar.b = Build.MANUFACTURER;
        hVar.c = Build.BRAND;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        hVar.d = p0.b(sentryAndroidOptions.getLogger());
        hVar.e = Build.MODEL;
        hVar.f = Build.ID;
        hVar.g = Build.SUPPORTED_ABIS;
        this.c.getClass();
        if (Build.VERSION.SDK_INT >= 31) {
            hVar.W0 = Build.SOC_MANUFACTURER + " " + Build.SOC_MODEL;
        }
        Long lValueOf4 = null;
        try {
            try {
                try {
                    int i4 = context.getResources().getConfiguration().orientation;
                    if (i4 != 1) {
                        if (i4 != 2) {
                            gVar = null;
                        } else {
                            gVar2 = io.sentry.protocol.g.LANDSCAPE;
                        }
                        if (gVar == null) {
                            try {
                                sentryAndroidOptions.getLogger().i(q5.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                                gVar = null;
                            } catch (Throwable th) {
                                th = th;
                                sentryAndroidOptions.getLogger().d(q5.ERROR, "Error getting device orientation.", th);
                            }
                        }
                        hVar.y = gVar;
                        bool = this.d;
                        if (bool != null) {
                            hVar.z = bool;
                        }
                        logger = sentryAndroidOptions.getLogger();
                        displayMetrics = context.getResources().getDisplayMetrics();
                        if (displayMetrics != null) {
                            hVar.J0 = Integer.valueOf(displayMetrics.widthPixels);
                            hVar.K0 = Integer.valueOf(displayMetrics.heightPixels);
                            hVar.L0 = Float.valueOf(displayMetrics.density);
                            hVar.M0 = Integer.valueOf(displayMetrics.densityDpi);
                        }
                        date = new Date(System.currentTimeMillis() - SystemClock.elapsedRealtime());
                        hVar.N0 = date;
                        if (Build.VERSION.SDK_INT >= 33) {
                            locales = context.getResources().getConfiguration().getLocales();
                            if (locales.isEmpty()) {
                                timeZone = TimeZone.getDefault();
                            } else {
                                locale2 = locales.get(0);
                                if (locale2.getUnicodeLocaleType("tz") != null) {
                                    timeZone = Calendar.getInstance(locale2).getTimeZone();
                                } else {
                                    timeZone = TimeZone.getDefault();
                                }
                            }
                        } else {
                            timeZone = TimeZone.getDefault();
                        }
                        hVar.O0 = timeZone;
                        if (hVar.P0 == null) {
                            try {
                                strA = z0.a(context);
                            } catch (Throwable th2) {
                                sentryAndroidOptions.getLogger().d(q5.ERROR, "Error getting installationId.", th2);
                                strA = null;
                            }
                            hVar.P0 = strA;
                        }
                        locale = Locale.getDefault();
                        if (hVar.Q0 == null) {
                            hVar.Q0 = locale.toString();
                        }
                        arrayListA = io.sentry.android.core.internal.util.f.c.a();
                        if (!arrayListA.isEmpty()) {
                            hVar.U0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
                            hVar.T0 = Integer.valueOf(arrayListA.size());
                        }
                        hVar.X = this.h;
                        if (z && sentryAndroidOptions.isCollectAdditionalContext()) {
                            zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
                            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
                            if (Build.VERSION.SDK_INT >= 33) {
                                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
                            } else {
                                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
                            }
                            if (intentRegisterReceiver != null) {
                                hVar.v = b(intentRegisterReceiver, sentryAndroidOptions);
                                hVar.w = d(intentRegisterReceiver, sentryAndroidOptions);
                                try {
                                    intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                                    if (intExtra != -1) {
                                        fValueOf = Float.valueOf(intExtra / 10.0f);
                                    } else {
                                        fValueOf = null;
                                    }
                                } catch (Throwable th3) {
                                    sentryAndroidOptions.getLogger().d(q5.ERROR, "Error getting battery temperature.", th3);
                                }
                                hVar.S0 = fValueOf;
                            }
                            i2 = t0.a[sentryAndroidOptions.getConnectionStatusProvider().s0().ordinal()];
                            if (i2 != 1) {
                                bool2 = Boolean.FALSE;
                            } else if (i2 != 2) {
                                bool2 = null;
                            } else {
                                bool2 = Boolean.TRUE;
                            }
                            hVar.x = bool2;
                            memoryInfoC = p0.c(context, sentryAndroidOptions.getLogger());
                            if (memoryInfoC != null && z2) {
                                hVar.Y = Long.valueOf(memoryInfoC.availMem);
                                hVar.E0 = Boolean.valueOf(memoryInfoC.lowMemory);
                            }
                            dataDirectory = Environment.getDataDirectory();
                            if (dataDirectory != null) {
                                StatFs statFs2 = new StatFs(dataDirectory.getPath());
                                try {
                                    lValueOf2 = Long.valueOf(statFs2.getBlockCountLong() * statFs2.getBlockSizeLong());
                                } catch (Throwable th4) {
                                    sentryAndroidOptions.getLogger().d(q5.ERROR, "Error getting total internal storage amount.", th4);
                                    lValueOf2 = null;
                                }
                                hVar.F0 = lValueOf2;
                                try {
                                    lValueOf3 = Long.valueOf(statFs2.getAvailableBlocksLong() * statFs2.getBlockSizeLong());
                                } catch (Throwable th5) {
                                    sentryAndroidOptions.getLogger().d(q5.ERROR, "Error getting unused internal storage amount.", th5);
                                    lValueOf3 = null;
                                }
                                hVar.G0 = lValueOf3;
                            }
                            if (zIsCollectExternalStorageContext) {
                                externalFilesDir = context.getExternalFilesDir(null);
                                try {
                                    externalFilesDirs = context.getExternalFilesDirs(null);
                                    if (externalFilesDirs != null) {
                                        if (externalFilesDir != null) {
                                            absolutePath = externalFilesDir.getAbsolutePath();
                                        } else {
                                            absolutePath = null;
                                        }
                                        length = externalFilesDirs.length;
                                        i3 = 0;
                                        while (true) {
                                            if (i3 >= length) {
                                                file = externalFilesDirs[i3];
                                                if (file != null) {
                                                    if (absolutePath != null || absolutePath.isEmpty() || !file.getAbsolutePath().contains(absolutePath)) {
                                                        break;
                                                        break;
                                                        break;
                                                    }
                                                }
                                                i3++;
                                            }
                                        }
                                        if (file != null) {
                                            statFs = new StatFs(file.getPath());
                                        } else {
                                            statFs = null;
                                        }
                                        if (statFs != null) {
                                            try {
                                                lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th6) {
                                                sentryAndroidOptions.getLogger().d(q5.ERROR, "Error getting total external storage amount.", th6);
                                                lValueOf = null;
                                            }
                                            hVar.H0 = lValueOf;
                                            try {
                                                lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                            } catch (Throwable th7) {
                                                sentryAndroidOptions.getLogger().d(q5.ERROR, "Error getting unused external storage amount.", th7);
                                            }
                                            hVar.I0 = lValueOf4;
                                        }
                                    } else {
                                        sentryAndroidOptions.getLogger().i(q5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                                    }
                                    file = null;
                                    if (file != null) {
                                        statFs = new StatFs(file.getPath());
                                    } else {
                                        statFs = null;
                                    }
                                } catch (Throwable unused) {
                                    sentryAndroidOptions.getLogger().i(q5.INFO, "Not possible to read external files directory", new Object[0]);
                                }
                                if (statFs != null) {
                                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                                    hVar.H0 = lValueOf;
                                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                                    hVar.I0 = lValueOf4;
                                }
                            }
                            if (hVar.R0 == null) {
                                hVar.R0 = sentryAndroidOptions.getConnectionStatusProvider().D();
                            }
                        }
                        return hVar;
                    }
                    gVar2 = io.sentry.protocol.g.PORTRAIT;
                    gVar = gVar2;
                    if (gVar == null) {
                        sentryAndroidOptions.getLogger().i(q5.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                        gVar = null;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    gVar = null;
                }
                date = new Date(System.currentTimeMillis() - SystemClock.elapsedRealtime());
            } catch (IllegalArgumentException e) {
                sentryAndroidOptions.getLogger().c(q5.ERROR, e, "Error getting the device's boot time.", new Object[0]);
                date = null;
            }
            displayMetrics = context.getResources().getDisplayMetrics();
        } catch (Throwable th9) {
            logger.d(q5.ERROR, "Error getting DisplayMetrics.", th9);
            displayMetrics = null;
        }
        hVar.y = gVar;
        bool = this.d;
        if (bool != null) {
            hVar.z = bool;
        }
        logger = sentryAndroidOptions.getLogger();
        if (displayMetrics != null) {
            hVar.J0 = Integer.valueOf(displayMetrics.widthPixels);
            hVar.K0 = Integer.valueOf(displayMetrics.heightPixels);
            hVar.L0 = Float.valueOf(displayMetrics.density);
            hVar.M0 = Integer.valueOf(displayMetrics.densityDpi);
        }
        hVar.N0 = date;
        if (Build.VERSION.SDK_INT >= 33) {
            locales = context.getResources().getConfiguration().getLocales();
            if (locales.isEmpty()) {
                locale2 = locales.get(0);
                if (locale2.getUnicodeLocaleType("tz") != null) {
                    timeZone = Calendar.getInstance(locale2).getTimeZone();
                } else {
                    timeZone = TimeZone.getDefault();
                }
            } else {
                timeZone = TimeZone.getDefault();
            }
        } else {
            timeZone = TimeZone.getDefault();
        }
        hVar.O0 = timeZone;
        if (hVar.P0 == null) {
            strA = z0.a(context);
            hVar.P0 = strA;
        }
        locale = Locale.getDefault();
        if (hVar.Q0 == null) {
            hVar.Q0 = locale.toString();
        }
        arrayListA = io.sentry.android.core.internal.util.f.c.a();
        if (!arrayListA.isEmpty()) {
            hVar.U0 = Double.valueOf(((Integer) Collections.max(arrayListA)).doubleValue());
            hVar.T0 = Integer.valueOf(arrayListA.size());
        }
        hVar.X = this.h;
        if (z) {
            zIsCollectExternalStorageContext = sentryAndroidOptions.isCollectExternalStorageContext();
            intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
            if (Build.VERSION.SDK_INT >= 33) {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null, 4);
            } else {
                intentRegisterReceiver = context.registerReceiver(null, intentFilter, null, null);
            }
            if (intentRegisterReceiver != null) {
                hVar.v = b(intentRegisterReceiver, sentryAndroidOptions);
                hVar.w = d(intentRegisterReceiver, sentryAndroidOptions);
                intExtra = intentRegisterReceiver.getIntExtra("temperature", -1);
                if (intExtra != -1) {
                    fValueOf = Float.valueOf(intExtra / 10.0f);
                } else {
                    fValueOf = null;
                }
                hVar.S0 = fValueOf;
            }
            i2 = t0.a[sentryAndroidOptions.getConnectionStatusProvider().s0().ordinal()];
            if (i2 != 1) {
                bool2 = Boolean.FALSE;
            } else if (i2 != 2) {
                bool2 = null;
            } else {
                bool2 = Boolean.TRUE;
            }
            hVar.x = bool2;
            memoryInfoC = p0.c(context, sentryAndroidOptions.getLogger());
            if (memoryInfoC != null) {
                hVar.Y = Long.valueOf(memoryInfoC.availMem);
                hVar.E0 = Boolean.valueOf(memoryInfoC.lowMemory);
            }
            dataDirectory = Environment.getDataDirectory();
            if (dataDirectory != null) {
                StatFs statFs3 = new StatFs(dataDirectory.getPath());
                lValueOf2 = Long.valueOf(statFs3.getBlockCountLong() * statFs3.getBlockSizeLong());
                hVar.F0 = lValueOf2;
                lValueOf3 = Long.valueOf(statFs3.getAvailableBlocksLong() * statFs3.getBlockSizeLong());
                hVar.G0 = lValueOf3;
            }
            if (zIsCollectExternalStorageContext) {
                externalFilesDir = context.getExternalFilesDir(null);
                externalFilesDirs = context.getExternalFilesDirs(null);
                if (externalFilesDirs != null) {
                    if (externalFilesDir != null) {
                        absolutePath = externalFilesDir.getAbsolutePath();
                    } else {
                        absolutePath = null;
                    }
                    length = externalFilesDirs.length;
                    i3 = 0;
                    while (true) {
                        if (i3 >= length) {
                            file = externalFilesDirs[i3];
                            if (file != null) {
                                if (absolutePath != null) {
                                    break;
                                }
                            }
                            i3++;
                        }
                    }
                    if (file != null) {
                        statFs = new StatFs(file.getPath());
                    } else {
                        statFs = null;
                    }
                    if (statFs != null) {
                        lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                        hVar.H0 = lValueOf;
                        lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                        hVar.I0 = lValueOf4;
                    }
                } else {
                    sentryAndroidOptions.getLogger().i(q5.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
                }
                file = null;
                if (file != null) {
                    statFs = new StatFs(file.getPath());
                } else {
                    statFs = null;
                }
                if (statFs != null) {
                    lValueOf = Long.valueOf(statFs.getBlockCountLong() * statFs.getBlockSizeLong());
                    hVar.H0 = lValueOf;
                    lValueOf4 = Long.valueOf(statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong());
                    hVar.I0 = lValueOf4;
                }
            }
            if (hVar.R0 == null) {
                hVar.R0 = sentryAndroidOptions.getConnectionStatusProvider().D();
            }
        }
        return hVar;
    }
}
