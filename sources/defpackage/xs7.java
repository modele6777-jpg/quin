package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xs7 extends ps7 {
    public final sq7 x;
    public final lw7 y;
    public final lw7 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xs7(xm7 xm7Var, String str, Object obj, sq7 sq7Var, dm7 dm7Var) {
        super(xm7Var, str, obj, dm7Var);
        xm7Var.getClass();
        str.getClass();
        sq7Var.getClass();
        dm7Var.getClass();
        this.x = sq7Var;
        ws7 ws7Var = new ws7(xm7Var, this);
        z18 z18Var = z18.b;
        this.y = eb3.N(z18Var, ws7Var);
        this.z = eb3.N(z18Var, new ws7(this, xm7Var));
    }

    @Override // defpackage.ps7
    public final List G() {
        return this.x.g;
    }

    @Override // defpackage.ps7
    public final wq7 H() {
        return this.x.d;
    }

    @Override // defpackage.ps7
    public final vk7 I() {
        sq7 sq7Var = this.x;
        sq7Var.getClass();
        vk7 vk7Var = cn1.C(sq7Var).a;
        if (vk7Var != null) {
            return vk7Var;
        }
        ho7.m(this, "No signature for function: ");
        return null;
    }

    @Override // defpackage.ps7
    public final g8f J() {
        return (g8f) this.y.getValue();
    }

    @Override // defpackage.ps7
    public final List K() {
        return this.x.f;
    }

    @Override // defpackage.cm7
    public final String getName() {
        return this.x.b;
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return (yn7) this.z.getValue();
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        wn7[] wn7VarArr = si0.a;
        sq7 sq7Var = this.x;
        sq7Var.getClass();
        return abg.f0((pyf) si0.h.M(si0.a[22], sq7Var));
    }

    @Override // defpackage.wnb
    public final d09 i() {
        wn7[] wn7VarArr = si0.a;
        sq7 sq7Var = this.x;
        sq7Var.getClass();
        return (d09) si0.i.M(si0.a[23], sq7Var);
    }

    @Override // defpackage.ym7
    public final boolean isExternal() {
        wn7[] wn7VarArr = si0.a;
        sq7 sq7Var = this.x;
        sq7Var.getClass();
        return si0.m.F(si0.a[28], sq7Var);
    }

    @Override // defpackage.ym7
    public final boolean isInfix() {
        wn7[] wn7VarArr = si0.a;
        sq7 sq7Var = this.x;
        sq7Var.getClass();
        return si0.k.F(si0.a[25], sq7Var);
    }

    @Override // defpackage.ym7
    public final boolean isInline() {
        wn7[] wn7VarArr = si0.a;
        sq7 sq7Var = this.x;
        sq7Var.getClass();
        return si0.l.F(si0.a[26], sq7Var);
    }

    @Override // defpackage.ym7
    public final boolean isOperator() {
        wn7[] wn7VarArr = si0.a;
        sq7 sq7Var = this.x;
        sq7Var.getClass();
        return si0.j.F(si0.a[24], sq7Var);
    }

    @Override // defpackage.cm7, defpackage.ym7
    public final boolean isSuspend() {
        wn7[] wn7VarArr = si0.a;
        sq7 sq7Var = this.x;
        sq7Var.getClass();
        return si0.n.F(si0.a[29], sq7Var);
    }

    @Override // defpackage.wnb
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new xs7(xm7Var, this.d, ga1.NO_RECEIVER, this.x, dm7Var);
    }
}
