package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class led {
    public static final led a;
    public static final led b;
    public static final led c;
    public static final /* synthetic */ led[] d;

    static {
        led ledVar = new led("START", 0);
        a = ledVar;
        led ledVar2 = new led("STOP", 1);
        b = ledVar2;
        led ledVar3 = new led("STOP_AND_RESET_REPLAY_CACHE", 2);
        c = ledVar3;
        d = new led[]{ledVar, ledVar2, ledVar3};
    }

    public static led valueOf(String str) {
        return (led) Enum.valueOf(led.class, str);
    }

    public static led[] values() {
        return (led[]) d.clone();
    }
}
