package defpackage;

import android.util.Log;
import io.sentry.android.core.b1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gqb extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ iqb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gqb(iqb iqbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = iqbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gqb gqbVar = new gqb(this.this$0, xn2Var);
        gqbVar.L$0 = obj;
        return gqbVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws JSONException {
        Boolean bool;
        Double d;
        Integer num;
        JSONException jSONException;
        Integer num2;
        Double d2;
        Boolean bool2;
        int i = this.label;
        Integer num3 = null;
        if (i == 0) {
            jzb.q(obj);
            JSONObject jSONObject = (JSONObject) this.L$0;
            Log.d("FirebaseSessions", "Fetched settings: " + jSONObject);
            if (jSONObject.has("app_quality")) {
                Object obj2 = jSONObject.get("app_quality");
                obj2.getClass();
                JSONObject jSONObject2 = (JSONObject) obj2;
                try {
                    bool2 = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                    try {
                        d2 = jSONObject2.has("sampling_rate") ? (Double) jSONObject2.get("sampling_rate") : null;
                        try {
                            num2 = jSONObject2.has("session_timeout_seconds") ? (Integer) jSONObject2.get("session_timeout_seconds") : null;
                            try {
                                if (jSONObject2.has("cache_duration")) {
                                    num3 = (Integer) jSONObject2.get("cache_duration");
                                }
                            } catch (JSONException e) {
                                jSONException = e;
                                ok8.j(b1.e("FirebaseSessions", "Error parsing the configs remotely fetched: ", jSONException));
                            }
                        } catch (JSONException e2) {
                            jSONException = e2;
                            num2 = null;
                        }
                    } catch (JSONException e3) {
                        jSONException = e3;
                        num2 = null;
                        d2 = null;
                    }
                } catch (JSONException e4) {
                    jSONException = e4;
                    num2 = null;
                    d2 = null;
                    bool2 = null;
                }
                num = num2;
                d = d2;
                bool = bool2;
            } else {
                bool = null;
                d = null;
                num = null;
            }
            w3d w3dVar = this.this$0.e;
            int iIntValue = num3 != null ? num3.intValue() : iqb.g;
            this.this$0.a.getClass();
            g0d g0dVar = new g0d(bool, d, num, new Integer(iIntValue), new Long(yxe.a().c));
            this.label = 1;
            Object objC = w3dVar.c(g0dVar, this);
            bw2 bw2Var = bw2.a;
            if (objC == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gqb) k((xn2) obj2, (JSONObject) obj)).r(wef.a);
    }
}
