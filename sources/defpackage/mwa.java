package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.Build;
import android.util.Log;
import io.sentry.config.a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.Arrays;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class mwa {
    public static final y25 a = new y25(19);

    public static void a(PackageInfo packageInfo, File file) {
        File file2 = new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(a.e(new FileOutputStream(file2), file2));
            try {
                dataOutputStream.writeLong(packageInfo.lastUpdateTime);
                dataOutputStream.close();
            } catch (Throwable th) {
                try {
                    dataOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x018c A[Catch: all -> 0x0189, TRY_ENTER, TryCatch #27 {all -> 0x0189, blocks: (B:88:0x0168, B:90:0x0174, B:101:0x018c, B:102:0x0191), top: B:274:0x0168, outer: #33 }] */
    /* JADX WARN: Code duplicated, block: B:108:0x019b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x019d A[Catch: IllegalStateException -> 0x0183, IOException -> 0x0185, FileNotFoundException -> 0x0187, TRY_LEAVE, TryCatch #33 {FileNotFoundException -> 0x0187, IOException -> 0x0185, IllegalStateException -> 0x0183, blocks: (B:86:0x0160, B:91:0x017e, B:109:0x019d, B:107:0x019a, B:106:0x0197, B:88:0x0168, B:90:0x0174, B:101:0x018c, B:102:0x0191, B:103:0x0192), top: B:293:0x0160, inners: #27, #36 }] */
    /* JADX WARN: Code duplicated, block: B:116:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:126:0x01dd A[Catch: all -> 0x01eb, TRY_LEAVE, TryCatch #8 {all -> 0x01eb, blocks: (B:124:0x01d1, B:126:0x01dd, B:135:0x01ee), top: B:257:0x01d1, outer: #36 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x01ee A[Catch: all -> 0x01eb, TRY_ENTER, TRY_LEAVE, TryCatch #8 {all -> 0x01eb, blocks: (B:124:0x01d1, B:126:0x01dd, B:135:0x01ee), top: B:257:0x01d1, outer: #36 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x020b  */
    /* JADX WARN: Code duplicated, block: B:150:0x0215  */
    /* JADX WARN: Code duplicated, block: B:151:0x0219  */
    /* JADX WARN: Code duplicated, block: B:160:0x023f A[Catch: all -> 0x027d, TryCatch #23 {all -> 0x027d, blocks: (B:158:0x0239, B:160:0x023f, B:161:0x0243, B:163:0x0249), top: B:272:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:163:0x0249 A[Catch: all -> 0x027d, TRY_LEAVE, TryCatch #23 {all -> 0x027d, blocks: (B:158:0x0239, B:160:0x023f, B:161:0x0243, B:163:0x0249), top: B:272:0x0239 }] */
    /* JADX WARN: Code duplicated, block: B:229:0x02ce  */
    /* JADX WARN: Code duplicated, block: B:233:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:240:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:272:0x0239 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:274:0x0168 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x021d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x01cc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:294:0x024e A[EDGE_INSN: B:294:0x024e->B:165:0x024e BREAK  A[LOOP:0: B:161:0x0243->B:295:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:55:0x0115 A[Catch: all -> 0x012a, IllegalStateException -> 0x012d, IOException -> 0x012f, TRY_LEAVE, TryCatch #38 {IOException -> 0x012f, IllegalStateException -> 0x012d, blocks: (B:53:0x010b, B:55:0x0115, B:66:0x0131, B:67:0x0136), top: B:289:0x010b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0131 A[Catch: all -> 0x012a, IllegalStateException -> 0x012d, IOException -> 0x012f, TRY_ENTER, TryCatch #38 {IOException -> 0x012f, IllegalStateException -> 0x012d, blocks: (B:53:0x010b, B:55:0x0115, B:66:0x0131, B:67:0x0136), top: B:289:0x010b, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0174 A[Catch: all -> 0x0189, TRY_LEAVE, TryCatch #27 {all -> 0x0189, blocks: (B:88:0x0168, B:90:0x0174, B:101:0x018c, B:102:0x0191), top: B:274:0x0168, outer: #33 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22, types: [boolean] */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v24 */
    /* JADX WARN: Type inference failed for: r7v25 */
    /* JADX WARN: Type inference failed for: r7v26, types: [java.io.ByteArrayOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v27, types: [int] */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29 */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v33, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v37 */
    /* JADX WARN: Type inference failed for: r7v38 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v48 */
    /* JADX WARN: Type inference failed for: r7v49 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v50 */
    /* JADX WARN: Type inference failed for: r7v51 */
    /* JADX WARN: Type inference failed for: r7v52 */
    /* JADX WARN: Type inference failed for: r7v53 */
    /* JADX WARN: Type inference failed for: r7v54 */
    /* JADX WARN: Type inference failed for: r7v55 */
    /* JADX WARN: Type inference failed for: r7v56 */
    /* JADX WARN: Type inference failed for: r7v57 */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v60 */
    /* JADX WARN: Type inference failed for: r7v61 */
    /* JADX WARN: Type inference failed for: r7v62 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v16 */
    public static void b(Context context, Executor executor, lwa lwaVar, boolean z) {
        boolean z2;
        ?? C;
        b84[] b84VarArrI;
        b84[] b84VarArr;
        lwa lwaVar2;
        b84[] b84VarArr2;
        byte[] bArr;
        ?? r7;
        byte[] bArr2;
        ?? r8;
        boolean z3;
        ByteArrayInputStream byteArrayInputStream;
        Throwable th;
        FileOutputStream fileOutputStreamE;
        Throwable th2;
        FileChannel channel;
        FileLock fileLockTryLock;
        byte[] bArr3;
        int i;
        ?? r9;
        boolean z4;
        ?? byteArrayOutputStream;
        ?? r10;
        o74 o74Var;
        ?? r11;
        FileInputStream fileInputStreamC;
        ?? r12;
        ?? r13;
        boolean z5;
        Context applicationContext = context.getApplicationContext();
        String packageName = applicationContext.getPackageName();
        ApplicationInfo applicationInfo = applicationContext.getApplicationInfo();
        AssetManager assets = applicationContext.getAssets();
        String name = new File(applicationInfo.sourceDir).getName();
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
            File filesDir = context.getFilesDir();
            if (!z) {
                File file = new File(filesDir, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
                if (file.exists()) {
                    try {
                        DataInputStream dataInputStream = new DataInputStream(a.b(file, new FileInputStream(file)));
                        try {
                            long j = dataInputStream.readLong();
                            dataInputStream.close();
                            z5 = j == packageInfo.lastUpdateTime;
                            if (z5) {
                                lwaVar.n(2, null);
                            }
                        } catch (Throwable th3) {
                            try {
                                dataInputStream.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (IOException unused) {
                        z5 = false;
                    }
                } else {
                    z5 = false;
                }
                if (z5) {
                    Log.d("ProfileInstaller", "Skipping profile installation for " + context.getPackageName());
                    qwa.c(context, false);
                    return;
                }
            }
            Log.d("ProfileInstaller", "Installing profile for " + context.getPackageName());
            byte[] bArr4 = y7h.j;
            File file2 = new File(new File("/data/misc/profiles/cur/0", packageName), "primary.prof");
            o74 o74Var2 = new o74(assets, executor, lwaVar, name, file2);
            byte[] bArr5 = (byte[]) o74Var2.d;
            if (bArr5 != null) {
                if (!file2.exists()) {
                    try {
                        if (file2.createNewFile()) {
                            o74Var2.a = true;
                            C = o74Var2.c(assets, "dexopt/baseline.prof");
                            if (C != 0) {
                                if (Arrays.equals(bArr4, db6.D0(C, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                b84VarArrI = y7h.I(C, db6.D0(C, 4), (String) o74Var2.g);
                                C.close();
                                o74Var2.h = b84VarArrI;
                            }
                            b84VarArr = (b84[]) o74Var2.h;
                            if (b84VarArr != null) {
                                C = "dexopt/baseline.profm";
                                fileInputStreamC = o74Var2.c(assets, "dexopt/baseline.profm");
                                r11 = C;
                                if (fileInputStreamC == null) {
                                    if (fileInputStreamC != null) {
                                        fileInputStreamC.close();
                                        r11 = C;
                                    }
                                    o74Var = null;
                                    C = r11;
                                } else {
                                    if (Arrays.equals(y7h.k, db6.D0(fileInputStreamC, 4))) {
                                        throw new IllegalStateException("Invalid magic");
                                    }
                                    byte[] bArrD0 = db6.D0(fileInputStreamC, 4);
                                    o74Var2.h = y7h.F(fileInputStreamC, bArrD0, bArr5, b84VarArr);
                                    fileInputStreamC.close();
                                    o74Var = o74Var2;
                                    C = bArrD0;
                                }
                                if (o74Var != null) {
                                    o74Var2 = o74Var;
                                }
                            }
                            lwaVar2 = (lwa) o74Var2.c;
                            b84VarArr2 = (b84[]) o74Var2.h;
                            bArr = (byte[]) o74Var2.d;
                            r7 = C;
                            r7 = C;
                            if (b84VarArr2 != null) {
                                byteArrayOutputStream = o74Var2.a;
                                if (byteArrayOutputStream != 0) {
                                    qc0.p("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                byteArrayOutputStream.write(bArr4);
                                byteArrayOutputStream.write(bArr);
                                if (y7h.R(byteArrayOutputStream, bArr, b84VarArr2)) {
                                    o74Var2.e = byteArrayOutputStream.toByteArray();
                                    byteArrayOutputStream.close();
                                    r10 = byteArrayOutputStream;
                                    o74Var2.h = null;
                                    r7 = r10;
                                } else {
                                    lwaVar2.n(5, null);
                                    o74Var2.h = null;
                                    byteArrayOutputStream.close();
                                    r7 = byteArrayOutputStream;
                                }
                            }
                            bArr2 = (byte[]) o74Var2.e;
                            if (bArr2 != null) {
                                if (o74Var2.a) {
                                    qc0.p("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                File file3 = (File) o74Var2.f;
                                fileOutputStreamE = a.e(new FileOutputStream(file3), file3);
                                channel = fileOutputStreamE.getChannel();
                                fileLockTryLock = channel.tryLock();
                                if (fileLockTryLock != null) {
                                    if (fileLockTryLock.isValid()) {
                                        bArr3 = new byte[512];
                                        while (true) {
                                            i = byteArrayInputStream.read(bArr3);
                                            if (i > 0) {
                                                break;
                                                break;
                                            }
                                            fileOutputStreamE.write(bArr3, 0, i);
                                        }
                                        r9 = 1;
                                        o74Var2.d(1, null);
                                        fileLockTryLock.close();
                                        channel.close();
                                        fileOutputStreamE.close();
                                        byteArrayInputStream.close();
                                        o74Var2.e = null;
                                        o74Var2.h = null;
                                        z3 = true;
                                    }
                                }
                                throw new IOException("Unable to acquire a lock on the underlying file channel.");
                            }
                            z3 = false;
                            r9 = 1;
                            if (z3) {
                                a(packageInfo, filesDir);
                            }
                            z4 = z3;
                            r12 = r9;
                        } else {
                            o74Var2.d(4, null);
                        }
                    } catch (IOException unused2) {
                        z2 = true;
                        o74Var2.d(4, null);
                    }
                } else if (file2.canWrite()) {
                    o74Var2.a = true;
                    try {
                        C = o74Var2.c(assets, "dexopt/baseline.prof");
                    } catch (FileNotFoundException e) {
                        lwaVar.n(6, e);
                        C = 0;
                    } catch (IOException e2) {
                        lwaVar.n(7, e2);
                        C = 0;
                    }
                    try {
                        if (C != 0) {
                            try {
                                if (Arrays.equals(bArr4, db6.D0(C, 4))) {
                                    throw new IllegalStateException("Invalid magic");
                                }
                                b84VarArrI = y7h.I(C, db6.D0(C, 4), (String) o74Var2.g);
                                try {
                                    C.close();
                                } catch (IOException e3) {
                                    lwaVar.n(7, e3);
                                }
                                o74Var2.h = b84VarArrI;
                            } catch (IOException e4) {
                                lwaVar.n(7, e4);
                                try {
                                    C.close();
                                } catch (IOException e5) {
                                    lwaVar.n(7, e5);
                                }
                                b84VarArrI = null;
                            } catch (IllegalStateException e6) {
                                lwaVar.n(8, e6);
                                C.close();
                                b84VarArrI = null;
                            }
                        }
                        b84VarArr = (b84[]) o74Var2.h;
                        if (b84VarArr != null && (C = Build.VERSION.SDK_INT) >= 31) {
                            try {
                                C = "dexopt/baseline.profm";
                                fileInputStreamC = o74Var2.c(assets, "dexopt/baseline.profm");
                                r11 = C;
                                if (fileInputStreamC == null) {
                                    try {
                                        if (Arrays.equals(y7h.k, db6.D0(fileInputStreamC, 4))) {
                                            throw new IllegalStateException("Invalid magic");
                                        }
                                        byte[] bArrD1 = db6.D0(fileInputStreamC, 4);
                                        o74Var2.h = y7h.F(fileInputStreamC, bArrD1, bArr5, b84VarArr);
                                        fileInputStreamC.close();
                                        o74Var = o74Var2;
                                        C = bArrD1;
                                    } catch (Throwable th5) {
                                        try {
                                            fileInputStreamC.close();
                                            throw th5;
                                        } catch (Throwable th6) {
                                            th5.addSuppressed(th6);
                                            throw th5;
                                        }
                                    }
                                } else {
                                    if (fileInputStreamC != null) {
                                        fileInputStreamC.close();
                                        r11 = C;
                                    }
                                    o74Var = null;
                                    C = r11;
                                }
                            } catch (FileNotFoundException e7) {
                                lwaVar.n(9, e7);
                                r11 = C;
                                o74Var = null;
                                C = r11;
                            } catch (IOException e8) {
                                lwaVar.n(7, e8);
                                r11 = C;
                                o74Var = null;
                                C = r11;
                            } catch (IllegalStateException e9) {
                                o74Var2.h = null;
                                lwaVar.n(8, e9);
                                r11 = C;
                                o74Var = null;
                                C = r11;
                            }
                            if (o74Var != null) {
                                o74Var2 = o74Var;
                            }
                        }
                        lwaVar2 = (lwa) o74Var2.c;
                        b84VarArr2 = (b84[]) o74Var2.h;
                        bArr = (byte[]) o74Var2.d;
                        r7 = C;
                        r7 = C;
                        if (b84VarArr2 != null && bArr != null) {
                            byteArrayOutputStream = o74Var2.a;
                            if (byteArrayOutputStream != 0) {
                                qc0.p("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                return;
                            }
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byteArrayOutputStream.write(bArr4);
                                    byteArrayOutputStream.write(bArr);
                                    if (y7h.R(byteArrayOutputStream, bArr, b84VarArr2)) {
                                        lwaVar2.n(5, null);
                                        o74Var2.h = null;
                                        byteArrayOutputStream.close();
                                        r7 = byteArrayOutputStream;
                                    } else {
                                        o74Var2.e = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        r10 = byteArrayOutputStream;
                                        o74Var2.h = null;
                                        r7 = r10;
                                    }
                                } catch (Throwable th7) {
                                    try {
                                        byteArrayOutputStream.close();
                                        throw th7;
                                    } catch (Throwable th8) {
                                        th7.addSuppressed(th8);
                                        throw th7;
                                    }
                                }
                            } catch (IOException e10) {
                                lwaVar2.n(7, e10);
                                r10 = byteArrayOutputStream;
                            } catch (IllegalStateException e11) {
                                lwaVar2.n(8, e11);
                                r10 = byteArrayOutputStream;
                            }
                        }
                        bArr2 = (byte[]) o74Var2.e;
                        if (bArr2 != null) {
                            z3 = false;
                            r9 = 1;
                        } else {
                            try {
                                if (o74Var2.a) {
                                    qc0.p("This device doesn't support aot. Did you call deviceSupportsAotProfile()?");
                                    return;
                                }
                                try {
                                    try {
                                        byteArrayInputStream = new ByteArrayInputStream(bArr2);
                                        try {
                                            try {
                                                File file4 = (File) o74Var2.f;
                                                fileOutputStreamE = a.e(new FileOutputStream(file4), file4);
                                                try {
                                                    try {
                                                        channel = fileOutputStreamE.getChannel();
                                                        try {
                                                            fileLockTryLock = channel.tryLock();
                                                            try {
                                                                try {
                                                                    if (fileLockTryLock != null) {
                                                                        try {
                                                                            if (fileLockTryLock.isValid()) {
                                                                                bArr3 = new byte[512];
                                                                                while (true) {
                                                                                    i = byteArrayInputStream.read(bArr3);
                                                                                    if (i > 0) {
                                                                                        break;
                                                                                    } else {
                                                                                        fileOutputStreamE.write(bArr3, 0, i);
                                                                                    }
                                                                                }
                                                                                r9 = 1;
                                                                                o74Var2.d(1, null);
                                                                                fileLockTryLock.close();
                                                                                channel.close();
                                                                                fileOutputStreamE.close();
                                                                                byteArrayInputStream.close();
                                                                                o74Var2.e = null;
                                                                                o74Var2.h = null;
                                                                                z3 = true;
                                                                            }
                                                                        } catch (Throwable th9) {
                                                                            th = th9;
                                                                            Throwable th10 = th;
                                                                            if (fileLockTryLock == null) {
                                                                                throw th10;
                                                                            }
                                                                            try {
                                                                                fileLockTryLock.close();
                                                                                throw th10;
                                                                            } catch (Throwable th11) {
                                                                                th10.addSuppressed(th11);
                                                                                throw th10;
                                                                            }
                                                                        }
                                                                    }
                                                                    throw new IOException("Unable to acquire a lock on the underlying file channel.");
                                                                } catch (Throwable th12) {
                                                                    th = th12;
                                                                }
                                                            } catch (Throwable th13) {
                                                                th = th13;
                                                                Throwable th14 = th;
                                                                if (channel == null) {
                                                                    throw th14;
                                                                }
                                                                try {
                                                                    channel.close();
                                                                    throw th14;
                                                                } catch (Throwable th15) {
                                                                    th14.addSuppressed(th15);
                                                                    throw th14;
                                                                }
                                                            }
                                                        } catch (Throwable th16) {
                                                            th = th16;
                                                        }
                                                    } catch (Throwable th17) {
                                                        th = th17;
                                                        th2 = th;
                                                        try {
                                                            fileOutputStreamE.close();
                                                            throw th2;
                                                        } catch (Throwable th18) {
                                                            th2.addSuppressed(th18);
                                                            throw th2;
                                                        }
                                                    }
                                                } catch (Throwable th19) {
                                                    th = th19;
                                                    th2 = th;
                                                    fileOutputStreamE.close();
                                                    throw th2;
                                                }
                                            } catch (Throwable th20) {
                                                th = th20;
                                                th = th;
                                                try {
                                                    byteArrayInputStream.close();
                                                    throw th;
                                                } catch (Throwable th21) {
                                                    th.addSuppressed(th21);
                                                    throw th;
                                                }
                                            }
                                        } catch (Throwable th22) {
                                            th = th22;
                                            th = th;
                                            byteArrayInputStream.close();
                                            throw th;
                                        }
                                    } catch (FileNotFoundException e12) {
                                        e = e12;
                                        o74Var2.d(6, e);
                                        r8 = r7;
                                        o74Var2.e = null;
                                        o74Var2.h = null;
                                        z3 = false;
                                        r9 = r8;
                                    } catch (IOException e13) {
                                        e = e13;
                                        o74Var2.d(7, e);
                                        r8 = r7;
                                        o74Var2.e = null;
                                        o74Var2.h = null;
                                        z3 = false;
                                        r9 = r8;
                                    }
                                } catch (FileNotFoundException e14) {
                                    e = e14;
                                    r7 = 1;
                                    o74Var2.d(6, e);
                                    r8 = r7;
                                    o74Var2.e = null;
                                    o74Var2.h = null;
                                    z3 = false;
                                    r9 = r8;
                                } catch (IOException e15) {
                                    e = e15;
                                    r7 = 1;
                                    o74Var2.d(7, e);
                                    r8 = r7;
                                    o74Var2.e = null;
                                    o74Var2.h = null;
                                    z3 = false;
                                    r9 = r8;
                                }
                            } catch (Throwable th23) {
                                o74Var2.e = null;
                                o74Var2.h = null;
                                throw th23;
                            }
                        }
                        if (z3) {
                            a(packageInfo, filesDir);
                        }
                        z4 = z3;
                        r12 = r9;
                    } catch (Throwable th24) {
                        try {
                            C.close();
                            throw th24;
                        } catch (IOException e16) {
                            lwaVar.n(7, e16);
                            throw th24;
                        }
                    }
                } else {
                    o74Var2.d(4, null);
                }
                if (z4 || !z) {
                    r13 = 0;
                } else {
                    r13 = r12;
                }
                qwa.c(context, r13);
            }
            o74Var2.d(3, Integer.valueOf(Build.VERSION.SDK_INT));
            z2 = true;
            z4 = false;
            r12 = z2;
            if (z4) {
                r13 = 0;
            } else {
                r13 = 0;
            }
            qwa.c(context, r13);
        } catch (PackageManager.NameNotFoundException e17) {
            lwaVar.n(7, e17);
            qwa.c(context, false);
        }
    }
}
