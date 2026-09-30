package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class atf {
    public static final atf a;
    public static final atf b;
    public static final /* synthetic */ atf[] c;

    static {
        atf atfVar = new atf("Lsq2", 0);
        a = atfVar;
        atf atfVar2 = new atf("Impulse", 1);
        b = atfVar2;
        c = new atf[]{atfVar, atfVar2};
    }

    public static atf valueOf(String str) {
        return (atf) Enum.valueOf(atf.class, str);
    }

    public static atf[] values() {
        return (atf[]) c.clone();
    }
}
