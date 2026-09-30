package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class ohc {
    public static final lhc a = new lhc();
    public static final k94 b = new k94(1);
    public static final zx9 c = new zx9(1);

    public static j09 a(j09 j09Var, zhc zhcVar, ks9 ks9Var, boolean z, boolean z2, t69 t69Var) {
        return j09Var.D(new khc(zhcVar, ks9Var, z, z2, t69Var));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(gic gicVar, long j, zn2 zn2Var) {
        mhc mhcVar;
        jmb jmbVar;
        gic gicVar2;
        if (zn2Var instanceof mhc) {
            mhcVar = (mhc) zn2Var;
            int i = mhcVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                mhcVar.label = i - Integer.MIN_VALUE;
            } else {
                mhcVar = new mhc(zn2Var);
            }
        } else {
            mhcVar = new mhc(zn2Var);
        }
        Object obj = mhcVar.result;
        int i2 = mhcVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            jmbVar = new jmb();
            nhc nhcVar = new nhc(gicVar, j, jmbVar, null);
            mhcVar.L$0 = gicVar;
            mhcVar.L$1 = jmbVar;
            mhcVar.label = 1;
            Object objG = gicVar.g(s89.a, nhcVar, mhcVar);
            bw2 bw2Var = bw2.a;
            if (objG == bw2Var) {
                return bw2Var;
            }
            gicVar2 = gicVar;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jmb jmbVar2 = (jmb) mhcVar.L$1;
            gic gicVar3 = (gic) mhcVar.L$0;
            jzb.q(obj);
            jmbVar = jmbVar2;
            gicVar2 = gicVar3;
        }
        return new hl9(gicVar2.i(jmbVar.element));
    }
}
