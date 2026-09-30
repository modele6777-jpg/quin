package defpackage;

import io.sentry.q6;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class v2e {
    public static final s2e a;
    public static final t2e b;
    public static final u2e c;
    public static final /* synthetic */ v2e[] d;
    long numBytes;

    /* JADX INFO: Fake field, exist only in values array */
    v2e EF0;

    static {
        q2e q2eVar = new q2e(0, 1099511627776L, "TERABYTES");
        r2e r2eVar = new r2e(1, 1073741824L, "GIGABYTES");
        s2e s2eVar = new s2e(2, q6.MAX_EVENT_SIZE_BYTES, "MEGABYTES");
        a = s2eVar;
        t2e t2eVar = new t2e(3, 1024L, "KILOBYTES");
        b = t2eVar;
        u2e u2eVar = new u2e(4, 1L, "BYTES");
        c = u2eVar;
        d = new v2e[]{q2eVar, r2eVar, s2eVar, t2eVar, u2eVar};
    }

    public v2e(int i, long j, String str) {
        super(str, i);
        this.numBytes = j;
    }

    public static v2e valueOf(String str) {
        return (v2e) Enum.valueOf(v2e.class, str);
    }

    public static v2e[] values() {
        return (v2e[]) d.clone();
    }

    public final long a(long j) {
        return (j * this.numBytes) / b.numBytes;
    }
}
