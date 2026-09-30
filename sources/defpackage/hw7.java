package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hw7 {
    public static final hw7 a;
    public static final /* synthetic */ hw7[] b;

    static {
        hw7 hw7Var = new hw7("Horizontal", 0);
        a = hw7Var;
        b = new hw7[]{hw7Var, new hw7("Vertical", 1)};
    }

    public static hw7 valueOf(String str) {
        return (hw7) Enum.valueOf(hw7.class, str);
    }

    public static hw7[] values() {
        return (hw7[]) b.clone();
    }
}
