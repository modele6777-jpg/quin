package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nta implements kta, sw3 {
    public final /* synthetic */ sw3 a;
    public boolean b;
    public boolean c;
    public final f99 d = new f99();

    public nta(sw3 sw3Var) {
        this.a = sw3Var;
    }

    @Override // defpackage.sw3
    public final int D0(float f) {
        return this.a.D0(f);
    }

    @Override // defpackage.sw3
    public final float F(long j) {
        return this.a.F(j);
    }

    @Override // defpackage.sw3
    public final long N0(long j) {
        return this.a.N0(j);
    }

    @Override // defpackage.sw3
    public final long P(int i) {
        return this.a.P(i);
    }

    @Override // defpackage.sw3
    public final float Q0(long j) {
        return this.a.Q0(j);
    }

    @Override // defpackage.sw3
    public final long S(float f) {
        return this.a.S(f);
    }

    @Override // defpackage.sw3
    public final float Z(int i) {
        return this.a.Z(i);
    }

    public final void a() {
        this.c = true;
        f99 f99Var = this.d;
        if (f99Var.e()) {
            f99Var.h(null);
        }
    }

    public final void b() {
        this.b = true;
        f99 f99Var = this.d;
        if (f99Var.e()) {
            f99Var.h(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(zn2 zn2Var) {
        lta ltaVar;
        if (zn2Var instanceof lta) {
            ltaVar = (lta) zn2Var;
            int i = ltaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ltaVar.label = i - Integer.MIN_VALUE;
            } else {
                ltaVar = new lta(this, zn2Var);
            }
        } else {
            ltaVar = new lta(this, zn2Var);
        }
        Object obj = ltaVar.result;
        int i2 = ltaVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            ltaVar.label = 1;
            Object objB = this.d.b(ltaVar);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        this.b = false;
        this.c = false;
        return wef.a;
    }

    @Override // defpackage.sw3
    public final float c0(float f) {
        return this.a.c0(f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(zn2 zn2Var) {
        mta mtaVar;
        if (zn2Var instanceof mta) {
            mtaVar = (mta) zn2Var;
            int i = mtaVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mtaVar.label = i - Integer.MIN_VALUE;
            } else {
                mtaVar = new mta(this, zn2Var);
            }
        } else {
            mtaVar = new mta(this, zn2Var);
        }
        Object obj = mtaVar.result;
        int i2 = mtaVar.label;
        f99 f99Var = this.d;
        if (i2 == 0) {
            jzb.q(obj);
            if (!this.b && !this.c) {
                mtaVar.label = 1;
                Object objB = f99Var.b(mtaVar);
                bw2 bw2Var = bw2.a;
                if (objB == bw2Var) {
                    return bw2Var;
                }
            }
            return Boolean.valueOf(this.b);
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        f99Var.h(null);
        return Boolean.valueOf(this.b);
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.a.getDensity();
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.a.h0();
    }

    @Override // defpackage.sw3
    public final float p0(float f) {
        return this.a.p0(f);
    }

    @Override // defpackage.sw3
    public final long t(float f) {
        return this.a.t(f);
    }

    @Override // defpackage.sw3
    public final long u(long j) {
        return this.a.u(j);
    }

    @Override // defpackage.sw3
    public final int x0(long j) {
        return this.a.x0(j);
    }
}
