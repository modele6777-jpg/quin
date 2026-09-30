package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sm1 {
    public static final sm1 a;
    public static final sm1 b;
    public static final sm1 c;
    public static final /* synthetic */ sm1[] d;

    static {
        sm1 sm1Var = new sm1("PRE_CAPTURE", 0);
        a = sm1Var;
        sm1 sm1Var2 = new sm1("MAIN_CAPTURE", 1);
        b = sm1Var2;
        sm1 sm1Var3 = new sm1("POST_CAPTURE", 2);
        c = sm1Var3;
        d = new sm1[]{sm1Var, sm1Var2, sm1Var3};
    }

    public static sm1 valueOf(String str) {
        return (sm1) Enum.valueOf(sm1.class, str);
    }

    public static sm1[] values() {
        return (sm1[]) d.clone();
    }
}
