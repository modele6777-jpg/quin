package io.sentry.protocol;

import defpackage.qc0;
import io.sentry.k2;
import io.sentry.m3;
import io.sentry.z0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w implements k2 {
    public static final w b = new w("00000000-0000-0000-0000-000000000000".replace("-", ""));
    public volatile String a;

    public w(String str) {
        String str2 = str.equals("0000-0000") ? "00000000-0000-0000-0000-000000000000" : str;
        if (str2.length() == 32 || str2.length() == 36) {
            this.a = str2.length() == 36 ? str2.replace("-", "") : str2;
        } else {
            qc0.j("String representation of SentryId has either 32 (UUID no dashes) or 36 characters long (completed UUID). Received: ".concat(str));
            throw null;
        }
    }

    public final String a() {
        String strJ;
        String str = this.a;
        if (str != null) {
            return str;
        }
        synchronized (this) {
            try {
                strJ = this.a;
                if (strJ == null) {
                    strJ = io.sentry.config.a.j();
                    this.a = strJ;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return strJ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w.class != obj.getClass()) {
            return false;
        }
        return a().equals(((w) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }

    @Override // io.sentry.k2
    public final void serialize(m3 m3Var, z0 z0Var) {
        ((io.sentry.internal.debugmeta.c) m3Var).z(a());
    }

    public final String toString() {
        return a();
    }
}
