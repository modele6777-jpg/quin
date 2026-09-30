package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j71 {
    public static final j71 a;
    public static final j71 b;
    public static final /* synthetic */ j71[] c;

    static {
        j71 j71Var = new j71("all", 0);
        a = j71Var;
        j71 j71Var2 = new j71("aural", 1);
        j71 j71Var3 = new j71("braille", 2);
        j71 j71Var4 = new j71("embossed", 3);
        j71 j71Var5 = new j71("handheld", 4);
        j71 j71Var6 = new j71("print", 5);
        j71 j71Var7 = new j71("projection", 6);
        j71 j71Var8 = new j71("screen", 7);
        b = j71Var8;
        c = new j71[]{j71Var, j71Var2, j71Var3, j71Var4, j71Var5, j71Var6, j71Var7, j71Var8, new j71("speech", 8), new j71("tty", 9), new j71("tv", 10)};
    }

    public static j71 valueOf(String str) {
        return (j71) Enum.valueOf(j71.class, str);
    }

    public static j71[] values() {
        return (j71[]) c.clone();
    }
}
