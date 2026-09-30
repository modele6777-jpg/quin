package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vk9 {
    public static final vk9 a;
    public static final vk9 b;
    public static final vk9 c;
    public static final /* synthetic */ vk9[] d;

    static {
        vk9 vk9Var = new vk9("NO_OP", 0);
        a = vk9Var;
        vk9 vk9Var2 = new vk9("ADD", 1);
        b = vk9Var2;
        vk9 vk9Var3 = new vk9("REMOVE", 2);
        c = vk9Var3;
        d = new vk9[]{vk9Var, vk9Var2, vk9Var3};
    }

    public static vk9 valueOf(String str) {
        return (vk9) Enum.valueOf(vk9.class, str);
    }

    public static vk9[] values() {
        return (vk9[]) d.clone();
    }
}
