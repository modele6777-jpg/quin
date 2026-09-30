package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class gia implements nyc, x81 {
    public final String a;
    public final w56 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final lw7 i;
    public final lw7 j;
    public final lw7 k;

    public gia(String str, w56 w56Var, int i) {
        this.a = str;
        this.b = w56Var;
        this.c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = qu4.a;
        x16 x16Var = new x16(this) { // from class: fia
            public final /* synthetic */ gia b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                ArrayList arrayList;
                int i5 = i2;
                gia giaVar = this.b;
                switch (i5) {
                    case 0:
                        w56 w56Var2 = giaVar.b;
                        return w56Var2 != null ? w56Var2.d() : lmg.v;
                    case 1:
                        w56 w56Var3 = giaVar.b;
                        if (w56Var3 != null) {
                            xn7[] xn7VarArrB = w56Var3.b();
                            arrayList = new ArrayList(xn7VarArrB.length);
                            for (xn7 xn7Var : xn7VarArrB) {
                                arrayList.add(xn7Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return hkg.e0(arrayList);
                    default:
                        return Integer.valueOf(cn1.F(giaVar, (nyc[]) giaVar.j.getValue()));
                }
            }
        };
        z18 z18Var = z18.b;
        this.i = eb3.N(z18Var, x16Var);
        final int i5 = 1;
        this.j = eb3.N(z18Var, new x16(this) { // from class: fia
            public final /* synthetic */ gia b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                ArrayList arrayList;
                int i6 = i5;
                gia giaVar = this.b;
                switch (i6) {
                    case 0:
                        w56 w56Var2 = giaVar.b;
                        return w56Var2 != null ? w56Var2.d() : lmg.v;
                    case 1:
                        w56 w56Var3 = giaVar.b;
                        if (w56Var3 != null) {
                            xn7[] xn7VarArrB = w56Var3.b();
                            arrayList = new ArrayList(xn7VarArrB.length);
                            for (xn7 xn7Var : xn7VarArrB) {
                                arrayList.add(xn7Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return hkg.e0(arrayList);
                    default:
                        return Integer.valueOf(cn1.F(giaVar, (nyc[]) giaVar.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = eb3.N(z18Var, new x16(this) { // from class: fia
            public final /* synthetic */ gia b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                ArrayList arrayList;
                int i7 = i6;
                gia giaVar = this.b;
                switch (i7) {
                    case 0:
                        w56 w56Var2 = giaVar.b;
                        return w56Var2 != null ? w56Var2.d() : lmg.v;
                    case 1:
                        w56 w56Var3 = giaVar.b;
                        if (w56Var3 != null) {
                            xn7[] xn7VarArrB = w56Var3.b();
                            arrayList = new ArrayList(xn7VarArrB.length);
                            for (xn7 xn7Var : xn7VarArrB) {
                                arrayList.add(xn7Var.e());
                            }
                        } else {
                            arrayList = null;
                        }
                        return hkg.e0(arrayList);
                    default:
                        return Integer.valueOf(cn1.F(giaVar, (nyc[]) giaVar.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.nyc
    public final String a() {
        return this.a;
    }

    @Override // defpackage.x81
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.nyc
    public final int d(String str) {
        str.getClass();
        Integer num = (Integer) this.h.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    @Override // defpackage.nyc
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gia) {
            nyc nycVar = (nyc) obj;
            if (this.a.equals(nycVar.a()) && Arrays.equals((nyc[]) this.j.getValue(), (nyc[]) ((gia) obj).j.getValue())) {
                int iE = nycVar.e();
                int i = this.c;
                if (i == iE) {
                    for (int i2 = 0; i2 < i; i2++) {
                        if (pa7.t(i(i2).a(), nycVar.i(i2).a()) && pa7.t(i(i2).g(), nycVar.i(i2).g())) {
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
        return this.e[i];
    }

    @Override // defpackage.nyc
    public iec g() {
        return g5e.c;
    }

    @Override // defpackage.nyc
    public final List getAnnotations() {
        return pu4.a;
    }

    @Override // defpackage.nyc
    public final List h(int i) {
        List list = this.f[i];
        return list == null ? pu4.a : list;
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    @Override // defpackage.nyc
    public nyc i(int i) {
        return ((xn7[]) this.i.getValue())[i].e();
    }

    @Override // defpackage.nyc
    public final boolean j(int i) {
        return this.g[i];
    }

    public final void k(String str, boolean z) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = z;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap map = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                map.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = map;
        }
    }

    public String toString() {
        return cn1.U(this);
    }
}
