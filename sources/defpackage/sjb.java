package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sjb {
    public static final sjb a;
    public static final sjb b;
    public static final sjb c;
    public static final sjb d;
    public static final sjb e;
    public static final sjb f;
    public static final /* synthetic */ sjb[] g;

    static {
        sjb sjbVar = new sjb("ShutDown", 0);
        a = sjbVar;
        sjb sjbVar2 = new sjb("ShuttingDown", 1);
        b = sjbVar2;
        sjb sjbVar3 = new sjb("Inactive", 2);
        c = sjbVar3;
        sjb sjbVar4 = new sjb("InactivePendingWork", 3);
        d = sjbVar4;
        sjb sjbVar5 = new sjb("Idle", 4);
        e = sjbVar5;
        sjb sjbVar6 = new sjb("PendingWork", 5);
        f = sjbVar6;
        g = new sjb[]{sjbVar, sjbVar2, sjbVar3, sjbVar4, sjbVar5, sjbVar6};
    }

    public static sjb valueOf(String str) {
        return (sjb) Enum.valueOf(sjb.class, str);
    }

    public static sjb[] values() {
        return (sjb[]) g.clone();
    }
}
