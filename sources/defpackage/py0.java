package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class py0 {
    public static final py0 a;
    public static final py0 b;
    public static final py0 c;
    public static final /* synthetic */ py0[] d;

    static {
        py0 py0Var = new py0("Valid", 0);
        a = py0Var;
        py0 py0Var2 = new py0("Future", 1);
        b = py0Var2;
        py0 py0Var3 = new py0("Underage", 2);
        c = py0Var3;
        d = new py0[]{py0Var, py0Var2, py0Var3};
    }

    public static py0 valueOf(String str) {
        return (py0) Enum.valueOf(py0.class, str);
    }

    public static py0[] values() {
        return (py0[]) d.clone();
    }
}
