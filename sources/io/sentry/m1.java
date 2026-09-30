package io.sentry;

import java.io.BufferedInputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface m1 {
    void a(Writer writer, Object obj);

    Object b(Reader reader, Class cls);

    io.sentry.internal.debugmeta.c c(BufferedInputStream bufferedInputStream);

    String d(Map map);

    void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream);
}
