package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qe0 extends qt0 {
    public final AssetManager e;
    public Uri f;
    public InputStream g;
    public long v;
    public boolean w;

    public qe0(Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) throws pe0 {
        try {
            Uri uri = dc3Var.a;
            long j = dc3Var.f;
            this.f = uri;
            String path = uri.getPath();
            path.getClass();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            p();
            InputStream inputStreamOpen = this.e.open(path, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(j) < j) {
                throw new pe0(2008, null);
            }
            long j2 = dc3Var.g;
            if (j2 != -1) {
                this.v = j2;
            } else {
                long jAvailable = this.g.available();
                this.v = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.v = -1L;
                }
            }
            this.w = true;
            q(dc3Var);
            return this.v;
        } catch (pe0 e) {
            throw e;
        } catch (IOException e2) {
            throw new pe0(e2 instanceof FileNotFoundException ? 2005 : 2000, e2);
        }
    }

    @Override // defpackage.ac3
    public final void close() {
        this.f = null;
        try {
            try {
                InputStream inputStream = this.g;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.g = null;
                if (this.w) {
                    this.w = false;
                    n();
                }
            } catch (IOException e) {
                throw new pe0(2000, e);
            }
        } catch (Throwable th) {
            this.g = null;
            if (this.w) {
                this.w = false;
                n();
            }
            throw th;
        }
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) throws pe0 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.v;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new pe0(2000, e);
                }
            }
            InputStream inputStream = this.g;
            String str = pqf.a;
            int i3 = inputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.v;
                if (j2 != -1) {
                    this.v = j2 - ((long) i3);
                }
                j(i3);
                return i3;
            }
        }
        return -1;
    }
}
