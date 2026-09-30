package io.sentry.instrumentation.file;

import java.io.File;
import java.io.InputStreamReader;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends InputStreamReader {
    public f(String str) {
        super(new d(d.b(new File(str), null)));
    }
}
