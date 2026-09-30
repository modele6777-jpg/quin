package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f83 {
    public static final f83 a;
    public static final f83 b;
    public static final /* synthetic */ f83[] c;

    static {
        f83 f83Var = new f83("Intro", 0);
        a = f83Var;
        f83 f83Var2 = new f83("Success", 1);
        b = f83Var2;
        c = new f83[]{f83Var, f83Var2};
    }

    public static f83 valueOf(String str) {
        return (f83) Enum.valueOf(f83.class, str);
    }

    public static f83[] values() {
        return (f83[]) c.clone();
    }
}
