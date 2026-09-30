package defpackage;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tp3 implements ac3 {
    public final Context a;
    public final ArrayList b;
    public final ac3 c;
    public gd5 d;
    public qe0 e;
    public hm2 f;
    public ac3 g;
    public saf v;
    public xb3 w;
    public kdb x;
    public ac3 y;

    public tp3(Context context, ac3 ac3Var) {
        this.a = context.getApplicationContext();
        ac3Var.getClass();
        this.c = ac3Var;
        this.b = new ArrayList();
    }

    public static void n(ac3 ac3Var, lp3 lp3Var) {
        if (ac3Var != null) {
            ac3Var.m(lp3Var);
        }
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) {
        ac3 ac3Var;
        pa7.J(this.y == null);
        Uri uri = dc3Var.a;
        String scheme = uri.getScheme();
        String str = pqf.a;
        String scheme2 = uri.getScheme();
        boolean zIsEmpty = TextUtils.isEmpty(scheme2);
        Context context = this.a;
        if (zIsEmpty || Objects.equals(scheme2, "file")) {
            String path = uri.getPath();
            if (path == null || !path.startsWith("/android_asset/")) {
                if (this.d == null) {
                    gd5 gd5Var = new gd5(false);
                    this.d = gd5Var;
                    j(gd5Var);
                }
                ac3Var = this.d;
                this.y = ac3Var;
            } else {
                if (this.e == null) {
                    qe0 qe0Var = new qe0(context);
                    this.e = qe0Var;
                    j(qe0Var);
                }
                ac3Var = this.e;
                this.y = ac3Var;
            }
        } else if ("asset".equals(scheme)) {
            if (this.e == null) {
                qe0 qe0Var2 = new qe0(context);
                this.e = qe0Var2;
                j(qe0Var2);
            }
            ac3Var = this.e;
            this.y = ac3Var;
        } else if ("content".equals(scheme)) {
            if (this.f == null) {
                hm2 hm2Var = new hm2(context);
                this.f = hm2Var;
                j(hm2Var);
            }
            ac3Var = this.f;
            this.y = ac3Var;
        } else {
            boolean zEquals = "rtmp".equals(scheme);
            ac3 ac3Var2 = this.c;
            if (zEquals) {
                ac3Var = this.g;
                if (ac3Var == null) {
                    try {
                        ac3 ac3Var3 = (ac3) Class.forName("androidx.media3.datasource.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
                        this.g = ac3Var3;
                        j(ac3Var3);
                    } catch (ClassNotFoundException unused) {
                        xo1.V("DefaultDataSource", "Attempting to play RTMP stream without depending on the RTMP extension");
                    } catch (Exception e) {
                        cva.q("Error instantiating RTMP extension", e);
                        return 0L;
                    }
                    ac3 ac3Var4 = this.g;
                    if (ac3Var4 == null) {
                        this.g = ac3Var2;
                    } else {
                        ac3Var2 = ac3Var4;
                    }
                    ac3Var = ac3Var2;
                }
                this.y = ac3Var;
            } else if ("udp".equals(scheme)) {
                if (this.v == null) {
                    saf safVar = new saf();
                    this.v = safVar;
                    j(safVar);
                }
                ac3Var = this.v;
                this.y = ac3Var;
            } else if ("data".equals(scheme)) {
                if (this.w == null) {
                    xb3 xb3Var = new xb3(false);
                    this.w = xb3Var;
                    j(xb3Var);
                }
                ac3Var = this.w;
                this.y = ac3Var;
            } else if ("rawresource".equals(scheme) || "android.resource".equals(scheme)) {
                if (this.x == null) {
                    kdb kdbVar = new kdb(context);
                    this.x = kdbVar;
                    j(kdbVar);
                }
                ac3Var = this.x;
                this.y = ac3Var;
            } else {
                this.y = ac3Var2;
                ac3Var = ac3Var2;
            }
        }
        return ac3Var.b(dc3Var);
    }

    @Override // defpackage.ac3
    public final void close() {
        ac3 ac3Var = this.y;
        if (ac3Var != null) {
            try {
                ac3Var.close();
            } finally {
                this.y = null;
            }
        }
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        ac3 ac3Var = this.y;
        if (ac3Var == null) {
            return null;
        }
        return ac3Var.getUri();
    }

    @Override // defpackage.ac3
    public final Map i() {
        ac3 ac3Var = this.y;
        return ac3Var == null ? Collections.EMPTY_MAP : ac3Var.i();
    }

    public final void j(ac3 ac3Var) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.b;
            if (i >= arrayList.size()) {
                return;
            }
            ac3Var.m((lp3) arrayList.get(i));
            i++;
        }
    }

    @Override // defpackage.ac3
    public final void m(lp3 lp3Var) {
        lp3Var.getClass();
        this.c.m(lp3Var);
        this.b.add(lp3Var);
        n(this.d, lp3Var);
        n(this.e, lp3Var);
        n(this.f, lp3Var);
        n(this.g, lp3Var);
        n(this.v, lp3Var);
        n(this.w, lp3Var);
        n(this.x, lp3Var);
    }

    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) {
        ac3 ac3Var = this.y;
        ac3Var.getClass();
        return ac3Var.read(bArr, i, i2);
    }
}
