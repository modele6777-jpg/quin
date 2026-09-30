package defpackage;

import android.os.Bundle;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g7c extends hkg {
    public final lqb l;
    public int m = -1;
    public String n = "";
    public final hzc o = izc.a;

    public g7c(Bundle bundle, LinkedHashMap linkedHashMap) {
        this.l = new lqb(3, bundle, linkedHashMap);
    }

    public final Object T0() {
        String str = this.n;
        str.getClass();
        lqb lqbVar = this.l;
        ub9 ub9Var = (ub9) ((LinkedHashMap) lqbVar.c).get(str);
        Object objA = ub9Var != null ? ub9Var.a(str, (Bundle) lqbVar.b) : null;
        if (objA != null) {
            return objA;
        }
        ho7.w(this.n, "Unexpected null value for non-nullable argument ");
        return null;
    }

    @Override // defpackage.om3, defpackage.zf2
    public final hzc a() {
        return this.o;
    }

    @Override // defpackage.om3
    public final Object h(xn7 xn7Var) {
        xn7Var.getClass();
        return T0();
    }

    @Override // defpackage.zf2
    public final int j(nyc nycVar) {
        String strF;
        nycVar.getClass();
        int i = this.m;
        do {
            i++;
            if (i >= nycVar.e()) {
                return -1;
            }
            strF = nycVar.f(i);
            strF.getClass();
        } while (!((Bundle) this.l.b).containsKey(strF));
        this.m = i;
        this.n = strF;
        return i;
    }

    @Override // defpackage.hkg
    public final Object k0() {
        return T0();
    }

    @Override // defpackage.hkg, defpackage.om3
    public final om3 r(nyc nycVar) {
        nycVar.getClass();
        if (m7c.n(nycVar)) {
            this.n = nycVar.f(0);
            this.m = 0;
        }
        return this;
    }

    @Override // defpackage.hkg, defpackage.om3
    public final boolean x() {
        String str = this.n;
        str.getClass();
        lqb lqbVar = this.l;
        ub9 ub9Var = (ub9) ((LinkedHashMap) lqbVar.c).get(str);
        return (ub9Var != null ? ub9Var.a(str, (Bundle) lqbVar.b) : null) != null;
    }
}
