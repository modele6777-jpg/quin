package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class uw9 {
    public static final uw9 a;
    public static final uw9 b;
    public static final uw9 c;
    public static final /* synthetic */ uw9[] d;

    static {
        uw9 uw9Var = new uw9("NONE", 0);
        a = uw9Var;
        uw9 uw9Var2 = new uw9("ZERO", 1);
        b = uw9Var2;
        uw9 uw9Var3 = new uw9("SPACE", 2);
        c = uw9Var3;
        d = new uw9[]{uw9Var, uw9Var2, uw9Var3};
    }

    public static uw9 valueOf(String str) {
        return (uw9) Enum.valueOf(uw9.class, str);
    }

    public static uw9[] values() {
        return (uw9[]) d.clone();
    }
}
