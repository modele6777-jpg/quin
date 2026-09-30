package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.adjust.sdk.network.ErrorCodes;
import io.sentry.config.a;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kdb extends qt0 {
    public final Context e;
    public dc3 f;
    public AssetFileDescriptor g;
    public FileInputStream v;
    public long w;
    public boolean x;

    public kdb(Context context) {
        super(false);
        this.e = context.getApplicationContext();
    }

    @Deprecated
    public static Uri buildRawResourceUri(int i) {
        return Uri.parse("rawresource:///" + i);
    }

    @Override // defpackage.ac3
    public final long b(dc3 dc3Var) throws jdb {
        Resources resourcesForApplication;
        int identifier;
        int i;
        Resources resources;
        long size;
        this.f = dc3Var;
        p();
        Uri uri = dc3Var.a;
        long j = dc3Var.g;
        long j2 = dc3Var.f;
        Uri uriNormalizeScheme = uri.normalizeScheme();
        boolean zEquals = TextUtils.equals("rawresource", uriNormalizeScheme.getScheme());
        Context context = this.e;
        if (zEquals) {
            resources = context.getResources();
            List<String> pathSegments = uriNormalizeScheme.getPathSegments();
            if (pathSegments.size() != 1) {
                throw new jdb("rawresource:// URI must have exactly one path element, found " + pathSegments.size(), null, 2000);
            }
            try {
                i = Integer.parseInt(pathSegments.get(0));
            } catch (NumberFormatException unused) {
                throw new jdb("Resource identifier must be an integer.", null, ErrorCodes.PROTOCOL_EXCEPTION);
            }
        } else {
            if (!TextUtils.equals("android.resource", uriNormalizeScheme.getScheme())) {
                throw new jdb("Unsupported URI scheme (" + uriNormalizeScheme.getScheme() + "). Only android.resource is supported.", null, ErrorCodes.PROTOCOL_EXCEPTION);
            }
            String path = uriNormalizeScheme.getPath();
            path.getClass();
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            String packageName = TextUtils.isEmpty(uriNormalizeScheme.getHost()) ? context.getPackageName() : uriNormalizeScheme.getHost();
            if (packageName.equals(context.getPackageName())) {
                resourcesForApplication = context.getResources();
            } else {
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication(packageName);
                } catch (PackageManager.NameNotFoundException e) {
                    throw new jdb("Package in android.resource:// URI not found. Check http://g.co/dev/packagevisibility.", e, 2005);
                }
            }
            if (path.matches("\\d+")) {
                try {
                    identifier = Integer.parseInt(path);
                } catch (NumberFormatException unused2) {
                    throw new jdb("Resource identifier must be an integer.", null, ErrorCodes.PROTOCOL_EXCEPTION);
                }
            } else {
                identifier = resourcesForApplication.getIdentifier(ib8.j(packageName, ":", path), "raw", null);
                if (identifier == 0) {
                    throw new jdb("Resource not found.", null, 2005);
                }
            }
            i = identifier;
            resources = resourcesForApplication;
        }
        try {
            AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = resources.openRawResourceFd(i);
            if (assetFileDescriptorOpenRawResourceFd == null) {
                throw new jdb("Resource is compressed: " + uriNormalizeScheme, null, 2000);
            }
            this.g = assetFileDescriptorOpenRawResourceFd;
            long length = assetFileDescriptorOpenRawResourceFd.getLength();
            FileDescriptor fileDescriptor = this.g.getFileDescriptor();
            FileInputStream fileInputStreamC = a.c(new FileInputStream(fileDescriptor), fileDescriptor);
            this.v = fileInputStreamC;
            try {
                if (length != -1 && j2 > length) {
                    throw new jdb(null, null, 2008);
                }
                long startOffset = this.g.getStartOffset();
                long jSkip = fileInputStreamC.skip(startOffset + j2) - startOffset;
                if (jSkip != j2) {
                    throw new jdb(null, null, 2008);
                }
                if (length == -1) {
                    FileChannel channel = fileInputStreamC.getChannel();
                    if (channel.size() == 0) {
                        this.w = -1L;
                        size = -1;
                    } else {
                        size = channel.size() - channel.position();
                        this.w = size;
                        if (size < 0) {
                            throw new jdb(null, null, 2008);
                        }
                    }
                } else {
                    size = length - jSkip;
                    this.w = size;
                    if (size < 0) {
                        throw new bc3(2008);
                    }
                }
                if (j != -1) {
                    this.w = size == -1 ? j : Math.min(size, j);
                }
                this.x = true;
                q(dc3Var);
                return j != -1 ? j : this.w;
            } catch (jdb e2) {
                throw e2;
            } catch (IOException e3) {
                throw new jdb(null, e3, 2000);
            }
        } catch (Resources.NotFoundException e4) {
            throw new jdb(null, e4, 2005);
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
            jdb r4 = new jdb     // Catch: java.lang.Throwable -> L1c
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L1c
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
            jdb r4 = new jdb     // Catch: java.lang.Throwable -> Le
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> Le
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
            jdb r4 = new jdb     // Catch: java.lang.Throwable -> L4e
            r4.<init>(r0, r3, r1)     // Catch: java.lang.Throwable -> L4e
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kdb.close():void");
    }

    @Override // defpackage.ac3
    public final Uri getUri() {
        dc3 dc3Var = this.f;
        if (dc3Var != null) {
            return dc3Var.a;
        }
        return null;
    }

    @Override // defpackage.sb3
    public final int read(byte[] bArr, int i, int i2) throws jdb {
        if (i2 == 0) {
            return 0;
        }
        long j = this.w;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new jdb(null, e, 2000);
                }
            }
            FileInputStream fileInputStream = this.v;
            String str = pqf.a;
            int i3 = fileInputStream.read(bArr, i, i2);
            long j2 = this.w;
            if (i3 != -1) {
                if (j2 != -1) {
                    this.w = j2 - ((long) i3);
                }
                j(i3);
                return i3;
            }
            if (j2 != -1) {
                throw new jdb("End of stream reached having not read sufficient data.", new EOFException(), 2000);
            }
        }
        return -1;
    }
}
