package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hbh {
    public static final hbh a;
    public static final hbh b;
    public static final /* synthetic */ hbh[] c;

    static {
        hbh hbhVar = new hbh("CONSENT", 0);
        a = hbhVar;
        hbh hbhVar2 = new hbh("LEGITIMATE_INTEREST", 1);
        hbh hbhVar3 = new hbh("FLEXIBLE_CONSENT", 2);
        hbh hbhVar4 = new hbh("FLEXIBLE_LEGITIMATE_INTEREST", 3);
        b = hbhVar4;
        c = new hbh[]{hbhVar, hbhVar2, hbhVar3, hbhVar4};
    }

    public static hbh[] values() {
        return (hbh[]) c.clone();
    }
}
