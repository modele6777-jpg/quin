package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pw6 {
    public final Context a;
    public qw6 b;
    public Object c;
    public hfe d;
    public final Map e;
    public pv2 f;
    public pv2 g;
    public pv2 h;
    public m81 i;
    public hld j;
    public zdc k;
    public bpa l;
    public Object m;

    public pw6(sw6 sw6Var, Context context) {
        this.a = context;
        this.b = sw6Var.t;
        this.c = sw6Var.b;
        this.d = sw6Var.c;
        this.e = sw6Var.d;
        rw6 rw6Var = sw6Var.s;
        this.f = rw6Var.a;
        this.g = rw6Var.b;
        this.h = rw6Var.c;
        this.i = rw6Var.d;
        this.j = rw6Var.e;
        this.k = rw6Var.f;
        this.l = rw6Var.g;
        this.m = sw6Var.r;
    }

    public final sw6 a() {
        Map mapU;
        r95 r95Var;
        Object obj = this.c;
        if (obj == null) {
            obj = pj9.a;
        }
        Object obj2 = obj;
        hfe hfeVar = this.d;
        Boolean bool = Boolean.FALSE;
        Map map = this.e;
        if (pa7.t(map, bool)) {
            map.getClass();
            mapU = vpf.U(z7f.q(map));
        } else {
            if (!(map instanceof Map)) {
                throw new AssertionError();
            }
            mapU = map;
        }
        Map map2 = mapU;
        map2.getClass();
        qw6 qw6Var = this.b;
        zd5 zd5Var = qw6Var.a;
        m81 m81Var = qw6Var.e;
        m81 m81Var2 = this.i;
        if (m81Var2 == null) {
            m81Var2 = qw6Var.f;
        }
        m81 m81Var3 = m81Var2;
        m81 m81Var4 = qw6Var.g;
        pv2 pv2Var = this.f;
        if (pv2Var == null) {
            pv2Var = qw6Var.b;
        }
        pv2 pv2Var2 = pv2Var;
        pv2 pv2Var3 = this.g;
        if (pv2Var3 == null) {
            pv2Var3 = qw6Var.c;
        }
        pv2 pv2Var4 = pv2Var3;
        pv2 pv2Var5 = this.h;
        if (pv2Var5 == null) {
            pv2Var5 = qw6Var.d;
        }
        pv2 pv2Var6 = pv2Var5;
        qqf qqfVar = qqf.c;
        hld hldVar = this.j;
        if (hldVar == null) {
            hldVar = qw6Var.k;
        }
        hld hldVar2 = hldVar;
        zdc zdcVar = this.k;
        if (zdcVar == null) {
            zdcVar = qw6Var.l;
        }
        zdc zdcVar2 = zdcVar;
        bpa bpaVar = this.l;
        if (bpaVar == null) {
            bpaVar = qw6Var.m;
        }
        bpa bpaVar2 = bpaVar;
        Object obj3 = this.m;
        if (obj3 instanceof p95) {
            r95Var = new r95(vpf.U(((p95) obj3).a));
        } else {
            if (!(obj3 instanceof r95)) {
                throw new AssertionError();
            }
            r95Var = (r95) obj3;
        }
        return new sw6(this.a, obj2, hfeVar, map2, zd5Var, pv2Var2, pv2Var4, pv2Var6, m81Var, m81Var3, m81Var4, qqfVar, qqfVar, qqfVar, hldVar2, zdcVar2, bpaVar2, r95Var, new rw6(this.f, this.g, this.h, this.i, this.j, this.k, this.l), this.b);
    }

    public final p95 b() {
        Object obj = this.m;
        if (obj instanceof p95) {
            return (p95) obj;
        }
        if (!(obj instanceof r95)) {
            throw new AssertionError();
        }
        p95 p95Var = new p95((r95) obj);
        this.m = p95Var;
        return p95Var;
    }

    public pw6(Context context) {
        this.a = context;
        this.b = qw6.o;
        this.c = null;
        this.d = null;
        this.e = qu4.a;
        this.f = null;
        this.g = null;
        this.h = null;
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.m = r95.b;
    }
}
