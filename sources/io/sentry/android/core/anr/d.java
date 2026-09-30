package io.sentry.android.core.anr;

import io.sentry.cache.tape.i;
import io.sentry.hints.j;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.z0;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d implements AutoCloseable {
    public final io.sentry.cache.tape.f a;

    public d(q6 q6Var, File file) {
        i iVar;
        z0 logger = q6Var.getLogger();
        try {
            try {
                RandomAccessFile randomAccessFileX = i.x(file, true);
                try {
                    iVar = new i(file, randomAccessFileX, 120, true);
                } catch (Throwable th) {
                    randomAccessFileX.close();
                    throw th;
                }
            } catch (IOException e) {
                logger.d(q5.ERROR, "Failed to create stacktrace queue", e);
                iVar = null;
            }
        } catch (IOException unused) {
            if (!file.delete()) {
                throw new IOException("Could not delete file");
            }
            RandomAccessFile randomAccessFileX2 = i.x(file, true);
            try {
                iVar = new i(file, randomAccessFileX2, 120, true);
            } catch (Throwable th2) {
                randomAccessFileX2.close();
                throw th2;
            }
        }
        if (iVar == null) {
            this.a = new io.sentry.cache.tape.b();
        } else {
            this.a = new io.sentry.cache.tape.d(iVar, new j());
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
