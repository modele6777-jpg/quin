package io.sentry.android.core.performance;

import android.os.Looper;
import io.sentry.o1;
import io.sentry.v1;
import io.sentry.z4;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final String a;
    public z4 b = null;
    public z4 c = null;
    public o1 d = null;
    public o1 e = null;

    public b(String str) {
        this.a = str;
    }

    public static o1 a(o1 o1Var, String str, z4 z4Var) {
        o1 o1VarI = o1Var.i("activity.load", str, z4Var, v1.SENTRY);
        o1VarI.k(Long.valueOf(io.sentry.android.core.internal.util.e.d(Looper.getMainLooper().getThread())), "thread.id");
        o1VarI.k("main", "thread.name");
        Boolean bool = Boolean.TRUE;
        o1VarI.k(bool, "ui.contributes_to_ttid");
        o1VarI.k(bool, "ui.contributes_to_ttfd");
        return o1VarI;
    }
}
