package defpackage;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wd5 implements z52 {
    public final File a;
    public final czc b;
    public final k77 c;
    public final rd5 d;
    public final AtomicBoolean e;
    public final f99 f;

    public wd5(File file, czc czcVar, k77 k77Var, rd5 rd5Var) {
        czcVar.getClass();
        k77Var.getClass();
        this.a = file;
        this.b = czcVar;
        this.c = k77Var;
        this.d = rd5Var;
        this.e = new AtomicBoolean(false);
        this.f = new f99();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x006f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0073 A[Catch: all -> 0x0074, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0074, blocks: (B:34:0x0073, B:43:0x0084, B:42:0x0081, B:39:0x007c), top: B:52:0x0020, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0088  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [wd5] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v12, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0, types: [m2e] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v6, types: [boolean] */
    public final Object a(m2e m2eVar, zn2 zn2Var) throws Throwable {
        ud5 ud5Var;
        ?? F;
        Throwable th;
        z52 z52Var;
        ?? r6;
        if (zn2Var instanceof ud5) {
            ud5Var = (ud5) zn2Var;
            int i = ud5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                ud5Var.label = i - Integer.MIN_VALUE;
            } else {
                ud5Var = new ud5(this, zn2Var);
            }
        } else {
            ud5Var = new ud5(this, zn2Var);
        }
        Object obj = ud5Var.result;
        int i2 = ud5Var.label;
        f99 f99Var = this.f;
        try {
            if (i2 != 0) {
                if (i2 != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = ud5Var.Z$0;
                z52Var = (z52) ud5Var.L$0;
                try {
                    jzb.q(obj);
                    r6 = this;
                    try {
                        z52Var.close();
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                    if (th == null) {
                        throw th;
                    }
                    if (r6 != 0) {
                        f99Var.h(null);
                    }
                    return obj;
                } catch (Throwable th3) {
                    th = th3;
                    try {
                        z52Var.close();
                    } catch (Throwable th4) {
                        bzd.m(th, th4);
                    }
                    throw th;
                }
            }
            jzb.q(obj);
            if (this.e.get()) {
                qc0.p("StorageConnection has already been disposed.");
                return null;
            }
            F = f99Var.f();
            try {
                pd5 pd5Var = new pd5(this.a, this.b);
                try {
                    Boolean boolValueOf = Boolean.valueOf((boolean) F);
                    ud5Var.L$0 = pd5Var;
                    ud5Var.Z$0 = F;
                    ud5Var.label = 1;
                    Object objM = m2eVar.m(pd5Var, boolValueOf, ud5Var);
                    bw2 bw2Var = bw2.a;
                    if (objM == bw2Var) {
                        return bw2Var;
                    }
                    obj = objM;
                    r6 = F == true ? 1 : 0;
                    z52Var = pd5Var;
                    z52Var.close();
                    th = null;
                    if (th == null) {
                        throw th;
                    }
                    if (r6 != 0) {
                        f99Var.h(null);
                    }
                    return obj;
                } catch (Throwable th5) {
                    th = th5;
                    this = F == true ? 1 : 0;
                    z52Var = pd5Var;
                    z52Var.close();
                    throw th;
                }
            } catch (Throwable th6) {
                th = th6;
                if (F != 0) {
                    f99Var.h(null);
                }
                throw th;
            }
        } catch (Throwable th7) {
            th = th7;
            F = this;
            if (F != 0) {
                f99Var.h(null);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00c5 A[Catch: all -> 0x00ff, IOException -> 0x0101, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0101, blocks: (B:42:0x00c5, B:47:0x00e0, B:48:0x00fe, B:55:0x010b, B:62:0x0119, B:61:0x0116), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x010b A[Catch: all -> 0x00ff, IOException -> 0x0101, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x0101, blocks: (B:42:0x00c5, B:47:0x00e0, B:48:0x00fe, B:55:0x010b, B:62:0x0119, B:61:0x0116), top: B:78:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.io.File, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v14, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [d99] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.File] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.File, java.lang.Object] */
    public final Object b(nd3 nd3Var, zn2 zn2Var) {
        vd5 vd5Var;
        ?? file;
        d99 d99Var;
        l26 l26Var;
        le5 le5Var;
        Throwable th;
        z52 z52Var;
        d99 d99Var2;
        ?? r11;
        if (zn2Var instanceof vd5) {
            vd5Var = (vd5) zn2Var;
            int i = vd5Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                vd5Var.label = i - Integer.MIN_VALUE;
            } else {
                vd5Var = new vd5(this, zn2Var);
            }
        } else {
            vd5Var = new vd5(this, zn2Var);
        }
        ?? r12 = vd5Var.result;
        int i2 = vd5Var.label;
        File file2 = this.a;
        bw2 bw2Var = bw2.a;
        try {
            try {
                try {
                    try {
                        try {
                            if (i2 == 0) {
                                jzb.q(r12);
                                if (this.e.get()) {
                                    qc0.p("StorageConnection has already been disposed.");
                                    return null;
                                }
                                File parentFile = file2.getCanonicalFile().getParentFile();
                                if (parentFile != null) {
                                    parentFile.mkdirs();
                                    if (!parentFile.isDirectory()) {
                                        s8f.p(file2, "Unable to create parent directories of ");
                                        return null;
                                    }
                                }
                                vd5Var.L$0 = nd3Var;
                                d99Var = this.f;
                                vd5Var.L$1 = d99Var;
                                vd5Var.label = 1;
                                l26Var = nd3Var;
                                if (d99Var.b(vd5Var) != bw2Var) {
                                }
                                return bw2Var;
                            }
                            if (i2 != 1) {
                                if (i2 != 2) {
                                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                z52Var = (z52) vd5Var.L$2;
                                File file3 = (File) vd5Var.L$1;
                                d99Var2 = (d99) vd5Var.L$0;
                                try {
                                    jzb.q(r12);
                                    r11 = file3;
                                    try {
                                        z52Var.close();
                                        th = null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                    if (th == null) {
                                        throw th;
                                    }
                                    if (r11.exists()) {
                                        try {
                                            Files.move(r11.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                        } catch (IOException unused) {
                                            throw new IOException("Unable to rename " + r11 + " to " + file2 + ". This likely means that there are multiple instances of DataStore for this file. Ensure that you are only creating a single instance of datastore for this file.");
                                        }
                                    }
                                    d99Var2.h(null);
                                    return wef.a;
                                } catch (Throwable th3) {
                                    th = th3;
                                    try {
                                        z52Var.close();
                                    } catch (Throwable th4) {
                                        bzd.m(th, th4);
                                    }
                                    throw th;
                                }
                            }
                            d99 d99Var3 = (d99) vd5Var.L$1;
                            l26 l26Var2 = (l26) vd5Var.L$0;
                            jzb.q(r12);
                            d99Var = d99Var3;
                            l26Var = l26Var2;
                            vd5Var.L$0 = d99Var;
                            vd5Var.L$1 = file;
                            vd5Var.L$2 = le5Var;
                            vd5Var.label = 2;
                            if (l26Var.z(le5Var, vd5Var) != bw2Var) {
                                d99Var2 = d99Var;
                                r11 = file;
                                z52Var = le5Var;
                                z52Var.close();
                                th = null;
                                if (th == null) {
                                    throw th;
                                }
                                if (r11.exists()) {
                                    Files.move(r11.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                                }
                                d99Var2.h(null);
                                return wef.a;
                            }
                            return bw2Var;
                        } catch (Throwable th5) {
                            th = th5;
                            z52Var = le5Var;
                            z52Var.close();
                            throw th;
                        }
                        czc czcVar = this.b;
                        czcVar.getClass();
                        le5Var = new le5(file, czcVar);
                    } catch (IOException e) {
                        e = e;
                        if (file.exists()) {
                            file.delete();
                        }
                        throw e;
                    }
                    file = new File(file2.getAbsolutePath() + ".tmp");
                } catch (Throwable th6) {
                    th = th6;
                    r12 = vd5Var;
                    r12.h(null);
                    throw th;
                }
            } catch (Throwable th7) {
                th = th7;
                r12.h(null);
                throw th;
            }
        } catch (IOException e2) {
            e = e2;
            file = nd3Var;
        }
    }

    @Override // defpackage.z52
    public final void close() {
        this.e.set(true);
        this.d.invoke();
    }
}
