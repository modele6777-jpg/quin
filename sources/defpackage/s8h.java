package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum s8h {
    GOOGLE_ANALYTICS(0),
    GOOGLE_SIGNAL(1),
    SGTM(2),
    SGTM_CLIENT(3),
    GOOGLE_SIGNAL_PENDING(4),
    UNKNOWN(99);

    private final int zzg;

    s8h(int i) {
        this.zzg = i;
    }

    public static s8h b(int i) {
        for (s8h s8hVar : values()) {
            if (s8hVar.zzg == i) {
                return s8hVar;
            }
        }
        return UNKNOWN;
    }

    public final int a() {
        return this.zzg;
    }
}
