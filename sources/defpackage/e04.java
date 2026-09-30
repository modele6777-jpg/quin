package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e04 {
    public static final e04 a;
    public static final e04 b;
    public static final /* synthetic */ e04[] c;

    static {
        e04 e04Var = new e04("STABLE", 0);
        a = e04Var;
        e04 e04Var2 = new e04("UNSTABLE", 1);
        b = e04Var2;
        c = new e04[]{e04Var, e04Var2};
    }

    public static e04 valueOf(String str) {
        return (e04) Enum.valueOf(e04.class, str);
    }

    public static e04[] values() {
        return (e04[]) c.clone();
    }
}
