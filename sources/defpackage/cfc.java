package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class cfc {
    public static final cfc a;
    public static final cfc b;
    public static final cfc c;
    public static final /* synthetic */ cfc[] d;

    static {
        cfc cfcVar = new cfc("NETWORK_UNMETERED", 0);
        a = cfcVar;
        cfc cfcVar2 = new cfc("DEVICE_IDLE", 1);
        b = cfcVar2;
        cfc cfcVar3 = new cfc("DEVICE_CHARGING", 2);
        c = cfcVar3;
        d = new cfc[]{cfcVar, cfcVar2, cfcVar3};
    }

    public static cfc valueOf(String str) {
        return (cfc) Enum.valueOf(cfc.class, str);
    }

    public static cfc[] values() {
        return (cfc[]) d.clone();
    }
}
