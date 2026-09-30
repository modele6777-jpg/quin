package io.sentry;

import com.adjust.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n3 extends z {
    public static final Charset i = Charset.forName(Constants.ENCODING);
    public final g1 e;
    public final w0 f;
    public final m1 g;
    public final z0 h;

    public n3(g1 g1Var, w0 w0Var, m1 m1Var, z0 z0Var, long j, int i2) {
        super(g1Var, z0Var, j, i2);
        this.e = g1Var;
        io.sentry.util.b.r(w0Var, "Envelope reader is required.");
        this.f = w0Var;
        io.sentry.util.b.r(m1Var, "Serializer is required.");
        this.g = m1Var;
        io.sentry.util.b.r(z0Var, "Logger is required.");
        this.h = z0Var;
    }

    @Override // io.sentry.z
    public final boolean a(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.z
    public final void b(File file, l0 l0Var) {
        boolean zA = a(file.getName());
        z0 z0Var = this.h;
        try {
            if (!zA) {
                z0Var.i(q5.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    io.sentry.internal.debugmeta.c cVarA = this.f.a(bufferedInputStream);
                    if (cVarA == null) {
                        z0Var.i(q5.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        e(cVarA, l0Var);
                        z0Var.i(q5.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    Object objB = l0Var.b("sentry:typeCheckHint");
                    if (!io.sentry.hints.h.class.isInstance(l0Var.b("sentry:typeCheckHint")) || objB == null) {
                        io.sentry.util.b.n(io.sentry.hints.h.class, objB, z0Var);
                    } else {
                        d(file, (io.sentry.hints.h) objB);
                    }
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (IOException e) {
                z0Var.d(q5.ERROR, "Error processing envelope.", e);
                Object objB2 = l0Var.b("sentry:typeCheckHint");
                if (!io.sentry.hints.h.class.isInstance(l0Var.b("sentry:typeCheckHint")) || objB2 == null) {
                    io.sentry.util.b.n(io.sentry.hints.h.class, objB2, z0Var);
                } else {
                    d(file, (io.sentry.hints.h) objB2);
                }
            }
        } catch (Throwable th3) {
            Object objB3 = l0Var.b("sentry:typeCheckHint");
            if (!io.sentry.hints.h.class.isInstance(l0Var.b("sentry:typeCheckHint")) || objB3 == null) {
                io.sentry.util.b.n(io.sentry.hints.h.class, objB3, z0Var);
            } else {
                d(file, (io.sentry.hints.h) objB3);
            }
            throw th3;
        }
    }

    public final w3 c(k7 k7Var) {
        String str;
        z0 z0Var = this.h;
        if (k7Var != null && (str = k7Var.g) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(str));
                if (io.sentry.util.b.m(dValueOf, false)) {
                    String str2 = k7Var.v;
                    if (str2 != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(str2));
                        if (io.sentry.util.b.m(dValueOf2, false)) {
                            return new w3(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return io.sentry.util.b.b(new w3(Boolean.TRUE, dValueOf));
                }
                z0Var.i(q5.ERROR, "Invalid sample rate parsed from TraceContext: %s", str);
            } catch (Exception unused) {
                z0Var.i(q5.ERROR, "Unable to parse sample rate from TraceContext: %s", str);
            }
        }
        return new w3(Boolean.TRUE, (Double) null);
    }

    public final /* synthetic */ void d(File file, io.sentry.hints.h hVar) {
        z0 z0Var = this.h;
        if (hVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            z0Var.i(q5.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e) {
            z0Var.c(q5.ERROR, e, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x025f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:96:0x0237  */
    public final void e(io.sentry.internal.debugmeta.c cVar, l0 l0Var) {
        int size;
        Object objB;
        q5 q5Var = q5.DEBUG;
        Iterable iterable = (Iterable) cVar.c;
        b5 b5Var = (b5) cVar.b;
        io.sentry.protocol.w wVar = b5Var.a;
        if (iterable instanceof Collection) {
            size = ((Collection) iterable).size();
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (it.hasNext()) {
                it.next();
                i2++;
            }
            size = i2;
        }
        Object[] objArr = {Integer.valueOf(size)};
        z0 z0Var = this.h;
        z0Var.i(q5Var, "Processing Envelope with %d item(s)", objArr);
        Iterator it2 = iterable.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            g5 g5Var = (g5) it2.next();
            int i4 = i3 + 1;
            h5 h5Var = g5Var.a;
            h5 h5Var2 = g5Var.a;
            p5 p5Var = h5Var.e;
            boolean zEquals = p5.Event.equals(h5Var.e);
            m1 m1Var = this.g;
            Iterator it3 = it2;
            Charset charset = i;
            g1 g1Var = this.e;
            if (zEquals) {
                try {
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g5Var.g()), charset));
                        try {
                            i5 i5Var = (i5) m1Var.b(bufferedReader, i5.class);
                            if (i5Var == null) {
                                z0Var.i(q5.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i4), h5Var2.e);
                            } else {
                                io.sentry.protocol.u uVar = i5Var.c;
                                if (uVar != null) {
                                    String str = uVar.a;
                                    if (str.startsWith("sentry.javascript") || str.startsWith("sentry.dart") || str.startsWith("sentry.dotnet")) {
                                        l0Var.d(Boolean.TRUE, "sentry:isFromHybridSdk");
                                    }
                                }
                                if (wVar == null || wVar.equals(i5Var.a)) {
                                    g1Var.C(i5Var, l0Var);
                                    z0Var.i(q5.DEBUG, "Item %d is being captured.", Integer.valueOf(i4));
                                    if (!f(l0Var)) {
                                        z0Var.i(q5.WARNING, "Timed out waiting for event id submission: %s", i5Var.a);
                                        bufferedReader.close();
                                        return;
                                    }
                                } else {
                                    z0Var.i(q5.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i4), b5Var.a, i5Var.a);
                                    bufferedReader.close();
                                }
                            }
                            bufferedReader.close();
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
                        th = th3;
                        z0Var.d(q5.ERROR, "Item failed to process.", th);
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
                objB = l0Var.b("sentry:typeCheckHint");
                if (!(objB instanceof io.sentry.hints.k) && !((io.sentry.hints.k) objB).e()) {
                    z0Var.i(q5.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i4));
                    return;
                }
                Object objB2 = l0Var.b("sentry:typeCheckHint");
                if (!io.sentry.android.core.w0.class.isInstance(l0Var.b("sentry:typeCheckHint")) && objB2 != null) {
                    io.sentry.android.core.w0 w0Var = (io.sentry.android.core.w0) objB2;
                    w0Var.c = new CountDownLatch(1);
                    w0Var.a = false;
                    w0Var.b = false;
                }
                it2 = it3;
                i3 = i4;
            } else {
                if (p5.Transaction.equals(p5Var)) {
                    try {
                        try {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g5Var.g()), charset));
                            try {
                                io.sentry.protocol.f0 f0Var = (io.sentry.protocol.f0) m1Var.b(bufferedReader2, io.sentry.protocol.f0.class);
                                if (f0Var == null) {
                                    z0Var.i(q5.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i4), h5Var2.e);
                                } else if (wVar == null || wVar.equals(f0Var.a)) {
                                    k7 k7Var = b5Var.c;
                                    if (f0Var.b.j() != null) {
                                        f0Var.b.j().a(c(k7Var));
                                    }
                                    g1Var.z(f0Var, k7Var, l0Var, null);
                                    z0Var.i(q5.DEBUG, "Item %d is being captured.", Integer.valueOf(i4));
                                    if (!f(l0Var)) {
                                        z0Var.i(q5.WARNING, "Timed out waiting for event id submission: %s", f0Var.a);
                                        bufferedReader2.close();
                                        return;
                                    }
                                } else {
                                    z0Var.i(q5.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i4), b5Var.a, f0Var.a);
                                    bufferedReader2.close();
                                }
                                bufferedReader2.close();
                            } catch (Throwable th5) {
                                try {
                                    bufferedReader2.close();
                                    throw th5;
                                } catch (Throwable th6) {
                                    th5.addSuppressed(th6);
                                    throw th5;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            z0Var.d(q5.ERROR, "Item failed to process.", th);
                            objB = l0Var.b("sentry:typeCheckHint");
                            if (!(objB instanceof io.sentry.hints.k)) {
                            }
                            Object objB3 = l0Var.b("sentry:typeCheckHint");
                            if (!io.sentry.android.core.w0.class.isInstance(l0Var.b("sentry:typeCheckHint"))) {
                            }
                            it2 = it3;
                            i3 = i4;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                    }
                } else {
                    g1Var.h(new io.sentry.internal.debugmeta.c(wVar, b5Var.b, g5Var), l0Var);
                    z0Var.i(q5.DEBUG, "%s item %d is being captured.", p5Var.getItemType(), Integer.valueOf(i4));
                    if (!f(l0Var)) {
                        z0Var.i(q5.WARNING, "Timed out waiting for item type submission: %s", p5Var.getItemType());
                        return;
                    }
                }
                objB = l0Var.b("sentry:typeCheckHint");
                if (!(objB instanceof io.sentry.hints.k)) {
                }
                Object objB4 = l0Var.b("sentry:typeCheckHint");
                if (!io.sentry.android.core.w0.class.isInstance(l0Var.b("sentry:typeCheckHint"))) {
                }
                it2 = it3;
                i3 = i4;
            }
            it2 = it3;
            i3 = i4;
        }
    }

    public final boolean f(l0 l0Var) {
        Object objB = l0Var.b("sentry:typeCheckHint");
        if (objB instanceof io.sentry.hints.f) {
            return ((io.sentry.hints.f) objB).d();
        }
        io.sentry.util.b.n(io.sentry.hints.f.class, objB, this.h);
        return true;
    }
}
