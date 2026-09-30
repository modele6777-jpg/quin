package defpackage;

import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cg2 implements fq8, bq4 {
    public final Object a;
    public aq4 b;
    public aq4 c;
    public final /* synthetic */ eg2 d;

    public cg2(eg2 eg2Var, Object obj) {
        this.d = eg2Var;
        this.b = new aq4(eg2Var.c.c, 0, null);
        this.c = new aq4(eg2Var.d.c, 0, null);
        this.a = obj;
    }

    @Override // defpackage.fq8
    public final void F(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var, int i2) {
        if (a(i, zp8Var)) {
            aq4 aq4Var = this.b;
            aq4Var.a(new bq8(aq4Var, v98Var, b(qp8Var, zp8Var), i2));
        }
    }

    public final boolean a(int i, zp8 zp8Var) {
        zp8 zp8VarS;
        Object obj = this.a;
        eg2 eg2Var = this.d;
        if (zp8Var != null) {
            zp8VarS = eg2Var.s(obj, zp8Var);
            if (zp8VarS == null) {
                return false;
            }
        } else {
            zp8VarS = null;
        }
        int iU = eg2Var.u(i, obj);
        aq4 aq4Var = this.b;
        if (aq4Var.a != iU || !Objects.equals(aq4Var.b, zp8VarS)) {
            this.b = new aq4(eg2Var.c.c, iU, zp8VarS);
        }
        aq4 aq4Var2 = this.c;
        if (aq4Var2.a == iU && Objects.equals(aq4Var2.b, zp8VarS)) {
            return true;
        }
        this.c = new aq4(eg2Var.d.c, iU, zp8VarS);
        return true;
    }

    public final qp8 b(qp8 qp8Var, zp8 zp8Var) {
        long j = qp8Var.a;
        eg2 eg2Var = this.d;
        Object obj = this.a;
        long jT = eg2Var.t(j, obj);
        long j2 = qp8Var.b;
        long jT2 = eg2Var.t(j2, obj);
        return (jT == j && jT2 == j2) ? qp8Var : new qp8(qp8Var.c, (rr5) qp8Var.d, jT, jT2);
    }

    @Override // defpackage.fq8
    public final void d(int i, zp8 zp8Var, qp8 qp8Var) {
        if (a(i, zp8Var)) {
            aq4 aq4Var = this.b;
            aq4Var.a(new bo1(16, aq4Var, b(qp8Var, zp8Var)));
        }
    }

    @Override // defpackage.fq8
    public final void j(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var) {
        if (a(i, zp8Var)) {
            aq4 aq4Var = this.b;
            aq4Var.a(new cq8(aq4Var, v98Var, b(qp8Var, zp8Var), 1));
        }
    }

    @Override // defpackage.fq8
    public final void m(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var) {
        if (a(i, zp8Var)) {
            aq4 aq4Var = this.b;
            aq4Var.a(new cq8(aq4Var, v98Var, b(qp8Var, zp8Var), 0));
        }
    }

    @Override // defpackage.fq8
    public final void o(int i, zp8 zp8Var, v98 v98Var, qp8 qp8Var, IOException iOException, boolean z) {
        if (a(i, zp8Var)) {
            aq4 aq4Var = this.b;
            aq4Var.a(new dq8(aq4Var, v98Var, b(qp8Var, zp8Var), iOException, z));
        }
    }
}
