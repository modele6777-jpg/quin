package defpackage;

import tech.chatmind.api.RedeemRequest;
import tech.chatmind.api.RedeemResponse;
import tech.chatmind.api.TarotOrderErrorData;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class emb {
    public final ilb a;

    public emb(ilb ilbVar) {
        this.a = ilbVar;
    }

    public static jzc c(int i, int i2, String str, Boolean bool) {
        switch (i) {
            case 10018:
            case 10019:
            case 10020:
                str.getClass();
                return new pc7(i2, i, str, null, null, 248);
            default:
                switch (i) {
                    case 140001:
                    case 140002:
                    case 140003:
                    case 140004:
                    case 140005:
                        str.getClass();
                        return new klb(i2, i, str, null, null, 248);
                    default:
                        switch (i) {
                            case 180001:
                            case 180002:
                            case 180003:
                            case 180004:
                            case 180005:
                            case 180006:
                                if (bool != null) {
                                    return new q96(str, i2, i, bool.booleanValue());
                                }
                                str.getClass();
                                return new q96(str, i2, i, i == 180004 || i == 180005);
                            default:
                                return new jzc(i2, i, str, null, null, 248);
                        }
                }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, String str2, Boolean bool, zn2 zn2Var) throws jzc {
        cmb cmbVar;
        String strU;
        Object dzbVar;
        nh7 nh7Var;
        RedeemResponse redeemResponse;
        if (zn2Var instanceof cmb) {
            cmbVar = (cmb) zn2Var;
            int i = cmbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cmbVar.label = i - Integer.MIN_VALUE;
            } else {
                cmbVar = new cmb(this, zn2Var);
            }
        } else {
            cmbVar = new cmb(this, zn2Var);
        }
        Object objA = cmbVar.result;
        int i2 = cmbVar.label;
        Boolean boolB = null;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                ilb ilbVar = this.a;
                RedeemRequest redeemRequest = new RedeemRequest(str, str2, bool);
                cmbVar.L$0 = null;
                cmbVar.L$1 = str2;
                cmbVar.L$2 = null;
                cmbVar.label = 1;
                objA = ilbVar.a(redeemRequest, cmbVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str2 = (String) cmbVar.L$1;
                jzb.q(objA);
            }
            NullableServerResponse nullableServerResponse = (NullableServerResponse) objA;
            if (nullableServerResponse.getSuccess() && nullableServerResponse.getData() != null) {
                return nullableServerResponse.getData();
            }
            int errorCode = nullableServerResponse.getErrorCode();
            String errorMessage = nullableServerResponse.getErrorMessage();
            if (pa7.t(str2, "gift-card") && (redeemResponse = (RedeemResponse) nullableServerResponse.getData()) != null) {
                boolB = redeemResponse.getRetryable();
            }
            throw c(errorCode, 200, errorMessage, boolB);
        } catch (qs6 e) {
            vyb vybVar = e.a.c;
            if (vybVar == null || (strU = vybVar.u()) == null) {
                throw e;
            }
            try {
                xh7 xh7Var = fzc.a;
                xh7Var.getClass();
                dzbVar = (NullableServerResponse) xh7Var.b(NullableServerResponse.Companion.serializer(nh7.Companion.serializer()), strU);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (dzbVar instanceof dzb) {
                dzbVar = null;
            }
            NullableServerResponse nullableServerResponse2 = (NullableServerResponse) dzbVar;
            if (nullableServerResponse2 == null) {
                throw e;
            }
            if (pa7.t(str2, "gift-card")) {
                Object data = nullableServerResponse2.getData();
                ti7 ti7Var = data instanceof ti7 ? (ti7) data : null;
                if (ti7Var != null && (nh7Var = (nh7) ti7Var.get("retryable")) != null) {
                    boolB = n4e.b(oh7.i(nh7Var).c());
                }
            }
            throw c(nullableServerResponse2.getErrorCode(), e.a(), nullableServerResponse2.getErrorMessage(), boolB);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, zn2 zn2Var) throws qie {
        dmb dmbVar;
        Object dzbVar;
        if (zn2Var instanceof dmb) {
            dmbVar = (dmb) zn2Var;
            int i = dmbVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                dmbVar.label = i - Integer.MIN_VALUE;
            } else {
                dmbVar = new dmb(this, zn2Var);
            }
        } else {
            dmbVar = new dmb(this, zn2Var);
        }
        Object objA = dmbVar.result;
        int i2 = dmbVar.label;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                ilb ilbVar = this.a;
                RedeemRequest redeemRequest = new RedeemRequest(str, "tarot-order", (Boolean) null, 4, (rp3) null);
                dmbVar.L$0 = null;
                dmbVar.label = 1;
                objA = ilbVar.a(redeemRequest, dmbVar);
                bw2 bw2Var = bw2.a;
                if (objA == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(objA);
            }
            NullableServerResponse nullableServerResponse = (NullableServerResponse) objA;
            if (!nullableServerResponse.getSuccess() || nullableServerResponse.getData() == null) {
                throw new qie(nullableServerResponse.getErrorMessage(), 200, nullableServerResponse.getErrorCode(), null);
            }
            return nullableServerResponse.getData();
        } catch (qs6 e) {
            vyb vybVar = e.a.c;
            String strU = vybVar != null ? vybVar.u() : null;
            if (strU == null || strU.length() == 0) {
                throw new qie("", e.a(), 0, null);
            }
            try {
                xh7 xh7Var = fzc.a;
                xh7Var.getClass();
                NullableServerResponse nullableServerResponse2 = (NullableServerResponse) xh7Var.b(NullableServerResponse.Companion.serializer(TarotOrderErrorData.Companion.serializer()), strU);
                int iA = e.a();
                int errorCode = nullableServerResponse2.getErrorCode();
                String errorMessage = nullableServerResponse2.getErrorMessage();
                TarotOrderErrorData tarotOrderErrorData = (TarotOrderErrorData) nullableServerResponse2.getData();
                dzbVar = new qie(errorMessage, iA, errorCode, tarotOrderErrorData != null ? tarotOrderErrorData.getTarotIds() : null);
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (ezb.a(dzbVar) != null) {
                dzbVar = new qie("", e.a(), 0, null);
            }
            throw ((qie) dzbVar);
        }
    }
}
