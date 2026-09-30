package defpackage;

import ai.askquin.R;
import android.app.Application;
import android.app.Notification;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.app.job.JobParameters;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.icu.text.DecimalFormatSymbols;
import android.media.Image;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.StrictMode;
import android.text.PrecomputedText;
import android.text.StaticLayout;
import android.text.style.TypefaceSpan;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewStructure;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.instrumentation.file.f;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s {
    public static String a;
    public static int b;
    public static Boolean c;

    public static final Set A(CameraCharacteristics cameraCharacteristics) {
        Set<String> physicalCameraIds = cameraCharacteristics.getPhysicalCameraIds();
        physicalCameraIds.getClass();
        return physicalCameraIds;
    }

    public static final Map B(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraResults();
    }

    public static String C() {
        String processName = Application.getProcessName();
        processName.getClass();
        return processName;
    }

    public static int D(Object obj) {
        return ((Icon) obj).getResId();
    }

    public static String E(Object obj) {
        return ((Icon) obj).getResPackage();
    }

    public static int F(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int G(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int H(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int I(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static final Signature[] J(Context context) {
        if (Build.VERSION.SDK_INT < 28) {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 64).signatures;
        }
        SigningInfo signingInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 134217728).signingInfo;
        if (signingInfo != null) {
            return signingInfo.hasMultipleSigners() ? signingInfo.getSigningCertificateHistory() : signingInfo.getApkContentsSigners();
        }
        return null;
    }

    public static PrecomputedText.Params K(y90 y90Var) {
        return y90Var.getTextMetricsParams();
    }

    public static int L(Object obj) {
        return ((Icon) obj).getType();
    }

    public static Uri M(Object obj) {
        return ((Icon) obj).getUri();
    }

    public static ClassLoader N() {
        return WebView.getWebViewClassLoader();
    }

    public static boolean O(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasCapability(i);
    }

    public static boolean P(NetworkRequest networkRequest, int i) {
        networkRequest.getClass();
        return networkRequest.hasTransport(i);
    }

    public static final Bitmap Q(g8d g8dVar, int i, int i2) throws IOException {
        g8dVar.getClass();
        int i3 = g8dVar.b;
        int i4 = g8dVar.c;
        int iO = mh3.o(i, 1, i3);
        int iU = fdc.u(i3, i4, iO);
        if (iU < 1) {
            iU = 1;
        }
        final long jX = dj6.x(i2, (((long) iO) << 32) | (((long) iU) & 4294967295L));
        int i5 = Build.VERSION.SDK_INT;
        File file = g8dVar.a;
        if (i5 >= 28) {
            Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(ImageDecoder.createSource(file), new ImageDecoder$OnHeaderDecodedListener() { // from class: kef
                public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
                    s.R(jX, imageDecoder, imageInfo, source);
                }
            });
            bitmapDecodeBitmap.getClass();
            return bitmapDecodeBitmap;
        }
        String absolutePath = file.getAbsolutePath();
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = h0(i3, i4, jX);
        options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(absolutePath, options);
        if (bitmapDecodeFile == null) {
            qc0.p("Required value was null.");
            return null;
        }
        int i6 = (int) (jX >> 32);
        if (bitmapDecodeFile.getWidth() == i6 && bitmapDecodeFile.getHeight() == ((int) (jX & 4294967295L))) {
            return bitmapDecodeFile;
        }
        try {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeFile, i6, (int) (jX & 4294967295L), true);
            bitmapCreateScaledBitmap.getClass();
            return bitmapCreateScaledBitmap;
        } finally {
            jzb.m(bitmapDecodeFile);
        }
    }

    public static final void R(long j, ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        imageDecoder.getClass();
        imageInfo.getClass();
        source.getClass();
        imageDecoder.setAllocator(1);
        imageDecoder.setTargetSize((int) (j >> 32), (int) (j & 4294967295L));
    }

    public static final void S(CameraManager cameraManager, String str, Executor executor, CameraDevice.StateCallback stateCallback) throws CameraAccessException {
        str.getClass();
        executor.getClass();
        stateCallback.getClass();
        cameraManager.openCamera(str, executor, stateCallback);
    }

    public static boolean T(Handler handler, qk1 qk1Var, long j) {
        return handler.postDelayed(qk1Var, "retry_token", j);
    }

    public static final void U(CameraManager cameraManager, Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        cameraManager.getClass();
        executor.getClass();
        cameraManager.registerAvailabilityCallback(executor, availabilityCallback);
    }

    public static byte V(rd8 rd8Var) {
        return Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(rd8Var.a).getDigitStrings()[0], 0));
    }

    public static int W(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetBottom();
    }

    public static int X(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetLeft();
    }

    public static int Y(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetRight();
    }

    public static int Z(DisplayCutout displayCutout) {
        return displayCutout.getSafeInsetTop();
    }

    public static final void a(int i, x16 x16Var, x16 x16Var2, l46 l46Var, j09 j09Var) {
        j09 j09Var2;
        x16Var.getClass();
        l46Var.h0(114608857);
        int i2 = i | 6 | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            dd2 dd2VarB0 = af1.b0(169525397, new m(i3, x16Var), l46Var);
            dd2 dd2VarB1 = af1.b0(-1420821334, new n(i3, x16Var2), l46Var);
            g09 g09Var = g09.a;
            xdc.a(g09Var, dd2VarB0, null, null, null, 0, 0L, 0L, null, dd2VarB1, l46Var, 805306422, 508);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o(j09Var2, x16Var, x16Var2, i, 0);
        }
    }

    public static void a0(TextView textView, int i) {
        textView.setFirstBaselineToTopHeight(i);
    }

    public static final void b(x16 x16Var, xw9 xw9Var, l46 l46Var, int i) throws PackageManager.NameNotFoundException {
        int i2;
        boolean z;
        boolean z2;
        g09 g09Var;
        String str;
        xw9Var.getClass();
        if ((i & 6) == 0) {
            i2 = i | (l46Var.g(xw9Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = 0;
        if (!l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            l46Var.Z();
            return;
        }
        j09 j09VarY = ynb.Y(b.c, xw9Var);
        c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
        int iHashCode = Long.hashCode(l46Var.T);
        u8a u8aVarM = l46Var.m();
        j09 j09VarJ = m93.J(l46Var, j09VarY);
        lf2.q.getClass();
        l46Var.j0();
        boolean z3 = l46Var.S;
        ov7 ov7Var = LayoutNode.h1;
        if (z3) {
            l46Var.l(ov7Var);
        } else {
            l46Var.s0();
        }
        he2 he2Var = hj6.z;
        dec.l(he2Var, l46Var, c92VarA);
        he2 he2Var2 = hj6.y;
        dec.l(he2Var2, l46Var, u8aVarM);
        Integer numValueOf = Integer.valueOf(iHashCode);
        he2 he2Var3 = hj6.X;
        dec.l(he2Var3, l46Var, numValueOf);
        dec.k(l46Var);
        he2 he2Var4 = hj6.x;
        dec.l(he2Var4, l46Var, j09VarJ);
        g09 g09Var2 = g09.a;
        o5c.f(l46Var, b.d(g09Var2, 60.0f));
        feg.j(od4.A(R.drawable.ic_paywall, 0, l46Var), afc.q(R.string.app_name, l46Var), null, null, null, 0.0f, null, l46Var, 8, 124);
        j09 j09VarD0 = ynb.d0(0.0f, 16.0f, 0.0f, 0.0f, 13, g09Var2);
        t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i3)), ndb.y, l46Var, 6);
        int iHashCode2 = Long.hashCode(l46Var.T);
        u8a u8aVarM2 = l46Var.m();
        j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
        l46Var.j0();
        if (l46Var.S) {
            l46Var.l(ov7Var);
        } else {
            l46Var.s0();
        }
        dec.l(he2Var, l46Var, t7cVarA);
        dec.l(he2Var2, l46Var, u8aVarM2);
        ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
        dec.l(he2Var4, l46Var, j09VarJ2);
        String strQ = afc.q(R.string.app_name, l46Var);
        ar5 ar5Var = ar5.c;
        long jL = w6c.l(17);
        pr4 pr4Var = o82.a;
        nte.b(strQ, null, y72.b(((m82) l46Var.k(pr4Var)).o, 0.88f), jL, ar5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 1597440, 0, 262058);
        Context context = (Context) l46Var.k(uq.b);
        boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
        Object objR = l46Var.R();
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            if (zBooleanValue) {
                str = "1.2.3(4)";
                z = false;
            } else {
                z = false;
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    str = packageInfo.versionName + "(" + packageInfo.getLongVersionCode() + ")";
                } else {
                    str = packageInfo.versionName + "(" + packageInfo.versionCode + ")";
                }
            }
            objR = str;
            l46Var.p0(objR);
        } else {
            z = false;
        }
        nte.b((String) objR, null, y72.b(((m82) l46Var.k(pr4Var)).s, 0.48f), w6c.l(17), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 24582, 0, 262122);
        l46Var.r(true);
        pwf pwfVarA = qd8.a(l46Var);
        if (pwfVarA == null) {
            qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            return;
        }
        qna qnaVar = (qna) z5c.G(job.a.b(qna.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
        if (((Boolean) qnaVar.g.getValue()).booleanValue()) {
            l46Var.f0(1190072840);
            y6c y6cVar = ((s5d) l46Var.k(u5d.a)).d;
            boolean zI = l46Var.i(qnaVar);
            Object objR2 = l46Var.R();
            if (zI || objR2 == i8cVar) {
                z2 = false;
                objR2 = new p(0 == true ? 1 : 0, qnaVar);
                l46Var.p0(objR2);
            } else {
                z2 = false;
            }
            cgg.m((x16) objR2, null, false, y6cVar, null, null, z7f.b, l46Var, 805306368, 502);
            l46Var.r(z2);
        } else {
            z2 = false;
            l46Var.f0(1190444034);
            l46Var.r(false);
        }
        o5c.f(l46Var, new jw7(1.0f, true));
        l46Var.f0(-377237122);
        i00 i00Var = new i00();
        l46Var.f0(-377236822);
        xtd xtdVar = null;
        int i4 = 14;
        int i5 = i00Var.i(new k68(z5c.B(), new zte(new xtd(p8c.q(l46Var).c(), 0L, null, null, null, p8c.q(l46Var).a.f, null, 0L, null, null, null, 0L, null, null, 65502), xtdVar, i4)));
        try {
            i00Var.f("《");
            i00Var.f(afc.q(R.string.auth_terms_of_service, l46Var));
            i00Var.f("》");
            i00Var.h(i5);
            l46Var.r(z2);
            l46Var.f0(-377223119);
            int iK = i00Var.k(new xtd(y72.b(((m82) l46Var.k(pr4Var)).o, 0.64f), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                i00Var.f(" ");
                i00Var.f(afc.q(R.string.auth_text_and, l46Var));
                i00Var.f(" ");
                i00Var.h(iK);
                l46Var.r(z2);
                l46Var.f0(-377215926);
                int i6 = i00Var.i(new k68(z5c.y(), new zte(new xtd(p8c.q(l46Var).c(), 0L, null, null, null, p8c.q(l46Var).a.f, null, 0L, null, null, null, 0L, null, null, 65502), xtdVar, i4)));
                try {
                    i00Var.f("《");
                    i00Var.f(afc.q(R.string.auth_privacy_policy, l46Var));
                    i00Var.f("》");
                    i00Var.h(i6);
                    l46Var.r(z2);
                    k00 k00VarL = i00Var.l();
                    l46Var.r(z2);
                    nte.c(k00VarL, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, p(l46Var), l46Var, 0, 0, 262142);
                    l46 l46Var2 = l46Var;
                    c(0, x16Var, l46Var2, null, ks0.h(16.0f, R.string.app_about_icp_text, l46Var2, l46Var2, g09Var2));
                    ca2.a.getClass();
                    if (ca2.c) {
                        g09Var = g09Var2;
                        l46Var2.f0(1192071906);
                        l46Var2.r(false);
                    } else {
                        ib8.r(16.0f, 1191916224, l46Var2, l46Var2, g09Var2);
                        g09Var = g09Var2;
                        nte.b(afc.q(R.string.tarot_ai_mode, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, p(l46Var2), l46Var, 0, 0, 131070);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                    }
                    o5c.f(l46Var2, b.d(g09Var, 24.0f));
                    WeakHashMap weakHashMap = m8g.w;
                    o5c.f(l46Var2, od4.I(q7c.k(l46Var2).g));
                    l46Var2.r(true);
                } catch (Throwable th) {
                    i00Var.h(i6);
                    throw th;
                }
            } catch (Throwable th2) {
                i00Var.h(iK);
                throw th2;
            }
        } catch (Throwable th3) {
            i00Var.h(i5);
            throw th3;
        }
    }

    public static final void b0(SessionConfiguration sessionConfiguration, InputConfiguration inputConfiguration) {
        sessionConfiguration.setInputConfiguration(inputConfiguration);
    }

    public static final void c(int i, x16 x16Var, l46 l46Var, j09 j09Var, String str) {
        j09 j09Var2;
        l46Var.h0(109224640);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.i(x16Var) ? 32 : 16) | 384;
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            mue mueVarP = p(l46Var);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new q(i3);
                l46Var.p0(objR);
            }
            g09 g09Var = g09.a;
            nte.b(str, androidx.compose.foundation.b.e(g09Var, x16Var, (x16) objR), 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarP, l46Var, i2 & 14, 0, 131068);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r(str, x16Var, j09Var2, i, 0);
        }
    }

    public static void c0(ViewStructure viewStructure, int i) {
        viewStructure.setMaxTextLength(i);
    }

    public static final void d(final g8d g8dVar, final float f, final boolean z, final boolean z2, final x4d x4dVar, final x16 x16Var, final j18 j18Var, final n26 n26Var, l46 l46Var, final int i) {
        g8dVar.getClass();
        x16Var.getClass();
        j18Var.getClass();
        n26Var.getClass();
        l46Var.h0(-787849035);
        int i2 = i | (l46Var.i(g8dVar) ? 4 : 2) | (l46Var.d(f) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(x4dVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536) | (l46Var.g(j18Var) ? 1048576 : 524288) | (l46Var.g(n26Var) ? 8388608 : 4194304);
        if (l46Var.W(i2 & 1, (4793491 & i2) != 4793490)) {
            nk8.d(b.c, null, af1.b0(-1000218485, new n26() { // from class: lef
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    l46 l46Var2;
                    e31 e31Var = (e31) obj;
                    l46 l46Var3 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    lx0 lx0Var = ndb.f;
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var3.g(e31Var) ? 4 : 2;
                    }
                    if (l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        int iD0 = ((sw3) l46Var3.k(zg2.h)).D0(e31Var.d());
                        g8d g8dVar2 = g8dVar;
                        boolean zG = l46Var3.g(g8dVar2);
                        Object objR = l46Var3.R();
                        i8c i8cVar = sf2.a;
                        if (zG || objR == i8cVar) {
                            objR = kv2.f(0, l46Var3);
                        }
                        s69 s69Var = (s69) objR;
                        l46Var3.d0(862716208, l46Var3.I(l46Var3.I(g8dVar2, Integer.valueOf(iD0)), Integer.valueOf(((sz9) s69Var).j())));
                        boolean zI = l46Var3.i(g8dVar2);
                        n26 n26Var2 = n26Var;
                        boolean zI2 = zI | l46Var3.i(n26Var2) | l46Var3.e(iD0);
                        Object objR2 = l46Var3.R();
                        if (zI2 || objR2 == i8cVar) {
                            objR2 = new oef(g8dVar2, n26Var2, iD0, null);
                            l46Var3.p0(objR2);
                        }
                        nbd nbdVar = nbd.a;
                        pbd pbdVar = (pbd) uyb.x((l26) objR2, l46Var3, nbdVar).getValue();
                        boolean zT = pa7.t(pbdVar, nbdVar);
                        g09 g09Var = g09.a;
                        if (zT) {
                            l46Var3.f0(862740294);
                            axa.a(0.0f, 0.0f, 0, 0, 62, 0L, 0L, l46Var3, e31Var.a(g09Var, lx0Var));
                            l46Var2 = l46Var3;
                            l46Var2.r(false);
                        } else {
                            l46Var2 = l46Var3;
                            if (pa7.t(pbdVar, mbd.a)) {
                                l46Var2.f0(862743622);
                                boolean zG2 = l46Var2.g(s69Var);
                                Object objR3 = l46Var2.R();
                                if (zG2 || objR3 == i8cVar) {
                                    objR3 = new q50(s69Var, 15);
                                    l46Var2.p0(objR3);
                                }
                                bm8.h((x16) objR3, e31Var.a(g09Var, lx0Var), false, null, null, k99.f, l46Var2, 1572864, 60);
                                l46Var2 = l46Var2;
                                l46Var2.r(false);
                            } else {
                                if (!(pbdVar instanceof obd)) {
                                    throw tec.d(862738801, l46Var2, false);
                                }
                                l46Var2.f0(862752092);
                                Bitmap bitmap = ((obd) pbdVar).a;
                                boolean zG3 = l46Var2.g(bitmap);
                                Object objR4 = l46Var2.R();
                                if (zG3 || objR4 == i8cVar) {
                                    objR4 = new ks(bitmap);
                                    l46Var2.p0(objR4);
                                }
                                fdc.d((cv6) objR4, f, z, z2, x4dVar, x16Var, null, j18Var, l46Var2, 0, 64);
                                l46Var2.r(false);
                            }
                        }
                        l46Var2.r(false);
                    } else {
                        l46Var3.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3078, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(f, z, z2, x4dVar, x16Var, j18Var, n26Var, i) { // from class: mef
                public final /* synthetic */ float b;
                public final /* synthetic */ boolean c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ x4d e;
                public final /* synthetic */ x16 f;
                public final /* synthetic */ j18 g;
                public final /* synthetic */ n26 v;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(9);
                    s.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void d0(OutputConfiguration outputConfiguration, String str) {
        outputConfiguration.setPhysicalCameraId(str);
    }

    public static void e(Menu menu, int i, Context context, TextClassification textClassification, int i2, Drawable drawable) {
        int i3 = 1;
        if (i2 < 0) {
            MenuItem menuItemAdd = menu.add(android.R.id.textAssist, android.R.id.textAssist, i, textClassification.getLabel());
            menuItemAdd.setShowAsAction(2);
            menuItemAdd.setIcon(drawable);
            menuItemAdd.setOnMenuItemClickListener(new nv(i3, context, textClassification));
            return;
        }
        i3 = i2 != 0 ? 0 : 1;
        final RemoteAction remoteAction = textClassification.getActions().get(i2);
        MenuItem menuItemAdd2 = menu.add(android.R.id.textAssist, i3 != 0 ? 16908353 : 0, i, remoteAction.getTitle());
        menuItemAdd2.setShowAsAction(i3 == 0 ? 0 : 2);
        if (drawable != null) {
            menuItemAdd2.setIcon(drawable);
        }
        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: rue
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                PendingIntent actionIntent = remoteAction.getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    hgc.Q(actionIntent);
                    return true;
                }
                actionIntent.send();
                return true;
            }
        });
    }

    public static void e0(Notification.Action.Builder builder) {
        builder.setSemanticAction(0);
    }

    public static final void f(ClipboardManager clipboardManager) {
        clipboardManager.clearPrimaryClip();
    }

    public static final void f0(SessionConfiguration sessionConfiguration, CaptureRequest captureRequest) {
        sessionConfiguration.getClass();
        sessionConfiguration.setSessionParameters(captureRequest);
    }

    public static Typeface g(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static final void g0(StaticLayout.Builder builder) {
        builder.setUseLineSpacingFromFallbacks(true);
    }

    public static Typeface h(Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    public static final int h0(int i, int i2, long j) {
        int i3 = 1;
        while (true) {
            long j2 = ((long) i3) * 2;
            if (((long) i) / j2 < ((int) (j >> 32)) || ((long) i2) / j2 < ((int) (4294967295L & j))) {
                break;
            }
            i3 *= 2;
        }
        return i3;
    }

    public static Handler i(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static final HardwareBuffer i0(Image image, em7 em7Var) {
        em7Var.getClass();
        if (em7Var.equals(job.a.b(HardwareBuffer.class))) {
            return image.getHardwareBuffer();
        }
        return null;
    }

    public static Handler j(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static boolean j0() {
        Boolean boolValueOf = c;
        if (boolValueOf == null) {
            if (Build.VERSION.SDK_INT >= 28) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objInvoke = Process.class.getDeclaredMethod("isIsolated", null).invoke(null, null);
                    Object[] objArr = new Object[0];
                    if (objInvoke == null) {
                        throw new fgh(rrb.r("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objInvoke;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }

    public static Handler k(Looper looper) {
        return Handler.createAsync(looper);
    }

    public static final void l(CameraDevice cameraDevice, SessionConfiguration sessionConfiguration) throws CameraAccessException {
        cameraDevice.createCaptureSession(sessionConfiguration);
    }

    public static be9 m(int[] iArr, int[] iArr2) {
        NetworkRequest.Builder builder = new NetworkRequest.Builder();
        for (int i : iArr) {
            try {
                builder.addCapability(i);
            } catch (IllegalArgumentException e) {
                ff8 ff8VarH = ff8.h();
                String str = be9.b;
                String str2 = be9.b;
                String strK = tec.k("Ignoring adding capability '", i, '\'');
                if (ff8VarH.b <= 5) {
                    b1.n(str2, strK, e);
                }
            }
        }
        int[] iArr3 = oa7.e;
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr3[i2];
            if (!qd0.T(iArr, i3)) {
                try {
                    builder.removeCapability(i3);
                } catch (IllegalArgumentException e2) {
                    ff8 ff8VarH2 = ff8.h();
                    String str3 = be9.b;
                    String str4 = be9.b;
                    String strK2 = tec.k("Ignoring removing default capability '", i3, '\'');
                    if (ff8VarH2.b <= 5) {
                        b1.n(str4, strK2, e2);
                    }
                }
            }
        }
        for (int i4 : iArr2) {
            builder.addTransportType(i4);
        }
        NetworkRequest networkRequestBuild = builder.build();
        networkRequestBuild.getClass();
        return new be9(networkRequestBuild);
    }

    public static TextClassifier n(Context context, tuc tucVar) {
        String str;
        TextClassificationManager textClassificationManager = (TextClassificationManager) context.getSystemService(TextClassificationManager.class);
        int iOrdinal = tucVar.ordinal();
        if (iOrdinal == 0) {
            str = "edittext";
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return null;
            }
            str = "textview";
        }
        return textClassificationManager.createTextClassificationSession(new TextClassificationContext.Builder(context.getPackageName(), str).build());
    }

    public static TypefaceSpan o(Typeface typeface) {
        return new TypefaceSpan(typeface);
    }

    public static final mue p(l46 l46Var) {
        return mue.a((mue) l46Var.k(nte.a), y72.b(((m82) l46Var.k(o82.a)).q, 0.48f), w6c.l(12), ar5.b, null, 0L, null, 0, w6c.k(15.6d), null, null, 16646136);
    }

    public static final List q(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }

    public static final List r(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionKeys();
    }

    public static List s(DisplayCutout displayCutout) {
        return displayCutout.getBoundingRects();
    }

    public static final DisplayCutout t(Display display) throws Exception {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
            return null;
        } catch (Exception e) {
            if (!(e instanceof ClassNotFoundException) && !(e instanceof NoSuchMethodException) && !(e instanceof NoSuchFieldException) && !(e instanceof IllegalAccessException) && !(e instanceof InvocationTargetException) && !(e instanceof InstantiationException)) {
                throw e;
            }
            n21.i.getClass();
            b1.m(e, m21.b);
            return null;
        }
    }

    public static String[] u(DecimalFormatSymbols decimalFormatSymbols) {
        return decimalFormatSymbols.getDigitStrings();
    }

    public static long v(PackageInfo packageInfo) {
        return packageInfo.getLongVersionCode();
    }

    public static Executor w(Context context) {
        return context.getMainExecutor();
    }

    public static final int x(OutputConfiguration outputConfiguration) {
        return outputConfiguration.getMaxSharedSurfaceCount();
    }

    public static String y() throws Throwable {
        BufferedReader bufferedReader;
        String str = a;
        if (str != null) {
            return str;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            String processName = Application.getProcessName();
            a = processName;
            return processName;
        }
        int iMyPid = b;
        if (iMyPid == 0) {
            iMyPid = Process.myPid();
            b = iMyPid;
        }
        String strTrim = null;
        strTrim = null;
        strTrim = null;
        BufferedReader bufferedReader2 = null;
        if (iMyPid > 0) {
            try {
                StringBuilder sb = new StringBuilder(String.valueOf(iMyPid).length() + 14);
                sb.append("/proc/");
                sb.append(iMyPid);
                sb.append("/cmdline");
                String string = sb.toString();
                StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                try {
                    bufferedReader = new BufferedReader(new f(string));
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    try {
                        String line = bufferedReader.readLine();
                        oa7.A(line);
                        strTrim = line.trim();
                    } catch (IOException unused) {
                        if (bufferedReader != null) {
                        }
                        a = strTrim;
                        return strTrim;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader2 = bufferedReader;
                        if (bufferedReader2 != null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                    try {
                        bufferedReader.close();
                    } catch (IOException unused3) {
                    }
                } catch (Throwable th2) {
                    StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                    throw th2;
                }
            } catch (IOException unused4) {
                bufferedReader = null;
            } catch (Throwable th3) {
                th = th3;
            }
        }
        a = strTrim;
        return strTrim;
    }

    public static void z(JobParameters jobParameters) {
        jobParameters.getNetwork();
    }
}
