package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dw7 extends rv7 {
    public final /* synthetic */ gw7 b;
    public final /* synthetic */ l26 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw7(gw7 gw7Var, l26 l26Var, String str) {
        super(str);
        this.b = gw7Var;
        this.c = l26Var;
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        gw7 gw7Var = this.b;
        bw7 bw7Var = gw7Var.v;
        bw7Var.a = zn8Var.getLayoutDirection();
        bw7Var.b = zn8Var.getDensity();
        bw7Var.c = zn8Var.h0();
        boolean zK0 = zn8Var.k0();
        l26 l26Var = this.c;
        if (zK0 || gw7Var.a.w == null) {
            gw7Var.d = 0;
            yn8 yn8Var = (yn8) l26Var.z(bw7Var, new kl2(j));
            return new cw7(yn8Var, gw7Var, gw7Var.d, yn8Var, 1);
        }
        gw7Var.e = 0;
        yn8 yn8Var2 = (yn8) l26Var.z(gw7Var.w, new kl2(j));
        return new cw7(yn8Var2, gw7Var, gw7Var.e, yn8Var2, 0);
    }
}
