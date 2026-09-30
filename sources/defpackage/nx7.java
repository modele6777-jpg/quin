package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class nx7 implements x16 {
    public final /* synthetic */ int a;
    public final ox7 b;

    public /* synthetic */ nx7(ox7 ox7Var, int i) {
        this.a = i;
        this.b = ox7Var;
    }

    @Override // defpackage.x16
    public final Object invoke() throws IllegalAccessException, InvocationTargetException {
        int i = this.a;
        ox7 ox7Var = this.b;
        switch (i) {
            case 0:
                return smb.a(af1.R(af1.Q(ox7Var.b.a))).a();
            case 1:
                dx5 dx5VarF = ox7Var.f();
                tmb tmbVar = ox7Var.b;
                szc szcVar = ox7Var.a;
                if (dx5VarF == null) {
                    return sy4.c(qy4.R0, tmbVar.toString());
                }
                mf7 mf7Var = (mf7) szcVar.b;
                xr7 xr7Var = mf7Var.h.e;
                xr7Var.getClass();
                String str = qf7.a;
                j22 j22VarG = qf7.g(dx5VarF);
                u09 u09VarJ = j22VarG != null ? xr7Var.j(j22VarG.a()) : null;
                if (u09VarJ == null) {
                    enb enbVar = new enb(af1.R(af1.Q(tmbVar.a)));
                    vd9 vd9Var = (vd9) mf7Var.f.a;
                    if (vd9Var == null) {
                        pa7.g0("resolver");
                        throw null;
                    }
                    u09VarJ = vd9Var.E(enbVar);
                    if (u09VarJ == null) {
                        u09VarJ = od4.r(mf7Var.h, new j22(dx5VarF.b(), dx5VarF.a.g()), mf7Var.d.c().l);
                    }
                }
                return u09VarJ.S();
            default:
                ArrayList<umb> arrayListB = ox7Var.b.b();
                ArrayList arrayList = new ArrayList();
                for (umb umbVar : arrayListB) {
                    t99 t99Var = umbVar.a;
                    if (t99Var == null) {
                        t99Var = pj7.b;
                    }
                    bl2 bl2VarA = ox7Var.a(umbVar);
                    iy9 iy9Var = bl2VarA != null ? new iy9(t99Var, bl2VarA) : null;
                    if (iy9Var != null) {
                        arrayList.add(iy9Var);
                    }
                }
                return bm8.W(arrayList);
        }
    }
}
