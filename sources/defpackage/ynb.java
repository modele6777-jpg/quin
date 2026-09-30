package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.core.content.FileProvider;
import androidx.core.graphics.drawable.IconCompat;
import coil3.compose.AsyncImagePainter;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.android.replay.capture.v;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import sun.misc.Unsafe;
import tech.chatmind.api.credits.QuotaUsage;
import tech.chatmind.api.credits.SubscriptionInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ynb {
    public static final dd2 e;
    public static final qu h;
    public static Thread j;
    public static volatile Handler k;
    public static gx6 l;
    public static final float[][] a = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] b = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] c = {95.047f, 100.0f, 108.883f};
    public static final float[][] d = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final dd2 f = new dd2(new de2(2), false, 1318551244);
    public static final dd2 g = new dd2(new he2(12), false, -1780494758);
    public static final Object i = new Object();

    static {
        int i2 = 15;
        e = new dd2(new md2(i2), false, 71484836);
        h = new qu(i2);
    }

    public static final float A(xw9 xw9Var, cv7 cv7Var) {
        return cv7Var == cv7.a ? xw9Var.c(cv7Var) : xw9Var.b(cv7Var);
    }

    public static final float B(xw9 xw9Var, cv7 cv7Var) {
        return cv7Var == cv7.a ? xw9Var.b(cv7Var) : xw9Var.c(cv7Var);
    }

    public static void C(Object obj, Object obj2) {
        if (obj == null) {
            r82.g(ks0.j(obj2, "null key in entry: null="));
        } else {
            if (obj2 != null) {
                return;
            }
            throw new NullPointerException("null value in entry: " + obj + "=null");
        }
    }

    public static void D(int i2, String str) {
        if (i2 >= 0) {
            return;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i2);
    }

    public static final float E(float f2, float f3) {
        if (f3 == 0.0f) {
            return 0.0f;
        }
        return (f3 <= 0.0f ? f2 >= f3 : f2 <= f3) ? f2 : f3;
    }

    public static final void F(kpd kpdVar, ArrayList arrayList, int i2) {
        boolean zL = kpdVar.l(i2);
        int[] iArr = kpdVar.b;
        if (zL) {
            arrayList.add(kpdVar.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            F(kpdVar, arrayList, i4);
        }
    }

    public static final Object G(yn7 yn7Var) {
        Class clsR = af1.R(pa7.V(yn7Var));
        if (clsR.isArray()) {
            Object objNewInstance = Array.newInstance(clsR.getComponentType(), 0);
            objNewInstance.getClass();
            return objNewInstance;
        }
        throw new pt7("Cannot instantiate the default empty array of type " + clsR.getSimpleName() + ", because it is not an array type");
    }

    public static final int H(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int iL = pa7.L(((db7) list.get(i4)).b, i2);
            if (iL < 0) {
                i3 = i4 + 1;
            } else {
                if (iL <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static View I(View view, int i2) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = AndroidComposeView.d2;
            if (declaredMethod == null) {
                declaredMethod = Class.forName("android.view.View").getDeclaredMethod("getAccessibilityViewId", null);
                AndroidComposeView.d2 = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (pa7.t(declaredMethod.invoke(view, null), Integer.valueOf(i2))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i3 = 0; i3 < childCount; i3++) {
                    View viewI = I(viewGroup.getChildAt(i3), i2);
                    if (viewI != null) {
                        return viewI;
                    }
                }
            }
        }
        return null;
    }

    public static final Object J(wnb wnbVar) {
        Class clsW;
        wnbVar.getClass();
        Object objX = wnbVar.x();
        if (!(wnbVar instanceof bob) || !w6c.p((bob) wnbVar)) {
            Iterator it = wnbVar.a().iterator();
            boolean z = false;
            Object obj = null;
            while (true) {
                if (!it.hasNext()) {
                    if (!z) {
                        break;
                    }
                    break;
                }
                Object next = it.next();
                if (((aob) next).t() != on7.d) {
                    if (!z) {
                        z = true;
                        obj = next;
                    }
                }
                obj = null;
                break;
            }
            aob aobVar = (aob) obj;
            yn7 yn7VarU = aobVar != null ? aobVar.u() : null;
            if (yn7VarU != null && (clsW = w6c.w(yn7VarU)) != null) {
                return w6c.j(clsW, wnbVar).invoke(objX, null);
            }
        }
        return objX;
    }

    public static boolean K() {
        try {
            if (AndroidComposeView.X1 == null) {
                AndroidComposeView.X1 = Class.forName("android.os.SystemProperties");
            }
            Method declaredMethod = AndroidComposeView.Y1;
            if (declaredMethod == null) {
                Class cls = AndroidComposeView.X1;
                declaredMethod = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                AndroidComposeView.Y1 = declaredMethod;
            }
            Object objInvoke = declaredMethod != null ? declaredMethod.invoke(null, "debug.layout", Boolean.FALSE) : null;
            return pa7.t(objInvoke instanceof Boolean ? (Boolean) objInvoke : null, Boolean.TRUE);
        } catch (Exception unused) {
            return false;
        }
    }

    public static final Object L(Object obj, Object obj2, Object obj3) {
        tg7 tg7Var = obj instanceof tg7 ? (tg7) obj : null;
        if (tg7Var == null) {
            return null;
        }
        Object obj4 = tg7Var.b;
        Object obj5 = tg7Var.a;
        if (pa7.t(obj5, obj2) && pa7.t(obj4, obj3)) {
            return obj;
        }
        Object objL = L(obj5, obj2, obj3);
        return objL == null ? L(obj4, obj2, obj3) : objL;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d1 A[Catch: Exception -> 0x0069, TryCatch #5 {Exception -> 0x0069, blocks: (B:6:0x001c, B:10:0x0062, B:30:0x00d1, B:32:0x00d6, B:33:0x00d9, B:24:0x00c5, B:26:0x00ca), top: B:48:0x001c }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00d6 A[Catch: Exception -> 0x0069, TryCatch #5 {Exception -> 0x0069, blocks: (B:6:0x001c, B:10:0x0062, B:30:0x00d1, B:32:0x00d6, B:33:0x00d9, B:24:0x00c5, B:26:0x00ca), top: B:48:0x001c }] */
    public static final Uri M(Context context, File file) throws Throwable {
        File externalCacheDir;
        FileOutputStream fileOutputStream;
        Exception exc;
        String strL = tec.l(context.getPackageName(), ".cropper.fileprovider");
        try {
            Log.i("AIC", "Try get URI for scope storage - content://");
            Uri uriC = FileProvider.c(context, strL, file);
            uriC.getClass();
            return uriC;
        } catch (Exception e2) {
            try {
                b1.d("AIC", String.valueOf(e2.getMessage()));
                b1.l("AIC", "ANR Risk -- Copying the file the location cache to avoid 'external-files-path' bug for N+ devices");
                File file2 = new File(new File(context.getCacheDir(), "CROP_LIB_CACHE"), file.getName());
                FileInputStream fileInputStream = null;
                fileOutputStreamE = null;
                FileOutputStream fileOutputStreamE = null;
                fileInputStream = null;
                try {
                    FileInputStream fileInputStreamB = a.b(file, new FileInputStream(file));
                    try {
                        fileOutputStreamE = a.e(new FileOutputStream(file2), file2);
                        lmg.Y(fileInputStreamB, fileOutputStreamE);
                        Log.i("AIC", "Completed Android N+ file copy. Attempting to return the cached file");
                        Uri uriC2 = FileProvider.c(context, strL, file2);
                        uriC2.getClass();
                        fileInputStreamB.close();
                        fileOutputStreamE.close();
                        return uriC2;
                    } catch (Exception e3) {
                        fileOutputStream = fileOutputStreamE;
                        fileInputStream = fileInputStreamB;
                        exc = e3;
                        try {
                            b1.d("AIC", String.valueOf(exc.getMessage()));
                            Log.i("AIC", "Trying to provide URI manually");
                            String str = "content://" + strL + "/files/my_images/";
                            Files.createDirectories(Paths.get(str, new String[0]), new FileAttribute[0]);
                            Uri uri = Uri.parse(str + file.getName());
                            uri.getClass();
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            return uri;
                        } catch (Throwable th) {
                            th = th;
                            if (fileInputStream != null) {
                                fileInputStream.close();
                            }
                            if (fileOutputStream != null) {
                                fileOutputStream.close();
                            }
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileOutputStream = fileOutputStreamE;
                        fileInputStream = fileInputStreamB;
                        if (fileInputStream != null) {
                            fileInputStream.close();
                        }
                        if (fileOutputStream != null) {
                            fileOutputStream.close();
                        }
                        throw th;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    fileOutputStream = null;
                } catch (Throwable th3) {
                    th = th3;
                    fileOutputStream = null;
                }
            } catch (Exception e5) {
                b1.d("AIC", String.valueOf(e5.getMessage()));
                if (Build.VERSION.SDK_INT < 29 && (externalCacheDir = context.getExternalCacheDir()) != null) {
                    try {
                        Log.i("AIC", "Use External storage, do not work for OS 29 and above");
                        Uri uriFromFile = Uri.fromFile(new File(externalCacheDir.getPath(), file.getAbsolutePath()));
                        uriFromFile.getClass();
                        return uriFromFile;
                    } catch (Exception e6) {
                        b1.d("AIC", String.valueOf(e6.getMessage()));
                        Log.i("AIC", "Try get URI using file://");
                        Uri uriFromFile2 = Uri.fromFile(file);
                        uriFromFile2.getClass();
                        return uriFromFile2;
                    }
                }
                Log.i("AIC", "Try get URI using file://");
                Uri uriFromFile3 = Uri.fromFile(file);
                uriFromFile3.getClass();
                return uriFromFile3;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:46:0x00bd  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003c, code lost:
    
        if (r5.equals("wechat-app-pay") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0051, code lost:
    
        if (r5.equals("wechat-mini-program-pay") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        return false;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean N(android.content.Context r4, defpackage.q9b r5, defpackage.t7 r6, defpackage.x16 r7) {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ynb.N(android.content.Context, q9b, t7, x16):boolean");
    }

    public static int O(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = c;
        return v82.b(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean P(wnb wnbVar) {
        wnbVar.getClass();
        return R(wnbVar) && wnbVar.s().d().isAnnotation();
    }

    public static final boolean Q(wnb wnbVar) {
        wnbVar.getClass();
        return wnbVar.x() != ga1.NO_RECEIVER;
    }

    public static final boolean R(wnb wnbVar) {
        wnbVar.getClass();
        return pa7.t(wnbVar.getName(), "<init>");
    }

    public static final boolean S(Throwable th) {
        th.getClass();
        if ((th instanceof yyc) || (th instanceof IllegalStateException) || (th instanceof IllegalArgumentException) || (th instanceof NullPointerException) || (th instanceof ClassCastException) || (th instanceof IndexOutOfBoundsException) || (th instanceof UnsupportedOperationException) || (th instanceof ConcurrentModificationException)) {
            return true;
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            if (cause == th) {
                cause = null;
            }
            if (cause != null && S(cause)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean T(String str) {
        CharSequence charSequenceSubSequence;
        String strP0 = v4e.p0(v4e.o0(str).toString(), '(');
        strP0.getClass();
        int length = strP0.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                charSequenceSubSequence = "";
                break;
            }
            if (!tq.G(strP0.charAt(i2))) {
                charSequenceSubSequence = strP0.subSequence(i2, strP0.length());
                break;
            }
            i2++;
        }
        String lowerCase = charSequenceSubSequence.toString().toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        return c5e.C(lowerCase, "select", false) || c5e.C(lowerCase, "pragma", false) || c5e.C(lowerCase, "with", false) || c5e.C(lowerCase, "explain", false);
    }

    public static final lyd U(aw2 aw2Var, pv2 pv2Var, dw2 dw2Var, l26 l26Var) {
        pv2 pv2VarB = y7h.B(aw2Var, pv2Var);
        dw2Var.getClass();
        lyd s18Var = dw2Var == dw2.b ? new s18(pv2VarB, l26Var) : new lyd(pv2VarB, true);
        s18Var.k0(dw2Var, s18Var, l26Var);
        return s18Var;
    }

    public static lyd V(aw2 aw2Var, pv2 pv2Var, dw2 dw2Var, l26 l26Var, int i2) {
        if ((i2 & 1) != 0) {
            pv2Var = nu4.a;
        }
        if ((i2 & 2) != 0) {
            dw2Var = dw2.a;
        }
        return U(aw2Var, pv2Var, dw2Var, l26Var);
    }

    public static final long W(long j2, long j3, float f2) {
        float fP = abg.P(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 >> 32)), f2);
        float fP2 = abg.P(Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j3 & 4294967295L)), f2);
        return (((long) Float.floatToRawIntBits(fP)) << 32) | (((long) Float.floatToRawIntBits(fP2)) & 4294967295L);
    }

    public static float X(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final j09 Y(j09 j09Var, xw9 xw9Var) {
        return j09Var.D(new ax9(xw9Var));
    }

    public static final j09 Z(j09 j09Var, float f2) {
        return j09Var.D(new vw9(f2, f2, f2, f2));
    }

    public static final void a(int i2, l46 l46Var, j09 j09Var, String str, String str2) {
        j09 j09Var2;
        str.getClass();
        str2.getClass();
        l46Var.h0(-1871785757);
        int i3 = i2 | (l46Var.g(str) ? 4 : 2) | (l46Var.g(str2) ? 32 : 16) | 384;
        boolean z = true;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(je0.class), null, null);
                l46Var.p0(objR);
            }
            je0 je0Var = (je0) objR;
            boolean zI = ((i3 & 14) == 4) | l46Var.i(je0Var);
            int i4 = i3 & 112;
            boolean z2 = zI | (i4 == 32);
            Object objR2 = l46Var.R();
            if (z2 || objR2 == obj) {
                objR2 = new ne0(je0Var, str, str2, null);
                l46Var.p0(objR2);
            }
            af1.p(str, str2, (l26) objR2, l46Var);
            boolean zI2 = l46Var.i(je0Var) | (i4 == 32);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == obj) {
                objR3 = new l0(11, je0Var, str2);
                l46Var.p0(objR3);
            }
            af1.g(str2, (a26) objR3, l46Var);
            vz9 vz9Var = je0Var.g;
            vz9 vz9Var2 = je0Var.v;
            boolean zT = pa7.t((String) vz9Var.getValue(), str2);
            boolean z3 = i4 == 32;
            Object objR4 = l46Var.R();
            if (z3 || objR4 == obj) {
                objR4 = sfc.k(str2.hashCode());
                l46Var.p0(objR4);
            }
            List list = (List) objR4;
            boolean z4 = zT && ((Boolean) je0Var.w.getValue()).booleanValue();
            float fFloatValue = zT ? ((Number) je0Var.x.getValue()).floatValue() : 0.0f;
            String str3 = zT ? (String) je0Var.y.getValue() : "";
            boolean z5 = zT && ((Boolean) vz9Var2.getValue()).booleanValue();
            if (((Boolean) vz9Var2.getValue()).booleanValue() || ((Boolean) je0Var.z.getValue()).booleanValue()) {
                z = false;
            }
            boolean zI3 = l46Var.i(je0Var) | (i4 == 32);
            Object objR5 = l46Var.R();
            if (zI3 || objR5 == obj) {
                objR5 = new v6(13, je0Var, str2);
                l46Var.p0(objR5);
            }
            b(z4, fFloatValue, list, str3, z5, z, (x16) objR5, l46Var, 12582912);
            j09Var2 = g09.a;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ke0(i2, str, str2, j09Var2, 0);
        }
    }

    public static final j09 a0(j09 j09Var, float f2, float f3) {
        return j09Var.D(new vw9(f2, f3, f2, f3));
    }

    public static final void b(boolean z, float f2, List list, String str, boolean z2, boolean z3, x16 x16Var, l46 l46Var, int i2) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(2082762620);
        int i3 = (i2 & 6) == 0 ? (l46Var2.h(z) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.d(f2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? l46Var2.g(list) : l46Var2.i(list) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var2.g(str) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i2 & 24576) == 0) {
            i3 |= l46Var2.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i3 |= l46Var2.h(z3) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= l46Var2.i(x16Var) ? 1048576 : 524288;
        }
        int i4 = 12582912 & i2;
        g09 g09Var = g09.a;
        if (i4 == 0) {
            i3 |= l46Var2.g(g09Var) ? 8388608 : 4194304;
        }
        if (l46Var2.W(i3 & 1, (4793491 & i3) != 4793490)) {
            boolean zB = if9.B(l46Var2);
            x4d x4dVarF = we6.f(a7c.b(8.0f), l46Var2);
            long jC = abg.c(zB ? 268435455 : 2063597567);
            if (we6.e(l46Var2)) {
                jC = y72.j;
            }
            long j2 = jC;
            long jC2 = we6.c(l8b.l(l46Var2), zB ? abg.c(352321535) : y72.e, l46Var2);
            long jC3 = we6.c(l8b.l(l46Var2), l8b.e(l46Var2), l46Var2);
            long jC4 = we6.c(l8b.c(l46Var2), l8b.a(l46Var2), l46Var2);
            long jC5 = we6.c(l8b.m(l46Var2), l8b.c(l46Var2), l46Var2);
            y6c y6cVarB = a7c.b(1.0f);
            j09 j09VarA0 = a0(tm7.o(oa7.E(db6.w(b.d(b.c(g09Var, 1.0f), 76.0f), we6.d(1.0f, 0.5f, l46Var2), jC2, x4dVarF), x4dVarF), j2, g21.f), 16.0f, 12.0f);
            kx0 kx0Var = ndb.z;
            t7c t7cVarA = s7c.a(xc0.a, kx0Var, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA0);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z4 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            bm8.h(x16Var, b.l(g09Var, 28.0f), z3, null, null, af1.b0(-1018207942, new le0(z, z2, 0), l46Var2), l46Var2, ((i3 >> 9) & 896) | ((i3 >> 18) & 14) | 1572912, 56);
            o5c.f(l46Var2, b.p(g09Var, 8.0f));
            int i5 = (int) (30.0f * f2);
            j09 j09VarD = b.d(new jw7(1.0f, true), 24.0f);
            t7c t7cVarA2 = s7c.a(new uc0(4.0f, true, new qc0(0)), kx0Var, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarD);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, t7cVarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            boolean z5 = f2 > 0.0f;
            l46Var2.f0(-2087011973);
            int i6 = 0;
            for (Object obj : list) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    t72.Z();
                    throw null;
                }
                float fFloatValue = (((Number) obj).floatValue() * 18.0f) + 6.0f;
                s21.a(tm7.o(b.d(b.p(g09Var, 2.0f), fFloatValue), z5 ? i6 < i5 ? jC4 : jC5 : jC3, y6cVarB), l46Var2, 0);
                i6 = i7;
            }
            l46Var2.r(false);
            l46Var2.r(true);
            o5c.f(l46Var2, b.p(g09Var, 8.0f));
            if (z2) {
                l46Var2.f0(-2074000004);
                axa.a(2.0f, 0.0f, 0, 390, 56, ((e8b) l46Var2.k(l8b.a)).q, 0L, l46Var2, b.l(g09Var, 16.0f));
                l46Var2 = l46Var2;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-2073837998);
                String str2 = str.length() == 0 ? "0:00" : str;
                mue mueVar = pue.a;
                nte.b(str2, null, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, yp5.d, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var2), l46Var, 0, 0, 130938);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new me0(z, f2, list, str, z2, z3, x16Var, i2);
        }
    }

    public static j09 b0(float f2, float f3, j09 j09Var, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return a0(j09Var, f2, f3);
    }

    public static final void c(String str, x16 x16Var, l46 l46Var, int i2) {
        str.getClass();
        x16Var.getClass();
        l46Var.h0(-2061489893);
        int i3 = (l46Var.g(str) ? 4 : 2) | i2 | 48 | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            cgg.a(x16Var, b.f(56.0f, 0.0f, b.c(g09.a, 1.0f), 2), false, g21.f, c8b.m(l46Var), null, null, null, af1.b0(-1746440405, new ob0(str, i4), l46Var), l46Var, ((i3 >> 6) & 14) | 805309488, 484);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mb(str, x16Var, i2, 3);
        }
    }

    public static final j09 c0(j09 j09Var, float f2, float f3, float f4, float f5) {
        return j09Var.D(new vw9(f2, f3, f4, f5));
    }

    public static final void d(fwc fwcVar, dd2 dd2Var, l46 l46Var, int i2) {
        l46Var.h0(-954926513);
        int i3 = (l46Var.i(fwcVar) ? 4 : 2) | i2;
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            urg.b(fwcVar, dd2Var, l46Var, i3 & 126);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fa2(fwcVar, dd2Var, i2, i4);
        }
    }

    public static j09 d0(float f2, float f3, float f4, float f5, int i2, j09 j09Var) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return c0(j09Var, f2, f3, f4, f5);
    }

    public static final void e(cre creVar, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(2080741862);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(creVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(dd2Var) ? 32 : 16;
        }
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            urg.c(creVar, dd2Var, l46Var, i3 & 126);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ea2(creVar, dd2Var, i2, i4);
        }
    }

    public static final ard e0(erd erdVar, l46 l46Var) {
        Object obj = (sw3) l46Var.k(zg2.h);
        ph3 ph3VarA = yud.a(l46Var);
        boolean zG = l46Var.g(obj) | l46Var.g(erdVar) | l46Var.g(ph3VarA);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new ard(erdVar, ph3VarA, b21.P(0.0f, 400.0f, 5, null));
            l46Var.p0(objR);
        }
        return (ard) objR;
    }

    public static final void f(jse jseVar, boolean z, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-579239002);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.i(jseVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            urg.d(jseVar, z, dd2Var, l46Var, i3 & 1022);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new da2(jseVar, z, dd2Var, i2, 1);
        }
    }

    public static final void f0(opd opdVar, int i2, Object obj) {
        int iG = opdVar.g(i2);
        Object[] objArr = opdVar.c;
        Object obj2 = objArr[iG];
        objArr[iG] = sf2.a;
        if (obj == obj2) {
            return;
        }
        wf2.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ")");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0313  */
    /* JADX WARN: Code duplicated, block: B:103:0x031b  */
    /* JADX WARN: Code duplicated, block: B:108:0x037c  */
    /* JADX WARN: Code duplicated, block: B:109:0x037e  */
    /* JADX WARN: Code duplicated, block: B:112:0x038d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:115:0x0393  */
    /* JADX WARN: Code duplicated, block: B:118:0x03b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:133:0x0425  */
    /* JADX WARN: Code duplicated, block: B:139:0x043d  */
    /* JADX WARN: Code duplicated, block: B:141:0x0451  */
    /* JADX WARN: Code duplicated, block: B:144:0x045d  */
    /* JADX WARN: Code duplicated, block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    /* JADX WARN: Code duplicated, block: B:22:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0055  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:41:0x007e  */
    /* JADX WARN: Code duplicated, block: B:45:0x008c  */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0099  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:53:0x009e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00da  */
    /* JADX WARN: Code duplicated, block: B:66:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:68:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:69:0x011c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0158  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:75:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:78:0x0238  */
    /* JADX WARN: Code duplicated, block: B:79:0x0250  */
    /* JADX WARN: Code duplicated, block: B:81:0x025c  */
    /* JADX WARN: Code duplicated, block: B:83:0x0278 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:84:0x027a  */
    /* JADX WARN: Code duplicated, block: B:87:0x029e A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:91:0x02ba  */
    /* JADX WARN: Code duplicated, block: B:99:0x02dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r12v1, types: [l46] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v4, types: [l46] */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r15v5 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7 */
    /* JADX WARN: Type inference failed for: r7v39 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    public static final void g(cwa cwaVar, boolean z, x16 x16Var, boolean z2, x16 x16Var2, l46 l46Var, int i2, int i3) {
        boolean z3;
        int i4;
        int i5;
        boolean z4;
        int i6;
        int i7;
        x16 x16Var3;
        int i8;
        int i9;
        boolean z5;
        boolean z6;
        boolean z7;
        x16 x16Var4;
        ?? r12;
        ojb ojbVarV;
        boolean z8;
        i8c i8cVar;
        x16 x16Var5;
        Object objR;
        Object obj;
        e89 e89Var;
        boolean z9;
        i8c i8cVar2;
        int i10;
        ?? r0;
        e89 e89Var2;
        boolean z10;
        l46 l46Var2;
        jx0 jx0Var;
        boolean z11;
        ov7 ov7Var;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        he2 he2Var4;
        ?? r13;
        Context context;
        ?? r7;
        x16 x16Var6;
        nfc nfcVarB;
        boolean zG;
        Object objR2;
        q9b q9bVar;
        nfc nfcVarB2;
        boolean zG2;
        Object objR3;
        t7 t7Var;
        i00 i00Var;
        int iK;
        int i11;
        ?? r10;
        e89 e89Var3;
        int i12;
        Object objR4;
        QuotaUsage quotaUsageB;
        SubscriptionInfo subscription;
        boolean z12;
        boolean zG3;
        Object objR5;
        Object obj2;
        Object objR6;
        Object obj3;
        int i13;
        l46 l46Var3 = l46Var;
        cwaVar.getClass();
        l46Var3.h0(121426782);
        int i14 = (l46Var3.g(cwaVar) ? 32 : 16) | i2;
        int i15 = i3 & 2;
        if (i15 == 0) {
            if ((i2 & 384) == 0) {
                z3 = z;
                i14 |= l46Var3.h(z3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            if ((i2 & 3072) == 0) {
                if (l46Var3.i(x16Var)) {
                    i13 = 2048;
                } else {
                    i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i14 |= i13;
            }
            i4 = i14 | 24576;
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((196608 & i2) == 0) {
                    z4 = z2;
                    if (l46Var3.h(z4)) {
                        i6 = 131072;
                    } else {
                        i6 = 65536;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i9 = i4 | 1572864;
                    x16Var3 = x16Var2;
                } else {
                    x16Var3 = x16Var2;
                    if (l46Var3.i(x16Var3)) {
                        i8 = 1048576;
                    } else {
                        i8 = 524288;
                    }
                    i9 = i4 | i8;
                }
                if ((599187 & i9) != 599186) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (l46Var3.W(i9 & 1, z5)) {
                    if (i15 != 0) {
                        z8 = true;
                    } else {
                        z8 = z3;
                    }
                    if (i5 != 0) {
                        z4 = true;
                    }
                    i8cVar = sf2.a;
                    if (i7 != 0) {
                        objR6 = l46Var3.R();
                        if (objR6 == i8cVar) {
                            obj3 = objR6;
                            vy9 vy9Var = new vy9(7);
                            l46Var3.p0(vy9Var);
                            obj3 = vy9Var;
                        }
                        obj3 = objR6;
                        x16Var5 = (x16) obj3;
                    } else {
                        x16Var5 = x16Var3;
                    }
                    k00 k00VarN = z5c.n(z8, cwaVar, xtd.a(z5c.r(l46Var3), ((e8b) l46Var3.k(l8b.a)).r, 65534), l46Var3);
                    Object[] objArr = new Object[0];
                    objR = l46Var3.R();
                    obj = objR;
                    if (objR == i8cVar) {
                        vy9 vy9Var2 = new vy9(8);
                        l46Var3.p0(vy9Var2);
                        obj = vy9Var2;
                    }
                    e89Var = (e89) vfh.I(objArr, (x16) obj, l46Var3, 48);
                    if (((Boolean) e89Var.getValue()).booleanValue()) {
                        l46Var3.f0(1063397198);
                        String strQ = afc.q(R.string.no_subscription, l46Var3);
                        String strQ2 = afc.q(R.string.button_confirm, l46Var3);
                        dd2 dd2Var = ok8.d;
                        zG3 = l46Var3.g(e89Var);
                        objR5 = l46Var3.R();
                        if (zG3 || objR5 == i8cVar) {
                            obj2 = objR5;
                            x08 x08Var = new x08(e89Var, 19);
                            l46Var3.p0(x08Var);
                            obj2 = x08Var;
                        }
                        z10 = true;
                        i8cVar2 = i8cVar;
                        z9 = z8;
                        e89Var2 = e89Var;
                        i10 = i9;
                        r0 = 0;
                        kj0.F(strQ, dd2Var, strQ2, null, false, false, null, null, null, (x16) obj2, l46Var, 100663344, 248);
                        l46 l46Var4 = l46Var;
                        l46Var4.r(false);
                        l46Var2 = l46Var4;
                    } else {
                        z9 = z8;
                        i8cVar2 = i8cVar;
                        i10 = i9;
                        r0 = 0;
                        e89Var2 = e89Var;
                        z10 = true;
                        l46Var3.f0(1063760580);
                        l46Var3.r(false);
                        l46Var2 = l46Var3;
                    }
                    jx0Var = ndb.Z;
                    j09 j09VarB0 = b0(24.0f, 0.0f, mh3.N(new mq6(jx0Var)), 2);
                    c92 c92VarA = a92.a(new uc0(8.0f, z10, new qc0(r0)), jx0Var, l46Var2, 54);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarB0);
                    lf2.q.getClass();
                    l46Var2.j0();
                    z11 = l46Var2.S;
                    ov7Var = LayoutNode.h1;
                    if (z11) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, c92VarA);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf);
                    dec.k(l46Var2);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ);
                    nte.c(k00VarN, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, jgb.W(l46Var2), l46Var, 0, 0, 262142);
                    r13 = l46Var;
                    r13.f0(7653230);
                    r13.r(r0);
                    context = (Context) r13.k(uq.b);
                    if (z4) {
                        r13.f0(1801364630);
                        z12 = !((Boolean) r13.k(h57.a)).booleanValue();
                        r13.r(r0);
                    } else {
                        r13.f0(7729919);
                        r13.r(r0);
                        r7 = r0;
                    }
                    if (r7 != 0) {
                        r13.f0(7839199);
                        nfcVarB = kr7.b(r13);
                        zG = r13.g(null) | r13.g(nfcVarB);
                        objR2 = r13.R();
                        i8c i8cVar3 = i8cVar2;
                        if (zG || objR2 == i8cVar3) {
                            r7 = z12;
                            objR2 = nfcVarB.b(job.a.b(q9b.class), null, null);
                            r13.p0(objR2);
                        }
                        q9bVar = (q9b) objR2;
                        nfcVarB2 = kr7.b(r13);
                        zG2 = r13.g(null) | r13.g(nfcVarB2);
                        objR3 = r13.R();
                        if (zG2 || objR3 == i8cVar3) {
                            objR3 = nfcVarB2.b(job.a.b(t7.class), null, null);
                            r13.p0(objR3);
                        }
                        t7Var = (t7) objR3;
                        ca2.a.getClass();
                        if (ca2.c && ((quotaUsageB = ((eab) q9bVar).b()) == null || (subscription = quotaUsageB.getSubscription()) == null || subscription.canPaymentTypeAutoRenewal() != z10)) {
                            r13.f0(9231502);
                            r13.r(r0);
                            x16Var6 = x16Var5;
                        } else {
                            r13.f0(8320474);
                            mq6 mq6Var = new mq6(jx0Var);
                            t7c t7cVarA = s7c.a(new uc0(12.0f, z10, new qc0(r0)), ndb.z, r13, 54);
                            int iHashCode2 = Long.hashCode(r13.T);
                            u8a u8aVarM2 = r13.m();
                            j09 j09VarJ2 = m93.J(r13, mq6Var);
                            r13.j0();
                            if (r13.S) {
                                r13.l(ov7Var);
                            } else {
                                r13.s0();
                            }
                            dec.l(he2Var, r13, t7cVarA);
                            dec.l(he2Var2, r13, u8aVarM2);
                            ib8.s(iHashCode2, r13, he2Var3, r13);
                            dec.l(he2Var4, r13, j09VarJ2);
                            xtd xtdVarR = z5c.r(r13);
                            r13.f0(-1024941951);
                            i00Var = new i00();
                            r13.f0(-1024941118);
                            iK = i00Var.k(xtdVarR);
                            try {
                                i00Var.f(afc.q(R.string.cancel_subscription, r13));
                                i00Var.h(iK);
                                r13.r(r0);
                                k00 k00VarL = i00Var.l();
                                r13.r(r0);
                                mue mueVarW = jgb.W(r13);
                                boolean z13 = (r13.i(context) ? 1 : 0) | (r13.i(q9bVar) ? 1 : 0) | (r13.i(t7Var) ? 1 : 0);
                                i11 = i10;
                                if ((3670016 & i11) == 1048576) {
                                    r10 = z10;
                                } else {
                                    r10 = r0;
                                }
                                int i16 = (z13 ? 1 : 0) | r10;
                                e89Var3 = e89Var2;
                                i12 = i16 | (r13.g(e89Var3) ? 1 : 0);
                                objR4 = r13.R();
                                if (i12 == 0 || objR4 == i8cVar3) {
                                    x16Var6 = x16Var5;
                                    objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                                    r13.p0(objR4);
                                } else {
                                    x16Var6 = x16Var5;
                                }
                                x57.f(k00VarL, null, mueVarW, false, 0, 0, null, (a26) objR4, r13, 0);
                                if (ca2.c || x16Var == null) {
                                    r13.f0(-1217688963);
                                    r13.r(r0);
                                } else {
                                    r13.f0(-1217873475);
                                    xtd xtdVarR2 = z5c.r(r13);
                                    r13.f0(1926965619);
                                    i00 i00Var2 = new i00();
                                    r13.f0(1926966452);
                                    int iK2 = i00Var2.k(xtdVarR2);
                                    try {
                                        i00Var2.f(afc.q(R.string.paywall_restore_purchase, r13));
                                        i00Var2.h(iK2);
                                        r13.r(r0);
                                        k00 k00VarL2 = i00Var2.l();
                                        r13.r(r0);
                                        mue mueVarW2 = jgb.W(r13);
                                        ?? r15 = (i11 & 7168) == 2048 ? z10 : r0;
                                        Object objR7 = r13.R();
                                        Object obj4 = objR7;
                                        if (r15 != 0 || objR7 == i8cVar3) {
                                            p9 p9Var = new p9(23, x16Var);
                                            r13.p0(p9Var);
                                            obj4 = p9Var;
                                        }
                                        x57.f(k00VarL2, null, mueVarW2, false, 0, 0, null, (a26) obj4, r13, 0);
                                        r13.r(r0);
                                    } catch (Throwable th) {
                                        i00Var2.h(iK2);
                                        throw th;
                                    }
                                }
                                r13.r(z10);
                                r13.r(r0);
                            } catch (Throwable th2) {
                                i00Var.h(iK);
                                throw th2;
                            }
                        }
                        r13.r(r0);
                    } else {
                        r7 = z12;
                        x16Var6 = x16Var5;
                        r13.f0(9237454);
                        r13.r(r0);
                    }
                    r13.r(z10);
                    z6 = z4;
                    x16Var4 = x16Var6;
                    z7 = z9;
                    r12 = r13;
                } else {
                    l46Var3.Z();
                    z6 = z4;
                    z7 = z3;
                    x16Var4 = x16Var3;
                    r12 = l46Var3;
                }
                ojbVarV = r12.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new k28(cwaVar, z7, x16Var, z6, x16Var4, i2, i3);
                }
            }
            i4 = 221184 | i14;
            z4 = z2;
            i7 = i3 & 32;
            if (i7 != 0) {
                i9 = i4 | 1572864;
                x16Var3 = x16Var2;
            } else {
                x16Var3 = x16Var2;
                if (l46Var3.i(x16Var3)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i9 = i4 | i8;
            }
            if ((599187 & i9) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (l46Var3.W(i9 & 1, z5)) {
                if (i15 != 0) {
                    z8 = true;
                } else {
                    z8 = z3;
                }
                if (i5 != 0) {
                    z4 = true;
                }
                i8cVar = sf2.a;
                if (i7 != 0) {
                    objR6 = l46Var3.R();
                    if (objR6 == i8cVar) {
                        obj3 = objR6;
                        vy9 vy9Var3 = new vy9(7);
                        l46Var3.p0(vy9Var3);
                        obj3 = vy9Var3;
                    }
                    obj3 = objR6;
                    x16Var5 = (x16) obj3;
                } else {
                    x16Var5 = x16Var3;
                }
                k00 k00VarN2 = z5c.n(z8, cwaVar, xtd.a(z5c.r(l46Var3), ((e8b) l46Var3.k(l8b.a)).r, 65534), l46Var3);
                Object[] objArr2 = new Object[0];
                objR = l46Var3.R();
                obj = objR;
                if (objR == i8cVar) {
                    vy9 vy9Var4 = new vy9(8);
                    l46Var3.p0(vy9Var4);
                    obj = vy9Var4;
                }
                e89Var = (e89) vfh.I(objArr2, (x16) obj, l46Var3, 48);
                if (((Boolean) e89Var.getValue()).booleanValue()) {
                    l46Var3.f0(1063397198);
                    String strQ3 = afc.q(R.string.no_subscription, l46Var3);
                    String strQ4 = afc.q(R.string.button_confirm, l46Var3);
                    dd2 dd2Var2 = ok8.d;
                    zG3 = l46Var3.g(e89Var);
                    objR5 = l46Var3.R();
                    if (zG3) {
                        obj2 = objR5;
                        x08 x08Var2 = new x08(e89Var, 19);
                        l46Var3.p0(x08Var2);
                        obj2 = x08Var2;
                    } else {
                        obj2 = objR5;
                        x08 x08Var3 = new x08(e89Var, 19);
                        l46Var3.p0(x08Var3);
                        obj2 = x08Var3;
                    }
                    z10 = true;
                    i8cVar2 = i8cVar;
                    z9 = z8;
                    e89Var2 = e89Var;
                    i10 = i9;
                    r0 = 0;
                    kj0.F(strQ3, dd2Var2, strQ4, null, false, false, null, null, null, (x16) obj2, l46Var, 100663344, 248);
                    l46 l46Var5 = l46Var;
                    l46Var5.r(false);
                    l46Var2 = l46Var5;
                } else {
                    z9 = z8;
                    i8cVar2 = i8cVar;
                    i10 = i9;
                    r0 = 0;
                    e89Var2 = e89Var;
                    z10 = true;
                    l46Var3.f0(1063760580);
                    l46Var3.r(false);
                    l46Var2 = l46Var3;
                }
                jx0Var = ndb.Z;
                j09 j09VarB1 = b0(24.0f, 0.0f, mh3.N(new mq6(jx0Var)), 2);
                c92 c92VarA2 = a92.a(new uc0(8.0f, z10, new qc0(r0)), jx0Var, l46Var2, 54);
                int iHashCode3 = Long.hashCode(l46Var2.T);
                u8a u8aVarM3 = l46Var2.m();
                j09 j09VarJ3 = m93.J(l46Var2, j09VarB1);
                lf2.q.getClass();
                l46Var2.j0();
                z11 = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z11) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var2, c92VarA2);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM3);
                Integer numValueOf2 = Integer.valueOf(iHashCode3);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf2);
                dec.k(l46Var2);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ3);
                nte.c(k00VarN2, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, jgb.W(l46Var2), l46Var, 0, 0, 262142);
                r13 = l46Var;
                r13.f0(7653230);
                r13.r(r0);
                context = (Context) r13.k(uq.b);
                if (z4) {
                    r13.f0(1801364630);
                    z12 = !((Boolean) r13.k(h57.a)).booleanValue();
                    r13.r(r0);
                } else {
                    r13.f0(7729919);
                    r13.r(r0);
                    r7 = r0;
                }
                if (r7 != 0) {
                    r13.f0(7839199);
                    nfcVarB = kr7.b(r13);
                    zG = r13.g(null) | r13.g(nfcVarB);
                    objR2 = r13.R();
                    i8c i8cVar4 = i8cVar2;
                    if (zG) {
                        r7 = z12;
                        objR2 = nfcVarB.b(job.a.b(q9b.class), null, null);
                        r13.p0(objR2);
                    } else {
                        r7 = z12;
                        objR2 = nfcVarB.b(job.a.b(q9b.class), null, null);
                        r13.p0(objR2);
                    }
                    q9bVar = (q9b) objR2;
                    nfcVarB2 = kr7.b(r13);
                    zG2 = r13.g(null) | r13.g(nfcVarB2);
                    objR3 = r13.R();
                    if (zG2) {
                        objR3 = nfcVarB2.b(job.a.b(t7.class), null, null);
                        r13.p0(objR3);
                    } else {
                        objR3 = nfcVarB2.b(job.a.b(t7.class), null, null);
                        r13.p0(objR3);
                    }
                    t7Var = (t7) objR3;
                    ca2.a.getClass();
                    if (ca2.c) {
                        r13.f0(8320474);
                        mq6 mq6Var2 = new mq6(jx0Var);
                        t7c t7cVarA2 = s7c.a(new uc0(12.0f, z10, new qc0(r0)), ndb.z, r13, 54);
                        int iHashCode4 = Long.hashCode(r13.T);
                        u8a u8aVarM4 = r13.m();
                        j09 j09VarJ4 = m93.J(r13, mq6Var2);
                        r13.j0();
                        if (r13.S) {
                            r13.l(ov7Var);
                        } else {
                            r13.s0();
                        }
                        dec.l(he2Var, r13, t7cVarA2);
                        dec.l(he2Var2, r13, u8aVarM4);
                        ib8.s(iHashCode4, r13, he2Var3, r13);
                        dec.l(he2Var4, r13, j09VarJ4);
                        xtd xtdVarR3 = z5c.r(r13);
                        r13.f0(-1024941951);
                        i00Var = new i00();
                        r13.f0(-1024941118);
                        iK = i00Var.k(xtdVarR3);
                        i00Var.f(afc.q(R.string.cancel_subscription, r13));
                        i00Var.h(iK);
                        r13.r(r0);
                        k00 k00VarL3 = i00Var.l();
                        r13.r(r0);
                        mue mueVarW3 = jgb.W(r13);
                        boolean z14 = (r13.i(context) ? 1 : 0) | (r13.i(q9bVar) ? 1 : 0) | (r13.i(t7Var) ? 1 : 0);
                        i11 = i10;
                        if ((3670016 & i11) == 1048576) {
                            r10 = z10;
                        } else {
                            r10 = r0;
                        }
                        int i17 = (z14 ? 1 : 0) | r10;
                        e89Var3 = e89Var2;
                        i12 = i17 | (r13.g(e89Var3) ? 1 : 0);
                        objR4 = r13.R();
                        if (i12 == 0) {
                            x16Var6 = x16Var5;
                            objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                            r13.p0(objR4);
                        } else {
                            x16Var6 = x16Var5;
                            objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                            r13.p0(objR4);
                        }
                        x57.f(k00VarL3, null, mueVarW3, false, 0, 0, null, (a26) objR4, r13, 0);
                        if (ca2.c) {
                            r13.f0(-1217688963);
                            r13.r(r0);
                        } else {
                            r13.f0(-1217688963);
                            r13.r(r0);
                        }
                        r13.r(z10);
                        r13.r(r0);
                    } else {
                        r13.f0(8320474);
                        mq6 mq6Var3 = new mq6(jx0Var);
                        t7c t7cVarA3 = s7c.a(new uc0(12.0f, z10, new qc0(r0)), ndb.z, r13, 54);
                        int iHashCode5 = Long.hashCode(r13.T);
                        u8a u8aVarM5 = r13.m();
                        j09 j09VarJ5 = m93.J(r13, mq6Var3);
                        r13.j0();
                        if (r13.S) {
                            r13.l(ov7Var);
                        } else {
                            r13.s0();
                        }
                        dec.l(he2Var, r13, t7cVarA3);
                        dec.l(he2Var2, r13, u8aVarM5);
                        ib8.s(iHashCode5, r13, he2Var3, r13);
                        dec.l(he2Var4, r13, j09VarJ5);
                        xtd xtdVarR4 = z5c.r(r13);
                        r13.f0(-1024941951);
                        i00Var = new i00();
                        r13.f0(-1024941118);
                        iK = i00Var.k(xtdVarR4);
                        i00Var.f(afc.q(R.string.cancel_subscription, r13));
                        i00Var.h(iK);
                        r13.r(r0);
                        k00 k00VarL4 = i00Var.l();
                        r13.r(r0);
                        mue mueVarW4 = jgb.W(r13);
                        boolean z15 = (r13.i(context) ? 1 : 0) | (r13.i(q9bVar) ? 1 : 0) | (r13.i(t7Var) ? 1 : 0);
                        i11 = i10;
                        if ((3670016 & i11) == 1048576) {
                            r10 = z10;
                        } else {
                            r10 = r0;
                        }
                        int i18 = (z15 ? 1 : 0) | r10;
                        e89Var3 = e89Var2;
                        i12 = i18 | (r13.g(e89Var3) ? 1 : 0);
                        objR4 = r13.R();
                        if (i12 == 0) {
                            x16Var6 = x16Var5;
                            objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                            r13.p0(objR4);
                        } else {
                            x16Var6 = x16Var5;
                            objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                            r13.p0(objR4);
                        }
                        x57.f(k00VarL4, null, mueVarW4, false, 0, 0, null, (a26) objR4, r13, 0);
                        if (ca2.c) {
                            r13.f0(-1217688963);
                            r13.r(r0);
                        } else {
                            r13.f0(-1217688963);
                            r13.r(r0);
                        }
                        r13.r(z10);
                        r13.r(r0);
                    }
                    r13.r(r0);
                } else {
                    r7 = z12;
                    x16Var6 = x16Var5;
                    r13.f0(9237454);
                    r13.r(r0);
                }
                r13.r(z10);
                z6 = z4;
                x16Var4 = x16Var6;
                z7 = z9;
                r12 = r13;
            } else {
                l46Var3.Z();
                z6 = z4;
                z7 = z3;
                x16Var4 = x16Var3;
                r12 = l46Var3;
            }
            ojbVarV = r12.v();
            if (ojbVarV != null) {
                ojbVarV.d = new k28(cwaVar, z7, x16Var, z6, x16Var4, i2, i3);
            }
        }
        i14 |= 384;
        z3 = z;
        if ((i2 & 3072) == 0) {
            if (l46Var3.i(x16Var)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i14 |= i13;
        }
        i4 = i14 | 24576;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((196608 & i2) == 0) {
                z4 = z2;
                if (l46Var3.h(z4)) {
                    i6 = 131072;
                } else {
                    i6 = 65536;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                i9 = i4 | 1572864;
                x16Var3 = x16Var2;
            } else {
                x16Var3 = x16Var2;
                if (l46Var3.i(x16Var3)) {
                    i8 = 1048576;
                } else {
                    i8 = 524288;
                }
                i9 = i4 | i8;
            }
            if ((599187 & i9) != 599186) {
                z5 = true;
            } else {
                z5 = false;
            }
            if (l46Var3.W(i9 & 1, z5)) {
                if (i15 != 0) {
                    z8 = true;
                } else {
                    z8 = z3;
                }
                if (i5 != 0) {
                    z4 = true;
                }
                i8cVar = sf2.a;
                if (i7 != 0) {
                    objR6 = l46Var3.R();
                    if (objR6 == i8cVar) {
                        obj3 = objR6;
                        vy9 vy9Var5 = new vy9(7);
                        l46Var3.p0(vy9Var5);
                        obj3 = vy9Var5;
                    }
                    obj3 = objR6;
                    x16Var5 = (x16) obj3;
                } else {
                    x16Var5 = x16Var3;
                }
                k00 k00VarN3 = z5c.n(z8, cwaVar, xtd.a(z5c.r(l46Var3), ((e8b) l46Var3.k(l8b.a)).r, 65534), l46Var3);
                Object[] objArr3 = new Object[0];
                objR = l46Var3.R();
                obj = objR;
                if (objR == i8cVar) {
                    vy9 vy9Var6 = new vy9(8);
                    l46Var3.p0(vy9Var6);
                    obj = vy9Var6;
                }
                e89Var = (e89) vfh.I(objArr3, (x16) obj, l46Var3, 48);
                if (((Boolean) e89Var.getValue()).booleanValue()) {
                    l46Var3.f0(1063397198);
                    String strQ5 = afc.q(R.string.no_subscription, l46Var3);
                    String strQ6 = afc.q(R.string.button_confirm, l46Var3);
                    dd2 dd2Var3 = ok8.d;
                    zG3 = l46Var3.g(e89Var);
                    objR5 = l46Var3.R();
                    if (zG3) {
                        obj2 = objR5;
                        x08 x08Var4 = new x08(e89Var, 19);
                        l46Var3.p0(x08Var4);
                        obj2 = x08Var4;
                    } else {
                        obj2 = objR5;
                        x08 x08Var5 = new x08(e89Var, 19);
                        l46Var3.p0(x08Var5);
                        obj2 = x08Var5;
                    }
                    z10 = true;
                    i8cVar2 = i8cVar;
                    z9 = z8;
                    e89Var2 = e89Var;
                    i10 = i9;
                    r0 = 0;
                    kj0.F(strQ5, dd2Var3, strQ6, null, false, false, null, null, null, (x16) obj2, l46Var, 100663344, 248);
                    l46 l46Var6 = l46Var;
                    l46Var6.r(false);
                    l46Var2 = l46Var6;
                } else {
                    z9 = z8;
                    i8cVar2 = i8cVar;
                    i10 = i9;
                    r0 = 0;
                    e89Var2 = e89Var;
                    z10 = true;
                    l46Var3.f0(1063760580);
                    l46Var3.r(false);
                    l46Var2 = l46Var3;
                }
                jx0Var = ndb.Z;
                j09 j09VarB2 = b0(24.0f, 0.0f, mh3.N(new mq6(jx0Var)), 2);
                c92 c92VarA3 = a92.a(new uc0(8.0f, z10, new qc0(r0)), jx0Var, l46Var2, 54);
                int iHashCode6 = Long.hashCode(l46Var2.T);
                u8a u8aVarM6 = l46Var2.m();
                j09 j09VarJ6 = m93.J(l46Var2, j09VarB2);
                lf2.q.getClass();
                l46Var2.j0();
                z11 = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z11) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var2, c92VarA3);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM6);
                Integer numValueOf3 = Integer.valueOf(iHashCode6);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf3);
                dec.k(l46Var2);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ6);
                nte.c(k00VarN3, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, jgb.W(l46Var2), l46Var, 0, 0, 262142);
                r13 = l46Var;
                r13.f0(7653230);
                r13.r(r0);
                context = (Context) r13.k(uq.b);
                if (z4) {
                    r13.f0(1801364630);
                    z12 = !((Boolean) r13.k(h57.a)).booleanValue();
                    r13.r(r0);
                } else {
                    r13.f0(7729919);
                    r13.r(r0);
                    r7 = r0;
                }
                if (r7 != 0) {
                    r13.f0(7839199);
                    nfcVarB = kr7.b(r13);
                    zG = r13.g(null) | r13.g(nfcVarB);
                    objR2 = r13.R();
                    i8c i8cVar5 = i8cVar2;
                    if (zG) {
                        r7 = z12;
                        objR2 = nfcVarB.b(job.a.b(q9b.class), null, null);
                        r13.p0(objR2);
                    } else {
                        r7 = z12;
                        objR2 = nfcVarB.b(job.a.b(q9b.class), null, null);
                        r13.p0(objR2);
                    }
                    q9bVar = (q9b) objR2;
                    nfcVarB2 = kr7.b(r13);
                    zG2 = r13.g(null) | r13.g(nfcVarB2);
                    objR3 = r13.R();
                    if (zG2) {
                        objR3 = nfcVarB2.b(job.a.b(t7.class), null, null);
                        r13.p0(objR3);
                    } else {
                        objR3 = nfcVarB2.b(job.a.b(t7.class), null, null);
                        r13.p0(objR3);
                    }
                    t7Var = (t7) objR3;
                    ca2.a.getClass();
                    if (ca2.c) {
                        r13.f0(8320474);
                        mq6 mq6Var4 = new mq6(jx0Var);
                        t7c t7cVarA4 = s7c.a(new uc0(12.0f, z10, new qc0(r0)), ndb.z, r13, 54);
                        int iHashCode7 = Long.hashCode(r13.T);
                        u8a u8aVarM7 = r13.m();
                        j09 j09VarJ7 = m93.J(r13, mq6Var4);
                        r13.j0();
                        if (r13.S) {
                            r13.l(ov7Var);
                        } else {
                            r13.s0();
                        }
                        dec.l(he2Var, r13, t7cVarA4);
                        dec.l(he2Var2, r13, u8aVarM7);
                        ib8.s(iHashCode7, r13, he2Var3, r13);
                        dec.l(he2Var4, r13, j09VarJ7);
                        xtd xtdVarR5 = z5c.r(r13);
                        r13.f0(-1024941951);
                        i00Var = new i00();
                        r13.f0(-1024941118);
                        iK = i00Var.k(xtdVarR5);
                        i00Var.f(afc.q(R.string.cancel_subscription, r13));
                        i00Var.h(iK);
                        r13.r(r0);
                        k00 k00VarL5 = i00Var.l();
                        r13.r(r0);
                        mue mueVarW5 = jgb.W(r13);
                        boolean z16 = (r13.i(context) ? 1 : 0) | (r13.i(q9bVar) ? 1 : 0) | (r13.i(t7Var) ? 1 : 0);
                        i11 = i10;
                        if ((3670016 & i11) == 1048576) {
                            r10 = z10;
                        } else {
                            r10 = r0;
                        }
                        int i19 = (z16 ? 1 : 0) | r10;
                        e89Var3 = e89Var2;
                        i12 = i19 | (r13.g(e89Var3) ? 1 : 0);
                        objR4 = r13.R();
                        if (i12 == 0) {
                            x16Var6 = x16Var5;
                            objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                            r13.p0(objR4);
                        } else {
                            x16Var6 = x16Var5;
                            objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                            r13.p0(objR4);
                        }
                        x57.f(k00VarL5, null, mueVarW5, false, 0, 0, null, (a26) objR4, r13, 0);
                        if (ca2.c) {
                            r13.f0(-1217688963);
                            r13.r(r0);
                        } else {
                            r13.f0(-1217688963);
                            r13.r(r0);
                        }
                        r13.r(z10);
                        r13.r(r0);
                    } else {
                        r13.f0(8320474);
                        mq6 mq6Var5 = new mq6(jx0Var);
                        t7c t7cVarA5 = s7c.a(new uc0(12.0f, z10, new qc0(r0)), ndb.z, r13, 54);
                        int iHashCode8 = Long.hashCode(r13.T);
                        u8a u8aVarM8 = r13.m();
                        j09 j09VarJ8 = m93.J(r13, mq6Var5);
                        r13.j0();
                        if (r13.S) {
                            r13.l(ov7Var);
                        } else {
                            r13.s0();
                        }
                        dec.l(he2Var, r13, t7cVarA5);
                        dec.l(he2Var2, r13, u8aVarM8);
                        ib8.s(iHashCode8, r13, he2Var3, r13);
                        dec.l(he2Var4, r13, j09VarJ8);
                        xtd xtdVarR6 = z5c.r(r13);
                        r13.f0(-1024941951);
                        i00Var = new i00();
                        r13.f0(-1024941118);
                        iK = i00Var.k(xtdVarR6);
                        i00Var.f(afc.q(R.string.cancel_subscription, r13));
                        i00Var.h(iK);
                        r13.r(r0);
                        k00 k00VarL6 = i00Var.l();
                        r13.r(r0);
                        mue mueVarW6 = jgb.W(r13);
                        boolean z17 = (r13.i(context) ? 1 : 0) | (r13.i(q9bVar) ? 1 : 0) | (r13.i(t7Var) ? 1 : 0);
                        i11 = i10;
                        if ((3670016 & i11) == 1048576) {
                            r10 = z10;
                        } else {
                            r10 = r0;
                        }
                        int i110 = (z17 ? 1 : 0) | r10;
                        e89Var3 = e89Var2;
                        i12 = i110 | (r13.g(e89Var3) ? 1 : 0);
                        objR4 = r13.R();
                        if (i12 == 0) {
                            x16Var6 = x16Var5;
                            objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                            r13.p0(objR4);
                        } else {
                            x16Var6 = x16Var5;
                            objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                            r13.p0(objR4);
                        }
                        x57.f(k00VarL6, null, mueVarW6, false, 0, 0, null, (a26) objR4, r13, 0);
                        if (ca2.c) {
                            r13.f0(-1217688963);
                            r13.r(r0);
                        } else {
                            r13.f0(-1217688963);
                            r13.r(r0);
                        }
                        r13.r(z10);
                        r13.r(r0);
                    }
                    r13.r(r0);
                } else {
                    r7 = z12;
                    x16Var6 = x16Var5;
                    r13.f0(9237454);
                    r13.r(r0);
                }
                r13.r(z10);
                z6 = z4;
                x16Var4 = x16Var6;
                z7 = z9;
                r12 = r13;
            } else {
                l46Var3.Z();
                z6 = z4;
                z7 = z3;
                x16Var4 = x16Var3;
                r12 = l46Var3;
            }
            ojbVarV = r12.v();
            if (ojbVarV != null) {
                ojbVarV.d = new k28(cwaVar, z7, x16Var, z6, x16Var4, i2, i3);
            }
        }
        i4 = 221184 | i14;
        z4 = z2;
        i7 = i3 & 32;
        if (i7 != 0) {
            i9 = i4 | 1572864;
            x16Var3 = x16Var2;
        } else {
            x16Var3 = x16Var2;
            if (l46Var3.i(x16Var3)) {
                i8 = 1048576;
            } else {
                i8 = 524288;
            }
            i9 = i4 | i8;
        }
        if ((599187 & i9) != 599186) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (l46Var3.W(i9 & 1, z5)) {
            if (i15 != 0) {
                z8 = true;
            } else {
                z8 = z3;
            }
            if (i5 != 0) {
                z4 = true;
            }
            i8cVar = sf2.a;
            if (i7 != 0) {
                objR6 = l46Var3.R();
                if (objR6 == i8cVar) {
                    obj3 = objR6;
                    vy9 vy9Var7 = new vy9(7);
                    l46Var3.p0(vy9Var7);
                    obj3 = vy9Var7;
                }
                obj3 = objR6;
                x16Var5 = (x16) obj3;
            } else {
                x16Var5 = x16Var3;
            }
            k00 k00VarN4 = z5c.n(z8, cwaVar, xtd.a(z5c.r(l46Var3), ((e8b) l46Var3.k(l8b.a)).r, 65534), l46Var3);
            Object[] objArr4 = new Object[0];
            objR = l46Var3.R();
            obj = objR;
            if (objR == i8cVar) {
                vy9 vy9Var8 = new vy9(8);
                l46Var3.p0(vy9Var8);
                obj = vy9Var8;
            }
            e89Var = (e89) vfh.I(objArr4, (x16) obj, l46Var3, 48);
            if (((Boolean) e89Var.getValue()).booleanValue()) {
                l46Var3.f0(1063397198);
                String strQ7 = afc.q(R.string.no_subscription, l46Var3);
                String strQ8 = afc.q(R.string.button_confirm, l46Var3);
                dd2 dd2Var4 = ok8.d;
                zG3 = l46Var3.g(e89Var);
                objR5 = l46Var3.R();
                if (zG3) {
                    obj2 = objR5;
                    x08 x08Var6 = new x08(e89Var, 19);
                    l46Var3.p0(x08Var6);
                    obj2 = x08Var6;
                } else {
                    obj2 = objR5;
                    x08 x08Var7 = new x08(e89Var, 19);
                    l46Var3.p0(x08Var7);
                    obj2 = x08Var7;
                }
                z10 = true;
                i8cVar2 = i8cVar;
                z9 = z8;
                e89Var2 = e89Var;
                i10 = i9;
                r0 = 0;
                kj0.F(strQ7, dd2Var4, strQ8, null, false, false, null, null, null, (x16) obj2, l46Var, 100663344, 248);
                l46 l46Var7 = l46Var;
                l46Var7.r(false);
                l46Var2 = l46Var7;
            } else {
                z9 = z8;
                i8cVar2 = i8cVar;
                i10 = i9;
                r0 = 0;
                e89Var2 = e89Var;
                z10 = true;
                l46Var3.f0(1063760580);
                l46Var3.r(false);
                l46Var2 = l46Var3;
            }
            jx0Var = ndb.Z;
            j09 j09VarB3 = b0(24.0f, 0.0f, mh3.N(new mq6(jx0Var)), 2);
            c92 c92VarA4 = a92.a(new uc0(8.0f, z10, new qc0(r0)), jx0Var, l46Var2, 54);
            int iHashCode9 = Long.hashCode(l46Var2.T);
            u8a u8aVarM9 = l46Var2.m();
            j09 j09VarJ9 = m93.J(l46Var2, j09VarB3);
            lf2.q.getClass();
            l46Var2.j0();
            z11 = l46Var2.S;
            ov7Var = LayoutNode.h1;
            if (z11) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA4);
            he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM9);
            Integer numValueOf4 = Integer.valueOf(iHashCode9);
            he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf4);
            dec.k(l46Var2);
            he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ9);
            nte.c(k00VarN4, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, jgb.W(l46Var2), l46Var, 0, 0, 262142);
            r13 = l46Var;
            r13.f0(7653230);
            r13.r(r0);
            context = (Context) r13.k(uq.b);
            if (z4) {
                r13.f0(1801364630);
                z12 = !((Boolean) r13.k(h57.a)).booleanValue();
                r13.r(r0);
            } else {
                r13.f0(7729919);
                r13.r(r0);
                r7 = r0;
            }
            if (r7 != 0) {
                r13.f0(7839199);
                nfcVarB = kr7.b(r13);
                zG = r13.g(null) | r13.g(nfcVarB);
                objR2 = r13.R();
                i8c i8cVar6 = i8cVar2;
                if (zG) {
                    r7 = z12;
                    objR2 = nfcVarB.b(job.a.b(q9b.class), null, null);
                    r13.p0(objR2);
                } else {
                    r7 = z12;
                    objR2 = nfcVarB.b(job.a.b(q9b.class), null, null);
                    r13.p0(objR2);
                }
                q9bVar = (q9b) objR2;
                nfcVarB2 = kr7.b(r13);
                zG2 = r13.g(null) | r13.g(nfcVarB2);
                objR3 = r13.R();
                if (zG2) {
                    objR3 = nfcVarB2.b(job.a.b(t7.class), null, null);
                    r13.p0(objR3);
                } else {
                    objR3 = nfcVarB2.b(job.a.b(t7.class), null, null);
                    r13.p0(objR3);
                }
                t7Var = (t7) objR3;
                ca2.a.getClass();
                if (ca2.c) {
                    r13.f0(8320474);
                    mq6 mq6Var6 = new mq6(jx0Var);
                    t7c t7cVarA6 = s7c.a(new uc0(12.0f, z10, new qc0(r0)), ndb.z, r13, 54);
                    int iHashCode10 = Long.hashCode(r13.T);
                    u8a u8aVarM10 = r13.m();
                    j09 j09VarJ10 = m93.J(r13, mq6Var6);
                    r13.j0();
                    if (r13.S) {
                        r13.l(ov7Var);
                    } else {
                        r13.s0();
                    }
                    dec.l(he2Var, r13, t7cVarA6);
                    dec.l(he2Var2, r13, u8aVarM10);
                    ib8.s(iHashCode10, r13, he2Var3, r13);
                    dec.l(he2Var4, r13, j09VarJ10);
                    xtd xtdVarR7 = z5c.r(r13);
                    r13.f0(-1024941951);
                    i00Var = new i00();
                    r13.f0(-1024941118);
                    iK = i00Var.k(xtdVarR7);
                    i00Var.f(afc.q(R.string.cancel_subscription, r13));
                    i00Var.h(iK);
                    r13.r(r0);
                    k00 k00VarL7 = i00Var.l();
                    r13.r(r0);
                    mue mueVarW7 = jgb.W(r13);
                    boolean z18 = (r13.i(context) ? 1 : 0) | (r13.i(q9bVar) ? 1 : 0) | (r13.i(t7Var) ? 1 : 0);
                    i11 = i10;
                    if ((3670016 & i11) == 1048576) {
                        r10 = z10;
                    } else {
                        r10 = r0;
                    }
                    int i111 = (z18 ? 1 : 0) | r10;
                    e89Var3 = e89Var2;
                    i12 = i111 | (r13.g(e89Var3) ? 1 : 0);
                    objR4 = r13.R();
                    if (i12 == 0) {
                        x16Var6 = x16Var5;
                        objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                        r13.p0(objR4);
                    } else {
                        x16Var6 = x16Var5;
                        objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                        r13.p0(objR4);
                    }
                    x57.f(k00VarL7, null, mueVarW7, false, 0, 0, null, (a26) objR4, r13, 0);
                    if (ca2.c) {
                        r13.f0(-1217688963);
                        r13.r(r0);
                    } else {
                        r13.f0(-1217688963);
                        r13.r(r0);
                    }
                    r13.r(z10);
                    r13.r(r0);
                } else {
                    r13.f0(8320474);
                    mq6 mq6Var7 = new mq6(jx0Var);
                    t7c t7cVarA7 = s7c.a(new uc0(12.0f, z10, new qc0(r0)), ndb.z, r13, 54);
                    int iHashCode11 = Long.hashCode(r13.T);
                    u8a u8aVarM11 = r13.m();
                    j09 j09VarJ11 = m93.J(r13, mq6Var7);
                    r13.j0();
                    if (r13.S) {
                        r13.l(ov7Var);
                    } else {
                        r13.s0();
                    }
                    dec.l(he2Var, r13, t7cVarA7);
                    dec.l(he2Var2, r13, u8aVarM11);
                    ib8.s(iHashCode11, r13, he2Var3, r13);
                    dec.l(he2Var4, r13, j09VarJ11);
                    xtd xtdVarR8 = z5c.r(r13);
                    r13.f0(-1024941951);
                    i00Var = new i00();
                    r13.f0(-1024941118);
                    iK = i00Var.k(xtdVarR8);
                    i00Var.f(afc.q(R.string.cancel_subscription, r13));
                    i00Var.h(iK);
                    r13.r(r0);
                    k00 k00VarL8 = i00Var.l();
                    r13.r(r0);
                    mue mueVarW8 = jgb.W(r13);
                    boolean z19 = (r13.i(context) ? 1 : 0) | (r13.i(q9bVar) ? 1 : 0) | (r13.i(t7Var) ? 1 : 0);
                    i11 = i10;
                    if ((3670016 & i11) == 1048576) {
                        r10 = z10;
                    } else {
                        r10 = r0;
                    }
                    int i112 = (z19 ? 1 : 0) | r10;
                    e89Var3 = e89Var2;
                    i12 = i112 | (r13.g(e89Var3) ? 1 : 0);
                    objR4 = r13.R();
                    if (i12 == 0) {
                        x16Var6 = x16Var5;
                        objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                        r13.p0(objR4);
                    } else {
                        x16Var6 = x16Var5;
                        objR4 = new kf(context, q9bVar, t7Var, x16Var6, e89Var3, 16);
                        r13.p0(objR4);
                    }
                    x57.f(k00VarL8, null, mueVarW8, false, 0, 0, null, (a26) objR4, r13, 0);
                    if (ca2.c) {
                        r13.f0(-1217688963);
                        r13.r(r0);
                    } else {
                        r13.f0(-1217688963);
                        r13.r(r0);
                    }
                    r13.r(z10);
                    r13.r(r0);
                }
                r13.r(r0);
            } else {
                r7 = z12;
                x16Var6 = x16Var5;
                r13.f0(9237454);
                r13.r(r0);
            }
            r13.r(z10);
            z6 = z4;
            x16Var4 = x16Var6;
            z7 = z9;
            r12 = r13;
        } else {
            l46Var3.Z();
            z6 = z4;
            z7 = z3;
            x16Var4 = x16Var3;
            r12 = l46Var3;
        }
        ojbVarV = r12.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k28(cwaVar, z7, x16Var, z6, x16Var4, i2, i3);
        }
    }

    public static final void g0(int i2, int i3, List list) {
        int iH = H(i2, list);
        if (iH < 0) {
            iH = -(iH + 1);
        }
        while (iH < list.size() && ((db7) list.get(iH)).b < i3) {
        }
    }

    public static final void h(int i2, x16 x16Var, x16 x16Var2, l46 l46Var, boolean z) {
        l46 l46Var2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(1386128699);
        int i3 = (l46Var.h(z) ? 4 : 2) | i2 | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            l46Var2 = l46Var;
            rs0.f(b.c, false, af1.b0(1773656606, new ei4(x16Var, x16Var2, z), l46Var), l46Var2, 390, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new np1(z, x16Var, x16Var2, i2, 1);
        }
    }

    public static final void h0(Throwable th) throws Throwable {
        th.getClass();
        if (S(th)) {
            throw th;
        }
    }

    public static final void i(j09 j09Var, tc0 tc0Var, wc0 wc0Var, int i2, ndb ndbVar, dd2 dd2Var, l46 l46Var, int i3) {
        int i4;
        Object obj;
        boolean z;
        Object obj2;
        kx0 kx0Var = ndb.y;
        l46Var.h0(-1956591841);
        if ((i3 & 6) == 0) {
            i4 = (l46Var.g(j09Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.g(tc0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var.g(wc0Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var.g(kx0Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= l46Var.e(i2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i4 |= l46Var.e(Integer.MAX_VALUE) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            obj = ndbVar;
            i4 |= l46Var.g(obj) ? 1048576 : 524288;
        } else {
            obj = ndbVar;
        }
        if ((i3 & 12582912) == 0) {
            i4 |= l46Var.i(dd2Var) ? 8388608 : 4194304;
        }
        int i5 = i4;
        if (l46Var.W(i5 & 1, (i5 & 4793491) != 4793490)) {
            int i6 = i5 & 3670016;
            boolean z2 = i6 == 1048576;
            Object objR = l46Var.R();
            Object obj3 = sf2.a;
            if (z2 || objR == obj3) {
                obj.getClass();
                objR = new bn5();
                l46Var.p0(objR);
            }
            bn5 bn5Var = (bn5) objR;
            int i7 = i5 >> 3;
            boolean zG = ((((57344 & i7) ^ 24576) > 16384 && l46Var.e(Integer.MAX_VALUE)) || (i7 & 24576) == 16384) | ((((i7 & 14) ^ 6) > 4 && l46Var.g(tc0Var)) || (i7 & 6) == 4) | ((((i7 & 112) ^ 48) > 32 && l46Var.g(wc0Var)) || (i7 & 48) == 32) | ((((i7 & 896) ^ 384) > 256 && l46Var.g(kx0Var)) || (i7 & 384) == 256) | ((((i7 & 7168) ^ 3072) > 2048 && l46Var.e(i2)) || (i7 & 3072) == 2048) | l46Var.g(bn5Var);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj3) {
                Object dn5Var = new dn5(tc0Var, wc0Var, tc0Var.f(), new b03(kx0Var), wc0Var.f(), i2, bn5Var);
                l46Var.p0(dn5Var);
                objR2 = dn5Var;
            }
            dn5 dn5Var2 = (dn5) objR2;
            boolean z3 = (i6 == 1048576) | ((i5 & 29360128) == 8388608) | ((i5 & 458752) == 131072);
            Object objR3 = l46Var.R();
            if (z3 || objR3 == obj3) {
                ArrayList arrayList = new ArrayList();
                z = true;
                arrayList.add(new dd2(new qx1(dd2Var, 3), true, -1192950673));
                ndbVar.getClass();
                l46Var.p0(arrayList);
                obj2 = arrayList;
            } else {
                z = true;
                obj2 = objR3;
            }
            dd2 dd2Var2 = new dd2(new ch3((List) obj2, 2, (byte) 0), z, 1271844412);
            boolean zG2 = l46Var.g(dn5Var2);
            Object objR4 = l46Var.R();
            if (zG2 || objR4 == obj3) {
                objR4 = new x49(dn5Var2);
                l46Var.p0(objR4);
            }
            xn8 xn8Var = (xn8) objR4;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            tec.q(0, dd2Var2, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r8(j09Var, tc0Var, wc0Var, i2, ndbVar, dd2Var, i3);
        }
    }

    public static final void i0(rme rmeVar, Resources resources, cne cneVar, boolean z, a26 a26Var) {
        if (z) {
            rmeVar.a.h(new bne(cneVar.b(), resources.getString(cneVar.c()), cneVar.a(), a26Var));
        }
    }

    public static final void j(j09 j09Var, final tc0 tc0Var, wc0 wc0Var, kx0 kx0Var, int i2, int i3, final dd2 dd2Var, l46 l46Var, final int i4, final int i5) {
        int i6;
        final j09 j09Var2;
        final wc0 wc0Var2;
        final int i7;
        final int i8;
        l46Var.h0(-1303174015);
        int i9 = i5 & 1;
        if (i9 != 0) {
            i6 = i4 | 6;
        } else if ((i4 & 6) == 0) {
            i6 = (l46Var.g(j09Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= l46Var.g(tc0Var) ? 32 : 16;
        }
        int i10 = i5 & 4;
        if (i10 != 0) {
            i6 |= 384;
        } else if ((i4 & 384) == 0) {
            i6 |= l46Var.g(wc0Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i11 = i6 | 3072;
        int i12 = i5 & 16;
        if (i12 != 0) {
            i11 = i6 | 27648;
        } else if ((i4 & 24576) == 0) {
            i11 |= l46Var.e(i2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i13 = i11 | 196608;
        if (l46Var.W(i13 & 1, (599187 & i13) != 599186)) {
            if (i9 != 0) {
                j09Var = g09.a;
            }
            j09 j09Var3 = j09Var;
            if (i10 != 0) {
                wc0Var = xc0.c;
            }
            wc0 wc0Var3 = wc0Var;
            kx0Var = ndb.y;
            int i14 = (i13 & 14) | 1572864 | (i13 & 112) | (i13 & 896) | 3072 | (i13 & 57344) | 12779520;
            int i15 = i12 != 0 ? Integer.MAX_VALUE : i2;
            i(j09Var3, tc0Var, wc0Var3, i15, ndb.V0, dd2Var, l46Var, i14);
            i8 = Integer.MAX_VALUE;
            j09Var2 = j09Var3;
            i7 = i15;
            wc0Var2 = wc0Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            wc0Var2 = wc0Var;
            i7 = i2;
            i8 = i3;
        }
        final kx0 kx0Var2 = kx0Var;
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: zm5
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    ynb.j(j09Var2, tc0Var, wc0Var2, kx0Var2, i7, i8, dd2Var, (l46) obj, k99.P(i4 | 1), i5);
                    return wef.a;
                }
            };
        }
    }

    public static final Rect j0(a77 a77Var) {
        return new Rect(a77Var.a, a77Var.b, a77Var.c, a77Var.d);
    }

    public static final void k(ka9 ka9Var, l46 l46Var, int i2) {
        l46Var.h0(1459118602);
        int i3 = (l46Var.i(ka9Var) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            boolean zI = l46Var.i(ka9Var);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new vw5(ka9Var, 14);
                l46Var.p0(objR);
            }
            l((x16) objR, l46Var, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new u14(ka9Var, i2, 5);
        }
    }

    public static final RectF k0(hkb hkbVar) {
        return new RectF(hkbVar.a, hkbVar.b, hkbVar.c, hkbVar.d);
    }

    public static final void l(x16 x16Var, l46 l46Var, int i2) {
        l46Var.h0(779737590);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 3) != 2)) {
            o7c.b(af1.b0(2128919745, new fi4(7, x16Var), l46Var), l46Var, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fi4(i2, 8, x16Var);
        }
    }

    public static final hkb l0(Rect rect) {
        return new hkb(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final void m(final j09 j09Var, final String str, final l26 l26Var, final int i2, final int i3, final long j2, final float f2, final n26 n26Var, final x16 x16Var, final dd2 dd2Var, l46 l46Var, final int i4) {
        int i5;
        l26 l26Var2;
        x16 x16Var2;
        Object obj;
        Object objB;
        Object obj2;
        j09Var.getClass();
        str.getClass();
        l26Var.getClass();
        x16Var.getClass();
        l46Var.h0(-2109555692);
        if ((i4 & 6) == 0) {
            i5 = (l46Var.g(j09Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            l26Var2 = l26Var;
            i5 |= l46Var.i(l26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            l26Var2 = l26Var;
        }
        if ((i4 & 3072) == 0) {
            i5 |= l46Var.e(i2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i4 & 24576) == 0) {
            i5 |= l46Var.e(i3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i4) == 0) {
            i5 |= l46Var.f(j2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i5 |= l46Var.d(f2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i5 |= l46Var.g(null) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i5 |= l46Var.i(n26Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i4) == 0) {
            x16Var2 = x16Var;
            i5 |= l46Var.i(x16Var2) ? 536870912 : 268435456;
        } else {
            x16Var2 = x16Var;
        }
        if (l46Var.W(i5 & 1, (i5 & 306783379) != 306783378)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj3 = sf2.a;
            if (zG || objR == obj3) {
                obj = null;
                objB = nfcVarB.b(job.a.b(fcb.class), null, null);
                l46Var.p0(objB);
            } else {
                objB = objR;
                obj = null;
            }
            fcb fcbVar = (fcb) objB;
            nfc nfcVarB2 = kr7.b(l46Var);
            boolean zG2 = l46Var.g(obj) | l46Var.g(nfcVarB2);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == obj3) {
                obj2 = null;
                objR2 = nfcVarB2.b(job.a.b(wt6.class), null, null);
                l46Var.p0(objR2);
            } else {
                obj2 = null;
            }
            wt6 wt6Var = (wt6) objR2;
            nfc nfcVarB3 = kr7.b(l46Var);
            boolean zG3 = l46Var.g(obj2) | l46Var.g(nfcVarB3);
            Object objR3 = l46Var.R();
            if (zG3 || objR3 == obj3) {
                objR3 = nfcVarB3.b(job.a.b(t7.class), null, null);
                l46Var.p0(objR3);
            }
            t7 t7Var = (t7) objR3;
            boolean z = (i5 & 7168) == 2048;
            Object objR4 = l46Var.R();
            if (z || objR4 == obj3) {
                objR4 = new a12(i2, 1);
                l46Var.p0(objR4);
            }
            int i6 = i5;
            final cs3 cs3VarB = ay9.b(i3, (i5 >> 12) & 14, 2, (x16) objR4, l46Var);
            Object objR5 = l46Var.R();
            if (objR5 == obj3) {
                objR5 = af1.E(l46Var);
                l46Var.p0(objR5);
            }
            final aw2 aw2Var = (aw2) objR5;
            Context context = (Context) l46Var.k(uq.b);
            Object objR6 = l46Var.R();
            if (objR6 == obj3) {
                objR6 = new g6d();
                l46Var.p0(objR6);
            }
            final g6d g6dVar = (g6d) objR6;
            boolean zI = l46Var.i(g6dVar);
            Object objR7 = l46Var.R();
            if (zI || objR7 == obj3) {
                objR7 = new za6(21, g6dVar);
                l46Var.p0(objR7);
            }
            af1.g(g6dVar, (a26) objR7, l46Var);
            xdc.a(j09Var.D(b.c), l26Var2, af1.b0(-227980689, new ti3(cs3VarB, context, g6dVar, aw2Var, str, t7Var, wt6Var, fcbVar, x16Var2), l46Var), null, null, 0, j2, 0L, null, af1.b0(-180149275, new n26() { // from class: l38
                @Override // defpackage.n26
                public final Object m(Object obj4, Object obj5, Object obj6) {
                    boolean z2;
                    l46 l46Var2;
                    xw9 xw9Var = (xw9) obj4;
                    l46 l46Var3 = (l46) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    xw9Var.getClass();
                    int i7 = 2;
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var3.g(xw9Var) ? 4 : 2;
                    }
                    if (l46Var3.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        j09 j09VarY = ynb.Y(b.c, xw9Var);
                        c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var3, 0);
                        int iHashCode = Long.hashCode(l46Var3.T);
                        u8a u8aVarM = l46Var3.m();
                        j09 j09VarJ = m93.J(l46Var3, j09VarY);
                        lf2.q.getClass();
                        l46Var3.j0();
                        if (l46Var3.S) {
                            l46Var3.l(LayoutNode.h1);
                        } else {
                            l46Var3.s0();
                        }
                        dec.l(hj6.z, l46Var3, c92VarA);
                        dec.l(hj6.y, l46Var3, u8aVarM);
                        dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode));
                        dec.k(l46Var3);
                        dec.l(hj6.x, l46Var3, j09VarJ);
                        yx9 yx9Var = cs3VarB;
                        int iL = yx9Var.l();
                        i8c i8cVar = sf2.a;
                        if (iL > 1) {
                            l46Var3.f0(-311908752);
                            j09 j09VarD0 = ynb.d0(0.0f, 16.0f, 0.0f, 0.0f, 13, new mq6(ndb.Z));
                            int iL2 = yx9Var.l();
                            int iJ = ((sz9) yx9Var.d.c).j();
                            aw2 aw2Var2 = aw2Var;
                            boolean zI2 = l46Var3.i(aw2Var2) | l46Var3.g(yx9Var);
                            Object objR8 = l46Var3.R();
                            if (zI2 || objR8 == i8cVar) {
                                objR8 = new so5(25, aw2Var2, yx9Var);
                                l46Var3.p0(objR8);
                            }
                            l46Var2 = l46Var3;
                            scc.b(j09VarD0, iL2, true, n26Var, null, iJ, (a26) objR8, l46Var2, 0, 36);
                            z2 = true;
                            l46Var2.r(false);
                        } else {
                            z2 = true;
                            l46Var2 = l46Var3;
                            ib8.r(f2, -311347714, l46Var2, l46Var2, g09.a);
                            l46Var2.r(false);
                        }
                        Object objR9 = l46Var2.R();
                        if (objR9 == i8cVar) {
                            objR9 = q1c.f(Boolean.FALSE);
                            l46Var2.p0(objR9);
                        }
                        e89 e89Var = (e89) objR9;
                        if (1.0f <= 0.0d) {
                            g37.a("invalid weight; must be greater than zero");
                        }
                        l46 l46Var4 = l46Var2;
                        cn1.h(0.0f, 0, 0, 16380, null, af1.b0(-222255140, new p93(e89Var, dd2Var, g6dVar, i7), l46Var2), l46Var4, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, null, null, null, yx9Var, null, null, false);
                        l46Var4.r(z2);
                    } else {
                        l46Var3.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i6 >> 3) & 112) | 805306752 | (3670016 & (i6 << 3)), 440);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: m38
                @Override // defpackage.l26
                public final Object z(Object obj4, Object obj5) {
                    ((Integer) obj5).getClass();
                    ynb.m(j09Var, str, l26Var, i2, i3, j2, f2, n26Var, x16Var, dd2Var, (l46) obj4, k99.P(i4 | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final hkb m0(RectF rectF) {
        return new hkb(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public static final void n(int i2, l46 l46Var, j09 j09Var, String str, String str2) {
        l46 l46Var2;
        j09 j09Var2;
        str.getClass();
        l46Var.h0(1913083167);
        int i3 = (l46Var.g(str) ? 4 : 2) | i2 | (l46Var.g(str2) ? 32 : 16);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            Object objDecode = (c5e.C(str, "data:image", false) && v4e.F(str, "base64", false)) ? Base64.decode(v4e.f0(str, "base64,", str), 0) : str;
            pw6 pw6Var = new pw6((Context) l46Var.k(uq.b));
            pw6Var.c = objDecode;
            pw6Var.j = new tib(ykd.c);
            q95 q95Var = vw6.a;
            q95 q95Var2 = yw6.a;
            pw6Var.b().a.put(yw6.a, new l03(200));
            AsyncImagePainter asyncImagePainterJ = ndc.j(pw6Var.a(), l46Var);
            l46Var2 = l46Var;
            j09Var2 = j09Var;
            nk8.d(j09Var2, ndb.f, af1.b0(-934771467, new w7(28, asyncImagePainterJ, str2), l46Var), l46Var2, 3126, 4);
        } else {
            l46Var2 = l46Var;
            j09Var2 = j09Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ke0(i2, str, str2, j09Var2, 2);
        }
    }

    public static Icon n0(IconCompat iconCompat, Context context) {
        Icon iconCreateWithBitmap;
        InputStream inputStreamOpenInputStream;
        int i2 = iconCompat.a;
        String strE = null;
        switch (i2) {
            case -1:
                return (Icon) iconCompat.b;
            case 0:
            default:
                qc0.j("Unknown type");
                return null;
            case 1:
                iconCreateWithBitmap = Icon.createWithBitmap((Bitmap) iconCompat.b);
                break;
            case 2:
                if (i2 == -1) {
                    Object obj = iconCompat.b;
                    if (Build.VERSION.SDK_INT >= 28) {
                        strE = s.E(obj);
                    } else {
                        try {
                            strE = (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
                        } catch (IllegalAccessException e2) {
                            b1.e("IconCompat", "Unable to get icon package", e2);
                        } catch (NoSuchMethodException e3) {
                            b1.e("IconCompat", "Unable to get icon package", e3);
                        } catch (InvocationTargetException e4) {
                            b1.e("IconCompat", "Unable to get icon package", e4);
                        }
                    }
                } else {
                    if (i2 != 2) {
                        yg5.r(iconCompat, "called getResPackage() on ");
                        return null;
                    }
                    String str = iconCompat.j;
                    strE = (str == null || TextUtils.isEmpty(str)) ? ((String) iconCompat.b).split(":", -1)[0] : iconCompat.j;
                }
                iconCreateWithBitmap = Icon.createWithResource(strE, iconCompat.e);
                break;
            case 3:
                iconCreateWithBitmap = Icon.createWithData((byte[]) iconCompat.b, iconCompat.e, iconCompat.f);
                break;
            case 4:
                iconCreateWithBitmap = Icon.createWithContentUri((String) iconCompat.b);
                break;
            case 5:
                iconCreateWithBitmap = Icon.createWithAdaptiveBitmap((Bitmap) iconCompat.b);
                break;
            case 6:
                if (Build.VERSION.SDK_INT >= 30) {
                    iconCreateWithBitmap = p6.b(iconCompat.d());
                } else {
                    if (context == null) {
                        v.a(iconCompat.d(), "Context is required to resolve the file uri of the icon: ");
                        return null;
                    }
                    Uri uriD = iconCompat.d();
                    String scheme = uriD.getScheme();
                    if ("content".equals(scheme) || "file".equals(scheme)) {
                        try {
                            inputStreamOpenInputStream = context.getContentResolver().openInputStream(uriD);
                        } catch (Exception e5) {
                            b1.n("IconCompat", "Unable to load image from URI: " + uriD, e5);
                            inputStreamOpenInputStream = null;
                        }
                    } else {
                        try {
                            File file = new File((String) iconCompat.b);
                            inputStreamOpenInputStream = a.b(file, new FileInputStream(file));
                        } catch (FileNotFoundException e6) {
                            b1.n("IconCompat", "Unable to load image from path: " + uriD, e6);
                            inputStreamOpenInputStream = null;
                        }
                    }
                    if (inputStreamOpenInputStream == null) {
                        s8f.h(iconCompat.d(), "Cannot load adaptive icon from uri: ");
                        return null;
                    }
                    iconCreateWithBitmap = Icon.createWithAdaptiveBitmap(BitmapFactory.decodeStream(inputStreamOpenInputStream));
                }
                break;
        }
        ColorStateList colorStateList = iconCompat.g;
        if (colorStateList != null) {
            iconCreateWithBitmap.setTintList(colorStateList);
        }
        PorterDuff.Mode mode = iconCompat.h;
        if (mode != IconCompat.k) {
            iconCreateWithBitmap.setTintMode(mode);
        }
        return iconCreateWithBitmap;
    }

    public static final void o(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        l46 l46Var2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(707031524);
        int i3 = 2;
        int i4 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.i(x16Var2) ? 32 : 16);
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            l46Var2 = l46Var;
            rs0.f(b.c, false, af1.b0(-2047619833, new ht5(x16Var, x16Var2, i3), l46Var), l46Var2, 390, 2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 21, x16Var, x16Var2);
        }
    }

    public static final wnb o0(wnb wnbVar) {
        return !Q(wnbVar) ? wnbVar : wnbVar.p(wnbVar.s(), ((xnb) wnbVar).a);
    }

    public static final long p(float f2, float f3) {
        return (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static final Object p0(pv2 pv2Var, l26 l26Var, xn2 xn2Var) {
        Unsafe unsafe;
        long j2;
        pv2 context = xn2Var.getContext();
        pv2 pv2VarP0 = !((Boolean) pv2Var.V0(new he2(29), Boolean.FALSE)).booleanValue() ? context.p0(pv2Var) : y7h.v(context, pv2Var, false);
        tq.v(pv2VarP0);
        if (pv2VarP0 == context) {
            pfc pfcVar = new pfc(xn2Var, pv2VarP0);
            return gcc.C(pfcVar, true, pfcVar, l26Var);
        }
        hj6 hj6Var = hj6.Z;
        if (pa7.t(pv2VarP0.F0(hj6Var), context.F0(hj6Var))) {
            hbf hbfVar = new hbf(xn2Var, pv2VarP0);
            pv2 pv2Var2 = hbfVar.d;
            Object objC = dwe.c(pv2Var2, null);
            try {
                return gcc.C(hbfVar, true, hbfVar, l26Var);
            } finally {
                dwe.a(pv2Var2, objC);
            }
        }
        ba4 ba4Var = new ba4(xn2Var, pv2VarP0);
        try {
            aa4.a(k99.D(k99.x(ba4Var, ba4Var, l26Var)), wef.a);
            do {
                unsafe = ud0.a;
                j2 = ba4.f;
                int intVolatile = unsafe.getIntVolatile(ba4Var, j2);
                if (intVolatile != 0) {
                    if (intVolatile != 2) {
                        qc0.p("Already suspended");
                        return null;
                    }
                    Object objA = sg7.a(ba4Var.K());
                    if (objA instanceof eb2) {
                        throw ((eb2) objA).a;
                    }
                    return objA;
                }
            } while (!unsafe.compareAndSwapInt(ba4Var, j2, 0, 1));
            return bw2.a;
        } catch (Throwable th) {
            Throwable cause = th;
            if (cause instanceof y94) {
                cause = ((y94) cause).getCause();
            }
            ba4Var.g(jzb.k(cause));
            throw cause;
        }
    }

    public static bx9 q(float f2, float f3, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        return new bx9(f2, f3, f2, f3);
    }

    public static float q0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static bx9 r(float f2, float f3, float f4, float f5, int i2) {
        if ((i2 & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 2) != 0) {
            f3 = 0.0f;
        }
        if ((i2 & 4) != 0) {
            f4 = 0.0f;
        }
        if ((i2 & 8) != 0) {
            f5 = 0.0f;
        }
        return new bx9(f2, f3, f4, f5);
    }

    public static boolean r0(Thread thread) {
        Thread thread2 = j;
        if (thread2 == null) {
            thread2 = Looper.getMainLooper().getThread();
            j = thread2;
        }
        return thread == thread2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:104:0x0214 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:105:0x0216  */
    /* JADX WARN: Code duplicated, block: B:108:0x0241  */
    /* JADX WARN: Code duplicated, block: B:109:0x0245  */
    /* JADX WARN: Code duplicated, block: B:112:0x025a  */
    /* JADX WARN: Code duplicated, block: B:114:0x0290  */
    /* JADX WARN: Code duplicated, block: B:116:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:118:0x030a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0315  */
    /* JADX WARN: Code duplicated, block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0070  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:55:0x008f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:78:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:82:0x010f  */
    /* JADX WARN: Code duplicated, block: B:83:0x0113  */
    /* JADX WARN: Code duplicated, block: B:86:0x0133  */
    /* JADX WARN: Code duplicated, block: B:88:0x013b  */
    /* JADX WARN: Code duplicated, block: B:89:0x013d  */
    /* JADX WARN: Code duplicated, block: B:91:0x0141  */
    /* JADX WARN: Code duplicated, block: B:92:0x0157  */
    /* JADX WARN: Code duplicated, block: B:95:0x0194  */
    /* JADX WARN: Code duplicated, block: B:98:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:99:0x01cf  */
    public static final void s(j09 j09Var, boolean z, a26 a26Var, y72 y72Var, y72 y72Var2, boolean z2, l46 l46Var, int i2, int i3) {
        j09 j09Var2;
        int i4;
        y72 y72Var3;
        int i5;
        y72 y72Var4;
        int i6;
        int i7;
        boolean z3;
        int i8;
        int i9;
        boolean z4;
        y72 y72Var5;
        boolean z5;
        ojb ojbVarV;
        g09 g09Var;
        j09 j09Var3;
        y72 y72Var6;
        y72 y72Var7;
        boolean z6;
        boolean z7;
        mue mueVarW;
        jx0 jx0Var;
        boolean z8;
        ov7 ov7Var;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        he2 he2Var4;
        y72 y72Var8;
        boolean z9;
        y72 y72Var9;
        long j2;
        k00 k00VarM;
        qy1 qy1VarU;
        boolean z10;
        boolean z11;
        boolean zG;
        Object objR;
        i8c i8cVar;
        Object objR2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1511366337);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            j09Var2 = j09Var;
        } else if ((i2 & 6) == 0) {
            j09Var2 = j09Var;
            i4 = (l46Var2.g(j09Var2) ? 4 : 2) | i2;
        } else {
            j09Var2 = j09Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var2.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i11 = i3 & 8;
        if (i11 == 0) {
            if ((i2 & 3072) == 0) {
                y72Var3 = y72Var;
                i4 |= l46Var2.g(y72Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i5 = i3 & 16;
            if (i5 != 0) {
                if ((i2 & 24576) == 0) {
                    y72Var4 = y72Var2;
                    if (l46Var2.g(y72Var4)) {
                        i6 = 16384;
                    } else {
                        i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    if ((196608 & i2) == 0) {
                        z3 = z2;
                        if (l46Var2.h(z3)) {
                            i8 = 131072;
                        } else {
                            i8 = 65536;
                        }
                        i4 |= i8;
                    }
                    i9 = 0;
                    if ((74899 & i4) != 74898) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (l46Var2.W(i4 & 1, z4)) {
                        g09Var = g09.a;
                        if (i10 != 0) {
                            j09Var3 = g09Var;
                        } else {
                            j09Var3 = j09Var2;
                        }
                        if (i11 != 0) {
                            y72Var6 = null;
                        } else {
                            y72Var6 = y72Var3;
                        }
                        if (i5 != 0) {
                            y72Var7 = null;
                        } else {
                            y72Var7 = y72Var4;
                        }
                        if (i7 != 0) {
                            z6 = false;
                        } else {
                            z6 = z3;
                        }
                        ca2.a.getClass();
                        z7 = ca2.c;
                        mueVarW = jgb.W(l46Var2);
                        j09 j09VarN = mh3.N(j09Var3);
                        jx0Var = ndb.Z;
                        c92 c92VarA = a92.a(new uc0(8.0f, true, new qc0(i9)), jx0Var, l46Var2, 54);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarN);
                        lf2.q.getClass();
                        l46Var2.j0();
                        z8 = l46Var2.S;
                        ov7Var = LayoutNode.h1;
                        if (z8) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        he2Var = hj6.z;
                        dec.l(he2Var, l46Var2, c92VarA);
                        he2Var2 = hj6.y;
                        dec.l(he2Var2, l46Var2, u8aVarM);
                        Integer numValueOf = Integer.valueOf(iHashCode);
                        he2Var3 = hj6.X;
                        dec.l(he2Var3, l46Var2, numValueOf);
                        dec.k(l46Var2);
                        he2Var4 = hj6.x;
                        dec.l(he2Var4, l46Var2, j09VarJ);
                        if (z7) {
                            y72Var8 = y72Var6;
                            z9 = true;
                            l46Var2.f0(-285288841);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-286664993);
                            if (y72Var7 == null) {
                                y72Var9 = y72Var6;
                            } else {
                                y72Var9 = y72Var7;
                            }
                            if (y72Var9 == null) {
                                l46Var2.f0(960584795);
                                j2 = ((e8b) l46Var2.k(l8b.a)).r;
                                l46Var2.r(false);
                            } else {
                                l46Var2.f0(960583710);
                                l46Var2.r(false);
                                j2 = y72Var9.a;
                            }
                            xtd xtdVarA = xtd.a(z5c.r(l46Var2), j2, 65534);
                            mue mueVarA = mue.a(mueVarW, j2, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                            k00VarM = z5c.m(0, l46Var2, xtdVarA);
                            qy1VarU = qk2.u(l46Var2);
                            if (y72Var6 != null) {
                                qy1VarU = qy1VarU.b(qy1VarU.a, qy1VarU.b, (4091 & 4) != 0 ? qy1VarU.c : y72Var6.a, qy1VarU.d, qy1VarU.e, qy1VarU.f, qy1VarU.g, qy1VarU.h, (4091 & 256) != 0 ? qy1VarU.i : 0L, qy1VarU.j, qy1VarU.k, qy1VarU.l);
                            }
                            t7c t7cVarA = s7c.a(new uc0(12.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var2, 54);
                            int iHashCode2 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM2 = l46Var2.m();
                            j09 j09VarJ2 = m93.J(l46Var2, g09Var);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var, l46Var2, t7cVarA);
                            dec.l(he2Var2, l46Var2, u8aVarM2);
                            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var4, l46Var2, j09VarJ2);
                            if (z6) {
                                l46Var2.f0(1751895376);
                                j09 j09VarR = b21.R(b.o(g09Var, 48.0f, 48.0f, 0.0f, 12), z, false, new i5c(1), a26Var, 10);
                                zG = l46Var2.g(k00VarM);
                                objR = l46Var2.R();
                                i8cVar = sf2.a;
                                if (zG || objR == i8cVar) {
                                    objR = new p59(13, k00VarM);
                                    l46Var2.p0(objR);
                                }
                                j09 j09VarB = vwc.b(j09VarR, false, (a26) objR);
                                xn8 xn8VarC = s21.c(ndb.f, false);
                                int iHashCode3 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM3 = l46Var2.m();
                                j09 j09VarJ3 = m93.J(l46Var2, j09VarB);
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(ov7Var);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(he2Var, l46Var2, xn8VarC);
                                dec.l(he2Var2, l46Var2, u8aVarM3);
                                ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                                dec.l(he2Var4, l46Var2, j09VarJ3);
                                objR2 = l46Var2.R();
                                if (objR2 == i8cVar) {
                                    objR2 = new xn9(27);
                                    l46Var2.p0(objR2);
                                }
                                qy1 qy1Var = qy1VarU;
                                y72Var8 = y72Var6;
                                z10 = false;
                                qk2.i(z, vwc.a(g09Var, (a26) objR2), false, 0.0f, qy1Var, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 12);
                                z11 = true;
                                l46Var2.r(true);
                                l46Var2.r(false);
                            } else {
                                qy1 qy1Var2 = qy1VarU;
                                z10 = false;
                                z11 = true;
                                y72Var8 = y72Var6;
                                l46Var2.f0(1752463792);
                                qk2.i(z, null, false, 0.0f, qy1Var2, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 14);
                                l46Var2.r(false);
                            }
                            nte.c(k00VarM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA, l46Var, 0, 0, 262142);
                            l46Var2 = l46Var;
                            z9 = true;
                            l46Var2.r(true);
                            l46Var2.r(false);
                        }
                        l46Var2.r(z9);
                        j09Var2 = j09Var3;
                        y72Var5 = y72Var7;
                        z5 = z6;
                        y72Var3 = y72Var8;
                    } else {
                        l46Var2.Z();
                        y72Var5 = y72Var4;
                        z5 = z3;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new pb0(j09Var2, z, a26Var, y72Var3, y72Var5, z5, i2, i3);
                    }
                }
                i4 |= 196608;
                z3 = z2;
                i9 = 0;
                if ((74899 & i4) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var2.W(i4 & 1, z4)) {
                    g09Var = g09.a;
                    if (i10 != 0) {
                        j09Var3 = g09Var;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        y72Var6 = null;
                    } else {
                        y72Var6 = y72Var3;
                    }
                    if (i5 != 0) {
                        y72Var7 = null;
                    } else {
                        y72Var7 = y72Var4;
                    }
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    ca2.a.getClass();
                    z7 = ca2.c;
                    mueVarW = jgb.W(l46Var2);
                    j09 j09VarN2 = mh3.N(j09Var3);
                    jx0Var = ndb.Z;
                    c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(i9)), jx0Var, l46Var2, 54);
                    int iHashCode4 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM4 = l46Var2.m();
                    j09 j09VarJ4 = m93.J(l46Var2, j09VarN2);
                    lf2.q.getClass();
                    l46Var2.j0();
                    z8 = l46Var2.S;
                    ov7Var = LayoutNode.h1;
                    if (z8) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, c92VarA2);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM4);
                    Integer numValueOf2 = Integer.valueOf(iHashCode4);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf2);
                    dec.k(l46Var2);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ4);
                    if (z7) {
                        l46Var2.f0(-286664993);
                        if (y72Var7 == null) {
                            y72Var9 = y72Var6;
                        } else {
                            y72Var9 = y72Var7;
                        }
                        if (y72Var9 == null) {
                            l46Var2.f0(960584795);
                            j2 = ((e8b) l46Var2.k(l8b.a)).r;
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(960583710);
                            l46Var2.r(false);
                            j2 = y72Var9.a;
                        }
                        xtd xtdVarA2 = xtd.a(z5c.r(l46Var2), j2, 65534);
                        mue mueVarA2 = mue.a(mueVarW, j2, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                        k00VarM = z5c.m(0, l46Var2, xtdVarA2);
                        qy1VarU = qk2.u(l46Var2);
                        if (y72Var6 != null) {
                            qy1VarU = qy1VarU.b(qy1VarU.a, qy1VarU.b, (4091 & 4) != 0 ? qy1VarU.c : y72Var6.a, qy1VarU.d, qy1VarU.e, qy1VarU.f, qy1VarU.g, qy1VarU.h, (4091 & 256) != 0 ? qy1VarU.i : 0L, qy1VarU.j, qy1VarU.k, qy1VarU.l);
                        }
                        t7c t7cVarA2 = s7c.a(new uc0(12.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var2, 54);
                        int iHashCode5 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM5 = l46Var2.m();
                        j09 j09VarJ5 = m93.J(l46Var2, g09Var);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, t7cVarA2);
                        dec.l(he2Var2, l46Var2, u8aVarM5);
                        ib8.s(iHashCode5, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ5);
                        if (z6) {
                            l46Var2.f0(1751895376);
                            j09 j09VarR2 = b21.R(b.o(g09Var, 48.0f, 48.0f, 0.0f, 12), z, false, new i5c(1), a26Var, 10);
                            zG = l46Var2.g(k00VarM);
                            objR = l46Var2.R();
                            i8cVar = sf2.a;
                            if (zG) {
                                objR = new p59(13, k00VarM);
                                l46Var2.p0(objR);
                            } else {
                                objR = new p59(13, k00VarM);
                                l46Var2.p0(objR);
                            }
                            j09 j09VarB2 = vwc.b(j09VarR2, false, (a26) objR);
                            xn8 xn8VarC2 = s21.c(ndb.f, false);
                            int iHashCode6 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM6 = l46Var2.m();
                            j09 j09VarJ6 = m93.J(l46Var2, j09VarB2);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var, l46Var2, xn8VarC2);
                            dec.l(he2Var2, l46Var2, u8aVarM6);
                            ib8.s(iHashCode6, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var4, l46Var2, j09VarJ6);
                            objR2 = l46Var2.R();
                            if (objR2 == i8cVar) {
                                objR2 = new xn9(27);
                                l46Var2.p0(objR2);
                            }
                            qy1 qy1Var3 = qy1VarU;
                            y72Var8 = y72Var6;
                            z10 = false;
                            qk2.i(z, vwc.a(g09Var, (a26) objR2), false, 0.0f, qy1Var3, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 12);
                            z11 = true;
                            l46Var2.r(true);
                            l46Var2.r(false);
                        } else {
                            qy1 qy1Var4 = qy1VarU;
                            z10 = false;
                            z11 = true;
                            y72Var8 = y72Var6;
                            l46Var2.f0(1752463792);
                            qk2.i(z, null, false, 0.0f, qy1Var4, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 14);
                            l46Var2.r(false);
                        }
                        nte.c(k00VarM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA2, l46Var, 0, 0, 262142);
                        l46Var2 = l46Var;
                        z9 = true;
                        l46Var2.r(true);
                        l46Var2.r(false);
                    } else {
                        y72Var8 = y72Var6;
                        z9 = true;
                        l46Var2.f0(-285288841);
                        l46Var2.r(false);
                    }
                    l46Var2.r(z9);
                    j09Var2 = j09Var3;
                    y72Var5 = y72Var7;
                    z5 = z6;
                    y72Var3 = y72Var8;
                } else {
                    l46Var2.Z();
                    y72Var5 = y72Var4;
                    z5 = z3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new pb0(j09Var2, z, a26Var, y72Var3, y72Var5, z5, i2, i3);
                }
            }
            i4 |= 24576;
            y72Var4 = y72Var2;
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    z3 = z2;
                    if (l46Var2.h(z3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = 0;
                if ((74899 & i4) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var2.W(i4 & 1, z4)) {
                    g09Var = g09.a;
                    if (i10 != 0) {
                        j09Var3 = g09Var;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        y72Var6 = null;
                    } else {
                        y72Var6 = y72Var3;
                    }
                    if (i5 != 0) {
                        y72Var7 = null;
                    } else {
                        y72Var7 = y72Var4;
                    }
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    ca2.a.getClass();
                    z7 = ca2.c;
                    mueVarW = jgb.W(l46Var2);
                    j09 j09VarN3 = mh3.N(j09Var3);
                    jx0Var = ndb.Z;
                    c92 c92VarA3 = a92.a(new uc0(8.0f, true, new qc0(i9)), jx0Var, l46Var2, 54);
                    int iHashCode7 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM7 = l46Var2.m();
                    j09 j09VarJ7 = m93.J(l46Var2, j09VarN3);
                    lf2.q.getClass();
                    l46Var2.j0();
                    z8 = l46Var2.S;
                    ov7Var = LayoutNode.h1;
                    if (z8) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, c92VarA3);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM7);
                    Integer numValueOf3 = Integer.valueOf(iHashCode7);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf3);
                    dec.k(l46Var2);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ7);
                    if (z7) {
                        l46Var2.f0(-286664993);
                        if (y72Var7 == null) {
                            y72Var9 = y72Var6;
                        } else {
                            y72Var9 = y72Var7;
                        }
                        if (y72Var9 == null) {
                            l46Var2.f0(960584795);
                            j2 = ((e8b) l46Var2.k(l8b.a)).r;
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(960583710);
                            l46Var2.r(false);
                            j2 = y72Var9.a;
                        }
                        xtd xtdVarA3 = xtd.a(z5c.r(l46Var2), j2, 65534);
                        mue mueVarA3 = mue.a(mueVarW, j2, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                        k00VarM = z5c.m(0, l46Var2, xtdVarA3);
                        qy1VarU = qk2.u(l46Var2);
                        if (y72Var6 != null) {
                            qy1VarU = qy1VarU.b(qy1VarU.a, qy1VarU.b, (4091 & 4) != 0 ? qy1VarU.c : y72Var6.a, qy1VarU.d, qy1VarU.e, qy1VarU.f, qy1VarU.g, qy1VarU.h, (4091 & 256) != 0 ? qy1VarU.i : 0L, qy1VarU.j, qy1VarU.k, qy1VarU.l);
                        }
                        t7c t7cVarA3 = s7c.a(new uc0(12.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var2, 54);
                        int iHashCode8 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM8 = l46Var2.m();
                        j09 j09VarJ8 = m93.J(l46Var2, g09Var);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, t7cVarA3);
                        dec.l(he2Var2, l46Var2, u8aVarM8);
                        ib8.s(iHashCode8, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ8);
                        if (z6) {
                            l46Var2.f0(1751895376);
                            j09 j09VarR3 = b21.R(b.o(g09Var, 48.0f, 48.0f, 0.0f, 12), z, false, new i5c(1), a26Var, 10);
                            zG = l46Var2.g(k00VarM);
                            objR = l46Var2.R();
                            i8cVar = sf2.a;
                            if (zG) {
                                objR = new p59(13, k00VarM);
                                l46Var2.p0(objR);
                            } else {
                                objR = new p59(13, k00VarM);
                                l46Var2.p0(objR);
                            }
                            j09 j09VarB3 = vwc.b(j09VarR3, false, (a26) objR);
                            xn8 xn8VarC3 = s21.c(ndb.f, false);
                            int iHashCode9 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM9 = l46Var2.m();
                            j09 j09VarJ9 = m93.J(l46Var2, j09VarB3);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var, l46Var2, xn8VarC3);
                            dec.l(he2Var2, l46Var2, u8aVarM9);
                            ib8.s(iHashCode9, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var4, l46Var2, j09VarJ9);
                            objR2 = l46Var2.R();
                            if (objR2 == i8cVar) {
                                objR2 = new xn9(27);
                                l46Var2.p0(objR2);
                            }
                            qy1 qy1Var5 = qy1VarU;
                            y72Var8 = y72Var6;
                            z10 = false;
                            qk2.i(z, vwc.a(g09Var, (a26) objR2), false, 0.0f, qy1Var5, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 12);
                            z11 = true;
                            l46Var2.r(true);
                            l46Var2.r(false);
                        } else {
                            qy1 qy1Var6 = qy1VarU;
                            z10 = false;
                            z11 = true;
                            y72Var8 = y72Var6;
                            l46Var2.f0(1752463792);
                            qk2.i(z, null, false, 0.0f, qy1Var6, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 14);
                            l46Var2.r(false);
                        }
                        nte.c(k00VarM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA3, l46Var, 0, 0, 262142);
                        l46Var2 = l46Var;
                        z9 = true;
                        l46Var2.r(true);
                        l46Var2.r(false);
                    } else {
                        y72Var8 = y72Var6;
                        z9 = true;
                        l46Var2.f0(-285288841);
                        l46Var2.r(false);
                    }
                    l46Var2.r(z9);
                    j09Var2 = j09Var3;
                    y72Var5 = y72Var7;
                    z5 = z6;
                    y72Var3 = y72Var8;
                } else {
                    l46Var2.Z();
                    y72Var5 = y72Var4;
                    z5 = z3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new pb0(j09Var2, z, a26Var, y72Var3, y72Var5, z5, i2, i3);
                }
            }
            i4 |= 196608;
            z3 = z2;
            i9 = 0;
            if ((74899 & i4) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var2.W(i4 & 1, z4)) {
                g09Var = g09.a;
                if (i10 != 0) {
                    j09Var3 = g09Var;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i11 != 0) {
                    y72Var6 = null;
                } else {
                    y72Var6 = y72Var3;
                }
                if (i5 != 0) {
                    y72Var7 = null;
                } else {
                    y72Var7 = y72Var4;
                }
                if (i7 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                ca2.a.getClass();
                z7 = ca2.c;
                mueVarW = jgb.W(l46Var2);
                j09 j09VarN4 = mh3.N(j09Var3);
                jx0Var = ndb.Z;
                c92 c92VarA4 = a92.a(new uc0(8.0f, true, new qc0(i9)), jx0Var, l46Var2, 54);
                int iHashCode10 = Long.hashCode(l46Var2.T);
                u8a u8aVarM10 = l46Var2.m();
                j09 j09VarJ10 = m93.J(l46Var2, j09VarN4);
                lf2.q.getClass();
                l46Var2.j0();
                z8 = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z8) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var2, c92VarA4);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM10);
                Integer numValueOf4 = Integer.valueOf(iHashCode10);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf4);
                dec.k(l46Var2);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ10);
                if (z7) {
                    l46Var2.f0(-286664993);
                    if (y72Var7 == null) {
                        y72Var9 = y72Var6;
                    } else {
                        y72Var9 = y72Var7;
                    }
                    if (y72Var9 == null) {
                        l46Var2.f0(960584795);
                        j2 = ((e8b) l46Var2.k(l8b.a)).r;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(960583710);
                        l46Var2.r(false);
                        j2 = y72Var9.a;
                    }
                    xtd xtdVarA4 = xtd.a(z5c.r(l46Var2), j2, 65534);
                    mue mueVarA4 = mue.a(mueVarW, j2, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                    k00VarM = z5c.m(0, l46Var2, xtdVarA4);
                    qy1VarU = qk2.u(l46Var2);
                    if (y72Var6 != null) {
                        qy1VarU = qy1VarU.b(qy1VarU.a, qy1VarU.b, (4091 & 4) != 0 ? qy1VarU.c : y72Var6.a, qy1VarU.d, qy1VarU.e, qy1VarU.f, qy1VarU.g, qy1VarU.h, (4091 & 256) != 0 ? qy1VarU.i : 0L, qy1VarU.j, qy1VarU.k, qy1VarU.l);
                    }
                    t7c t7cVarA4 = s7c.a(new uc0(12.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var2, 54);
                    int iHashCode11 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM11 = l46Var2.m();
                    j09 j09VarJ11 = m93.J(l46Var2, g09Var);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, t7cVarA4);
                    dec.l(he2Var2, l46Var2, u8aVarM11);
                    ib8.s(iHashCode11, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ11);
                    if (z6) {
                        l46Var2.f0(1751895376);
                        j09 j09VarR4 = b21.R(b.o(g09Var, 48.0f, 48.0f, 0.0f, 12), z, false, new i5c(1), a26Var, 10);
                        zG = l46Var2.g(k00VarM);
                        objR = l46Var2.R();
                        i8cVar = sf2.a;
                        if (zG) {
                            objR = new p59(13, k00VarM);
                            l46Var2.p0(objR);
                        } else {
                            objR = new p59(13, k00VarM);
                            l46Var2.p0(objR);
                        }
                        j09 j09VarB4 = vwc.b(j09VarR4, false, (a26) objR);
                        xn8 xn8VarC4 = s21.c(ndb.f, false);
                        int iHashCode12 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM12 = l46Var2.m();
                        j09 j09VarJ12 = m93.J(l46Var2, j09VarB4);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, xn8VarC4);
                        dec.l(he2Var2, l46Var2, u8aVarM12);
                        ib8.s(iHashCode12, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ12);
                        objR2 = l46Var2.R();
                        if (objR2 == i8cVar) {
                            objR2 = new xn9(27);
                            l46Var2.p0(objR2);
                        }
                        qy1 qy1Var7 = qy1VarU;
                        y72Var8 = y72Var6;
                        z10 = false;
                        qk2.i(z, vwc.a(g09Var, (a26) objR2), false, 0.0f, qy1Var7, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 12);
                        z11 = true;
                        l46Var2.r(true);
                        l46Var2.r(false);
                    } else {
                        qy1 qy1Var8 = qy1VarU;
                        z10 = false;
                        z11 = true;
                        y72Var8 = y72Var6;
                        l46Var2.f0(1752463792);
                        qk2.i(z, null, false, 0.0f, qy1Var8, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 14);
                        l46Var2.r(false);
                    }
                    nte.c(k00VarM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA4, l46Var, 0, 0, 262142);
                    l46Var2 = l46Var;
                    z9 = true;
                    l46Var2.r(true);
                    l46Var2.r(false);
                } else {
                    y72Var8 = y72Var6;
                    z9 = true;
                    l46Var2.f0(-285288841);
                    l46Var2.r(false);
                }
                l46Var2.r(z9);
                j09Var2 = j09Var3;
                y72Var5 = y72Var7;
                z5 = z6;
                y72Var3 = y72Var8;
            } else {
                l46Var2.Z();
                y72Var5 = y72Var4;
                z5 = z3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new pb0(j09Var2, z, a26Var, y72Var3, y72Var5, z5, i2, i3);
            }
        }
        i4 |= 3072;
        y72Var3 = y72Var;
        i5 = i3 & 16;
        if (i5 != 0) {
            if ((i2 & 24576) == 0) {
                y72Var4 = y72Var2;
                if (l46Var2.g(y72Var4)) {
                    i6 = 16384;
                } else {
                    i6 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i6;
            }
            i7 = i3 & 32;
            if (i7 != 0) {
                if ((196608 & i2) == 0) {
                    z3 = z2;
                    if (l46Var2.h(z3)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i4 |= i8;
                }
                i9 = 0;
                if ((74899 & i4) != 74898) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (l46Var2.W(i4 & 1, z4)) {
                    g09Var = g09.a;
                    if (i10 != 0) {
                        j09Var3 = g09Var;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        y72Var6 = null;
                    } else {
                        y72Var6 = y72Var3;
                    }
                    if (i5 != 0) {
                        y72Var7 = null;
                    } else {
                        y72Var7 = y72Var4;
                    }
                    if (i7 != 0) {
                        z6 = false;
                    } else {
                        z6 = z3;
                    }
                    ca2.a.getClass();
                    z7 = ca2.c;
                    mueVarW = jgb.W(l46Var2);
                    j09 j09VarN5 = mh3.N(j09Var3);
                    jx0Var = ndb.Z;
                    c92 c92VarA5 = a92.a(new uc0(8.0f, true, new qc0(i9)), jx0Var, l46Var2, 54);
                    int iHashCode13 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM13 = l46Var2.m();
                    j09 j09VarJ13 = m93.J(l46Var2, j09VarN5);
                    lf2.q.getClass();
                    l46Var2.j0();
                    z8 = l46Var2.S;
                    ov7Var = LayoutNode.h1;
                    if (z8) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, c92VarA5);
                    he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM13);
                    Integer numValueOf5 = Integer.valueOf(iHashCode13);
                    he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf5);
                    dec.k(l46Var2);
                    he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ13);
                    if (z7) {
                        l46Var2.f0(-286664993);
                        if (y72Var7 == null) {
                            y72Var9 = y72Var6;
                        } else {
                            y72Var9 = y72Var7;
                        }
                        if (y72Var9 == null) {
                            l46Var2.f0(960584795);
                            j2 = ((e8b) l46Var2.k(l8b.a)).r;
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(960583710);
                            l46Var2.r(false);
                            j2 = y72Var9.a;
                        }
                        xtd xtdVarA5 = xtd.a(z5c.r(l46Var2), j2, 65534);
                        mue mueVarA5 = mue.a(mueVarW, j2, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                        k00VarM = z5c.m(0, l46Var2, xtdVarA5);
                        qy1VarU = qk2.u(l46Var2);
                        if (y72Var6 != null) {
                            qy1VarU = qy1VarU.b(qy1VarU.a, qy1VarU.b, (4091 & 4) != 0 ? qy1VarU.c : y72Var6.a, qy1VarU.d, qy1VarU.e, qy1VarU.f, qy1VarU.g, qy1VarU.h, (4091 & 256) != 0 ? qy1VarU.i : 0L, qy1VarU.j, qy1VarU.k, qy1VarU.l);
                        }
                        t7c t7cVarA5 = s7c.a(new uc0(12.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var2, 54);
                        int iHashCode14 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM14 = l46Var2.m();
                        j09 j09VarJ14 = m93.J(l46Var2, g09Var);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, t7cVarA5);
                        dec.l(he2Var2, l46Var2, u8aVarM14);
                        ib8.s(iHashCode14, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ14);
                        if (z6) {
                            l46Var2.f0(1751895376);
                            j09 j09VarR5 = b21.R(b.o(g09Var, 48.0f, 48.0f, 0.0f, 12), z, false, new i5c(1), a26Var, 10);
                            zG = l46Var2.g(k00VarM);
                            objR = l46Var2.R();
                            i8cVar = sf2.a;
                            if (zG) {
                                objR = new p59(13, k00VarM);
                                l46Var2.p0(objR);
                            } else {
                                objR = new p59(13, k00VarM);
                                l46Var2.p0(objR);
                            }
                            j09 j09VarB5 = vwc.b(j09VarR5, false, (a26) objR);
                            xn8 xn8VarC5 = s21.c(ndb.f, false);
                            int iHashCode15 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM15 = l46Var2.m();
                            j09 j09VarJ15 = m93.J(l46Var2, j09VarB5);
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(ov7Var);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(he2Var, l46Var2, xn8VarC5);
                            dec.l(he2Var2, l46Var2, u8aVarM15);
                            ib8.s(iHashCode15, l46Var2, he2Var3, l46Var2);
                            dec.l(he2Var4, l46Var2, j09VarJ15);
                            objR2 = l46Var2.R();
                            if (objR2 == i8cVar) {
                                objR2 = new xn9(27);
                                l46Var2.p0(objR2);
                            }
                            qy1 qy1Var9 = qy1VarU;
                            y72Var8 = y72Var6;
                            z10 = false;
                            qk2.i(z, vwc.a(g09Var, (a26) objR2), false, 0.0f, qy1Var9, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 12);
                            z11 = true;
                            l46Var2.r(true);
                            l46Var2.r(false);
                        } else {
                            qy1 qy1Var10 = qy1VarU;
                            z10 = false;
                            z11 = true;
                            y72Var8 = y72Var6;
                            l46Var2.f0(1752463792);
                            qk2.i(z, null, false, 0.0f, qy1Var10, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 14);
                            l46Var2.r(false);
                        }
                        nte.c(k00VarM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA5, l46Var, 0, 0, 262142);
                        l46Var2 = l46Var;
                        z9 = true;
                        l46Var2.r(true);
                        l46Var2.r(false);
                    } else {
                        y72Var8 = y72Var6;
                        z9 = true;
                        l46Var2.f0(-285288841);
                        l46Var2.r(false);
                    }
                    l46Var2.r(z9);
                    j09Var2 = j09Var3;
                    y72Var5 = y72Var7;
                    z5 = z6;
                    y72Var3 = y72Var8;
                } else {
                    l46Var2.Z();
                    y72Var5 = y72Var4;
                    z5 = z3;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new pb0(j09Var2, z, a26Var, y72Var3, y72Var5, z5, i2, i3);
                }
            }
            i4 |= 196608;
            z3 = z2;
            i9 = 0;
            if ((74899 & i4) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var2.W(i4 & 1, z4)) {
                g09Var = g09.a;
                if (i10 != 0) {
                    j09Var3 = g09Var;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i11 != 0) {
                    y72Var6 = null;
                } else {
                    y72Var6 = y72Var3;
                }
                if (i5 != 0) {
                    y72Var7 = null;
                } else {
                    y72Var7 = y72Var4;
                }
                if (i7 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                ca2.a.getClass();
                z7 = ca2.c;
                mueVarW = jgb.W(l46Var2);
                j09 j09VarN6 = mh3.N(j09Var3);
                jx0Var = ndb.Z;
                c92 c92VarA6 = a92.a(new uc0(8.0f, true, new qc0(i9)), jx0Var, l46Var2, 54);
                int iHashCode16 = Long.hashCode(l46Var2.T);
                u8a u8aVarM16 = l46Var2.m();
                j09 j09VarJ16 = m93.J(l46Var2, j09VarN6);
                lf2.q.getClass();
                l46Var2.j0();
                z8 = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z8) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var2, c92VarA6);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM16);
                Integer numValueOf6 = Integer.valueOf(iHashCode16);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf6);
                dec.k(l46Var2);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ16);
                if (z7) {
                    l46Var2.f0(-286664993);
                    if (y72Var7 == null) {
                        y72Var9 = y72Var6;
                    } else {
                        y72Var9 = y72Var7;
                    }
                    if (y72Var9 == null) {
                        l46Var2.f0(960584795);
                        j2 = ((e8b) l46Var2.k(l8b.a)).r;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(960583710);
                        l46Var2.r(false);
                        j2 = y72Var9.a;
                    }
                    xtd xtdVarA6 = xtd.a(z5c.r(l46Var2), j2, 65534);
                    mue mueVarA6 = mue.a(mueVarW, j2, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                    k00VarM = z5c.m(0, l46Var2, xtdVarA6);
                    qy1VarU = qk2.u(l46Var2);
                    if (y72Var6 != null) {
                        qy1VarU = qy1VarU.b(qy1VarU.a, qy1VarU.b, (4091 & 4) != 0 ? qy1VarU.c : y72Var6.a, qy1VarU.d, qy1VarU.e, qy1VarU.f, qy1VarU.g, qy1VarU.h, (4091 & 256) != 0 ? qy1VarU.i : 0L, qy1VarU.j, qy1VarU.k, qy1VarU.l);
                    }
                    t7c t7cVarA6 = s7c.a(new uc0(12.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var2, 54);
                    int iHashCode17 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM17 = l46Var2.m();
                    j09 j09VarJ17 = m93.J(l46Var2, g09Var);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, t7cVarA6);
                    dec.l(he2Var2, l46Var2, u8aVarM17);
                    ib8.s(iHashCode17, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ17);
                    if (z6) {
                        l46Var2.f0(1751895376);
                        j09 j09VarR6 = b21.R(b.o(g09Var, 48.0f, 48.0f, 0.0f, 12), z, false, new i5c(1), a26Var, 10);
                        zG = l46Var2.g(k00VarM);
                        objR = l46Var2.R();
                        i8cVar = sf2.a;
                        if (zG) {
                            objR = new p59(13, k00VarM);
                            l46Var2.p0(objR);
                        } else {
                            objR = new p59(13, k00VarM);
                            l46Var2.p0(objR);
                        }
                        j09 j09VarB6 = vwc.b(j09VarR6, false, (a26) objR);
                        xn8 xn8VarC6 = s21.c(ndb.f, false);
                        int iHashCode18 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM18 = l46Var2.m();
                        j09 j09VarJ18 = m93.J(l46Var2, j09VarB6);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, xn8VarC6);
                        dec.l(he2Var2, l46Var2, u8aVarM18);
                        ib8.s(iHashCode18, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ18);
                        objR2 = l46Var2.R();
                        if (objR2 == i8cVar) {
                            objR2 = new xn9(27);
                            l46Var2.p0(objR2);
                        }
                        qy1 qy1Var11 = qy1VarU;
                        y72Var8 = y72Var6;
                        z10 = false;
                        qk2.i(z, vwc.a(g09Var, (a26) objR2), false, 0.0f, qy1Var11, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 12);
                        z11 = true;
                        l46Var2.r(true);
                        l46Var2.r(false);
                    } else {
                        qy1 qy1Var12 = qy1VarU;
                        z10 = false;
                        z11 = true;
                        y72Var8 = y72Var6;
                        l46Var2.f0(1752463792);
                        qk2.i(z, null, false, 0.0f, qy1Var12, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 14);
                        l46Var2.r(false);
                    }
                    nte.c(k00VarM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA6, l46Var, 0, 0, 262142);
                    l46Var2 = l46Var;
                    z9 = true;
                    l46Var2.r(true);
                    l46Var2.r(false);
                } else {
                    y72Var8 = y72Var6;
                    z9 = true;
                    l46Var2.f0(-285288841);
                    l46Var2.r(false);
                }
                l46Var2.r(z9);
                j09Var2 = j09Var3;
                y72Var5 = y72Var7;
                z5 = z6;
                y72Var3 = y72Var8;
            } else {
                l46Var2.Z();
                y72Var5 = y72Var4;
                z5 = z3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new pb0(j09Var2, z, a26Var, y72Var3, y72Var5, z5, i2, i3);
            }
        }
        i4 |= 24576;
        y72Var4 = y72Var2;
        i7 = i3 & 32;
        if (i7 != 0) {
            if ((196608 & i2) == 0) {
                z3 = z2;
                if (l46Var2.h(z3)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i4 |= i8;
            }
            i9 = 0;
            if ((74899 & i4) != 74898) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var2.W(i4 & 1, z4)) {
                g09Var = g09.a;
                if (i10 != 0) {
                    j09Var3 = g09Var;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i11 != 0) {
                    y72Var6 = null;
                } else {
                    y72Var6 = y72Var3;
                }
                if (i5 != 0) {
                    y72Var7 = null;
                } else {
                    y72Var7 = y72Var4;
                }
                if (i7 != 0) {
                    z6 = false;
                } else {
                    z6 = z3;
                }
                ca2.a.getClass();
                z7 = ca2.c;
                mueVarW = jgb.W(l46Var2);
                j09 j09VarN7 = mh3.N(j09Var3);
                jx0Var = ndb.Z;
                c92 c92VarA7 = a92.a(new uc0(8.0f, true, new qc0(i9)), jx0Var, l46Var2, 54);
                int iHashCode19 = Long.hashCode(l46Var2.T);
                u8a u8aVarM19 = l46Var2.m();
                j09 j09VarJ19 = m93.J(l46Var2, j09VarN7);
                lf2.q.getClass();
                l46Var2.j0();
                z8 = l46Var2.S;
                ov7Var = LayoutNode.h1;
                if (z8) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                he2Var = hj6.z;
                dec.l(he2Var, l46Var2, c92VarA7);
                he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var2, u8aVarM19);
                Integer numValueOf7 = Integer.valueOf(iHashCode19);
                he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var2, numValueOf7);
                dec.k(l46Var2);
                he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var2, j09VarJ19);
                if (z7) {
                    l46Var2.f0(-286664993);
                    if (y72Var7 == null) {
                        y72Var9 = y72Var6;
                    } else {
                        y72Var9 = y72Var7;
                    }
                    if (y72Var9 == null) {
                        l46Var2.f0(960584795);
                        j2 = ((e8b) l46Var2.k(l8b.a)).r;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(960583710);
                        l46Var2.r(false);
                        j2 = y72Var9.a;
                    }
                    xtd xtdVarA7 = xtd.a(z5c.r(l46Var2), j2, 65534);
                    mue mueVarA7 = mue.a(mueVarW, j2, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                    k00VarM = z5c.m(0, l46Var2, xtdVarA7);
                    qy1VarU = qk2.u(l46Var2);
                    if (y72Var6 != null) {
                        qy1VarU = qy1VarU.b(qy1VarU.a, qy1VarU.b, (4091 & 4) != 0 ? qy1VarU.c : y72Var6.a, qy1VarU.d, qy1VarU.e, qy1VarU.f, qy1VarU.g, qy1VarU.h, (4091 & 256) != 0 ? qy1VarU.i : 0L, qy1VarU.j, qy1VarU.k, qy1VarU.l);
                    }
                    t7c t7cVarA7 = s7c.a(new uc0(12.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var2, 54);
                    int iHashCode110 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM110 = l46Var2.m();
                    j09 j09VarJ110 = m93.J(l46Var2, g09Var);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, t7cVarA7);
                    dec.l(he2Var2, l46Var2, u8aVarM110);
                    ib8.s(iHashCode110, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ110);
                    if (z6) {
                        l46Var2.f0(1751895376);
                        j09 j09VarR7 = b21.R(b.o(g09Var, 48.0f, 48.0f, 0.0f, 12), z, false, new i5c(1), a26Var, 10);
                        zG = l46Var2.g(k00VarM);
                        objR = l46Var2.R();
                        i8cVar = sf2.a;
                        if (zG) {
                            objR = new p59(13, k00VarM);
                            l46Var2.p0(objR);
                        } else {
                            objR = new p59(13, k00VarM);
                            l46Var2.p0(objR);
                        }
                        j09 j09VarB7 = vwc.b(j09VarR7, false, (a26) objR);
                        xn8 xn8VarC7 = s21.c(ndb.f, false);
                        int iHashCode111 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM111 = l46Var2.m();
                        j09 j09VarJ111 = m93.J(l46Var2, j09VarB7);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, xn8VarC7);
                        dec.l(he2Var2, l46Var2, u8aVarM111);
                        ib8.s(iHashCode111, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ111);
                        objR2 = l46Var2.R();
                        if (objR2 == i8cVar) {
                            objR2 = new xn9(27);
                            l46Var2.p0(objR2);
                        }
                        qy1 qy1Var13 = qy1VarU;
                        y72Var8 = y72Var6;
                        z10 = false;
                        qk2.i(z, vwc.a(g09Var, (a26) objR2), false, 0.0f, qy1Var13, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 12);
                        z11 = true;
                        l46Var2.r(true);
                        l46Var2.r(false);
                    } else {
                        qy1 qy1Var14 = qy1VarU;
                        z10 = false;
                        z11 = true;
                        y72Var8 = y72Var6;
                        l46Var2.f0(1752463792);
                        qk2.i(z, null, false, 0.0f, qy1Var14, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 14);
                        l46Var2.r(false);
                    }
                    nte.c(k00VarM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA7, l46Var, 0, 0, 262142);
                    l46Var2 = l46Var;
                    z9 = true;
                    l46Var2.r(true);
                    l46Var2.r(false);
                } else {
                    y72Var8 = y72Var6;
                    z9 = true;
                    l46Var2.f0(-285288841);
                    l46Var2.r(false);
                }
                l46Var2.r(z9);
                j09Var2 = j09Var3;
                y72Var5 = y72Var7;
                z5 = z6;
                y72Var3 = y72Var8;
            } else {
                l46Var2.Z();
                y72Var5 = y72Var4;
                z5 = z3;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new pb0(j09Var2, z, a26Var, y72Var3, y72Var5, z5, i2, i3);
            }
        }
        i4 |= 196608;
        z3 = z2;
        i9 = 0;
        if ((74899 & i4) != 74898) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var2.W(i4 & 1, z4)) {
            g09Var = g09.a;
            if (i10 != 0) {
                j09Var3 = g09Var;
            } else {
                j09Var3 = j09Var2;
            }
            if (i11 != 0) {
                y72Var6 = null;
            } else {
                y72Var6 = y72Var3;
            }
            if (i5 != 0) {
                y72Var7 = null;
            } else {
                y72Var7 = y72Var4;
            }
            if (i7 != 0) {
                z6 = false;
            } else {
                z6 = z3;
            }
            ca2.a.getClass();
            z7 = ca2.c;
            mueVarW = jgb.W(l46Var2);
            j09 j09VarN8 = mh3.N(j09Var3);
            jx0Var = ndb.Z;
            c92 c92VarA8 = a92.a(new uc0(8.0f, true, new qc0(i9)), jx0Var, l46Var2, 54);
            int iHashCode112 = Long.hashCode(l46Var2.T);
            u8a u8aVarM112 = l46Var2.m();
            j09 j09VarJ112 = m93.J(l46Var2, j09VarN8);
            lf2.q.getClass();
            l46Var2.j0();
            z8 = l46Var2.S;
            ov7Var = LayoutNode.h1;
            if (z8) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA8);
            he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM112);
            Integer numValueOf8 = Integer.valueOf(iHashCode112);
            he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf8);
            dec.k(l46Var2);
            he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ112);
            if (z7) {
                l46Var2.f0(-286664993);
                if (y72Var7 == null) {
                    y72Var9 = y72Var6;
                } else {
                    y72Var9 = y72Var7;
                }
                if (y72Var9 == null) {
                    l46Var2.f0(960584795);
                    j2 = ((e8b) l46Var2.k(l8b.a)).r;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(960583710);
                    l46Var2.r(false);
                    j2 = y72Var9.a;
                }
                xtd xtdVarA8 = xtd.a(z5c.r(l46Var2), j2, 65534);
                mue mueVarA8 = mue.a(mueVarW, j2, 0L, null, null, 0L, null, 0, 0L, null, null, 16777214);
                k00VarM = z5c.m(0, l46Var2, xtdVarA8);
                qy1VarU = qk2.u(l46Var2);
                if (y72Var6 != null) {
                    qy1VarU = qy1VarU.b(qy1VarU.a, qy1VarU.b, (4091 & 4) != 0 ? qy1VarU.c : y72Var6.a, qy1VarU.d, qy1VarU.e, qy1VarU.f, qy1VarU.g, qy1VarU.h, (4091 & 256) != 0 ? qy1VarU.i : 0L, qy1VarU.j, qy1VarU.k, qy1VarU.l);
                }
                t7c t7cVarA8 = s7c.a(new uc0(12.0f, true, new jv2(3, jx0Var)), ndb.z, l46Var2, 54);
                int iHashCode113 = Long.hashCode(l46Var2.T);
                u8a u8aVarM113 = l46Var2.m();
                j09 j09VarJ113 = m93.J(l46Var2, g09Var);
                l46Var2.j0();
                if (l46Var2.S) {
                    l46Var2.l(ov7Var);
                } else {
                    l46Var2.s0();
                }
                dec.l(he2Var, l46Var2, t7cVarA8);
                dec.l(he2Var2, l46Var2, u8aVarM113);
                ib8.s(iHashCode113, l46Var2, he2Var3, l46Var2);
                dec.l(he2Var4, l46Var2, j09VarJ113);
                if (z6) {
                    l46Var2.f0(1751895376);
                    j09 j09VarR8 = b21.R(b.o(g09Var, 48.0f, 48.0f, 0.0f, 12), z, false, new i5c(1), a26Var, 10);
                    zG = l46Var2.g(k00VarM);
                    objR = l46Var2.R();
                    i8cVar = sf2.a;
                    if (zG) {
                        objR = new p59(13, k00VarM);
                        l46Var2.p0(objR);
                    } else {
                        objR = new p59(13, k00VarM);
                        l46Var2.p0(objR);
                    }
                    j09 j09VarB8 = vwc.b(j09VarR8, false, (a26) objR);
                    xn8 xn8VarC8 = s21.c(ndb.f, false);
                    int iHashCode114 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM114 = l46Var2.m();
                    j09 j09VarJ114 = m93.J(l46Var2, j09VarB8);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, xn8VarC8);
                    dec.l(he2Var2, l46Var2, u8aVarM114);
                    ib8.s(iHashCode114, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ114);
                    objR2 = l46Var2.R();
                    if (objR2 == i8cVar) {
                        objR2 = new xn9(27);
                        l46Var2.p0(objR2);
                    }
                    qy1 qy1Var15 = qy1VarU;
                    y72Var8 = y72Var6;
                    z10 = false;
                    qk2.i(z, vwc.a(g09Var, (a26) objR2), false, 0.0f, qy1Var15, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 12);
                    z11 = true;
                    l46Var2.r(true);
                    l46Var2.r(false);
                } else {
                    qy1 qy1Var16 = qy1VarU;
                    z10 = false;
                    z11 = true;
                    y72Var8 = y72Var6;
                    l46Var2.f0(1752463792);
                    qk2.i(z, null, false, 0.0f, qy1Var16, a26Var, l46Var2, ((i4 >> 3) & 14) | ((i4 << 9) & 458752), 14);
                    l46Var2.r(false);
                }
                nte.c(k00VarM, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, mueVarA8, l46Var, 0, 0, 262142);
                l46Var2 = l46Var;
                z9 = true;
                l46Var2.r(true);
                l46Var2.r(false);
            } else {
                y72Var8 = y72Var6;
                z9 = true;
                l46Var2.f0(-285288841);
                l46Var2.r(false);
            }
            l46Var2.r(z9);
            j09Var2 = j09Var3;
            y72Var5 = y72Var7;
            z5 = z6;
            y72Var3 = y72Var8;
        } else {
            l46Var2.Z();
            y72Var5 = y72Var4;
            z5 = z3;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb0(j09Var2, z, a26Var, y72Var3, y72Var5, z5, i2, i3);
        }
    }

    public static Handler s0() {
        if (k == null) {
            synchronized (i) {
                try {
                    if (k == null) {
                        k = new Handler(Looper.getMainLooper());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return k;
    }

    public static final void t(int i2, dd2 dd2Var, l46 l46Var, boolean z) {
        l46Var.h0(822640010);
        int i3 = i2 | (l46Var.h(z) ? 4 : 2);
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = q1c.f(Float.valueOf(1.0f));
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            h0e h0eVarB = vx.b(z ? ((Number) e89Var.getValue()).floatValue() : 1.0f, null, "zoomScale", null, l46Var, 3072, 22);
            boolean zG = l46Var.g(h0eVarB) | ((i3 & 14) == 4);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new q38(z, e89Var, h0eVarB);
                l46Var.p0(objR2);
            }
            xn8 xn8Var = (xn8) objR2;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            tec.q(6, dd2Var, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new d00(z, dd2Var, i2, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object u(fhc fhcVar, float f2, wz wzVar, ph3 ph3Var, a26 a26Var, zn2 zn2Var) {
        crd crdVar;
        float f3;
        jmb jmbVar;
        if (zn2Var instanceof crd) {
            crdVar = (crd) zn2Var;
            int i2 = crdVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                crdVar.label = i2 - Integer.MIN_VALUE;
            } else {
                crdVar = new crd(zn2Var);
            }
        } else {
            crdVar = new crd(zn2Var);
        }
        Object obj = crdVar.result;
        int i3 = crdVar.label;
        if (i3 == 0) {
            jzb.q(obj);
            jmb jmbVar2 = new jmb();
            boolean z = ((Number) wzVar.c()).floatValue() == 0.0f;
            brd brdVar = new brd(f2, jmbVar2, fhcVar, a26Var, 0);
            crdVar.L$0 = wzVar;
            crdVar.L$1 = jmbVar2;
            crdVar.F$0 = f2;
            crdVar.label = 1;
            Object objT = hkg.T(wzVar, ph3Var, !z, brdVar, crdVar);
            bw2 bw2Var = bw2.a;
            if (objT == bw2Var) {
                return bw2Var;
            }
            f3 = f2;
            jmbVar = jmbVar2;
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f3 = crdVar.F$0;
            jmbVar = (jmb) crdVar.L$1;
            wzVar = (wz) crdVar.L$0;
            jzb.q(obj);
        }
        return new sz(new Float(f3 - jmbVar.element), wzVar);
    }

    public static final void v(uz uzVar, fhc fhcVar, a26 a26Var, float f2) {
        float fA;
        try {
            fA = fhcVar.a(f2);
        } catch (CancellationException unused) {
            uzVar.a();
            fA = 0.0f;
        }
        a26Var.d(Float.valueOf(fA));
        if (Math.abs(f2 - fA) > 0.5f) {
            uzVar.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object w(fhc fhcVar, float f2, float f3, wz wzVar, vz vzVar, a26 a26Var, zn2 zn2Var) {
        drd drdVar;
        float fFloatValue;
        wz wzVar2;
        jmb jmbVar;
        float f4 = f2;
        if (zn2Var instanceof drd) {
            drdVar = (drd) zn2Var;
            int i2 = drdVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                drdVar.label = i2 - Integer.MIN_VALUE;
            } else {
                drdVar = new drd(zn2Var);
            }
        } else {
            drdVar = new drd(zn2Var);
        }
        drd drdVar2 = drdVar;
        Object obj = drdVar2.result;
        int i3 = drdVar2.label;
        if (i3 == 0) {
            jzb.q(obj);
            jmb jmbVar2 = new jmb();
            fFloatValue = ((Number) wzVar.c()).floatValue();
            Float f5 = new Float(f4);
            boolean z = ((Number) wzVar.c()).floatValue() == 0.0f;
            brd brdVar = new brd(f3, jmbVar2, fhcVar, a26Var, 1);
            drdVar2.L$0 = wzVar;
            drdVar2.L$1 = jmbVar2;
            drdVar2.F$0 = f4;
            drdVar2.F$1 = fFloatValue;
            drdVar2.label = 1;
            Object objU = hkg.U(wzVar, f5, vzVar, !z, brdVar, drdVar2);
            bw2 bw2Var = bw2.a;
            if (objU == bw2Var) {
                return bw2Var;
            }
            wzVar2 = wzVar;
            jmbVar = jmbVar2;
        } else {
            if (i3 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f6 = drdVar2.F$1;
            float f7 = drdVar2.F$0;
            jmbVar = (jmb) drdVar2.L$1;
            wzVar2 = (wz) drdVar2.L$0;
            jzb.q(obj);
            fFloatValue = f6;
            f4 = f7;
        }
        return new sz(new Float(f4 - jmbVar.element), g21.D(wzVar2, 0.0f, E(((Number) wzVar2.c()).floatValue(), fFloatValue), 29));
    }

    public static final pu3 x(aw2 aw2Var, pv2 pv2Var, dw2 dw2Var, l26 l26Var) {
        pv2 pv2VarB = y7h.B(aw2Var, pv2Var);
        dw2Var.getClass();
        pu3 ow7Var = dw2Var == dw2.b ? new ow7(pv2VarB, l26Var) : new pu3(pv2VarB, true);
        ow7Var.k0(dw2Var, ow7Var, l26Var);
        return ow7Var;
    }

    public static pu3 y(aw2 aw2Var, pv2 pv2Var, l26 l26Var, int i2) {
        if ((i2 & 1) != 0) {
            pv2Var = nu4.a;
        }
        return x(aw2Var, pv2Var, (i2 & 2) != 0 ? dw2.a : dw2.d, l26Var);
    }

    public static final Object z(Context context, ii1 ii1Var) {
        m48 m48Var;
        m88 m88VarJ;
        int i2;
        dva dvaVar = dva.b;
        di2 di2Var = dva.b.a;
        synchronized (di2Var.a) {
            Object obj = sn2.a;
            int i3 = 0;
            int iP = Build.VERSION.SDK_INT >= 34 ? hgc.p(context) : 0;
            LinkedHashMap linkedHashMap = k48.a;
            synchronized (linkedHashMap) {
                try {
                    Integer numValueOf = Integer.valueOf(iP);
                    Object m48Var2 = linkedHashMap.get(numValueOf);
                    if (m48Var2 == null) {
                        m48Var2 = new m48();
                        linkedHashMap.put(numValueOf, m48Var2);
                    }
                    m48Var = (m48) m48Var2;
                } catch (Throwable th) {
                    throw th;
                }
            }
            di2Var.e = m48Var;
            m88VarJ = (t36) di2Var.b;
            i2 = 21;
            if (m88VarJ == null) {
                rk1 rk1Var = new rk1(context, null);
                m88 m88Var = (m88) di2Var.c;
                tv1 tv1VarD0 = bm8.d0(bm8.d0(m88Var instanceof t36 ? (t36) m88Var : new t36(m88Var), new r45(9, new za6(22, rk1Var)), g94.a()), new vd9(i2, new r45(10, new it3((Object) di2Var, (Object) rk1Var, context, 19))), g94.a());
                di2Var.b = tv1VarD0;
                tv1VarD0.b(new w36(i3, tv1VarD0, new kd9(17, di2Var)), g94.a());
                m88VarJ = bm8.J(tv1VarD0);
            }
        }
        return vfh.n(bm8.d0(m88VarJ, new vd9(i2, new cva(new zea(12))), g94.a()), ii1Var);
    }
}
