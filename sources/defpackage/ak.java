package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ak {
    public static final ak a;
    public static final /* synthetic */ ak[] b;

    /* JADX INFO: Fake field, exist only in values array */
    ak EF0;

    static {
        ak akVar = new ak("AM", 0);
        ak akVar2 = new ak("PM", 1);
        a = akVar2;
        b = new ak[]{akVar, akVar2};
    }

    public static ak valueOf(String str) {
        return (ak) Enum.valueOf(ak.class, str);
    }

    public static ak[] values() {
        return (ak[]) b.clone();
    }
}
