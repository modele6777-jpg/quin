package defpackage;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class cy3 implements x16 {
    public final /* synthetic */ int a;
    public final ey3 b;

    public /* synthetic */ cy3(ey3 ey3Var, int i) {
        this.a = i;
        this.b = ey3Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        ey3 ey3Var = this.b;
        switch (i) {
            case 0:
                return sqf.d(ey3Var.z());
            default:
                zy9 zy9VarZ = ey3Var.z();
                rx3 rx3Var = ey3Var.a;
                if (!(zy9VarZ instanceof nw7) || !pa7.t(sqf.h(rx3Var), zy9VarZ) || (rx3Var.a.d == null && rx3Var.G().g() != 2)) {
                    return (Type) rx3Var.h().a().get(ey3Var.b);
                }
                xm7 xm7VarS = rx3Var.s();
                nm7 nm7Var = xm7VarS instanceof nm7 ? (nm7) xm7VarS : null;
                if (nm7Var != null) {
                    return af1.R(nm7Var);
                }
                ho7.m(zy9VarZ, "Cannot determine receiver Java type of inherited declaration: ");
                return null;
        }
    }
}
