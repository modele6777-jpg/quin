package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lp11;", "Ls09;", "Lo11;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final /* data */ class p11 extends s09 {
    public final float a;
    public final b41 b;
    public final x4d c;

    public p11(float f, b41 b41Var, x4d x4dVar) {
        this.a = f;
        this.b = b41Var;
        this.c = x4dVar;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new o11(this.a, this.b, this.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p11)) {
            return false;
        }
        p11 p11Var = (p11) obj;
        return yi4.b(this.a, p11Var.a) && pa7.t(this.b, p11Var.b) && pa7.t(this.c, p11Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        return "BorderModifierNodeElement(width=" + yi4.c(this.a) + ", brush=" + this.b + ", shape=" + this.c + ")";
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
        o11 o11Var = (o11) i09Var;
        float f = o11Var.G0;
        g81 g81Var = o11Var.J0;
        float f2 = this.a;
        if (!yi4.b(f, f2)) {
            o11Var.G0 = f2;
            g81Var.l1();
        }
        b41 b41Var = o11Var.H0;
        b41 b41Var2 = this.b;
        if (!pa7.t(b41Var, b41Var2)) {
            o11Var.H0 = b41Var2;
            g81Var.l1();
        }
        x4d x4dVar = o11Var.I0;
        x4d x4dVar2 = this.c;
        if (pa7.t(x4dVar, x4dVar2)) {
            return;
        }
        o11Var.I0 = x4dVar2;
        g81Var.l1();
        scc.k(o11Var);
    }
}
