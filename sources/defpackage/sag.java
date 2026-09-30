package defpackage;

import androidx.work.impl.WorkDatabase;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sag implements lr5 {
    public final bbg a;
    public final vva b;
    public final nbg c;

    static {
        ff8.n("WMFgUpdater");
    }

    public sag(WorkDatabase workDatabase, vva vvaVar, bbg bbgVar) {
        this.b = vvaVar;
        this.a = bbgVar;
        this.c = workDatabase.x();
    }
}
