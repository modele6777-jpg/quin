package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.rx0;
import io.sentry.g5;
import io.sentry.h5;
import io.sentry.i5;
import io.sentry.p5;
import io.sentry.q5;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class j2 implements m0 {
    public final SentryAndroidOptions a;
    public final d1 b;
    public final Context c;

    public j2(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.a = sentryAndroidOptions;
        this.b = new d1(sentryAndroidOptions);
        this.c = context;
    }

    @Override // io.sentry.android.core.m0
    public final int a() {
        return 5;
    }

    @Override // io.sentry.android.core.m0
    public final Long b() {
        return io.sentry.android.core.cache.b.j(this.a, "last_tombstone_report", "Tombstone");
    }

    @Override // io.sentry.android.core.m0
    public final String c() {
        return "Tombstone";
    }

    @Override // io.sentry.android.core.m0
    public final boolean d() {
        return this.a.isReportHistoricalTombstones();
    }

    @Override // io.sentry.android.core.m0
    public final io.sentry.n e(ApplicationExitInfo applicationExitInfo, boolean z) {
        SentryAndroidOptions sentryAndroidOptions = this.a;
        try {
            boolean zIsAttachRawTombstone = sentryAndroidOptions.isAttachRawTombstone();
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    sentryAndroidOptions.getLogger().i(q5.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                    if (traceInputStream == null) {
                        return null;
                    }
                    traceInputStream.close();
                    return null;
                }
                byte[] bArrV = zIsAttachRawTombstone ? io.sentry.config.a.v(traceInputStream) : null;
                io.sentry.android.core.internal.tombstone.b bVar = new io.sentry.android.core.internal.tombstone.b(zIsAttachRawTombstone ? new ByteArrayInputStream(bArrV) : traceInputStream, sentryAndroidOptions.getInAppIncludes(), sentryAndroidOptions.getInAppExcludes(), this.c.getApplicationInfo().nativeLibraryDir);
                try {
                    i5 i5VarL = bVar.l();
                    bVar.close();
                    traceInputStream.close();
                    long timestamp = applicationExitInfo.getTimestamp();
                    i5VarL.E0 = new Date(timestamp);
                    i2 i2Var = new i2(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z);
                    io.sentry.l0 l0VarF = io.sentry.util.b.f(i2Var);
                    if (bArrV != null) {
                        l0VarF.g = new io.sentry.a("tombstone.pb", "application/x-protobuf", bArrV);
                    }
                    try {
                        i5 i5VarF = f(timestamp, i5VarL, l0VarF);
                        if (i5VarF != null) {
                            i5VarL = i5VarF;
                        }
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().i(q5.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th.getMessage());
                    }
                    return new io.sentry.n(i5VarL, l0VarF, i2Var, 1);
                } catch (Throwable th2) {
                    try {
                        bVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                if (traceInputStream == null) {
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
            sentryAndroidOptions.getLogger().i(q5.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th6.getMessage());
            return null;
        }
        sentryAndroidOptions.getLogger().i(q5.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th6.getMessage());
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018d  */
    /* JADX WARN: Code duplicated, block: B:247:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final i5 f(long j, i5 i5Var, io.sentry.l0 l0Var) {
        i5 i5Var2;
        boolean z;
        File[] fileArr;
        String name;
        c1 c1Var;
        c1 c1VarA;
        int i;
        String string;
        io.sentry.n nVar;
        String str;
        d1 d1Var = this.b;
        ArrayList arrayList = (ArrayList) d1Var.c;
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) d1Var.b;
        int i2 = 0;
        if (d1Var.a) {
            i5Var2 = null;
        } else {
            boolean z2 = true;
            d1Var.a = true;
            String outboxPath = sentryAndroidOptions.getOutboxPath();
            if (outboxPath == null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Outbox path is null, skipping native event collection.", new Object[0]);
            } else {
                File[] fileArrListFiles = new File(outboxPath).listFiles();
                if (fileArrListFiles == null) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Outbox path is not a directory or an I/O error occurred: %s", outboxPath);
                } else if (fileArrListFiles.length == 0) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "No envelope files found in outbox.", new Object[0]);
                } else {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Scanning %d files in outbox for native events.", Integer.valueOf(fileArrListFiles.length));
                    int length = fileArrListFiles.length;
                    int i3 = 0;
                    while (i3 < length) {
                        File file = fileArrListFiles[i3];
                        if (!file.isFile() || (name = file.getName()) == null || name.startsWith("session") || name.startsWith("previous_session") || name.startsWith("startup_crash")) {
                            z = z2;
                            fileArr = fileArrListFiles;
                        } else {
                            try {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                                int i4 = i2;
                                do {
                                    try {
                                        i = bufferedInputStream.read();
                                        c1Var = null;
                                        if (i == -1) {
                                            if (i4 > 0) {
                                                break;
                                            }
                                            i4 = -1;
                                            break;
                                        }
                                        i4++;
                                    } catch (Throwable th) {
                                        th = th;
                                        z = z2;
                                        fileArr = fileArrListFiles;
                                        c1Var = null;
                                    }
                                } while (i != 10);
                                if (i4 < 0) {
                                    try {
                                        bufferedInputStream.close();
                                        z = z2;
                                        fileArr = fileArrListFiles;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        z = z2;
                                        fileArr = fileArrListFiles;
                                        sentryAndroidOptions.getLogger().c(q5.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                    }
                                } else {
                                    boolean z3 = z2;
                                    fileArr = fileArrListFiles;
                                    long j2 = i4;
                                    while (true) {
                                        if (j2 < 209715200) {
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                z = z3;
                                                while (true) {
                                                    try {
                                                        int i5 = bufferedInputStream.read();
                                                        if (i5 == -1) {
                                                            if (sb.length() <= 0) {
                                                                string = null;
                                                                break;
                                                            }
                                                            string = sb.toString();
                                                            break;
                                                        }
                                                        if (i5 == 10) {
                                                            string = sb.toString();
                                                            break;
                                                        }
                                                        sb.append((char) i5);
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        Throwable th4 = th;
                                                        try {
                                                            bufferedInputStream.close();
                                                        } catch (Throwable th5) {
                                                            th4.addSuppressed(th5);
                                                        }
                                                        throw th4;
                                                    }
                                                }
                                                if (string != null && !string.isEmpty()) {
                                                    long length2 = j2 + ((long) (string.length() + 1));
                                                    rx0 rx0VarC = d1Var.c(string);
                                                    if (rx0VarC != null) {
                                                        int i6 = rx0VarC.b;
                                                        if ("event".equals(rx0VarC.a)) {
                                                            c1VarA = d1Var.a(bufferedInputStream, i6, file);
                                                            if (c1VarA != null) {
                                                                try {
                                                                    bufferedInputStream.close();
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    sentryAndroidOptions.getLogger().c(q5.DEBUG, th, "Error extracting metadata from envelope file: %s", file.getAbsolutePath());
                                                                    c1VarA = c1Var;
                                                                    if (c1VarA != null) {
                                                                        arrayList.add(c1VarA);
                                                                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(c1VarA.b));
                                                                    }
                                                                    i3++;
                                                                    fileArrListFiles = fileArr;
                                                                    z2 = z;
                                                                    i2 = 0;
                                                                }
                                                            }
                                                            if (c1VarA != null) {
                                                                arrayList.add(c1VarA);
                                                                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(c1VarA.b));
                                                            }
                                                        } else {
                                                            d1.d(bufferedInputStream, i6);
                                                        }
                                                        long j3 = length2 + ((long) i6);
                                                        int i7 = bufferedInputStream.read();
                                                        if (i7 != -1) {
                                                            j2 = j3 + 1;
                                                            if (i7 == 10) {
                                                                z3 = z;
                                                            }
                                                        }
                                                    }
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                z = z3;
                                            }
                                        } else {
                                            z = z3;
                                        }
                                        bufferedInputStream.close();
                                    }
                                }
                            } catch (Throwable th8) {
                                th = th8;
                                z = z2;
                                fileArr = fileArrListFiles;
                                c1Var = null;
                            }
                            c1VarA = c1Var;
                            if (c1VarA != null) {
                                arrayList.add(c1VarA);
                                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Found native event in outbox: %s (timestamp: %d)", file.getName(), Long.valueOf(c1VarA.b));
                            }
                        }
                        i3++;
                        fileArrListFiles = fileArr;
                        z2 = z;
                        i2 = 0;
                    }
                    i5Var2 = null;
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Collected %d native events from outbox.", Integer.valueOf(arrayList.size()));
                }
            }
            i5Var2 = null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (it.hasNext()) {
                c1 c1Var2 = (c1) it.next();
                long jAbs = Math.abs(j - c1Var2.b);
                if (jAbs <= 5000) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Matched native event by timestamp (diff: %d ms)", Long.valueOf(jAbs));
                    arrayList.remove(c1Var2);
                    File file2 = c1Var2.a;
                    try {
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file2));
                        try {
                            io.sentry.internal.debugmeta.c cVarA = sentryAndroidOptions.getEnvelopeReader().a(bufferedInputStream2);
                            if (cVarA != null) {
                                Iterator it2 = ((Iterable) cVarA.c).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        g5 g5Var = (g5) it2.next();
                                        if (p5.Event.equals(g5Var.a.e)) {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g5Var.g()), StandardCharsets.UTF_8));
                                            try {
                                                i5 i5Var3 = (i5) sentryAndroidOptions.getSerializer().b(bufferedReader, i5.class);
                                                if (i5Var3 != null && "native".equals(i5Var3.v)) {
                                                    io.sentry.n nVar2 = new io.sentry.n(i5Var3, file2, cVarA, 2);
                                                    bufferedReader.close();
                                                    bufferedInputStream2.close();
                                                    nVar = nVar2;
                                                    break;
                                                }
                                                bufferedReader.close();
                                            } catch (Throwable th9) {
                                                try {
                                                    bufferedReader.close();
                                                    throw th9;
                                                } catch (Throwable th10) {
                                                    th9.addSuppressed(th10);
                                                    throw th9;
                                                }
                                            }
                                            try {
                                                bufferedInputStream2.close();
                                                throw th;
                                            } catch (Throwable th11) {
                                                th.addSuppressed(th11);
                                                throw th;
                                            }
                                        }
                                    }
                                }
                            }
                            bufferedInputStream2.close();
                        } catch (Throwable th12) {
                            bufferedInputStream2.close();
                            throw th12;
                        }
                    } catch (Throwable th13) {
                        sentryAndroidOptions.getLogger().c(q5.DEBUG, th13, "Error loading envelope file: %s", file2.getAbsolutePath());
                    }
                }
            }
            nVar = i5Var2;
            break;
        }
        SentryAndroidOptions sentryAndroidOptions2 = this.a;
        if (nVar == 0) {
            sentryAndroidOptions2.getLogger().i(q5.DEBUG, "No matching native event found for tombstone.", new Object[0]);
            return i5Var2;
        }
        File file3 = (File) nVar.c;
        io.sentry.z0 logger = sentryAndroidOptions2.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "Found matching native event for tombstone, removing from outbox: %s", file3.getName());
        try {
            if (!file3.delete()) {
                sentryAndroidOptions.getLogger().i(q5.WARNING, "Failed to delete native event file: %s", file3.getAbsolutePath());
                return i5Var2;
            }
            sentryAndroidOptions.getLogger().i(q5Var, "Deleted native event file from outbox: %s", file3.getName());
            i5 i5Var4 = (i5) nVar.b;
            ArrayList arrayListD = i5Var.d();
            io.sentry.protocol.f fVar = i5Var.Y;
            ArrayList arrayListE = i5Var.e();
            if (arrayListD != null && !arrayListD.isEmpty() && fVar != null && arrayListE != null) {
                io.sentry.protocol.o oVar = ((io.sentry.protocol.v) arrayListD.get(0)).f;
                if (oVar != null) {
                    oVar.a = io.sentry.android.core.internal.tombstone.a.TOMBSTONE_MERGED.getValue();
                }
                io.sentry.protocol.p pVar = i5Var4.F0;
                if (pVar == null || (str = pVar.b) == null || str.isEmpty()) {
                    i5Var4.F0 = i5Var.F0;
                }
                i5Var4.I0 = new io.sentry.h2(arrayListD);
                i5Var4.Y = fVar;
                i5Var4.H0 = new io.sentry.h2(arrayListE);
            }
            for (g5 g5Var2 : (Iterable) ((io.sentry.internal.debugmeta.c) nVar.d).c) {
                try {
                    h5 h5Var = g5Var2.a;
                    String str2 = h5Var.c;
                    if (h5Var.e == p5.Attachment && str2 != null) {
                        byte[] bArrG = g5Var2.g();
                        h5 h5Var2 = g5Var2.a;
                        try {
                            l0Var.b.add(new io.sentry.a(str2, h5Var2.a, h5Var2.v, bArrG));
                        } catch (Throwable th14) {
                            th = th14;
                            sentryAndroidOptions2.getLogger().i(q5.DEBUG, "Failed to process envelope item: %s", th.getMessage());
                        }
                    }
                } catch (Throwable th15) {
                    th = th15;
                }
            }
            return i5Var4;
        } catch (Throwable th16) {
            sentryAndroidOptions.getLogger().c(q5.ERROR, th16, "Error deleting native event file: %s", file3.getAbsolutePath());
        }
    }
}
