package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iv6 implements xjf, ew6, cd7 {
    public static final no0 b;
    public static final no0 c;
    public static final no0 d;
    public static final no0 e;
    public static final no0 f;
    public static final no0 g;
    public static final no0 v;
    public static final no0 w;
    public static final no0 x;
    public static final no0 y;
    public static final no0 z;
    public final bs9 a;

    static {
        Class cls = Integer.TYPE;
        b = new no0("camerax.core.imageCapture.captureMode", cls, null);
        c = new no0("camerax.core.imageCapture.flashMode", cls, null);
        d = new no0("camerax.core.imageCapture.captureBundle", hm1.class, null);
        e = new no0("camerax.core.imageCapture.bufferFormat", Integer.class, null);
        f = new no0("camerax.core.imageCapture.outputFormat", Integer.class, null);
        g = new no0("camerax.core.imageCapture.imageReaderProxyProvider", mw6.class, null);
        v = new no0("camerax.core.imageCapture.useSoftwareJpegEncoder", Boolean.TYPE, null);
        w = new no0("camerax.core.imageCapture.flashType", cls, null);
        x = new no0("camerax.core.imageCapture.jpegCompressionQuality", cls, null);
        y = new no0("camerax.core.imageCapture.screenFlash", vfc.class, null);
        z = new no0("camerax.core.useCase.isPostviewEnabled", Boolean.class, null);
    }

    public iv6(bs9 bs9Var) {
        this.a = bs9Var;
    }

    @Override // defpackage.vdb
    public final qh2 k() {
        return this.a;
    }

    @Override // defpackage.wv6
    public final int l() {
        return ((Integer) c(wv6.C)).intValue();
    }
}
