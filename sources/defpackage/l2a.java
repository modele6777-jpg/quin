package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l2a implements z09 {
    public final z09 a;
    public final zi0 b = new zi0(6);

    public l2a(z09 z09Var) {
        this.a = z09Var;
    }

    @Override // defpackage.pv2
    public final nv2 F0(ov2 ov2Var) {
        return i7h.s(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final pv2 U(ov2 ov2Var) {
        return i7h.E(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        return l26Var.z(obj, this);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.z09
    public final Object g0(xn2 xn2Var, a26 a26Var) {
        k2a k2aVar;
        boolean z;
        Object objT;
        if (xn2Var instanceof k2a) {
            k2aVar = (k2a) xn2Var;
            int i = k2aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                k2aVar.label = i - Integer.MIN_VALUE;
            } else {
                k2aVar = new k2a(this, xn2Var);
            }
        } else {
            k2aVar = new k2a(this, xn2Var);
        }
        Object obj = k2aVar.result;
        bw2 bw2Var = bw2.a;
        int i2 = k2aVar.label;
        if (i2 == 0) {
            jzb.q(obj);
            zi0 zi0Var = this.b;
            k2aVar.L$0 = a26Var;
            k2aVar.label = 1;
            synchronized (zi0Var.b) {
                z = zi0Var.a;
            }
            if (z) {
                objT = wef.a;
            } else {
                pl1 pl1Var = new pl1(1, k99.D(k2aVar));
                pl1Var.v();
                synchronized (zi0Var.b) {
                    ((ArrayList) zi0Var.c).add(pl1Var);
                }
                pl1Var.x(new d5(20, zi0Var, pl1Var));
                objT = pl1Var.t();
                if (objT != bw2Var) {
                    objT = wef.a;
                }
            }
            if (objT != bw2Var) {
            }
        }
        if (i2 != 1) {
            if (i2 == 2) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        a26Var = (a26) k2aVar.L$0;
        jzb.q(obj);
        z09 z09Var = this.a;
        k2aVar.L$0 = null;
        k2aVar.label = 2;
        Object objG0 = z09Var.g0(k2aVar, a26Var);
        return objG0 == bw2Var ? bw2Var : objG0;
    }

    @Override // defpackage.pv2
    public final pv2 p0(pv2 pv2Var) {
        return i7h.I(this, pv2Var);
    }
}
