package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jo7 {
    public static final jo7 a;
    public static final jo7 b;
    public static final jo7 c;
    public static final jo7 d;
    public static final /* synthetic */ jo7[] e;

    static {
        jo7 jo7Var = new jo7("PUBLIC", 0);
        a = jo7Var;
        jo7 jo7Var2 = new jo7("PROTECTED", 1);
        b = jo7Var2;
        jo7 jo7Var3 = new jo7("INTERNAL", 2);
        c = jo7Var3;
        jo7 jo7Var4 = new jo7("PRIVATE", 3);
        d = jo7Var4;
        e = new jo7[]{jo7Var, jo7Var2, jo7Var3, jo7Var4};
    }

    public static jo7 valueOf(String str) {
        return (jo7) Enum.valueOf(jo7.class, str);
    }

    public static jo7[] values() {
        return (jo7[]) e.clone();
    }
}
