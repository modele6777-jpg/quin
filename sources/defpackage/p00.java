package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class p00 {
    public static final p00 a;
    public static final p00 b;
    public static final /* synthetic */ p00[] c;

    static {
        p00 p00Var = new p00("CALL_BY_NAME", 0);
        a = p00Var;
        p00 p00Var2 = new p00("POSITIONAL_CALL", 1);
        b = p00Var2;
        c = new p00[]{p00Var, p00Var2};
    }

    public static p00 valueOf(String str) {
        return (p00) Enum.valueOf(p00.class, str);
    }

    public static p00[] values() {
        return (p00[]) c.clone();
    }
}
