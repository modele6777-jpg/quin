package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bv4 {
    public static final bv4 a;
    public static final bv4 b;
    public static final bv4 c;
    public static final bv4 d;
    public static final bv4 e;
    public static final bv4 f;
    public static final bv4 g;
    public static final /* synthetic */ bv4[] v;

    static {
        bv4 bv4Var = new bv4("ERROR_CORRECTION", 0);
        a = bv4Var;
        bv4 bv4Var2 = new bv4("CHARACTER_SET", 1);
        b = bv4Var2;
        bv4 bv4Var3 = new bv4("DATA_MATRIX_SHAPE", 2);
        bv4 bv4Var4 = new bv4("DATA_MATRIX_COMPACT", 3);
        bv4 bv4Var5 = new bv4("MIN_SIZE", 4);
        bv4 bv4Var6 = new bv4("MAX_SIZE", 5);
        bv4 bv4Var7 = new bv4("MARGIN", 6);
        c = bv4Var7;
        bv4 bv4Var8 = new bv4("PDF417_COMPACT", 7);
        bv4 bv4Var9 = new bv4("PDF417_COMPACTION", 8);
        bv4 bv4Var10 = new bv4("PDF417_DIMENSIONS", 9);
        bv4 bv4Var11 = new bv4("PDF417_AUTO_ECI", 10);
        bv4 bv4Var12 = new bv4("AZTEC_LAYERS", 11);
        bv4 bv4Var13 = new bv4("QR_VERSION", 12);
        d = bv4Var13;
        bv4 bv4Var14 = new bv4("QR_MASK_PATTERN", 13);
        e = bv4Var14;
        bv4 bv4Var15 = new bv4("QR_COMPACT", 14);
        f = bv4Var15;
        bv4 bv4Var16 = new bv4("GS1_FORMAT", 15);
        g = bv4Var16;
        v = new bv4[]{bv4Var, bv4Var2, bv4Var3, bv4Var4, bv4Var5, bv4Var6, bv4Var7, bv4Var8, bv4Var9, bv4Var10, bv4Var11, bv4Var12, bv4Var13, bv4Var14, bv4Var15, bv4Var16, new bv4("FORCE_CODE_SET", 16), new bv4("FORCE_C40", 17), new bv4("CODE128_COMPACT", 18)};
    }

    public static bv4 valueOf(String str) {
        return (bv4) Enum.valueOf(bv4.class, str);
    }

    public static bv4[] values() {
        return (bv4[]) v.clone();
    }
}
