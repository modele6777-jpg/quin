package defpackage;

import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ak9 implements xn7 {
    public final xn7 a;
    public final pyc b;

    public ak9(xn7 xn7Var) {
        this.a = xn7Var;
        this.b = eec.o("NullableServerResponse", new nyc[]{xn7Var.e()}, new p59(7, this));
    }

    @Override // defpackage.xn7
    public final void a(ev4 ev4Var, Object obj) {
        NullableServerResponse nullableServerResponse = (NullableServerResponse) obj;
        nullableServerResponse.getClass();
        sh7 sh7Var = (sh7) ev4Var;
        ui7 ui7Var = new ui7();
        jgb.d0(ui7Var, "login", Boolean.valueOf(nullableServerResponse.getLogin()));
        jgb.d0(ui7Var, "success", Boolean.valueOf(nullableServerResponse.getSuccess()));
        jgb.d0(ui7Var, "error", Boolean.valueOf(nullableServerResponse.getError()));
        ui7Var.a(oh7.b(Integer.valueOf(nullableServerResponse.getErrorCode())), "errorCode");
        ui7Var.a(oh7.c(nullableServerResponse.getErrorMessage()), "errorMessage");
        if (nullableServerResponse.getData() != null) {
            ui7Var.a(sh7Var.d().c(this.a, nullableServerResponse.getData()), "data");
        } else {
            ui7Var.a(qi7.INSTANCE, "data");
        }
        sh7Var.z(new ti7(ui7Var.a));
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009f  */
    @Override // defpackage.xn7
    public final Object c(om3 om3Var) {
        String strC;
        Integer numG;
        Boolean boolB;
        Boolean boolB2;
        Boolean boolB3;
        jh7 jh7Var = (jh7) om3Var;
        ti7 ti7VarH = oh7.h(jh7Var.m());
        nh7 nh7Var = (nh7) ti7VarH.get("login");
        int iIntValue = 0;
        boolean zBooleanValue = (nh7Var == null || (boolB3 = n4e.b(oh7.i(nh7Var).c())) == null) ? false : boolB3.booleanValue();
        nh7 nh7Var2 = (nh7) ti7VarH.get("success");
        boolean zBooleanValue2 = (nh7Var2 == null || (boolB2 = n4e.b(oh7.i(nh7Var2).c())) == null) ? false : boolB2.booleanValue();
        nh7 nh7Var3 = (nh7) ti7VarH.get("error");
        boolean zBooleanValue3 = (nh7Var3 == null || (boolB = n4e.b(oh7.i(nh7Var3).c())) == null) ? false : boolB.booleanValue();
        nh7 nh7Var4 = (nh7) ti7VarH.get("errorCode");
        if (nh7Var4 != null && (numG = oh7.g(oh7.i(nh7Var4))) != null) {
            iIntValue = numG.intValue();
        }
        int i = iIntValue;
        nh7 nh7Var5 = (nh7) ti7VarH.get("errorMessage");
        Object objA = null;
        if (nh7Var5 != null) {
            yi7 yi7VarI = oh7.i(nh7Var5);
            strC = yi7VarI instanceof qi7 ? null : yi7VarI.c();
            if (strC == null) {
                strC = "";
            }
        } else {
            strC = "";
        }
        String str = strC;
        nh7 nh7Var6 = (nh7) ti7VarH.get("data");
        if (nh7Var6 != null && !(nh7Var6 instanceof qi7) && (!(nh7Var6 instanceof ti7) || !((ti7) nh7Var6).a.isEmpty())) {
            objA = jh7Var.d().a(this.a, nh7Var6);
        }
        return new NullableServerResponse(zBooleanValue, zBooleanValue2, zBooleanValue3, i, str, objA);
    }

    @Override // defpackage.xn7
    public final nyc e() {
        return this.b;
    }
}
