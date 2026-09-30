package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.sig.r3;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class au3 {
    public static final is9 k = new pa2(new qu(7));
    public g55 a;
    public lp3 b;
    public final Context c;
    public final qfc d;
    public vt3 e;
    public vt3 f;
    public volatile Thread g;
    public iud h;
    public xi0 i;
    public Boolean j;

    public au3(Context context) {
        qfc qfcVar = new qfc();
        vt3 vt3Var = vt3.G;
        this.c = context != null ? context.getApplicationContext() : null;
        this.d = qfcVar;
        if (vt3Var == null) {
            vt3Var.getClass();
            ut3 ut3Var = new ut3(vt3Var);
            ut3Var.f(vt3Var);
            vt3Var = new vt3(ut3Var);
        }
        this.e = vt3Var;
        this.f = vt3Var;
        this.i = xi0.b;
        if (vt3Var.B && context == null) {
            xo1.V("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
    }

    public static void a(zl8 zl8Var, vt3 vt3Var, m55[] m55VarArr) {
        int i = zl8Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            i1f i1fVar = zl8Var.c[i2];
            Map map = (Map) vt3Var.E.get(i2);
            if (map != null && map.containsKey(i1fVar)) {
                Map map2 = (Map) vt3Var.E.get(i2);
                if (map2 != null && map2.get(i1fVar) != null) {
                    r3.f();
                    return;
                }
                m55VarArr[i2] = null;
            }
        }
    }

    public static void b(zl8 zl8Var, vt3 vt3Var, m55[] m55VarArr) {
        for (int i = 0; i < zl8Var.a; i++) {
            int i2 = zl8Var.b[i];
            if (vt3Var.F.get(i) || vt3Var.w.contains(Integer.valueOf(i2))) {
                m55VarArr[i] = null;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0050  */
    public static void c(zl8 zl8Var, vt3 vt3Var, m55[] m55VarArr) {
        m55 m55Var;
        int i = zl8Var.a;
        i1f[] i1fVarArr = zl8Var.c;
        HashMap map = new HashMap();
        for (int i2 = 0; i2 < i; i2++) {
            d(i1fVarArr[i2], vt3Var, map);
        }
        d(zl8Var.f, vt3Var, map);
        for (int i3 = 0; i3 < i; i3++) {
            o1f o1fVar = (o1f) map.get(Integer.valueOf(zl8Var.b[i3]));
            if (o1fVar != null) {
                h1f h1fVar = o1fVar.a;
                jy6 jy6Var = o1fVar.b;
                if (jy6Var.isEmpty()) {
                    m55Var = null;
                } else {
                    int iIndexOf = i1fVarArr[i3].b.indexOf(h1fVar);
                    if (iIndexOf < 0) {
                        iIndexOf = -1;
                    }
                    if (iIndexOf != -1) {
                        m55Var = new m55(h1fVar, rxg.Z(jy6Var));
                    } else {
                        m55Var = null;
                    }
                }
                m55VarArr[i3] = m55Var;
            }
        }
    }

    public static void d(i1f i1fVar, q1f q1fVar, HashMap map) {
        for (int i = 0; i < i1fVar.a; i++) {
            o1f o1fVar = (o1f) q1fVar.v.get(i1fVar.a(i));
            if (o1fVar != null) {
                int i2 = o1fVar.a.c;
                o1f o1fVar2 = (o1f) map.get(Integer.valueOf(i2));
                if (o1fVar2 == null || (o1fVar2.b.isEmpty() && !o1fVar.b.isEmpty())) {
                    map.put(Integer.valueOf(i2), o1fVar);
                }
            }
        }
    }

    public static Pair e(m55[] m55VarArr, int i) {
        for (int i2 = 0; i2 < m55VarArr.length; i2++) {
            m55 m55Var = m55VarArr[i2];
            if (m55Var != null && m55Var.a.c == i) {
                return Pair.create(m55Var, Integer.valueOf(i2));
            }
        }
        return null;
    }

    public static int f(rr5 rr5Var, jy6 jy6Var) {
        for (int i = 0; i < jy6Var.size(); i++) {
            for (int i2 = 0; i2 < rr5Var.c.size(); i2++) {
                if (((fu7) rr5Var.c.get(i2)).b.equals(jy6Var.get(i))) {
                    return i;
                }
            }
        }
        return Integer.MAX_VALUE;
    }

    public static int g(rr5 rr5Var, String str, boolean z) {
        if (!TextUtils.isEmpty(str) && str.equals(rr5Var.d)) {
            return 4;
        }
        String strH = h(str);
        String strH2 = h(rr5Var.d);
        if (strH2 == null || strH == null) {
            return (z && strH2 == null) ? 1 : 0;
        }
        if (strH2.startsWith(strH) || strH.startsWith(strH2)) {
            return 3;
        }
        String str2 = pqf.a;
        return strH2.split("-", 2)[0].equals(strH.split("-", 2)[0]) ? 2 : 0;
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "und")) {
            return null;
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0049  */
    public static m55 j(i1f i1fVar, int[][] iArr, vt3 vt3Var) {
        vt3Var.q.getClass();
        h1f h1fVar = null;
        tt3 tt3Var = null;
        int i = 0;
        for (int i2 = 0; i2 < i1fVar.a; i2++) {
            h1f h1fVarA = i1fVar.a(i2);
            int[] iArr2 = iArr[i2];
            for (int i3 = 0; i3 < h1fVarA.a; i3++) {
                if (hu0.n(iArr2[i3], vt3Var.C)) {
                    tt3 tt3Var2 = new tt3(h1fVarA.d[i3], iArr2[i3]);
                    if (tt3Var != null) {
                        if (ta2.a.c(tt3Var2.b, tt3Var.b).c(tt3Var2.a, tt3Var.a).e() > 0) {
                            h1fVar = h1fVarA;
                            i = i3;
                            tt3Var = tt3Var2;
                        }
                    } else {
                        h1fVar = h1fVarA;
                        i = i3;
                        tt3Var = tt3Var2;
                    }
                }
            }
        }
        if (h1fVar == null) {
            return null;
        }
        return new m55(h1fVar, i);
    }

    public static Pair k(int i, zl8 zl8Var, int[][][] iArr, xt3 xt3Var, Comparator comparator) {
        int i2;
        RandomAccess randomAccessS;
        zl8 zl8Var2 = zl8Var;
        ArrayList arrayList = new ArrayList();
        int i3 = zl8Var2.a;
        int i4 = 0;
        while (i4 < i3) {
            if (i == zl8Var2.b[i4]) {
                i1f i1fVar = zl8Var2.c[i4];
                for (int i5 = 0; i5 < i1fVar.a; i5++) {
                    h1f h1fVarA = i1fVar.a(i5);
                    yob yobVarK = xt3Var.k(i4, h1fVarA, iArr[i4][i5]);
                    int i6 = h1fVarA.a;
                    boolean[] zArr = new boolean[i6];
                    int i7 = 0;
                    while (i7 < i6) {
                        yt3 yt3Var = (yt3) yobVarK.get(i7);
                        int iA = yt3Var.a();
                        if (zArr[i7] || iA == 0) {
                            i2 = i3;
                        } else {
                            if (iA == 1) {
                                randomAccessS = jy6.s(yt3Var);
                            } else {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.add(yt3Var);
                                int i8 = i7 + 1;
                                while (i8 < i6) {
                                    yt3 yt3Var2 = (yt3) yobVarK.get(i8);
                                    int i9 = i3;
                                    if (yt3Var2.a() == 2 && yt3Var.b(yt3Var2)) {
                                        arrayList2.add(yt3Var2);
                                        zArr[i8] = true;
                                    }
                                    i8++;
                                    i3 = i9;
                                }
                                randomAccessS = arrayList2;
                            }
                            i2 = i3;
                            arrayList.add(randomAccessS);
                        }
                        i7++;
                        i3 = i2;
                    }
                }
            }
            i4++;
            zl8Var2 = zl8Var;
            i3 = i3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        List list = (List) Collections.max(arrayList, comparator);
        int[] iArr2 = new int[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            iArr2[i10] = ((yt3) list.get(i10)).c;
        }
        yt3 yt3Var3 = (yt3) list.get(0);
        return Pair.create(new m55(yt3Var3.b, iArr2), Integer.valueOf(yt3Var3.a));
    }

    public final void i(q1f q1fVar) {
        if (q1fVar == null) {
            return;
        }
        if (q1fVar instanceof vt3) {
            this.f = (vt3) q1fVar;
            return;
        }
        ut3 ut3Var = new ut3(this.f);
        ut3Var.f(q1fVar);
        this.f = new vt3(ut3Var);
    }

    public final void l(q1f q1fVar) {
        if (q1fVar instanceof vt3) {
            m((vt3) q1fVar);
        }
        ut3 ut3Var = new ut3(this.e);
        ut3Var.f(q1fVar);
        m(new vt3(ut3Var));
    }

    public final void m(vt3 vt3Var) {
        boolean zEquals = this.e.equals(vt3Var);
        this.e = vt3Var;
        if (zEquals) {
            return;
        }
        if (vt3Var.B && this.c == null) {
            xo1.V("DefaultTrackSelector", "Audio channel count constraints cannot be applied without reference to Context. Build the track selector instance with one of the non-deprecated constructors that take a Context argument.");
        }
        g55 g55Var = this.a;
        if (g55Var != null) {
            g55Var.g.c(10, vt3Var).b();
        }
    }
}
