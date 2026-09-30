package io.sentry;

import defpackage.ib8;
import defpackage.qc0;
import defpackage.vh2;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d5 implements Callable {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ long b;
    public final /* synthetic */ m1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ d5(a aVar, long j, m1 m1Var, z0 z0Var) {
        this.d = aVar;
        this.b = j;
        this.c = m1Var;
        this.e = z0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws io.sentry.exception.c {
        byte[] bArr;
        int i = this.a;
        byte[] bArr2 = null;
        m1 m1Var = this.c;
        Object obj = this.e;
        long j = this.b;
        Object obj2 = this.d;
        switch (i) {
            case 0:
                a aVar = (a) obj2;
                z0 z0Var = (z0) obj;
                byte[] bArr3 = aVar.a;
                String str = aVar.d;
                if (bArr3 != null) {
                    g5.a(str, bArr3.length, j);
                    return bArr3;
                }
                io.sentry.protocol.j0 j0Var = aVar.b;
                if (j0Var != null) {
                    Charset charset = io.sentry.util.d.a;
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, io.sentry.util.d.a));
                            try {
                                m1Var.a(bufferedWriter, j0Var);
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                bufferedWriter.close();
                                byteArrayOutputStream.close();
                                bArr2 = byteArray;
                            } catch (Throwable th) {
                                try {
                                    bufferedWriter.close();
                                    break;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream.close();
                                break;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        z0Var.d(q5.ERROR, "Could not serialize serializable", th5);
                    }
                    if (bArr2 != null) {
                        g5.a(str, bArr2.length, j);
                        return bArr2;
                    }
                } else {
                    vh2 vh2Var = aVar.c;
                    if (vh2Var != null && (bArr = (byte[]) vh2Var.call()) != null) {
                        g5.a(str, bArr.length, j);
                        return bArr;
                    }
                }
                throw new io.sentry.exception.c(ib8.j("Couldn't attach the attachment ", str, ".\nPlease check that either bytes, serializable, path or provider is set."));
            default:
                File file = (File) obj2;
                u3 u3Var = (u3) obj;
                if (!file.exists()) {
                    throw new io.sentry.exception.c(ib8.j("Dropping profiling trace data, because the file '", file.getName(), "' doesn't exists"));
                }
                try {
                    String str2 = new String(io.sentry.vendor.a.b(io.sentry.util.b.p(j, file.getPath())), "US-ASCII");
                    if (str2.isEmpty()) {
                        throw new io.sentry.exception.c("Profiling trace file is empty");
                    }
                    u3Var.Q0 = str2;
                    try {
                        u3Var.z = (List) u3Var.b.call();
                        break;
                    } catch (Throwable unused) {
                    }
                    try {
                        try {
                            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                            try {
                                BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, g5.d), 512);
                                try {
                                    m1Var.a(bufferedWriter2, u3Var);
                                    byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
                                    bufferedWriter2.close();
                                    byteArrayOutputStream2.close();
                                    file.delete();
                                    return byteArray2;
                                } catch (Throwable th6) {
                                    try {
                                        bufferedWriter2.close();
                                        break;
                                    } catch (Throwable th7) {
                                        th6.addSuppressed(th7);
                                    }
                                    throw th6;
                                }
                            } catch (Throwable th8) {
                                try {
                                    byteArrayOutputStream2.close();
                                    break;
                                } catch (Throwable th9) {
                                    th8.addSuppressed(th9);
                                }
                                throw th8;
                            }
                        } catch (IOException e) {
                            throw new io.sentry.exception.c("Failed to serialize profiling trace data\n" + e.getMessage());
                        }
                    } catch (Throwable th10) {
                        file.delete();
                        throw th10;
                    }
                } catch (UnsupportedEncodingException e2) {
                    qc0.i(e2);
                    return null;
                }
        }
    }

    public /* synthetic */ d5(File file, long j, u3 u3Var, m1 m1Var) {
        this.d = file;
        this.b = j;
        this.e = u3Var;
        this.c = m1Var;
    }
}
