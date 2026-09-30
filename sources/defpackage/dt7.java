package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dt7 extends at7 implements dn7 {
    public final lw7 c;
    public final lw7 d;

    public dt7() {
        ct7 ct7Var = new ct7(this, 0);
        z18 z18Var = z18.b;
        this.c = eb3.N(z18Var, ct7Var);
        this.d = eb3.N(z18Var, new ct7(this, 1));
    }

    @Override // defpackage.xnb, defpackage.wnb
    public final List a() {
        return s72.R0(F().a(), this.c.getValue());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dt7) && pa7.t(F(), ((dt7) obj).F());
    }

    @Override // defpackage.cm7
    public final String getName() {
        return ub3.l(new StringBuilder("<set-"), F().f.b, '>');
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return s72.R0(F().getParameters(), this.c.getValue());
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
        return F().hashCode();
    }

    public final String toString() {
        return "setter of " + F();
    }

    @Override // defpackage.at7
    public final vq7 y() {
        return F().f.d;
    }
}
