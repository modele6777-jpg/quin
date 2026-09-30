package io.sentry.featureflags;

import defpackage.kv2;
import io.sentry.protocol.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements b {
    public volatile CopyOnWriteArrayList a;
    public final io.sentry.util.a b;

    public a(a aVar) {
        this.b = new io.sentry.util.a();
        this.a = new CopyOnWriteArrayList(aVar.a);
    }

    @Override // io.sentry.featureflags.b
    public final void clear() {
        io.sentry.util.a aVar = this.b;
        aVar.b();
        try {
            this.a.clear();
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // io.sentry.featureflags.b
    public final b clone() {
        return new a(this);
    }

    @Override // io.sentry.featureflags.b
    public final j j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        if (it.hasNext()) {
            throw kv2.g(it);
        }
        return new j(arrayList);
    }

    /* JADX INFO: renamed from: clone, reason: collision with other method in class */
    public final Object m22clone() {
        return new a(this);
    }

    public a(int i, CopyOnWriteArrayList copyOnWriteArrayList) {
        this.b = new io.sentry.util.a();
        this.a = copyOnWriteArrayList;
    }

    public a(int i) {
        this.b = new io.sentry.util.a();
        this.a = new CopyOnWriteArrayList();
    }
}
