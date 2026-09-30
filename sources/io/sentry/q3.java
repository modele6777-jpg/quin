package io.sentry;

import java.io.File;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q3 {
    public final io.sentry.protocol.w a;
    public final io.sentry.protocol.w b;
    public final ConcurrentHashMap c;
    public final File d;
    public final double e;
    public String f;

    public q3(io.sentry.protocol.w wVar, io.sentry.protocol.w wVar2, HashMap map, File file, z4 z4Var) {
        this.a = wVar;
        this.b = wVar2;
        this.c = new ConcurrentHashMap(map);
        this.d = file;
        this.e = z4Var.d() / 1.0E9d;
    }
}
