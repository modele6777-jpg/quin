package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cv7 {
    public static final cv7 a;
    public static final cv7 b;
    public static final /* synthetic */ cv7[] c;

    static {
        cv7 cv7Var = new cv7("Ltr", 0);
        a = cv7Var;
        cv7 cv7Var2 = new cv7("Rtl", 1);
        b = cv7Var2;
        c = new cv7[]{cv7Var, cv7Var2};
    }

    public static cv7 valueOf(String str) {
        return (cv7) Enum.valueOf(cv7.class, str);
    }

    public static cv7[] values() {
        return (cv7[]) c.clone();
    }
}
