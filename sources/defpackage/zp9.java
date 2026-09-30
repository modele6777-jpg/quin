package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zp9 {
    public static final /* synthetic */ zp9[] a = {new zp9("WeChat", 0), new zp9("PhoneSms", 1), new zp9("Email", 2)};

    /* JADX INFO: Fake field, exist only in values array */
    zp9 EF5;

    public static zp9 valueOf(String str) {
        return (zp9) Enum.valueOf(zp9.class, str);
    }

    public static zp9[] values() {
        return (zp9[]) a.clone();
    }
}
