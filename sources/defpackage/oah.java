package defpackage;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import io.sentry.android.core.v;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oah extends wbh {
    public final HashMap e;
    public final v f;
    public final v g;
    public final v v;
    public final v w;
    public final v x;
    public final v y;

    public oah(ich ichVar) {
        super(ichVar);
        this.e = new HashMap();
        c2h c2hVar = ((w3h) this.b).e;
        w3h.f(c2hVar);
        this.f = new v(c2hVar, "last_delete_stale", 0L);
        c2h c2hVar2 = ((w3h) this.b).e;
        w3h.f(c2hVar2);
        this.g = new v(c2hVar2, "last_delete_stale_batch", 0L);
        c2h c2hVar3 = ((w3h) this.b).e;
        w3h.f(c2hVar3);
        this.v = new v(c2hVar3, "backoff", 0L);
        c2h c2hVar4 = ((w3h) this.b).e;
        w3h.f(c2hVar4);
        this.w = new v(c2hVar4, "last_upload", 0L);
        c2h c2hVar5 = ((w3h) this.b).e;
        w3h.f(c2hVar5);
        this.x = new v(c2hVar5, "last_upload_attempt", 0L);
        c2h c2hVar6 = ((w3h) this.b).e;
        w3h.f(c2hVar6);
        this.y = new v(c2hVar6, "midnight_offset", 0L);
    }

    public final Pair E0(ndh ndhVar, q5h q5hVar) {
        String str = ndhVar.a;
        oa7.x(str);
        return (q5hVar.i(o5h.AD_STORAGE) && ndhVar.Y) ? F0(str) : new Pair("", Boolean.FALSE);
    }

    public final Pair F0(String str) {
        mah mahVar;
        AdvertisingIdClient.Info advertisingIdInfo;
        A0();
        w3h w3hVar = (w3h) this.b;
        hj6 hj6Var = w3hVar.y;
        qqg qqgVar = w3hVar.d;
        hj6Var.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HashMap map = this.e;
        mah mahVar2 = (mah) map.get(str);
        if (mahVar2 != null && jElapsedRealtime < mahVar2.c) {
            return new Pair(mahVar2.a, Boolean.valueOf(mahVar2.b));
        }
        long jI0 = qqgVar.I0(str, bzg.b) + jElapsedRealtime;
        try {
            try {
                advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(w3hVar.a);
            } catch (PackageManager.NameNotFoundException unused) {
                if (mahVar2 != null && jElapsedRealtime < mahVar2.c + qqgVar.I0(str, bzg.c)) {
                    return new Pair(mahVar2.a, Boolean.valueOf(mahVar2.b));
                }
                advertisingIdInfo = null;
            }
            if (advertisingIdInfo == null) {
                return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
            }
            String id = advertisingIdInfo.getId();
            mahVar = id != null ? new mah(jI0, advertisingIdInfo.isLimitAdTrackingEnabled(), id) : new mah(jI0, advertisingIdInfo.isLimitAdTrackingEnabled(), "");
            map.put(str, mahVar);
            return new Pair(mahVar.a, Boolean.valueOf(mahVar.b));
        } catch (Exception e) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.Y.b(e, "Unable to get advertising id");
            mahVar = new mah(jI0, false, "");
        }
    }

    public final String G0(ndh ndhVar, q5h q5hVar) {
        String str = ndhVar.a;
        oa7.x(str);
        if (!q5hVar.i(o5h.AD_STORAGE) || !ndhVar.Y) {
            return "";
        }
        A0();
        String str2 = (String) F0(str).first;
        MessageDigest messageDigestT0 = qch.T0();
        if (messageDigestT0 == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, messageDigestT0.digest(str2.getBytes())));
    }

    @Override // defpackage.wbh
    public final void D0() {
    }
}
