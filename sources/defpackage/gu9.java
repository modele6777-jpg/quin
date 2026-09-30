package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gu9 {
    public static final gu9 a;
    public static final gu9 b;
    public static final /* synthetic */ gu9[] c;

    static {
        gu9 gu9Var = new gu9("RENDER_OVERRIDE", 0);
        a = gu9Var;
        gu9 gu9Var2 = new gu9("RENDER_OPEN", 1);
        b = gu9Var2;
        c = new gu9[]{gu9Var, gu9Var2, new gu9("RENDER_OPEN_OVERRIDE", 2)};
    }

    public static gu9 valueOf(String str) {
        return (gu9) Enum.valueOf(gu9.class, str);
    }

    public static gu9[] values() {
        return (gu9[]) c.clone();
    }
}
