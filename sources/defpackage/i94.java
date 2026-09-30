package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class i94 {
    public static final i94 a;
    public static final i94 b;
    public static final i94 c;
    public static final /* synthetic */ i94[] d;

    static {
        i94 i94Var = new i94("BEFORE", 0);
        a = i94Var;
        i94 i94Var2 = new i94("ON", 1);
        b = i94Var2;
        i94 i94Var3 = new i94("AFTER", 2);
        c = i94Var3;
        d = new i94[]{i94Var, i94Var2, i94Var3};
    }

    public static i94 valueOf(String str) {
        return (i94) Enum.valueOf(i94.class, str);
    }

    public static i94[] values() {
        return (i94[]) d.clone();
    }
}
