package io.sentry.android.replay.capture;

import defpackage.xag;
import io.sentry.e1;
import io.sentry.g4;
import java.io.IOException;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class v implements g4, io.sentry.util.e {
    public final /* synthetic */ int a;

    public /* synthetic */ v(int i) {
        this.a = i;
    }

    public static /* synthetic */ void a(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void b(Object obj, String str) throws IOException {
        throw new IOException(str + obj);
    }

    @Override // io.sentry.util.e
    public Object c() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (io.sentry.clientreport.d dVar : io.sentry.clientreport.d.values()) {
            for (io.sentry.p pVar : io.sentry.p.values()) {
                concurrentHashMap.put(new io.sentry.clientreport.c(dVar.getReason(), pVar.getCategory()), new AtomicLong(0L));
            }
        }
        return Collections.unmodifiableMap(concurrentHashMap);
    }

    @Override // io.sentry.g4
    public void g(e1 e1Var) {
        switch (this.a) {
            case 0:
                e1Var.getClass();
                e1Var.n(io.sentry.protocol.w.b);
                break;
            default:
                e1Var.G(new xag(18, e1Var));
                break;
        }
    }
}
