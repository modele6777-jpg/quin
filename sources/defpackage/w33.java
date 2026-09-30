package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w33 {
    public static final w33 a;
    public static final w33 b;
    public static final w33 c;
    public static final /* synthetic */ w33[] d;

    static {
        w33 w33Var = new w33("Cta", 0);
        a = w33Var;
        w33 w33Var2 = new w33("Close", 1);
        b = w33Var2;
        w33 w33Var3 = new w33("SystemBack", 2);
        c = w33Var3;
        d = new w33[]{w33Var, w33Var2, w33Var3};
    }

    public static w33 valueOf(String str) {
        return (w33) Enum.valueOf(w33.class, str);
    }

    public static w33[] values() {
        return (w33[]) d.clone();
    }
}
