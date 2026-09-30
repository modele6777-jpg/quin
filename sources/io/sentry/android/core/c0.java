package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import io.sentry.i5;
import io.sentry.q5;
import io.sentry.w3;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements m0 {
    public final SentryAndroidOptions a;

    public c0(SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
    }

    @Override // io.sentry.android.core.m0
    public final int a() {
        return 6;
    }

    @Override // io.sentry.android.core.m0
    public final Long b() {
        return io.sentry.android.core.cache.b.j(this.a, "last_anr_report", "ANR");
    }

    @Override // io.sentry.android.core.m0
    public final String c() {
        return "ANR";
    }

    @Override // io.sentry.android.core.m0
    public final boolean d() {
        return this.a.isReportHistoricalAnrs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.sentry.android.core.m0
    public final io.sentry.n e(ApplicationExitInfo applicationExitInfo, boolean z) {
        w3 w3Var;
        byte[] bArr;
        SentryAndroidOptions sentryAndroidOptions = this.a;
        long timestamp = applicationExitInfo.getTimestamp();
        boolean z2 = applicationExitInfo.getImportance() != 100;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == 0) {
                    w3Var = new w3(d0.NO_DUMP);
                    if (traceInputStream != 0) {
                        traceInputStream = traceInputStream;
                        traceInputStream.close();
                        traceInputStream = traceInputStream;
                    }
                } else {
                    byte[] bArrV = io.sentry.config.a.v(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArrV)));
                        try {
                            ArrayList arrayList = new ArrayList();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line == null) {
                                    break;
                                }
                                io.sentry.android.core.internal.threaddump.a aVar = new io.sentry.android.core.internal.threaddump.a();
                                aVar.a = line;
                                arrayList.add(aVar);
                            }
                            io.sentry.android.core.internal.threaddump.b bVar = new io.sentry.android.core.internal.threaddump.b(arrayList);
                            io.sentry.android.core.internal.threaddump.c cVar = new io.sentry.android.core.internal.threaddump.c(sentryAndroidOptions, z2);
                            cVar.d(bVar);
                            ArrayList arrayList2 = cVar.f;
                            ArrayList arrayList3 = new ArrayList(cVar.e.values());
                            io.sentry.protocol.c cVar2 = (io.sentry.protocol.c) cVar.g.b;
                            if (arrayList2.isEmpty()) {
                                w3Var = new w3(d0.NO_DUMP);
                                bufferedReader.close();
                                traceInputStream = bufferedReader;
                            } else {
                                w3 w3Var2 = new w3(d0.DUMP, bArrV, arrayList2, arrayList3, cVar2);
                                bufferedReader.close();
                                w3Var = w3Var2;
                                traceInputStream = bufferedReader;
                            }
                        } catch (Throwable th) {
                            try {
                                bufferedReader.close();
                                throw th;
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                                throw th;
                            }
                        }
                    } catch (Throwable th3) {
                        sentryAndroidOptions.getLogger().d(q5.WARNING, "Failed to parse ANR thread dump", th3);
                        d0 d0Var = d0.ERROR;
                        w3Var = new w3(d0Var, bArrV);
                        traceInputStream = d0Var;
                    }
                }
                traceInputStream = traceInputStream;
            } catch (Throwable th4) {
                if (traceInputStream == 0) {
                    throw th4;
                }
                try {
                    traceInputStream.close();
                    throw th4;
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                    throw th4;
                }
            }
        } catch (Throwable th6) {
            sentryAndroidOptions.getLogger().d(q5.WARNING, "Failed to read ANR thread dump", th6);
            w3Var = new w3(d0.NO_DUMP);
        }
        d0 d0Var2 = (d0) w3Var.b;
        if (d0Var2 == d0.NO_DUMP) {
            sentryAndroidOptions.getLogger().i(q5.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
            return null;
        }
        b0 b0Var = new b0(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z, z2);
        io.sentry.l0 l0VarF = io.sentry.util.b.f(b0Var);
        i5 i5Var = new i5();
        if (d0Var2 == d0.ERROR) {
            io.sentry.protocol.p pVar = new io.sentry.protocol.p();
            pVar.a = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
            i5Var.F0 = pVar;
        } else if (d0Var2 == d0.DUMP) {
            i5Var.H0 = new io.sentry.h2((ArrayList) w3Var.d);
            ArrayList arrayList4 = (ArrayList) w3Var.a;
            if (arrayList4 != null) {
                io.sentry.protocol.f fVar = new io.sentry.protocol.f();
                fVar.b(arrayList4);
                i5Var.Y = fVar;
            }
            io.sentry.protocol.c cVar3 = (io.sentry.protocol.c) w3Var.e;
            if (cVar3 != null) {
                i5Var.b.l(cVar3, "art");
            }
        }
        i5Var.J0 = q5.FATAL;
        i5Var.E0 = new Date(timestamp);
        if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) w3Var.c) != null) {
            l0VarF.f = new io.sentry.a("thread-dump.txt", "text/plain", bArr);
        }
        return new io.sentry.n(i5Var, l0VarF, b0Var, 1);
    }
}
