package defpackage;

import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tu7 {
    public final List a;
    public final uh8 b;
    public final String c;
    public final long d;
    public final int e;
    public final long f;
    public final String g;
    public final List h;
    public final qx i;
    public final int j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final float o;
    public final float p;
    public final kx q;
    public final a90 r;
    public final lx s;
    public final List t;
    public final int u;
    public final boolean v;
    public final vd9 w;
    public final a82 x;
    public final int y;

    public tu7(List list, uh8 uh8Var, String str, long j, int i, long j2, String str2, List list2, qx qxVar, int i2, int i3, int i4, float f, float f2, float f3, float f4, kx kxVar, a90 a90Var, List list3, int i5, lx lxVar, boolean z, vd9 vd9Var, a82 a82Var, int i6) {
        this.a = list;
        this.b = uh8Var;
        this.c = str;
        this.d = j;
        this.e = i;
        this.f = j2;
        this.g = str2;
        this.h = list2;
        this.i = qxVar;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = f;
        this.n = f2;
        this.o = f3;
        this.p = f4;
        this.q = kxVar;
        this.r = a90Var;
        this.t = list3;
        this.u = i5;
        this.s = lxVar;
        this.v = z;
        this.w = vd9Var;
        this.x = a82Var;
        this.y = i6;
    }

    public final String a(String str) {
        int i;
        StringBuilder sb = new StringBuilder(str);
        sb.append(this.c);
        sb.append("\n");
        long j = this.f;
        uh8 uh8Var = this.b;
        tu7 tu7Var = (tu7) uh8Var.i.c(j);
        if (tu7Var != null) {
            sb.append("\t\tParents: ");
            sb.append(tu7Var.c);
            for (tu7 tu7Var2 = (tu7) uh8Var.i.c(tu7Var.f); tu7Var2 != null; tu7Var2 = (tu7) uh8Var.i.c(tu7Var2.f)) {
                sb.append("->");
                sb.append(tu7Var2.c);
            }
            sb.append(str);
            sb.append("\n");
        }
        List list = this.h;
        if (!list.isEmpty()) {
            sb.append(str);
            sb.append("\tMasks: ");
            sb.append(list.size());
            sb.append("\n");
        }
        int i2 = this.j;
        if (i2 != 0 && (i = this.k) != 0) {
            sb.append(str);
            sb.append("\tBackground: ");
            sb.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf(this.l)));
        }
        List list2 = this.a;
        if (!list2.isEmpty()) {
            sb.append(str);
            sb.append("\tShapes:\n");
            for (Object obj : list2) {
                sb.append(str);
                sb.append("\t\t");
                sb.append(obj);
                sb.append("\n");
            }
        }
        return sb.toString();
    }

    public final String toString() {
        return a("");
    }
}
