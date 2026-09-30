package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p49 {
    public final d1f a;
    public final n1f b;
    public final k1f c;
    public final o5f d;
    public final boolean e;
    public final boolean f;
    public int g;
    public rr5 h;

    public p49(d1f d1fVar, n1f n1fVar, k1f k1fVar) {
        this.a = d1fVar;
        this.b = n1fVar;
        this.c = k1fVar;
        int i = d1fVar.b;
        rr5 rr5Var = d1fVar.g;
        this.e = i == 2;
        this.f = Objects.equals(rr5Var.p, "application/x-itut-t35");
        this.d = "audio/true-hd".equals(rr5Var.p) ? new o5f() : null;
    }
}
