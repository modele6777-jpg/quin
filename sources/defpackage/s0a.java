package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0a {
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final List f;
    public final List g;
    public final List h;
    public final long i;
    public final boolean j;
    public final dj6 k;
    public final int l;
    public final r6c m;
    public final et4 n;

    public s0a(int i, int i2, float f, float f2, float f3, List list, List list2, List list3, long j, boolean z, dj6 dj6Var, int i3, r6c r6cVar, et4 et4Var) {
        list.getClass();
        list2.getClass();
        dj6Var.getClass();
        r6cVar.getClass();
        et4Var.getClass();
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = list;
        this.g = list2;
        this.h = list3;
        this.i = j;
        this.j = z;
        this.k = dj6Var;
        this.l = i3;
        this.m = r6cVar;
        this.n = et4Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s0a)) {
            return false;
        }
        s0a s0aVar = (s0a) obj;
        return this.a == s0aVar.a && this.b == s0aVar.b && Float.compare(this.c, s0aVar.c) == 0 && Float.compare(this.d, s0aVar.d) == 0 && Float.compare(this.e, s0aVar.e) == 0 && pa7.t(this.f, s0aVar.f) && pa7.t(this.g, s0aVar.g) && pa7.t(this.h, s0aVar.h) && this.i == s0aVar.i && this.j == s0aVar.j && pa7.t(this.k, s0aVar.k) && this.l == s0aVar.l && pa7.t(this.m, s0aVar.m) && pa7.t(this.n, s0aVar.n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public final int hashCode() {
        int iB = ib8.b(tec.a(tec.a(tec.a(ub3.a(this.e, ub3.a(this.d, ub3.a(this.c, ub3.b(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        boolean z = this.j;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return this.n.hashCode() + ((this.m.hashCode() + ub3.b(this.l, (this.k.hashCode() + ((iB + r2) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbN = ib8.n(this.a, this.b, "Party(angle=", ", spread=", ", speed=");
        ks0.w(sbN, this.c, ", maxSpeed=", this.d, ", damping=");
        sbN.append(this.e);
        sbN.append(", size=");
        sbN.append(this.f);
        sbN.append(", colors=");
        sbN.append(this.g);
        sbN.append(", shapes=");
        sbN.append(this.h);
        sbN.append(", timeToLive=");
        sbN.append(this.i);
        sbN.append(", fadeOutEnabled=");
        sbN.append(this.j);
        sbN.append(", position=");
        sbN.append(this.k);
        sbN.append(", delay=");
        sbN.append(this.l);
        sbN.append(", rotation=");
        sbN.append(this.m);
        sbN.append(", emitter=");
        sbN.append(this.n);
        sbN.append(")");
        return sbN.toString();
    }

    public s0a(int i, int i2, float f, float f2, float f3, List list, List list2, List list3, dj6 dj6Var, r6c r6cVar, et4 et4Var) {
        this(i, i2, f, f2, f3, list, list2, list3, 5000L, true, dj6Var, 0, r6cVar, et4Var);
    }
}
