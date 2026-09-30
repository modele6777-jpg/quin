package io.sentry.transport;

import io.sentry.l0;
import java.io.Closeable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface g extends Closeable {
    void a(boolean z);

    void e(long j);

    io.sentry.android.core.internal.tombstone.b f();

    default boolean g() {
        return true;
    }

    void x0(io.sentry.internal.debugmeta.c cVar, l0 l0Var);
}
