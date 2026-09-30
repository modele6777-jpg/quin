package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fr6 extends i09 implements ria {
    public yq6 E0;
    public t69 Z;

    @Override // defpackage.ria
    public final void E(hia hiaVar, iia iiaVar, long j) {
        if (iiaVar == iia.b) {
            int i = hiaVar.f;
            if (i == 4) {
                ynb.V(Z0(), null, null, new dr6(this, null), 3);
            } else if (i == 5) {
                ynb.V(Z0(), null, null, new er6(this, null), 3);
            }
        }
    }

    @Override // defpackage.ria
    public final void N() {
        n1();
    }

    @Override // defpackage.i09
    public final void e1() {
        n1();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object l1(zn2 zn2Var) {
        br6 br6Var;
        yq6 yq6Var;
        if (zn2Var instanceof br6) {
            br6Var = (br6) zn2Var;
            int i = br6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                br6Var.label = i - Integer.MIN_VALUE;
            } else {
                br6Var = new br6(this, zn2Var);
            }
        } else {
            br6Var = new br6(this, zn2Var);
        }
        Object obj = br6Var.result;
        int i2 = br6Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            if (this.E0 == null) {
                yq6 yq6Var2 = new yq6();
                t69 t69Var = this.Z;
                br6Var.L$0 = yq6Var2;
                br6Var.label = 1;
                Object objA = ((u69) t69Var).a(yq6Var2, br6Var);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
                yq6Var = yq6Var2;
            }
            return wef.a;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        yq6Var = (yq6) br6Var.L$0;
        jzb.q(obj);
        this.E0 = yq6Var;
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object m1(zn2 zn2Var) {
        cr6 cr6Var;
        if (zn2Var instanceof cr6) {
            cr6Var = (cr6) zn2Var;
            int i = cr6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cr6Var.label = i - Integer.MIN_VALUE;
            } else {
                cr6Var = new cr6(this, zn2Var);
            }
        } else {
            cr6Var = new cr6(this, zn2Var);
        }
        Object obj = cr6Var.result;
        int i2 = cr6Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            yq6 yq6Var = this.E0;
            if (yq6Var != null) {
                zq6 zq6Var = new zq6(yq6Var);
                t69 t69Var = this.Z;
                cr6Var.label = 1;
                Object objA = ((u69) t69Var).a(zq6Var, cr6Var);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i2 != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.E0 = null;
        return wef.a;
    }

    public final void n1() {
        yq6 yq6Var = this.E0;
        if (yq6Var != null) {
            ((u69) this.Z).b(new zq6(yq6Var));
            this.E0 = null;
        }
    }
}
