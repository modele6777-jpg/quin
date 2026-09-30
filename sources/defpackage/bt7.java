package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bt7 extends at7 implements qn7 {
    public final lw7 c = eb3.N(z18.b, new wj7(8, this));

    @Override // defpackage.xnb, defpackage.wnb
    public final List a() {
        return F().a();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof bt7) && pa7.t(F(), ((bt7) obj).F());
    }

    @Override // defpackage.cm7
    public final String getName() {
        return ub3.l(new StringBuilder("<get-"), F().f.b, '>');
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return F().getParameters();
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return F().getReturnType();
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return (sa1) this.c.getValue();
    }

    public final int hashCode() {
        return F().hashCode();
    }

    public final String toString() {
        return "getter of " + F();
    }

    @Override // defpackage.at7
    public final vq7 y() {
        return F().f.c;
    }
}
