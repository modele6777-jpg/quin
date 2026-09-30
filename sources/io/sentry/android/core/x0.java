package io.sentry.android.core;

import android.os.FileObserver;
import defpackage.ks0;
import io.sentry.n3;
import io.sentry.q5;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x0 extends FileObserver {
    public final String a;
    public final n3 b;
    public final io.sentry.z0 c;
    public final long d;

    public x0(String str, n3 n3Var, io.sentry.z0 z0Var, long j) {
        super(str);
        this.a = str;
        this.b = n3Var;
        io.sentry.util.b.r(z0Var, "Logger is required.");
        this.c = z0Var;
        this.d = j;
    }

    @Override // android.os.FileObserver
    public final void onEvent(int i, String str) {
        if (str == null || i != 8) {
            return;
        }
        q5 q5Var = q5.DEBUG;
        Integer numValueOf = Integer.valueOf(i);
        String str2 = this.a;
        io.sentry.z0 z0Var = this.c;
        z0Var.i(q5Var, "onEvent fired for EnvelopeFileObserver with event type %d on path: %s for file %s.", numValueOf, str2, str);
        io.sentry.l0 l0VarF = io.sentry.util.b.f(new w0(this.d, z0Var));
        this.b.b(new File(ks0.l(new StringBuilder(str2), File.separator, str)), l0VarF);
    }
}
