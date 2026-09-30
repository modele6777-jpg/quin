package io.sentry;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import defpackage.ib8;
import defpackage.uh2;
import defpackage.vh2;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class g5 {
    public static final Charset d = Charset.forName(Constants.ENCODING);
    public final h5 a;
    public final Callable b;
    public byte[] c;

    public g5(h5 h5Var, byte[] bArr) {
        this.a = h5Var;
        this.c = bArr;
        this.b = null;
    }

    public static void a(String str, long j, long j2) throws io.sentry.exception.c {
        if (j > j2) {
            throw new io.sentry.exception.c(String.format("Dropping attachment with filename '%s', because the size of the passed bytes with %d bytes is bigger than the maximum allowed attachment size of %d bytes.", str, Long.valueOf(j), Long.valueOf(j2)));
        }
    }

    public static g5 b(m1 m1Var, io.sentry.clientreport.b bVar) {
        io.sentry.util.b.r(m1Var, "ISerializer is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new vh2(7, m1Var, bVar));
        return new g5(new h5(p5.resolve(bVar), new c5(cVar, 11), "application/json", null, null), new c5(cVar, 12));
    }

    public static g5 c(r3 r3Var, m1 m1Var) throws io.sentry.exception.c {
        File file = r3Var.z;
        if (file == null || !file.exists()) {
            throw new io.sentry.exception.c(ib8.j("Dropping perfetto profile chunk, because the trace file '", file != null ? file.getName() : "null", "' doesn't exist"));
        }
        AtomicReference atomicReference = new AtomicReference(null);
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new f5(m1Var, r3Var, atomicReference, file));
        return new g5(new h5(p5.ProfileChunk, -1, new c5(cVar, 18), r3Var.y, file.getName(), null, r3Var.f, null, new uh2(7, atomicReference)), new c5(cVar, 19));
    }

    public static g5 d(r3 r3Var, m1 m1Var, d1 d1Var) {
        File file = r3Var.z;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new f5(file, r3Var, d1Var, m1Var));
        return new g5(new h5(p5.ProfileChunk, new c5(cVar, 16), "application-json", file != null ? file.getName() : null, null, r3Var.f, null), new c5(cVar, 17));
    }

    public static g5 e(m1 m1Var, c7 c7Var) {
        io.sentry.util.b.r(m1Var, "ISerializer is required.");
        io.sentry.util.b.r(c7Var, "Session is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new vh2(4, m1Var, c7Var));
        return new g5(new h5(p5.Session, new c5(cVar, 0), "application/json", null, null), new c5(cVar, 1));
    }

    public static byte[] i(LinkedHashMap linkedHashMap) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write((byte) (linkedHashMap.size() | UserMetadata.MAX_ROLLOUT_ASSIGNMENTS));
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                byte[] bytes = ((String) entry.getKey()).getBytes(d);
                int length = bytes.length;
                byteArrayOutputStream.write(-39);
                byteArrayOutputStream.write((byte) length);
                byteArrayOutputStream.write(bytes);
                byte[] bArr = (byte[]) entry.getValue();
                int length2 = bArr.length;
                byteArrayOutputStream.write(-58);
                byteArrayOutputStream.write(ByteBuffer.allocate(4).order(ByteOrder.BIG_ENDIAN).putInt(length2).array());
                byteArrayOutputStream.write(bArr);
            }
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            return byteArray;
        } catch (Throwable th) {
            try {
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final io.sentry.clientreport.b f(m1 m1Var) throws IOException {
        if (this.a.e != p5.ClientReport) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g()), d));
        try {
            io.sentry.clientreport.b bVar = (io.sentry.clientreport.b) m1Var.b(bufferedReader, io.sentry.clientreport.b.class);
            bufferedReader.close();
            return bVar;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final byte[] g() {
        Callable callable;
        byte[] bArr = this.c;
        if (bArr != null || (callable = this.b) == null) {
            return bArr;
        }
        byte[] bArr2 = (byte[]) callable.call();
        this.c = bArr2;
        return bArr2;
    }

    public final io.sentry.protocol.f0 h(m1 m1Var) throws IOException {
        if (this.a.e != p5.Transaction) {
            return null;
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(g()), d));
        try {
            io.sentry.protocol.f0 f0Var = (io.sentry.protocol.f0) m1Var.b(bufferedReader, io.sentry.protocol.f0.class);
            bufferedReader.close();
            return f0Var;
        } catch (Throwable th) {
            try {
                bufferedReader.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public g5(h5 h5Var, Callable callable) {
        this.a = h5Var;
        this.b = callable;
        this.c = null;
    }
}
