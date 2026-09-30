package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g1h extends wbh {
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g1h(ich ichVar, int i) {
        super(ichVar);
        this.e = i;
    }

    @Override // defpackage.wbh
    public final void D0() {
        int i = this.e;
    }

    public boolean E0() {
        B0();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((w3h) this.b).a.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = null;
        if (connectivityManager != null) {
            try {
                activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public void H0(String str, ybh ybhVar, t3h t3hVar, b1h b1hVar) {
        String str2;
        String str3 = ybhVar.a;
        w3h w3hVar = (w3h) this.b;
        A0();
        B0();
        try {
            URL url = new URI(str3).toURL();
            this.c.k0();
            byte[] bArrA = t3hVar.a();
            m3h m3hVar = w3hVar.g;
            w3h.h(m3hVar);
            Map map = ybhVar.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
            try {
                m3hVar.M0(new e1h(this, str2, url, bArrA, map, b1hVar));
            } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.g.c(w0h.E0(str2), str3, "Failed to parse URL. Not uploading MeasurementBatch. appId");
            }
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            str2 = str;
        }
    }

    private final void F0() {
    }

    private final void G0() {
    }
}
