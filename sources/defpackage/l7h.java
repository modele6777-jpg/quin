package defpackage;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l7h implements Callable {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ String b;
    public final /* synthetic */ k6h c;

    public /* synthetic */ l7h(boolean z, String str, k6h k6hVar) {
        this.a = z;
        this.b = str;
        this.c = k6hVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        MessageDigest messageDigest;
        boolean z = this.a;
        String str = this.b;
        k6h k6hVar = this.c;
        String str2 = (z || !zah.b(str, k6hVar, true, false).b) ? "not allowed" : "debug cert rejected";
        int i = 0;
        while (true) {
            if (i >= 2) {
                messageDigest = null;
                break;
            }
            try {
                messageDigest = MessageDigest.getInstance("SHA-256");
                if (messageDigest != null) {
                    break;
                }
                i++;
            } catch (NoSuchAlgorithmException unused) {
            }
        }
        oa7.A(messageDigest);
        byte[] bArrDigest = messageDigest.digest(k6hVar.f);
        int length = bArrDigest.length;
        char[] cArr = new char[length + length];
        int i2 = 0;
        for (byte b : bArrDigest) {
            char[] cArr2 = vpf.h;
            cArr[i2] = cArr2[(b & 255) >>> 4];
            cArr[i2 + 1] = cArr2[b & 15];
            i2 += 2;
        }
        StringBuilder sbO = ib8.o(str2, ": pkg=", str, ", sha256=", new String(cArr));
        sbO.append(", atk=");
        sbO.append(z);
        sbO.append(", ver=12451000.false");
        return sbO.toString();
    }
}
