package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kz9 {
    public static final kz9 a;
    public static final kz9 b;
    public static final kz9 c;
    public static final /* synthetic */ kz9[] d;

    static {
        kz9 kz9Var = new kz9("ALL", 0);
        a = kz9Var;
        kz9 kz9Var2 = new kz9("ONLY_NON_SYNTHESIZED", 1);
        b = kz9Var2;
        kz9 kz9Var3 = new kz9("NONE", 2);
        c = kz9Var3;
        d = new kz9[]{kz9Var, kz9Var2, kz9Var3};
    }

    public static kz9 valueOf(String str) {
        return (kz9) Enum.valueOf(kz9.class, str);
    }

    public static kz9[] values() {
        return (kz9[]) d.clone();
    }
}
