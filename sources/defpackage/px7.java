package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class px7 implements h10 {
    public final szc a;
    public final td7 b;
    public final boolean c;
    public final mz0 d;

    public px7(szc szcVar, td7 td7Var, boolean z) {
        szcVar.getClass();
        td7Var.getClass();
        this.a = szcVar;
        this.b = td7Var;
        this.c = z;
        this.d = ((mf7) szcVar.b).a.c(new x(22, this));
    }

    @Override // defpackage.h10
    public final /* bridge */ boolean E(dx5 dx5Var) {
        return cn1.E(this, dx5Var);
    }

    @Override // defpackage.h10
    public final u00 R(dx5 dx5Var) {
        u00 u00Var;
        dx5Var.getClass();
        td7 td7Var = this.b;
        tmb tmbVarA = td7Var.a(dx5Var);
        if (tmbVarA != null && (u00Var = (u00) this.d.d(tmbVarA)) != null) {
            return u00Var;
        }
        t99 t99Var = sd7.a;
        return sd7.a(dx5Var, td7Var, this.a);
    }

    @Override // defpackage.h10
    public final boolean isEmpty() {
        return this.b.getAnnotations().isEmpty();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        td7 td7Var = this.b;
        c3f c3fVarX = fyc.x(s72.m0(td7Var.getAnnotations()), this.d);
        t99 t99Var = sd7.a;
        return new ue5(new ve5(fyc.s(qd0.S(new cyc[]{c3fVarX, new td0(5, sd7.a(syd.m, td7Var, this.a))})), false, new fnc(23)));
    }
}
