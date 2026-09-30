package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nl implements ml {
    public static volatile nl c;
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b;

    public nl(AppMeasurementSdk appMeasurementSdk) {
        oa7.A(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        if (etg.a(str) && etg.b(str2, bundle) && etg.d(str, str2, bundle)) {
            if ("clx".equals(str) && "_ae".equals(str2)) {
                bundle.putLong("_r", 1L);
            }
            this.a.logEvent(str, str2, bundle);
        }
    }

    public final i8c b(String str, kl klVar) {
        Object obj;
        vrb vrbVar;
        gsg gsgVar;
        oa7.A(klVar);
        if (etg.a(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.a;
                if (zEquals) {
                    gsgVar = new gsg();
                    gsgVar.b = klVar;
                    appMeasurementSdk.a(new uvg(0, gsgVar));
                    gsgVar.a = new HashSet();
                } else if ("clx".equals(str)) {
                    vrbVar = new vrb(appMeasurementSdk, klVar);
                } else {
                    obj = null;
                }
                if (obj != null) {
                    obj = vrbVar;
                    obj = gsgVar;
                    concurrentHashMap.put(str, obj);
                    return new i8c(10);
                }
            }
        }
        obj = vrbVar;
        obj = gsgVar;
        return null;
    }
}
