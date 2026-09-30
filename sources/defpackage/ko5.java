package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ko5 implements jo5 {
    public static final ko5 a;
    public static final ko5 b;
    public static final ko5 c;
    public static final /* synthetic */ ko5[] d;

    static {
        ko5 ko5Var = new ko5("Active", 0);
        a = ko5Var;
        ko5 ko5Var2 = new ko5("ActiveParent", 1);
        b = ko5Var2;
        ko5 ko5Var3 = new ko5("Captured", 2);
        ko5 ko5Var4 = new ko5("Inactive", 3);
        c = ko5Var4;
        d = new ko5[]{ko5Var, ko5Var2, ko5Var3, ko5Var4};
    }

    public static ko5 valueOf(String str) {
        return (ko5) Enum.valueOf(ko5.class, str);
    }

    public static ko5[] values() {
        return (ko5[]) d.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        ap.c();
        return false;
    }

    public final boolean b() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                ap.c();
                return false;
            }
        }
        return true;
    }
}
