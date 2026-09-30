package io.sentry.cache;

import com.adjust.sdk.Constants;
import defpackage.xag;
import io.sentry.android.core.d2;
import io.sentry.android.core.i2;
import io.sentry.b5;
import io.sentry.b7;
import io.sentry.c7;
import io.sentry.g5;
import io.sentry.hints.i;
import io.sentry.hints.j;
import io.sentry.l0;
import io.sentry.m1;
import io.sentry.o7;
import io.sentry.p5;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.y4;
import io.sentry.z0;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class c implements d {
    public static final Charset w = Charset.forName(Constants.ENCODING);
    public final q6 a;
    public final io.sentry.d c;
    public final int d;
    public final io.sentry.util.f b = new io.sentry.util.f(new xag(15, this));
    public final WeakHashMap f = new WeakHashMap();
    public final io.sentry.util.a g = new io.sentry.util.a();
    public final io.sentry.util.a v = new io.sentry.util.a();
    public final CountDownLatch e = new CountDownLatch(1);

    public c(q6 q6Var, String str, int i) {
        this.a = q6Var;
        this.c = new io.sentry.d(str);
        this.d = i;
    }

    @Override // io.sentry.cache.d
    public final void F0(io.sentry.internal.debugmeta.c cVar) {
        io.sentry.util.b.r(cVar, "Envelope is required.");
        File fileC = c(cVar);
        boolean zDelete = fileC.delete();
        q6 q6Var = this.a;
        if (zDelete) {
            q6Var.getLogger().i(q5.DEBUG, "Discarding envelope from cache: %s", fileC.getAbsolutePath());
        } else {
            q6Var.getLogger().i(q5.DEBUG, "Envelope was not cached or could not be deleted: %s", fileC.getAbsolutePath());
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0065  */
    /* JADX WARN: Code duplicated, block: B:196:0x046b  */
    /* JADX WARN: Code duplicated, block: B:41:0x00dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v10 */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v28 */
    /* JADX WARN: Type inference failed for: r15v3 */
    /* JADX WARN: Type inference failed for: r15v4 */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // io.sentry.cache.d
    public boolean N(io.sentry.internal.debugmeta.c cVar, l0 l0Var) {
        ?? r15;
        ?? r16;
        boolean z;
        Throwable th;
        boolean z2;
        Date date;
        boolean z3;
        ?? r9;
        File[] fileArr;
        int i;
        io.sentry.util.f fVar;
        c7 c7VarF;
        Boolean bool;
        String str;
        int i2;
        g5 g5VarE;
        c7 c7VarF2;
        io.sentry.util.b.r(cVar, "Envelope is required.");
        io.sentry.d dVar = this.c;
        File file = (File) dVar.b;
        io.sentry.util.b.e(file);
        String absolutePath = file.getAbsolutePath();
        File[] fileArrA = a();
        int length = fileArrA.length;
        io.sentry.util.f fVar2 = this.b;
        q6 q6Var = this.a;
        int i3 = this.d;
        if (length >= i3) {
            String str2 = "Cache folder if full (respecting maxSize). Rotating files";
            q6Var.getLogger().i(q5.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i4 = (length - i3) + 1;
            if (fileArrA.length > 1) {
                Arrays.sort(fileArrA, new d2(2));
            }
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArrA, i4, length);
            int i5 = 0;
            r16 = str2;
            while (i5 < i4) {
                File file2 = fileArrA[i5];
                io.sentry.internal.debugmeta.c cVarE = e(file2);
                String str3 = "File can't be deleted: %s";
                if (cVarE == null) {
                    fileArr = fileArrA;
                    i = i4;
                    fVar = fVar2;
                    q6Var = q6Var;
                    break;
                }
                Iterable iterable = (Iterable) cVarE.c;
                if (iterable.iterator().hasNext()) {
                    fileArr = fileArrA;
                    q6Var.getClientReportRecorder().e(io.sentry.clientreport.d.CACHE_OVERFLOW, cVarE);
                    Iterator it = iterable.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            c7VarF = null;
                            break;
                        }
                        g5 g5Var = (g5) it.next();
                        if (g5Var == null ? false : g5Var.a.e.equals(p5.Session)) {
                            c7VarF = f(g5Var);
                            break;
                        }
                    }
                    if (c7VarF != null) {
                        String str4 = c7VarF.e;
                        if (c7VarF.g.equals(b7.Ok) && str4 != null && (bool = c7VarF.f) != null && bool.booleanValue()) {
                            int length2 = fileArr2.length;
                            int i6 = 0;
                            while (true) {
                                if (i6 < length2) {
                                    i = i4;
                                    File file3 = fileArr2[i6];
                                    fVar = fVar2;
                                    io.sentry.internal.debugmeta.c cVarE2 = e(file3);
                                    if (cVarE2 != null) {
                                        Iterable iterable2 = (Iterable) cVarE2.c;
                                        if (iterable2.iterator().hasNext()) {
                                            Iterator it2 = iterable2.iterator();
                                            while (true) {
                                                if (!it2.hasNext()) {
                                                    str = str4;
                                                    length2 = length2;
                                                    q6Var = q6Var;
                                                    i2 = i6;
                                                    g5VarE = null;
                                                    break;
                                                }
                                                it2 = it2;
                                                g5 g5Var2 = (g5) it2.next();
                                                if ((g5Var2 == null ? false : g5Var2.a.e.equals(p5.Session)) && (c7VarF2 = f(g5Var2)) != null) {
                                                    String str5 = c7VarF2.e;
                                                    i2 = i6;
                                                    if (c7VarF2.g.equals(b7.Ok) && str5 != null) {
                                                        Boolean bool2 = c7VarF2.f;
                                                        if (bool2 != null && bool2.booleanValue()) {
                                                            q6Var.getLogger().i(q5.ERROR, "Session %s has 2 times the init flag.", str4);
                                                            break;
                                                        }
                                                        if (str4 != null && str4.equals(str5)) {
                                                            c7VarF2.f = Boolean.TRUE;
                                                            try {
                                                                g5VarE = g5.e((m1) fVar.a(), c7VarF2);
                                                                try {
                                                                    it2.remove();
                                                                    str = str4;
                                                                    break;
                                                                } catch (IOException e) {
                                                                    e = e;
                                                                    str = str4;
                                                                    q6Var.getLogger().c(q5.ERROR, e, "Failed to create new envelope item for the session %s", str);
                                                                    g5VarE = g5VarE;
                                                                    break;
                                                                }
                                                            } catch (IOException e2) {
                                                                e = e2;
                                                                g5VarE = null;
                                                            }
                                                        }
                                                    }
                                                    i6 = i2;
                                                    str4 = str4;
                                                }
                                            }
                                            if (g5VarE != null) {
                                                ArrayList arrayList = new ArrayList();
                                                Iterator it3 = iterable2.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList.add((g5) it3.next());
                                                }
                                                arrayList.add(g5VarE);
                                                io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c((b5) cVarE2.b, arrayList);
                                                long jLastModified = file3.lastModified();
                                                if (!file3.delete()) {
                                                    q6Var.getLogger().i(q5.WARNING, "File can't be deleted: %s", file3.getAbsolutePath());
                                                }
                                                try {
                                                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                                                    try {
                                                        ((m1) fVar.a()).e(cVar2, fileOutputStream);
                                                        file3.setLastModified(jLastModified);
                                                        fileOutputStream.close();
                                                        break;
                                                    } catch (Throwable th2) {
                                                        try {
                                                            fileOutputStream.close();
                                                        } catch (Throwable th3) {
                                                            th2.addSuppressed(th3);
                                                        }
                                                        throw th2;
                                                    }
                                                } catch (Throwable th4) {
                                                    q6Var.getLogger().d(q5.ERROR, "Failed to serialize the new envelope to the disk.", th4);
                                                    break;
                                                }
                                            }
                                        } else {
                                            str = str4;
                                            length2 = length2;
                                            q6Var = q6Var;
                                            i2 = i6;
                                        }
                                    } else {
                                        str = str4;
                                        length2 = length2;
                                        q6Var = q6Var;
                                        i2 = i6;
                                    }
                                    i6 = i2 + 1;
                                    i4 = i;
                                    fVar2 = fVar;
                                    length2 = length2;
                                    q6Var = q6Var;
                                    str4 = str;
                                }
                            }
                        }
                    }
                } else {
                    fileArr = fileArrA;
                }
                i = i4;
                fVar = fVar2;
                q6Var = q6Var;
                break;
                if (!file2.delete()) {
                    q6Var.getLogger().i(q5.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                }
                i5++;
                fileArrA = fileArr;
                i4 = i;
                fVar2 = fVar;
                q6Var = q6Var;
                r16 = str3;
            }
        }
        io.sentry.util.f fVar3 = fVar2;
        q6 q6Var2 = q6Var;
        File file4 = new File(absolutePath, "session.json");
        File file5 = new File(absolutePath, "previous_session.json");
        if (io.sentry.util.b.j(l0Var, i.class) && !file4.delete()) {
            q6Var2.getLogger().i(q5.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        boolean zIsInstance = io.sentry.hints.a.class.isInstance(l0Var.b("sentry:typeCheckHint"));
        Charset charset = w;
        if (zIsInstance || io.sentry.hints.g.class.isInstance(l0Var.b("sentry:typeCheckHint"))) {
            Object objB = l0Var.b("sentry:typeCheckHint");
            File file6 = new File(((File) dVar.b).getAbsolutePath(), "previous_session.json");
            if (file6.exists()) {
                z0 logger = q6Var2.getLogger();
                q5 q5Var = q5.WARNING;
                logger.i(q5Var, "Previous session is not ended, we'd need to end it.", new Object[0]);
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file6), charset));
                        try {
                            c7 c7Var = (c7) ((m1) fVar3.a()).b(bufferedReader, c7.class);
                            if (c7Var != null) {
                                Date date2 = c7Var.a;
                                try {
                                    if (objB instanceof io.sentry.hints.a) {
                                        io.sentry.hints.a aVar = (io.sentry.hints.a) objB;
                                        Long lB = aVar.b();
                                        if (lB != null) {
                                            date = new Date(lB.longValue());
                                            if (date.before(date2)) {
                                                q6Var2.getLogger().i(q5Var, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                                                bufferedReader.close();
                                                r15 = 1;
                                            }
                                        } else {
                                            date = null;
                                        }
                                        c7Var.c(b7.Abnormal, null, true, aVar.e());
                                        z = true;
                                        c7Var.b(date);
                                        i(file6, c7Var);
                                        z2 = z;
                                    } else {
                                        if (objB instanceof io.sentry.hints.g) {
                                            date = new Date(((i2) ((io.sentry.hints.g) objB)).d);
                                            if (date.before(date2)) {
                                                q6Var2.getLogger().i(q5Var, "Native crash exit happened before previous session start, not ending the session.", new Object[0]);
                                                bufferedReader.close();
                                                r15 = 1;
                                            } else {
                                                z = true;
                                                z = true;
                                                try {
                                                    c7Var.c(b7.Crashed, null, true, null);
                                                } catch (Throwable th5) {
                                                    th = th5;
                                                    th = th;
                                                    r16 = z;
                                                    bufferedReader.close();
                                                    throw th;
                                                }
                                            }
                                            th = th;
                                            r16 = z;
                                            try {
                                                bufferedReader.close();
                                                throw th;
                                            } catch (Throwable th6) {
                                                th.addSuppressed(th6);
                                                throw th;
                                            }
                                        }
                                        z = true;
                                        date = null;
                                        c7Var.b(date);
                                        i(file6, c7Var);
                                        z2 = z;
                                    }
                                } catch (Throwable th7) {
                                    th = th7;
                                    r16 = 1;
                                    bufferedReader.close();
                                    throw th;
                                }
                            } else {
                                z2 = true;
                            }
                            bufferedReader.close();
                            r15 = z2;
                        } catch (Throwable th8) {
                            th = th8;
                            z = true;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        r16 = 1;
                        q6Var2.getLogger().d(q5.ERROR, "Error processing previous session.", th);
                        r15 = r16;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    q6Var2.getLogger().d(q5.ERROR, "Error processing previous session.", th);
                    r15 = r16;
                }
            } else {
                r15 = 1;
                q6Var2.getLogger().i(q5.DEBUG, "No previous session file to end.", new Object[0]);
            }
        } else {
            r15 = 1;
        }
        if (j.class.isInstance(l0Var.b("sentry:typeCheckHint"))) {
            d(file4, file5);
            Iterable iterable3 = (Iterable) cVar.c;
            if (iterable3.iterator().hasNext()) {
                g5 g5Var3 = (g5) iterable3.iterator().next();
                p5 p5Var = p5.Session;
                p5 p5Var2 = g5Var3.a.e;
                if (p5Var.equals(p5Var2)) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g5Var3.g()), charset));
                        try {
                            c7 c7Var2 = (c7) ((m1) fVar3.a()).b(bufferedReader2, c7.class);
                            if (c7Var2 == null) {
                                q6Var2.getLogger().i(q5.ERROR, "Item of type %s returned null by the parser.", p5Var2);
                            } else {
                                i(file4, c7Var2);
                            }
                            bufferedReader2.close();
                        } catch (Throwable th11) {
                            try {
                                bufferedReader2.close();
                                throw th11;
                            } catch (Throwable th12) {
                                th11.addSuppressed(th12);
                                throw th11;
                            }
                        }
                    } catch (Throwable th13) {
                        q6Var2.getLogger().d(q5.ERROR, "Item failed to process.", th13);
                    }
                } else {
                    q6Var2.getLogger().i(q5.INFO, "Current envelope has a different envelope type %s", p5Var2);
                }
            } else {
                q6Var2.getLogger().i(q5.INFO, "Current envelope %s is empty", file4.getAbsolutePath());
            }
            if (new File(q6Var2.getCacheDirPath(), ".sentry-native/last_crash").exists()) {
                z3 = false;
            } else {
                File file7 = new File(q6Var2.getCacheDirPath(), "last_crash");
                if (file7.exists()) {
                    z3 = false;
                    q6Var2.getLogger().i(q5.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file7.delete()) {
                        q6Var2.getLogger().i(q5.ERROR, "Failed to delete the crash marker file. %s.", file7.getAbsolutePath());
                    }
                } else {
                    z3 = false;
                }
            }
            y4.c.a();
            this.e.countDown();
        } else {
            z3 = false;
        }
        File fileC = c(cVar);
        if (fileC.exists()) {
            q6Var2.getLogger().i(q5.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileC.getAbsolutePath());
            return r15;
        }
        z0 logger2 = q6Var2.getLogger();
        q5 q5Var2 = q5.DEBUG;
        logger2.i(q5Var2, "Adding Envelope to offline storage: %s", fileC.getAbsolutePath());
        if (fileC.exists()) {
            q6Var2.getLogger().i(q5Var2, "Overwriting envelope to offline storage: %s", fileC.getAbsolutePath());
            if (!fileC.delete()) {
                q6Var2.getLogger().i(q5.ERROR, "Failed to delete: %s", fileC.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream2 = new FileOutputStream(fileC);
            try {
                ((m1) fVar3.a()).e(cVar, fileOutputStream2);
                fileOutputStream2.close();
                r9 = r15;
            } catch (Throwable th14) {
                try {
                    fileOutputStream2.close();
                    throw th14;
                } catch (Throwable th15) {
                    th14.addSuppressed(th15);
                    throw th14;
                }
            }
        } catch (Throwable th16) {
            q6Var2.getLogger().c(q5.ERROR, th16, "Error writing Envelope %s to offline storage", fileC.getAbsolutePath());
            r9 = z3;
        }
        if (o7.class.isInstance(l0Var.b("sentry:typeCheckHint"))) {
            try {
                FileOutputStream fileOutputStream3 = new FileOutputStream(new File(q6Var2.getCacheDirPath(), "last_crash"));
                try {
                    fileOutputStream3.write(io.sentry.vendor.a.f(new Date().getTime()).getBytes(charset));
                    fileOutputStream3.flush();
                    fileOutputStream3.close();
                } catch (Throwable th17) {
                    try {
                        fileOutputStream3.close();
                        throw th17;
                    } catch (Throwable th18) {
                        th17.addSuppressed(th18);
                        throw th17;
                    }
                }
            } catch (Throwable th19) {
                q6Var2.getLogger().d(q5.ERROR, "Error writing the crash marker file to the disk", th19);
            }
        }
        return r9;
    }

    public final File[] a() {
        io.sentry.d dVar = this.c;
        File file = (File) dVar.b;
        if (file.isDirectory() && file.canWrite() && file.canRead()) {
            File[] fileArrListFiles = ((File) dVar.b).listFiles(new b());
            if (fileArrListFiles != null) {
                return fileArrListFiles;
            }
        } else {
            this.a.getLogger().i(q5.ERROR, "The directory for caching files is inaccessible.: %s", file.getAbsolutePath());
        }
        return new File[0];
    }

    public final File c(io.sentry.internal.debugmeta.c cVar) {
        String str;
        WeakHashMap weakHashMap = this.f;
        io.sentry.util.a aVar = this.g;
        aVar.b();
        try {
            if (weakHashMap.containsKey(cVar)) {
                str = (String) weakHashMap.get(cVar);
            } else {
                String strConcat = io.sentry.config.a.j().concat(".envelope");
                weakHashMap.put(cVar, strConcat);
                str = strConcat;
            }
            File file = new File((File) this.c.b, str);
            aVar.close();
            return file;
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d(File file, File file2) {
        io.sentry.util.a aVar = this.v;
        aVar.b();
        try {
            if (!file.exists()) {
                aVar.close();
                return;
            }
            boolean zExists = file2.exists();
            q6 q6Var = this.a;
            if (zExists) {
                q6Var.getLogger().i(q5.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    q6Var.getLogger().i(q5.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            q6Var.getLogger().i(q5.INFO, "Moving current session to previous session.", new Object[0]);
            try {
                if (!file.renameTo(file2)) {
                    q6Var.getLogger().i(q5.WARNING, "Unable to move current session to previous session.", new Object[0]);
                }
            } catch (Throwable th) {
                q6Var.getLogger().d(q5.ERROR, "Error moving current session to previous session.", th);
            }
            aVar.close();
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final io.sentry.internal.debugmeta.c e(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                io.sentry.internal.debugmeta.c cVarC = ((m1) this.b.a()).c(bufferedInputStream);
                bufferedInputStream.close();
                return cVarC;
            } catch (Throwable th) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            this.a.getLogger().d(q5.ERROR, "Failed to deserialize the envelope.", e);
            return null;
        }
    }

    public final c7 f(g5 g5Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g5Var.g()), w));
            try {
                c7 c7Var = (c7) ((m1) this.b.a()).b(bufferedReader, c7.class);
                bufferedReader.close();
                return c7Var;
            } catch (Throwable th) {
                try {
                    bufferedReader.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Throwable th3) {
            this.a.getLogger().d(q5.ERROR, "Failed to deserialize the session.", th3);
            return null;
        }
    }

    public final boolean g() {
        q6 q6Var = this.a;
        try {
            return this.e.await(q6Var.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            q6Var.getLogger().i(q5.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public final void i(File file, c7 c7Var) {
        String str = c7Var.e;
        q6 q6Var = this.a;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, w));
                try {
                    q6Var.getLogger().i(q5.DEBUG, "Overwriting session to offline storage: %s", str);
                    ((m1) this.b.a()).a(bufferedWriter, c7Var);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (Throwable th5) {
            q6Var.getLogger().c(q5.ERROR, th5, "Error writing Session to offline storage: %s", str);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        q6 q6Var = this.a;
        File[] fileArrA = a();
        ArrayList arrayList = new ArrayList(fileArrA.length);
        for (File file : fileArrA) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(((m1) this.b.a()).c(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused) {
                q6Var.getLogger().i(q5.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e) {
                q6Var.getLogger().d(q5.ERROR, "Error while reading cached envelope from file " + file.getAbsolutePath(), e);
            }
        }
        return arrayList.iterator();
    }
}
