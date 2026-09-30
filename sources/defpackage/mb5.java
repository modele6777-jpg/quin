package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mb5 {
    public static final mb5 a;
    public static final mb5 b;
    public static final mb5 c;
    public static final mb5 d;
    public static final /* synthetic */ mb5[] e;
    public static final /* synthetic */ mx4 f;

    static {
        mb5 mb5Var = new mb5("DYNAMIC_RANGE", 0);
        a = mb5Var;
        mb5 mb5Var2 = new mb5("FPS_RANGE", 1);
        b = mb5Var2;
        mb5 mb5Var3 = new mb5("VIDEO_STABILIZATION", 2);
        c = mb5Var3;
        mb5 mb5Var4 = new mb5("IMAGE_FORMAT", 3);
        d = mb5Var4;
        mb5[] mb5VarArr = {mb5Var, mb5Var2, mb5Var3, mb5Var4, new mb5("RECORDING_QUALITY", 4)};
        e = mb5VarArr;
        f = new mx4(mb5VarArr);
    }

    public static mb5 valueOf(String str) {
        return (mb5) Enum.valueOf(mb5.class, str);
    }

    public static mb5[] values() {
        return (mb5[]) e.clone();
    }
}
