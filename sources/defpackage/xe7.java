package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xe7 extends df7 implements en7, dn7 {
    public final lw7 c;
    public final lw7 d;
    public final ye7 e;

    public xe7(ye7 ye7Var) {
        ef7 ef7Var = new ef7(this, 0);
        z18 z18Var = z18.b;
        this.c = eb3.N(z18Var, ef7Var);
        this.d = eb3.N(z18Var, new ef7(this, 1));
        this.e = ye7Var;
    }

    @Override // defpackage.xnb, defpackage.wnb
    public final List a() {
        return s72.R0(this.e.a(), this.c.getValue());
    }

    @Override // defpackage.a26
    public final Object d(Object obj) throws xu6 {
        ((xe7) this.e.x.getValue()).call(obj);
        return wef.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof xe7) {
            return pa7.t(this.e, ((xe7) obj).e);
        }
        return false;
    }

    @Override // defpackage.pn7
    public final wn7 f() {
        return this.e;
    }

    @Override // defpackage.cm7
    public final String getName() {
        return "<set-" + this.e.getName() + '>';
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return s72.R0(this.e.getParameters(), this.c.getValue());
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return qyd.e;
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return (sa1) this.d.getValue();
    }

    public final int hashCode() {
        return this.e.hashCode();
    }

    public final String toString() {
        return "setter of " + this.e;
    }

    @Override // defpackage.df7
    public final gf7 y() {
        return this.e;
    }
}
