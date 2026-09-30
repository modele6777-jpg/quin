package defpackage;

import android.content.Context;
import com.adjust.sdk.Adjust;
import com.adjust.sdk.AdjustConfig;
import com.adjust.sdk.AdjustEvent;
import com.adjust.sdk.LogLevel;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jh implements o05, hf8 {
    public final Context a;

    public jh(Context context) {
        this.a = context;
    }

    @Override // defpackage.o05
    public final void a() {
        Adjust.enable();
    }

    @Override // defpackage.o05
    public final void b(String str) {
        AdjustConfig adjustConfig = new AdjustConfig(this.a, "jnig8695y2gw", AdjustConfig.ENVIRONMENT_PRODUCTION);
        adjustConfig.setLogLevel(LogLevel.SUPPRESS);
        if (str != null) {
            if (v4e.Q(str)) {
                str = null;
            }
            if (str != null) {
                adjustConfig.setExternalDeviceId(str);
            }
        }
        Adjust.initSdk(adjustConfig);
    }

    @Override // defpackage.o05
    public final void c(String str, trd trdVar) {
        str.getClass();
        String str2 = (String) ih.a.get(str);
        if (str2 == null) {
            return;
        }
        l1f l1fVar = new l1f();
        trdVar.d(l1fVar);
        AdjustEvent adjustEvent = new AdjustEvent(str2);
        boolean zContains = ih.b.contains(str);
        LinkedHashMap linkedHashMap = l1fVar.a;
        if (zContains) {
            Object obj = linkedHashMap.get("revenue_amount");
            String str3 = null;
            Number number = obj instanceof Number ? (Number) obj : null;
            Double dValueOf = number != null ? Double.valueOf(number.doubleValue()) : null;
            Object obj2 = linkedHashMap.get("revenue_currency");
            String str4 = obj2 instanceof String ? (String) obj2 : null;
            if (str4 != null && !v4e.Q(str4)) {
                str3 = str4;
            }
            if (dValueOf == null || str3 == null) {
                d().g("revenue event " + str + " missing amount/currency, sent as plain event");
            } else {
                adjustEvent.setRevenue(dValueOf.doubleValue(), str3);
            }
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            String str5 = (String) entry.getKey();
            Object value = entry.getValue();
            if (!pa7.t(str5, "revenue_amount") && !pa7.t(str5, "revenue_currency")) {
                adjustEvent.addCallbackParameter(str5, value.toString());
            }
        }
        Adjust.trackEvent(adjustEvent);
    }

    @Override // defpackage.o05
    public final void reset() {
    }

    @Override // defpackage.o05
    public final void e(a26 a26Var) {
    }

    @Override // defpackage.o05
    public final void f(String str) {
    }
}
