package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rwe {
    public final int a;
    public final qr0 b;
    public final l0 c;
    public rwe d;
    public long e;
    public long f;
    public long g = Long.MIN_VALUE;
    public final /* synthetic */ u98 h;

    public rwe(u98 u98Var, int i, qr0 qr0Var, l0 l0Var) {
        this.h = u98Var;
        this.a = i;
        this.b = qr0Var;
        this.c = l0Var;
    }

    public final void a(long j, long j2, long j3, long j4, float[] fArr) {
        mpb mpbVar;
        mpb mpbVar2;
        long j5 = this.h.d;
        qr0 qr0Var = this.b;
        yf9 yf9VarP0 = vd0.p0(qr0Var, 2);
        LayoutNode layoutNodeS0 = vd0.s0(qr0Var);
        if (layoutNodeS0.X()) {
            if (layoutNodeS0.getOuterCoordinator$ui() != yf9VarP0) {
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j6 = yf9VarP0.c;
                yf9 outerCoordinator$ui = layoutNodeS0.getOuterCoordinator$ui();
                outerCoordinator$ui.getClass();
                long jR = qn4.R(outerCoordinator$ui.O(yf9VarP0, jFloatToRawIntBits, true));
                mpbVar = new mpb(jR, (4294967295L & ((long) (((int) (jR & 4294967295L)) + ((int) (j6 & 4294967295L))))) | (((long) (((int) (jR >> 32)) + ((int) (j6 >> 32)))) << 32), j3, j4, j5, fArr, qr0Var);
            } else {
                mpbVar = new mpb(j, j2, j3, j4, j5, fArr, qr0Var);
            }
            mpbVar2 = mpbVar;
        } else {
            mpbVar2 = null;
        }
        if (mpbVar2 == null) {
            return;
        }
        this.c.d(mpbVar2);
    }

    public final void b() {
        u98 u98Var = this.h;
        q69 q69Var = (q69) u98Var.e;
        int i = this.a;
        rwe rweVar = (rwe) q69Var.g(i);
        if (rweVar != null) {
            if (rweVar == this) {
                rwe rweVar2 = this.d;
                this.d = null;
                if (rweVar2 != null) {
                    int iD = q69Var.d(i);
                    Object[] objArr = q69Var.c;
                    Object obj = objArr[iD];
                    q69Var.b[iD] = i;
                    objArr[iD] = rweVar2;
                    return;
                }
                LayoutNode layoutNodeS0 = vd0.s0(this.b.a);
                if (layoutNodeS0.W()) {
                    jkb rectManager = wv7.a(layoutNodeS0).getRectManager();
                    rectManager.getClass();
                    if (layoutNodeS0.g != -4) {
                        os osVar = rectManager.c;
                        int iD2 = rectManager.d(layoutNodeS0);
                        long[] jArr = (long[]) osVar.c;
                        int i2 = iD2 + 2;
                        jArr[i2] = jArr[i2] & 8070450532247928831L;
                        return;
                    }
                    return;
                }
                return;
            }
            int iD3 = q69Var.d(i);
            Object[] objArr2 = q69Var.c;
            Object obj2 = objArr2[iD3];
            q69Var.b[iD3] = i;
            objArr2[iD3] = rweVar;
            while (true) {
                rwe rweVar3 = rweVar.d;
                if (rweVar3 == null) {
                    break;
                }
                if (rweVar3 == this) {
                    rweVar.d = this.d;
                    this.d = null;
                    return;
                }
                rweVar = rweVar3;
            }
        }
        rwe rweVar4 = (rwe) u98Var.f;
        if (rweVar4 == this) {
            u98Var.f = rweVar4.d;
            this.d = null;
            return;
        }
        rwe rweVar5 = rweVar4 != null ? rweVar4.d : null;
        while (true) {
            rwe rweVar6 = rweVar4;
            rweVar4 = rweVar5;
            if (rweVar4 == null) {
                return;
            }
            if (rweVar4 == this) {
                if (rweVar6 != null) {
                    rweVar6.d = rweVar4.d;
                }
                this.d = null;
                return;
            }
            rweVar5 = rweVar4.d;
        }
    }
}
