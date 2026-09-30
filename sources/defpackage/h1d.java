package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h1d {
    public static final h1d a;
    public static final h1d b;
    public static final /* synthetic */ h1d[] c;

    static {
        h1d h1dVar = new h1d("CRASHLYTICS", 0);
        a = h1dVar;
        h1d h1dVar2 = new h1d("PERFORMANCE", 1);
        b = h1dVar2;
        c = new h1d[]{h1dVar, h1dVar2, new h1d("MATT_SAYS_HI", 2)};
    }

    public static h1d valueOf(String str) {
        return (h1d) Enum.valueOf(h1d.class, str);
    }

    public static h1d[] values() {
        return (h1d[]) c.clone();
    }
}
