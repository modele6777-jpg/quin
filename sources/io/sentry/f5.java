package io.sentry;

import java.io.File;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f5 implements Callable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ m1 b;
    public final /* synthetic */ r3 c;
    public final /* synthetic */ File d;
    public final /* synthetic */ Object e;

    public /* synthetic */ f5(m1 m1Var, r3 r3Var, AtomicReference atomicReference, File file) {
        this.b = m1Var;
        this.c = r3Var;
        this.e = atomicReference;
        this.d = file;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0058 */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object call() throws io.sentry.exception.c {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.f5.call():java.lang.Object");
    }

    public /* synthetic */ f5(File file, r3 r3Var, d1 d1Var, m1 m1Var) {
        this.d = file;
        this.c = r3Var;
        this.e = d1Var;
        this.b = m1Var;
    }
}
