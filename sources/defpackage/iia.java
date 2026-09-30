package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iia {
    public static final iia a;
    public static final iia b;
    public static final iia c;
    public static final /* synthetic */ iia[] d;

    static {
        iia iiaVar = new iia("Initial", 0);
        a = iiaVar;
        iia iiaVar2 = new iia("Main", 1);
        b = iiaVar2;
        iia iiaVar3 = new iia("Final", 2);
        c = iiaVar3;
        d = new iia[]{iiaVar, iiaVar2, iiaVar3};
    }

    public static iia valueOf(String str) {
        return (iia) Enum.valueOf(iia.class, str);
    }

    public static iia[] values() {
        return (iia[]) d.clone();
    }
}
