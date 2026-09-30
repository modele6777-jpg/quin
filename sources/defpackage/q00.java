package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q00 {
    public static final q00 a;
    public static final q00 b;
    public static final /* synthetic */ q00[] c;

    static {
        q00 q00Var = new q00("JAVA", 0);
        a = q00Var;
        q00 q00Var2 = new q00("KOTLIN", 1);
        b = q00Var2;
        c = new q00[]{q00Var, q00Var2};
    }

    public static q00 valueOf(String str) {
        return (q00) Enum.valueOf(q00.class, str);
    }

    public static q00[] values() {
        return (q00[]) c.clone();
    }
}
