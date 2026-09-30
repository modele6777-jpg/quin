package com.google.android.play.core.assetpacks;

import defpackage.bfg;
import defpackage.bhg;
import defpackage.h72;
import defpackage.lhg;
import defpackage.rch;
import defpackage.rgg;
import defpackage.sgg;
import defpackage.vfg;
import defpackage.ygg;
import defpackage.zgg;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h {
    public static final rch k = new rch("ExtractorLooper");
    public final k a;
    public final f b;
    public final s c;
    public final m d;
    public final n e;
    public final o f;
    public final p g;
    public final l h;
    public final AtomicBoolean i = new AtomicBoolean(false);
    public final bfg j;

    public h(k kVar, bfg bfgVar, f fVar, s sVar, m mVar, n nVar, o oVar, p pVar, l lVar) {
        this.a = kVar;
        this.j = bfgVar;
        this.b = fVar;
        this.c = sVar;
        this.d = mVar;
        this.e = nVar;
        this.f = oVar;
        this.g = pVar;
        this.h = lVar;
    }

    public final void a() {
        h72 h72VarA;
        bfg bfgVar = this.j;
        rch rchVar = k;
        rchVar.a("Run extractor loop", new Object[0]);
        AtomicBoolean atomicBoolean = this.i;
        if (!atomicBoolean.compareAndSet(false, true)) {
            rchVar.f("runLoop already looping; return", new Object[0]);
            return;
        }
        while (true) {
            try {
                h72VarA = this.h.a();
            } catch (g e) {
                rchVar.b("Error while getting next extraction task: %s", e.getMessage());
                if (e.a >= 0) {
                    ((lhg) bfgVar.a()).b(e.a);
                    b(e.a, e);
                }
                h72VarA = null;
            }
            if (h72VarA == null) {
                atomicBoolean.set(false);
                return;
            }
            try {
                if (h72VarA instanceof vfg) {
                    this.b.a((vfg) h72VarA);
                } else if (h72VarA instanceof bhg) {
                    this.c.a((bhg) h72VarA);
                } else if (h72VarA instanceof rgg) {
                    this.d.a((rgg) h72VarA);
                } else if (h72VarA instanceof sgg) {
                    this.e.a((sgg) h72VarA);
                } else if (h72VarA instanceof ygg) {
                    this.f.a((ygg) h72VarA);
                } else if (h72VarA instanceof zgg) {
                    this.g.a((zgg) h72VarA);
                } else {
                    rchVar.b("Unknown task type: %s", h72VarA.getClass().getName());
                }
            } catch (Exception e2) {
                rchVar.b("Error during extraction task: %s", e2.getMessage());
                ((lhg) bfgVar.a()).b(h72VarA.a);
                b(h72VarA.a, e2);
            }
        }
    }

    public final void b(int i, Exception exc) {
        k kVar = this.a;
        try {
            ReentrantLock reentrantLock = kVar.d;
            try {
                reentrantLock.lock();
                kVar.a(i).c.d = 5;
                reentrantLock.unlock();
                kVar.b(new i(kVar, i));
            } catch (Throwable th) {
                reentrantLock.unlock();
                throw th;
            }
        } catch (g unused) {
            k.b("Error during error handling: %s", exc.getMessage());
        }
    }
}
