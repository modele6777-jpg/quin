package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.appcompat.widget.ActionBarContextView;
import com.adjust.sdk.sig.r3;
import io.sentry.android.core.b1;
import io.sentry.config.a;
import io.sentry.instrumentation.file.d;
import io.sentry.q4;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.MissingFormatArgumentException;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipInputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vd9 implements ks8, lm9, e85, ha1, kn9, an9, wm9, sl9, oo8, g1b, tg0, ntd, ozb, ze0 {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: Code duplicated, block: B:14:0x002a A[PHI: r11
  0x002a: PHI (r11v1 int) = (r11v0 int), (r11v3 int) binds: [B:5:0x0019, B:10:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:19:0x0033  */
    public vd9(int[] iArr, float[] fArr, float[][] fArr2) {
        int i;
        int i2 = 5;
        this.a = 5;
        int length = fArr.length - 1;
        jc0[][] jc0VarArr = new jc0[length][];
        int i3 = 1;
        int i4 = 1;
        int i5 = 0;
        while (i5 < length) {
            int i6 = iArr[i5];
            int i7 = 3;
            if (i6 == 0) {
                i = i7;
            } else if (i6 == 1) {
                i3 = 1;
                i = i3;
            } else {
                if (i6 != 2) {
                    if (i6 != 3) {
                        i7 = 4;
                        if (i6 != 4) {
                            i = i6 != i2 ? i4 : i2;
                        } else {
                            i = i7;
                        }
                    } else {
                        if (i3 != 1) {
                            i3 = 1;
                        }
                        i = i3;
                    }
                }
                i3 = 2;
                i = i3;
            }
            float[] fArr3 = fArr2[i5];
            int i8 = i5 + 1;
            float[] fArr4 = fArr2[i8];
            float f = fArr[i5];
            float f2 = fArr[i8];
            int length2 = (fArr3.length % 2) + (fArr3.length / 2);
            jc0[] jc0VarArr2 = new jc0[length2];
            int i9 = 0;
            while (i9 < length2) {
                int i10 = i9 * 2;
                int i11 = i9;
                int i12 = i10 + 1;
                jc0VarArr2[i11] = new jc0(i, f, f2, fArr3[i10], fArr3[i12], fArr4[i10], fArr4[i12]);
                i9 = i11 + 1;
            }
            jc0VarArr[i5] = jc0VarArr2;
            i5 = i8;
            i4 = i;
            i2 = 5;
        }
        this.b = jc0VarArr;
    }

    public static boolean A(Bundle bundle) {
        return "1".equals(bundle.getString("gcm.n.e")) || "1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")));
    }

    public static void H(vd9 vd9Var, g1b g1bVar) {
        if (((g1b) vd9Var.b) == null) {
            vd9Var.b = g1bVar;
        } else {
            r3.l();
        }
    }

    public static /* synthetic */ void J(vd9 vd9Var, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        vd9Var.I(f, f2);
    }

    public static String K(String str) {
        return str.startsWith("gcm.n.") ? str.substring(6) : str;
    }

    public static void m(vd9 vd9Var, float f, float f2, int i) {
        ta0 ta0Var = (ta0) vd9Var.b;
        if ((i & 4) != 0) {
            f = Float.intBitsToFloat((int) (ta0Var.z() >> 32));
        }
        float f3 = f;
        if ((i & 8) != 0) {
            f2 = Float.intBitsToFloat((int) (ta0Var.z() & 4294967295L));
        }
        vd9Var.l(0.0f, 0.0f, f3, f2, 1);
    }

    @Override // defpackage.ks8
    public boolean B(qr8 qr8Var) {
        yc ycVar = (yc) this.b;
        if (qr8Var == ycVar.c) {
            return false;
        }
        vr8 vr8Var = ((k6e) qr8Var).A;
        ks8 ks8Var = ycVar.e;
        if (ks8Var != null) {
            return ks8Var.B(qr8Var);
        }
        return false;
    }

    public void C() {
        ((mx5) this.b).J0.O();
    }

    public Bundle D() {
        Bundle bundle = (Bundle) this.b;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public u09 E(enb enbVar) {
        yx7 yx7Var;
        dx5 dx5VarC = enbVar.c();
        Class<?> declaringClass = enbVar.a.getDeclaringClass();
        enb enbVar2 = declaringClass != null ? new enb(declaringClass) : null;
        if (enbVar2 != null) {
            u09 u09VarE = E(enbVar2);
            dr8 dr8VarJ0 = u09VarE != null ? u09VarE.j0() : null;
            y22 y22VarE = dr8VarJ0 != null ? dr8VarJ0.e(enbVar.e(), lf9.v) : null;
            if (y22VarE instanceof u09) {
                return (u09) y22VarE;
            }
        } else if (dx5VarC != null && (yx7Var = (yx7) s72.x0(t72.H(((zx7) this.b).c(dx5VarC.b())))) != null) {
            ey7 ey7Var = yx7Var.y.d;
            ey7Var.getClass();
            return ey7Var.v(enbVar.e(), enbVar);
        }
        return null;
    }

    public void F(long j, float f) {
        vl1 vl1VarP = ((ta0) this.b).p();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        vl1VarP.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        vl1VarP.e(f);
        vl1VarP.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void G(float f, float f2, long j) {
        vl1 vl1VarP = ((ta0) this.b).p();
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        vl1VarP.n(Float.intBitsToFloat(i), Float.intBitsToFloat(i2));
        vl1VarP.c(f, f2);
        vl1VarP.n(-Float.intBitsToFloat(i), -Float.intBitsToFloat(i2));
    }

    public void I(float f, float f2) {
        ((ta0) this.b).p().n(f, f2);
    }

    @Override // defpackage.kn9
    public void a(Object obj) {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.tg0
    /* JADX INFO: renamed from: apply */
    public m88 mo34apply(Object obj) {
        return bm8.C(((u26) this.b).apply(obj));
    }

    @Override // defpackage.wm9
    public void c() {
        ((CountDownLatch) this.b).countDown();
    }

    @Override // defpackage.ks8
    public void d(qr8 qr8Var, boolean z) {
        if (qr8Var instanceof k6e) {
            ((k6e) qr8Var).z.k().c(false);
        }
        ks8 ks8Var = ((yc) this.b).e;
        if (ks8Var != null) {
            ks8Var.d(qr8Var, z);
        }
    }

    @Override // defpackage.ze0
    public Object e(Object obj, Object obj2) {
        String str = (String) obj2;
        str.getClass();
        h19 h19Var = (h19) this.b;
        agf agfVar = h19Var.a;
        txa txaVar = agfVar.a;
        List list = h19Var.b;
        int iIndexOf = list.indexOf(str);
        int i = agfVar.b;
        Integer num = (Integer) txaVar.e(obj, Integer.valueOf(iIndexOf + i));
        if (num != null) {
            return (String) list.get(num.intValue() - i);
        }
        return null;
    }

    @Override // defpackage.oo8
    public po8 f(hbc hbcVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = (Context) this.b) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new pzd(3).f(hbcVar);
        }
        int iG = qv8.g(((rr5) hbcVar.c).p);
        xo1.D("DMCodecAdapterFactory", "Creating an asynchronous MediaCodec adapter for track type ".concat(pqf.z(iG)));
        egh eghVar = new egh(new lh0(iG, 0), new lh0(iG, 1));
        eghVar.b = true;
        return eghVar.f(hbcVar);
    }

    public od1 g() {
        return new od1(7, bs9.d((k79) this.b));
    }

    @Override // defpackage.h1b
    public Object get() {
        g1b g1bVar = (g1b) this.b;
        if (g1bVar != null) {
            return g1bVar.get();
        }
        r3.l();
        return null;
    }

    @Override // defpackage.e85
    public k79 h() {
        throw null;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // defpackage.lm9
    public h8g i(View view, h8g h8gVar) {
        h8g h8gVarB;
        v7g p7gVar;
        int i;
        int i2;
        e8g e8gVar = h8gVar.a;
        int i3 = e8gVar.n().b;
        q80 q80Var = (q80) this.b;
        int i4 = e8gVar.n().b;
        ActionBarContextView actionBarContextView = q80Var.J0;
        if (actionBarContextView != null && (actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) q80Var.J0.getLayoutParams();
            if (q80Var.J0.isShown()) {
                if (q80Var.p1 == null) {
                    q80Var.p1 = new Rect();
                    q80Var.q1 = new Rect();
                }
                Rect rect = q80Var.p1;
                Rect rect2 = q80Var.q1;
                rect.set(e8gVar.n().a, e8gVar.n().b, e8gVar.n().c, e8gVar.n().d);
                x47 x47VarI = e8gVar.i(2);
                ViewGroup viewGroup = q80Var.O0;
                int i5 = 1;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z = zwf.a;
                    ovf.a(viewGroup, rect, rect2);
                    i2 = 0;
                } else {
                    if (zwf.a) {
                        i2 = 0;
                    } else {
                        zwf.a = true;
                        i2 = 0;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            zwf.b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                zwf.b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = zwf.b;
                    if (method != null) {
                        try {
                            method.invoke(viewGroup, rect, rect2);
                        } catch (Exception e) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e);
                        }
                    }
                }
                int i6 = i2;
                x47 x47VarB = x47.b(Math.max(i6, x47VarI.a - rect2.left), Math.max(i6, x47VarI.b - rect2.top), Math.max(i6, x47VarI.c - rect2.right), Math.max(i6, x47VarI.d - rect2.bottom));
                int i7 = x47VarB.c;
                int i8 = marginLayoutParams.leftMargin;
                int i9 = x47VarB.a;
                if (i8 == i9 && marginLayoutParams.rightMargin == i7) {
                    i5 = i6;
                } else {
                    marginLayoutParams.leftMargin = i9;
                    marginLayoutParams.rightMargin = i7;
                }
                ActionBarContextView actionBarContextView2 = q80Var.J0;
                int i10 = rect.left - i9;
                int i11 = rect.top;
                int i12 = rect.right - i7;
                actionBarContextView2.M0 = i10;
                actionBarContextView2.N0 = i11;
                actionBarContextView2.O0 = i12;
                actionBarContextView2.k();
                if (!q80Var.U0 && rect.top > 0) {
                    i4 = i6;
                }
                i = i5;
            } else {
                i = 0;
            }
            if (i != 0) {
                q80Var.J0.setLayoutParams(marginLayoutParams);
            }
        }
        if (i3 != i4) {
            int i13 = e8gVar.n().a;
            int i14 = e8gVar.n().c;
            int i15 = e8gVar.n().d;
            int i16 = Build.VERSION.SDK_INT;
            if (i16 >= 36) {
                p7gVar = new u7g(h8gVar);
            } else if (i16 >= 35) {
                p7gVar = new t7g(h8gVar);
            } else if (i16 >= 34) {
                p7gVar = new s7g(h8gVar);
            } else if (i16 >= 31) {
                p7gVar = new r7g(h8gVar);
            } else if (i16 >= 30) {
                p7gVar = new q7g(h8gVar);
            } else {
                p7gVar = i16 >= 29 ? new p7g(h8gVar) : new o7g(h8gVar);
            }
            p7gVar.h(x47.b(i13, i4, i14, i15));
            h8gVarB = p7gVar.b();
        } else {
            h8gVarB = h8gVar;
        }
        WeakHashMap weakHashMap = nvf.a;
        WindowInsets windowInsetsB = h8gVarB.b();
        if (windowInsetsB == null) {
            return h8gVarB;
        }
        WindowInsets windowInsetsOnApplyWindowInsets = view.onApplyWindowInsets(windowInsetsB);
        return !windowInsetsOnApplyWindowInsets.equals(windowInsetsB) ? h8g.c(windowInsetsOnApplyWindowInsets, view) : h8gVarB;
    }

    @Override // defpackage.sl9
    public int j(int i) {
        xg3 xg3Var = (xg3) this.b;
        if (i <= xg3Var.a - 1) {
            return i;
        }
        if (i <= xg3Var.b - 1) {
            return i - 1;
        }
        int i2 = xg3Var.c;
        return i <= i2 + 1 ? i - 2 : i2;
    }

    public void k(zt ztVar, int i) {
        ((ta0) this.b).p().f(ztVar, i);
    }

    public void l(float f, float f2, float f3, float f4, int i) {
        ((ta0) this.b).p().m(f, f2, f3, f4, i);
    }

    public ti8 n(Context context, String str, InputStream inputStream, String str2, String str3) throws IOException {
        ti8 ti8VarE;
        ti8 ti8VarD;
        id5 id5Var;
        kd9 kd9Var = (kd9) this.b;
        if (str2 == null) {
            str2 = "application/json";
        }
        if (str2.contains("application/zip") || str2.contains("application/x-zip") || str2.contains("application/x-zip-compressed") || str.split("\\?")[0].endsWith(".lottie")) {
            gf8.a();
            id5 id5Var2 = id5.ZIP;
            if (str3 != null) {
                File fileO = kd9Var.O(str, inputStream, id5Var2);
                ti8VarE = zh8.e(context, new ZipInputStream(a.b(fileO, new FileInputStream(fileO))), str);
            } else {
                ti8VarE = zh8.e(context, new ZipInputStream(inputStream), null);
            }
            ti8VarD = ti8VarE;
            id5Var = id5Var2;
        } else if (str2.contains("application/gzip") || str2.contains("application/x-gzip") || str.split("\\?")[0].endsWith(".tgs")) {
            gf8.a();
            id5Var = id5.GZIP;
            if (str3 != null) {
                File fileO2 = kd9Var.O(str, inputStream, id5Var);
                GZIPInputStream gZIPInputStream = new GZIPInputStream(a.b(fileO2, new FileInputStream(fileO2)));
                HashMap map = zh8.a;
                ti8VarD = zh8.d(z5c.K(gZIPInputStream), str);
            } else {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                HashMap map2 = zh8.a;
                ti8VarD = zh8.d(z5c.K(gZIPInputStream2), null);
            }
        } else {
            gf8.a();
            id5Var = id5.JSON;
            if (str3 != null) {
                String absolutePath = kd9Var.O(str, inputStream, id5Var).getAbsolutePath();
                FileInputStream fileInputStream = new FileInputStream(absolutePath);
                if (q4.b().o().isTracingEnabled()) {
                    fileInputStream = new d(d.b(absolutePath != null ? new File(absolutePath) : null, fileInputStream));
                }
                HashMap map3 = zh8.a;
                ti8VarD = zh8.d(z5c.K(fileInputStream), str);
            } else {
                HashMap map4 = zh8.a;
                ti8VarD = zh8.d(z5c.K(inputStream), null);
            }
        }
        if (str3 != null && ti8VarD.a != null) {
            File file = new File(kd9Var.J(), kd9.B(str, id5Var, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", ""));
            boolean zRenameTo = file.renameTo(file2);
            file2.toString();
            gf8.a();
            if (!zRenameTo) {
                gf8.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return ti8VarD;
    }

    @Override // defpackage.ha1
    public void p(u91 u91Var, qyb qybVar) {
        boolean z = qybVar.a.F0;
        ab2 ab2Var = (ab2) this.b;
        if (z) {
            ab2Var.complete(qybVar.b);
        } else {
            ab2Var.completeExceptionally(new qs6(qybVar));
        }
    }

    public boolean q(String str) {
        String strX = x(str);
        return "1".equals(strX) || Boolean.parseBoolean(strX);
    }

    @Override // defpackage.an9
    public void r(Exception exc) {
        ((CountDownLatch) this.b).countDown();
    }

    public Integer s(String str) {
        String strX = x(str);
        if (TextUtils.isEmpty(strX)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(strX));
        } catch (NumberFormatException unused) {
            b1.l("NotificationParams", "Couldn't parse value of " + K(str) + "(" + strX + ") into an int");
            return null;
        }
    }

    public JSONArray t(String str) {
        String strX = x(str);
        if (TextUtils.isEmpty(strX)) {
            return null;
        }
        try {
            return new JSONArray(strX);
        } catch (JSONException unused) {
            b1.l("NotificationParams", "Malformed JSON for key " + K(str) + ": " + strX + ", falling back to default");
            return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return "ResolvedFeatureGroup(features=" + ((LinkedHashSet) this.b) + ')';
            case 24:
                StringBuilder sb = new StringBuilder();
                yx7 yx7Var = (yx7) this.b;
                sb.append(yx7Var);
                sb.append(": ");
                sb.append(((Map) gdc.f(yx7Var.x, yx7.Y[0])).keySet());
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public String u(Resources resources, String str, String str2) {
        String[] strArr;
        String strX = x(str2);
        if (!TextUtils.isEmpty(strX)) {
            return strX;
        }
        String strX2 = x(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(strX2)) {
            return null;
        }
        int identifier = resources.getIdentifier(strX2, "string", str);
        if (identifier == 0) {
            b1.l("NotificationParams", K(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray jSONArrayT = t(str2.concat("_loc_args"));
        if (jSONArrayT == null) {
            strArr = null;
        } else {
            int length = jSONArrayT.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = jSONArrayT.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e) {
            b1.n("NotificationParams", "Missing format argument for " + K(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e);
            return null;
        }
    }

    @Override // defpackage.sl9
    public int v(int i) {
        xg3 xg3Var = (xg3) this.b;
        if (i < xg3Var.a) {
            return i;
        }
        if (i < xg3Var.b) {
            return i + 1;
        }
        int i2 = xg3Var.c;
        return i <= i2 ? i + 2 : i2 + 2;
    }

    @Override // defpackage.ha1
    public void w(u91 u91Var, Throwable th) {
        ((ab2) this.b).completeExceptionally(th);
    }

    public String x(String str) {
        Bundle bundle = (Bundle) this.b;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            String strReplace = !str.startsWith("gcm.n.") ? str : str.replace("gcm.n.", "gcm.notification.");
            if (bundle.containsKey(strReplace)) {
                str = strReplace;
            }
        }
        return bundle.getString(str);
    }

    public void y(qh2 qh2Var) {
        qh2Var.getClass();
        for (no0 no0Var : qh2Var.b()) {
            no0Var.getClass();
            ((k79) this.b).n(no0Var, qh2Var.i(no0Var), qh2Var.c(no0Var));
        }
    }

    public void z(float f, float f2, float f3, float f4) {
        ta0 ta0Var = (ta0) this.b;
        vl1 vl1VarP = ta0Var.p();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (ta0Var.z() >> 32)) - (f3 + f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ta0Var.z() & 4294967295L)) - (f4 + f2))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) < 0.0f || Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) < 0.0f) {
            h37.a("Width and height must be greater than or equal to zero");
        }
        ta0Var.R(jFloatToRawIntBits);
        vl1VarP.n(f, f2);
    }

    public vd9(kd9 kd9Var, gec gecVar) {
        this.a = 0;
        this.b = kd9Var;
    }

    public /* synthetic */ vd9(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public vd9(Bundle bundle) {
        this.a = 28;
        this.b = new Bundle(bundle);
    }

    public vd9(int i) {
        this.a = i;
        switch (i) {
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                this.b = new CountDownLatch(1);
                break;
            case 15:
                break;
            case 25:
                zk8 zk8Var = new zk8();
                zk8Var.a = true;
                zk8Var.d = new w79();
                this.b = zk8Var;
                if (!zk8Var.b) {
                    if (zk8Var.c) {
                        fpa.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                    }
                    zk8Var.a();
                    zk8Var.c = true;
                    break;
                }
                break;
            case 29:
                this.b = new HashMap();
                break;
            default:
                this.b = k79.j();
                break;
        }
    }

    public vd9(long j, JSONObject jSONObject) {
        this.a = 19;
        this.b = jSONObject;
    }
}
