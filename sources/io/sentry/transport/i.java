package io.sentry.transport;

import io.sentry.l0;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i implements io.sentry.cache.d {
    public static final i a = new i();

    @Override // io.sentry.cache.d
    public final boolean N(io.sentry.internal.debugmeta.c cVar, l0 l0Var) {
        return false;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return Collections.emptyIterator();
    }

    @Override // io.sentry.cache.d
    public final void F0(io.sentry.internal.debugmeta.c cVar) {
    }
}
