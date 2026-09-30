package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t89 {
    public static final t89 a;
    public static final /* synthetic */ t89[] b;

    static {
        t89 t89Var = new t89("Default", 0);
        a = t89Var;
        b = new t89[]{t89Var, new t89("UserInput", 1), new t89("PreventUserInput", 2)};
    }

    public static t89 valueOf(String str) {
        return (t89) Enum.valueOf(t89.class, str);
    }

    public static t89[] values() {
        return (t89[]) b.clone();
    }
}
