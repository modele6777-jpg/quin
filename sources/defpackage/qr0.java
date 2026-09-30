package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qr0 extends i09 {
    public final /* synthetic */ rr0 E0;
    public rwe Z;

    public qr0(rr0 rr0Var) {
        this.E0 = rr0Var;
    }

    @Override // defpackage.i09
    public final void d1() {
        rr0 rr0Var = this.E0;
        rr0Var.a = this;
        if (rr0Var.b != null) {
            l0 l0Var = new l0(15, this, rr0Var);
            LayoutNode layoutNodeS0 = vd0.s0(this);
            int i = layoutNodeS0.b;
            jkb rectManager = wv7.a(layoutNodeS0).getRectManager();
            u98 u98Var = rectManager.d;
            u98Var.getClass();
            q69 q69Var = (q69) u98Var.e;
            rwe rweVar = new rwe(u98Var, i, this, l0Var);
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
                    } else {
                        rweVar2 = rweVar3;
                    }
                }
                rweVar2.d = rweVar;
            }
            LayoutNode layoutNodeS1 = vd0.s0(this.a);
            if (layoutNodeS1.g != -4) {
                os osVar = rectManager.c;
                int iD = rectManager.d(layoutNodeS1);
                long[] jArr = (long[]) osVar.c;
                int i2 = iD + 2;
                jArr[i2] = (jArr[i2] & 8070450532247928831L) | (-8070450532247928832L);
            }
            rectManager.f = true;
            rectManager.j();
            this.Z = rweVar;
        }
    }

    @Override // defpackage.i09
    public final void e1() {
        rr0 rr0Var = this.E0;
        if (rr0Var.a == this) {
            rr0Var.a = null;
        }
        rwe rweVar = this.Z;
        if (rweVar != null) {
            rweVar.b();
        }
        this.Z = null;
    }
}
