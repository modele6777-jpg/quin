package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Bundle;
import io.sentry.config.a;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hm2 extends qt0 {
    public final ContentResolver e;
    public Uri f;
    public AssetFileDescriptor g;
    public FileInputStream v;
    public long w;
    public boolean x;

    public hm2(Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) throws gm2 {
        int i;
        AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        long jPosition;
        try {
            try {
                Uri uri = dc3Var.a;
                long j = dc3Var.g;
                long j2 = dc3Var.f;
                Uri uriNormalizeScheme = uri.normalizeScheme();
                this.f = uriNormalizeScheme;
                p();
                boolean zEquals = Objects.equals(uriNormalizeScheme.getScheme(), "content");
                ContentResolver contentResolver = this.e;
                if (zEquals) {
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("android.provider.extra.ACCEPT_ORIGINAL_MEDIA_FORMAT", true);
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openTypedAssetFileDescriptor(uriNormalizeScheme, "*/*", bundle);
                } else {
                    assetFileDescriptorOpenAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uriNormalizeScheme, "r");
                }
                this.g = assetFileDescriptorOpenAssetFileDescriptor;
                if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                    i = 2000;
                    try {
                        throw new gm2(2000, new IOException("Could not open file descriptor for: " + uriNormalizeScheme));
                    } catch (IOException e) {
                        e = e;
                        throw new gm2(e instanceof FileNotFoundException ? 2005 : i, e);
                    }
                }
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                FileDescriptor fileDescriptor = assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor();
                FileInputStream fileInputStreamC = a.c(new FileInputStream(fileDescriptor), fileDescriptor);
                this.v = fileInputStreamC;
                if (length != -1 && j2 > length) {
                    throw new gm2(2008, null);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStreamC.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new gm2(2008, null);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStreamC.getChannel();
                    long size = channel.size();
                    if (size == 0) {
                        this.w = -1L;
                        jPosition = -1;
                    } else {
                        jPosition = size - channel.position();
                        this.w = jPosition;
                        if (jPosition < 0) {
                            throw new gm2(2008, null);
                        }
                    }
                } else {
                    jPosition = length - jSkip;
                    this.w = jPosition;
                    if (jPosition < 0) {
                        throw new gm2(2008, null);
                    }
                }
                if (j != -1) {
                    this.w = jPosition == -1 ? j : Math.min(jPosition, j);
                }
                this.x = true;
                q(dc3Var);
                return j != -1 ? j : this.w;
            } catch (IOException e2) {
                e = e2;
                i = 2000;
            }
        } catch (gm2 e3) {
            throw e3;
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x000e */
    /* JADX WARN: Bottom block not found for handler: all -> 0x004e */
    @Override // defpackage.ac3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void close() {
        /*
            r5 = this;
            r0 = 0
            r5.f = r0
            r1 = 2000(0x7d0, float:2.803E-42)
            r2 = 0
            java.io.FileInputStream r3 = r5.v     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            if (r3 == 0) goto L12
            r3.close()     // Catch: java.lang.Throwable -> Le java.io.IOException -> L10
            goto L12
        Le:
            r3 = move-exception
            goto L44
        L10:
            r3 = move-exception
            goto L3e
        L12:
            r5.v = r0
            android.content.res.AssetFileDescriptor r3 = r5.g     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            if (r3 == 0) goto L20
            r3.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            goto L20
        L1c:
            r1 = move-exception
            goto L32
        L1e:
            r3 = move-exception
            goto L2c
        L20:
            r5.g = r0
            boolean r0 = r5.x
            if (r0 == 0) goto L2b
            r5.x = r2
            r5.n()
        L2b:
            return
        L2c:
            gm2 r4 = new gm2     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L1c
            throw r4     // Catch: java.lang.Throwable -> L1c
        L32:
            r5.g = r0
            boolean r0 = r5.x
            if (r0 == 0) goto L3d
            r5.x = r2
            r5.n()
        L3d:
            throw r1
        L3e:
            gm2 r4 = new gm2     // Catch: java.lang.Throwable -> Le
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> Le
            throw r4     // Catch: java.lang.Throwable -> Le
        L44:
            r5.v = r0
            android.content.res.AssetFileDescriptor r4 = r5.g     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            if (r4 == 0) goto L52
            r4.close()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L50
            goto L52
        L4e:
            r1 = move-exception
            goto L64
        L50:
            r3 = move-exception
            goto L5e
        L52:
            r5.g = r0
            boolean r0 = r5.x
            if (r0 == 0) goto L5d
            r5.x = r2
            r5.n()
        L5d:
            throw r3
        L5e:
            gm2 r4 = new gm2     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r1, r3)     // Catch: java.lang.Throwable -> L4e
            throw r4     // Catch: java.lang.Throwable -> L4e
        L64:
            r5.g = r0
            boolean r0 = r5.x
            if (r0 == 0) goto L6f
            r5.x = r2
            r5.n()
        L6f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm2.close():void");
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        return this.f;
    }

    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) throws gm2 {
        if (i2 == 0) {
            return 0;
        }
        long j = this.w;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new gm2(2000, e);
                }
            }
            FileInputStream fileInputStream = this.v;
            String str = pqf.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            if (i3 != -1) {
                long j2 = this.w;
                if (j2 != -1) {
                    this.w = j2 - ((long) i3);
                }
                j(i3);
                return i3;
            }
        }
        return -1;
    }
}
