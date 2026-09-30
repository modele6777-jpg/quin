package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uia {
    public static final uia a;
    public static final uia b;
    public static final uia c;
    public static final /* synthetic */ uia[] d;

    static {
        uia uiaVar = new uia("Unknown", 0);
        a = uiaVar;
        uia uiaVar2 = new uia("Dispatching", 1);
        b = uiaVar2;
        uia uiaVar3 = new uia("NotDispatching", 2);
        c = uiaVar3;
        d = new uia[]{uiaVar, uiaVar2, uiaVar3};
    }

    public static uia valueOf(String str) {
        return (uia) Enum.valueOf(uia.class, str);
    }

    public static uia[] values() {
        return (uia[]) d.clone();
    }
}
