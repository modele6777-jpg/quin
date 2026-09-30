package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ueb implements c52 {
    public final /* synthetic */ c52 a;
    public final /* synthetic */ c52 b;
    public final /* synthetic */ e89 c;

    public ueb(c52 c52Var, e89 e89Var) {
        this.b = c52Var;
        this.c = e89Var;
        this.a = c52Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.c52
    public final Object a(a52 a52Var, zn2 zn2Var) {
        teb tebVar;
        if (zn2Var instanceof teb) {
            tebVar = (teb) zn2Var;
            int i = tebVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                tebVar.label = i - Integer.MIN_VALUE;
            } else {
                tebVar = new teb(this, zn2Var);
            }
        } else {
            tebVar = new teb(this, zn2Var);
        }
        Object obj = tebVar.result;
        int i2 = tebVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            tebVar.L$0 = a52Var;
            tebVar.label = 1;
            Object objA = this.b.a(a52Var, tebVar);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a52Var = (a52) tebVar.L$0;
            jzb.q(obj);
        }
        if (a52Var != null) {
            ((x16) this.c.getValue()).invoke();
        }
        return wef.a;
    }

    @Override // defpackage.c52
    public final Object b(zn2 zn2Var) {
        return this.a.b(zn2Var);
    }
}
