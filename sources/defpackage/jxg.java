package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jxg extends BroadcastReceiver {
    public tx0 a;
    public boolean b = false;
    public final kwg c;

    public jxg(lqb lqbVar) {
        this.c = lqbVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            zsg.h("ProxyBillingReceiver", "Null intent!");
            return;
        }
        zsg.g("ProxyBillingReceiver", "Received intent action: ".concat(String.valueOf(intent.getAction())));
        boolean zEquals = Objects.equals(intent.getAction(), "com.android.vending.billing.IN_APP_BILLING_RESULT_UPDATE_ACTION");
        kwg kwgVar = this.c;
        if (zEquals) {
            if (!intent.hasExtra("RESPONSE_CODE")) {
                zsg.h("ProxyBillingReceiver", "Missing RESPONSE_CODE in intent.");
                if (kwgVar != null) {
                    ((lqb) kwgVar).F(null, intent.getLongExtra("billingClientTransactionId", 0L));
                    return;
                }
                return;
            }
            i iVarA = tx0.a();
            iVarA.a = intent.getIntExtra("RESPONSE_CODE", 0);
            String stringExtra = intent.getStringExtra("DEBUG_MESSAGE");
            if (stringExtra == null) {
                stringExtra = "";
            }
            iVarA.c = stringExtra;
            tx0 tx0VarA = iVarA.a();
            this.a = tx0VarA;
            if (kwgVar != null) {
                ((lqb) kwgVar).F(tx0VarA, intent.getLongExtra("billingClientTransactionId", 0L));
                return;
            }
            return;
        }
        if (!Objects.equals(intent.getAction(), "com.android.vending.billing.PLAY_BILLING_ACTIVITY_CREATED_ACTION")) {
            zsg.h("ProxyBillingReceiver", "Unexpected broadcast action: ".concat(String.valueOf(intent.getAction())));
            return;
        }
        this.b = true;
        if (kwgVar != null) {
            long longExtra = intent.getLongExtra("billingClientTransactionId", 0L);
            lqb lqbVar = (lqb) kwgVar;
            try {
                o6h o6hVarP = r6h.p();
                o6hVarP.b();
                r6h.u((r6h) o6hVarP.b, 4);
                j6h j6hVar = j6h.PLAY_BILLING_ACTIVITY_CREATED_ACTION;
                o6hVarP.b();
                r6h.q((r6h) o6hVarP.b, j6hVar);
                r6h r6hVar = (r6h) o6hVarP.a();
                e7h e7hVarR = h7h.r();
                u6h u6hVar = (u6h) lqbVar.b;
                if (longExtra != 0) {
                    s6h s6hVar = (s6h) u6hVar.l();
                    s6hVar.e(longExtra);
                    u6hVar = (u6h) s6hVar.a();
                }
                e7hVarR.c(u6hVar);
                e7hVarR.b();
                h7h.v((h7h) e7hVarR.b, r6hVar);
                ((pk1) lqbVar.c).q((h7h) e7hVarR.a());
            } catch (Throwable th) {
                zsg.i("BillingLogger", "Unable to log.", th);
            }
        }
    }
}
