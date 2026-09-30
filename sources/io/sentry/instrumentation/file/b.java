package io.sentry.instrumentation.file;

import io.sentry.o1;
import io.sentry.q6;
import java.io.Closeable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final File a;
    public final o1 b;
    public final q6 c;
    public final Closeable d;

    public /* synthetic */ b(File file, o1 o1Var, Closeable closeable, q6 q6Var) {
        this.a = file;
        this.b = o1Var;
        this.d = closeable;
        this.c = q6Var;
    }
}
