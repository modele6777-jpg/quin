package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mbe implements sw3, xn2 {
    public final /* synthetic */ obe a;
    public final pl1 b;
    public pl1 c;
    public iia d = iia.b;
    public final /* synthetic */ obe e;

    public mbe(obe obeVar, pl1 pl1Var) {
        this.e = obeVar;
        this.a = obeVar;
        this.b = pl1Var;
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

    public final Object a(iia iiaVar, pt0 pt0Var) {
        pl1 pl1Var = new pl1(1, k99.D(pt0Var));
        pl1Var.v();
        this.d = iiaVar;
        this.c = pl1Var;
        return pl1Var.t();
    }

    public final long b() {
        obe obeVar = this.e;
        long jN0 = obeVar.N0(vd0.s0(obeVar).Q0.d());
        long j = obeVar.N0;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jN0 >> 32)) - ((int) (j >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jN0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L);
    }

    public final rvf c() {
        return vd0.s0(this.e).Q0;
    }

    @Override // defpackage.sw3
    public final float c0(float f) {
        return f / this.a.getDensity();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(long j, l26 l26Var, pt0 pt0Var) throws Throwable {
        jbe jbeVar;
        Throwable th;
        dg7 dg7Var;
        pl1 pl1Var;
        if (pt0Var instanceof jbe) {
            jbeVar = (jbe) pt0Var;
            int i = jbeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                jbeVar.label = i - Integer.MIN_VALUE;
            } else {
                jbeVar = new jbe(this, pt0Var);
            }
        } else {
            jbeVar = new jbe(this, pt0Var);
        }
        Object objZ = jbeVar.result;
        int i2 = jbeVar.label;
        if (i2 != 0) {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            dg7Var = (dg7) jbeVar.L$0;
            try {
                jzb.q(objZ);
                dg7Var.h(nl1.a);
                return objZ;
            } catch (Throwable th2) {
                th = th2;
                dg7Var.h(nl1.a);
                throw th;
            }
        }
        jzb.q(objZ);
        if (j <= 0 && (pl1Var = this.c) != null) {
            pl1Var.g(new dzb(new jia(j)));
        }
        lyd lydVarV = ynb.V(this.e.Z0(), null, null, new kbe(j, this, null), 3);
        try {
            jbeVar.L$0 = lydVarV;
            jbeVar.label = 1;
            objZ = l26Var.z(this, jbeVar);
            Object obj = bw2.a;
            if (objZ == obj) {
                return obj;
            }
            dg7Var = lydVarV;
            dg7Var.h(nl1.a);
            return objZ;
        } catch (Throwable th3) {
            th = th3;
            dg7Var = lydVarV;
            dg7Var.h(nl1.a);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(long j, l26 l26Var, pt0 pt0Var) {
        lbe lbeVar;
        if (pt0Var instanceof lbe) {
            lbeVar = (lbe) pt0Var;
            int i = lbeVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                lbeVar.label = i - Integer.MIN_VALUE;
            } else {
                lbeVar = new lbe(this, pt0Var);
            }
        } else {
            lbeVar = new lbe(this, pt0Var);
        }
        Object obj = lbeVar.result;
        int i2 = lbeVar.label;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    jzb.q(obj);
                    return obj;
                }
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            lbeVar.label = 1;
            Object objD = d(j, l26Var, lbeVar);
            Object obj2 = bw2.a;
            return objD == obj2 ? obj2 : objD;
        } catch (jia unused) {
            return null;
        }
    }

    @Override // defpackage.xn2
    public final void g(Object obj) {
        obe obeVar = this.e;
        synchronized (obeVar.K0) {
            obeVar.J0.j(this);
        }
        this.b.g(obj);
    }

    @Override // defpackage.xn2
    public final pv2 getContext() {
        return nu4.a;
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
        return this.a.getDensity() * f;
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
