package defpackage;

import ai.askquin.R;
import android.content.Context;
import tech.chatmind.api.RedeemPopup;
import tech.chatmind.api.RedeemResponse;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vc7 extends gbe implements l26 {
    final /* synthetic */ String $orderId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ yc7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vc7(yc7 yc7Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = yc7Var;
        this.$orderId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        vc7 vc7Var = new vc7(this.this$0, this.$orderId, xn2Var);
        vc7Var.L$0 = obj;
        return vc7Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object dzbVar;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                uc7 uc7Var = new uc7(this.this$0, this.$orderId, null);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                obj = lw2.b(uc7Var, this);
                bw2 bw2Var = bw2.a;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            dzbVar = (RedeemResponse) obj;
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        yc7 yc7Var = this.this$0;
        Throwable thA = ezb.a(dzbVar);
        if (thA != null) {
            Context contextZ = cn1.z();
            int i2 = hmb.b;
            qie qieVar = thA instanceof qie ? (qie) thA : null;
            boolean z = false;
            if (qieVar != null && qieVar.getErrorCode() == 150002) {
                z = true;
            }
            String string = z ? contextZ.getString(R.string.redeem_tarot_order_error_all_redeemed) : contextZ.getString(R.string.redeem_tarot_order_error_not_found);
            string.getClass();
            ulb ulbVar = new ulb(string, z ? "already_redeemed" : "invalid_code", (!z || qieVar == null) ? null : qieVar.getTarotIds());
            r05 r05Var = new r05("redeem_result");
            rc7 rc7Var = new rc7(ulbVar, 1);
            int i3 = yc7.Z;
            yc7Var.w.z(r05Var, rc7Var);
            yc7Var.y.setValue(string);
        }
        yc7 yc7Var2 = this.this$0;
        if (!(dzbVar instanceof dzb)) {
            RedeemResponse redeemResponse = (RedeemResponse) dzbVar;
            r05 r05Var2 = new r05("redeem_result");
            qc7 qc7Var = new qc7(redeemResponse, 1);
            int i4 = yc7.Z;
            yc7Var2.w.z(r05Var2, qc7Var);
            RedeemPopup popup = redeemResponse.getPopup();
            if (popup != null) {
                yc7Var2.z.setValue(new m8e(popup, redeemResponse.getType(), null));
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((vc7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
