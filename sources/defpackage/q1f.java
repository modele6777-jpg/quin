package defpackage;

import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class q1f {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final jy6 i;
    public final jy6 j;
    public final jy6 k;
    public final jy6 l;
    public final jy6 m;
    public final int n;
    public final int o;
    public final jy6 p;
    public final p1f q;
    public final jy6 r;
    public final jy6 s;
    public final boolean t;
    public final int u;
    public final ny6 v;
    public final ry6 w;

    static {
        new q1f(new pj());
        pqf.D(1);
        pqf.D(2);
        pqf.D(3);
        pqf.D(4);
        kv2.v(5, 6, 7, 8, 9);
        kv2.v(10, 11, 12, 13, 14);
        kv2.v(15, 16, 17, 18, 19);
        kv2.v(20, 21, 22, 23, 24);
        kv2.v(25, 26, 27, 28, 29);
        kv2.v(30, 31, 32, 33, 34);
        pqf.D(35);
        pqf.D(36);
        pqf.D(37);
        pqf.D(38);
    }

    public q1f(pj pjVar) {
        this.a = pjVar.a;
        this.b = pjVar.b;
        this.c = pjVar.c;
        this.d = pjVar.d;
        this.e = pjVar.e;
        this.f = pjVar.f;
        this.g = pjVar.g;
        this.h = pjVar.h;
        this.i = (jy6) pjVar.m;
        this.j = (jy6) pjVar.n;
        this.k = (jy6) pjVar.o;
        this.l = (jy6) pjVar.p;
        this.n = pjVar.i;
        this.m = (jy6) pjVar.q;
        this.o = pjVar.j;
        this.p = (jy6) pjVar.r;
        this.q = (p1f) pjVar.s;
        this.r = (jy6) pjVar.t;
        this.t = pjVar.k;
        this.s = (jy6) pjVar.u;
        this.u = pjVar.l;
        this.v = ny6.c((HashMap) pjVar.v);
        this.w = ry6.n((HashSet) pjVar.w);
    }

    public pj a() {
        pj pjVar = new pj();
        pjVar.f(this);
        return pjVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q1f q1fVar = (q1f) obj;
        return this.a == q1fVar.a && this.b == q1fVar.b && this.c == q1fVar.c && this.d == q1fVar.d && this.h == q1fVar.h && this.e == q1fVar.e && this.f == q1fVar.f && this.g == q1fVar.g && this.i.equals(q1fVar.i) && this.j.equals(q1fVar.j) && this.k.equals(q1fVar.k) && this.l.equals(q1fVar.l) && this.n == q1fVar.n && this.m.equals(q1fVar.m) && this.o == q1fVar.o && this.p.equals(q1fVar.p) && this.q.equals(q1fVar.q) && this.s.equals(q1fVar.s) && this.r.equals(q1fVar.r) && this.t == q1fVar.t && this.u == q1fVar.u && if9.t(this.v, q1fVar.v) && this.w.equals(q1fVar.w);
    }

    public int hashCode() {
        int iHashCode = (this.p.hashCode() + ((((this.m.hashCode() + ((((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((((((((((((((((this.a + 31) * 31) + this.b) * 31) + this.c) * 31) + this.d) * 28629151) + (this.h ? 1 : 0)) * 31) + this.e) * 31) + this.f) * 31) + (this.g ? 1 : 0)) * 31)) * 31)) * 31)) * 961)) * 961) + this.n) * 31)) * 31) + this.o) * 31)) * 31;
        this.q.getClass();
        return this.w.hashCode() + ((this.v.hashCode() + ((((this.s.hashCode() + ((((this.r.hashCode() + ((iHashCode + 29791) * 961)) * 961) + (this.t ? 1 : 0)) * 31)) * 31) + this.u) * 28629151)) * 31);
    }
}
