package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class df7 extends xnb implements ym7, pn7 {
    public df7() {
        super(dm7.j);
    }

    @Override // defpackage.wnb
    public final boolean E() {
        return y().E();
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return pu4.a;
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        return pu4.a;
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        return y().getVisibility();
    }

    @Override // defpackage.wnb
    public final d09 i() {
        y().getClass();
        return d09.FINAL;
    }

    @Override // defpackage.ym7
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.ym7
    public final boolean isInfix() {
        return false;
    }

    @Override // defpackage.ym7
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.ym7
    public final boolean isOperator() {
        return false;
    }

    @Override // defpackage.cm7, defpackage.ym7
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.wnb
    public final sa1 n() {
        return null;
    }

    @Override // defpackage.wnb
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // defpackage.wnb
    public final xm7 s() {
        return y().c;
    }

    @Override // defpackage.wnb
    public final Object x() {
        return y().e;
    }

    public abstract gf7 y();
}
