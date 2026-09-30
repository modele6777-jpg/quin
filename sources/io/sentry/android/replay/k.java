package io.sentry.android.replay;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ace;
import defpackage.cgg;
import defpackage.el2;
import defpackage.iy9;
import defpackage.mmb;
import defpackage.ne5;
import defpackage.ox1;
import defpackage.s72;
import defpackage.td0;
import defpackage.v4e;
import defpackage.x72;
import defpackage.ym8;
import io.sentry.q5;
import io.sentry.q6;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class k implements Closeable {
    public final q6 a;
    public final io.sentry.protocol.w b;
    public final AtomicBoolean c;
    public final io.sentry.util.a d;
    public final io.sentry.util.a e;
    public final io.sentry.util.a f;
    public io.sentry.android.replay.video.e g;
    public final ace v;
    public final ArrayList w;
    public final LinkedHashMap x;
    public final ace y;

    public k(q6 q6Var, io.sentry.protocol.w wVar) {
        q6Var.getClass();
        wVar.getClass();
        this.a = q6Var;
        this.b = wVar;
        this.c = new AtomicBoolean(false);
        this.d = new io.sentry.util.a();
        this.e = new io.sentry.util.a();
        this.f = new io.sentry.util.a();
        this.v = new ace(new i(this));
        this.w = new ArrayList();
        this.x = new LinkedHashMap();
        this.y = new ace(new h(this));
    }

    public final void b(File file, String str, long j) {
        l lVar = new l(file, str, j);
        io.sentry.util.a aVar = this.f;
        aVar.b();
        try {
            this.w.add(lVar);
            cgg.t(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        AtomicBoolean atomicBoolean = this.c;
        try {
            try {
                io.sentry.util.a aVar = this.d;
                if (!aVar.h().tryLock(2000L, TimeUnit.MILLISECONDS)) {
                    aVar = null;
                }
                if (aVar == null) {
                    this.a.getLogger().i(q5.WARNING, "Timed out waiting for the video encoder, skipping its release to not block the caller", new Object[0]);
                } else {
                    try {
                        io.sentry.android.replay.video.e eVar = this.g;
                        if (eVar != null) {
                            eVar.c();
                        }
                        this.g = null;
                        cgg.t(aVar, null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            cgg.t(aVar, th);
                            throw th2;
                        }
                    }
                }
                atomicBoolean.set(true);
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
                atomicBoolean.set(true);
            }
        } catch (Throwable th3) {
            atomicBoolean.set(true);
            throw th3;
        }
    }

    public final void h(File file) {
        q6 q6Var = this.a;
        try {
            if (file.delete()) {
                return;
            }
            q6Var.getLogger().i(q5.ERROR, "Failed to delete replay frame: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            q6Var.getLogger().c(q5.ERROR, th, "Failed to delete replay frame: %s", file.getAbsolutePath());
        }
    }

    public final File l() {
        return (File) this.v.getValue();
    }

    public final void u(String str, String str2) {
        File file;
        File file2;
        ace aceVar = this.y;
        LinkedHashMap linkedHashMap = this.x;
        str.getClass();
        io.sentry.util.a aVar = this.e;
        aVar.b();
        try {
            if (this.c.get()) {
                cgg.t(aVar, null);
                return;
            }
            File file3 = (File) aceVar.getValue();
            if ((file3 == null || !file3.exists()) && (file = (File) aceVar.getValue()) != null) {
                file.createNewFile();
            }
            if (linkedHashMap.isEmpty() && (file2 = (File) aceVar.getValue()) != null) {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2), ox1.a), UserMetadata.MAX_INTERNAL_KEY_SIZE);
                try {
                    Iterator it = new el2(new td0(2, bufferedReader)).iterator();
                    while (it.hasNext()) {
                        List listC0 = v4e.c0((String) it.next(), new String[]{"="}, 2);
                        iy9 iy9Var = new iy9((String) listC0.get(0), (String) listC0.get(1));
                        linkedHashMap.put(iy9Var.d(), iy9Var.e());
                    }
                    bufferedReader.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        ym8.t(bufferedReader, th);
                        throw th2;
                    }
                }
            }
            if (str2 == null) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, str2);
            }
            File file4 = (File) aceVar.getValue();
            if (file4 != null) {
                Set setEntrySet = linkedHashMap.entrySet();
                setEntrySet.getClass();
                ne5.d0(file4, s72.D0(setEntrySet, "\n", null, null, b.c, 30));
            }
            cgg.t(aVar, null);
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                cgg.t(aVar, th3);
                throw th4;
            }
        }
    }

    public final String x(long j) {
        mmb mmbVar = new mmb();
        io.sentry.util.a aVar = this.f;
        aVar.b();
        try {
            x72.i0(new j(j, this, mmbVar), this.w);
            cgg.t(aVar, null);
            return (String) mmbVar.element;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }
}
