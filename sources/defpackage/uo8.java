package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class uo8 extends Exception {
    public final to8 codecInfo;
    public final String diagnosticInfo;
    public final uo8 fallbackDecoderInitializationException;
    public final String mimeType;
    public final boolean secureDecoderRequired;

    /* JADX WARN: Illegal instructions before constructor call */
    public uo8(rr5 rr5Var, yo8 yo8Var, boolean z, int i) {
        String str = "Decoder init failed: [" + i + "], " + rr5Var;
        String str2 = rr5Var.p;
        StringBuilder sbQ = kv2.q("androidx.media3.exoplayer.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
        sbQ.append(Math.abs(i));
        this(str, yo8Var, str2, z, null, sbQ.toString(), null);
    }

    public uo8(String str, Throwable th, String str2, boolean z, to8 to8Var, String str3, uo8 uo8Var) {
        super(str, th);
        this.mimeType = str2;
        this.secureDecoderRequired = z;
        this.codecInfo = to8Var;
        this.diagnosticInfo = str3;
        this.fallbackDecoderInitializationException = uo8Var;
    }
}
