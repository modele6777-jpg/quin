package io.sentry.android.replay.capture;

import io.sentry.a4;
import io.sentry.g1;
import io.sentry.l0;
import io.sentry.s6;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s extends u {
    public final s6 a;
    public final a4 b;

    public s(s6 s6Var, a4 a4Var) {
        this.a = s6Var;
        this.b = a4Var;
    }

    public static void a(s sVar, g1 g1Var) {
        l0 l0Var = new l0();
        if (g1Var != null) {
            s6 s6Var = sVar.a;
            l0Var.h = sVar.b;
            g1Var.u(s6Var, l0Var);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.a.equals(sVar.a) && this.b.equals(sVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Created(replay=" + this.a + ", recording=" + this.b + ')';
    }
}
