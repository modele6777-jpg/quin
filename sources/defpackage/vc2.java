package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vc2 implements xn8 {
    public final /* synthetic */ float a;

    public vc2(float f) {
        this.a = f;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        list.getClass();
        int iH = kl2.h(j);
        float f = this.a;
        iy9 iy9Var = iH < zn8Var.D0(f) ? new iy9(Integer.valueOf(zn8Var.D0(f)), Float.valueOf(kl2.h(j) / zn8Var.p0(f))) : new iy9(Integer.valueOf(kl2.h(j)), Float.valueOf(1.0f));
        int iIntValue = ((Number) iy9Var.a()).intValue();
        float fFloatValue = ((Number) iy9Var.b()).floatValue();
        cea ceaVarV = ((tn8) list.get(0)).v(kl2.a(j, 0, iIntValue, 0, kl2.g(j), 5));
        return zn8Var.n0(ceaVarV.Y(), ym8.L(ceaVarV.X() * fFloatValue), qu4.a, new tc2(ceaVarV, fFloatValue, 0));
    }
}
