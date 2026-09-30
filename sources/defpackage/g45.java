package defpackage;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g45 extends lga {
    final boolean isRecoverable;
    public final zp8 mediaPeriodId;
    public final rr5 rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final String rendererName;
    public final int type;

    /* JADX WARN: Illegal instructions before constructor call */
    public g45(int i, Exception exc, int i2, String str, int i3, rr5 rr5Var, int i4, zp8 zp8Var, boolean z) {
        String str2;
        int i5;
        rr5 rr5Var2;
        String string;
        String str3;
        if (i == 0) {
            str2 = str;
            i5 = i3;
            rr5Var2 = rr5Var;
            string = "Source error";
        } else if (i != 1) {
            string = i != 3 ? "Unexpected runtime error" : "Remote error";
            str2 = str;
            i5 = i3;
            rr5Var2 = rr5Var;
        } else {
            StringBuilder sb = new StringBuilder();
            str2 = str;
            sb.append(str2);
            sb.append(" error, index=");
            i5 = i3;
            sb.append(i5);
            sb.append(", format=");
            rr5Var2 = rr5Var;
            sb.append(rr5Var2);
            sb.append(", format_supported=");
            String str4 = pqf.a;
            if (i4 == 0) {
                str3 = "NO";
            } else if (i4 == 1) {
                str3 = "NO_UNSUPPORTED_SUBTYPE";
            } else if (i4 == 2) {
                str3 = "NO_UNSUPPORTED_DRM";
            } else if (i4 == 3) {
                str3 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i4 != 4) {
                    r3.l();
                    throw null;
                }
                str3 = "YES";
            }
            sb.append(str3);
            string = sb.toString();
        }
        this(TextUtils.isEmpty(null) ? string : string.concat(": null"), exc, i2, i, str2, i5, rr5Var2, i4, zp8Var, SystemClock.elapsedRealtime(), z);
    }

    public final g45 a(zp8 zp8Var) {
        String message = getMessage();
        String str = pqf.a;
        return new g45(message, getCause(), this.errorCode, this.type, this.rendererName, this.rendererIndex, this.rendererFormat, this.rendererFormatSupport, zp8Var, this.timestampMs, this.isRecoverable);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g45(String str, Throwable th, int i, int i2, String str2, int i3, rr5 rr5Var, int i4, zp8 zp8Var, long j, boolean z) {
        super(str, th, i, j);
        Bundle bundle = Bundle.EMPTY;
        pa7.A(!z || i2 == 1);
        pa7.A(th != null || i2 == 3);
        this.type = i2;
        this.rendererName = str2;
        this.rendererIndex = i3;
        this.rendererFormat = rr5Var;
        this.rendererFormatSupport = i4;
        this.mediaPeriodId = zp8Var;
        this.isRecoverable = z;
    }

    public g45(int i, Exception exc, int i2) {
        this(i, exc, i2, null, -1, null, 4, null, false);
    }
}
