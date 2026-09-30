package defpackage;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zk7 implements dr8 {
    public static final /* synthetic */ wn7[] f = {new aya(zk7.class, "kotlinScopes", "getKotlinScopes()[Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", 0)};
    public final szc b;
    public final yx7 c;
    public final ey7 d;
    public final ee8 e;

    public zk7(szc szcVar, pnb pnbVar, yx7 yx7Var) {
        this.b = szcVar;
        this.c = yx7Var;
        this.d = new ey7(szcVar, pnbVar, yx7Var);
        this.e = new ee8(((mf7) szcVar.b).a, new wj7(1, this));
    }

    @Override // defpackage.dr8
    public final Collection a(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        dr8[] dr8VarArrH = h();
        Collection collectionA = this.d.a(ez3Var, a26Var);
        for (dr8 dr8Var : dr8VarArrH) {
            collectionA = sfc.h(collectionA, dr8Var.a(ez3Var, a26Var));
        }
        return collectionA == null ? xu4.a : collectionA;
    }

    @Override // defpackage.dr8
    public final Collection b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        i(t99Var, lf9Var);
        dr8[] dr8VarArrH = h();
        Collection collectionB = this.d.b(t99Var, lf9Var);
        for (dr8 dr8Var : dr8VarArrH) {
            collectionB = sfc.h(collectionB, dr8Var.b(t99Var, lf9Var));
        }
        return collectionB == null ? xu4.a : collectionB;
    }

    @Override // defpackage.dr8
    public final Set c() {
        dr8[] dr8VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (dr8 dr8Var : dr8VarArrH) {
            x72.g0(linkedHashSet, dr8Var.c());
        }
        linkedHashSet.addAll(this.d.c());
        return linkedHashSet;
    }

    @Override // defpackage.dr8
    public final Set d() {
        dr8[] dr8VarArrH = h();
        dr8VarArrH.getClass();
        HashSet hashSetY = rs0.y(dr8VarArrH.length == 0 ? pu4.a : new sd0(0, dr8VarArrH));
        if (hashSetY == null) {
            return null;
        }
        hashSetY.addAll(this.d.d());
        return hashSetY;
    }

    @Override // defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        i(t99Var, lf9Var);
        ey7 ey7Var = this.d;
        ey7Var.getClass();
        y22 y22Var = null;
        u09 u09VarV = ey7Var.v(t99Var, null);
        if (u09VarV != null) {
            return u09VarV;
        }
        for (dr8 dr8Var : h()) {
            y22 y22VarE = dr8Var.e(t99Var, lf9Var);
            if (y22VarE != null) {
                if (!(y22VarE instanceof z22) || !((tq8) y22VarE).w()) {
                    return y22VarE;
                }
                if (y22Var == null) {
                    y22Var = y22VarE;
                }
            }
        }
        return y22Var;
    }

    @Override // defpackage.dr8
    public final Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        i(t99Var, lf9Var);
        dr8[] dr8VarArrH = h();
        this.d.getClass();
        Collection collectionH = pu4.a;
        for (dr8 dr8Var : dr8VarArrH) {
            collectionH = sfc.h(collectionH, dr8Var.f(t99Var, lf9Var));
        }
        return collectionH == null ? xu4.a : collectionH;
    }

    @Override // defpackage.dr8
    public final Set g() {
        dr8[] dr8VarArrH = h();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (dr8 dr8Var : dr8VarArrH) {
            x72.g0(linkedHashSet, dr8Var.g());
        }
        linkedHashSet.addAll(this.d.g());
        return linkedHashSet;
    }

    public final dr8[] h() {
        return (dr8[]) gdc.f(this.e, f[0]);
    }

    public final void i(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        String str = this.c.f.a.a;
        t99Var.b().getClass();
        str.getClass();
    }

    public final String toString() {
        return "scope for " + this.c;
    }
}
