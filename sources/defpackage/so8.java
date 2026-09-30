package defpackage;

import android.media.MediaCodec;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class so8 extends rm3 {
    public final to8 codecInfo;
    public final String diagnosticInfo;
    public final int errorCode;

    public so8(IllegalStateException illegalStateException, to8 to8Var) {
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(to8Var == null ? null : to8Var.a);
        super(sb.toString(), illegalStateException);
        this.codecInfo = to8Var;
        boolean z = illegalStateException instanceof MediaCodec.CodecException;
        this.diagnosticInfo = z ? ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo() : null;
        this.errorCode = z ? ((MediaCodec.CodecException) illegalStateException).getErrorCode() : 0;
    }
}
