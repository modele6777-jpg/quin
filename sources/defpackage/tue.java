package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tue {
    public static final tue a;
    public static final /* synthetic */ tue[] b;

    /* JADX INFO: Fake field, exist only in values array */
    tue EF0;

    static {
        tue tueVar = new tue("Shown", 0);
        tue tueVar2 = new tue("Hidden", 1);
        a = tueVar2;
        b = new tue[]{tueVar, tueVar2};
    }

    public static tue valueOf(String str) {
        return (tue) Enum.valueOf(tue.class, str);
    }

    public static tue[] values() {
        return (tue[]) b.clone();
    }
}
