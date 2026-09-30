package io.sentry;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g7 implements k2 {
    public static final g7 b = new g7("00000000-0000-0000-0000-000000000000".replace("-", "").substring(0, 16));
    public volatile String a;

    public g7(String str) {
        Objects.requireNonNull(str, "value is required");
        this.a = str;
    }

    public final String a() {
        String str;
        String str2 = this.a;
        if (str2 != null) {
            return str2;
        }
        synchronized (this) {
            try {
                str = this.a;
                if (str == null) {
                    byte[] bArr = new byte[8];
                    io.sentry.util.n.a().b(bArr);
                    byte b2 = (byte) (bArr[6] & 15);
                    bArr[6] = b2;
                    bArr[6] = (byte) (b2 | 64);
                    long j = 0;
                    for (int i = 0; i < 8; i++) {
                        j = (j << 8) | ((long) (bArr[i] & 255));
                    }
                    char[] cArr = new char[16];
                    io.sentry.util.q.a(cArr, j);
                    String str3 = new String(cArr);
                    this.a = str3;
                    str = str3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g7.class != obj.getClass()) {
            return false;
        }
        return a().equals(((g7) obj).a());
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
