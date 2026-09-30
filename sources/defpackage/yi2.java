package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yi2 extends db6 {
    public static yi2 l;
    public static final Map m;

    static {
        xi2 xi2Var = new xi2();
        xi2Var.put(461L, "FIREPERF_AUTOPUSH");
        xi2Var.put(462L, "FIREPERF");
        xi2Var.put(675L, "FIREPERF_INTERNAL_LOW");
        xi2Var.put(676L, "FIREPERF_INTERNAL_HIGH");
        m = Collections.unmodifiableMap(xi2Var);
    }

    @Override // defpackage.db6
    public final String M() {
        return "com.google.firebase.perf.LogSourceName";
    }
}
