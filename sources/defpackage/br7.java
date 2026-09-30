package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class br7 {
    public static final br7 a;
    public static final br7 b;
    public static final br7 c;
    public static final /* synthetic */ br7[] d;

    static {
        br7 br7Var = new br7("INVARIANT", 0);
        a = br7Var;
        br7 br7Var2 = new br7("IN", 1);
        b = br7Var2;
        br7 br7Var3 = new br7("OUT", 2);
        c = br7Var3;
        d = new br7[]{br7Var, br7Var2, br7Var3};
    }

    public static br7 valueOf(String str) {
        return (br7) Enum.valueOf(br7.class, str);
    }

    public static br7[] values() {
        return (br7[]) d.clone();
    }
}
