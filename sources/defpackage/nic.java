package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nic {
    public static final nic a;
    public static final nic b;
    public static final nic c;
    public static final nic d;
    public static final /* synthetic */ nic[] e;

    static {
        nic nicVar = new nic("PREVIEW", 0);
        a = nicVar;
        nic nicVar2 = new nic("EARLY_BIRD", 1);
        b = nicVar2;
        nic nicVar3 = new nic("OPEN", 2);
        c = nicVar3;
        nic nicVar4 = new nic("ENDED", 3);
        d = nicVar4;
        e = new nic[]{nicVar, nicVar2, nicVar3, nicVar4};
    }

    public static nic valueOf(String str) {
        return (nic) Enum.valueOf(nic.class, str);
    }

    public static nic[] values() {
        return (nic[]) e.clone();
    }
}
