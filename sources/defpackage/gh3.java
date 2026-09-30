package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gh3 {
    public static final /* synthetic */ gh3[] a;
    public static final /* synthetic */ mx4 b;

    /* JADX INFO: Fake field, exist only in values array */
    gh3 EF5;

    static {
        gh3[] gh3VarArr = {new gh3("MONDAY", 0), new gh3("TUESDAY", 1), new gh3("WEDNESDAY", 2), new gh3("THURSDAY", 3), new gh3("FRIDAY", 4), new gh3("SATURDAY", 5), new gh3("SUNDAY", 6)};
        a = gh3VarArr;
        b = new mx4(gh3VarArr);
    }

    public static gh3 valueOf(String str) {
        return (gh3) Enum.valueOf(gh3.class, str);
    }

    public static gh3[] values() {
        return (gh3[]) a.clone();
    }
}
