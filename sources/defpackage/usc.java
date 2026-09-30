package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class usc {
    public static final usc a;
    public static final usc b;
    public static final /* synthetic */ usc[] c;

    static {
        usc uscVar = new usc("Inherit", 0);
        a = uscVar;
        usc uscVar2 = new usc("SecureOn", 1);
        b = uscVar2;
        c = new usc[]{uscVar, uscVar2, new usc("SecureOff", 2)};
    }

    public static usc valueOf(String str) {
        return (usc) Enum.valueOf(usc.class, str);
    }

    public static usc[] values() {
        return (usc[]) c.clone();
    }
}
