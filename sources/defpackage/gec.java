package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gec implements yrf, frd, ype, ov2, w8g, ks8, tp5, tc0, wc0, au0, s61, oe1, bn2, c1g, ejb {
    public static final gec b;
    public static final wuc c;
    public final /* synthetic */ int a;
    public static final wuc d = new wuc(1);
    public static final wuc e = new wuc(2);
    public static final wuc f = new wuc(3);
    public static final wuc g = new wuc(4);
    public static final gec v = new gec(3);
    public static final gec w = new gec(4);
    public static final gec x = new gec(5);
    public static final gec y = new gec(6);
    public static final gec z = new gec(7);
    public static final gec X = new gec(8);

    static {
        int i = 0;
        b = new gec(i);
        c = new wuc(i);
    }

    public /* synthetic */ gec(int i) {
        this.a = i;
    }

    public static vr3 A(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) ((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection()));
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.connect();
        return new vr3(httpURLConnection);
    }

    public static kg4 C(String str) {
        Object next;
        str.getClass();
        mx4 mx4Var = kg4.c;
        mx4Var.getClass();
        l2 l2Var = new l2(0, mx4Var);
        while (l2Var.hasNext()) {
            next = l2Var.next();
            if (pa7.t(((kg4) next).b(), str)) {
                return (kg4) next;
            }
        }
        next = null;
        return (kg4) next;
    }

    public static b68 D(List list) {
        return new b68(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public static b68 E(iy9[] iy9VarArr) {
        return K((iy9[]) Arrays.copyOf(iy9VarArr, iy9VarArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(Float.POSITIVE_INFINITY)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L));
    }

    public static long F(float f2, float f3, float f4, float f5, int i) {
        int i2 = y72.l;
        if ((i & 8) != 0) {
            f5 = 1.0f;
        }
        x3c x3cVar = s82.e;
        if (0.0f > f2 || f2 > 360.0f || 0.0f > f3 || f3 > 1.0f || 0.0f > f4 || f4 > 1.0f) {
            StringBuilder sbO = tec.o("HSV (", f2, ", ", f3, ", ");
            sbO.append(f4);
            sbO.append(") must be in range (0..360, 0..1, 0..1)");
            h37.a(sbO.toString());
        }
        return abg.b(G(f2, f3, f4, 5), G(f2, f3, f4, 3), G(f2, f3, f4, 1), f5, x3cVar);
    }

    public static float G(float f2, float f3, float f4, int i) {
        float f5 = ((f2 / 60.0f) + i) % 6.0f;
        return f4 - (Math.max(0.0f, Math.min(f5, Math.min(4.0f - f5, 1.0f))) * (f3 * f4));
    }

    public static LinkedHashSet H(String str, String... strArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str2 : strArr) {
            linkedHashSet.add(str + '.' + str2);
        }
        return linkedHashSet;
    }

    public static LinkedHashSet I(String str, String... strArr) {
        return H("java/lang/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static LinkedHashSet J(String str, String... strArr) {
        return H("java/util/".concat(str), (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static b68 K(iy9[] iy9VarArr, long j, long j2) {
        ArrayList arrayList = new ArrayList(iy9VarArr.length);
        for (iy9 iy9Var : iy9VarArr) {
            y72 y72Var = (y72) iy9Var.e();
            long j3 = y72Var.a;
            arrayList.add(y72Var);
        }
        ArrayList arrayList2 = new ArrayList(iy9VarArr.length);
        for (iy9 iy9Var2 : iy9VarArr) {
            arrayList2.add(Float.valueOf(((Number) iy9Var2.d()).floatValue()));
        }
        return new b68(arrayList, arrayList2, j, j2);
    }

    public static ibb L(List list, long j, float f2) {
        return new ibb(list, null, j, f2);
    }

    public static ibb M(iy9[] iy9VarArr, long j, float f2) {
        ArrayList arrayList = new ArrayList(iy9VarArr.length);
        for (iy9 iy9Var : iy9VarArr) {
            y72 y72Var = (y72) iy9Var.e();
            long j2 = y72Var.a;
            arrayList.add(y72Var);
        }
        ArrayList arrayList2 = new ArrayList(iy9VarArr.length);
        for (iy9 iy9Var2 : iy9VarArr) {
            arrayList2.add(Float.valueOf(((Number) iy9Var2.d()).floatValue()));
        }
        return new ibb(arrayList, arrayList2, j, f2);
    }

    public static b68 N(float f2, int i, List list) {
        return new b68(list, null, (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits((i & 4) != 0 ? Float.POSITIVE_INFINITY : f2)) & 4294967295L));
    }

    public static b68 O(iy9[] iy9VarArr, float f2, float f3, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = Float.POSITIVE_INFINITY;
        }
        return K((iy9[]) Arrays.copyOf(iy9VarArr, iy9VarArr.length), (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L), (((long) Float.floatToRawIntBits(f3)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    public static String[] z(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // defpackage.ks8
    public boolean B(qr8 qr8Var) {
        return false;
    }

    @Override // defpackage.oe1
    public wde c() {
        return wde.b;
    }

    @Override // defpackage.oe1
    public int e() {
        return 1;
    }

    @Override // defpackage.tc0, defpackage.wc0
    public float f() {
        return 0.0f;
    }

    @Override // defpackage.frd
    public int g(int i, int i2, int i3, int i4) {
        return 0;
    }

    @Override // defpackage.ejb, defpackage.prf
    public tt7 getType() {
        throw new IllegalStateException("This method should not be called");
    }

    @Override // defpackage.s61
    public byte[] h(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return bArr2;
    }

    @Override // defpackage.oe1
    public long i() {
        return -1L;
    }

    @Override // defpackage.au0
    public boolean isEmpty() {
        return true;
    }

    @Override // defpackage.w8g
    public s8g j(Activity activity, tw3 tw3Var) {
        n21.i.getClass();
        return new s8g(new h21(m21.a().i(activity)), tw3Var.b(activity));
    }

    @Override // defpackage.bn2
    public long k(long j, long j2) {
        switch (this.a) {
            case 20:
                float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) / Float.intBitsToFloat((int) (j >> 32));
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L)) / Float.intBitsToFloat((int) (j & 4294967295L));
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
                int i = cec.a;
                return jFloatToRawIntBits;
            default:
                if (Float.intBitsToFloat((int) (j >> 32)) <= Float.intBitsToFloat((int) (j2 >> 32)) && Float.intBitsToFloat((int) (j & 4294967295L)) <= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(1.0f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & 4294967295L);
                    int i2 = cec.a;
                    return jFloatToRawIntBits2;
                }
                float fQ = ok8.q(j, j2);
                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(fQ)) << 32) | (((long) Float.floatToRawIntBits(fQ)) & 4294967295L);
                int i3 = cec.a;
                return jFloatToRawIntBits3;
        }
    }

    @Override // defpackage.tc0
    public void m(sw3 sw3Var, int i, int[] iArr, cv7 cv7Var, int[] iArr2) {
        if (cv7Var == cv7.a) {
            xc0.c(i, iArr, iArr2, false);
        } else {
            xc0.c(i, iArr, iArr2, true);
        }
    }

    @Override // defpackage.oe1
    public me1 n() {
        return me1.a;
    }

    @Override // defpackage.au0
    public boolean o(float f2) {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.au0
    public bp7 p() {
        throw new IllegalStateException("not implemented");
    }

    @Override // defpackage.au0
    public boolean q(float f2) {
        return false;
    }

    @Override // defpackage.w8g
    public s8g r(Context context, tw3 tw3Var) {
        context.getClass();
        Context baseContext = context;
        while (true) {
            if (!(baseContext instanceof ContextWrapper)) {
                baseContext = context;
                break;
            }
            if ((baseContext instanceof Activity) || (baseContext instanceof InputMethodService)) {
                break;
            }
            ContextWrapper contextWrapper = (ContextWrapper) baseContext;
            if (contextWrapper.getBaseContext() == null) {
                break;
            }
            baseContext = contextWrapper.getBaseContext();
            baseContext.getClass();
        }
        if (baseContext instanceof Activity) {
            return j((Activity) baseContext, tw3Var);
        }
        if (!(baseContext instanceof InputMethodService) && !(baseContext instanceof Application)) {
            qc0.j("Must provide a UiContext or Application Context");
            return null;
        }
        Object systemService = context.getSystemService("window");
        systemService.getClass();
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        defaultDisplay.getClass();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new s8g(new Rect(0, 0, point.x, point.y), tw3Var.b(context));
    }

    @Override // defpackage.c1g
    public WebViewClient s(Context context) {
        return new e9b(context);
    }

    @Override // defpackage.oe1
    public ke1 t() {
        return ke1.a;
    }

    public String toString() {
        switch (this.a) {
            case 3:
                return "Start";
            case 5:
                return "TextFieldLineLimits.SingleLine";
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return "Arrangement#SpaceEvenly";
            case 19:
                return "CompositionErrorContext";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.au0
    public float u() {
        return 1.0f;
    }

    @Override // defpackage.au0
    public float v() {
        return 0.0f;
    }

    @Override // defpackage.wc0
    public void w(sw3 sw3Var, int i, int[] iArr, int[] iArr2) {
        xc0.c(i, iArr, iArr2, false);
    }

    @Override // defpackage.yrf
    public Object x(cj7 cj7Var, float f2) {
        boolean z2 = cj7Var.l() == 1;
        if (z2) {
            cj7Var.beginArray();
        }
        float fNextDouble = (float) cj7Var.nextDouble();
        float fNextDouble2 = (float) cj7Var.nextDouble();
        while (cj7Var.hasNext()) {
            cj7Var.skipValue();
        }
        if (z2) {
            cj7Var.endArray();
        }
        return new fec((fNextDouble / 100.0f) * f2, (fNextDouble2 / 100.0f) * f2);
    }

    @Override // defpackage.oe1
    public le1 y() {
        return le1.a;
    }

    @Override // defpackage.ks8
    public void d(qr8 qr8Var, boolean z2) {
    }

    @Override // defpackage.c1g
    public void l(WebView webView, Context context) {
    }
}
