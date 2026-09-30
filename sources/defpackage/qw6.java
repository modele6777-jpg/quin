package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qw6 {
    public static final qw6 o;
    public final zd5 a;
    public final pv2 b;
    public final pv2 c;
    public final pv2 d;
    public final m81 e;
    public final m81 f;
    public final m81 g;
    public final a26 h;
    public final a26 i;
    public final a26 j;
    public final hld k;
    public final zdc l;
    public final bpa m;
    public final r95 n;

    static {
        qqf qqfVar = qqf.c;
        tl7 tl7Var = zd5.a;
        js3 js3Var = ga4.a;
        hr3 hr3Var = hr3.c;
        tib tibVar = hld.S;
        bpa bpaVar = bpa.a;
        r95 r95Var = r95.b;
        nu4 nu4Var = nu4.a;
        m81 m81Var = m81.a;
        o = new qw6(tl7Var, nu4Var, hr3Var, hr3Var, m81Var, m81Var, m81Var, qqfVar, qqfVar, qqfVar, tibVar, zdc.b, bpaVar, r95Var);
    }

    public qw6(zd5 zd5Var, pv2 pv2Var, pv2 pv2Var2, pv2 pv2Var3, m81 m81Var, m81 m81Var2, m81 m81Var3, a26 a26Var, a26 a26Var2, a26 a26Var3, hld hldVar, zdc zdcVar, bpa bpaVar, r95 r95Var) {
        this.a = zd5Var;
        this.b = pv2Var;
        this.c = pv2Var2;
        this.d = pv2Var3;
        this.e = m81Var;
        this.f = m81Var2;
        this.g = m81Var3;
        this.h = a26Var;
        this.i = a26Var2;
        this.j = a26Var3;
        this.k = hldVar;
        this.l = zdcVar;
        this.m = bpaVar;
        this.n = r95Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw6)) {
            return false;
        }
        qw6 qw6Var = (qw6) obj;
        return pa7.t(this.a, qw6Var.a) && pa7.t(this.b, qw6Var.b) && pa7.t(this.c, qw6Var.c) && pa7.t(this.d, qw6Var.d) && this.e == qw6Var.e && this.f == qw6Var.f && this.g == qw6Var.g && pa7.t(this.h, qw6Var.h) && pa7.t(this.i, qw6Var.i) && pa7.t(this.j, qw6Var.j) && pa7.t(this.k, qw6Var.k) && this.l == qw6Var.l && this.m == qw6Var.m && pa7.t(this.n, qw6Var.n);
    }

    public final int hashCode() {
        return this.n.a.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Defaults(fileSystem=" + this.a + ", interceptorCoroutineContext=" + this.b + ", fetcherCoroutineContext=" + this.c + ", decoderCoroutineContext=" + this.d + ", memoryCachePolicy=" + this.e + ", diskCachePolicy=" + this.f + ", networkCachePolicy=" + this.g + ", placeholderFactory=" + this.h + ", errorFactory=" + this.i + ", fallbackFactory=" + this.j + ", sizeResolver=" + this.k + ", scale=" + this.l + ", precision=" + this.m + ", extras=" + this.n + ")";
    }
}
