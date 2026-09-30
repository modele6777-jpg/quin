package defpackage;

import android.app.job.JobScheduler;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import com.adjust.sdk.ActivityHandler;
import com.adjust.sdk.ActivityPackage;
import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.AttributionHandler;
import com.adjust.sdk.AttributionResponseData;
import com.adjust.sdk.EventResponseData;
import com.adjust.sdk.IActivityHandler;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.OnDeeplinkResolvedListener;
import com.adjust.sdk.PurchaseVerificationHandler;
import com.adjust.sdk.ResponseData;
import com.adjust.sdk.SdkClickHandler;
import com.adjust.sdk.SdkClickResponseData;
import com.adjust.sdk.scheduler.TimerOnce;
import com.google.android.play.core.assetpacks.n;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import io.sentry.android.core.v;
import java.lang.reflect.Method;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import net.xmind.donut.gp.BillingSession;
import net.xmind.donut.gp.GooglePay;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class v36 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public v36(f2h f2hVar, qsg qsgVar, f2h f2hVar2) {
        this.a = 26;
        this.b = qsgVar;
        this.c = f2hVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:104:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:105:0x02d5 A[Catch: NotFoundException -> 0x02da, TRY_LEAVE, TryCatch #2 {NotFoundException -> 0x02da, blocks: (B:102:0x02c3, B:105:0x02d5), top: B:292:0x02c3 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x02eb  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:117:0x0306  */
    /* JADX WARN: Code duplicated, block: B:120:0x031a A[EDGE_INSN: B:120:0x031a->B:121:0x031c BREAK  A[LOOP:0: B:115:0x0300->B:304:?]] */
    /* JADX WARN: Code duplicated, block: B:122:0x031e  */
    /* JADX WARN: Code duplicated, block: B:123:0x0325  */
    /* JADX WARN: Code duplicated, block: B:126:0x034b  */
    /* JADX WARN: Code duplicated, block: B:128:0x0393  */
    /* JADX WARN: Code duplicated, block: B:129:0x039c  */
    /* JADX WARN: Code duplicated, block: B:132:0x03be  */
    /* JADX WARN: Code duplicated, block: B:135:0x03fa  */
    /* JADX WARN: Code duplicated, block: B:136:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:139:0x0401  */
    /* JADX WARN: Code duplicated, block: B:142:0x040d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:143:0x040f  */
    /* JADX WARN: Code duplicated, block: B:144:0x0410 A[PHI: r13
  0x0410: PHI (r13v24 boolean) = (r13v10 boolean), (r13v9 boolean) binds: [B:143:0x040f, B:140:0x040a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:146:0x0442  */
    /* JADX WARN: Code duplicated, block: B:147:0x0459  */
    /* JADX WARN: Code duplicated, block: B:150:0x0481 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:151:0x0483  */
    /* JADX WARN: Code duplicated, block: B:155:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:156:0x04b8 A[PHI: r28 r29 r30
  0x04b8: PHI (r28v2 w3h) = (r28v0 w3h), (r28v3 w3h) binds: [B:154:0x04a3, B:152:0x0486] A[DONT_GENERATE, DONT_INLINE]
  0x04b8: PHI (r29v2 tz0) = (r29v0 tz0), (r29v3 tz0) binds: [B:154:0x04a3, B:152:0x0486] A[DONT_GENERATE, DONT_INLINE]
  0x04b8: PHI (r30v2 qch) = (r30v0 qch), (r30v3 qch) binds: [B:154:0x04a3, B:152:0x0486] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:158:0x04c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:169:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:171:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:174:0x051c  */
    /* JADX WARN: Code duplicated, block: B:177:0x052c  */
    /* JADX WARN: Code duplicated, block: B:180:0x054b  */
    /* JADX WARN: Code duplicated, block: B:182:0x0559 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:188:0x0576  */
    /* JADX WARN: Code duplicated, block: B:190:0x057c  */
    /* JADX WARN: Code duplicated, block: B:192:0x059a  */
    /* JADX WARN: Code duplicated, block: B:196:0x05c8  */
    /* JADX WARN: Code duplicated, block: B:199:0x05e2  */
    /* JADX WARN: Code duplicated, block: B:204:0x05fd  */
    /* JADX WARN: Code duplicated, block: B:206:0x0603  */
    /* JADX WARN: Code duplicated, block: B:208:0x060d  */
    /* JADX WARN: Code duplicated, block: B:209:0x0618  */
    /* JADX WARN: Code duplicated, block: B:212:0x0622  */
    /* JADX WARN: Code duplicated, block: B:215:0x0638  */
    /* JADX WARN: Code duplicated, block: B:219:0x0644  */
    /* JADX WARN: Code duplicated, block: B:222:0x0652  */
    /* JADX WARN: Code duplicated, block: B:225:0x0666  */
    /* JADX WARN: Code duplicated, block: B:226:0x066b  */
    /* JADX WARN: Code duplicated, block: B:228:0x067d  */
    /* JADX WARN: Code duplicated, block: B:230:0x069d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:241:0x0713  */
    /* JADX WARN: Code duplicated, block: B:243:0x072f  */
    /* JADX WARN: Code duplicated, block: B:246:0x073b  */
    /* JADX WARN: Code duplicated, block: B:255:0x0785  */
    /* JADX WARN: Code duplicated, block: B:257:0x078d  */
    /* JADX WARN: Code duplicated, block: B:258:0x078f  */
    /* JADX WARN: Code duplicated, block: B:260:0x0797  */
    /* JADX WARN: Code duplicated, block: B:264:0x07a4  */
    /* JADX WARN: Code duplicated, block: B:268:0x07d9  */
    /* JADX WARN: Code duplicated, block: B:270:0x07e4  */
    /* JADX WARN: Code duplicated, block: B:272:0x0815  */
    /* JADX WARN: Code duplicated, block: B:275:0x082b  */
    /* JADX WARN: Code duplicated, block: B:279:0x083d  */
    /* JADX WARN: Code duplicated, block: B:292:0x02c3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:302:0x031a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:60:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:62:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:66:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:68:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:71:0x0208  */
    /* JADX WARN: Code duplicated, block: B:72:0x0213  */
    /* JADX WARN: Code duplicated, block: B:73:0x021e  */
    /* JADX WARN: Code duplicated, block: B:74:0x0229  */
    /* JADX WARN: Code duplicated, block: B:75:0x0234  */
    /* JADX WARN: Code duplicated, block: B:76:0x023f  */
    /* JADX WARN: Code duplicated, block: B:77:0x024a  */
    /* JADX WARN: Code duplicated, block: B:81:0x025e  */
    /* JADX WARN: Code duplicated, block: B:82:0x025f A[Catch: IllegalStateException -> 0x0281, TryCatch #1 {IllegalStateException -> 0x0281, blocks: (B:79:0x0256, B:83:0x0265, B:87:0x026d, B:89:0x0271, B:82:0x025f), top: B:290:0x0256 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x026b  */
    /* JADX WARN: Code duplicated, block: B:86:0x026c  */
    /* JADX WARN: Code duplicated, block: B:89:0x0271 A[Catch: IllegalStateException -> 0x0281, TRY_LEAVE, TryCatch #1 {IllegalStateException -> 0x0281, blocks: (B:79:0x0256, B:83:0x0265, B:87:0x026d, B:89:0x0271, B:82:0x025f), top: B:290:0x0256 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:97:0x02b2  */
    /* JADX WARN: Type inference failed for: r0v26, types: [w7h] */
    private final void a() {
        String str;
        w0h w0hVar;
        w0h w0hVar2;
        String installerPackageName;
        String string;
        String str2;
        int i;
        String str3;
        int iB;
        w3h w3hVar;
        Bundle bundleM0;
        Integer numValueOf;
        String[] stringArray;
        List listAsList;
        o8h o8hVar;
        w3h w3hVar2;
        w0h w0hVar3;
        tz0 tz0Var;
        tz0 tz0Var2;
        tz0 tz0Var3;
        tz0 tz0Var4;
        String strG0;
        int i2;
        AtomicInteger atomicInteger;
        long j;
        final c8h c8hVar;
        j4h j4hVarF0;
        boolean zL0;
        boolean z;
        tz0 tz0Var5;
        w0h w0hVar4;
        zi0 zi0Var;
        q5h q5hVarH0;
        k5h k5hVarQ0;
        k5h k5hVarQ1;
        o5h o5hVar;
        k5h k5hVar;
        w3h w3hVar3;
        tz0 tz0Var6;
        qch qchVar;
        q5h q5hVar;
        q5h q5hVar2;
        w3h w3hVar4;
        k5h k5hVarQ2;
        k5h k5hVarQ3;
        Boolean boolN0;
        v vVar;
        fnb fnbVar;
        w3h w3hVar5;
        qch qchVar2;
        zi0 zi0Var2;
        w0h w0hVar5;
        boolean zA;
        SharedPreferences sharedPreferences;
        boolean zContains;
        boolean zIsEmpty;
        long jMax;
        e6h e6hVar;
        tz0 tz0Var7;
        Context context;
        boolean z2;
        Iterator it;
        String str4;
        qch qchVar3;
        String strT;
        Bundle bundle;
        w3h w3hVar6 = (w3h) this.c;
        a6h a6hVar = (a6h) this.b;
        m3h m3hVar = w3hVar6.g;
        w0h w0hVar6 = w3hVar6.f;
        c2h c2hVar = w3hVar6.e;
        qch qchVar4 = w3hVar6.w;
        w3h.h(m3hVar);
        m3hVar.A0();
        qqg qqgVar = w3hVar6.d;
        ((w3h) qqgVar.b).getClass();
        yrg yrgVar = new yrg(w3hVar6);
        ((w3h) yrgVar.b).P0++;
        yrgVar.D0();
        w3hVar6.H0 = yrgVar;
        gwg gwgVar = a6hVar.d;
        long j2 = gwgVar == null ? 0L : gwgVar.a;
        String string2 = (gwgVar == null || (bundle = gwgVar.d) == null) ? "" : bundle.getString("runtime_google_app_id", "");
        long j3 = a6hVar.c;
        String str5 = "";
        xzg xzgVar = new xzg(w3hVar6, j3, j2, string2);
        xzgVar.C0();
        w3hVar6.I0 = xzgVar;
        f0h f0hVar = new f0h(w3hVar6);
        f0hVar.C0();
        w3hVar6.F0 = f0hVar;
        lah lahVar = new lah(w3hVar6);
        lahVar.C0();
        w3hVar6.G0 = lahVar;
        boolean z3 = qchVar4.c;
        w3h w3hVar7 = (w3h) qchVar4.b;
        if (z3) {
            qc0.p("Can't initialize twice");
            return;
        }
        qchVar4.A0();
        SecureRandom secureRandom = new SecureRandom();
        long jNextLong = secureRandom.nextLong();
        if (jNextLong == 0) {
            jNextLong = secureRandom.nextLong();
            if (jNextLong == 0) {
                w0h w0hVar7 = ((w3h) qchVar4.b).f;
                w3h.h(w0hVar7);
                w0hVar7.x.a("Utils falling back to Random for random id");
            }
        }
        qchVar4.e.set(jNextLong);
        w3hVar7.R0.incrementAndGet();
        qchVar4.c = true;
        if (c2hVar.c) {
            qc0.p("Can't initialize twice");
            return;
        }
        SharedPreferences sharedPreferences2 = ((w3h) c2hVar.b).a.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        c2hVar.d = sharedPreferences2;
        boolean z4 = sharedPreferences2.getBoolean("has_been_opened", false);
        c2hVar.H0 = z4;
        if (!z4) {
            SharedPreferences.Editor editorEdit = c2hVar.d.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        c2hVar.f = new zy1(c2hVar, Math.max(0L, ((Long) bzg.d.a(null)).longValue()));
        ((w3h) c2hVar.b).R0.incrementAndGet();
        c2hVar.c = true;
        xzg xzgVar2 = w3hVar6.I0;
        if (xzgVar2.c) {
            qc0.p("Can't initialize twice");
            return;
        }
        w3h w3hVar8 = (w3h) xzgVar2.b;
        w0h w0hVar8 = w3hVar8.f;
        w0h w0hVar9 = w3hVar8.f;
        w3h.h(w0hVar8);
        w0hVar8.Z.c(Long.valueOf(xzgVar2.y), Long.valueOf(xzgVar2.x), "sdkVersion bundled with app, dynamiteVersion");
        Context context2 = w3hVar8.a;
        String packageName = context2.getPackageName();
        PackageManager packageManager = context2.getPackageManager();
        String str6 = "Unknown";
        String str7 = "unknown";
        try {
            if (packageManager != null) {
                str = "Can't initialize twice";
                w0hVar = w0hVar6;
                w0hVar2 = w0hVar9;
                try {
                    installerPackageName = packageManager.getInstallerPackageName(packageName);
                } catch (IllegalArgumentException unused) {
                    w3h.h(w0hVar2);
                    w0hVar2.g.b(w0h.E0(packageName), "Error retrieving app installer package name. appId");
                    installerPackageName = "unknown";
                }
                if (installerPackageName == null) {
                    installerPackageName = "manual_install";
                } else if ("com.android.vending".equals(installerPackageName)) {
                    installerPackageName = str5;
                }
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(context2.getPackageName(), 0);
                    if (packageInfo != null) {
                        CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                        string = !TextUtils.isEmpty(applicationLabel) ? applicationLabel.toString() : "Unknown";
                        str7 = installerPackageName;
                        try {
                            str2 = packageInfo.versionName;
                            try {
                                i = packageInfo.versionCode;
                                packageManager = packageManager;
                                str3 = str7;
                            } catch (PackageManager.NameNotFoundException unused2) {
                                str6 = str2;
                                w3h.h(w0hVar2);
                                w0hVar2.g.c(w0h.E0(packageName), string, "Error retrieving package info. appId, appName");
                                str2 = str6;
                                str3 = str7;
                                i = Integer.MIN_VALUE;
                            }
                        } catch (PackageManager.NameNotFoundException unused3) {
                        }
                    } else {
                        str7 = installerPackageName;
                    }
                } catch (PackageManager.NameNotFoundException unused4) {
                    str7 = installerPackageName;
                    string = "Unknown";
                }
                xzgVar2.d = packageName;
                xzgVar2.g = str3;
                xzgVar2.e = str2;
                xzgVar2.f = i;
                xzgVar2.v = string;
                xzgVar2.w = 0L;
                iB = w3hVar8.b();
                if (iB != 0) {
                    w3h.h(w0hVar2);
                    w0hVar2.Z.a("App measurement collection enabled");
                } else if (iB != 1) {
                    w3h.h(w0hVar2);
                    w0hVar2.X.a("App measurement deactivated via the manifest");
                } else if (iB != 3) {
                    w3h.h(w0hVar2);
                    w0hVar2.X.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
                } else if (iB != 4) {
                    w3h.h(w0hVar2);
                    w0hVar2.X.a("App measurement disabled via the manifest");
                } else if (iB != 6) {
                    w3h.h(w0hVar2);
                    w0hVar2.z.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
                } else if (iB != 7) {
                    w3h.h(w0hVar2);
                    w0hVar2.X.a("App measurement disabled via the global data collection setting");
                } else if (iB != 8) {
                    w3h.h(w0hVar2);
                    w0hVar2.X.a("App measurement disabled");
                    w3h.h(w0hVar2);
                    w0hVar2.v.a("Invalid scion state in identity");
                } else {
                    w3h.h(w0hVar2);
                    w0hVar2.X.a("App measurement disabled due to denied storage consent");
                }
                xzgVar2.E0 = str5;
                strT = xzgVar2.Y;
                if (!TextUtils.isEmpty(strT)) {
                    strT = rfc.t(context2, w3hVar8.E0);
                }
                if (TextUtils.isEmpty(strT)) {
                    str5 = strT;
                }
                xzgVar2.E0 = str5;
                if (iB == 0) {
                    w3h.h(w0hVar2);
                    w0hVar2.Z.c(xzgVar2.d, xzgVar2.E0, "App measurement enabled for app package, google app id");
                }
                xzgVar2.z = null;
                qqg qqgVar2 = w3hVar8.d;
                w3hVar = (w3h) qqgVar2.b;
                oa7.x("analytics.safelisted_events");
                bundleM0 = qqgVar2.M0();
                if (bundleM0 == null) {
                    if (!bundleM0.containsKey("analytics.safelisted_events")) {
                        numValueOf = Integer.valueOf(bundleM0.getInt("analytics.safelisted_events"));
                    }
                    if (numValueOf != null) {
                        try {
                            stringArray = w3hVar.a.getResources().getStringArray(numValueOf.intValue());
                            if (stringArray == null) {
                                listAsList = null;
                            } else {
                                listAsList = Arrays.asList(stringArray);
                            }
                        } catch (Resources.NotFoundException e) {
                            w0h w0hVar10 = w3hVar.f;
                            w3h.h(w0hVar10);
                            w0hVar10.g.b(e, "Failed to load string array from metadata: resource not found");
                        }
                    } else {
                        listAsList = null;
                    }
                    if (listAsList != null) {
                        xzgVar2.z = listAsList;
                        break;
                    }
                    if (listAsList.isEmpty()) {
                        it = listAsList.iterator();
                        do {
                            if (it.hasNext()) {
                                xzgVar2.z = listAsList;
                                break;
                            } else {
                                str4 = (String) it.next();
                                qchVar3 = w3hVar8.w;
                                w3h.f(qchVar3);
                            }
                        } while (qchVar3.F1("safelisted event", str4));
                    } else {
                        w3h.h(w0hVar2);
                        w0hVar2.z.a("Safelisted event list is empty. Ignoring");
                    }
                    if (packageManager != null) {
                        xzgVar2.Z = x57.Z(context2) ? 1 : 0;
                    } else {
                        xzgVar2.Z = 0;
                    }
                    ((w3h) xzgVar2.b).R0.incrementAndGet();
                    xzgVar2.c = true;
                    o8hVar = new o8h(w3hVar6);
                    w3hVar2 = (w3h) o8hVar.b;
                    w3hVar2.P0++;
                    o8hVar.C0();
                    w3hVar6.J0 = o8hVar;
                    if (!o8hVar.c) {
                        qc0.p(str);
                        return;
                    }
                    o8hVar.d = (JobScheduler) ((w3h) o8hVar.b).a.getSystemService("jobscheduler");
                    w3hVar2.R0.incrementAndGet();
                    o8hVar.c = true;
                    w3h.h(w0hVar);
                    w0hVar3 = w0hVar;
                    tz0Var = w0hVar3.Y;
                    tz0Var2 = w0hVar3.X;
                    tz0Var3 = w0hVar3.Z;
                    tz0Var4 = w0hVar3.g;
                    qqgVar.G0();
                    tz0Var2.b(161000L, "App measurement initialized, version");
                    w3h.h(w0hVar3);
                    tz0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                    strG0 = xzgVar.G0();
                    if (qchVar4.g1(strG0, qqgVar.d)) {
                        w3h.h(w0hVar3);
                        tz0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                    } else {
                        w3h.h(w0hVar3);
                        tz0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strG0)));
                    }
                    w3h.h(w0hVar3);
                    tz0Var.a("Debug-level message logging enabled");
                    i2 = w3hVar6.P0;
                    atomicInteger = w3hVar6.R0;
                    if (i2 != atomicInteger.get()) {
                        w3h.h(w0hVar3);
                        tz0Var4.c(Integer.valueOf(w3hVar6.P0), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                    }
                    w3hVar6.K0 = true;
                    j = w3hVar6.S0;
                    c8hVar = w3hVar6.X;
                    w3h.h(m3hVar);
                    m3hVar.A0();
                    w3h.e(w3hVar6.J0);
                    j4hVarF0 = w3hVar6.J0.F0();
                    upg.a();
                    zL0 = qqgVar.L0(null, bzg.P0);
                    if (j4hVarF0 == j4h.CLIENT_UPLOAD_ELIGIBLE) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zL0) {
                        qchVar4.A0();
                        if (qchVar4.Y0() == 1) {
                            qchVar4.A0();
                            IntentFilter intentFilter = new IntentFilter();
                            intentFilter.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            tz0Var5 = tz0Var2;
                            w0hVar4 = w0hVar3;
                            bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter, null, 2);
                            w0h w0hVar11 = w3hVar7.f;
                            w3h.h(w0hVar11);
                            w0hVar11.Y.a("Registered app receiver");
                            if (z2) {
                                w3h.e(w3hVar6.J0);
                                w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                            }
                        } else if (z) {
                            z = true;
                            qchVar4.A0();
                            IntentFilter intentFilter2 = new IntentFilter();
                            intentFilter2.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                            intentFilter2.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                            z2 = z;
                            tz0Var5 = tz0Var2;
                            w0hVar4 = w0hVar3;
                            bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter2, null, 2);
                            w0h w0hVar12 = w3hVar7.f;
                            w3h.h(w0hVar12);
                            w0hVar12.Y.a("Registered app receiver");
                            if (z2) {
                                w3h.e(w3hVar6.J0);
                                w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                            }
                        } else {
                            tz0Var5 = tz0Var2;
                            w0hVar4 = w0hVar3;
                        }
                    } else if (z) {
                        z = true;
                        qchVar4.A0();
                        IntentFilter intentFilter3 = new IntentFilter();
                        intentFilter3.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter3.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        tz0Var5 = tz0Var2;
                        w0hVar4 = w0hVar3;
                        bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter3, null, 2);
                        w0h w0hVar13 = w3hVar7.f;
                        w3h.h(w0hVar13);
                        w0hVar13.Y.a("Registered app receiver");
                        if (z2) {
                            w3h.e(w3hVar6.J0);
                            w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                        }
                    } else {
                        tz0Var5 = tz0Var2;
                        w0hVar4 = w0hVar3;
                    }
                    zi0Var = c2hVar.v;
                    q5hVarH0 = c2hVar.H0();
                    int i3 = q5hVarH0.b;
                    k5hVarQ0 = qqgVar.Q0("google_analytics_default_allow_ad_storage", false);
                    k5hVarQ1 = qqgVar.Q0("google_analytics_default_allow_analytics_storage", false);
                    o5hVar = o5h.ANALYTICS_STORAGE;
                    k5hVar = k5h.UNINITIALIZED;
                    if (k5hVarQ0 == k5hVar || k5hVarQ1 != k5hVar) {
                        w3hVar3 = w3hVar6;
                        tz0Var6 = tz0Var4;
                        qchVar = qchVar4;
                        if (q5h.l(-10, c2hVar.E0().getInt("consent_source", 100))) {
                            EnumMap enumMap = new EnumMap(o5h.class);
                            enumMap.put(o5h.AD_STORAGE, k5hVarQ0);
                            enumMap.put(o5hVar, k5hVarQ1);
                            q5hVar = new q5h(enumMap, -10);
                        }
                        if (q5hVar != null) {
                            w3h.g(c8hVar);
                            c8hVar.W0(q5hVar, true);
                            q5hVar2 = q5hVar;
                        } else {
                            q5hVar2 = q5hVarH0;
                        }
                        w3h.g(c8hVar);
                        w3hVar4 = (w3h) c8hVar.b;
                        c8hVar.a1(q5hVar2);
                        c2hVar.A0();
                        int i4 = xrg.b(c2hVar.E0().getString("dma_consent_settings", null)).a;
                        k5hVarQ2 = qqgVar.Q0("google_analytics_default_allow_ad_personalization_signals", true);
                        if (k5hVarQ2 != k5hVar) {
                            w3h.h(w0hVar4);
                            tz0Var3.b(k5hVarQ2, "Default ad personalization consent from Manifest");
                        }
                        k5hVarQ3 = qqgVar.Q0("google_analytics_default_allow_ad_user_data", true);
                        if (k5hVarQ3 == k5hVar && q5h.l(-10, i4)) {
                            w3h.g(c8hVar);
                            EnumMap enumMap2 = new EnumMap(o5h.class);
                            enumMap2.put(o5h.AD_USER_DATA, k5hVarQ3);
                            c8hVar.V0(new xrg(enumMap2, -10, (Boolean) null, (String) null), true);
                        } else if (!TextUtils.isEmpty(w3hVar3.l().H0()) && (i4 == 0 || i4 == 30)) {
                            w3h.g(c8hVar);
                            c8hVar.V0(new xrg((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                        boolN0 = qqgVar.N0("google_analytics_tcf_data_enabled");
                        if (boolN0 != null || boolN0.booleanValue()) {
                            w3h.h(w0hVar4);
                            tz0Var.a("TCF client enabled.");
                            w3h.g(c8hVar);
                            c8hVar.A0();
                            w0h w0hVar14 = w3hVar4.f;
                            w3h.h(w0hVar14);
                            w0hVar14.Y.a("Register tcfPrefChangeListener.");
                            if (c8hVar.J0 == null) {
                                c8hVar.K0 = new e6h(c8hVar, w3hVar4, 2);
                                c8hVar.J0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: w7h
                                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                        c8h c8hVar2 = c8hVar;
                                        c8hVar2.getClass();
                                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                            w0h w0hVar15 = ((w3h) c8hVar2.b).f;
                                            w3h.h(w0hVar15);
                                            w0hVar15.Z.a("IABTCF_TCString change picked up in listener.");
                                            e6h e6hVar2 = c8hVar2.K0;
                                            oa7.A(e6hVar2);
                                            e6hVar2.b(500L);
                                        }
                                    }
                                };
                            }
                            c2h c2hVar2 = w3hVar4.e;
                            w3h.f(c2hVar2);
                            c2hVar2.F0().registerOnSharedPreferenceChangeListener(c8hVar.J0);
                            w3h.g(c8hVar);
                            c8hVar.G0();
                        }
                        vVar = c2hVar.g;
                        if (vVar.a() == 0) {
                            w3h.h(w0hVar4);
                            tz0Var3.b(Long.valueOf(j), "Persisting first open");
                            vVar.b(j);
                        }
                        w3h.g(c8hVar);
                        fnbVar = c8hVar.G0;
                        if (fnbVar.g() && fnbVar.f()) {
                            c2h c2hVar3 = ((w3h) fnbVar.a).e;
                            w3h.f(c2hVar3);
                            c2hVar3.M0.D(null);
                        }
                        if (w3hVar3.c()) {
                            w3hVar5 = w3hVar3;
                            qchVar2 = qchVar;
                            if (TextUtils.isEmpty(w3hVar5.l().H0())) {
                                zi0Var2 = zi0Var;
                            } else {
                                String strH0 = w3hVar5.l().H0();
                                c2hVar.A0();
                                String string3 = c2hVar.E0().getString("gmp_app_id", null);
                                zIsEmpty = TextUtils.isEmpty(strH0);
                                boolean zIsEmpty2 = TextUtils.isEmpty(string3);
                                if (!zIsEmpty || zIsEmpty2) {
                                    zi0Var2 = zi0Var;
                                } else {
                                    oa7.A(strH0);
                                    if (strH0.equals(string3)) {
                                        zi0Var2 = zi0Var;
                                    } else {
                                        w3h.h(w0hVar4);
                                        tz0Var5.a("Rechecking which service to use due to a GMP App Id change");
                                        c2hVar.A0();
                                        c2hVar.A0();
                                        Boolean boolValueOf = c2hVar.E0().contains("measurement_enabled") ? Boolean.valueOf(c2hVar.E0().getBoolean("measurement_enabled", true)) : null;
                                        SharedPreferences.Editor editorEdit2 = c2hVar.E0().edit();
                                        editorEdit2.clear();
                                        editorEdit2.apply();
                                        if (boolValueOf != null) {
                                            c2hVar.A0();
                                            SharedPreferences.Editor editorEdit3 = c2hVar.E0().edit();
                                            editorEdit3.putBoolean("measurement_enabled", boolValueOf.booleanValue());
                                            editorEdit3.apply();
                                        }
                                        w3hVar5.i().E0();
                                        w3hVar5.G0.I0();
                                        w3hVar5.G0.G0();
                                        vVar.b(j);
                                        zi0Var2 = zi0Var;
                                        zi0Var2.D(null);
                                    }
                                }
                                String strH1 = w3hVar5.l().H0();
                                c2hVar.A0();
                                SharedPreferences.Editor editorEdit4 = c2hVar.E0().edit();
                                editorEdit4.putString("gmp_app_id", strH1);
                                editorEdit4.apply();
                            }
                            if (!c2hVar.H0().i(o5hVar)) {
                                zi0Var2.D(null);
                            }
                            w3h.g(c8hVar);
                            c8hVar.v.set(zi0Var2.C());
                            try {
                                w3hVar7.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                            } catch (ClassNotFoundException unused5) {
                                zi0 zi0Var3 = c2hVar.L0;
                                if (!TextUtils.isEmpty(zi0Var3.C())) {
                                    w3h.h(w0hVar4);
                                    w0hVar5 = w0hVar4;
                                    w0hVar5.x.a("Remote config removed with active feature rollouts");
                                    zi0Var3.D(null);
                                }
                                if (!TextUtils.isEmpty(w3hVar5.l().H0())) {
                                    zA = w3hVar5.a();
                                    sharedPreferences = c2hVar.d;
                                    if (sharedPreferences == null) {
                                        zContains = false;
                                    } else {
                                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                                    }
                                    if (!zContains) {
                                        c2hVar.I0(!zA);
                                    }
                                    if (zA) {
                                        w3h.g(c8hVar);
                                        c8hVar.M0();
                                    }
                                    ebh ebhVar = w3hVar5.v;
                                    w3h.g(ebhVar);
                                    ebhVar.f.k();
                                    w3hVar5.j().E0(new AtomicReference());
                                    w3hVar5.j().F0(c2hVar.O0.l());
                                }
                                upg.a();
                                if (qqgVar.L0(null, bzg.P0)) {
                                    qchVar2.A0();
                                    if (qchVar2.Y0() == 1) {
                                        long jIntValue = ((Integer) bzg.w0.a(null)).intValue();
                                        long jNextInt = new Random().nextInt(5000);
                                        w3hVar5.y.getClass();
                                        jMax = Math.max(500L, ((jIntValue * 1000) + jNextInt) - SystemClock.elapsedRealtime());
                                        if (jMax > 500) {
                                            w3h.h(w0hVar5);
                                            tz0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                        }
                                        w3h.g(c8hVar);
                                        c8hVar.A0();
                                        e6hVar = c8hVar.X;
                                        if (e6hVar == null) {
                                            e6hVar = new e6h(c8hVar, w3hVar4, 0);
                                            c8hVar.X = e6hVar;
                                        }
                                        e6hVar.b(jMax);
                                    }
                                }
                                c2hVar.E0.b(true);
                            }
                            w0hVar5 = w0hVar4;
                            if (!TextUtils.isEmpty(w3hVar5.l().H0())) {
                                zA = w3hVar5.a();
                                sharedPreferences = c2hVar.d;
                                if (sharedPreferences == null) {
                                    zContains = false;
                                } else {
                                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                                }
                                if (!zContains && !qqgVar.O0()) {
                                    c2hVar.I0(!zA);
                                }
                                if (zA) {
                                    w3h.g(c8hVar);
                                    c8hVar.M0();
                                }
                                ebh ebhVar2 = w3hVar5.v;
                                w3h.g(ebhVar2);
                                ebhVar2.f.k();
                                w3hVar5.j().E0(new AtomicReference());
                                w3hVar5.j().F0(c2hVar.O0.l());
                            }
                        } else {
                            if (w3hVar3.a()) {
                                qchVar2 = qchVar;
                                if (qchVar2.e1("android.permission.INTERNET")) {
                                    tz0Var7 = tz0Var6;
                                } else {
                                    w3h.h(w0hVar4);
                                    tz0Var7 = tz0Var6;
                                    tz0Var7.a("App is missing INTERNET permission");
                                }
                                if (!qchVar2.e1("android.permission.ACCESS_NETWORK_STATE")) {
                                    w3h.h(w0hVar4);
                                    tz0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                                }
                                w3hVar5 = w3hVar3;
                                context = w3hVar5.a;
                                if (!rcg.a(context).c() && !qqgVar.D0()) {
                                    if (!qch.w1(context)) {
                                        w3h.h(w0hVar4);
                                        tz0Var7.a("AppMeasurementReceiver not registered/enabled");
                                    }
                                    if (!qch.V0(context)) {
                                        w3h.h(w0hVar4);
                                        tz0Var7.a("AppMeasurementService not registered/enabled");
                                    }
                                }
                                w3h.h(w0hVar4);
                                tz0Var7.a("Uploading is not possible. App measurement disabled");
                            } else {
                                w3hVar5 = w3hVar3;
                                qchVar2 = qchVar;
                            }
                            w0hVar5 = w0hVar4;
                        }
                        upg.a();
                        if (qqgVar.L0(null, bzg.P0)) {
                            qchVar2.A0();
                            if (qchVar2.Y0() == 1) {
                                long jIntValue2 = ((Integer) bzg.w0.a(null)).intValue();
                                long jNextInt2 = new Random().nextInt(5000);
                                w3hVar5.y.getClass();
                                jMax = Math.max(500L, ((jIntValue2 * 1000) + jNextInt2) - SystemClock.elapsedRealtime());
                                if (jMax > 500) {
                                    w3h.h(w0hVar5);
                                    tz0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                                }
                                w3h.g(c8hVar);
                                c8hVar.A0();
                                e6hVar = c8hVar.X;
                                if (e6hVar == null) {
                                    e6hVar = new e6h(c8hVar, w3hVar4, 0);
                                    c8hVar.X = e6hVar;
                                }
                                e6hVar.b(jMax);
                            }
                        }
                        c2hVar.E0.b(true);
                    }
                    w3hVar3 = w3hVar6;
                    tz0Var6 = tz0Var4;
                    qchVar = qchVar4;
                    if (!TextUtils.isEmpty(w3hVar3.l().H0()) && (i3 == 0 || i3 == 30 || i3 == 10 || i3 == 40)) {
                        w3h.g(c8hVar);
                        c8hVar.W0(new q5h(-10), false);
                    }
                    q5hVar = null;
                    if (q5hVar != null) {
                        w3h.g(c8hVar);
                        c8hVar.W0(q5hVar, true);
                        q5hVar2 = q5hVar;
                    } else {
                        q5hVar2 = q5hVarH0;
                    }
                    w3h.g(c8hVar);
                    w3hVar4 = (w3h) c8hVar.b;
                    c8hVar.a1(q5hVar2);
                    c2hVar.A0();
                    int i5 = xrg.b(c2hVar.E0().getString("dma_consent_settings", null)).a;
                    k5hVarQ2 = qqgVar.Q0("google_analytics_default_allow_ad_personalization_signals", true);
                    if (k5hVarQ2 != k5hVar) {
                        w3h.h(w0hVar4);
                        tz0Var3.b(k5hVarQ2, "Default ad personalization consent from Manifest");
                    }
                    k5hVarQ3 = qqgVar.Q0("google_analytics_default_allow_ad_user_data", true);
                    if (k5hVarQ3 == k5hVar) {
                        if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                            w3h.g(c8hVar);
                            c8hVar.V0(new xrg((Boolean) null, -10, (Boolean) null, (String) null), true);
                        }
                    } else if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                        w3h.g(c8hVar);
                        c8hVar.V0(new xrg((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                    boolN0 = qqgVar.N0("google_analytics_tcf_data_enabled");
                    if (boolN0 != null) {
                        w3h.h(w0hVar4);
                        tz0Var.a("TCF client enabled.");
                        w3h.g(c8hVar);
                        c8hVar.A0();
                        w0h w0hVar15 = w3hVar4.f;
                        w3h.h(w0hVar15);
                        w0hVar15.Y.a("Register tcfPrefChangeListener.");
                        if (c8hVar.J0 == null) {
                            c8hVar.K0 = new e6h(c8hVar, w3hVar4, 2);
                            c8hVar.J0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: w7h
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                    c8h c8hVar2 = c8hVar;
                                    c8hVar2.getClass();
                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                        w0h w0hVar16 = ((w3h) c8hVar2.b).f;
                                        w3h.h(w0hVar16);
                                        w0hVar16.Z.a("IABTCF_TCString change picked up in listener.");
                                        e6h e6hVar2 = c8hVar2.K0;
                                        oa7.A(e6hVar2);
                                        e6hVar2.b(500L);
                                    }
                                }
                            };
                        }
                        c2h c2hVar4 = w3hVar4.e;
                        w3h.f(c2hVar4);
                        c2hVar4.F0().registerOnSharedPreferenceChangeListener(c8hVar.J0);
                        w3h.g(c8hVar);
                        c8hVar.G0();
                    } else {
                        w3h.h(w0hVar4);
                        tz0Var.a("TCF client enabled.");
                        w3h.g(c8hVar);
                        c8hVar.A0();
                        w0h w0hVar16 = w3hVar4.f;
                        w3h.h(w0hVar16);
                        w0hVar16.Y.a("Register tcfPrefChangeListener.");
                        if (c8hVar.J0 == null) {
                            c8hVar.K0 = new e6h(c8hVar, w3hVar4, 2);
                            c8hVar.J0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: w7h
                                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                                public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                    c8h c8hVar2 = c8hVar;
                                    c8hVar2.getClass();
                                    if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                        w0h w0hVar17 = ((w3h) c8hVar2.b).f;
                                        w3h.h(w0hVar17);
                                        w0hVar17.Z.a("IABTCF_TCString change picked up in listener.");
                                        e6h e6hVar2 = c8hVar2.K0;
                                        oa7.A(e6hVar2);
                                        e6hVar2.b(500L);
                                    }
                                }
                            };
                        }
                        c2h c2hVar5 = w3hVar4.e;
                        w3h.f(c2hVar5);
                        c2hVar5.F0().registerOnSharedPreferenceChangeListener(c8hVar.J0);
                        w3h.g(c8hVar);
                        c8hVar.G0();
                    }
                    vVar = c2hVar.g;
                    if (vVar.a() == 0) {
                        w3h.h(w0hVar4);
                        tz0Var3.b(Long.valueOf(j), "Persisting first open");
                        vVar.b(j);
                    }
                    w3h.g(c8hVar);
                    fnbVar = c8hVar.G0;
                    if (fnbVar.g()) {
                        c2h c2hVar6 = ((w3h) fnbVar.a).e;
                        w3h.f(c2hVar6);
                        c2hVar6.M0.D(null);
                    }
                    if (w3hVar3.c()) {
                        if (w3hVar3.a()) {
                            qchVar2 = qchVar;
                            if (qchVar2.e1("android.permission.INTERNET")) {
                                w3h.h(w0hVar4);
                                tz0Var7 = tz0Var6;
                                tz0Var7.a("App is missing INTERNET permission");
                            } else {
                                tz0Var7 = tz0Var6;
                            }
                            if (!qchVar2.e1("android.permission.ACCESS_NETWORK_STATE")) {
                                w3h.h(w0hVar4);
                                tz0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                            }
                            w3hVar5 = w3hVar3;
                            context = w3hVar5.a;
                            if (!rcg.a(context).c()) {
                                if (!qch.w1(context)) {
                                    w3h.h(w0hVar4);
                                    tz0Var7.a("AppMeasurementReceiver not registered/enabled");
                                }
                                if (!qch.V0(context)) {
                                    w3h.h(w0hVar4);
                                    tz0Var7.a("AppMeasurementService not registered/enabled");
                                }
                            }
                            w3h.h(w0hVar4);
                            tz0Var7.a("Uploading is not possible. App measurement disabled");
                        } else {
                            w3hVar5 = w3hVar3;
                            qchVar2 = qchVar;
                        }
                        w0hVar5 = w0hVar4;
                    } else {
                        w3hVar5 = w3hVar3;
                        qchVar2 = qchVar;
                        if (TextUtils.isEmpty(w3hVar5.l().H0())) {
                            String strH2 = w3hVar5.l().H0();
                            c2hVar.A0();
                            String string4 = c2hVar.E0().getString("gmp_app_id", null);
                            zIsEmpty = TextUtils.isEmpty(strH2);
                            boolean zIsEmpty3 = TextUtils.isEmpty(string4);
                            if (zIsEmpty) {
                                zi0Var2 = zi0Var;
                            } else {
                                zi0Var2 = zi0Var;
                            }
                            String strH3 = w3hVar5.l().H0();
                            c2hVar.A0();
                            SharedPreferences.Editor editorEdit5 = c2hVar.E0().edit();
                            editorEdit5.putString("gmp_app_id", strH3);
                            editorEdit5.apply();
                        } else {
                            zi0Var2 = zi0Var;
                        }
                        if (!c2hVar.H0().i(o5hVar)) {
                            zi0Var2.D(null);
                        }
                        w3h.g(c8hVar);
                        c8hVar.v.set(zi0Var2.C());
                        w3hVar7.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                        w0hVar5 = w0hVar4;
                        if (!TextUtils.isEmpty(w3hVar5.l().H0())) {
                            zA = w3hVar5.a();
                            sharedPreferences = c2hVar.d;
                            if (sharedPreferences == null) {
                                zContains = false;
                            } else {
                                zContains = sharedPreferences.contains("deferred_analytics_collection");
                            }
                            if (!zContains) {
                                c2hVar.I0(!zA);
                            }
                            if (zA) {
                                w3h.g(c8hVar);
                                c8hVar.M0();
                            }
                            ebh ebhVar3 = w3hVar5.v;
                            w3h.g(ebhVar3);
                            ebhVar3.f.k();
                            w3hVar5.j().E0(new AtomicReference());
                            w3hVar5.j().F0(c2hVar.O0.l());
                        }
                    }
                    upg.a();
                    if (qqgVar.L0(null, bzg.P0)) {
                        qchVar2.A0();
                        if (qchVar2.Y0() == 1) {
                            long jIntValue3 = ((Integer) bzg.w0.a(null)).intValue();
                            long jNextInt3 = new Random().nextInt(5000);
                            w3hVar5.y.getClass();
                            jMax = Math.max(500L, ((jIntValue3 * 1000) + jNextInt3) - SystemClock.elapsedRealtime());
                            if (jMax > 500) {
                                w3h.h(w0hVar5);
                                tz0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                            }
                            w3h.g(c8hVar);
                            c8hVar.A0();
                            e6hVar = c8hVar.X;
                            if (e6hVar == null) {
                                e6hVar = new e6h(c8hVar, w3hVar4, 0);
                                c8hVar.X = e6hVar;
                            }
                            e6hVar.b(jMax);
                        }
                    }
                    c2hVar.E0.b(true);
                }
                w0h w0hVar17 = w3hVar.f;
                w3h.h(w0hVar17);
                w0hVar17.g.a("Failed to load metadata: Metadata bundle is null");
                numValueOf = null;
                if (numValueOf != null) {
                    stringArray = w3hVar.a.getResources().getStringArray(numValueOf.intValue());
                    if (stringArray == null) {
                        listAsList = null;
                    } else {
                        listAsList = Arrays.asList(stringArray);
                    }
                } else {
                    listAsList = null;
                }
                if (listAsList != null) {
                    xzgVar2.z = listAsList;
                    break;
                }
                if (listAsList.isEmpty()) {
                    it = listAsList.iterator();
                    do {
                        if (it.hasNext()) {
                            xzgVar2.z = listAsList;
                            break;
                        } else {
                            str4 = (String) it.next();
                            qchVar3 = w3hVar8.w;
                            w3h.f(qchVar3);
                        }
                    } while (qchVar3.F1("safelisted event", str4));
                } else {
                    w3h.h(w0hVar2);
                    w0hVar2.z.a("Safelisted event list is empty. Ignoring");
                }
                if (packageManager != null) {
                    xzgVar2.Z = x57.Z(context2) ? 1 : 0;
                } else {
                    xzgVar2.Z = 0;
                }
                ((w3h) xzgVar2.b).R0.incrementAndGet();
                xzgVar2.c = true;
                o8hVar = new o8h(w3hVar6);
                w3hVar2 = (w3h) o8hVar.b;
                w3hVar2.P0++;
                o8hVar.C0();
                w3hVar6.J0 = o8hVar;
                if (!o8hVar.c) {
                    qc0.p(str);
                    return;
                }
                o8hVar.d = (JobScheduler) ((w3h) o8hVar.b).a.getSystemService("jobscheduler");
                w3hVar2.R0.incrementAndGet();
                o8hVar.c = true;
                w3h.h(w0hVar);
                w0hVar3 = w0hVar;
                tz0Var = w0hVar3.Y;
                tz0Var2 = w0hVar3.X;
                tz0Var3 = w0hVar3.Z;
                tz0Var4 = w0hVar3.g;
                qqgVar.G0();
                tz0Var2.b(161000L, "App measurement initialized, version");
                w3h.h(w0hVar3);
                tz0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
                strG0 = xzgVar.G0();
                if (qchVar4.g1(strG0, qqgVar.d)) {
                    w3h.h(w0hVar3);
                    tz0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
                } else {
                    w3h.h(w0hVar3);
                    tz0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strG0)));
                }
                w3h.h(w0hVar3);
                tz0Var.a("Debug-level message logging enabled");
                i2 = w3hVar6.P0;
                atomicInteger = w3hVar6.R0;
                if (i2 != atomicInteger.get()) {
                    w3h.h(w0hVar3);
                    tz0Var4.c(Integer.valueOf(w3hVar6.P0), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
                }
                w3hVar6.K0 = true;
                j = w3hVar6.S0;
                c8hVar = w3hVar6.X;
                w3h.h(m3hVar);
                m3hVar.A0();
                w3h.e(w3hVar6.J0);
                j4hVarF0 = w3hVar6.J0.F0();
                upg.a();
                zL0 = qqgVar.L0(null, bzg.P0);
                if (j4hVarF0 == j4h.CLIENT_UPLOAD_ELIGIBLE) {
                    z = true;
                } else {
                    z = false;
                }
                if (zL0) {
                    qchVar4.A0();
                    if (qchVar4.Y0() == 1) {
                        qchVar4.A0();
                        IntentFilter intentFilter4 = new IntentFilter();
                        intentFilter4.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter4.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        tz0Var5 = tz0Var2;
                        w0hVar4 = w0hVar3;
                        bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter4, null, 2);
                        w0h w0hVar18 = w3hVar7.f;
                        w3h.h(w0hVar18);
                        w0hVar18.Y.a("Registered app receiver");
                        if (z2) {
                            w3h.e(w3hVar6.J0);
                            w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                        }
                    } else if (z) {
                        z = true;
                        qchVar4.A0();
                        IntentFilter intentFilter5 = new IntentFilter();
                        intentFilter5.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                        intentFilter5.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                        z2 = z;
                        tz0Var5 = tz0Var2;
                        w0hVar4 = w0hVar3;
                        bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter5, null, 2);
                        w0h w0hVar19 = w3hVar7.f;
                        w3h.h(w0hVar19);
                        w0hVar19.Y.a("Registered app receiver");
                        if (z2) {
                            w3h.e(w3hVar6.J0);
                            w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                        }
                    } else {
                        tz0Var5 = tz0Var2;
                        w0hVar4 = w0hVar3;
                    }
                } else if (z) {
                    z = true;
                    qchVar4.A0();
                    IntentFilter intentFilter6 = new IntentFilter();
                    intentFilter6.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter6.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    tz0Var5 = tz0Var2;
                    w0hVar4 = w0hVar3;
                    bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter6, null, 2);
                    w0h w0hVar110 = w3hVar7.f;
                    w3h.h(w0hVar110);
                    w0hVar110.Y.a("Registered app receiver");
                    if (z2) {
                        w3h.e(w3hVar6.J0);
                        w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                    }
                } else {
                    tz0Var5 = tz0Var2;
                    w0hVar4 = w0hVar3;
                }
                zi0Var = c2hVar.v;
                q5hVarH0 = c2hVar.H0();
                int i6 = q5hVarH0.b;
                k5hVarQ0 = qqgVar.Q0("google_analytics_default_allow_ad_storage", false);
                k5hVarQ1 = qqgVar.Q0("google_analytics_default_allow_analytics_storage", false);
                o5hVar = o5h.ANALYTICS_STORAGE;
                k5hVar = k5h.UNINITIALIZED;
                if (k5hVarQ0 == k5hVar) {
                    w3hVar3 = w3hVar6;
                    tz0Var6 = tz0Var4;
                    qchVar = qchVar4;
                    if (q5h.l(-10, c2hVar.E0().getInt("consent_source", 100))) {
                        EnumMap enumMap3 = new EnumMap(o5h.class);
                        enumMap3.put(o5h.AD_STORAGE, k5hVarQ0);
                        enumMap3.put(o5hVar, k5hVarQ1);
                        q5hVar = new q5h(enumMap3, -10);
                    } else {
                        if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                            w3h.g(c8hVar);
                            c8hVar.W0(new q5h(-10), false);
                        }
                        q5hVar = null;
                    }
                } else {
                    w3hVar3 = w3hVar6;
                    tz0Var6 = tz0Var4;
                    qchVar = qchVar4;
                    if (q5h.l(-10, c2hVar.E0().getInt("consent_source", 100))) {
                        EnumMap enumMap4 = new EnumMap(o5h.class);
                        enumMap4.put(o5h.AD_STORAGE, k5hVarQ0);
                        enumMap4.put(o5hVar, k5hVarQ1);
                        q5hVar = new q5h(enumMap4, -10);
                    } else {
                        if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                            w3h.g(c8hVar);
                            c8hVar.W0(new q5h(-10), false);
                        }
                        q5hVar = null;
                    }
                }
                if (q5hVar != null) {
                    w3h.g(c8hVar);
                    c8hVar.W0(q5hVar, true);
                    q5hVar2 = q5hVar;
                } else {
                    q5hVar2 = q5hVarH0;
                }
                w3h.g(c8hVar);
                w3hVar4 = (w3h) c8hVar.b;
                c8hVar.a1(q5hVar2);
                c2hVar.A0();
                int i7 = xrg.b(c2hVar.E0().getString("dma_consent_settings", null)).a;
                k5hVarQ2 = qqgVar.Q0("google_analytics_default_allow_ad_personalization_signals", true);
                if (k5hVarQ2 != k5hVar) {
                    w3h.h(w0hVar4);
                    tz0Var3.b(k5hVarQ2, "Default ad personalization consent from Manifest");
                }
                k5hVarQ3 = qqgVar.Q0("google_analytics_default_allow_ad_user_data", true);
                if (k5hVarQ3 == k5hVar) {
                    if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                        w3h.g(c8hVar);
                        c8hVar.V0(new xrg((Boolean) null, -10, (Boolean) null, (String) null), true);
                    }
                } else if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                    w3h.g(c8hVar);
                    c8hVar.V0(new xrg((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
                boolN0 = qqgVar.N0("google_analytics_tcf_data_enabled");
                if (boolN0 != null) {
                    w3h.h(w0hVar4);
                    tz0Var.a("TCF client enabled.");
                    w3h.g(c8hVar);
                    c8hVar.A0();
                    w0h w0hVar111 = w3hVar4.f;
                    w3h.h(w0hVar111);
                    w0hVar111.Y.a("Register tcfPrefChangeListener.");
                    if (c8hVar.J0 == null) {
                        c8hVar.K0 = new e6h(c8hVar, w3hVar4, 2);
                        c8hVar.J0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: w7h
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                c8h c8hVar2 = c8hVar;
                                c8hVar2.getClass();
                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                    w0h w0hVar112 = ((w3h) c8hVar2.b).f;
                                    w3h.h(w0hVar112);
                                    w0hVar112.Z.a("IABTCF_TCString change picked up in listener.");
                                    e6h e6hVar2 = c8hVar2.K0;
                                    oa7.A(e6hVar2);
                                    e6hVar2.b(500L);
                                }
                            }
                        };
                    }
                    c2h c2hVar7 = w3hVar4.e;
                    w3h.f(c2hVar7);
                    c2hVar7.F0().registerOnSharedPreferenceChangeListener(c8hVar.J0);
                    w3h.g(c8hVar);
                    c8hVar.G0();
                } else {
                    w3h.h(w0hVar4);
                    tz0Var.a("TCF client enabled.");
                    w3h.g(c8hVar);
                    c8hVar.A0();
                    w0h w0hVar112 = w3hVar4.f;
                    w3h.h(w0hVar112);
                    w0hVar112.Y.a("Register tcfPrefChangeListener.");
                    if (c8hVar.J0 == null) {
                        c8hVar.K0 = new e6h(c8hVar, w3hVar4, 2);
                        c8hVar.J0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: w7h
                            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                                c8h c8hVar2 = c8hVar;
                                c8hVar2.getClass();
                                if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                    w0h w0hVar113 = ((w3h) c8hVar2.b).f;
                                    w3h.h(w0hVar113);
                                    w0hVar113.Z.a("IABTCF_TCString change picked up in listener.");
                                    e6h e6hVar2 = c8hVar2.K0;
                                    oa7.A(e6hVar2);
                                    e6hVar2.b(500L);
                                }
                            }
                        };
                    }
                    c2h c2hVar8 = w3hVar4.e;
                    w3h.f(c2hVar8);
                    c2hVar8.F0().registerOnSharedPreferenceChangeListener(c8hVar.J0);
                    w3h.g(c8hVar);
                    c8hVar.G0();
                }
                vVar = c2hVar.g;
                if (vVar.a() == 0) {
                    w3h.h(w0hVar4);
                    tz0Var3.b(Long.valueOf(j), "Persisting first open");
                    vVar.b(j);
                }
                w3h.g(c8hVar);
                fnbVar = c8hVar.G0;
                if (fnbVar.g()) {
                    c2h c2hVar9 = ((w3h) fnbVar.a).e;
                    w3h.f(c2hVar9);
                    c2hVar9.M0.D(null);
                }
                if (w3hVar3.c()) {
                    if (w3hVar3.a()) {
                        qchVar2 = qchVar;
                        if (qchVar2.e1("android.permission.INTERNET")) {
                            w3h.h(w0hVar4);
                            tz0Var7 = tz0Var6;
                            tz0Var7.a("App is missing INTERNET permission");
                        } else {
                            tz0Var7 = tz0Var6;
                        }
                        if (!qchVar2.e1("android.permission.ACCESS_NETWORK_STATE")) {
                            w3h.h(w0hVar4);
                            tz0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                        }
                        w3hVar5 = w3hVar3;
                        context = w3hVar5.a;
                        if (!rcg.a(context).c()) {
                            if (!qch.w1(context)) {
                                w3h.h(w0hVar4);
                                tz0Var7.a("AppMeasurementReceiver not registered/enabled");
                            }
                            if (!qch.V0(context)) {
                                w3h.h(w0hVar4);
                                tz0Var7.a("AppMeasurementService not registered/enabled");
                            }
                        }
                        w3h.h(w0hVar4);
                        tz0Var7.a("Uploading is not possible. App measurement disabled");
                    } else {
                        w3hVar5 = w3hVar3;
                        qchVar2 = qchVar;
                    }
                    w0hVar5 = w0hVar4;
                } else {
                    w3hVar5 = w3hVar3;
                    qchVar2 = qchVar;
                    if (TextUtils.isEmpty(w3hVar5.l().H0())) {
                        String strH4 = w3hVar5.l().H0();
                        c2hVar.A0();
                        String string5 = c2hVar.E0().getString("gmp_app_id", null);
                        zIsEmpty = TextUtils.isEmpty(strH4);
                        boolean zIsEmpty4 = TextUtils.isEmpty(string5);
                        if (zIsEmpty) {
                            zi0Var2 = zi0Var;
                        } else {
                            zi0Var2 = zi0Var;
                        }
                        String strH5 = w3hVar5.l().H0();
                        c2hVar.A0();
                        SharedPreferences.Editor editorEdit6 = c2hVar.E0().edit();
                        editorEdit6.putString("gmp_app_id", strH5);
                        editorEdit6.apply();
                    } else {
                        zi0Var2 = zi0Var;
                    }
                    if (!c2hVar.H0().i(o5hVar)) {
                        zi0Var2.D(null);
                    }
                    w3h.g(c8hVar);
                    c8hVar.v.set(zi0Var2.C());
                    w3hVar7.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                    w0hVar5 = w0hVar4;
                    if (!TextUtils.isEmpty(w3hVar5.l().H0())) {
                        zA = w3hVar5.a();
                        sharedPreferences = c2hVar.d;
                        if (sharedPreferences == null) {
                            zContains = false;
                        } else {
                            zContains = sharedPreferences.contains("deferred_analytics_collection");
                        }
                        if (!zContains) {
                            c2hVar.I0(!zA);
                        }
                        if (zA) {
                            w3h.g(c8hVar);
                            c8hVar.M0();
                        }
                        ebh ebhVar4 = w3hVar5.v;
                        w3h.g(ebhVar4);
                        ebhVar4.f.k();
                        w3hVar5.j().E0(new AtomicReference());
                        w3hVar5.j().F0(c2hVar.O0.l());
                    }
                }
                upg.a();
                if (qqgVar.L0(null, bzg.P0)) {
                    qchVar2.A0();
                    if (qchVar2.Y0() == 1) {
                        long jIntValue4 = ((Integer) bzg.w0.a(null)).intValue();
                        long jNextInt4 = new Random().nextInt(5000);
                        w3hVar5.y.getClass();
                        jMax = Math.max(500L, ((jIntValue4 * 1000) + jNextInt4) - SystemClock.elapsedRealtime());
                        if (jMax > 500) {
                            w3h.h(w0hVar5);
                            tz0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                        }
                        w3h.g(c8hVar);
                        c8hVar.A0();
                        e6hVar = c8hVar.X;
                        if (e6hVar == null) {
                            e6hVar = new e6h(c8hVar, w3hVar4, 0);
                            c8hVar.X = e6hVar;
                        }
                        e6hVar.b(jMax);
                    }
                }
                c2hVar.E0.b(true);
            }
            w3h.h(w0hVar9);
            w0hVar2 = w0hVar9;
            str = "Can't initialize twice";
            w0hVar = w0hVar6;
            w0hVar2.g.b(w0h.E0(packageName), "PackageManager is null, app identity information might be inaccurate. appId");
            strT = xzgVar2.Y;
            if (!TextUtils.isEmpty(strT)) {
                strT = rfc.t(context2, w3hVar8.E0);
            }
            if (TextUtils.isEmpty(strT)) {
                str5 = strT;
            }
            xzgVar2.E0 = str5;
            if (iB == 0) {
                w3h.h(w0hVar2);
                w0hVar2.Z.c(xzgVar2.d, xzgVar2.E0, "App measurement enabled for app package, google app id");
            }
        } catch (IllegalStateException e2) {
            w3h.h(w0hVar2);
            w0hVar2.g.c(w0h.E0(packageName), e2, "Fetching Google App Id failed with exception. appId");
        }
        str2 = "Unknown";
        string = str2;
        str3 = str7;
        i = Integer.MIN_VALUE;
        xzgVar2.d = packageName;
        xzgVar2.g = str3;
        xzgVar2.e = str2;
        xzgVar2.f = i;
        xzgVar2.v = string;
        xzgVar2.w = 0L;
        iB = w3hVar8.b();
        if (iB != 0) {
            w3h.h(w0hVar2);
            w0hVar2.Z.a("App measurement collection enabled");
        } else if (iB != 1) {
            w3h.h(w0hVar2);
            w0hVar2.X.a("App measurement deactivated via the manifest");
        } else if (iB != 3) {
            w3h.h(w0hVar2);
            w0hVar2.X.a("App measurement disabled by setAnalyticsCollectionEnabled(false)");
        } else if (iB != 4) {
            w3h.h(w0hVar2);
            w0hVar2.X.a("App measurement disabled via the manifest");
        } else if (iB != 6) {
            w3h.h(w0hVar2);
            w0hVar2.z.a("App measurement deactivated via resources. This method is being deprecated. Please refer to https://firebase.google.com/support/guides/disable-analytics");
        } else if (iB != 7) {
            w3h.h(w0hVar2);
            w0hVar2.X.a("App measurement disabled via the global data collection setting");
        } else if (iB != 8) {
            w3h.h(w0hVar2);
            w0hVar2.X.a("App measurement disabled");
            w3h.h(w0hVar2);
            w0hVar2.v.a("Invalid scion state in identity");
        } else {
            w3h.h(w0hVar2);
            w0hVar2.X.a("App measurement disabled due to denied storage consent");
        }
        xzgVar2.E0 = str5;
        xzgVar2.z = null;
        qqg qqgVar3 = w3hVar8.d;
        w3hVar = (w3h) qqgVar3.b;
        oa7.x("analytics.safelisted_events");
        bundleM0 = qqgVar3.M0();
        if (bundleM0 == null) {
            if (!bundleM0.containsKey("analytics.safelisted_events")) {
                numValueOf = Integer.valueOf(bundleM0.getInt("analytics.safelisted_events"));
            }
            if (numValueOf != null) {
                stringArray = w3hVar.a.getResources().getStringArray(numValueOf.intValue());
                if (stringArray == null) {
                    listAsList = null;
                } else {
                    listAsList = Arrays.asList(stringArray);
                }
            } else {
                listAsList = null;
            }
            if (listAsList != null) {
                xzgVar2.z = listAsList;
                break;
            }
            if (listAsList.isEmpty()) {
                it = listAsList.iterator();
                do {
                    if (it.hasNext()) {
                        xzgVar2.z = listAsList;
                        break;
                    } else {
                        str4 = (String) it.next();
                        qchVar3 = w3hVar8.w;
                        w3h.f(qchVar3);
                    }
                } while (qchVar3.F1("safelisted event", str4));
            } else {
                w3h.h(w0hVar2);
                w0hVar2.z.a("Safelisted event list is empty. Ignoring");
            }
            if (packageManager != null) {
                xzgVar2.Z = x57.Z(context2) ? 1 : 0;
            } else {
                xzgVar2.Z = 0;
            }
            ((w3h) xzgVar2.b).R0.incrementAndGet();
            xzgVar2.c = true;
            o8hVar = new o8h(w3hVar6);
            w3hVar2 = (w3h) o8hVar.b;
            w3hVar2.P0++;
            o8hVar.C0();
            w3hVar6.J0 = o8hVar;
            if (!o8hVar.c) {
                qc0.p(str);
                return;
            }
            o8hVar.d = (JobScheduler) ((w3h) o8hVar.b).a.getSystemService("jobscheduler");
            w3hVar2.R0.incrementAndGet();
            o8hVar.c = true;
            w3h.h(w0hVar);
            w0hVar3 = w0hVar;
            tz0Var = w0hVar3.Y;
            tz0Var2 = w0hVar3.X;
            tz0Var3 = w0hVar3.Z;
            tz0Var4 = w0hVar3.g;
            qqgVar.G0();
            tz0Var2.b(161000L, "App measurement initialized, version");
            w3h.h(w0hVar3);
            tz0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
            strG0 = xzgVar.G0();
            if (qchVar4.g1(strG0, qqgVar.d)) {
                w3h.h(w0hVar3);
                tz0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
            } else {
                w3h.h(w0hVar3);
                tz0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strG0)));
            }
            w3h.h(w0hVar3);
            tz0Var.a("Debug-level message logging enabled");
            i2 = w3hVar6.P0;
            atomicInteger = w3hVar6.R0;
            if (i2 != atomicInteger.get()) {
                w3h.h(w0hVar3);
                tz0Var4.c(Integer.valueOf(w3hVar6.P0), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
            }
            w3hVar6.K0 = true;
            j = w3hVar6.S0;
            c8hVar = w3hVar6.X;
            w3h.h(m3hVar);
            m3hVar.A0();
            w3h.e(w3hVar6.J0);
            j4hVarF0 = w3hVar6.J0.F0();
            upg.a();
            zL0 = qqgVar.L0(null, bzg.P0);
            if (j4hVarF0 == j4h.CLIENT_UPLOAD_ELIGIBLE) {
                z = true;
            } else {
                z = false;
            }
            if (zL0) {
                qchVar4.A0();
                if (qchVar4.Y0() == 1) {
                    qchVar4.A0();
                    IntentFilter intentFilter7 = new IntentFilter();
                    intentFilter7.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter7.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    tz0Var5 = tz0Var2;
                    w0hVar4 = w0hVar3;
                    bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter7, null, 2);
                    w0h w0hVar113 = w3hVar7.f;
                    w3h.h(w0hVar113);
                    w0hVar113.Y.a("Registered app receiver");
                    if (z2) {
                        w3h.e(w3hVar6.J0);
                        w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                    }
                } else if (z) {
                    z = true;
                    qchVar4.A0();
                    IntentFilter intentFilter8 = new IntentFilter();
                    intentFilter8.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                    intentFilter8.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                    z2 = z;
                    tz0Var5 = tz0Var2;
                    w0hVar4 = w0hVar3;
                    bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter8, null, 2);
                    w0h w0hVar114 = w3hVar7.f;
                    w3h.h(w0hVar114);
                    w0hVar114.Y.a("Registered app receiver");
                    if (z2) {
                        w3h.e(w3hVar6.J0);
                        w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                    }
                } else {
                    tz0Var5 = tz0Var2;
                    w0hVar4 = w0hVar3;
                }
            } else if (z) {
                z = true;
                qchVar4.A0();
                IntentFilter intentFilter9 = new IntentFilter();
                intentFilter9.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter9.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                tz0Var5 = tz0Var2;
                w0hVar4 = w0hVar3;
                bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter9, null, 2);
                w0h w0hVar115 = w3hVar7.f;
                w3h.h(w0hVar115);
                w0hVar115.Y.a("Registered app receiver");
                if (z2) {
                    w3h.e(w3hVar6.J0);
                    w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                }
            } else {
                tz0Var5 = tz0Var2;
                w0hVar4 = w0hVar3;
            }
            zi0Var = c2hVar.v;
            q5hVarH0 = c2hVar.H0();
            int i8 = q5hVarH0.b;
            k5hVarQ0 = qqgVar.Q0("google_analytics_default_allow_ad_storage", false);
            k5hVarQ1 = qqgVar.Q0("google_analytics_default_allow_analytics_storage", false);
            o5hVar = o5h.ANALYTICS_STORAGE;
            k5hVar = k5h.UNINITIALIZED;
            if (k5hVarQ0 == k5hVar) {
                w3hVar3 = w3hVar6;
                tz0Var6 = tz0Var4;
                qchVar = qchVar4;
                if (q5h.l(-10, c2hVar.E0().getInt("consent_source", 100))) {
                    EnumMap enumMap5 = new EnumMap(o5h.class);
                    enumMap5.put(o5h.AD_STORAGE, k5hVarQ0);
                    enumMap5.put(o5hVar, k5hVarQ1);
                    q5hVar = new q5h(enumMap5, -10);
                } else {
                    if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                        w3h.g(c8hVar);
                        c8hVar.W0(new q5h(-10), false);
                    }
                    q5hVar = null;
                }
            } else {
                w3hVar3 = w3hVar6;
                tz0Var6 = tz0Var4;
                qchVar = qchVar4;
                if (q5h.l(-10, c2hVar.E0().getInt("consent_source", 100))) {
                    EnumMap enumMap6 = new EnumMap(o5h.class);
                    enumMap6.put(o5h.AD_STORAGE, k5hVarQ0);
                    enumMap6.put(o5hVar, k5hVarQ1);
                    q5hVar = new q5h(enumMap6, -10);
                } else {
                    if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                        w3h.g(c8hVar);
                        c8hVar.W0(new q5h(-10), false);
                    }
                    q5hVar = null;
                }
            }
            if (q5hVar != null) {
                w3h.g(c8hVar);
                c8hVar.W0(q5hVar, true);
                q5hVar2 = q5hVar;
            } else {
                q5hVar2 = q5hVarH0;
            }
            w3h.g(c8hVar);
            w3hVar4 = (w3h) c8hVar.b;
            c8hVar.a1(q5hVar2);
            c2hVar.A0();
            int i9 = xrg.b(c2hVar.E0().getString("dma_consent_settings", null)).a;
            k5hVarQ2 = qqgVar.Q0("google_analytics_default_allow_ad_personalization_signals", true);
            if (k5hVarQ2 != k5hVar) {
                w3h.h(w0hVar4);
                tz0Var3.b(k5hVarQ2, "Default ad personalization consent from Manifest");
            }
            k5hVarQ3 = qqgVar.Q0("google_analytics_default_allow_ad_user_data", true);
            if (k5hVarQ3 == k5hVar) {
                if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                    w3h.g(c8hVar);
                    c8hVar.V0(new xrg((Boolean) null, -10, (Boolean) null, (String) null), true);
                }
            } else if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                w3h.g(c8hVar);
                c8hVar.V0(new xrg((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
            boolN0 = qqgVar.N0("google_analytics_tcf_data_enabled");
            if (boolN0 != null) {
                w3h.h(w0hVar4);
                tz0Var.a("TCF client enabled.");
                w3h.g(c8hVar);
                c8hVar.A0();
                w0h w0hVar116 = w3hVar4.f;
                w3h.h(w0hVar116);
                w0hVar116.Y.a("Register tcfPrefChangeListener.");
                if (c8hVar.J0 == null) {
                    c8hVar.K0 = new e6h(c8hVar, w3hVar4, 2);
                    c8hVar.J0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: w7h
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                            c8h c8hVar2 = c8hVar;
                            c8hVar2.getClass();
                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                w0h w0hVar117 = ((w3h) c8hVar2.b).f;
                                w3h.h(w0hVar117);
                                w0hVar117.Z.a("IABTCF_TCString change picked up in listener.");
                                e6h e6hVar2 = c8hVar2.K0;
                                oa7.A(e6hVar2);
                                e6hVar2.b(500L);
                            }
                        }
                    };
                }
                c2h c2hVar10 = w3hVar4.e;
                w3h.f(c2hVar10);
                c2hVar10.F0().registerOnSharedPreferenceChangeListener(c8hVar.J0);
                w3h.g(c8hVar);
                c8hVar.G0();
            } else {
                w3h.h(w0hVar4);
                tz0Var.a("TCF client enabled.");
                w3h.g(c8hVar);
                c8hVar.A0();
                w0h w0hVar117 = w3hVar4.f;
                w3h.h(w0hVar117);
                w0hVar117.Y.a("Register tcfPrefChangeListener.");
                if (c8hVar.J0 == null) {
                    c8hVar.K0 = new e6h(c8hVar, w3hVar4, 2);
                    c8hVar.J0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: w7h
                        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                            c8h c8hVar2 = c8hVar;
                            c8hVar2.getClass();
                            if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                                w0h w0hVar118 = ((w3h) c8hVar2.b).f;
                                w3h.h(w0hVar118);
                                w0hVar118.Z.a("IABTCF_TCString change picked up in listener.");
                                e6h e6hVar2 = c8hVar2.K0;
                                oa7.A(e6hVar2);
                                e6hVar2.b(500L);
                            }
                        }
                    };
                }
                c2h c2hVar11 = w3hVar4.e;
                w3h.f(c2hVar11);
                c2hVar11.F0().registerOnSharedPreferenceChangeListener(c8hVar.J0);
                w3h.g(c8hVar);
                c8hVar.G0();
            }
            vVar = c2hVar.g;
            if (vVar.a() == 0) {
                w3h.h(w0hVar4);
                tz0Var3.b(Long.valueOf(j), "Persisting first open");
                vVar.b(j);
            }
            w3h.g(c8hVar);
            fnbVar = c8hVar.G0;
            if (fnbVar.g()) {
                c2h c2hVar12 = ((w3h) fnbVar.a).e;
                w3h.f(c2hVar12);
                c2hVar12.M0.D(null);
            }
            if (w3hVar3.c()) {
                if (w3hVar3.a()) {
                    qchVar2 = qchVar;
                    if (qchVar2.e1("android.permission.INTERNET")) {
                        w3h.h(w0hVar4);
                        tz0Var7 = tz0Var6;
                        tz0Var7.a("App is missing INTERNET permission");
                    } else {
                        tz0Var7 = tz0Var6;
                    }
                    if (!qchVar2.e1("android.permission.ACCESS_NETWORK_STATE")) {
                        w3h.h(w0hVar4);
                        tz0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                    }
                    w3hVar5 = w3hVar3;
                    context = w3hVar5.a;
                    if (!rcg.a(context).c()) {
                        if (!qch.w1(context)) {
                            w3h.h(w0hVar4);
                            tz0Var7.a("AppMeasurementReceiver not registered/enabled");
                        }
                        if (!qch.V0(context)) {
                            w3h.h(w0hVar4);
                            tz0Var7.a("AppMeasurementService not registered/enabled");
                        }
                    }
                    w3h.h(w0hVar4);
                    tz0Var7.a("Uploading is not possible. App measurement disabled");
                } else {
                    w3hVar5 = w3hVar3;
                    qchVar2 = qchVar;
                }
                w0hVar5 = w0hVar4;
            } else {
                w3hVar5 = w3hVar3;
                qchVar2 = qchVar;
                if (TextUtils.isEmpty(w3hVar5.l().H0())) {
                    String strH6 = w3hVar5.l().H0();
                    c2hVar.A0();
                    String string6 = c2hVar.E0().getString("gmp_app_id", null);
                    zIsEmpty = TextUtils.isEmpty(strH6);
                    boolean zIsEmpty5 = TextUtils.isEmpty(string6);
                    if (zIsEmpty) {
                        zi0Var2 = zi0Var;
                    } else {
                        zi0Var2 = zi0Var;
                    }
                    String strH7 = w3hVar5.l().H0();
                    c2hVar.A0();
                    SharedPreferences.Editor editorEdit7 = c2hVar.E0().edit();
                    editorEdit7.putString("gmp_app_id", strH7);
                    editorEdit7.apply();
                } else {
                    zi0Var2 = zi0Var;
                }
                if (!c2hVar.H0().i(o5hVar)) {
                    zi0Var2.D(null);
                }
                w3h.g(c8hVar);
                c8hVar.v.set(zi0Var2.C());
                w3hVar7.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
                w0hVar5 = w0hVar4;
                if (!TextUtils.isEmpty(w3hVar5.l().H0())) {
                    zA = w3hVar5.a();
                    sharedPreferences = c2hVar.d;
                    if (sharedPreferences == null) {
                        zContains = false;
                    } else {
                        zContains = sharedPreferences.contains("deferred_analytics_collection");
                    }
                    if (!zContains) {
                        c2hVar.I0(!zA);
                    }
                    if (zA) {
                        w3h.g(c8hVar);
                        c8hVar.M0();
                    }
                    ebh ebhVar5 = w3hVar5.v;
                    w3h.g(ebhVar5);
                    ebhVar5.f.k();
                    w3hVar5.j().E0(new AtomicReference());
                    w3hVar5.j().F0(c2hVar.O0.l());
                }
            }
            upg.a();
            if (qqgVar.L0(null, bzg.P0)) {
                qchVar2.A0();
                if (qchVar2.Y0() == 1) {
                    long jIntValue5 = ((Integer) bzg.w0.a(null)).intValue();
                    long jNextInt5 = new Random().nextInt(5000);
                    w3hVar5.y.getClass();
                    jMax = Math.max(500L, ((jIntValue5 * 1000) + jNextInt5) - SystemClock.elapsedRealtime());
                    if (jMax > 500) {
                        w3h.h(w0hVar5);
                        tz0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                    }
                    w3h.g(c8hVar);
                    c8hVar.A0();
                    e6hVar = c8hVar.X;
                    if (e6hVar == null) {
                        e6hVar = new e6h(c8hVar, w3hVar4, 0);
                        c8hVar.X = e6hVar;
                    }
                    e6hVar.b(jMax);
                }
            }
            c2hVar.E0.b(true);
        }
        w0h w0hVar118 = w3hVar.f;
        w3h.h(w0hVar118);
        w0hVar118.g.a("Failed to load metadata: Metadata bundle is null");
        numValueOf = null;
        if (numValueOf != null) {
            stringArray = w3hVar.a.getResources().getStringArray(numValueOf.intValue());
            if (stringArray == null) {
                listAsList = null;
            } else {
                listAsList = Arrays.asList(stringArray);
            }
        } else {
            listAsList = null;
        }
        if (listAsList != null) {
            xzgVar2.z = listAsList;
            break;
        }
        if (listAsList.isEmpty()) {
            it = listAsList.iterator();
            do {
                if (it.hasNext()) {
                    xzgVar2.z = listAsList;
                    break;
                } else {
                    str4 = (String) it.next();
                    qchVar3 = w3hVar8.w;
                    w3h.f(qchVar3);
                }
            } while (qchVar3.F1("safelisted event", str4));
        } else {
            w3h.h(w0hVar2);
            w0hVar2.z.a("Safelisted event list is empty. Ignoring");
        }
        if (packageManager != null) {
            xzgVar2.Z = x57.Z(context2) ? 1 : 0;
        } else {
            xzgVar2.Z = 0;
        }
        ((w3h) xzgVar2.b).R0.incrementAndGet();
        xzgVar2.c = true;
        o8hVar = new o8h(w3hVar6);
        w3hVar2 = (w3h) o8hVar.b;
        w3hVar2.P0++;
        o8hVar.C0();
        w3hVar6.J0 = o8hVar;
        if (!o8hVar.c) {
            qc0.p(str);
            return;
        }
        o8hVar.d = (JobScheduler) ((w3h) o8hVar.b).a.getSystemService("jobscheduler");
        w3hVar2.R0.incrementAndGet();
        o8hVar.c = true;
        w3h.h(w0hVar);
        w0hVar3 = w0hVar;
        tz0Var = w0hVar3.Y;
        tz0Var2 = w0hVar3.X;
        tz0Var3 = w0hVar3.Z;
        tz0Var4 = w0hVar3.g;
        qqgVar.G0();
        tz0Var2.b(161000L, "App measurement initialized, version");
        w3h.h(w0hVar3);
        tz0Var2.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        strG0 = xzgVar.G0();
        if (qchVar4.g1(strG0, qqgVar.d)) {
            w3h.h(w0hVar3);
            tz0Var2.a("Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.");
        } else {
            w3h.h(w0hVar3);
            tz0Var2.a("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(String.valueOf(strG0)));
        }
        w3h.h(w0hVar3);
        tz0Var.a("Debug-level message logging enabled");
        i2 = w3hVar6.P0;
        atomicInteger = w3hVar6.R0;
        if (i2 != atomicInteger.get()) {
            w3h.h(w0hVar3);
            tz0Var4.c(Integer.valueOf(w3hVar6.P0), Integer.valueOf(atomicInteger.get()), "Not all components initialized");
        }
        w3hVar6.K0 = true;
        j = w3hVar6.S0;
        c8hVar = w3hVar6.X;
        w3h.h(m3hVar);
        m3hVar.A0();
        w3h.e(w3hVar6.J0);
        j4hVarF0 = w3hVar6.J0.F0();
        upg.a();
        zL0 = qqgVar.L0(null, bzg.P0);
        if (j4hVarF0 == j4h.CLIENT_UPLOAD_ELIGIBLE) {
            z = true;
        } else {
            z = false;
        }
        if (zL0) {
            qchVar4.A0();
            if (qchVar4.Y0() == 1) {
                qchVar4.A0();
                IntentFilter intentFilter10 = new IntentFilter();
                intentFilter10.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter10.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                tz0Var5 = tz0Var2;
                w0hVar4 = w0hVar3;
                bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter10, null, 2);
                w0h w0hVar119 = w3hVar7.f;
                w3h.h(w0hVar119);
                w0hVar119.Y.a("Registered app receiver");
                if (z2) {
                    w3h.e(w3hVar6.J0);
                    w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                }
            } else if (z) {
                z = true;
                qchVar4.A0();
                IntentFilter intentFilter11 = new IntentFilter();
                intentFilter11.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
                intentFilter11.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
                z2 = z;
                tz0Var5 = tz0Var2;
                w0hVar4 = w0hVar3;
                bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter11, null, 2);
                w0h w0hVar1110 = w3hVar7.f;
                w3h.h(w0hVar1110);
                w0hVar1110.Y.a("Registered app receiver");
                if (z2) {
                    w3h.e(w3hVar6.J0);
                    w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
                }
            } else {
                tz0Var5 = tz0Var2;
                w0hVar4 = w0hVar3;
            }
        } else if (z) {
            z = true;
            qchVar4.A0();
            IntentFilter intentFilter12 = new IntentFilter();
            intentFilter12.addAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intentFilter12.addAction("com.google.android.gms.measurement.BATCHES_AVAILABLE");
            z2 = z;
            tz0Var5 = tz0Var2;
            w0hVar4 = w0hVar3;
            bp.H(w3hVar7.a, new n80(w3hVar7), intentFilter12, null, 2);
            w0h w0hVar1111 = w3hVar7.f;
            w3h.h(w0hVar1111);
            w0hVar1111.Y.a("Registered app receiver");
            if (z2) {
                w3h.e(w3hVar6.J0);
                w3hVar6.J0.E0(((Long) bzg.C.a(null)).longValue());
            }
        } else {
            tz0Var5 = tz0Var2;
            w0hVar4 = w0hVar3;
        }
        zi0Var = c2hVar.v;
        q5hVarH0 = c2hVar.H0();
        int i10 = q5hVarH0.b;
        k5hVarQ0 = qqgVar.Q0("google_analytics_default_allow_ad_storage", false);
        k5hVarQ1 = qqgVar.Q0("google_analytics_default_allow_analytics_storage", false);
        o5hVar = o5h.ANALYTICS_STORAGE;
        k5hVar = k5h.UNINITIALIZED;
        if (k5hVarQ0 == k5hVar) {
            w3hVar3 = w3hVar6;
            tz0Var6 = tz0Var4;
            qchVar = qchVar4;
            if (q5h.l(-10, c2hVar.E0().getInt("consent_source", 100))) {
                EnumMap enumMap7 = new EnumMap(o5h.class);
                enumMap7.put(o5h.AD_STORAGE, k5hVarQ0);
                enumMap7.put(o5hVar, k5hVarQ1);
                q5hVar = new q5h(enumMap7, -10);
            } else {
                if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                    w3h.g(c8hVar);
                    c8hVar.W0(new q5h(-10), false);
                }
                q5hVar = null;
            }
        } else {
            w3hVar3 = w3hVar6;
            tz0Var6 = tz0Var4;
            qchVar = qchVar4;
            if (q5h.l(-10, c2hVar.E0().getInt("consent_source", 100))) {
                EnumMap enumMap8 = new EnumMap(o5h.class);
                enumMap8.put(o5h.AD_STORAGE, k5hVarQ0);
                enumMap8.put(o5hVar, k5hVarQ1);
                q5hVar = new q5h(enumMap8, -10);
            } else {
                if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                    w3h.g(c8hVar);
                    c8hVar.W0(new q5h(-10), false);
                }
                q5hVar = null;
            }
        }
        if (q5hVar != null) {
            w3h.g(c8hVar);
            c8hVar.W0(q5hVar, true);
            q5hVar2 = q5hVar;
        } else {
            q5hVar2 = q5hVarH0;
        }
        w3h.g(c8hVar);
        w3hVar4 = (w3h) c8hVar.b;
        c8hVar.a1(q5hVar2);
        c2hVar.A0();
        int i11 = xrg.b(c2hVar.E0().getString("dma_consent_settings", null)).a;
        k5hVarQ2 = qqgVar.Q0("google_analytics_default_allow_ad_personalization_signals", true);
        if (k5hVarQ2 != k5hVar) {
            w3h.h(w0hVar4);
            tz0Var3.b(k5hVarQ2, "Default ad personalization consent from Manifest");
        }
        k5hVarQ3 = qqgVar.Q0("google_analytics_default_allow_ad_user_data", true);
        if (k5hVarQ3 == k5hVar) {
            if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
                w3h.g(c8hVar);
                c8hVar.V0(new xrg((Boolean) null, -10, (Boolean) null, (String) null), true);
            }
        } else if (!TextUtils.isEmpty(w3hVar3.l().H0())) {
            w3h.g(c8hVar);
            c8hVar.V0(new xrg((Boolean) null, -10, (Boolean) null, (String) null), true);
        }
        boolN0 = qqgVar.N0("google_analytics_tcf_data_enabled");
        if (boolN0 != null) {
            w3h.h(w0hVar4);
            tz0Var.a("TCF client enabled.");
            w3h.g(c8hVar);
            c8hVar.A0();
            w0h w0hVar1112 = w3hVar4.f;
            w3h.h(w0hVar1112);
            w0hVar1112.Y.a("Register tcfPrefChangeListener.");
            if (c8hVar.J0 == null) {
                c8hVar.K0 = new e6h(c8hVar, w3hVar4, 2);
                c8hVar.J0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: w7h
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                        c8h c8hVar2 = c8hVar;
                        c8hVar2.getClass();
                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                            w0h w0hVar1113 = ((w3h) c8hVar2.b).f;
                            w3h.h(w0hVar1113);
                            w0hVar1113.Z.a("IABTCF_TCString change picked up in listener.");
                            e6h e6hVar2 = c8hVar2.K0;
                            oa7.A(e6hVar2);
                            e6hVar2.b(500L);
                        }
                    }
                };
            }
            c2h c2hVar13 = w3hVar4.e;
            w3h.f(c2hVar13);
            c2hVar13.F0().registerOnSharedPreferenceChangeListener(c8hVar.J0);
            w3h.g(c8hVar);
            c8hVar.G0();
        } else {
            w3h.h(w0hVar4);
            tz0Var.a("TCF client enabled.");
            w3h.g(c8hVar);
            c8hVar.A0();
            w0h w0hVar1113 = w3hVar4.f;
            w3h.h(w0hVar1113);
            w0hVar1113.Y.a("Register tcfPrefChangeListener.");
            if (c8hVar.J0 == null) {
                c8hVar.K0 = new e6h(c8hVar, w3hVar4, 2);
                c8hVar.J0 = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: w7h
                    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences3, String str8) {
                        c8h c8hVar2 = c8hVar;
                        c8hVar2.getClass();
                        if (Objects.equals(str8, "IABTCF_TCString") || Objects.equals(str8, "IABTCF_gdprApplies") || Objects.equals(str8, "IABTCF_EnableAdvertiserConsentMode")) {
                            w0h w0hVar1114 = ((w3h) c8hVar2.b).f;
                            w3h.h(w0hVar1114);
                            w0hVar1114.Z.a("IABTCF_TCString change picked up in listener.");
                            e6h e6hVar2 = c8hVar2.K0;
                            oa7.A(e6hVar2);
                            e6hVar2.b(500L);
                        }
                    }
                };
            }
            c2h c2hVar14 = w3hVar4.e;
            w3h.f(c2hVar14);
            c2hVar14.F0().registerOnSharedPreferenceChangeListener(c8hVar.J0);
            w3h.g(c8hVar);
            c8hVar.G0();
        }
        vVar = c2hVar.g;
        if (vVar.a() == 0) {
            w3h.h(w0hVar4);
            tz0Var3.b(Long.valueOf(j), "Persisting first open");
            vVar.b(j);
        }
        w3h.g(c8hVar);
        fnbVar = c8hVar.G0;
        if (fnbVar.g()) {
            c2h c2hVar15 = ((w3h) fnbVar.a).e;
            w3h.f(c2hVar15);
            c2hVar15.M0.D(null);
        }
        if (w3hVar3.c()) {
            if (w3hVar3.a()) {
                qchVar2 = qchVar;
                if (qchVar2.e1("android.permission.INTERNET")) {
                    w3h.h(w0hVar4);
                    tz0Var7 = tz0Var6;
                    tz0Var7.a("App is missing INTERNET permission");
                } else {
                    tz0Var7 = tz0Var6;
                }
                if (!qchVar2.e1("android.permission.ACCESS_NETWORK_STATE")) {
                    w3h.h(w0hVar4);
                    tz0Var7.a("App is missing ACCESS_NETWORK_STATE permission");
                }
                w3hVar5 = w3hVar3;
                context = w3hVar5.a;
                if (!rcg.a(context).c()) {
                    if (!qch.w1(context)) {
                        w3h.h(w0hVar4);
                        tz0Var7.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!qch.V0(context)) {
                        w3h.h(w0hVar4);
                        tz0Var7.a("AppMeasurementService not registered/enabled");
                    }
                }
                w3h.h(w0hVar4);
                tz0Var7.a("Uploading is not possible. App measurement disabled");
            } else {
                w3hVar5 = w3hVar3;
                qchVar2 = qchVar;
            }
            w0hVar5 = w0hVar4;
        } else {
            w3hVar5 = w3hVar3;
            qchVar2 = qchVar;
            if (TextUtils.isEmpty(w3hVar5.l().H0())) {
                String strH8 = w3hVar5.l().H0();
                c2hVar.A0();
                String string7 = c2hVar.E0().getString("gmp_app_id", null);
                zIsEmpty = TextUtils.isEmpty(strH8);
                boolean zIsEmpty6 = TextUtils.isEmpty(string7);
                if (zIsEmpty) {
                    zi0Var2 = zi0Var;
                } else {
                    zi0Var2 = zi0Var;
                }
                String strH9 = w3hVar5.l().H0();
                c2hVar.A0();
                SharedPreferences.Editor editorEdit8 = c2hVar.E0().edit();
                editorEdit8.putString("gmp_app_id", strH9);
                editorEdit8.apply();
            } else {
                zi0Var2 = zi0Var;
            }
            if (!c2hVar.H0().i(o5hVar)) {
                zi0Var2.D(null);
            }
            w3h.g(c8hVar);
            c8hVar.v.set(zi0Var2.C());
            w3hVar7.a.getClassLoader().loadClass("com.google.firebase.remoteconfig.FirebaseRemoteConfig");
            w0hVar5 = w0hVar4;
            if (!TextUtils.isEmpty(w3hVar5.l().H0())) {
                zA = w3hVar5.a();
                sharedPreferences = c2hVar.d;
                if (sharedPreferences == null) {
                    zContains = false;
                } else {
                    zContains = sharedPreferences.contains("deferred_analytics_collection");
                }
                if (!zContains) {
                    c2hVar.I0(!zA);
                }
                if (zA) {
                    w3h.g(c8hVar);
                    c8hVar.M0();
                }
                ebh ebhVar6 = w3hVar5.v;
                w3h.g(ebhVar6);
                ebhVar6.f.k();
                w3hVar5.j().E0(new AtomicReference());
                w3hVar5.j().F0(c2hVar.O0.l());
            }
        }
        upg.a();
        if (qqgVar.L0(null, bzg.P0)) {
            qchVar2.A0();
            if (qchVar2.Y0() == 1) {
                long jIntValue6 = ((Integer) bzg.w0.a(null)).intValue();
                long jNextInt6 = new Random().nextInt(5000);
                w3hVar5.y.getClass();
                jMax = Math.max(500L, ((jIntValue6 * 1000) + jNextInt6) - SystemClock.elapsedRealtime());
                if (jMax > 500) {
                    w3h.h(w0hVar5);
                    tz0Var3.b(Long.valueOf(jMax), "Waiting to fetch trigger URIs until some time after boot. Delay in millis");
                }
                w3h.g(c8hVar);
                c8hVar.A0();
                e6hVar = c8hVar.X;
                if (e6hVar == null) {
                    e6hVar = new e6h(c8hVar, w3hVar4, 0);
                    c8hVar.X = e6hVar;
                }
                e6hVar.b(jMax);
            }
        }
        c2hVar.E0.b(true);
    }

    /* JADX WARN: Code duplicated, block: B:80:0x01d7 A[Catch: all -> 0x01d4, TryCatch #7 {all -> 0x01d4, blocks: (B:66:0x01b6, B:68:0x01ba, B:70:0x01be, B:75:0x01cb, B:80:0x01d7, B:81:0x01e0), top: B:274:0x01b6 }] */
    @Override // java.lang.Runnable
    public final void run() {
        Throwable thP;
        or8 or8Var;
        boolean z;
        boolean z2;
        int i = 0;
        switch (this.a) {
            case 0:
                r36 r36Var = (r36) this.c;
                Future future = (Future) this.b;
                if ((future instanceof f2) && (thP = ((f2) future).p()) != null) {
                    r36Var.i(thP);
                    return;
                }
                try {
                    r36Var.a(pa7.T(future));
                    return;
                } catch (ExecutionException e) {
                    r36Var.i(e.getCause());
                    return;
                } catch (Throwable th) {
                    r36Var.i(th);
                    return;
                }
            case 1:
                vc vcVar = (vc) this.b;
                yc ycVar = (yc) this.c;
                qr8 qr8Var = ycVar.c;
                if (qr8Var != null && (or8Var = qr8Var.e) != null) {
                    or8Var.B(qr8Var);
                }
                View view = (View) ycVar.v;
                if (view != null && view.getWindowToken() != null) {
                    if (vcVar.b()) {
                        ycVar.H0 = vcVar;
                    } else if (vcVar.e != null) {
                        vcVar.d(0, 0, false, false);
                        ycVar.H0 = vcVar;
                    }
                }
                ycVar.J0 = null;
                return;
            case 2:
                ((ActivityHandler) this.c).launchAttributionResponseTasksI((AttributionResponseData) this.b);
                return;
            case 3:
                ((ActivityHandler) this.c).processRemoteTriggersI((ResponseData) this.b);
                return;
            case 4:
                ((OnAttributionReadListener) this.b).onAttributionRead(((ActivityHandler) this.c).attribution);
                return;
            case 5:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    OnAttributionReadListener onAttributionReadListener = (OnAttributionReadListener) obj;
                    if (onAttributionReadListener != null) {
                        onAttributionReadListener.onAttributionRead((AdjustAttribution) this.c);
                    }
                }
                return;
            case 6:
                ArrayList arrayList2 = (ArrayList) this.b;
                int size2 = arrayList2.size();
                while (i < size2) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj2;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                        if (onAdidReadListener != null) {
                            onAdidReadListener.onAdidRead((String) this.c);
                        }
                        adjustTimeoutCallback.setOnAdidReadListener(null);
                    }
                }
                return;
            case 7:
                ((OnDeeplinkResolvedListener) this.b).onDeeplinkResolved(((SdkClickResponseData) this.c).resolvedDeeplink);
                return;
            case 8:
                ((OnDeeplinkResolvedListener) this.b).onDeeplinkResolved((String) this.c);
                return;
            case 9:
                ((ActivityHandler) this.c).launchEventResponseTasksI((EventResponseData) this.b);
                return;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                Object obj3 = this.c;
                Object obj4 = this.b;
                try {
                    Method method = we.d;
                    if (method != null) {
                        method.invoke(obj4, obj3, Boolean.FALSE, "AppCompat recreation");
                    } else {
                        we.e.invoke(obj4, obj3, Boolean.FALSE);
                    }
                    return;
                } catch (RuntimeException e2) {
                    if (e2.getClass() == RuntimeException.class && e2.getMessage() != null && e2.getMessage().startsWith("Unable to stop")) {
                        throw e2;
                    }
                    return;
                } catch (Throwable th2) {
                    b1.e("ActivityRecreator", "Exception while invoking performStopActivity", th2);
                    return;
                }
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((OnAttributionReadListener) ((lh) this.c).e).onAttributionRead((AdjustAttribution) this.b);
                return;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                AttributionHandler attributionHandler = (AttributionHandler) this.c;
                IActivityHandler iActivityHandler = (IActivityHandler) attributionHandler.activityHandlerWeakRef.get();
                if (iActivityHandler == null) {
                    return;
                }
                attributionHandler.checkSdkClickResponseI(iActivityHandler, (SdkClickResponseData) this.b);
                return;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                oid oidVar = (oid) this.b;
                Typeface typeface = (Typeface) this.c;
                p90 p90Var = (p90) oidVar.b;
                if (p90Var != null) {
                    p90Var.U(typeface);
                    return;
                }
                return;
            case 14:
                nr3 nr3Var = (nr3) this.c;
                ArrayList<lr3> arrayList3 = (ArrayList) this.b;
                for (lr3 lr3Var : arrayList3) {
                    ArrayList arrayList4 = nr3Var.r;
                    long j = nr3Var.f;
                    flb flbVar = lr3Var.a;
                    View view2 = flbVar == null ? null : flbVar.a;
                    flb flbVar2 = lr3Var.b;
                    View view3 = flbVar2 != null ? flbVar2.a : null;
                    if (view2 != null) {
                        ViewPropertyAnimator duration = view2.animate().setDuration(j);
                        arrayList4.add(lr3Var.a);
                        duration.translationX(lr3Var.e - lr3Var.c);
                        duration.translationY(lr3Var.f - lr3Var.d);
                        duration.alpha(0.0f).setListener(new kr3(nr3Var, lr3Var, duration, view2, 0)).start();
                    }
                    if (view3 != null) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate = view3.animate();
                        arrayList4.add(lr3Var.b);
                        viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(j).alpha(1.0f).setListener(new kr3(nr3Var, lr3Var, viewPropertyAnimatorAnimate, view3, 1)).start();
                    }
                }
                arrayList3.clear();
                nr3Var.n.remove(arrayList3);
                return;
            case 15:
                k99.D((gs7) this.b).g(jzb.k((Throwable) this.c));
                return;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                eh0 eh0Var = (eh0) this.c;
                Object obj5 = this.b;
                boolean z3 = eh0Var.c.get();
                djg djgVar = eh0Var.e;
                if (z3) {
                    if (djgVar.h == eh0Var) {
                        SystemClock.uptimeMillis();
                        djgVar.h = null;
                        djgVar.a();
                    }
                } else if (djgVar.g != eh0Var) {
                    if (djgVar.h == eh0Var) {
                        SystemClock.uptimeMillis();
                        djgVar.h = null;
                        djgVar.a();
                    }
                } else if (!djgVar.c) {
                    SystemClock.uptimeMillis();
                    djgVar.g = null;
                    z98 z98Var = djgVar.a;
                    if (z98Var != null) {
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            z98Var.k(obj5);
                        } else {
                            z98Var.i(obj5);
                        }
                    }
                }
                eh0Var.b = 3;
                return;
            case 17:
                ((PurchaseVerificationHandler) this.c).sendPurchaseVerificationPackageI((ActivityPackage) this.b);
                return;
            case 18:
                SdkClickHandler sdkClickHandler = (SdkClickHandler) this.c;
                List list = sdkClickHandler.packageQueue;
                ActivityPackage activityPackage = (ActivityPackage) this.b;
                list.add(activityPackage);
                sdkClickHandler.logger.debug("Added sdk_click %d", Integer.valueOf(sdkClickHandler.packageQueue.size()));
                sdkClickHandler.logger.verbose("%s", activityPackage.getExtendedString());
                sdkClickHandler.sendNextSdkClick();
                return;
            case 19:
                try {
                    ((Runnable) this.c).run();
                    synchronized (((h80) this.b).d) {
                        ((h80) this.b).a();
                        break;
                    }
                    return;
                } catch (Throwable th3) {
                    synchronized (((h80) this.b).d) {
                        ((h80) this.b).a();
                        throw th3;
                    }
                }
            case 20:
                m88 m88Var = (m88) this.b;
                boolean zIsCancelled = m88Var.isCancelled();
                pl1 pl1Var = (pl1) this.c;
                if (zIsCancelled) {
                    pl1Var.p(null);
                    return;
                }
                while (true) {
                    try {
                        try {
                            Object obj6 = m88Var.get();
                            if (i != 0) {
                                Thread.currentThread().interrupt();
                            }
                            pl1Var.g(obj6);
                            return;
                        } catch (InterruptedException unused) {
                            i = 1;
                        } catch (Throwable th4) {
                            if (i == 0) {
                                throw th4;
                            }
                            Thread.currentThread().interrupt();
                            throw th4;
                        }
                    } catch (ExecutionException e3) {
                        Throwable cause = e3.getCause();
                        cause.getClass();
                        pl1Var.g(new dzb(cause));
                        return;
                    }
                }
                break;
            case 21:
                ((h48) this.b).b((cag) this.c);
                return;
            case 22:
                n nVar = (n) this.b;
                sgg sggVar = (sgg) this.c;
                nVar.a.a(sggVar.c, sggVar.d, (String) sggVar.b);
                return;
            case 23:
                gn2 gn2Var = (gn2) this.b;
                yea yeaVar = (yea) this.c;
                a98 a98Var = (a98) gn2Var.b;
                if (a98Var == null) {
                    return;
                }
                adh adhVar = (adh) a98Var.a;
                try {
                    byte[] bArr = (byte[]) yeaVar.a;
                    hmg hmgVar = hmg.a;
                    int i2 = slg.a;
                    nch nchVarS = nch.s(bArr, hmg.b);
                    boolean z4 = false;
                    for (ach achVar : adhVar.b.f) {
                        List listR = nchVarS.r();
                        achVar.getClass();
                        fnb fnbVar = jch.h;
                        fnbVar.getClass();
                        if (listR == null || listR.isEmpty()) {
                            z = false;
                        } else {
                            Iterator it = listR.iterator();
                            z = false;
                            while (it.hasNext()) {
                                tbh tbhVar = (tbh) ((ConcurrentHashMap) fnbVar.a).get((String) it.next());
                                if (tbhVar != null) {
                                    jch jchVar = tbhVar.a;
                                    if (jchVar.d) {
                                        kv kvVar = jchVar.a;
                                        if (kvVar != null && (kvVar.a || ((h71) kvVar.e).b == 3 || jchVar.g.b())) {
                                            synchronized (jchVar) {
                                                try {
                                                    kv kvVar2 = jchVar.a;
                                                    if (kvVar2 != null) {
                                                        if (kvVar2.a) {
                                                            jchVar.a = null;
                                                            jchVar.f.a.incrementAndGet();
                                                        } else if ((((h71) kvVar2.e).b == 3) || jchVar.g.b()) {
                                                            jchVar.a = null;
                                                            jchVar.f.a.incrementAndGet();
                                                        }
                                                    }
                                                } catch (Throwable th5) {
                                                    throw th5;
                                                }
                                            }
                                        }
                                        z2 = false;
                                    } else {
                                        z2 = true;
                                    }
                                    z |= z2;
                                }
                            }
                        }
                        if (z && !z4) {
                            adhVar.a.b();
                            z4 = true;
                        }
                    }
                    return;
                } catch (bng unused2) {
                    return;
                }
            case 24:
                ox0 ox0Var = (ox0) this.b;
                tx0 tx0Var = (tx0) this.c;
                bo1 bo1Var = (bo1) ox0Var.f.c;
                fp3 fp3Var = ox0Var.f;
                if (bo1Var != null) {
                    ((bo1) fp3Var.c).a(tx0Var, null);
                    return;
                } else {
                    zsg.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 25:
                ox0 ox0Var2 = (ox0) this.b;
                gi2 gi2Var = (gi2) this.c;
                z5h z5hVar = z5h.EXECUTE_ASYNC_TIMEOUT;
                tx0 tx0Var2 = swg.i;
                ox0Var2.q(z5hVar, 7, tx0Var2);
                vsg vsgVar = mtg.b;
                aug augVar = aug.e;
                GooglePay googlePay = (GooglePay) gi2Var.b;
                BillingSession billingSession = (BillingSession) gi2Var.c;
                l26 l26Var = (l26) gi2Var.d;
                int i3 = GooglePay.g;
                tx0Var2.getClass();
                if (googlePay.e.b(billingSession)) {
                    augVar.getClass();
                    l26Var.z(tx0Var2, augVar);
                    return;
                }
                return;
            case 26:
                f2h f2hVar = (f2h) this.c;
                w3h w3hVar = (w3h) f2hVar.b.b;
                m3h m3hVar = w3hVar.g;
                w3h.h(m3hVar);
                m3hVar.A0();
                Bundle bundle = new Bundle();
                bundle.putString("package_name", f2hVar.a);
                try {
                    nsg nsgVar = (nsg) ((qsg) this.b);
                    Parcel parcelJ = nsgVar.J();
                    lsg.b(parcelJ, bundle);
                    Parcel parcelI = nsgVar.I(parcelJ, 1);
                    Bundle bundle2 = (Bundle) lsg.a(parcelI, Bundle.CREATOR);
                    parcelI.recycle();
                    if (bundle2 == null) {
                        w0h w0hVar = w3hVar.f;
                        w3h.h(w0hVar);
                        w0hVar.g.a("Install Referrer Service returned a null response");
                    }
                    break;
                } catch (Exception e4) {
                    w0h w0hVar2 = w3hVar.f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.b(e4.getMessage(), "Exception occurred while retrieving the Install Referrer");
                }
                m3h m3hVar2 = w3hVar.g;
                w3h.h(m3hVar2);
                m3hVar2.A0();
                throw new IllegalStateException("Unexpected call on client side");
            case 27:
                a();
                return;
            case 28:
                ich ichVar = ((e5h) this.c).d;
                ichVar.U();
                wog wogVar = (wog) this.b;
                if (wogVar.c.c() == null) {
                    ichVar.getClass();
                    String str = wogVar.a;
                    oa7.A(str);
                    ndh ndhVarO = ichVar.O(str);
                    if (ndhVarO != null) {
                        ichVar.b0(wogVar, ndhVarO);
                        return;
                    }
                    return;
                }
                ichVar.getClass();
                String str2 = wogVar.a;
                oa7.A(str2);
                ndh ndhVarO2 = ichVar.O(str2);
                if (ndhVarO2 != null) {
                    ichVar.Y(wogVar, ndhVarO2);
                    return;
                }
                return;
            default:
                ich ichVar2 = ((e5h) this.c).d;
                ichVar2.U();
                ichVar2.Z().A0();
                ichVar2.m0();
                ndh ndhVar = (ndh) this.b;
                oa7.x(ndhVar.a);
                ichVar2.n0(ndhVar);
                ichVar2.o0(ndhVar);
                return;
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                gg7 gg7Var = new gg7(v36.class.getSimpleName(), 12);
                r36 r36Var = (r36) this.c;
                fz3 fz3Var = new fz3(20, false);
                ((fz3) gg7Var.d).c = fz3Var;
                gg7Var.d = fz3Var;
                fz3Var.b = r36Var;
                return gg7Var.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ v36(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public /* synthetic */ v36(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
