package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ff7 extends df7 implements rn7, qn7 {
    public final lw7 c = eb3.N(z18.b, new j5(26, this));
    public final gf7 d;

    public ff7(gf7 gf7Var) {
        this.d = gf7Var;
    }

    @Override // defpackage.xnb, defpackage.wnb
    public final List a() {
        return this.d.a();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ff7) {
            return pa7.t(this.d, ((ff7) obj).d);
        }
        return false;
    }

    @Override // defpackage.pn7
    public final wn7 f() {
        return this.d;
    }

    @Override // defpackage.cm7
    public final String getName() {
        return "<get-" + this.d.getName() + '>';
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return this.d.getParameters();
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return this.d.getReturnType();
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return (sa1) this.c.getValue();
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return this.d.get();
    }

    public final String toString() {
        return "getter of " + this.d;
    }

    @Override // defpackage.df7
    public final gf7 y() {
        return this.d;
    }
}
