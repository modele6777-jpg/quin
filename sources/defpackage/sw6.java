package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sw6 {
    public final Context a;
    public final Object b;
    public final hfe c;
    public final Map d;
    public final zd5 e;
    public final pv2 f;
    public final pv2 g;
    public final pv2 h;
    public final m81 i;
    public final m81 j;
    public final m81 k;
    public final a26 l;
    public final a26 m;
    public final a26 n;
    public final hld o;
    public final zdc p;
    public final bpa q;
    public final r95 r;
    public final rw6 s;
    public final qw6 t;

    public sw6(Context context, Object obj, hfe hfeVar, Map map, zd5 zd5Var, pv2 pv2Var, pv2 pv2Var2, pv2 pv2Var3, m81 m81Var, m81 m81Var2, m81 m81Var3, a26 a26Var, a26 a26Var2, a26 a26Var3, hld hldVar, zdc zdcVar, bpa bpaVar, r95 r95Var, rw6 rw6Var, qw6 qw6Var) {
        this.a = context;
        this.b = obj;
        this.c = hfeVar;
        this.d = map;
        this.e = zd5Var;
        this.f = pv2Var;
        this.g = pv2Var2;
        this.h = pv2Var3;
        this.i = m81Var;
        this.j = m81Var2;
        this.k = m81Var3;
        this.l = a26Var;
        this.m = a26Var2;
        this.n = a26Var3;
        this.o = hldVar;
        this.p = zdcVar;
        this.q = bpaVar;
        this.r = r95Var;
        this.s = rw6Var;
        this.t = qw6Var;
    }

    public static pw6 a(sw6 sw6Var) {
        Context context = sw6Var.a;
        sw6Var.getClass();
        return new pw6(sw6Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sw6)) {
            return false;
        }
        sw6 sw6Var = (sw6) obj;
        return pa7.t(this.a, sw6Var.a) && this.b.equals(sw6Var.b) && pa7.t(this.c, sw6Var.c) && this.d.equals(sw6Var.d) && pa7.t(this.e, sw6Var.e) && pa7.t(this.f, sw6Var.f) && pa7.t(this.g, sw6Var.g) && pa7.t(this.h, sw6Var.h) && this.i == sw6Var.i && this.j == sw6Var.j && this.k == sw6Var.k && pa7.t(this.l, sw6Var.l) && pa7.t(this.m, sw6Var.m) && pa7.t(this.n, sw6Var.n) && pa7.t(this.o, sw6Var.o) && this.p == sw6Var.p && this.q == sw6Var.q && this.r.equals(sw6Var.r) && this.s.equals(sw6Var.s) && pa7.t(this.t, sw6Var.t);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        hfe hfeVar = this.c;
        return this.t.hashCode() + ((this.s.hashCode() + ib8.c(this.r.a, (this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((this.k.hashCode() + ((this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ib8.c(this.d, (iHashCode + (hfeVar == null ? 0 : hfeVar.hashCode())) * 29791, 961)) * 29791)) * 31)) * 31)) * 31)) * 31)) * 31)) * 961)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31)) * 31);
    }

    public final String toString() {
        return "ImageRequest(context=" + this.a + ", data=" + this.b + ", target=" + this.c + ", listener=null, memoryCacheKey=null, memoryCacheKeyExtras=" + this.d + ", diskCacheKey=null, fileSystem=" + this.e + ", fetcherFactory=null, decoderFactory=null, interceptorCoroutineContext=" + this.f + ", fetcherCoroutineContext=" + this.g + ", decoderCoroutineContext=" + this.h + ", memoryCachePolicy=" + this.i + ", diskCachePolicy=" + this.j + ", networkCachePolicy=" + this.k + ", placeholderMemoryCacheKey=null, placeholderFactory=" + this.l + ", errorFactory=" + this.m + ", fallbackFactory=" + this.n + ", sizeResolver=" + this.o + ", scale=" + this.p + ", precision=" + this.q + ", extras=" + this.r + ", defined=" + this.s + ", defaults=" + this.t + ")";
    }
}
