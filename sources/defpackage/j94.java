package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j94 {
    public static final j94 a;
    public static final j94 b;
    public static final j94 c;
    public static final /* synthetic */ j94[] d;

    static {
        j94 j94Var = new j94("Vertical", 0);
        a = j94Var;
        j94 j94Var2 = new j94("Horizontal", 1);
        b = j94Var2;
        j94 j94Var3 = new j94("Both", 2);
        c = j94Var3;
        d = new j94[]{j94Var, j94Var2, j94Var3};
    }

    public static j94 valueOf(String str) {
        return (j94) Enum.valueOf(j94.class, str);
    }

    public static j94[] values() {
        return (j94[]) d.clone();
    }
}
