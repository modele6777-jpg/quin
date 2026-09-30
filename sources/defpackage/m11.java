package defpackage;

import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m11 implements a26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ m11(float f, t6b t6bVar, TarotCardChoice tarotCardChoice, l26 l26Var, x16 x16Var) {
        this.b = f;
        this.c = t6bVar;
        this.d = tarotCardChoice;
        this.e = l26Var;
        this.f = x16Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        long j;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                hkb hkbVar = (hkb) obj5;
                ss9 ss9Var = (ss9) obj4;
                b41 b41Var = (b41) obj3;
                float f = this.b;
                zt ztVar = (zt) obj2;
                sn4 sn4Var = (sn4) obj;
                float f2 = -hkbVar.a;
                float f3 = -hkbVar.b;
                ((vd9) sn4Var.v0().c).I(f2, f3);
                try {
                    sn4.s(sn4Var, ss9Var.a, b41Var, 0.0f, new d5e(f * 2.0f, 0.0f, 0, 0, null, 30), null, 0, 52);
                    float fIntBitsToFloat = (Float.intBitsToFloat((int) (sn4Var.f() >> 32)) + 1.0f) / Float.intBitsToFloat((int) (sn4Var.f() >> 32));
                    float fIntBitsToFloat2 = (Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L)) + 1.0f) / Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L));
                    long jH0 = sn4Var.H0();
                    ta0 ta0VarV0 = sn4Var.v0();
                    long jZ = ta0VarV0.z();
                    ta0VarV0.p().g();
                    try {
                        ((vd9) ta0VarV0.c).G(fIntBitsToFloat, fIntBitsToFloat2, jH0);
                        j = jZ;
                        try {
                            sn4.s(sn4Var, ztVar, b41Var, 0.0f, null, null, 0, 28);
                            ta0VarV0.p().o();
                            ta0VarV0.R(j);
                            ((vd9) sn4Var.v0().c).I(-f2, -f3);
                            return wefVar;
                        } catch (Throwable th) {
                            th = th;
                            ta0VarV0.p().o();
                            ta0VarV0.R(j);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        j = jZ;
                    }
                } catch (Throwable th3) {
                    ((vd9) sn4Var.v0().c).I(-f2, -f3);
                    throw th3;
                }
                break;
            case 1:
                t6b t6bVar = (t6b) obj5;
                v08 v08Var = (v08) obj;
                v08Var.getClass();
                float f4 = this.b;
                v08.W(v08Var, null, new dd2(new j43(f4, t6bVar, (TarotCardChoice) obj4, (l26) obj3, 2), true, -1250115802), 3);
                v08.W(v08Var, null, new dd2(new k43(f4, t6bVar, 2), true, 1073681437), 3);
                v08.W(v08Var, null, new dd2(new k43(f4, (x16) obj2, 3), true, -1966503842), 3);
                return wefVar;
            default:
                long jLongValue = ((Long) obj).longValue();
                Object obj6 = ((mmb) obj5).element;
                obj6.getClass();
                hkg.l0((uz) obj6, jLongValue, this.b, (qz) obj4, (wz) obj3, (a26) obj2);
                return wefVar;
        }
    }

    public /* synthetic */ m11(hkb hkbVar, ss9 ss9Var, b41 b41Var, float f, zt ztVar) {
        this.c = hkbVar;
        this.d = ss9Var;
        this.e = b41Var;
        this.b = f;
        this.f = ztVar;
    }

    public /* synthetic */ m11(mmb mmbVar, float f, qz qzVar, wz wzVar, a26 a26Var) {
        this.c = mmbVar;
        this.b = f;
        this.d = qzVar;
        this.e = wzVar;
        this.f = a26Var;
    }
}
