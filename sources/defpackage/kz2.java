package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kz2 {
    public static final kz2 a;
    public static final kz2 b;
    public static final /* synthetic */ kz2[] c;
    public static final /* synthetic */ mx4 d;

    static {
        kz2 kz2Var = new kz2("RECTANGLE", 0);
        a = kz2Var;
        kz2 kz2Var2 = new kz2("OVAL", 1);
        b = kz2Var2;
        kz2[] kz2VarArr = {kz2Var, kz2Var2};
        c = kz2VarArr;
        d = new mx4(kz2VarArr);
    }

    public static kz2 valueOf(String str) {
        return (kz2) Enum.valueOf(kz2.class, str);
    }

    public static kz2[] values() {
        return (kz2[]) c.clone();
    }
}
