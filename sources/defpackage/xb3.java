package defpackage;

import android.net.Uri;
import android.util.Base64;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xb3 extends qt0 {
    public dc3 e;
    public byte[] f;
    public int g;
    public int v;

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) throws bc3, l0a {
        byte[] bArrDecode;
        p();
        this.e = dc3Var;
        Uri uri = dc3Var.a;
        long j = dc3Var.g;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        String scheme = uriNormalizeScheme.getScheme();
        pa7.B("data".equals(scheme), "Unsupported scheme: %s", scheme);
        String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        String str = pqf.a;
        String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw new l0a("Unexpected URI format: " + uriNormalizeScheme, null, true, 0);
        }
        String str2 = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                bArrDecode = Base64.decode(str2, 0);
                this.f = bArrDecode;
            } catch (IllegalArgumentException e) {
                throw new l0a(ub3.i("Error while parsing Base64 encoded string: ", str2), e, true, 0);
            }
        } else {
            bArrDecode = URLDecoder.decode(str2, StandardCharsets.US_ASCII.name()).getBytes(StandardCharsets.UTF_8);
            this.f = bArrDecode;
        }
        long j2 = dc3Var.f;
        if (j2 > bArrDecode.length) {
            this.f = null;
            throw new bc3(2008);
        }
        int i = (int) j2;
        this.g = i;
        int length = bArrDecode.length - i;
        this.v = length;
        if (j != -1) {
            this.v = (int) Math.min(length, j);
        }
        q(dc3Var);
        return j != -1 ? j : this.v;
    }

    @Override // defpackage.ac3
    public final void close() {
        if (this.f != null) {
            this.f = null;
            n();
        }
        this.e = null;
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        dc3 dc3Var = this.e;
        if (dc3Var != null) {
            return dc3Var.a;
        }
        return null;
    }

    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.v;
        if (i3 == 0) {
            return -1;
        }
        int iMin = Math.min(i2, i3);
        byte[] bArr2 = this.f;
        String str = pqf.a;
        System.arraycopy(bArr2, this.g, bArr, i, iMin);
        this.g += iMin;
        this.v -= iMin;
        j(iMin);
        return iMin;
    }
}
