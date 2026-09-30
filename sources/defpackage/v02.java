package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v02 {
    public static final v02 a;
    public static final v02 b;
    public static final /* synthetic */ v02[] c;

    static {
        v02 v02Var = new v02("Standard", 0);
        a = v02Var;
        v02 v02Var2 = new v02("RightEdgeTopAnchored", 1);
        b = v02Var2;
        c = new v02[]{v02Var, v02Var2};
    }

    public static v02 valueOf(String str) {
        return (v02) Enum.valueOf(v02.class, str);
    }

    public static v02[] values() {
        return (v02[]) c.clone();
    }
}
