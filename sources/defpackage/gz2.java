package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gz2 {
    public static final gz2 a;
    public static final gz2 b;
    public static final /* synthetic */ gz2[] c;

    static {
        gz2 gz2Var = new gz2("CAMERA", 0);
        a = gz2Var;
        gz2 gz2Var2 = new gz2("GALLERY", 1);
        b = gz2Var2;
        c = new gz2[]{gz2Var, gz2Var2};
    }

    public static gz2 valueOf(String str) {
        return (gz2) Enum.valueOf(gz2.class, str);
    }

    public static gz2[] values() {
        return (gz2[]) c.clone();
    }
}
