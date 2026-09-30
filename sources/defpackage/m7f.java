package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class m7f implements a26 {
    public final /* synthetic */ int a;
    public final o7f b;

    public /* synthetic */ m7f(o7f o7fVar, int i) {
        this.a = i;
        this.b = o7fVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        o7f o7fVar = this.b;
        switch (i) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                lp0 lp0Var = o7fVar.a;
                j22 j22VarU = i7h.u((u99) lp0Var.c, iIntValue);
                boolean z = j22VarU.c;
                tz3 tz3Var = (tz3) lp0Var.b;
                if (!z) {
                    return od4.q(tz3Var.b, j22VarU);
                }
                h22 h22Var = tz3Var.t;
                Set set = h22.c;
                return h22Var.a(j22VarU, null);
            case 1:
                int iIntValue2 = ((Number) obj).intValue();
                lp0 lp0Var2 = o7fVar.a;
                j22 j22VarU2 = i7h.u((u99) lp0Var2.c, iIntValue2);
                if (j22VarU2.c) {
                    return null;
                }
                w09 w09Var = ((tz3) lp0Var2.b).b;
                w09Var.getClass();
                y22 y22VarQ = od4.q(w09Var, j22VarU2);
                if (y22VarQ instanceof s04) {
                    return (s04) y22VarQ;
                }
                return null;
            default:
                vza vzaVar = (vza) obj;
                vzaVar.getClass();
                return feg.M(vzaVar, (bu3) o7fVar.a.e);
        }
    }
}
