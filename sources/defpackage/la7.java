package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class la7 {
    public static final la7 a;
    public static final la7 b;
    public static final /* synthetic */ la7[] c;

    static {
        la7 la7Var = new la7("Width", 0);
        a = la7Var;
        la7 la7Var2 = new la7("Height", 1);
        b = la7Var2;
        c = new la7[]{la7Var, la7Var2};
    }

    public static la7 valueOf(String str) {
        return (la7) Enum.valueOf(la7.class, str);
    }

    public static la7[] values() {
        return (la7[]) c.clone();
    }
}
