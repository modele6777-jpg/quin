package io.sentry.android.sqlite;

import defpackage.ace;
import defpackage.f9e;
import defpackage.h9e;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l implements h9e {
    public final h9e a;
    public final io.sentry.n b;
    public final ace c = new ace(new k(this));
    public final ace d = new ace(new j(this));

    public l(h9e h9eVar) {
        this.a = h9eVar;
        this.b = new io.sentry.n(h9eVar.getDatabaseName());
    }

    public static final l b(h9e h9eVar) {
        return h9eVar instanceof l ? (l) h9eVar : new l(h9eVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.close();
    }

    @Override // defpackage.h9e
    public final f9e d0() {
        return (f9e) this.d.getValue();
    }

    @Override // defpackage.h9e
    public final String getDatabaseName() {
        return this.a.getDatabaseName();
    }

    @Override // defpackage.h9e
    public final f9e j0() {
        return (f9e) this.c.getValue();
    }

    @Override // defpackage.h9e
    public final void setWriteAheadLoggingEnabled(boolean z) {
        this.a.setWriteAheadLoggingEnabled(z);
    }
}
