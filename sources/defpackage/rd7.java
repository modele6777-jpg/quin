package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class rd7 implements wna {
    public static final /* synthetic */ wn7[] e = {new aya(rd7.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};
    public final dx5 a;
    public final ntd b;
    public final ee8 c;
    public final umb d;

    public rd7(szc szcVar, tmb tmbVar, dx5 dx5Var) {
        szcVar.getClass();
        mf7 mf7Var = (mf7) szcVar.b;
        dx5Var.getClass();
        this.a = dx5Var;
        this.b = tmbVar != null ? m8c.B(tmbVar) : ntd.T;
        this.c = new ee8(mf7Var.a, new n5(szcVar, this, false, 13));
        this.d = tmbVar != null ? (umb) s72.w0(tmbVar.b()) : null;
    }

    @Override // defpackage.u00
    public final ntd e() {
        return this.b;
    }

    @Override // defpackage.u00
    public final dx5 f() {
        return this.a;
    }

    @Override // defpackage.u00
    public Map g() {
        return qu4.a;
    }

    @Override // defpackage.u00
    public final tt7 getType() {
        Object objF = gdc.f(this.c, e[0]);
        objF.getClass();
        return (tjd) objF;
    }
}
