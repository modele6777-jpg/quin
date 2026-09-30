package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class q40 {
    public static final q40 a;
    public static final q40 b;
    public static final q40 c;
    public static final /* synthetic */ q40[] d;

    static {
        q40 q40Var = new q40("Submitted", 0);
        a = q40Var;
        q40 q40Var2 = new q40("MissingUserInfo", 1);
        b = q40Var2;
        q40 q40Var3 = new q40("Failed", 2);
        c = q40Var3;
        d = new q40[]{q40Var, q40Var2, q40Var3};
    }

    public static q40 valueOf(String str) {
        return (q40) Enum.valueOf(q40.class, str);
    }

    public static q40[] values() {
        return (q40[]) d.clone();
    }
}
