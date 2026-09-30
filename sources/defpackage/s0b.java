package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s0b {
    public static final s0b a;
    public static final /* synthetic */ s0b[] b;

    static {
        s0b s0bVar = new s0b("DEFAULT", 0);
        a = s0bVar;
        b = new s0b[]{s0bVar, new s0b("SIGNED", 1), new s0b("FIXED", 2)};
    }

    public static s0b valueOf(String str) {
        return (s0b) Enum.valueOf(s0b.class, str);
    }

    public static s0b[] values() {
        return (s0b[]) b.clone();
    }
}
