package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class if8 {
    public static final if8 a;
    public static final if8 b;
    public static final if8 c;
    public static final /* synthetic */ if8[] d;

    static {
        if8 if8Var = new if8("Google", 0);
        a = if8Var;
        if8 if8Var2 = new if8("WeChat", 1);
        b = if8Var2;
        if8 if8Var3 = new if8("OneLogin", 2);
        c = if8Var3;
        d = new if8[]{if8Var, if8Var2, if8Var3};
    }

    public static if8 valueOf(String str) {
        return (if8) Enum.valueOf(if8.class, str);
    }

    public static if8[] values() {
        return (if8[]) d.clone();
    }
}
