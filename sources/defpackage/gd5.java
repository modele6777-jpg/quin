package defpackage;

import android.net.Uri;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gd5 extends qt0 {
    public RandomAccessFile e;
    public Uri f;
    public long g;
    public boolean v;

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) throws fd5 {
        Uri uri = dc3Var.a;
        long j = dc3Var.f;
        this.f = uri;
        p();
        try {
            String path = uri.getPath();
            path.getClass();
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.e = randomAccessFile;
            try {
                randomAccessFile.seek(j);
                long length = dc3Var.g;
                if (length == -1) {
                    length = this.e.length() - j;
                }
                this.g = length;
                if (length < 0) {
                    throw new fd5(null, null, 2008);
                }
                this.v = true;
                q(dc3Var);
                return this.g;
            } catch (IOException e) {
                throw new fd5(2000, e);
            }
        } catch (FileNotFoundException e2) {
            if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                throw new fd5(((e2.getCause() instanceof ErrnoException) && ((ErrnoException) e2.getCause()).errno == OsConstants.EACCES) ? 2006 : 2005, e2);
            }
            String path2 = uri.getPath();
            String query = uri.getQuery();
            String fragment = uri.getFragment();
            StringBuilder sbO = ib8.o("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=", path2, ",query=", query, ",fragment=");
            sbO.append(fragment);
            throw new fd5(sbO.toString(), e2, ErrorCodes.PROTOCOL_EXCEPTION);
        } catch (SecurityException e3) {
            throw new fd5(2006, e3);
        } catch (RuntimeException e4) {
            throw new fd5(2000, e4);
        }
    }

    @Override // defpackage.ac3
    public final void close() {
        this.f = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.e;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.e = null;
                if (this.v) {
                    this.v = false;
                    n();
                }
            } catch (IOException e) {
                throw new fd5(2000, e);
            }
        } catch (Throwable th) {
            this.e = null;
            if (this.v) {
                this.v = false;
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
    public final int read(byte[] bArr, int i, int i2) throws fd5 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.g;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.e;
            String str = pqf.a;
            int i3 = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                this.g -= (long) i3;
                j(i3);
            }
            return i3;
        } catch (IOException e) {
            throw new fd5(2000, e);
        }
    }
}
