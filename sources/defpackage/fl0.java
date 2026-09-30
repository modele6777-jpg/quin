package defpackage;

import ai.askquin.ui.account.navigation.AuthNavigation$AuthRoute;
import ai.askquin.ui.account.navigation.AuthNavigation$BindPhoneRoute;
import ai.askquin.ui.account.navigation.AuthNavigation$BindPhoneVerifyCodeRoute;
import ai.askquin.ui.account.navigation.AuthNavigation$EnterCodeRoute;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fl0 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fl0(Float f, tt1 tt1Var, String str, bv7[] bv7VarArr, boolean z) {
        this.a = 1;
        this.c = f;
        this.d = tt1Var;
        this.e = str;
        this.f = bv7VarArr;
        this.b = z;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        float fFloatValue;
        int i = this.a;
        int i2 = 2;
        wef wefVar = wef.a;
        boolean z = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                qmf qmfVar = (qmf) obj5;
                cb9 cb9Var = (cb9) obj4;
                za9 za9Var = (za9) obj;
                za9Var.getClass();
                dd2 dd2Var = new dd2(new gl0(qmfVar, cb9Var, (x16) obj3, this.b, (a26) obj2), true, -991065598);
                kob kobVar = job.a;
                em7 em7VarB = kobVar.b(AuthNavigation$AuthRoute.class);
                qu4 qu4Var = qu4.a;
                rs0.o(za9Var, em7VarB, qu4Var, null, null, null, null, dd2Var);
                rs0.o(za9Var, kobVar.b(AuthNavigation$EnterCodeRoute.class), qu4Var, null, null, null, null, new dd2(new hl0(qmfVar, cb9Var, 0), true, 151270649));
                rs0.o(za9Var, kobVar.b(AuthNavigation$BindPhoneRoute.class), qu4Var, null, null, null, null, new dd2(new hl0(cb9Var, qmfVar), true, -1544752710));
                rs0.o(za9Var, kobVar.b(AuthNavigation$BindPhoneVerifyCodeRoute.class), qu4Var, null, null, null, null, new dd2(new hl0(qmfVar, cb9Var, i2), true, 1054191227));
                return wefVar;
            case 1:
                tt1 tt1Var = (tt1) obj4;
                String str = (String) obj3;
                ((ra4) obj).getClass();
                ou1 ou1Var = new ou1(new mv0((bv7[]) obj2, z, 1), (Float) obj5);
                tt1Var.c.put(str, ou1Var);
                return new z6(tt1Var, str, ou1Var, 2);
            case 2:
                vz9 vz9Var = ((o89) obj5).c;
                e89 e89Var = (e89) obj4;
                h0e h0eVar = (h0e) obj3;
                h0e h0eVar2 = (h0e) obj2;
                g0c g0cVar = (g0c) obj;
                float fFloatValue2 = 0.8f;
                float fFloatValue3 = 1.0f;
                if (z) {
                    fFloatValue = ((Boolean) vz9Var.getValue()).booleanValue() ? 1.0f : 0.8f;
                } else {
                    fFloatValue = ((Number) h0eVar.getValue()).floatValue();
                }
                g0cVar.q(fFloatValue);
                if (!z) {
                    fFloatValue2 = ((Number) h0eVar.getValue()).floatValue();
                } else if (((Boolean) vz9Var.getValue()).booleanValue()) {
                    fFloatValue2 = 1.0f;
                }
                g0cVar.r(fFloatValue2);
                if (!z) {
                    fFloatValue3 = ((Number) h0eVar2.getValue()).floatValue();
                } else if (!((Boolean) vz9Var.getValue()).booleanValue()) {
                    fFloatValue3 = 0.0f;
                }
                g0cVar.b(fFloatValue3);
                g0cVar.D(((r2f) e89Var.getValue()).a);
                return wefVar;
            case 3:
                da9 da9Var = (da9) obj;
                da9Var.getClass();
                ((imb) obj5).element = true;
                ((imb) obj4).element = true;
                ((ma9) obj3).r(da9Var, z, (ad0) obj2);
                return wefVar;
            case 4:
                r38 r38Var = (r38) obj5;
                fo5 fo5Var = (fo5) obj4;
                cre creVar = (cre) obj3;
                sl9 sl9Var = (sl9) obj2;
                hl9 hl9Var = (hl9) obj;
                if (r38Var.b()) {
                    vsd vsdVar = r38Var.c;
                    if (vsdVar != null) {
                        ((dw3) vsdVar).b();
                    }
                } else {
                    fo5.a(fo5Var);
                }
                if (r38Var.b() && z) {
                    if (r38Var.a() != ug6.b) {
                        tte tteVarD = r38Var.d();
                        if (tteVarD != null) {
                            long j = hl9Var.a;
                            fz3 fz3Var = r38Var.d;
                            ou2 ou2Var = r38Var.v;
                            int iJ = sl9Var.j(tteVarD.b(j, true));
                            ou2Var.d(zse.a((zse) fz3Var.b, null, u3c.b(iJ, iJ), 5));
                            if (((k00) r38Var.a.b).b.length() > 0) {
                                r38Var.k.setValue(ug6.c);
                            }
                        }
                    } else {
                        creVar.d(hl9Var);
                    }
                }
                return wefVar;
            default:
                jse jseVar = (jse) obj4;
                long jA = svc.a(jseVar.o(z));
                ((lmb) obj5).element = jA;
                jseVar.A((sg6) obj3, jA);
                ((lmb) obj2).element = 0L;
                jseVar.v = -1;
                return wefVar;
        }
    }

    public /* synthetic */ fl0(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = z;
        this.f = obj4;
    }

    public /* synthetic */ fl0(Object obj, Object obj2, boolean z, Object obj3, Object obj4, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = z;
        this.e = obj3;
        this.f = obj4;
    }

    public /* synthetic */ fl0(boolean z, o89 o89Var, e89 e89Var, k3f k3fVar, k3f k3fVar2) {
        this.a = 2;
        this.b = z;
        this.c = o89Var;
        this.d = e89Var;
        this.e = k3fVar;
        this.f = k3fVar2;
    }
}
