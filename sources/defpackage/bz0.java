package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bz0 implements nm3 {
    public final ax6 a;
    public final as9 b;
    public final nxc c;
    public final t35 d;

    public bz0(ax6 ax6Var, as9 as9Var, nxc nxcVar, t35 t35Var) {
        this.a = ax6Var;
        this.b = as9Var;
        this.c = nxcVar;
        this.d = t35Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.nm3
    public final Object a(xn2 xn2Var) throws Throwable {
        az0 az0Var;
        nxc nxcVar;
        Throwable th;
        nxc nxcVar2;
        if (xn2Var instanceof az0) {
            az0Var = (az0) xn2Var;
            int i = az0Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                az0Var.label = i - Integer.MIN_VALUE;
            } else {
                az0Var = new az0(this, (zn2) xn2Var);
            }
        } else {
            az0Var = new az0(this, (zn2) xn2Var);
        }
        Object obj = az0Var.result;
        int i2 = az0Var.label;
        bw2 bw2Var = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                nxcVar = this.c;
                az0Var.L$0 = nxcVar;
                az0Var.label = 1;
                if (nxcVar.a(az0Var) != bw2Var) {
                }
                return bw2Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                nxcVar2 = (nxc) az0Var.L$0;
                try {
                    jzb.q(obj);
                    jm3 jm3Var = (jm3) obj;
                    nxcVar2.d();
                    return jm3Var;
                } catch (Throwable th2) {
                    th = th2;
                    nxcVar2.d();
                    throw th;
                }
            }
            nxc nxcVar3 = (nxc) az0Var.L$0;
            jzb.q(obj);
            nxcVar = nxcVar3;
            p pVar = new p(12, this);
            az0Var.L$0 = nxcVar;
            az0Var.label = 2;
            Object objX = nk8.x(pVar, az0Var);
            if (objX != bw2Var) {
                nxc nxcVar4 = nxcVar;
                obj = objX;
                nxcVar2 = nxcVar4;
                jm3 jm3Var2 = (jm3) obj;
                nxcVar2.d();
                return jm3Var2;
            }
            return bw2Var;
        } catch (Throwable th3) {
            nxc nxcVar5 = nxcVar;
            th = th3;
            nxcVar2 = nxcVar5;
            nxcVar2.d();
            throw th;
        }
    }
}
