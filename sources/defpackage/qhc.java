package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qhc implements pc9 {
    public final gic a;
    public boolean b;

    public qhc(gic gicVar, boolean z) {
        this.a = gicVar;
        this.b = z;
    }

    @Override // defpackage.pc9
    public final long G(long j, int i, long j2) {
        if (!this.b) {
            return 0L;
        }
        gic gicVar = this.a;
        if (gicVar.a.a()) {
            return 0L;
        }
        return gicVar.i(gicVar.e(gicVar.a.e(gicVar.e(gicVar.h(j2)))));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.pc9
    public final Object H(long j, long j2, xn2 xn2Var) throws Throwable {
        phc phcVar;
        long jD;
        if (xn2Var instanceof phc) {
            phcVar = (phc) xn2Var;
            int i = phcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                phcVar.label = i - Integer.MIN_VALUE;
            } else {
                phcVar = new phc(this, (zn2) xn2Var);
            }
        } else {
            phcVar = new phc(this, (zn2) xn2Var);
        }
        Object objA = phcVar.result;
        int i2 = phcVar.label;
        if (i2 == 0) {
            jzb.q(objA);
            jD = 0;
            if (this.b) {
                gic gicVar = this.a;
                if (!gicVar.i) {
                    phcVar.J$0 = j2;
                    phcVar.label = 1;
                    objA = gicVar.a(j2, phcVar);
                    bw2 bw2Var = bw2.a;
                    if (objA == bw2Var) {
                        return bw2Var;
                    }
                }
                jD = zsf.d(j2, jD);
            }
            return new zsf(jD);
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        j2 = phcVar.J$0;
        jzb.q(objA);
        jD = ((zsf) objA).a;
        jD = zsf.d(j2, jD);
        return new zsf(jD);
    }
}
