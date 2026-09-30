package defpackage;

import androidx.compose.ui.node.LayoutNode;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lrr0;", "Ls09;", "Lqr0;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class rr0 extends s09 {
    public qr0 a;
    public za2 b;

    public final Object a(zn2 zn2Var) throws Throwable {
        za2 za2Var = this.b;
        if (za2Var == null) {
            za2Var = new za2();
            this.b = za2Var;
            qr0 qr0Var = this.a;
            if (qr0Var != null && qr0Var.Y) {
                l0 l0Var = new l0(15, qr0Var, qr0Var.E0);
                LayoutNode layoutNodeS0 = vd0.s0(qr0Var);
                int i = layoutNodeS0.b;
                jkb rectManager = wv7.a(layoutNodeS0).getRectManager();
                u98 u98Var = rectManager.d;
                u98Var.getClass();
                q69 q69Var = (q69) u98Var.e;
                rwe rweVar = new rwe(u98Var, i, qr0Var, l0Var);
                Object objB = q69Var.b(i);
                if (objB == null) {
                    q69Var.i(i, rweVar);
                    objB = rweVar;
                }
                rwe rweVar2 = (rwe) objB;
                if (rweVar2 != rweVar) {
                    while (true) {
                        rwe rweVar3 = rweVar2.d;
                        if (rweVar3 == null) {
                            break;
                        }
                        rweVar2 = rweVar3;
                    }
                    rweVar2.d = rweVar;
                }
                LayoutNode layoutNodeS1 = vd0.s0(qr0Var.a);
                if (layoutNodeS1.g != -4) {
                    os osVar = rectManager.c;
                    int iD = rectManager.d(layoutNodeS1);
                    long[] jArr = (long[]) osVar.c;
                    int i2 = iD + 2;
                    jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
                }
                rectManager.f = true;
                rectManager.j();
                qr0Var.Z = rweVar;
            }
        }
        Object objS = za2Var.s(zn2Var);
        return objS == bw2.a ? objS : wef.a;
    }

    @Override // defpackage.s09
    public final i09 create() {
        return new qr0(this);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return 234;
    }

    @Override // defpackage.s09
    public final void update(i09 i09Var) {
    }
}
