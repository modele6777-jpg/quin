package defpackage;

import android.os.ParcelFileDescriptor;
import androidx.datastore.core.NativeSharedCounter;
import io.sentry.config.a;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileLock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o59 implements k77 {
    public static final j59 j = new j59();
    public final pv2 a;
    public final File b;
    public final dw1 c;
    public final String d;
    public final String e;
    public final String f;
    public final f99 g;
    public final ace h;
    public final ace i;

    public o59(pv2 pv2Var, File file) {
        pv2Var.getClass();
        this.a = pv2Var;
        this.b = file;
        Object obj = a69.b;
        this.c = new dw1(new z59(file, null), nu4.a, -2, i41.a, 0);
        this.d = ".lock";
        this.e = ".version";
        this.f = "fcntl failed: EAGAIN";
        this.g = new f99();
        final int i = 0;
        this.h = new ace(new x16(this) { // from class: h59
            public final /* synthetic */ o59 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() throws Throwable {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptorOpen;
                int i2 = i;
                o59 o59Var = this.b;
                switch (i2) {
                    case 0:
                        File file2 = new File(o59Var.b.getAbsolutePath() + o59Var.d);
                        o59.f(file2);
                        return file2;
                    default:
                        bcd.a.getClass();
                        File file3 = new File(o59Var.b.getAbsolutePath() + o59Var.e);
                        o59.f(file3);
                        acd acdVar = null;
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptorOpen.getClass();
                                NativeSharedCounter nativeSharedCounter = zbd.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptorOpen.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (jNativeCreateSharedCounter >= 0) {
                                            acdVar = new acd(nativeSharedCounter, jNativeCreateSharedCounter);
                                        } else {
                                            yg5.m("Failed to mmap counter file");
                                        }
                                    } else {
                                        yg5.m("Failed to truncate counter file");
                                    }
                                } else {
                                    qc0.p("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptorOpen.close();
                                return acdVar;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptorOpen = null;
                        }
                        break;
                }
            }
        });
        final int i2 = 1;
        this.i = new ace(new x16(this) { // from class: h59
            public final /* synthetic */ o59 b;

            {
                this.b = this;
            }

            @Override // defpackage.x16
            public final Object invoke() throws Throwable {
                Throwable th;
                ParcelFileDescriptor parcelFileDescriptorOpen;
                int i3 = i2;
                o59 o59Var = this.b;
                switch (i3) {
                    case 0:
                        File file2 = new File(o59Var.b.getAbsolutePath() + o59Var.d);
                        o59.f(file2);
                        return file2;
                    default:
                        bcd.a.getClass();
                        File file3 = new File(o59Var.b.getAbsolutePath() + o59Var.e);
                        o59.f(file3);
                        acd acdVar = null;
                        try {
                            parcelFileDescriptorOpen = ParcelFileDescriptor.open(file3, 939524096);
                            try {
                                parcelFileDescriptorOpen.getClass();
                                NativeSharedCounter nativeSharedCounter = zbd.b;
                                if (nativeSharedCounter != null) {
                                    int fd = parcelFileDescriptorOpen.getFd();
                                    if (nativeSharedCounter.nativeTruncateFile(fd) == 0) {
                                        long jNativeCreateSharedCounter = nativeSharedCounter.nativeCreateSharedCounter(fd);
                                        if (jNativeCreateSharedCounter >= 0) {
                                            acdVar = new acd(nativeSharedCounter, jNativeCreateSharedCounter);
                                        } else {
                                            yg5.m("Failed to mmap counter file");
                                        }
                                    } else {
                                        yg5.m("Failed to truncate counter file");
                                    }
                                } else {
                                    qc0.p("DataStore failed to load the native library to create SharedCounter.");
                                }
                                parcelFileDescriptorOpen.close();
                                return acdVar;
                            } catch (Throwable th2) {
                                th = th2;
                                if (parcelFileDescriptorOpen != null) {
                                    parcelFileDescriptorOpen.close();
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            parcelFileDescriptorOpen = null;
                        }
                        break;
                }
            }
        });
    }

    public static void f(File file) throws IOException {
        File parentFile = file.getCanonicalFile().getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                s8f.p(file, "Unable to create parent directories of ");
                return;
            }
        }
        if (file.exists()) {
            return;
        }
        file.createNewFile();
    }

    @Override // defpackage.k77
    public final Object a(zn2 zn2Var) {
        ace aceVar = this.i;
        if (aceVar.b()) {
            acd acdVar = (acd) ((bcd) aceVar.getValue());
            return new Integer(acdVar.b.nativeGetCounterValue(acdVar.c));
        }
        return ynb.p0(this.a, new k59(this, null), zn2Var);
    }

    @Override // defpackage.k77
    public final Object b(nd3 nd3Var) {
        ace aceVar = this.i;
        if (aceVar.b()) {
            acd acdVar = (acd) ((bcd) aceVar.getValue());
            return new Integer(acdVar.b.nativeIncrementAndGetCounterValue(acdVar.c));
        }
        return ynb.p0(this.a, new l59(this, null), nd3Var);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b8 A[Catch: all -> 0x00bc, TRY_ENTER, TRY_LEAVE, TryCatch #6 {all -> 0x00bc, blocks: (B:41:0x00b8, B:55:0x00d6, B:56:0x00d9), top: B:64:0x0022, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00d6 A[Catch: all -> 0x00bc, TRY_ENTER, TryCatch #6 {all -> 0x00bc, blocks: (B:41:0x00b8, B:55:0x00d6, B:56:0x00d9), top: B:64:0x0022, outer: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v21 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [d99] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [a26] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r9v0, types: [a26, java.io.Closeable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // defpackage.k77
    public final Object c(a26 a26Var, zn2 zn2Var) throws Throwable {
        m59 m59Var;
        d99 d99Var;
        ?? r9;
        FileOutputStream fileOutputStreamE;
        Throwable th;
        Closeable closeable;
        d99 d99Var2;
        ?? r10;
        ?? r1;
        FileLock fileLock;
        FileLock fileLock2;
        Object objD;
        d99 d99Var3;
        ?? r11;
        if (zn2Var instanceof m59) {
            m59Var = (m59) zn2Var;
            int i = m59Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                m59Var.label = i - Integer.MIN_VALUE;
            } else {
                m59Var = new m59(this, zn2Var);
            }
        } else {
            m59Var = new m59(this, zn2Var);
        }
        ?? r12 = m59Var.result;
        int i2 = m59Var.label;
        bw2 bw2Var = bw2.a;
        try {
            try {
                try {
                    if (i2 == 0) {
                        jzb.q(r12);
                        m59Var.L$0 = a26Var;
                        d99Var = this.g;
                        m59Var.L$1 = d99Var;
                        m59Var.label = 1;
                        if (d99Var.b(m59Var) != bw2Var) {
                        }
                        r9 = a26Var;
                        return bw2Var;
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 3) {
                                qc0.p("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            fileLock = (FileLock) m59Var.L$2;
                            closeable = (Closeable) m59Var.L$1;
                            d99Var3 = (d99) m59Var.L$0;
                            try {
                                jzb.q(r12);
                                r11 = r12;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                try {
                                    ym8.t(closeable, null);
                                    d99Var3.h(null);
                                    return r11;
                                } catch (Throwable th2) {
                                    th = th2;
                                    r12 = d99Var3;
                                    r12.h(null);
                                    throw th;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        }
                        closeable = (Closeable) m59Var.L$2;
                        d99Var2 = (d99) m59Var.L$1;
                        a26 a26Var2 = (a26) m59Var.L$0;
                        try {
                            jzb.q(r12);
                            r1 = a26Var2;
                            r10 = r12;
                            fileLock2 = (FileLock) r10;
                            try {
                                m59Var.L$0 = d99Var2;
                                m59Var.L$1 = closeable;
                                m59Var.L$2 = fileLock2;
                                m59Var.label = 3;
                                objD = r1.d(m59Var);
                                if (objD != bw2Var) {
                                    d99Var3 = d99Var2;
                                    fileLock = fileLock2;
                                    r11 = objD;
                                    if (fileLock != null) {
                                        fileLock.release();
                                    }
                                    ym8.t(closeable, null);
                                    d99Var3.h(null);
                                    return r11;
                                }
                                r9 = a26Var;
                                return bw2Var;
                            } catch (Throwable th4) {
                                fileLock = fileLock2;
                                th = th4;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                            fileLock = null;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    }
                    d99 d99Var4 = (d99) m59Var.L$1;
                    a26 a26Var3 = (a26) m59Var.L$0;
                    jzb.q(r12);
                    d99Var = d99Var4;
                    r9 = a26Var3;
                    j59 j59Var = j;
                    m59Var.L$0 = r9;
                    m59Var.L$1 = d99Var;
                    m59Var.L$2 = fileOutputStreamE;
                    m59Var.label = 2;
                    Object objA = j59Var.a(fileOutputStreamE, m59Var);
                    if (objA != bw2Var) {
                        ?? r7 = r9;
                        closeable = fileOutputStreamE;
                        d99Var2 = d99Var;
                        r10 = objA;
                        r1 = r7;
                        fileLock2 = (FileLock) r10;
                        m59Var.L$0 = d99Var2;
                        m59Var.L$1 = closeable;
                        m59Var.L$2 = fileLock2;
                        m59Var.label = 3;
                        objD = r1.d(m59Var);
                        if (objD != bw2Var) {
                            d99Var3 = d99Var2;
                            fileLock = fileLock2;
                            r11 = objD;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            ym8.t(closeable, null);
                            d99Var3.h(null);
                            return r11;
                        }
                    }
                    r9 = a26Var;
                    return bw2Var;
                } catch (Throwable th6) {
                    th = th6;
                    fileLock = null;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
                r9 = a26Var;
                File file = (File) this.h.getValue();
                fileOutputStreamE = a.e(new FileOutputStream(file), file);
            } catch (Throwable th7) {
                r12 = m59Var;
                try {
                    throw th7;
                } catch (Throwable th8) {
                    ym8.t(a26Var, th7);
                    throw th8;
                }
            }
        } catch (Throwable th9) {
            th = th9;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0075  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e8 A[Catch: all -> 0x00ec, TRY_ENTER, TRY_LEAVE, TryCatch #7 {all -> 0x00ec, blocks: (B:61:0x00e8, B:75:0x0103, B:76:0x0106), top: B:100:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:75:0x0103 A[Catch: all -> 0x00ec, TRY_ENTER, TryCatch #7 {all -> 0x00ec, blocks: (B:61:0x00e8, B:75:0x0103, B:76:0x0106), top: B:100:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r19v0, types: [l26] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v10, types: [d99] */
    /* JADX WARN: Type inference failed for: r2v14, types: [d99] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [d99] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, n59] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [d99] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int, java.io.Closeable] */
    @Override // defpackage.k77
    public final Object d(l26 l26Var, zn2 zn2Var) throws Throwable {
        ?? n59Var;
        ?? r1;
        ?? r2;
        FileLock fileLock;
        String message;
        FileLock fileLockTryLock;
        Closeable closeable;
        ?? r3;
        ?? r4;
        if (zn2Var instanceof n59) {
            n59 n59Var2 = (n59) zn2Var;
            int i = n59Var2.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                n59Var2.label = i - Integer.MIN_VALUE;
                n59Var = n59Var2;
            } else {
                n59Var = new n59(this, zn2Var);
            }
        } else {
            n59Var = new n59(this, zn2Var);
        }
        Object objZ = n59Var.result;
        ?? r5 = n59Var.label;
        try {
            if (r5 == 0) {
                jzb.q(objZ);
                f99 f99Var = this.g;
                boolean zF = f99Var.f();
                bw2 bw2Var = bw2.a;
                try {
                    if (zF) {
                        File file = (File) this.h.getValue();
                        FileInputStream fileInputStreamB = a.b(file, new FileInputStream(file));
                        try {
                            try {
                                fileLockTryLock = fileInputStreamB.getChannel().tryLock(0L, Long.MAX_VALUE, true);
                            } catch (Throwable th) {
                                th = th;
                                fileLock = null;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                throw th;
                            }
                        } catch (IOException e) {
                            String message2 = e.getMessage();
                            if ((message2 == null || !c5e.C(message2, this.f, false)) && ((message = e.getMessage()) == null || !c5e.C(message, "Resource deadlock would occur", false))) {
                                throw e;
                            }
                            fileLockTryLock = null;
                        }
                        try {
                            Boolean boolValueOf = Boolean.valueOf(fileLockTryLock != null);
                            n59Var.L$0 = f99Var;
                            n59Var.L$1 = fileInputStreamB;
                            n59Var.L$2 = fileLockTryLock;
                            n59Var.Z$0 = zF;
                            n59Var.label = 2;
                            objZ = l26Var.z(boolValueOf, n59Var);
                            if (objZ != bw2Var) {
                                fileLock = fileLockTryLock;
                                n59Var = f99Var;
                                r1 = zF;
                                closeable = fileInputStreamB;
                                if (fileLock != null) {
                                    fileLock.release();
                                }
                                ym8.t(closeable, null);
                                if (r1 != 0) {
                                    n59Var.h(null);
                                }
                                return objZ;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            fileLock = fileLockTryLock;
                            if (fileLock != null) {
                                fileLock.release();
                            }
                            throw th;
                        }
                    } else {
                        Boolean bool = Boolean.FALSE;
                        n59Var.L$0 = f99Var;
                        n59Var.Z$0 = zF;
                        n59Var.label = 1;
                        objZ = l26Var.z(bool, n59Var);
                        if (objZ != bw2Var) {
                            r3 = f99Var;
                            r4 = zF;
                            if (r4 != 0) {
                                r3.h(null);
                            }
                            return objZ;
                        }
                    }
                    return bw2Var;
                } catch (Throwable th3) {
                    th = th3;
                    r2 = f99Var;
                    r1 = zF;
                }
            } else if (r5 == 1) {
                r1 = n59Var.Z$0;
                r2 = (d99) n59Var.L$0;
                try {
                    jzb.q(objZ);
                    r4 = r1;
                    r3 = r2;
                    if (r4 != 0) {
                        r3.h(null);
                    }
                    return objZ;
                } catch (Throwable th4) {
                    th = th4;
                }
            } else {
                if (r5 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                boolean z = n59Var.Z$0;
                fileLock = (FileLock) n59Var.L$2;
                closeable = (Closeable) n59Var.L$1;
                d99 d99Var = (d99) n59Var.L$0;
                try {
                    jzb.q(objZ);
                    r1 = z;
                    n59Var = d99Var;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    try {
                        ym8.t(closeable, null);
                        if (r1 != 0) {
                            n59Var.h(null);
                        }
                        return objZ;
                    } catch (Throwable th5) {
                        th = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                    if (fileLock != null) {
                        fileLock.release();
                    }
                    throw th;
                }
            }
        } catch (Throwable th7) {
            try {
                throw th7;
            } catch (Throwable th8) {
                try {
                    ym8.t(r5, th7);
                    throw th8;
                } catch (Throwable th9) {
                    th = th9;
                    r1 = this;
                }
            }
        }
        r2 = n59Var;
        if (r1 != 0) {
            r2.h(null);
        }
        throw th;
    }

    @Override // defpackage.k77
    public final wj5 e() {
        return this.c;
    }
}
