package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v06 {
    public static final v06 a;
    public static final v06 b;
    public static final v06 c;
    public static final v06 d;
    public static final /* synthetic */ v06[] e;

    static {
        v06 v06Var = new v06("Closed", 0);
        a = v06Var;
        v06 v06Var2 = new v06("Active", 1);
        b = v06Var2;
        v06 v06Var3 = new v06("Handled", 2);
        c = v06Var3;
        v06 v06Var4 = new v06("Cancelled", 3);
        d = v06Var4;
        e = new v06[]{v06Var, v06Var2, v06Var3, v06Var4};
    }

    public static v06 valueOf(String str) {
        return (v06) Enum.valueOf(v06.class, str);
    }

    public static v06[] values() {
        return (v06[]) e.clone();
    }
}
