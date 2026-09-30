package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f48 {
    private static final /* synthetic */ lx4 $ENTRIES;
    private static final /* synthetic */ f48[] $VALUES;
    public static final d48 Companion;
    public static final f48 ON_ANY;
    public static final f48 ON_CREATE;
    public static final f48 ON_DESTROY;
    public static final f48 ON_PAUSE;
    public static final f48 ON_RESUME;
    public static final f48 ON_START;
    public static final f48 ON_STOP;

    static {
        f48 f48Var = new f48("ON_CREATE", 0);
        ON_CREATE = f48Var;
        f48 f48Var2 = new f48("ON_START", 1);
        ON_START = f48Var2;
        f48 f48Var3 = new f48("ON_RESUME", 2);
        ON_RESUME = f48Var3;
        f48 f48Var4 = new f48("ON_PAUSE", 3);
        ON_PAUSE = f48Var4;
        f48 f48Var5 = new f48("ON_STOP", 4);
        ON_STOP = f48Var5;
        f48 f48Var6 = new f48("ON_DESTROY", 5);
        ON_DESTROY = f48Var6;
        f48 f48Var7 = new f48("ON_ANY", 6);
        ON_ANY = f48Var7;
        f48[] f48VarArr = {f48Var, f48Var2, f48Var3, f48Var4, f48Var5, f48Var6, f48Var7};
        $VALUES = f48VarArr;
        $ENTRIES = new mx4(f48VarArr);
        Companion = new d48();
    }

    public static f48 valueOf(String str) {
        return (f48) Enum.valueOf(f48.class, str);
    }

    public static f48[] values() {
        return (f48[]) $VALUES.clone();
    }

    public final g48 a() {
        switch (e48.a[ordinal()]) {
            case 1:
            case 2:
                return g48.c;
            case 3:
            case 4:
                return g48.d;
            case 5:
                return g48.e;
            case 6:
                return g48.a;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                ap.c();
                return null;
        }
    }
}
