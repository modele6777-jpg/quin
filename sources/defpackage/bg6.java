package defpackage;

import java.util.concurrent.CancellationException;
import tech.chatmind.api.guestpass.GuestPassInfoResponse;
import tech.chatmind.api.server.NullableServerResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bg6 implements zf6 {
    public final mf6 a;

    public bg6(mf6 mf6Var) {
        this.a = mf6Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) throws Throwable {
        ag6 ag6Var;
        if (zn2Var instanceof ag6) {
            ag6Var = (ag6) zn2Var;
            int i = ag6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ag6Var.label = i - Integer.MIN_VALUE;
            } else {
                ag6Var = new ag6(this, zn2Var);
            }
        } else {
            ag6Var = new ag6(this, zn2Var);
        }
        Object objA = ag6Var.result;
        int i2 = ag6Var.label;
        try {
            if (i2 == 0) {
                jzb.q(objA);
                mf6 mf6Var = this.a;
                ag6Var.label = 1;
                objA = mf6Var.a(qu4.a, ag6Var);
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
            GuestPassInfoResponse guestPassInfoResponse = (GuestPassInfoResponse) nullableServerResponse.getData();
            if (guestPassInfoResponse != null) {
                GuestPassInfoResponse guestPassInfoResponse2 = nullableServerResponse.getSuccess() ? guestPassInfoResponse : null;
                if (guestPassInfoResponse2 != null) {
                    return guestPassInfoResponse2;
                }
            }
            int errorCode = nullableServerResponse.getErrorCode();
            String errorMessage = nullableServerResponse.getErrorMessage();
            errorMessage.getClass();
            throw new pf6(200, errorCode, errorMessage, null, null, 248);
        } catch (CancellationException e) {
            throw e;
        } catch (qs6 e2) {
            throw nzc.b(e2);
        }
    }
}
