package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cwc implements qne {
    public long a = 9205357640488583168L;
    public long b = 0;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fwc d;

    public cwc(boolean z, fwc fwcVar) {
        this.c = z;
        this.d = fwcVar;
    }

    @Override // defpackage.qne
    public final void a(long j, wuc wucVar) {
        fwc fwcVar = this.d;
        if (fwcVar.i() == null) {
            return;
        }
        vuc vucVarJ = fwcVar.j();
        vucVarJ.getClass();
        boolean z = this.c;
        Object objE = fwcVar.a.c.e((z ? vucVarJ.a : vucVarJ.b).c);
        if (objE == null) {
            l37.d("SelectionRegistrar should contain the current selection's selectableIds");
            oo3.f();
            return;
        }
        x59 x59Var = (x59) objE;
        bv7 bv7VarC = x59Var.c();
        if (bv7VarC == null) {
            l37.d("Current selectable should have layout coordinates.");
            oo3.f();
            return;
        }
        long jA = x59Var.a(vucVarJ, z);
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            return;
        }
        this.a = fwcVar.n().K(bv7VarC, svc.a(jA));
        this.b = 0L;
    }

    @Override // defpackage.qne
    public final void b() {
        fwc fwcVar = this.d;
        fwcVar.q(true);
        fwcVar.E0.setValue(null);
        fwcVar.F0.setValue(null);
    }

    @Override // defpackage.qne
    public final void c() {
        fwc fwcVar = this.d;
        fwcVar.q(true);
        fwcVar.E0.setValue(null);
        fwcVar.F0.setValue(null);
    }

    @Override // defpackage.qne
    public final void d() {
        vuc vucVarJ;
        bv7 bv7VarC;
        boolean z = this.c;
        fwc fwcVar = this.d;
        if ((z ? (hl9) fwcVar.Y.getValue() : (hl9) fwcVar.Z.getValue()) == null || (vucVarJ = fwcVar.j()) == null) {
            return;
        }
        x59 x59VarG = fwcVar.g(z ? vucVarJ.a : vucVarJ.b);
        if (x59VarG == null || (bv7VarC = x59VarG.c()) == null) {
            return;
        }
        long jA = x59VarG.a(vucVarJ, z);
        if ((9223372034707292159L & jA) == 9205357640488583168L) {
            return;
        }
        fwcVar.F0.setValue(new hl9(fwcVar.n().K(bv7VarC, svc.a(jA))));
        fwcVar.E0.setValue(z ? sg6.b : sg6.c);
        fwcVar.q(false);
    }

    @Override // defpackage.qne
    public final void e(long j) {
        fwc fwcVar = this.d;
        if (fwcVar.i() == null) {
            return;
        }
        long jG = hl9.g(this.b, j);
        this.b = jG;
        long jG2 = hl9.g(this.a, jG);
        if (fwcVar.t(jG2, this.a, this.c, gec.g)) {
            this.a = jG2;
            this.b = 0L;
        }
    }

    @Override // defpackage.qne
    public final void onCancel() {
        fwc fwcVar = this.d;
        fwcVar.q(true);
        fwcVar.E0.setValue(null);
        fwcVar.F0.setValue(null);
    }
}
