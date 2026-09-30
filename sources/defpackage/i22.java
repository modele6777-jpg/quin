package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i22 {
    public static final i22 a;
    public static final i22 b;
    public static final i22 c;
    public static final /* synthetic */ i22[] d;

    static {
        i22 i22Var = new i22("NONE", 0);
        a = i22Var;
        i22 i22Var2 = new i22("ALL_JSON_OBJECTS", 1);
        b = i22Var2;
        i22 i22Var3 = new i22("POLYMORPHIC", 2);
        c = i22Var3;
        d = new i22[]{i22Var, i22Var2, i22Var3};
    }

    public static i22 valueOf(String str) {
        return (i22) Enum.valueOf(i22.class, str);
    }

    public static i22[] values() {
        return (i22[]) d.clone();
    }
}
