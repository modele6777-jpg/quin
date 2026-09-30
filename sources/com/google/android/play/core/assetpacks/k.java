package com.google.android.play.core.assetpacks;

import defpackage.bfg;
import defpackage.egg;
import defpackage.jgg;
import defpackage.lgg;
import defpackage.rch;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k {
    public static final rch f = new rch("ExtractorSessionStoreView");
    public final b a;
    public final egg b;
    public final HashMap c = new HashMap();
    public final ReentrantLock d = new ReentrantLock();
    public final bfg e;

    public k(b bVar, bfg bfgVar, egg eggVar) {
        this.a = bVar;
        this.e = bfgVar;
        this.b = eggVar;
    }

    public final jgg a(int i) {
        Integer numValueOf = Integer.valueOf(i);
        jgg jggVar = (jgg) this.c.get(numValueOf);
        if (jggVar != null) {
            return jggVar;
        }
        throw new g(String.format("Could not find session %d while trying to get it", numValueOf), i);
    }

    public final Object b(lgg lggVar) {
        ReentrantLock reentrantLock = this.d;
        try {
            reentrantLock.lock();
            return lggVar.a();
        } finally {
            reentrantLock.unlock();
        }
    }
}
