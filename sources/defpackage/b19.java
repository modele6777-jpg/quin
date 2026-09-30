package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b19 {
    public static final /* synthetic */ b19[] a;
    public static final /* synthetic */ mx4 b;

    /* JADX INFO: Fake field, exist only in values array */
    b19 EF5;

    static {
        b19[] b19VarArr = {new b19("JANUARY", 0), new b19("FEBRUARY", 1), new b19("MARCH", 2), new b19("APRIL", 3), new b19("MAY", 4), new b19("JUNE", 5), new b19("JULY", 6), new b19("AUGUST", 7), new b19("SEPTEMBER", 8), new b19("OCTOBER", 9), new b19("NOVEMBER", 10), new b19("DECEMBER", 11)};
        a = b19VarArr;
        b = new mx4(b19VarArr);
    }

    public static b19 valueOf(String str) {
        return (b19) Enum.valueOf(b19.class, str);
    }

    public static b19[] values() {
        return (b19[]) a.clone();
    }
}
