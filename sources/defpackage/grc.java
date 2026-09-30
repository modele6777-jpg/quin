package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class grc {
    public static final grc a;
    public static final grc b;
    public static final grc c;
    public static final /* synthetic */ grc[] d;

    static {
        grc grcVar = new grc("IDLE", 0);
        a = grcVar;
        grc grcVar2 = new grc("LOADING", 1);
        b = grcVar2;
        grc grcVar3 = new grc("FAILED", 2);
        c = grcVar3;
        d = new grc[]{grcVar, grcVar2, grcVar3};
    }

    public static grc valueOf(String str) {
        return (grc) Enum.valueOf(grc.class, str);
    }

    public static grc[] values() {
        return (grc[]) d.clone();
    }
}
