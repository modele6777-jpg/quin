package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lua {
    public static final lua a;
    public static final lua b;
    public static final lua c;
    public static final /* synthetic */ lua[] d;

    static {
        lua luaVar = new lua("DEFAULT", 0);
        a = luaVar;
        lua luaVar2 = new lua("VERY_LOW", 1);
        b = luaVar2;
        lua luaVar3 = new lua("HIGHEST", 2);
        c = luaVar3;
        d = new lua[]{luaVar, luaVar2, luaVar3};
    }

    public static lua valueOf(String str) {
        return (lua) Enum.valueOf(lua.class, str);
    }

    public static lua[] values() {
        return (lua[]) d.clone();
    }
}
