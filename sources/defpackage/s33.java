package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s33 {
    public static final s33 a;
    public static final s33 b;
    public static final /* synthetic */ s33[] c;

    static {
        s33 s33Var = new s33("Confirm", 0);
        a = s33Var;
        s33 s33Var2 = new s33("Unlock", 1);
        b = s33Var2;
        c = new s33[]{s33Var, s33Var2};
    }

    public static s33 valueOf(String str) {
        return (s33) Enum.valueOf(s33.class, str);
    }

    public static s33[] values() {
        return (s33[]) c.clone();
    }
}
