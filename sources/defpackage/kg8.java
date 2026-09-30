package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kg8 implements sw3 {
    public boolean a;
    public long b = 9223372034707292159L;
    public long c = 0;
    public final /* synthetic */ lg8 d;

    public kg8(lg8 lg8Var) {
        this.d = lg8Var;
    }

    public final void a(rq6 rq6Var, float f) {
        lg8 lg8Var = this.d;
        a80 a80Var = lg8Var.F0;
        if (a80Var == null) {
            a80Var = new a80();
            lg8Var.F0 = a80Var;
        }
        int iR0 = qd0.r0((rq6[]) a80Var.c, rq6Var);
        if (iR0 >= 0) {
            float[] fArr = (float[]) a80Var.d;
            if (fArr[iR0] != f) {
                fArr[iR0] = f;
                ((byte[]) a80Var.e)[iR0] = 1;
                return;
            } else {
                byte[] bArr = (byte[]) a80Var.e;
                if (bArr[iR0] == 2) {
                    bArr[iR0] = 0;
                    return;
                }
                return;
            }
        }
        int i = a80Var.b;
        rq6[] rq6VarArr = (rq6[]) a80Var.c;
        if (i == rq6VarArr.length) {
            int i2 = i * 2;
            a80Var.c = (rq6[]) Arrays.copyOf(rq6VarArr, i2);
            a80Var.d = Arrays.copyOf((float[]) a80Var.d, i2);
            a80Var.e = Arrays.copyOf((byte[]) a80Var.e, i2);
        }
        ((rq6[]) a80Var.c)[i] = rq6Var;
        ((byte[]) a80Var.e)[i] = 3;
        ((float[]) a80Var.d)[i] = f;
        a80Var.b++;
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.d.getDensity();
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.d.h0();
    }
}
