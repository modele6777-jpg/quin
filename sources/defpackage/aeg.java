package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aeg implements sif {
    public final ydg a;
    public final float b;
    public final float c;
    public final ace d;
    public final ace e;
    public boolean f;
    public ajf g;
    public za2 h;

    public aeg(ydg ydgVar) {
        this.a = ydgVar;
        this.b = ydgVar.d();
        this.c = ydgVar.b();
        final int i = 0;
        this.d = new ace(new x16(this) { // from class: zdg
            public final /* synthetic */ aeg b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i2 = i;
                aeg aegVar = this.b;
                switch (i2) {
                    case 0:
                        return new beg(aegVar.b, aegVar.c);
                    default:
                        return new v69((beg) aegVar.d.getValue());
                }
            }
        });
        final int i2 = 1;
        this.e = new ace(new x16(this) { // from class: zdg
            public final /* synthetic */ aeg b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() {
                int i3 = i2;
                aeg aegVar = this.b;
                switch (i3) {
                    case 0:
                        return new beg(aegVar.b, aegVar.c);
                    default:
                        return new v69((beg) aegVar.d.getValue());
                }
            }
        });
    }

    public final m88 a(beg begVar, boolean z, boolean z2) {
        begVar.getClass();
        za2 za2Var = new za2();
        za2 za2Var2 = this.h;
        if (za2Var2 != null) {
            if (z) {
                za2Var2.i0(new ye1("Cancelled due to another zoom value being set."));
            } else {
                lmg.o0(za2Var, za2Var2);
            }
        }
        this.h = za2Var;
        boolean zT = p8c.t();
        ace aceVar = this.e;
        if (zT) {
            ((v69) aceVar.getValue()).k(begVar);
        } else {
            ((v69) aceVar.getValue()).i(begVar);
        }
        ajf ajfVar = this.g;
        if (ajfVar != null) {
            ydg ydgVar = this.a;
            lmg.o0(z2 ? ydgVar.v(ajfVar) : ydgVar.u(ajfVar), za2Var);
        } else {
            za2Var.i0(new ye1("Camera is not active."));
        }
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = jv2.class;
        try {
            za2Var.E(new ot1(6, la1Var));
            la1Var.a = "Job.asListenableFuture";
        } catch (Exception e) {
            pa1Var.a(e);
        }
        return bm8.J(pa1Var);
    }

    @Override // defpackage.sif
    public final void b(ajf ajfVar) {
        boolean z;
        this.g = ajfVar;
        beg begVar = (beg) ((v69) this.e.getValue()).d();
        if (begVar == null) {
            begVar = (beg) this.d.getValue();
        }
        if (this.f) {
            z = true;
        } else {
            begVar.getClass();
            z = false;
        }
        a(begVar, false, z);
        this.f = true;
    }

    @Override // defpackage.sif
    public final void reset() {
        a((beg) this.d.getValue(), true, true);
    }
}
