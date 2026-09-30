package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y23 {
    public static final y23 a;
    public static final y23 b;
    public static final y23 c;
    public static final /* synthetic */ y23[] d;

    static {
        y23 y23Var = new y23("Detail", 0);
        a = y23Var;
        y23 y23Var2 = new y23("LongShare", 1);
        b = y23Var2;
        y23 y23Var3 = new y23("ShortShare", 2);
        c = y23Var3;
        d = new y23[]{y23Var, y23Var2, y23Var3};
    }

    public static y23 valueOf(String str) {
        return (y23) Enum.valueOf(y23.class, str);
    }

    public static y23[] values() {
        return (y23[]) d.clone();
    }
}
