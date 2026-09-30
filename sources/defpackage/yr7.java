package defpackage;

import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public enum yr7 {
    UNKNOWN(0),
    CLASS(1),
    FILE_FACADE(2),
    SYNTHETIC_CLASS(3),
    MULTIFILE_CLASS(4),
    MULTIFILE_CLASS_PART(5);

    public static final yx4 a = new yx4(11);
    public static final LinkedHashMap b;
    private final int id;

    static {
        yr7[] yr7VarArrValues = values();
        int iF = bm8.F(yr7VarArrValues.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF < 16 ? 16 : iF);
        for (yr7 yr7Var : yr7VarArrValues) {
            linkedHashMap.put(Integer.valueOf(yr7Var.id), yr7Var);
        }
        b = linkedHashMap;
    }

    yr7(int i) {
        this.id = i;
    }
}
