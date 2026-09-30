package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class io7 {
    public static final io7 a;
    public static final io7 b;
    public static final io7 c;
    public static final /* synthetic */ io7[] d;

    static {
        io7 io7Var = new io7("INVARIANT", 0);
        a = io7Var;
        io7 io7Var2 = new io7("IN", 1);
        b = io7Var2;
        io7 io7Var3 = new io7("OUT", 2);
        c = io7Var3;
        d = new io7[]{io7Var, io7Var2, io7Var3};
    }

    public static io7 valueOf(String str) {
        return (io7) Enum.valueOf(io7.class, str);
    }

    public static io7[] values() {
        return (io7[]) d.clone();
    }
}
