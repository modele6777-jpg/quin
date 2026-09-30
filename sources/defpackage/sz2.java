package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sz2 {
    public static final sz2 a;
    public static final sz2 b;
    public static final sz2 c;
    public static final sz2 d;
    public static final sz2 e;
    public static final /* synthetic */ sz2[] f;

    static {
        sz2 sz2Var = new sz2("NONE", 0);
        a = sz2Var;
        sz2 sz2Var2 = new sz2("SAMPLING", 1);
        b = sz2Var2;
        sz2 sz2Var3 = new sz2("RESIZE_INSIDE", 2);
        c = sz2Var3;
        sz2 sz2Var4 = new sz2("RESIZE_FIT", 3);
        d = sz2Var4;
        sz2 sz2Var5 = new sz2("RESIZE_EXACT", 4);
        e = sz2Var5;
        f = new sz2[]{sz2Var, sz2Var2, sz2Var3, sz2Var4, sz2Var5};
    }

    public static sz2 valueOf(String str) {
        return (sz2) Enum.valueOf(sz2.class, str);
    }

    public static sz2[] values() {
        return (sz2[]) f.clone();
    }
}
