package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bxa {
    public static final bxa a;
    public static final /* synthetic */ bxa[] b;

    static {
        bxa bxaVar = new bxa("Circular", 0);
        a = bxaVar;
        b = new bxa[]{bxaVar, new bxa("Chatmind", 1)};
    }

    public static bxa valueOf(String str) {
        return (bxa) Enum.valueOf(bxa.class, str);
    }

    public static bxa[] values() {
        return (bxa[]) b.clone();
    }
}
