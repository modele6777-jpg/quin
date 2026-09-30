package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w2g {
    public static final w2g a;
    public static final w2g b;
    public static final w2g c;
    public static final /* synthetic */ w2g[] d;

    static {
        w2g w2gVar = new w2g("InDate", 0);
        a = w2gVar;
        w2g w2gVar2 = new w2g("RangeDate", 1);
        b = w2gVar2;
        w2g w2gVar3 = new w2g("OutDate", 2);
        c = w2gVar3;
        d = new w2g[]{w2gVar, w2gVar2, w2gVar3};
    }

    public static w2g valueOf(String str) {
        return (w2g) Enum.valueOf(w2g.class, str);
    }

    public static w2g[] values() {
        return (w2g[]) d.clone();
    }
}
