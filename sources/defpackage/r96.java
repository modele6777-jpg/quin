package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r96 {
    public static final r96 a;
    public static final r96 b;
    public static final r96 c;
    public static final /* synthetic */ r96[] d;

    static {
        r96 r96Var = new r96("None", 0);
        a = r96Var;
        r96 r96Var2 = new r96("Retryable", 1);
        b = r96Var2;
        r96 r96Var3 = new r96("Terminal", 2);
        c = r96Var3;
        d = new r96[]{r96Var, r96Var2, r96Var3};
    }

    public static r96 valueOf(String str) {
        return (r96) Enum.valueOf(r96.class, str);
    }

    public static r96[] values() {
        return (r96[]) d.clone();
    }
}
