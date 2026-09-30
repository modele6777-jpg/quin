package defpackage;

import android.net.Uri;
import io.sentry.config.a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class deh implements oeh {
    @Override // defpackage.oeh
    public final ieh a(Uri uri) throws geh {
        File fileW = n3d.w(uri);
        return new ieh(fileW, a.b(fileW, new FileInputStream(fileW)));
    }

    @Override // defpackage.oeh
    public final OutputStream b(Uri uri) throws IOException {
        File fileW = n3d.w(uri);
        m93.w(fileW);
        return new jeh(a.e(new FileOutputStream(fileW), fileW), fileW);
    }

    @Override // defpackage.oeh
    public final void c(Uri uri) throws IOException {
        File fileW = n3d.w(uri);
        if (fileW.isDirectory()) {
            throw new FileNotFoundException(String.format("%s is a directory", uri));
        }
        if (fileW.delete()) {
            return;
        }
        if (!fileW.exists()) {
            throw new FileNotFoundException(String.format("%s does not exist", uri));
        }
        throw new IOException(String.format("%s could not be deleted", uri));
    }

    @Override // defpackage.oeh
    public final String d() {
        return "file";
    }

    @Override // defpackage.oeh
    public final void e(Uri uri, Uri uri2) throws IOException {
        File fileW = n3d.w(uri);
        File fileW2 = n3d.w(uri2);
        m93.w(fileW2);
        if (!fileW.renameTo(fileW2)) {
            throw new IOException(String.format("%s could not be renamed to %s", uri, uri2));
        }
    }
}
