package defpackage;

import android.media.metrics.LogSessionId;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uha {
    public static final uha c;
    public final String a;
    public final qm2 b;

    static {
        new uha("");
        c = new uha("preload");
    }

    public uha(String str) {
        this.a = str;
        this.b = Build.VERSION.SDK_INT >= 31 ? new qm2(2) : null;
    }

    public final synchronized LogSessionId a() {
        qm2 qm2Var;
        qm2Var = this.b;
        qm2Var.getClass();
        return (LogSessionId) qm2Var.b;
    }
}
