package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class txb {
    public static final txb a;
    public static final txb b;
    public static final /* synthetic */ txb[] c;

    static {
        txb txbVar = new txb("Ltr", 0);
        a = txbVar;
        txb txbVar2 = new txb("Rtl", 1);
        b = txbVar2;
        c = new txb[]{txbVar, txbVar2};
    }

    public static txb valueOf(String str) {
        return (txb) Enum.valueOf(txb.class, str);
    }

    public static txb[] values() {
        return (txb[]) c.clone();
    }
}
