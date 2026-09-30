package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class on7 {
    public static final on7 a;
    public static final on7 b;
    public static final on7 c;
    public static final on7 d;
    public static final /* synthetic */ on7[] e;

    static {
        on7 on7Var = new on7("INSTANCE", 0);
        a = on7Var;
        on7 on7Var2 = new on7("CONTEXT", 1);
        b = on7Var2;
        on7 on7Var3 = new on7("EXTENSION_RECEIVER", 2);
        c = on7Var3;
        on7 on7Var4 = new on7("VALUE", 3);
        d = on7Var4;
        e = new on7[]{on7Var, on7Var2, on7Var3, on7Var4};
    }

    public static on7 valueOf(String str) {
        return (on7) Enum.valueOf(on7.class, str);
    }

    public static on7[] values() {
        return (on7[]) e.clone();
    }
}
