package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v33 {
    public static final v33 a;
    public static final v33 b;
    public static final v33 c;
    public static final /* synthetic */ v33[] d;

    static {
        v33 v33Var = new v33("Idle", 0);
        a = v33Var;
        v33 v33Var2 = new v33("Committing", 1);
        b = v33Var2;
        v33 v33Var3 = new v33("Finished", 2);
        c = v33Var3;
        d = new v33[]{v33Var, v33Var2, v33Var3};
    }

    public static v33 valueOf(String str) {
        return (v33) Enum.valueOf(v33.class, str);
    }

    public static v33[] values() {
        return (v33[]) d.clone();
    }
}
