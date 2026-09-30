package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w92 implements atb {
    public final LinkedHashMap a = new LinkedHashMap();
    public volatile Map b = qu4.a;

    @Override // defpackage.atb
    public final void E(qtb qtbVar) {
        qtbVar.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new s92((atb) entry.getKey(), qtbVar, 0));
        }
    }

    @Override // defpackage.atb
    public final void G(final qtb qtbVar, final long j, final long j2) {
        qtbVar.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            final atb atbVar = (atb) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: v92
                @Override // java.lang.Runnable
                public final void run() {
                    atbVar.G(qtbVar, j, j2);
                }
            });
        }
    }

    @Override // defpackage.atb
    public final void R(qtb qtbVar, long j, ds dsVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new r92((atb) entry.getKey(), qtbVar, j, dsVar, 1));
        }
    }

    @Override // defpackage.atb
    public final void U(qtb qtbVar) {
        qtbVar.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new s92((atb) entry.getKey(), qtbVar, 2));
        }
    }

    @Override // defpackage.atb
    public final void W(qtb qtbVar, long j, es esVar) {
        qtbVar.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new t92((atb) entry.getKey(), qtbVar, j, esVar, 1));
        }
    }

    public final void a(atb atbVar, vp vpVar) {
        vpVar.getClass();
        if (this.b.containsKey(atbVar)) {
            throw new IllegalStateException((atbVar + " was already registered!").toString());
        }
        synchronized (this.a) {
            this.a.put(atbVar, vpVar);
            this.b = bm8.X(this.a);
        }
    }

    public final void b(atb atbVar) {
        atbVar.getClass();
        synchronized (this.a) {
            this.a.remove(atbVar);
            this.b = bm8.X(this.a);
        }
    }

    @Override // defpackage.atb
    public final void g0(qtb qtbVar, long j, ptb ptbVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new t92((atb) entry.getKey(), qtbVar, j, ptbVar, 0));
        }
    }

    @Override // defpackage.atb
    public final void h(final qtb qtbVar, final long j, final int i, final int i2) {
        for (Map.Entry entry : this.b.entrySet()) {
            final atb atbVar = (atb) entry.getKey();
            ((Executor) entry.getValue()).execute(new Runnable() { // from class: u92
                @Override // java.lang.Runnable
                public final void run() {
                    atbVar.h(qtbVar, j, i, i2);
                }
            });
        }
    }

    @Override // defpackage.atb
    public final void h0(qtb qtbVar, long j, ds dsVar) {
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new r92((atb) entry.getKey(), qtbVar, j, dsVar, 0));
        }
    }

    @Override // defpackage.atb
    public final void k0(ctb ctbVar) {
        ctbVar.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new fe(22, (atb) entry.getKey(), ctbVar));
        }
    }

    @Override // defpackage.atb
    public final void u(qtb qtbVar) {
        qtbVar.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new s92((atb) entry.getKey(), qtbVar, 1));
        }
    }

    @Override // defpackage.atb
    public final void x(qtb qtbVar, long j) {
        qtbVar.getClass();
        for (Map.Entry entry : this.b.entrySet()) {
            ((Executor) entry.getValue()).execute(new ae1((atb) entry.getKey(), qtbVar, j, 1));
        }
    }
}
