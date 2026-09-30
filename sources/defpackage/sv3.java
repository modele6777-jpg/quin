package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sv3 extends i09 {
    public i09 E0;
    public final int Z = zf9.e(this);

    @Override // defpackage.i09
    public final void b1() {
        super.b1();
        for (i09 i09Var = this.E0; i09Var != null; i09Var = i09Var.f) {
            i09Var.k1(this.v);
            if (!i09Var.Y) {
                i09Var.b1();
            }
        }
    }

    @Override // defpackage.i09
    public final void c1() {
        for (i09 i09Var = this.E0; i09Var != null; i09Var = i09Var.f) {
            i09Var.c1();
        }
        super.c1();
    }

    @Override // defpackage.i09
    public final void g1() {
        super.g1();
        for (i09 i09Var = this.E0; i09Var != null; i09Var = i09Var.f) {
            i09Var.g1();
        }
    }

    @Override // defpackage.i09
    public final void h1() {
        for (i09 i09Var = this.E0; i09Var != null; i09Var = i09Var.f) {
            i09Var.h1();
        }
        super.h1();
    }

    @Override // defpackage.i09
    public final void i1() {
        super.i1();
        for (i09 i09Var = this.E0; i09Var != null; i09Var = i09Var.f) {
            i09Var.i1();
        }
    }

    @Override // defpackage.i09
    public final void j1(i09 i09Var) {
        this.a = i09Var;
        for (i09 i09Var2 = this.E0; i09Var2 != null; i09Var2 = i09Var2.f) {
            i09Var2.j1(i09Var);
        }
    }

    @Override // defpackage.i09
    public final void k1(yf9 yf9Var) {
        this.v = yf9Var;
        for (i09 i09Var = this.E0; i09Var != null; i09Var = i09Var.f) {
            i09Var.k1(yf9Var);
        }
    }

    public final rv3 l1(rv3 rv3Var) {
        i09 i09Var = ((i09) rv3Var).a;
        if (i09Var != rv3Var) {
            i09 i09Var2 = rv3Var instanceof i09 ? (i09) rv3Var : null;
            i09 i09Var3 = i09Var2 != null ? i09Var2.e : null;
            if (i09Var != this.a || !pa7.t(i09Var3, this)) {
                qc0.p("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (i09Var.Y) {
                i37.c("Cannot delegate to an already attached node");
            }
            i09Var.j1(this.a);
            int i = this.c;
            int iF = zf9.f(i09Var);
            i09Var.c = iF;
            int i2 = this.c;
            int i3 = iF & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof kv7)) {
                i37.c("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + i09Var);
            }
            i09Var.f = this.E0;
            this.E0 = i09Var;
            i09Var.e = this;
            n1(iF | this.c, false);
            if (this.Y) {
                if (i3 == 0 || (i & 2) != 0) {
                    k1(this.v);
                } else {
                    wo0 wo0Var = vd0.s0(this).V0;
                    this.a.k1(null);
                    wo0Var.n();
                }
                i09Var.b1();
                i09Var.h1();
                if (!i09Var.Y) {
                    i37.c("autoInvalidateInsertedNode called on unattached node");
                }
                zf9.a(i09Var, -1, 1);
            }
        }
        return rv3Var;
    }

    public final void m1(rv3 rv3Var) {
        i09 i09Var = null;
        for (i09 i09Var2 = this.E0; i09Var2 != null; i09Var2 = i09Var2.f) {
            if (i09Var2 == rv3Var) {
                boolean z = i09Var2.Y;
                if (z) {
                    e79 e79Var = zf9.a;
                    if (!z) {
                        i37.c("autoInvalidateRemovedNode called on unattached node");
                    }
                    zf9.a(i09Var2, -1, 2);
                    i09Var2.i1();
                    i09Var2.c1();
                }
                i09Var2.j1(i09Var2);
                i09Var2.d = 0;
                i09 i09Var3 = i09Var2.f;
                if (i09Var == null) {
                    this.E0 = i09Var3;
                } else {
                    i09Var.f = i09Var3;
                }
                i09Var2.f = null;
                i09Var2.e = null;
                int i = this.c;
                int iF = zf9.f(this);
                n1(iF, true);
                if (this.Y && (i & 2) != 0 && (iF & 2) == 0) {
                    wo0 wo0Var = vd0.s0(this).V0;
                    this.a.k1(null);
                    wo0Var.n();
                    return;
                }
                return;
            }
            i09Var = i09Var2;
        }
        pd4.i(rv3Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [i09] */
    /* JADX WARN: Type inference failed for: r2v2, types: [i09] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public final void n1(int i, boolean z) {
        i09 i09Var;
        int i2 = this.c;
        this.c = i;
        if (i2 != i) {
            i09 i09Var2 = this.a;
            if (i09Var2 == this) {
                this.d = i;
            }
            boolean z2 = this.Y;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.c;
                    r2.c = i;
                    if (r2 == i09Var2) {
                        break;
                    } else {
                        r2 = r2.e;
                    }
                }
                if (z && r2 == i09Var2) {
                    i = zf9.f(i09Var2);
                    i09Var2.c = i;
                }
                int i3 = i | ((r2 == 0 || (i09Var = r2.f) == null) ? 0 : i09Var.d);
                for (?? r3 = r2; r3 != 0; r3 = r3.e) {
                    i3 |= r3.c;
                    r3.d = i3;
                }
            }
        }
    }
}
