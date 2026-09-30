package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class tg9 implements a26 {
    public final /* synthetic */ int a;
    public final szc b;

    public /* synthetic */ tg9(szc szcVar, int i) {
        this.a = i;
        this.b = szcVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        szc szcVar = this.b;
        switch (i) {
            case 0:
                dx5 dx5Var = (dx5) obj;
                dx5Var.getClass();
                return new su4((w09) szcVar.c, dx5Var, 0);
            default:
                ug9 ug9Var = (ug9) obj;
                ug9Var.getClass();
                j22 j22Var = ug9Var.a;
                List list = ug9Var.b;
                if (j22Var.c) {
                    s8f.n(j22Var, "Unresolved local class: ");
                    return null;
                }
                j22 j22VarE = j22Var.e();
                o22 o22VarJ = j22VarE != null ? szcVar.J(j22VarE, s72.r0(list, 1)) : (o22) ((be8) szcVar.d).d(j22Var.a);
                boolean zG = j22Var.g();
                ge8 ge8Var = (ge8) szcVar.b;
                t99 t99VarF = j22Var.f();
                Integer num = (Integer) s72.x0(list);
                return new vg9(ge8Var, o22VarJ, t99VarF, zG, num != null ? num.intValue() : 0);
        }
    }
}
