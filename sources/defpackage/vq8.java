package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class vq8 implements x16 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final int d;

    public /* synthetic */ vq8(Object obj, Object obj2, int i, int i2) {
        this.a = i2;
        this.b = obj;
        this.c = obj2;
        this.d = i;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        List listJ1;
        int i = this.a;
        pu4 pu4Var = pu4.a;
        int i2 = this.d;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yq8 yq8Var = (yq8) obj2;
                ut8 ut8Var = (ut8) obj;
                lp0 lp0Var = yq8Var.a;
                m0b m0bVarA = yq8Var.a((bm3) lp0Var.d);
                listJ1 = m0bVarA != null ? s72.j1(((tz3) lp0Var.b).e.l(m0bVarA, ut8Var, i2)) : null;
                return listJ1 == null ? pu4Var : listJ1;
            case 1:
                yq8 yq8Var2 = (yq8) obj2;
                ut8 ut8Var2 = (ut8) obj;
                lp0 lp0Var2 = yq8Var2.a;
                m0b m0bVarA2 = yq8Var2.a((bm3) lp0Var2.d);
                listJ1 = m0bVarA2 != null ? ((tz3) lp0Var2.b).e.t(m0bVarA2, ut8Var2, i2) : null;
                return listJ1 == null ? pu4Var : listJ1;
            default:
                xs6 xs6Var = (xs6) obj2;
                f5 f5Var = (f5) ((ArrayList) obj).get(i2);
                boolean z = f5Var.c == null;
                y00 y00Var = (y00) xs6Var.e;
                boolean z2 = y00Var == y00.TYPE_PARAMETER_BOUNDS;
                if (!z && !z2) {
                    y00Var = y00.TYPE_USE;
                }
                xf7 xf7Var = f5Var.b;
                if (xf7Var != null) {
                    return (ge7) xf7Var.a.get(y00Var);
                }
                return null;
        }
    }
}
