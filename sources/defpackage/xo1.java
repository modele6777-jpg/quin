package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.media.ExifInterface;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import android.view.PixelCopy;
import android.view.View;
import android.view.Window;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import androidx.core.content.FileProvider;
import com.adjust.sdk.network.ErrorCodes;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import io.sentry.config.a;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.UnknownHostException;
import java.nio.ByteBuffer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xo1 {
    public static final zv a = new zv(4);
    public static final dd2 b = new dd2(new a7(29), false, -57662445);
    public static final dd2 c = new dd2(new yd2(13), false, -1721049434);
    public static final dd2 d = new dd2(new ed2(14), false, 1153875613);
    public static final Object e = new Object();
    public static final z4c f = new z4c();
    public static final y6f g = new y6f(new k8f(24), new ksf(11));
    public static final y6f h = new y6f(new k8f(25), new k8f(26));
    public static final y6f i = new y6f(new k8f(27), new k8f(28));
    public static final y6f j = new y6f(new k8f(29), new ksf(0));
    public static final y6f k = new y6f(new ksf(1), new ksf(2));
    public static final y6f l = new y6f(new ksf(3), new ksf(4));
    public static final y6f m = new y6f(new ksf(5), new ksf(6));
    public static final y6f n = new y6f(new ksf(7), new ksf(8));
    public static final y6f o = new y6f(new ksf(9), new ksf(10));

    public static final int A(qx9 qx9Var) {
        return (int) (qx9Var.e == ks9.a ? qx9Var.i() & 4294967295L : qx9Var.i() >> 32);
    }

    public static final Uri B(File file) {
        file.getClass();
        Uri uriC = FileProvider.c(cn1.z(), cn1.z().getPackageName() + ".contentprovider", file);
        uriC.getClass();
        return uriC;
    }

    public static final boolean C(Throwable th) {
        if (!(th instanceof yyc)) {
            Throwable cause = th.getCause();
            if (cause == null) {
                return false;
            }
            if (cause == th) {
                cause = null;
            }
            if (cause == null || !C(cause)) {
                return false;
            }
        }
        return true;
    }

    public static void D(String str, String str2) {
        synchronized (e) {
            Log.i(str, h(str2, null));
        }
    }

    public static final boolean E(oia oiaVar, long j2, long j3) {
        int i2 = oiaVar.i == 1 ? 1 : 0;
        long j4 = oiaVar.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j4 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j4 & 4294967295L));
        float f2 = i2;
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j3 >> 32)) * f2;
        float f3 = ((int) (j2 >> 32)) + fIntBitsToFloat3;
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j3 & 4294967295L)) * f2;
        return (fIntBitsToFloat > f3) | (fIntBitsToFloat < (-fIntBitsToFloat3)) | (fIntBitsToFloat2 < (-fIntBitsToFloat4)) | (fIntBitsToFloat2 > ((int) (j2 & 4294967295L)) + fIntBitsToFloat4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean F(Activity activity, boolean z, boolean z2) {
        g48 g48Var;
        h48 h48VarK;
        activity.getClass();
        x48 x48Var = activity instanceof x48 ? (x48) activity : null;
        if (x48Var == null || (h48VarK = x48Var.k()) == null || (g48Var = ((a58) h48VarK).i) == null) {
            g48Var = g48.a;
        }
        return g48Var.compareTo(g48.e) >= 0 && !activity.isFinishing() && !activity.isDestroyed() && z && z2 && activity.getWindow().getDecorView().getWidth() > 0 && activity.getWindow().getDecorView().getHeight() > 0;
    }

    public static final int G(ax7 ax7Var, ks9 ks9Var) {
        return (int) (ks9Var == ks9.a ? ax7Var.w & 4294967295L : ax7Var.w >> 32);
    }

    public static final long H(oia oiaVar, boolean z) {
        long jF = hl9.f(oiaVar.c, oiaVar.g);
        if (z || !oiaVar.c()) {
            return jF;
        }
        return 0L;
    }

    public static final uvf I(LayoutNode layoutNode) {
        uvf uvfVar = layoutNode.E0;
        if (uvfVar != null) {
            return uvfVar;
        }
        throw kv2.d("Required value was null.");
    }

    public static final Bitmap J(Bitmap bitmap, float f2) {
        bitmap.getClass();
        Matrix matrix = new Matrix();
        matrix.postRotate(f2);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    public static Object K(Bitmap bitmap, Context context, bi biVar, gbe gbeVar) {
        js3 js3Var = ga4.a;
        return ynb.p0(hr3.c, new oz0(context, bitmap, null, biVar, "Xmind", null), gbeVar);
    }

    public static final Uri L(Bitmap bitmap, String str, bi biVar) {
        if (bitmap == null) {
            return null;
        }
        File file = new File(ub3.j(Environment.getExternalStorageDirectory().toString(), File.separator, "Quin"));
        if (!file.exists()) {
            file.mkdirs();
        }
        if (str == null) {
            str = "quin_image_";
        }
        String str2 = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
        str2.getClass();
        File file2 = new File(file, ib8.j(str, str2, ".jpg"));
        try {
            FileOutputStream fileOutputStreamE = a.e(new FileOutputStream(file2), file2);
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStreamE);
            fileOutputStreamE.close();
            if (biVar != null) {
                try {
                    m8b m8bVar = ci.a;
                    try {
                        ExifInterface exifInterface = new ExifInterface(file2.getAbsolutePath());
                        ci.a(exifInterface, biVar);
                        exifInterface.saveAttributes();
                    } catch (Exception e2) {
                        ci.a.c("Failed to write EXIF metadata to file", e2);
                    }
                } catch (Exception e3) {
                    hf8.Q.getClass();
                    ef8.a("BitmapUtil").c("Failed to write EXIF metadata to alternate SD", e3);
                }
            }
            return Uri.fromFile(file2);
        } catch (Exception e4) {
            tec.t(hf8.Q, "BitmapUtil", "Failed to save image to alternate SD card", e4);
            return null;
        }
    }

    public static q8f M(List list, o8f o8fVar, bm3 bm3Var, ArrayList arrayList) {
        if (o8fVar == null) {
            a(1);
            throw null;
        }
        if (bm3Var == null) {
            a(2);
            throw null;
        }
        if (arrayList == null) {
            a(3);
            throw null;
        }
        q8f q8fVarN = N(list, o8fVar, bm3Var, arrayList, null);
        if (q8fVarN != null) {
            return q8fVarN;
        }
        qc0.i("Substitution failed");
        return null;
    }

    public static q8f N(List list, o8f o8fVar, bm3 bm3Var, List list2, boolean[] zArr) {
        if (o8fVar == null) {
            a(6);
            throw null;
        }
        if (bm3Var == null) {
            a(7);
            throw null;
        }
        if (list2 == null) {
            a(8);
            throw null;
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        Iterator it = list.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            c8f c8fVar = (c8f) it.next();
            int i3 = i2 + 1;
            d8f d8fVarF0 = d8f.F0(i2, c8fVar.getAnnotations(), bm3Var, c8fVar.L(), c8fVar.getName(), c8fVar.x(), c8fVar.s());
            map.put(c8fVar.h(), new dzd(d8fVarF0.S()));
            map2.put(c8fVar, d8fVarF0);
            list2.add(d8fVarF0);
            i2 = i3;
        }
        int i4 = 1;
        ezd ezdVar = new ezd(i4, map);
        q8f q8fVarE = q8f.e(o8fVar, ezdVar);
        q8f q8fVarE2 = q8f.e(new dp1(o8fVar, i4), ezdVar);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            c8f c8fVar2 = (c8f) it2.next();
            d8f d8fVar = (d8f) map2.get(c8fVar2);
            for (tt7 tt7Var : c8fVar2.getUpperBounds()) {
                y22 y22VarM = tt7Var.c0().m();
                tt7 tt7VarH = (((y22VarM instanceof c8f) && o7c.t((c8f) y22VarM, null, null)) ? q8fVarE : q8fVarE2).h(tt7Var, dsf.OUT_VARIANCE);
                if (tt7VarH == null) {
                    return null;
                }
                if (tt7VarH != tt7Var && zArr != null) {
                    zArr[0] = true;
                }
                if (d8fVar.X) {
                    qc0.p("Type parameter descriptor is already initialized: ".concat(d8fVar.H0()));
                    return null;
                }
                if (!i7h.x(tt7VarH)) {
                    d8fVar.z.add(tt7VarH);
                }
            }
            if (d8fVar.X) {
                qc0.p("Type parameter descriptor is already initialized: ".concat(d8fVar.H0()));
                return null;
            }
            d8fVar.X = true;
        }
        return q8fVarE;
    }

    public static final dx5 O(dx5 dx5Var, dx5 dx5Var2) {
        dx5Var.getClass();
        ex5 ex5Var = dx5Var.a;
        dx5Var2.getClass();
        ex5 ex5Var2 = dx5Var2.a;
        if (!dx5Var.equals(dx5Var2) && !ex5Var2.c()) {
            String str = ex5Var.a;
            String str2 = ex5Var2.a;
            if (!c5e.C(str, str2, false) || str.charAt(str2.length()) != '.') {
                return dx5Var;
            }
        }
        if (ex5Var2.c()) {
            return dx5Var;
        }
        return dx5Var.equals(dx5Var2) ? dx5.c : new dx5(ex5Var.a.substring(ex5Var2.a.length() + 1));
    }

    public static final f97 P(nyc nycVar) {
        String strA = c5e.A(nycVar.a(), "?", "");
        if (pa7.t(nycVar.g(), ryc.c)) {
            return nycVar.c() ? f97.J0 : f97.I0;
        }
        if (strA.equals("kotlin.Int")) {
            return nycVar.c() ? f97.b : f97.a;
        }
        if (strA.equals("kotlin.Boolean")) {
            return nycVar.c() ? f97.d : f97.c;
        }
        if (strA.equals("kotlin.Double")) {
            return nycVar.c() ? f97.f : f97.e;
        }
        if (strA.equals("kotlin.Float")) {
            return nycVar.c() ? f97.v : f97.g;
        }
        if (strA.equals("kotlin.Long")) {
            return nycVar.c() ? f97.x : f97.w;
        }
        if (strA.equals("kotlin.String")) {
            return nycVar.c() ? f97.z : f97.y;
        }
        if (strA.equals("kotlin.IntArray")) {
            return f97.X;
        }
        if (strA.equals("kotlin.DoubleArray")) {
            return f97.Z;
        }
        if (strA.equals("kotlin.BooleanArray")) {
            return f97.Y;
        }
        if (strA.equals("kotlin.FloatArray")) {
            return f97.E0;
        }
        if (strA.equals("kotlin.LongArray")) {
            return f97.F0;
        }
        if (strA.equals("kotlin.Array")) {
            return f97.G0;
        }
        return c5e.C(strA, "kotlin.collections.ArrayList", false) ? f97.H0 : f97.K0;
    }

    public static final int Q(Throwable th) {
        while (th != null) {
            if ((th instanceof qs6) && ((qs6) th).a() == 429) {
                return 70001;
            }
            if (th instanceof IOException ? true : th.getClass().getName().equals("android.system.GaiException")) {
                return -2;
            }
            th = th.getCause();
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    public static final lv4 R(lv4 lv4Var, sw6 sw6Var, as9 as9Var, uz4 uz4Var, zn2 zn2Var) {
        tv4 tv4Var;
        List list;
        int i2;
        boolean z;
        Bitmap bitmapZ;
        int size;
        Bitmap bitmap;
        uz4 uz4Var2;
        lv4 lv4Var2 = lv4Var;
        sw6 sw6Var2 = sw6Var;
        as9 as9Var2 = as9Var;
        if (zn2Var instanceof tv4) {
            tv4Var = (tv4) zn2Var;
            int i3 = tv4Var.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tv4Var.label = i3 - Integer.MIN_VALUE;
            } else {
                tv4Var = new tv4(zn2Var);
            }
        } else {
            tv4Var = new tv4(zn2Var);
        }
        Object obj = tv4Var.result;
        int i4 = tv4Var.label;
        if (i4 == 0) {
            jzb.q(obj);
            list = (List) b21.z(sw6Var2, vw6.a);
            if (list.isEmpty()) {
                return lv4Var2;
            }
            bv6 bv6Var = lv4Var2.a;
            boolean z2 = bv6Var instanceof gz0;
            if (!z2 && !((Boolean) b21.z(sw6Var2, vw6.d)).booleanValue()) {
                return lv4Var2;
            }
            i2 = 0;
            if (z2) {
                Bitmap bitmap2 = ((gz0) bv6Var).a;
                Bitmap.Config config = bitmap2.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (qd0.V(erf.a, config)) {
                    bitmapZ = bitmap2;
                } else {
                    Drawable drawableJ = y7h.j(bv6Var, as9Var2.a.getResources());
                    Bitmap.Config config2 = (Bitmap.Config) b21.A(as9Var2, yw6.b);
                    ykd ykdVar = as9Var2.b;
                    zdc zdcVar = as9Var2.c;
                    ykd ykdVar2 = (ykd) b21.A(as9Var2, vw6.b);
                    if (as9Var2.d == bpa.b) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bitmapZ = kj0.Z(drawableJ, config2, ykdVar, zdcVar, ykdVar2, z);
                }
            } else {
                Drawable drawableJ2 = y7h.j(bv6Var, as9Var2.a.getResources());
                Bitmap.Config config3 = (Bitmap.Config) b21.A(as9Var2, yw6.b);
                ykd ykdVar3 = as9Var2.b;
                zdc zdcVar2 = as9Var2.c;
                ykd ykdVar4 = (ykd) b21.A(as9Var2, vw6.b);
                if (as9Var2.d == bpa.b) {
                    z = true;
                } else {
                    z = false;
                }
                bitmapZ = kj0.Z(drawableJ2, config3, ykdVar3, zdcVar2, ykdVar4, z);
            }
            uz4Var.getClass();
            size = list.size();
            bitmap = bitmapZ;
            uz4Var2 = uz4Var;
        } else {
            if (i4 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i5 = tv4Var.I$1;
            int i6 = tv4Var.I$0;
            if (tv4Var.L$11 != null) {
                r3.f();
                return null;
            }
            List list2 = (List) tv4Var.L$8;
            if (tv4Var.L$4 != null) {
                r3.f();
                return null;
            }
            uz4Var2 = (uz4) tv4Var.L$3;
            as9 as9Var3 = (as9) tv4Var.L$2;
            sw6 sw6Var3 = (sw6) tv4Var.L$1;
            lv4 lv4Var3 = (lv4) tv4Var.L$0;
            jzb.q(obj);
            tq.v(tv4Var.getContext());
            size = i5;
            lv4Var2 = lv4Var3;
            bitmap = (Bitmap) obj;
            list = list2;
            as9Var2 = as9Var3;
            i2 = i6 + 1;
            sw6Var2 = sw6Var3;
        }
        if (i2 >= size) {
            uz4Var2.getClass();
            return new lv4(new gz0(bitmap), lv4Var2.b, lv4Var2.c, lv4Var2.d);
        }
        if (list.get(i2) != null) {
            r3.f();
            return null;
        }
        ykd ykdVar5 = as9Var2.b;
        tv4Var.L$0 = lv4Var2;
        tv4Var.L$1 = sw6Var2;
        tv4Var.L$2 = as9Var2;
        tv4Var.L$3 = uz4Var2;
        tv4Var.L$4 = null;
        tv4Var.L$5 = null;
        tv4Var.L$6 = null;
        tv4Var.L$7 = null;
        tv4Var.L$8 = list;
        tv4Var.L$9 = null;
        tv4Var.L$10 = null;
        tv4Var.L$11 = null;
        tv4Var.L$12 = null;
        tv4Var.I$0 = i2;
        tv4Var.I$1 = size;
        tv4Var.label = 1;
        throw null;
    }

    public static final boolean S(Throwable th, x16 x16Var) {
        List listAsList;
        Object objInvoke;
        th.getClass();
        Integer num = md7.a;
        c84 c84Var = null;
        if (num == null || num.intValue() >= 19) {
            Throwable[] suppressed = th.getSuppressed();
            suppressed.getClass();
            listAsList = Arrays.asList(suppressed);
            listAsList.getClass();
        } else {
            Method method = bfa.b;
            if (method == null || (objInvoke = method.invoke(th, null)) == null) {
                listAsList = pu4.a;
            } else {
                listAsList = Arrays.asList((Throwable[]) objInvoke);
                listAsList.getClass();
            }
        }
        int size = listAsList.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((Throwable) listAsList.get(i2)) instanceof c84) {
                return false;
            }
        }
        try {
            if2 if2Var = (if2) x16Var.invoke();
            if (if2Var != null) {
                boolean z2 = if2Var.b;
                List list = if2Var.a;
                if (z2) {
                    int size2 = list.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        ((kf2) list.get(i3)).getClass();
                    }
                } else if (!list.isEmpty()) {
                    z = true;
                }
            }
            if (z) {
                if2Var.getClass();
                c84Var = new c84(if2Var);
            }
        } catch (Throwable th2) {
            c84Var = th2;
        }
        if (c84Var != null) {
            bzd.m(th, c84Var);
        }
        return z;
    }

    public static final long T(long j2, long j3) {
        int iE;
        int iG = eue.g(j2);
        int iF = eue.f(j2);
        if ((eue.g(j3) < eue.f(j2)) && (eue.g(j2) < eue.f(j3))) {
            if (eue.a(j3, j2)) {
                iG = eue.g(j3);
                iF = iG;
            } else {
                if (eue.a(j2, j3)) {
                    iE = eue.e(j3);
                } else {
                    int iG2 = eue.g(j3);
                    if (iG >= eue.f(j3) || iG2 > iG) {
                        iF = eue.g(j3);
                    } else {
                        iG = eue.g(j3);
                        iE = eue.e(j3);
                    }
                }
                iF -= iE;
            }
        } else if (iF > eue.g(j3)) {
            iG -= eue.e(j3);
            iE = eue.e(j3);
            iF -= iE;
        }
        return u3c.b(iG, iF);
    }

    public static final void U(l46 l46Var, j09 j09Var, int i2, sw3 sw3Var, x48 x48Var, kdc kdcVar, cv7 cv7Var, u8a u8aVar) {
        lf2.q.getClass();
        dec.l(hj6.y, l46Var, u8aVar);
        dec.l(new ai(19), l46Var, j09Var);
        dec.l(new ai(10), l46Var, sw3Var);
        dec.l(new ai(11), l46Var, x48Var);
        dec.l(new ai(12), l46Var, kdcVar);
        dec.l(new ai(13), l46Var, cv7Var);
        dec.l(hj6.X, l46Var, Integer.valueOf(i2));
    }

    public static void V(String str, String str2) {
        synchronized (e) {
            b1.l(str, h(str2, null));
        }
    }

    public static void W(String str, String str2, Throwable th) {
        synchronized (e) {
            b1.l(str, h(str2, th));
        }
    }

    public static /* synthetic */ void a(int i2) {
        String str = i2 != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i2 != 4 ? 3 : 2];
        switch (i2) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i2 != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i2 != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i2 == 4) {
            throw new IllegalStateException(str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x004d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0068  */
    /* JADX WARN: Code duplicated, block: B:43:0x006d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0071  */
    /* JADX WARN: Code duplicated, block: B:47:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x0087  */
    /* JADX WARN: Code duplicated, block: B:56:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x0094  */
    /* JADX WARN: Code duplicated, block: B:61:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x009c  */
    /* JADX WARN: Code duplicated, block: B:66:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:68:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106  */
    /* JADX WARN: Code duplicated, block: B:72:0x0132  */
    /* JADX WARN: Code duplicated, block: B:74:0x0159  */
    /* JADX WARN: Code duplicated, block: B:76:0x0162  */
    /* JADX WARN: Code duplicated, block: B:79:0x0188  */
    /* JADX WARN: Code duplicated, block: B:82:0x0194  */
    /* JADX WARN: Code duplicated, block: B:84:? A[RETURN, SYNTHETIC] */
    public static final void b(a26 a26Var, j09 j09Var, a26 a26Var2, a26 a26Var3, a26 a26Var4, l46 l46Var, int i2, int i3) {
        int i4;
        a26 a26Var5;
        int i5;
        a26 a26Var6;
        int i6;
        int i7;
        a26 a26Var7;
        int i8;
        boolean z;
        a26 a26Var8;
        a26 a26Var9;
        a26 a26Var10;
        ojb ojbVarV;
        zv zvVar;
        int iHashCode;
        j09 j09VarJ;
        sw3 sw3Var;
        cv7 cv7Var;
        a26 a26Var11;
        u8a u8aVarM;
        x48 x48Var;
        kdc kdcVar;
        int i9;
        a26 a26Var12;
        a26 a26Var13;
        x16 x16VarT;
        x16 x16VarT2;
        l46Var.h0(-180024211);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.i(a26Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(j09Var) ? 32 : 16;
        }
        int i10 = i3 & 4;
        if (i10 == 0) {
            if ((i2 & 384) == 0) {
                a26Var5 = a26Var2;
                i4 |= l46Var.i(a26Var5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i5 = i3 & 8;
            if (i5 != 0) {
                if ((i2 & 3072) == 0) {
                    a26Var6 = a26Var3;
                    if (l46Var.i(a26Var6)) {
                        i6 = 2048;
                    } else {
                        i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    if ((i2 & 24576) == 0) {
                        a26Var7 = a26Var4;
                        if (l46Var.i(a26Var7)) {
                            i8 = 16384;
                        } else {
                            i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i4 |= i8;
                    }
                    if ((i4 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (l46Var.W(i4 & 1, z)) {
                        if (i10 != 0) {
                            a26Var8 = null;
                        } else {
                            a26Var8 = a26Var5;
                        }
                        zvVar = a;
                        if (i5 != 0) {
                            a26Var6 = zvVar;
                        }
                        if (i7 != 0) {
                            a26Var7 = zvVar;
                        }
                        iHashCode = Long.hashCode(l46Var.T);
                        j09VarJ = m93.J(l46Var, j09Var.D(on5.a).D(no5.a).D(po5.a).D(lo5.a));
                        sw3Var = (sw3) l46Var.k(zg2.h);
                        cv7Var = (cv7) l46Var.k(zg2.n);
                        a26Var11 = a26Var7;
                        u8aVarM = l46Var.m();
                        x48Var = (x48) l46Var.k(cb8.a);
                        kdcVar = (kdc) l46Var.k(hb8.a);
                        i9 = 14;
                        if (a26Var8 != null) {
                            l46Var.f0(1313917368);
                            x16VarT2 = t(a26Var, l46Var, i4 & 14);
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(x16VarT2);
                            } else {
                                l46Var.s0();
                            }
                            a26Var13 = a26Var6;
                            a26Var12 = a26Var11;
                            U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                            dec.l(new ai(i9), l46Var, a26Var8);
                            dec.l(new ai(15), l46Var, a26Var12);
                            dec.l(new ai(16), l46Var, a26Var13);
                            l46Var.r(true);
                            l46Var.r(false);
                        } else {
                            a26Var12 = a26Var11;
                            a26Var13 = a26Var6;
                            l46Var.f0(1314774735);
                            x16VarT = t(a26Var, l46Var, i4 & 14);
                            l46Var.a0(null, 125, null, 1);
                            l46Var.r = true;
                            if (l46Var.S) {
                                l46Var.l(x16VarT);
                            } else {
                                l46Var.s0();
                            }
                            U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                            dec.l(new ai(17), l46Var, a26Var12);
                            dec.l(new ai(18), l46Var, a26Var13);
                            l46Var.r(true);
                            l46Var.r(false);
                        }
                        a26Var9 = a26Var13;
                        a26Var10 = a26Var12;
                    } else {
                        l46Var.Z();
                        a26Var8 = a26Var5;
                        a26Var9 = a26Var6;
                        a26Var10 = a26Var7;
                    }
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new r8(a26Var, j09Var, a26Var8, a26Var9, a26Var10, i2, i3);
                    }
                }
                i4 |= 24576;
                a26Var7 = a26Var4;
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i4 & 1, z)) {
                    if (i10 != 0) {
                        a26Var8 = null;
                    } else {
                        a26Var8 = a26Var5;
                    }
                    zvVar = a;
                    if (i5 != 0) {
                        a26Var6 = zvVar;
                    }
                    if (i7 != 0) {
                        a26Var7 = zvVar;
                    }
                    iHashCode = Long.hashCode(l46Var.T);
                    j09VarJ = m93.J(l46Var, j09Var.D(on5.a).D(no5.a).D(po5.a).D(lo5.a));
                    sw3Var = (sw3) l46Var.k(zg2.h);
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    a26Var11 = a26Var7;
                    u8aVarM = l46Var.m();
                    x48Var = (x48) l46Var.k(cb8.a);
                    kdcVar = (kdc) l46Var.k(hb8.a);
                    i9 = 14;
                    if (a26Var8 != null) {
                        l46Var.f0(1313917368);
                        x16VarT2 = t(a26Var, l46Var, i4 & 14);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(x16VarT2);
                        } else {
                            l46Var.s0();
                        }
                        a26Var13 = a26Var6;
                        a26Var12 = a26Var11;
                        U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                        dec.l(new ai(i9), l46Var, a26Var8);
                        dec.l(new ai(15), l46Var, a26Var12);
                        dec.l(new ai(16), l46Var, a26Var13);
                        l46Var.r(true);
                        l46Var.r(false);
                    } else {
                        a26Var12 = a26Var11;
                        a26Var13 = a26Var6;
                        l46Var.f0(1314774735);
                        x16VarT = t(a26Var, l46Var, i4 & 14);
                        l46Var.a0(null, 125, null, 1);
                        l46Var.r = true;
                        if (l46Var.S) {
                            l46Var.l(x16VarT);
                        } else {
                            l46Var.s0();
                        }
                        U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                        dec.l(new ai(17), l46Var, a26Var12);
                        dec.l(new ai(18), l46Var, a26Var13);
                        l46Var.r(true);
                        l46Var.r(false);
                    }
                    a26Var9 = a26Var13;
                    a26Var10 = a26Var12;
                } else {
                    l46Var.Z();
                    a26Var8 = a26Var5;
                    a26Var9 = a26Var6;
                    a26Var10 = a26Var7;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new r8(a26Var, j09Var, a26Var8, a26Var9, a26Var10, i2, i3);
                }
            }
            i4 |= 3072;
            a26Var6 = a26Var3;
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    a26Var7 = a26Var4;
                    if (l46Var.i(a26Var7)) {
                        i8 = 16384;
                    } else {
                        i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i8;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i4 & 1, z)) {
                    if (i10 != 0) {
                        a26Var8 = null;
                    } else {
                        a26Var8 = a26Var5;
                    }
                    zvVar = a;
                    if (i5 != 0) {
                        a26Var6 = zvVar;
                    }
                    if (i7 != 0) {
                        a26Var7 = zvVar;
                    }
                    iHashCode = Long.hashCode(l46Var.T);
                    j09VarJ = m93.J(l46Var, j09Var.D(on5.a).D(no5.a).D(po5.a).D(lo5.a));
                    sw3Var = (sw3) l46Var.k(zg2.h);
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    a26Var11 = a26Var7;
                    u8aVarM = l46Var.m();
                    x48Var = (x48) l46Var.k(cb8.a);
                    kdcVar = (kdc) l46Var.k(hb8.a);
                    i9 = 14;
                    if (a26Var8 != null) {
                        l46Var.f0(1313917368);
                        x16VarT2 = t(a26Var, l46Var, i4 & 14);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(x16VarT2);
                        } else {
                            l46Var.s0();
                        }
                        a26Var13 = a26Var6;
                        a26Var12 = a26Var11;
                        U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                        dec.l(new ai(i9), l46Var, a26Var8);
                        dec.l(new ai(15), l46Var, a26Var12);
                        dec.l(new ai(16), l46Var, a26Var13);
                        l46Var.r(true);
                        l46Var.r(false);
                    } else {
                        a26Var12 = a26Var11;
                        a26Var13 = a26Var6;
                        l46Var.f0(1314774735);
                        x16VarT = t(a26Var, l46Var, i4 & 14);
                        l46Var.a0(null, 125, null, 1);
                        l46Var.r = true;
                        if (l46Var.S) {
                            l46Var.l(x16VarT);
                        } else {
                            l46Var.s0();
                        }
                        U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                        dec.l(new ai(17), l46Var, a26Var12);
                        dec.l(new ai(18), l46Var, a26Var13);
                        l46Var.r(true);
                        l46Var.r(false);
                    }
                    a26Var9 = a26Var13;
                    a26Var10 = a26Var12;
                } else {
                    l46Var.Z();
                    a26Var8 = a26Var5;
                    a26Var9 = a26Var6;
                    a26Var10 = a26Var7;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new r8(a26Var, j09Var, a26Var8, a26Var9, a26Var10, i2, i3);
                }
            }
            i4 |= 24576;
            a26Var7 = a26Var4;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i10 != 0) {
                    a26Var8 = null;
                } else {
                    a26Var8 = a26Var5;
                }
                zvVar = a;
                if (i5 != 0) {
                    a26Var6 = zvVar;
                }
                if (i7 != 0) {
                    a26Var7 = zvVar;
                }
                iHashCode = Long.hashCode(l46Var.T);
                j09VarJ = m93.J(l46Var, j09Var.D(on5.a).D(no5.a).D(po5.a).D(lo5.a));
                sw3Var = (sw3) l46Var.k(zg2.h);
                cv7Var = (cv7) l46Var.k(zg2.n);
                a26Var11 = a26Var7;
                u8aVarM = l46Var.m();
                x48Var = (x48) l46Var.k(cb8.a);
                kdcVar = (kdc) l46Var.k(hb8.a);
                i9 = 14;
                if (a26Var8 != null) {
                    l46Var.f0(1313917368);
                    x16VarT2 = t(a26Var, l46Var, i4 & 14);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(x16VarT2);
                    } else {
                        l46Var.s0();
                    }
                    a26Var13 = a26Var6;
                    a26Var12 = a26Var11;
                    U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                    dec.l(new ai(i9), l46Var, a26Var8);
                    dec.l(new ai(15), l46Var, a26Var12);
                    dec.l(new ai(16), l46Var, a26Var13);
                    l46Var.r(true);
                    l46Var.r(false);
                } else {
                    a26Var12 = a26Var11;
                    a26Var13 = a26Var6;
                    l46Var.f0(1314774735);
                    x16VarT = t(a26Var, l46Var, i4 & 14);
                    l46Var.a0(null, 125, null, 1);
                    l46Var.r = true;
                    if (l46Var.S) {
                        l46Var.l(x16VarT);
                    } else {
                        l46Var.s0();
                    }
                    U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                    dec.l(new ai(17), l46Var, a26Var12);
                    dec.l(new ai(18), l46Var, a26Var13);
                    l46Var.r(true);
                    l46Var.r(false);
                }
                a26Var9 = a26Var13;
                a26Var10 = a26Var12;
            } else {
                l46Var.Z();
                a26Var8 = a26Var5;
                a26Var9 = a26Var6;
                a26Var10 = a26Var7;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new r8(a26Var, j09Var, a26Var8, a26Var9, a26Var10, i2, i3);
            }
        }
        i4 |= 384;
        a26Var5 = a26Var2;
        i5 = i3 & 8;
        if (i5 != 0) {
            if ((i2 & 3072) == 0) {
                a26Var6 = a26Var3;
                if (l46Var.i(a26Var6)) {
                    i6 = 2048;
                } else {
                    i6 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i4 |= i6;
            }
            i7 = i3 & 16;
            if (i7 != 0) {
                if ((i2 & 24576) == 0) {
                    a26Var7 = a26Var4;
                    if (l46Var.i(a26Var7)) {
                        i8 = 16384;
                    } else {
                        i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i4 |= i8;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (l46Var.W(i4 & 1, z)) {
                    if (i10 != 0) {
                        a26Var8 = null;
                    } else {
                        a26Var8 = a26Var5;
                    }
                    zvVar = a;
                    if (i5 != 0) {
                        a26Var6 = zvVar;
                    }
                    if (i7 != 0) {
                        a26Var7 = zvVar;
                    }
                    iHashCode = Long.hashCode(l46Var.T);
                    j09VarJ = m93.J(l46Var, j09Var.D(on5.a).D(no5.a).D(po5.a).D(lo5.a));
                    sw3Var = (sw3) l46Var.k(zg2.h);
                    cv7Var = (cv7) l46Var.k(zg2.n);
                    a26Var11 = a26Var7;
                    u8aVarM = l46Var.m();
                    x48Var = (x48) l46Var.k(cb8.a);
                    kdcVar = (kdc) l46Var.k(hb8.a);
                    i9 = 14;
                    if (a26Var8 != null) {
                        l46Var.f0(1313917368);
                        x16VarT2 = t(a26Var, l46Var, i4 & 14);
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(x16VarT2);
                        } else {
                            l46Var.s0();
                        }
                        a26Var13 = a26Var6;
                        a26Var12 = a26Var11;
                        U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                        dec.l(new ai(i9), l46Var, a26Var8);
                        dec.l(new ai(15), l46Var, a26Var12);
                        dec.l(new ai(16), l46Var, a26Var13);
                        l46Var.r(true);
                        l46Var.r(false);
                    } else {
                        a26Var12 = a26Var11;
                        a26Var13 = a26Var6;
                        l46Var.f0(1314774735);
                        x16VarT = t(a26Var, l46Var, i4 & 14);
                        l46Var.a0(null, 125, null, 1);
                        l46Var.r = true;
                        if (l46Var.S) {
                            l46Var.l(x16VarT);
                        } else {
                            l46Var.s0();
                        }
                        U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                        dec.l(new ai(17), l46Var, a26Var12);
                        dec.l(new ai(18), l46Var, a26Var13);
                        l46Var.r(true);
                        l46Var.r(false);
                    }
                    a26Var9 = a26Var13;
                    a26Var10 = a26Var12;
                } else {
                    l46Var.Z();
                    a26Var8 = a26Var5;
                    a26Var9 = a26Var6;
                    a26Var10 = a26Var7;
                }
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new r8(a26Var, j09Var, a26Var8, a26Var9, a26Var10, i2, i3);
                }
            }
            i4 |= 24576;
            a26Var7 = a26Var4;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i10 != 0) {
                    a26Var8 = null;
                } else {
                    a26Var8 = a26Var5;
                }
                zvVar = a;
                if (i5 != 0) {
                    a26Var6 = zvVar;
                }
                if (i7 != 0) {
                    a26Var7 = zvVar;
                }
                iHashCode = Long.hashCode(l46Var.T);
                j09VarJ = m93.J(l46Var, j09Var.D(on5.a).D(no5.a).D(po5.a).D(lo5.a));
                sw3Var = (sw3) l46Var.k(zg2.h);
                cv7Var = (cv7) l46Var.k(zg2.n);
                a26Var11 = a26Var7;
                u8aVarM = l46Var.m();
                x48Var = (x48) l46Var.k(cb8.a);
                kdcVar = (kdc) l46Var.k(hb8.a);
                i9 = 14;
                if (a26Var8 != null) {
                    l46Var.f0(1313917368);
                    x16VarT2 = t(a26Var, l46Var, i4 & 14);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(x16VarT2);
                    } else {
                        l46Var.s0();
                    }
                    a26Var13 = a26Var6;
                    a26Var12 = a26Var11;
                    U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                    dec.l(new ai(i9), l46Var, a26Var8);
                    dec.l(new ai(15), l46Var, a26Var12);
                    dec.l(new ai(16), l46Var, a26Var13);
                    l46Var.r(true);
                    l46Var.r(false);
                } else {
                    a26Var12 = a26Var11;
                    a26Var13 = a26Var6;
                    l46Var.f0(1314774735);
                    x16VarT = t(a26Var, l46Var, i4 & 14);
                    l46Var.a0(null, 125, null, 1);
                    l46Var.r = true;
                    if (l46Var.S) {
                        l46Var.l(x16VarT);
                    } else {
                        l46Var.s0();
                    }
                    U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                    dec.l(new ai(17), l46Var, a26Var12);
                    dec.l(new ai(18), l46Var, a26Var13);
                    l46Var.r(true);
                    l46Var.r(false);
                }
                a26Var9 = a26Var13;
                a26Var10 = a26Var12;
            } else {
                l46Var.Z();
                a26Var8 = a26Var5;
                a26Var9 = a26Var6;
                a26Var10 = a26Var7;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new r8(a26Var, j09Var, a26Var8, a26Var9, a26Var10, i2, i3);
            }
        }
        i4 |= 3072;
        a26Var6 = a26Var3;
        i7 = i3 & 16;
        if (i7 != 0) {
            if ((i2 & 24576) == 0) {
                a26Var7 = a26Var4;
                if (l46Var.i(a26Var7)) {
                    i8 = 16384;
                } else {
                    i8 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i4 |= i8;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (l46Var.W(i4 & 1, z)) {
                if (i10 != 0) {
                    a26Var8 = null;
                } else {
                    a26Var8 = a26Var5;
                }
                zvVar = a;
                if (i5 != 0) {
                    a26Var6 = zvVar;
                }
                if (i7 != 0) {
                    a26Var7 = zvVar;
                }
                iHashCode = Long.hashCode(l46Var.T);
                j09VarJ = m93.J(l46Var, j09Var.D(on5.a).D(no5.a).D(po5.a).D(lo5.a));
                sw3Var = (sw3) l46Var.k(zg2.h);
                cv7Var = (cv7) l46Var.k(zg2.n);
                a26Var11 = a26Var7;
                u8aVarM = l46Var.m();
                x48Var = (x48) l46Var.k(cb8.a);
                kdcVar = (kdc) l46Var.k(hb8.a);
                i9 = 14;
                if (a26Var8 != null) {
                    l46Var.f0(1313917368);
                    x16VarT2 = t(a26Var, l46Var, i4 & 14);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(x16VarT2);
                    } else {
                        l46Var.s0();
                    }
                    a26Var13 = a26Var6;
                    a26Var12 = a26Var11;
                    U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                    dec.l(new ai(i9), l46Var, a26Var8);
                    dec.l(new ai(15), l46Var, a26Var12);
                    dec.l(new ai(16), l46Var, a26Var13);
                    l46Var.r(true);
                    l46Var.r(false);
                } else {
                    a26Var12 = a26Var11;
                    a26Var13 = a26Var6;
                    l46Var.f0(1314774735);
                    x16VarT = t(a26Var, l46Var, i4 & 14);
                    l46Var.a0(null, 125, null, 1);
                    l46Var.r = true;
                    if (l46Var.S) {
                        l46Var.l(x16VarT);
                    } else {
                        l46Var.s0();
                    }
                    U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                    dec.l(new ai(17), l46Var, a26Var12);
                    dec.l(new ai(18), l46Var, a26Var13);
                    l46Var.r(true);
                    l46Var.r(false);
                }
                a26Var9 = a26Var13;
                a26Var10 = a26Var12;
            } else {
                l46Var.Z();
                a26Var8 = a26Var5;
                a26Var9 = a26Var6;
                a26Var10 = a26Var7;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new r8(a26Var, j09Var, a26Var8, a26Var9, a26Var10, i2, i3);
            }
        }
        i4 |= 24576;
        a26Var7 = a26Var4;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (l46Var.W(i4 & 1, z)) {
            if (i10 != 0) {
                a26Var8 = null;
            } else {
                a26Var8 = a26Var5;
            }
            zvVar = a;
            if (i5 != 0) {
                a26Var6 = zvVar;
            }
            if (i7 != 0) {
                a26Var7 = zvVar;
            }
            iHashCode = Long.hashCode(l46Var.T);
            j09VarJ = m93.J(l46Var, j09Var.D(on5.a).D(no5.a).D(po5.a).D(lo5.a));
            sw3Var = (sw3) l46Var.k(zg2.h);
            cv7Var = (cv7) l46Var.k(zg2.n);
            a26Var11 = a26Var7;
            u8aVarM = l46Var.m();
            x48Var = (x48) l46Var.k(cb8.a);
            kdcVar = (kdc) l46Var.k(hb8.a);
            i9 = 14;
            if (a26Var8 != null) {
                l46Var.f0(1313917368);
                x16VarT2 = t(a26Var, l46Var, i4 & 14);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(x16VarT2);
                } else {
                    l46Var.s0();
                }
                a26Var13 = a26Var6;
                a26Var12 = a26Var11;
                U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                dec.l(new ai(i9), l46Var, a26Var8);
                dec.l(new ai(15), l46Var, a26Var12);
                dec.l(new ai(16), l46Var, a26Var13);
                l46Var.r(true);
                l46Var.r(false);
            } else {
                a26Var12 = a26Var11;
                a26Var13 = a26Var6;
                l46Var.f0(1314774735);
                x16VarT = t(a26Var, l46Var, i4 & 14);
                l46Var.a0(null, 125, null, 1);
                l46Var.r = true;
                if (l46Var.S) {
                    l46Var.l(x16VarT);
                } else {
                    l46Var.s0();
                }
                U(l46Var, j09VarJ, iHashCode, sw3Var, x48Var, kdcVar, cv7Var, u8aVarM);
                dec.l(new ai(17), l46Var, a26Var12);
                dec.l(new ai(18), l46Var, a26Var13);
                l46Var.r(true);
                l46Var.r(false);
            }
            a26Var9 = a26Var13;
            a26Var10 = a26Var12;
        } else {
            l46Var.Z();
            a26Var8 = a26Var5;
            a26Var9 = a26Var6;
            a26Var10 = a26Var7;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new r8(a26Var, j09Var, a26Var8, a26Var9, a26Var10, i2, i3);
        }
    }

    public static final void c(a26 a26Var, j09 j09Var, a26 a26Var2, l46 l46Var, int i2, int i3) {
        int i4;
        int i5;
        j09 j09Var2;
        a26 a26Var3;
        l46Var.h0(-1783766393);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.i(a26Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i6 = i3 & 2;
        if (i6 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= l46Var.g(j09Var) ? 32 : 16;
        }
        int i7 = i3 & 4;
        if (i7 != 0) {
            i5 = i4 | 384;
        } else {
            i5 = i4 | (l46Var.i(a26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        }
        if (l46Var.W(i5 & 1, (i5 & 147) != 146)) {
            j09 j09Var3 = i6 != 0 ? g09.a : j09Var;
            zv zvVar = a;
            a26Var3 = i7 != 0 ? zvVar : a26Var2;
            b(a26Var, j09Var3, null, zvVar, a26Var3, l46Var, (i5 & 14) | 3072 | (i5 & 112) | ((i5 << 6) & 57344), 4);
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            a26Var3 = a26Var2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new kr(a26Var, j09Var2, a26Var3, i2, i3, 1);
        }
    }

    public static final void d(int i2, x16 x16Var, x16 x16Var2, l46 l46Var, j09 j09Var) {
        j09 j09Var2;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-114454825);
        int i3 = i2 | 6 | (l46Var.i(x16Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            t72.b(x16Var2, null, af1.b0(-583457234, new b20(x16Var2, x16Var, i4), l46Var), l46Var, ((i3 >> 6) & 14) | 384, 2);
            j09Var2 = g09.a;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o(j09Var2, x16Var, x16Var2, i2, 1);
        }
    }

    public static final e37 e(xn7 xn7Var, String str) {
        return new e37(str, new f37(xn7Var));
    }

    public static final void f(float f2, float f3, int i2, int i3, int i4, long j2, long j3, l46 l46Var, j09 j09Var) {
        int i5;
        float f4;
        float f5;
        long j4;
        long jB;
        j09 j09Var2;
        long j5;
        j09 j09Var3;
        float f6;
        float f7;
        boolean z;
        l46Var.h0(419024313);
        if ((i4 & 6) == 0) {
            i5 = i4 | (l46Var.e(i2) ? 4 : 2);
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= l46Var.e(i3) ? 32 : 16;
        }
        int i6 = i5 | 617856;
        int i7 = 0;
        if (l46Var.W(i6 & 1, (599187 & i6) != 599186)) {
            l46Var.b0();
            if ((i4 & 1) == 0 || l46Var.C()) {
                j5 = ((e8b) l46Var.k(l8b.a)).u;
                jB = y72.b(j5, 0.2f);
                j09Var3 = g09.a;
                f6 = 6.0f;
                f7 = 4.0f;
            } else {
                l46Var.Z();
                f6 = f2;
                f7 = f3;
                j5 = j2;
                jB = j3;
                j09Var3 = j09Var;
            }
            l46Var.s();
            t7c t7cVarA = s7c.a(new uc0(f6, true, new qc0(i7)), ndb.z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var3);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, t7cVarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            l46Var.f0(1025057138);
            if (1 <= i3) {
                int i8 = 1;
                while (true) {
                    z = false;
                    s21.a(tm7.o(oa7.E(b.d(new jw7(1.0f, true), f7), eze.a(l46Var).a.a), i2 >= i8 ? j5 : jB, g21.f), l46Var, 0);
                    if (i8 == i3) {
                        break;
                    } else {
                        i8++;
                    }
                }
            } else {
                z = false;
            }
            l46Var.r(z);
            l46Var.r(true);
            j4 = j5;
            j09Var2 = j09Var3;
            f4 = f6;
            f5 = f7;
        } else {
            l46Var.Z();
            f4 = f2;
            f5 = f3;
            j4 = j2;
            jB = j3;
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zwa(i2, i3, j09Var2, f4, f5, j4, jB, i4);
        }
    }

    public static final List g(em7 em7Var) {
        em7Var.getClass();
        return fyc.A(new zi5(fyc.u(v8.S0, em7Var), v8.T0, iyc.a));
    }

    public static String h(String str, Throwable th) {
        String strReplace;
        if (th != null) {
            synchronized (e) {
                Throwable cause = th;
                while (true) {
                    if (cause == null) {
                        strReplace = Log.getStackTraceString(th).trim().replace("\t", "    ");
                        break;
                    }
                    try {
                        if (cause instanceof UnknownHostException) {
                            strReplace = "UnknownHostException (no network)";
                            break;
                        }
                        cause = cause.getCause();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        } else {
            strReplace = null;
        }
        if (TextUtils.isEmpty(strReplace)) {
            return str;
        }
        StringBuilder sbQ = kv2.q(str, "\n  ");
        sbQ.append(strReplace.replace("\n", "\n  "));
        sbQ.append('\n');
        return sbQ.toString();
    }

    public static final Object j(Activity activity, et2 et2Var) {
        if (activity != null) {
            Window window = activity.getWindow();
            View decorView = window.getDecorView();
            decorView.getClass();
            int width = decorView.getWidth();
            int height = decorView.getHeight();
            int i2 = 0;
            if (F(activity, decorView.isAttachedToWindow(), decorView.getWindowToken() != null)) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.getClass();
                l0 l0Var = new l0(20, activity, decorView);
                nz0 nz0Var = nz0.a;
                pl1 pl1Var = new pl1(1, k99.D(et2Var));
                pl1Var.v();
                try {
                    PixelCopy.request(window, bitmapCreateBitmap, new lz0(i2, new mz0(l0Var, pl1Var, bitmapCreateBitmap)), new Handler(Looper.getMainLooper()));
                } catch (Error e2) {
                    nz0Var.d(bitmapCreateBitmap);
                    throw e2;
                } catch (Exception unused) {
                    nz0Var.d(bitmapCreateBitmap);
                    nz0 nz0Var2 = nz0.a;
                    pl1Var.n(null, new a7(3));
                }
                return pl1Var.t();
            }
        }
        return null;
    }

    public static final boolean k(oia oiaVar) {
        return (oiaVar.c() || oiaVar.h || !oiaVar.d) ? false : true;
    }

    public static final boolean l(oia oiaVar) {
        return !oiaVar.h && oiaVar.d;
    }

    public static final boolean m(oia oiaVar) {
        return (oiaVar.c() || !oiaVar.h || oiaVar.d) ? false : true;
    }

    public static final boolean n(oia oiaVar) {
        return oiaVar.h && !oiaVar.d;
    }

    public static final boolean o(Context context) {
        context.getClass();
        if (Build.VERSION.SDK_INT >= 29 || bp.c(context, "android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            return true;
        }
        vb2 vb2VarH = kn2.H(context);
        if (vb2VarH == null) {
            return false;
        }
        rd.Z(vb2VarH, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, ErrorCodes.SERVER_RETRY_IN);
        return false;
    }

    public static j09 p(j09 j09Var) {
        return j09Var.D(new ez1(new wu0(29)));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Multi-variable type inference failed */
    public static String q(c36 c36Var, int i2) {
        String strB;
        ib1 ib1Var = ib1.f;
        boolean z = (i2 & 1) != 0;
        boolean z2 = (i2 & 2) != 0;
        c36Var.getClass();
        StringBuilder sb = new StringBuilder();
        if (z2) {
            if (c36Var instanceof ul2) {
                strB = "<init>";
            } else {
                strB = ((cm3) c36Var).getName().b();
                strB.getClass();
            }
            sb.append(strB);
        }
        sb.append("(");
        nw7 nw7VarO = c36Var.O();
        if (nw7VarO != null) {
            tt7 type = nw7VarO.getType();
            type.getClass();
            sb.append((xl7) y41.F(type, a8f.i, ib1Var));
        }
        Iterator it = c36Var.G().iterator();
        while (it.hasNext()) {
            tt7 type2 = ((xrf) it.next()).getType();
            type2.getClass();
            sb.append((xl7) y41.F(type2, a8f.i, ib1Var));
        }
        sb.append(")");
        if (z) {
            if (c36Var instanceof ul2) {
                sb.append("V");
            } else {
                tt7 returnType = c36Var.getReturnType();
                returnType.getClass();
                t99 t99Var = xr7.e;
                if (xr7.E(returnType, syd.d)) {
                    tt7 returnType2 = c36Var.getReturnType();
                    returnType2.getClass();
                    if (!w8f.e(returnType2) && !(c36Var instanceof zxa)) {
                        sb.append("V");
                    }
                }
                tt7 returnType3 = c36Var.getReturnType();
                returnType3.getClass();
                sb.append((xl7) y41.F(returnType3, a8f.i, ib1Var));
            }
        }
        return sb.toString();
    }

    public static final String r(ca1 ca1Var) {
        if (!oz3.m(ca1Var)) {
            bm3 bm3VarK = ca1Var.k();
            u09 u09Var = bm3VarK instanceof u09 ? (u09) bm3VarK : null;
            if (u09Var != null && !u09Var.getName().b) {
                ca1 ca1VarA = ca1Var.a();
                hjd hjdVar = ca1VarA instanceof hjd ? (hjd) ca1VarA : null;
                if (hjdVar != null) {
                    String strQ = q(hjdVar, 3);
                    String str = qf7.a;
                    j22 j22VarH = qf7.h(qz3.g(u09Var).a);
                    return (j22VarH != null ? gk7.c(j22VarH) : y41.f(u09Var, gec.y)) + '.' + strQ;
                }
            }
        }
        return null;
    }

    public static final boolean s(hkb hkbVar, float f2, float f3) {
        float f4 = hkbVar.a;
        if (f2 > hkbVar.c || f4 > f2) {
            return false;
        }
        return f3 <= hkbVar.d && hkbVar.b <= f3;
    }

    public static final x16 t(a26 a26Var, l46 l46Var, int i2) {
        int iHashCode = Long.hashCode(l46Var.T);
        Context context = (Context) l46Var.k(uq.b);
        j46 j46VarL = an1.L(l46Var);
        ucc uccVar = (ucc) l46Var.k(wcc.a);
        View view = (View) l46Var.k(uq.f);
        boolean zI = ((((i2 & 14) ^ 6) > 4 && l46Var.g(a26Var)) || (i2 & 6) == 4) | l46Var.i(context) | l46Var.i(j46VarL) | l46Var.i(uccVar) | l46Var.e(iHashCode) | l46Var.i(view);
        Object objR = l46Var.R();
        if (zI || objR == sf2.a) {
            Object dxVar = new dx(context, a26Var, j46VarL, uccVar, iHashCode, view);
            l46Var.p0(dxVar);
            objR = dxVar;
        }
        return (x16) objR;
    }

    public static final Bitmap u(Bitmap bitmap, float f2) {
        int i2;
        int i3;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        float f3 = width;
        float f4 = height;
        if (f3 / f4 > f2) {
            i3 = (int) (f4 * f2);
            i2 = height;
        } else {
            i2 = (int) (f3 / f2);
            i3 = width;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap, Math.max(0, (width - i3) / 2), Math.max(0, (height - i2) / 2), Math.min(i3, width), Math.min(i2, height));
        bitmapCreateBitmap.getClass();
        return bitmapCreateBitmap;
    }

    public static void v(String str, String str2) {
        synchronized (e) {
            Log.d(str, h(str2, null));
        }
    }

    public static final Object w(tia tiaVar, qne qneVar, xn2 xn2Var) {
        Object objO = jgb.O(new zf8(tiaVar, qneVar, null), xn2Var);
        return objO == bw2.a ? objO : wef.a;
    }

    public static void x(String str, String str2) {
        synchronized (e) {
            b1.d(str, h(str2, null));
        }
    }

    public static void y(String str, String str2, Throwable th) {
        synchronized (e) {
            b1.d(str, h(str2, th));
        }
    }

    public static int z(ByteBuffer byteBuffer, int i2, int i3) {
        int i4 = 0;
        while (i2 < i3) {
            int i5 = byteBuffer.get(i2) & 255;
            if (i4 >= 2 && i5 == 1) {
                return i2 - 2;
            }
            i4 = i5 == 0 ? i4 + 1 : 0;
            i2++;
        }
        return i3;
    }

    public abstract String i();
}
