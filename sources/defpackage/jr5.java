package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jr5 {
    public static final jr5 a;
    public static final jr5 b;
    public static final jr5 c;
    public static final /* synthetic */ jr5[] d;

    static {
        jr5 jr5Var = new jr5("Inactive", 0);
        a = jr5Var;
        jr5 jr5Var2 = new jr5("AwaitingDestination", 1);
        b = jr5Var2;
        jr5 jr5Var3 = new jr5("HomeConfirmed", 2);
        c = jr5Var3;
        d = new jr5[]{jr5Var, jr5Var2, jr5Var3};
    }

    public static jr5 valueOf(String str) {
        return (jr5) Enum.valueOf(jr5.class, str);
    }

    public static jr5[] values() {
        return (jr5[]) d.clone();
    }
}
