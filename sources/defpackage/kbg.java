package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kbg {
    public final String a;
    public final vag b;
    public final bb3 c;
    public final long d;
    public final long e;
    public final long f;
    public final jl2 g;
    public final int h;
    public final us0 i;
    public final long j;
    public final long k;
    public final int l;
    public final int m;
    public final long n;
    public final int o;
    public final List p;
    public final List q;

    public kbg(String str, vag vagVar, bb3 bb3Var, long j, long j2, long j3, jl2 jl2Var, int i, us0 us0Var, long j4, long j5, int i2, int i3, long j6, int i4, List list, List list2) {
        str.getClass();
        bb3Var.getClass();
        this.a = str;
        this.b = vagVar;
        this.c = bb3Var;
        this.d = j;
        this.e = j2;
        this.f = j3;
        this.g = jl2Var;
        this.h = i;
        this.i = us0Var;
        this.j = j4;
        this.k = j5;
        this.l = i2;
        this.m = i3;
        this.n = j6;
        this.o = i4;
        this.p = list;
        this.q = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbg)) {
            return false;
        }
        kbg kbgVar = (kbg) obj;
        return pa7.t(this.a, kbgVar.a) && this.b == kbgVar.b && pa7.t(this.c, kbgVar.c) && this.d == kbgVar.d && this.e == kbgVar.e && this.f == kbgVar.f && this.g.equals(kbgVar.g) && this.h == kbgVar.h && this.i == kbgVar.i && this.j == kbgVar.j && this.k == kbgVar.k && this.l == kbgVar.l && this.m == kbgVar.m && this.n == kbgVar.n && this.o == kbgVar.o && this.p.equals(kbgVar.p) && this.q.equals(kbgVar.q);
    }

    public final int hashCode() {
        return this.q.hashCode() + tec.a(ub3.b(this.o, ib8.b(ub3.b(this.m, ub3.b(this.l, ib8.b(ib8.b((this.i.hashCode() + ub3.b(this.h, (this.g.hashCode() + ib8.b(ib8.b(ib8.b((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31, this.f)) * 31, 31)) * 31, 31, this.j), 31, this.k), 31), 31), 31, this.n), 31), 31, this.p);
    }

    public final String toString() {
        return "WorkInfoPojo(id=" + this.a + ", state=" + this.b + ", output=" + this.c + ", initialDelay=" + this.d + ", intervalDuration=" + this.e + ", flexDuration=" + this.f + ", constraints=" + this.g + ", runAttemptCount=" + this.h + ", backoffPolicy=" + this.i + ", backoffDelayDuration=" + this.j + ", lastEnqueueTime=" + this.k + ", periodCount=" + this.l + ", generation=" + this.m + ", nextScheduleTimeOverride=" + this.n + ", stopReason=" + this.o + ", tags=" + this.p + ", progress=" + this.q + ')';
    }
}
