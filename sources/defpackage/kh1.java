package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kh1 {
    public static final kh1 a;
    public static final kh1 b;
    public static final kh1 c;
    public static final /* synthetic */ kh1[] d;

    static {
        kh1 kh1Var = new kh1("CAMERA", 0);
        a = kh1Var;
        kh1 kh1Var2 = new kh1("SCOPE", 1);
        b = kh1Var2;
        kh1 kh1Var3 = new kh1("THREAD", 2);
        c = kh1Var3;
        d = new kh1[]{kh1Var, kh1Var2, kh1Var3};
    }

    public static kh1 valueOf(String str) {
        return (kh1) Enum.valueOf(kh1.class, str);
    }

    public static kh1[] values() {
        return (kh1[]) d.clone();
    }
}
