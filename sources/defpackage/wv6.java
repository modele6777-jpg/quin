package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface wv6 extends vdb {
    public static final no0 C;
    public static final no0 D;
    public static final no0 E;

    static {
        Class cls = Integer.TYPE;
        C = new no0("camerax.core.imageInput.inputFormat", cls, null);
        D = new no0("camerax.core.imageInput.secondaryInputFormat", cls, null);
        E = new no0("camerax.core.imageInput.inputDynamicRange", qr4.class, null);
    }

    default int l() {
        return ((Integer) c(C)).intValue();
    }
}
