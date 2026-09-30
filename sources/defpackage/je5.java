package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class je5 {
    public static final je5 a;
    public static final /* synthetic */ je5[] b;

    static {
        je5 je5Var = new je5("TOP_DOWN", 0);
        a = je5Var;
        b = new je5[]{je5Var, new je5("BOTTOM_UP", 1)};
    }

    public static je5 valueOf(String str) {
        return (je5) Enum.valueOf(je5.class, str);
    }

    public static je5[] values() {
        return (je5[]) b.clone();
    }
}
