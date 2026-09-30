package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q implements f0 {
    public final /* synthetic */ int a;
    public final Map b;
    public final q6 c;

    public q(q6 q6Var) {
        this.a = 1;
        this.b = Collections.synchronizedMap(new WeakHashMap());
        this.c = q6Var;
    }

    @Override // io.sentry.f0
    public final i5 h(i5 i5Var, l0 l0Var) {
        io.sentry.protocol.v vVarF;
        String str;
        Long l;
        int i = this.a;
        q6 q6Var = this.c;
        Map map = this.b;
        switch (i) {
            case 0:
                if (!o7.class.isInstance(l0Var.b("sentry:typeCheckHint")) || (vVarF = i5Var.f()) == null || (str = vVarF.a) == null || (l = vVarF.d) == null) {
                    return i5Var;
                }
                Long l2 = (Long) map.get(str);
                if (l2 == null || l2.equals(l)) {
                    map.put(str, l);
                    return i5Var;
                }
                ((SentryAndroidOptions) q6Var).getLogger().i(q5.INFO, "Event %s has been dropped due to multi-threaded deduplication", i5Var.a);
                l0Var.d(io.sentry.hints.e.MULTITHREADED_DEDUPLICATION, "sentry:eventDropReason");
                return null;
            default:
                if (!q6Var.isEnableDeduplication()) {
                    q6Var.getLogger().i(q5.DEBUG, "Event deduplication is disabled.", new Object[0]);
                    return i5Var;
                }
                Throwable thA = i5Var.a();
                if (thA == null) {
                    return i5Var;
                }
                if (!map.containsKey(thA)) {
                    ArrayList arrayList = new ArrayList();
                    for (Throwable cause = thA; cause.getCause() != null; cause = cause.getCause()) {
                        arrayList.add(cause.getCause());
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (map.containsKey(it.next())) {
                        }
                    }
                    map.put(thA, null);
                    return i5Var;
                }
                q6Var.getLogger().i(q5.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", i5Var.a);
                return null;
        }
    }

    public q(SentryAndroidOptions sentryAndroidOptions) {
        this.a = 0;
        this.b = Collections.synchronizedMap(new HashMap());
        this.c = sentryAndroidOptions;
    }
}
