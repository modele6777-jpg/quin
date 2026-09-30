package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class af2 extends j6 {
    public final aw2 c;
    public l26 d;
    public r41 e;
    public lyd f;
    public boolean g;

    public af2(aw2 aw2Var, upa upaVar) {
        super(upaVar);
        this.c = aw2Var;
        this.d = new xe2(2, null);
    }

    @Override // defpackage.j6
    public final void n() {
        r41 r41Var = this.e;
        if (r41Var != null) {
            r41Var.e(new CancellationException("onBack cancelled"), true);
        }
        lyd lydVar = this.f;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.e = null;
        this.f = null;
        this.g = false;
    }

    @Override // defpackage.j6
    public final void o() {
        if (this.e != null && !this.g) {
            n();
        }
        if (this.e == null) {
            this.g = false;
            this.e = urg.a(-2, i41.a, null, 4);
            this.f = ynb.V(this.c, null, null, new ze2(this, null), 3);
        }
        r41 r41Var = this.e;
        if (r41Var != null) {
            r41Var.c(null);
        }
        this.g = false;
    }

    @Override // defpackage.j6
    public final void p(wr0 wr0Var) {
        r41 r41Var = this.e;
        if (r41Var != null) {
            r41Var.d(wr0Var);
        }
    }

    @Override // defpackage.j6
    public final void q() {
        n();
        if (super.m()) {
            this.g = true;
            this.e = urg.a(-2, i41.a, null, 4);
            this.f = ynb.V(this.c, null, null, new ze2(this, null), 3);
        }
    }

    public final void y(boolean z) {
        lyd lydVar;
        if (!z && super.m() && (lydVar = this.f) != null && !lydVar.b()) {
            n();
        }
        ((yr0) this.a).f(z);
        ((xr0) this.b).f(z);
    }
}
