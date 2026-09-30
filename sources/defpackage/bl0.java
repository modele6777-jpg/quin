package defpackage;

import android.os.Build;
import android.util.Base64;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bl0 implements u8e {
    public final /* synthetic */ int a;

    public /* synthetic */ bl0(int i) {
        this.a = i;
    }

    @Override // defpackage.u8e
    public final Object get() {
        switch (this.a) {
            case 0:
                return Boolean.valueOf(Build.VERSION.SDK_INT > 37 && Objects.equals(pqf.y("persist.audio.compressed_offload_implicit_aac"), "false"));
            case 1:
                byte[] bArr = new byte[12];
                gs3.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                return new ur3();
            case 3:
                String strY = pqf.y("ro.vendor.api_level");
                if (strY == null) {
                    strY = "";
                }
                return rxg.a0(strY);
            case 4:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            default:
                throw new IllegalStateException();
        }
    }
}
