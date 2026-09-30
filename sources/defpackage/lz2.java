package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lz2 {
    public static final lz2 a;
    public static final /* synthetic */ lz2[] b;
    public static final /* synthetic */ mx4 c;

    static {
        lz2 lz2Var = new lz2("RECTANGLE", 0);
        a = lz2Var;
        lz2[] lz2VarArr = {lz2Var, new lz2("OVAL", 1), new lz2("RECTANGLE_VERTICAL_ONLY", 2), new lz2("RECTANGLE_HORIZONTAL_ONLY", 3)};
        b = lz2VarArr;
        c = new mx4(lz2VarArr);
    }

    public static lz2 valueOf(String str) {
        return (lz2) Enum.valueOf(lz2.class, str);
    }

    public static lz2[] values() {
        return (lz2[]) b.clone();
    }
}
