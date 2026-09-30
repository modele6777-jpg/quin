package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cx6 {
    public static final cx6 a;
    public static final /* synthetic */ cx6[] b;

    static {
        cx6 cx6Var = new cx6("ENCODE_FAILED", 0);
        a = cx6Var;
        b = new cx6[]{cx6Var, new cx6("DECODE_FAILED", 1), new cx6("UNKNOWN", 2)};
    }

    public static cx6 valueOf(String str) {
        return (cx6) Enum.valueOf(cx6.class, str);
    }

    public static cx6[] values() {
        return (cx6[]) b.clone();
    }
}
