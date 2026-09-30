package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class va4 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ va4(int i, x16 x16Var, Object obj, boolean z) {
        this.a = i;
        this.c = obj;
        this.b = z;
        this.d = x16Var;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = 1;
        int i2 = 2;
        switch (this.a) {
            case 0:
                boolean z = this.b;
                vea veaVar = (vea) this.c;
                String str = (String) this.d;
                if (z) {
                    jdc jdcVar = (jdc) veaVar.b;
                    synchronized (jdcVar.c) {
                    }
                }
                return wef.a;
            case 1:
                boolean z2 = this.b;
                a26 a26Var = (a26) this.c;
                e89 e89Var = (e89) this.d;
                if (z2) {
                    x1f x1fVar = x1f.a;
                    x1f.k(p05.a, new hl4(i2), 2);
                }
                Boolean bool = (Boolean) e89Var.getValue();
                bool.booleanValue();
                a26Var.d(bool);
                return wef.a;
            case 2:
                boolean z3 = this.b;
                x16 x16Var = (x16) this.c;
                SolarTerm solarTerm = (SolarTerm) this.d;
                if (z3) {
                    x1f x1fVar2 = x1f.a;
                    x1f.k(p05.a, new ft5(i, solarTerm), 2);
                }
                x16Var.invoke();
                return wef.a;
            case 3:
                zb4 zb4Var = (zb4) this.c;
                boolean z4 = this.b;
                x16 x16Var2 = (x16) this.d;
                if (zb4Var.d == tdb.b && !z4) {
                    x1f x1fVar3 = x1f.a;
                    x1f.g(p05.a, m1f.a, new oz5(28));
                }
                x16Var2.invoke();
                return wef.a;
            case 4:
                boolean z5 = this.b;
                x16 x16Var3 = (x16) this.c;
                e89 e89Var2 = (e89) this.d;
                if (z5) {
                    x16Var3.invoke();
                } else {
                    e89Var2.setValue(Boolean.TRUE);
                }
                return wef.a;
            case 5:
                ale aleVar = (ale) this.c;
                boolean z6 = this.b;
                x16 x16Var4 = (x16) this.d;
                if (aleVar != null && !z6) {
                    x16Var4.invoke();
                }
                return wef.a;
            case 6:
                boolean z7 = this.b;
                s69 s69Var = (s69) this.c;
                e89 e89Var3 = (e89) this.d;
                if (z7) {
                    x1f x1fVar4 = x1f.a;
                    x1f.k(p05.a, new fnc(0), 2);
                }
                ((sz9) s69Var).k(-1);
                e89Var3.setValue(Boolean.TRUE);
                return wef.a;
            case 7:
                boolean z8 = this.b;
                a26 a26Var2 = (a26) this.c;
                jnc jncVar = (jnc) this.d;
                if (z8) {
                    x1f x1fVar5 = x1f.a;
                    x1f.k(p05.a, new fnc(i), 2);
                }
                a26Var2.d(s72.t0(jncVar.e));
                return wef.a;
            case 8:
                boolean z9 = this.b;
                a26 a26Var3 = (a26) this.c;
                rcf rcfVar = (rcf) this.d;
                if (!z9) {
                    a26Var3.d(rcfVar.o());
                }
                return wef.a;
            default:
                boolean z10 = this.b;
                rcf rcfVar2 = (rcf) this.c;
                x16 x16Var5 = (x16) this.d;
                if (!z10) {
                    if (rcfVar2.h() != null) {
                        rcfVar2.p(null);
                    } else if (rcfVar2.g() == tn4.c) {
                        rcfVar2.v.setValue(tn4.b);
                    } else {
                        x16Var5.invoke();
                    }
                }
                return wef.a;
        }
    }

    public /* synthetic */ va4(boolean z, Object obj, Object obj2, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
        this.d = obj2;
    }
}
