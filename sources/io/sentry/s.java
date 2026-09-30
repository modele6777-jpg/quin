package io.sentry;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends TimerTask {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ u b;

    public s(u uVar, ArrayList arrayList) {
        this.b = uVar;
        this.a = arrayList;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.a.clear();
        o3 o3Var = new o3(this.b.g.getDateProvider().a().d());
        Iterator it = this.b.d.iterator();
        while (it.hasNext()) {
            ((c1) it.next()).a(o3Var);
        }
        for (t tVar : this.b.c.values()) {
            long j = o3Var.g;
            synchronized (tVar.a) {
                tVar.a.add(o3Var);
            }
            q1 q1Var = tVar.b;
            if (q1Var != null && j > tVar.c + 30000000000L) {
                this.a.add(q1Var);
            }
        }
        Iterator it2 = this.a.iterator();
        while (it2.hasNext()) {
            this.b.f((q1) it2.next());
        }
    }
}
