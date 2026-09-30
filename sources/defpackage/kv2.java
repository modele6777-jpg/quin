package defpackage;

import android.os.SystemClock;
import android.os.Trace;
import androidx.compose.foundation.layout.b;
import com.adjust.sdk.sig.r3;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class kv2 implements na1 {
    public static final /* synthetic */ int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109};

    public static void A(String str, String str2, m8b m8bVar, Throwable th) {
        m8bVar.c(str + str2, th);
    }

    public static /* synthetic */ int B(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ int[] C(int i) {
        int[] iArr = new int[i];
        System.arraycopy(a, 0, iArr, 0, i);
        return iArr;
    }

    public static /* synthetic */ boolean a(int i, int i2) {
        if (i != 0) {
            return i == i2;
        }
        throw null;
    }

    public static long b(long j) {
        Trace.endSection();
        return SystemClock.elapsedRealtimeNanos() - j;
    }

    public static em7 c(kob kobVar, Class cls, mr7 mr7Var, Class cls2) {
        oa7.o(mr7Var, kobVar.b(cls));
        return kobVar.b(cls2);
    }

    public static nt7 d(String str) {
        i37.d(str);
        return new nt7();
    }

    public static j09 e(g09 g09Var, float f, l46 l46Var, g09 g09Var2, float f2) {
        o5c.f(l46Var, b.d(g09Var, f));
        return b.c(g09Var2, f2);
    }

    public static sz9 f(int i, l46 l46Var) {
        sz9 sz9Var = new sz9(i);
        l46Var.p0(sz9Var);
        return sz9Var;
    }

    public static ClassCastException g(Iterator it) {
        it.next().getClass();
        return new ClassCastException();
    }

    public static String h(int i, int i2, String str, String str2, String str3) {
        return str + i + str2 + i2 + str3;
    }

    public static String i(kob kobVar, Class cls, StringBuilder sb, char c) {
        sb.append(fm7.a(kobVar.b(cls)));
        sb.append(c);
        return sb.toString();
    }

    public static String j(String str, float f, String str2) {
        return str + f + str2;
    }

    public static String k(String str, float f, String str2, float f2, String str3) {
        return str + f + str2 + f2 + str3;
    }

    public static String l(String str, ji5 ji5Var, String str2) {
        return str + ji5Var + str2;
    }

    public static String m(String str, String str2, long j) {
        return str + j + str2;
    }

    public static String n(String str, String str2, String str3, Object obj) {
        return str + str2 + str3 + obj;
    }

    public static String o(String str, StringBuilder sb) {
        return str + ((Object) sb);
    }

    public static String p(Object[] objArr, int i, Locale locale, String str, StringBuilder sb) {
        sb.append(String.format(locale, str, Arrays.copyOf(objArr, i)));
        return sb.toString();
    }

    public static StringBuilder q(String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        return sb;
    }

    public static HashMap r(Class cls, qh0 qh0Var) {
        HashMap map = new HashMap();
        map.put(cls, qh0Var);
        return map;
    }

    public static Iterator s(l46 l46Var, j09 j09Var, he2 he2Var, int i, List list) {
        dec.l(he2Var, l46Var, j09Var);
        l46Var.f0(i);
        return list.iterator();
    }

    public static Map t(HashMap map) {
        return Collections.unmodifiableMap(new HashMap(map));
    }

    public static void u(int i, int i2) {
        jcc.k(i2, new Integer(i));
    }

    public static void v(int i, int i2, int i3, int i4, int i5) {
        pqf.D(i);
        pqf.D(i2);
        pqf.D(i3);
        pqf.D(i4);
        pqf.D(i5);
    }

    public static void w(int i, String str, String str2) {
        xo1.V(str2, str + i);
    }

    public static void y(l1f l1fVar, String str, String str2, String str3, String str4) {
        l1fVar.getClass();
        l1fVar.a(str2, str);
        l1fVar.a(str4, str3);
    }

    public static /* synthetic */ void z(Object obj) {
        if (obj == null) {
            return;
        }
        r3.f();
    }
}
