package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class opb {
    public final int a;
    public final ff2 b;
    public float c;

    public opb(int i, ff2 ff2Var) {
        this.a = i;
        this.b = ff2Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(float f, zn2 zn2Var) {
        npb npbVar;
        if (zn2Var instanceof npb) {
            npbVar = (npb) zn2Var;
            int i = npbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                npbVar.label = i - Integer.MIN_VALUE;
            } else {
                npbVar = new npb(this, zn2Var);
            }
        } else {
            npbVar = new npb(this, zn2Var);
        }
        Object objZ = npbVar.result;
        int i2 = npbVar.label;
        if (i2 == 0) {
            jzb.q(objZ);
            Float f2 = new Float(f);
            npbVar.label = 1;
            objZ = this.b.z(f2, npbVar);
            bw2 bw2Var = bw2.a;
            if (objZ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objZ);
        }
        this.c += ((Number) objZ).floatValue();
        return wef.a;
    }
}
