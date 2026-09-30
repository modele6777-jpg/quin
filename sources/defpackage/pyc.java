package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pyc implements nyc, x81 {
    public final String a;
    public final iec b;
    public final int c;
    public final List d;
    public final HashSet e;
    public final String[] f;
    public final nyc[] g;
    public final List[] h;
    public final boolean[] i;
    public final Map j;
    public final nyc[] k;
    public final ace l;

    public pyc(String str, iec iecVar, int i, List list, q22 q22Var) {
        this.a = str;
        this.b = iecVar;
        this.c = i;
        this.d = q22Var.b;
        ArrayList arrayList = q22Var.c;
        this.e = s72.h1(arrayList);
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.f = strArr;
        this.g = hkg.e0(q22Var.e);
        this.h = (List[]) q22Var.f.toArray(new List[0]);
        this.i = s72.e1(q22Var.g);
        strArr.getClass();
        sd0 sd0Var = new sd0(1, new p(8, strArr));
        ArrayList arrayList2 = new ArrayList(t72.u(sd0Var, 10));
        Iterator it = sd0Var.iterator();
        while (true) {
            iq4 iq4Var = (iq4) it;
            if (!iq4Var.b.hasNext()) {
                this.j = bm8.W(arrayList2);
                this.k = hkg.e0(list);
                this.l = new ace(new hla(21, this));
                return;
            }
            n17 n17Var = (n17) iq4Var.next();
            arrayList2.add(new iy9(n17Var.b, Integer.valueOf(n17Var.a)));
        }
    }

    @Override // defpackage.nyc
    public final String a() {
        return this.a;
    }

    @Override // defpackage.x81
    public final Set b() {
        return this.e;
    }

    @Override // defpackage.nyc
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.j.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.nyc
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pyc) {
            nyc nycVar = (nyc) obj;
            if (this.a.equals(nycVar.a()) && Arrays.equals(this.k, ((pyc) obj).k)) {
                int iE = nycVar.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        nyc[] nycVarArr = this.g;
                        if (pa7.t(nycVarArr[i2].a(), nycVar.i(i2).a()) && pa7.t(nycVarArr[i2].g(), nycVar.i(i2).g())) {
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.nyc
    public final String f(int i) {
        return this.f[i];
    }

    @Override // defpackage.nyc
    public final iec g() {
        return this.b;
    }

    @Override // defpackage.nyc
    public final List getAnnotations() {
        return this.d;
    }

    @Override // defpackage.nyc
    public final List h(int i) {
        return this.h[i];
    }

    public final int hashCode() {
        return ((Number) this.l.getValue()).intValue();
    }

    @Override // defpackage.nyc
    public final nyc i(int i) {
        return this.g[i];
    }

    @Override // defpackage.nyc
    public final boolean j(int i) {
        return this.i[i];
    }

    public final String toString() {
        return cn1.U(this);
    }
}
