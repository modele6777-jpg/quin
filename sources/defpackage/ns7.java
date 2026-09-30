package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ns7 extends ps7 {
    public final lq7 x;
    public final lw7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ns7(xm7 xm7Var, String str, Object obj, lq7 lq7Var) {
        super(xm7Var, str, obj, dm7.j);
        xm7Var.getClass();
        str.getClass();
        lq7Var.getClass();
        this.x = lq7Var;
        this.y = eb3.N(z18.b, new te7(xm7Var, 2));
    }

    @Override // defpackage.ps7
    public final List G() {
        return pu4.a;
    }

    @Override // defpackage.ps7
    public final wq7 H() {
        return null;
    }

    @Override // defpackage.ps7
    public final vk7 I() {
        lq7 lq7Var = this.x;
        lq7Var.getClass();
        vk7 vk7Var = cn1.B(lq7Var).a;
        if (vk7Var != null) {
            return vk7Var;
        }
        ho7.m(this, "No signature for constructor: ");
        return null;
    }

    @Override // defpackage.ps7
    public final g8f J() {
        xm7 xm7Var = this.c;
        xm7Var.getClass();
        return ((jm7) ((nm7) xm7Var).c.getValue()).d();
    }

    @Override // defpackage.ps7
    public final List K() {
        return this.x.b;
    }

    @Override // defpackage.cm7
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return (yn7) this.y.getValue();
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        wn7[] wn7VarArr = si0.a;
        lq7 lq7Var = this.x;
        lq7Var.getClass();
        return abg.f0((pyf) si0.g.M(si0.a[17], lq7Var));
    }

    @Override // defpackage.wnb
    public final d09 i() {
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
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        if (!dm7Var.equals(dm7.j)) {
            ho7.y(this, "Constructors cannot have fake overrides: ");
            return null;
        }
        return new ns7(xm7Var, this.d, ga1.NO_RECEIVER, this.x);
    }
}
