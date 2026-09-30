package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.util.Log;
import com.adjust.sdk.Constants;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.b1;
import io.sentry.android.core.s0;
import io.sentry.android.core.u0;
import io.sentry.c7;
import io.sentry.clientreport.b;
import io.sentry.g5;
import io.sentry.m1;
import io.sentry.q5;
import io.sentry.t5;
import io.sentry.v4;
import io.sentry.x5;
import io.sentry.z0;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vh2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vh2(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ServiceInfo serviceInfo;
        String str;
        int i;
        ComponentName componentNameStartService;
        String str2 = null;
        bArr = null;
        bArr = null;
        bArr = null;
        bArr = null;
        byte[] bArr = null;
        str2 = null;
        boolean z = false;
        switch (this.a) {
            case 0:
                wh2 wh2Var = (wh2) this.b;
                yh2 yh2Var = (yh2) this.c;
                mi2 mi2Var = wh2Var.b;
                synchronized (mi2Var) {
                    FileOutputStream fileOutputStreamOpenFileOutput = mi2Var.a.openFileOutput(mi2Var.b, 0);
                    try {
                        fileOutputStreamOpenFileOutput.write(yh2Var.a.toString().getBytes(Constants.ENCODING));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Throwable th) {
                        fileOutputStreamOpenFileOutput.close();
                        throw th;
                    }
                }
                return null;
            case 1:
                Context context = (Context) this.b;
                Intent intent = (Intent) this.c;
                szc szcVarL = szc.L();
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Starting service");
                }
                ((ArrayDeque) szcVarL.e).offer(intent);
                Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent2.setPackage(context.getPackageName());
                synchronized (szcVarL) {
                    try {
                        String str3 = (String) szcVarL.b;
                        if (str3 != null) {
                            str2 = str3;
                        } else {
                            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent2, 0);
                            if (resolveInfoResolveService == null || (serviceInfo = resolveInfoResolveService.serviceInfo) == null) {
                                b1.d("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
                            } else if (!context.getPackageName().equals(serviceInfo.packageName) || (str = serviceInfo.name) == null) {
                                b1.d("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
                            } else if (str.startsWith(".")) {
                                str2 = context.getPackageName() + serviceInfo.name;
                                szcVarL.b = str2;
                            } else {
                                str2 = serviceInfo.name;
                                szcVarL.b = str2;
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (str2 != null) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Restricting intent to a specific service: ".concat(str2));
                    }
                    intent2.setClassName(context.getPackageName(), str2);
                }
                try {
                    if (szcVarL.O(context)) {
                        componentNameStartService = qk2.P(context, intent2);
                    } else {
                        componentNameStartService = context.startService(intent2);
                        Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
                    }
                    if (componentNameStartService == null) {
                        b1.d("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
                        i = 404;
                    } else {
                        i = -1;
                    }
                } catch (IllegalStateException e) {
                    b1.d("FirebaseMessaging", "Failed to start service while in background: " + e);
                    i = 402;
                } catch (SecurityException e2) {
                    b1.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
                    i = 401;
                }
                return Integer.valueOf(i);
            case 2:
                vag vagVar = vag.a;
                xbg xbgVar = (xbg) this.b;
                ccg ccgVar = (ccg) this.c;
                if (xbgVar instanceof vbg) {
                    u88 u88Var = ((vbg) xbgVar).a;
                    nbg nbgVar = ccgVar.h;
                    String str4 = ccgVar.c;
                    vag vagVarC = nbgVar.c(str4);
                    fbg fbgVarW = ccgVar.g.w();
                    fbgVarW.getClass();
                    urg.I(fbgVarW.a, false, true, new alc(str4, 18));
                    if (vagVarC != null) {
                        if (vagVarC == vag.b) {
                            lbg lbgVar = ccgVar.a;
                            String str5 = ccgVar.k;
                            if (u88Var instanceof t88) {
                                ff8.h().l(dcg.a, "Worker result SUCCESS for ".concat(str5));
                                if (lbgVar.b()) {
                                    ccgVar.b();
                                } else {
                                    nbgVar.h(vag.c, str4);
                                    bb3 bb3Var = ((t88) u88Var).a;
                                    bb3Var.getClass();
                                    urg.I(nbgVar.a, false, true, new p0g(8, bb3Var, str4));
                                    long jCurrentTimeMillis = System.currentTimeMillis();
                                    bx3 bx3Var = ccgVar.i;
                                    for (String str6 : bx3Var.a(str4)) {
                                        if (nbgVar.c(str6) == vag.e && ((Boolean) urg.I(bx3Var.a, true, false, new ia(str6, 14))).booleanValue()) {
                                            ff8.h().l(dcg.a, "Setting status to enqueued for ".concat(str6));
                                            nbgVar.h(vagVar, str6);
                                            nbgVar.g(jCurrentTimeMillis, str6);
                                        }
                                    }
                                }
                            } else if (u88Var instanceof s88) {
                                ff8.h().l(dcg.a, "Worker result RETRY for ".concat(str5));
                                ccgVar.a(-256);
                                z = true;
                            } else {
                                ff8.h().l(dcg.a, "Worker result FAILURE for ".concat(str5));
                                if (lbgVar.b()) {
                                    ccgVar.b();
                                } else {
                                    ccgVar.d(u88Var);
                                }
                            }
                        } else if (!vagVarC.a()) {
                            ccgVar.a(-512);
                            z = true;
                        }
                    }
                } else if (xbgVar instanceof ubg) {
                    u88 u88Var2 = ((ubg) xbgVar).a;
                    ccgVar.getClass();
                    ff8.h().l(dcg.a, "Worker result FAILURE for ".concat(ccgVar.k));
                    if (ccgVar.a.b()) {
                        ccgVar.b();
                    } else {
                        ccgVar.d(u88Var2);
                    }
                } else {
                    if (!(xbgVar instanceof wbg)) {
                        ap.c();
                        return null;
                    }
                    int i2 = ((wbg) xbgVar).a;
                    nbg nbgVar2 = ccgVar.h;
                    String str7 = ccgVar.c;
                    lbg lbgVar2 = ccgVar.a;
                    if (pa7.t(lbgVar2.y, Boolean.TRUE)) {
                        String str8 = dcg.a;
                        ff8.h().e(str8, "Worker " + lbgVar2.c + " was interrupted. Backing off.");
                        ccgVar.a(i2);
                    } else {
                        vag vagVarC2 = nbgVar2.c(str7);
                        if (vagVarC2 == null || vagVarC2.a()) {
                            String str9 = dcg.a;
                            ff8.h().e(str9, "Status for " + str7 + " is " + vagVarC2 + " ; not doing any work");
                        } else {
                            String str10 = dcg.a;
                            ff8.h().e(str10, "Status for " + str7 + " is " + vagVarC2 + "; not doing any work and rescheduling for later execution");
                            nbgVar2.h(vagVar, str7);
                            nbgVar2.i(i2, str7);
                            nbgVar2.e(-1L, str7);
                        }
                    }
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                m1 m1Var = (m1) this.b;
                x5 x5Var = (x5) this.c;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, g5.d), 512);
                    try {
                        m1Var.a(bufferedWriter, x5Var);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray;
                    } catch (Throwable th3) {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        byteArrayOutputStream.close();
                        break;
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                    throw th5;
                }
            case 4:
                m1 m1Var2 = (m1) this.b;
                c7 c7Var = (c7) this.c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, g5.d), 512);
                    try {
                        m1Var2.a(bufferedWriter2, c7Var);
                        byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray2;
                    } catch (Throwable th7) {
                        try {
                            bufferedWriter2.close();
                            break;
                        } catch (Throwable th8) {
                            th7.addSuppressed(th8);
                        }
                        throw th7;
                    }
                } catch (Throwable th9) {
                    try {
                        byteArrayOutputStream2.close();
                        break;
                    } catch (Throwable th10) {
                        th9.addSuppressed(th10);
                    }
                    throw th9;
                }
            case 5:
                m1 m1Var3 = (m1) this.b;
                t5 t5Var = (t5) this.c;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, g5.d), 512);
                    try {
                        m1Var3.a(bufferedWriter3, t5Var);
                        byte[] byteArray3 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray3;
                    } catch (Throwable th11) {
                        try {
                            bufferedWriter3.close();
                            break;
                        } catch (Throwable th12) {
                            th11.addSuppressed(th12);
                        }
                        throw th11;
                    }
                } catch (Throwable th13) {
                    try {
                        byteArrayOutputStream3.close();
                        break;
                    } catch (Throwable th14) {
                        th13.addSuppressed(th14);
                    }
                    throw th13;
                }
            case 6:
                m1 m1Var4 = (m1) this.b;
                v4 v4Var = (v4) this.c;
                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter4 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream4, g5.d), 512);
                    try {
                        m1Var4.a(bufferedWriter4, v4Var);
                        byte[] byteArray4 = byteArrayOutputStream4.toByteArray();
                        bufferedWriter4.close();
                        byteArrayOutputStream4.close();
                        return byteArray4;
                    } catch (Throwable th15) {
                        try {
                            bufferedWriter4.close();
                            break;
                        } catch (Throwable th16) {
                            th15.addSuppressed(th16);
                        }
                        throw th15;
                    }
                } catch (Throwable th17) {
                    try {
                        byteArrayOutputStream4.close();
                        break;
                    } catch (Throwable th18) {
                        th17.addSuppressed(th18);
                    }
                    throw th17;
                }
            case 7:
                m1 m1Var5 = (m1) this.b;
                b bVar = (b) this.c;
                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter5 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream5, g5.d), 512);
                    try {
                        m1Var5.a(bufferedWriter5, bVar);
                        byte[] byteArray5 = byteArrayOutputStream5.toByteArray();
                        bufferedWriter5.close();
                        byteArrayOutputStream5.close();
                        return byteArray5;
                    } catch (Throwable th19) {
                        try {
                            bufferedWriter5.close();
                            break;
                        } catch (Throwable th20) {
                            th19.addSuppressed(th20);
                        }
                        throw th19;
                    }
                } catch (Throwable th21) {
                    try {
                        byteArrayOutputStream5.close();
                        break;
                    } catch (Throwable th22) {
                        th21.addSuppressed(th22);
                    }
                    throw th21;
                }
            case 8:
                return u0.c(((s0) this.b).a, (SentryAndroidOptions) this.c);
            default:
                ScreenshotEventProcessor screenshotEventProcessor = (ScreenshotEventProcessor) this.b;
                Bitmap bitmap = (Bitmap) this.c;
                z0 logger = screenshotEventProcessor.a.getLogger();
                if (!bitmap.isRecycled()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream6);
                            bitmap.recycle();
                            if (byteArrayOutputStream6.size() <= 0) {
                                logger.i(q5.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                byteArrayOutputStream6.close();
                            } else {
                                byte[] byteArray6 = byteArrayOutputStream6.toByteArray();
                                byteArrayOutputStream6.close();
                                bArr = byteArray6;
                            }
                        } catch (Throwable th23) {
                            try {
                                byteArrayOutputStream6.close();
                                break;
                            } catch (Throwable th24) {
                                th23.addSuppressed(th24);
                            }
                            throw th23;
                        }
                    } catch (Throwable th25) {
                        logger.d(q5.ERROR, "Compressing bitmap failed.", th25);
                    }
                    break;
                }
                return bArr;
        }
    }
}
