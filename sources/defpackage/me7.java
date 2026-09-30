package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class me7 extends xnb implements rn7 {
    public final /* synthetic */ oe7 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me7(oe7 oe7Var) {
        super(dm7.j);
        this.c = oe7Var;
    }

    @Override // defpackage.wnb
    public final boolean E() {
        return false;
    }

    @Override // defpackage.xnb, defpackage.wnb
    public final List a() {
        return pu4.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof me7) {
            return this.c.equals(((me7) obj).c);
        }
        return false;
    }

    @Override // defpackage.pn7
    public final wn7 f() {
        return this.c;
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return pu4.a;
    }

    @Override // defpackage.cm7
    public final String getName() {
        return "<get-entries>";
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return pu4.a;
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return this.c.getReturnType();
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        return pu4.a;
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        return jo7.a;
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return this.c.f;
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    @Override // defpackage.wnb
    public final d09 i() {
        return d09.FINAL;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return this.c.d;
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
        return this.c.c;
    }

    public final String toString() {
        return "getter of " + this.c;
    }

    @Override // defpackage.wnb
    public final Object x() {
        return null;
    }
}
