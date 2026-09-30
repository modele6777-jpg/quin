package io.sentry;

import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class e {
    public static void a(HashMap map, String str, io.sentry.internal.debugmeta.c cVar, String str2, z0 z0Var) {
        Object obj = map.get(str);
        cVar.q(str2);
        cVar.w(z0Var, obj);
    }

    public static void b(ConcurrentHashMap concurrentHashMap, String str, io.sentry.internal.debugmeta.c cVar, String str2, z0 z0Var) throws IOException {
        Object obj = concurrentHashMap.get(str);
        cVar.q(str2);
        cVar.w(z0Var, obj);
    }
}
