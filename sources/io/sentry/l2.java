package io.sentry;

import com.adjust.sdk.Constants;
import defpackage.sug;
import io.sentry.protocol.DebugImage;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class l2 implements m1 {
    public static final Charset c = Charset.forName(Constants.ENCODING);
    public final q6 a;
    public final HashMap b;

    public l2(q6 q6Var) {
        this.a = q6Var;
        HashMap map = new HashMap();
        this.b = map;
        map.put(io.sentry.protocol.a.class, new io.sentry.clientreport.a(4));
        map.put(g.class, new f(0));
        map.put(io.sentry.protocol.d.class, new io.sentry.clientreport.a(5));
        map.put(io.sentry.protocol.e.class, new io.sentry.clientreport.a(6));
        map.put(DebugImage.class, new io.sentry.clientreport.a(7));
        map.put(io.sentry.protocol.f.class, new io.sentry.clientreport.a(8));
        map.put(io.sentry.protocol.h.class, new io.sentry.clientreport.a(9));
        map.put(io.sentry.protocol.g.class, new io.sentry.clientreport.a(10));
        map.put(io.sentry.protocol.k.class, new io.sentry.clientreport.a(12));
        map.put(io.sentry.protocol.m.class, new io.sentry.clientreport.a(14));
        map.put(io.sentry.protocol.b0.class, new io.sentry.clientreport.a(29));
        map.put(io.sentry.protocol.n.class, new io.sentry.clientreport.a(15));
        map.put(io.sentry.protocol.o.class, new io.sentry.clientreport.a(16));
        map.put(io.sentry.protocol.p.class, new io.sentry.clientreport.a(17));
        map.put(io.sentry.protocol.q.class, new io.sentry.clientreport.a(18));
        map.put(r3.class, new f(1));
        map.put(s3.class, new f(2));
        map.put(u3.class, new f(3));
        map.put(v3.class, new f(4));
        map.put(io.sentry.profilemeasurements.a.class, new io.sentry.clientreport.a(2));
        map.put(io.sentry.profilemeasurements.b.class, new io.sentry.clientreport.a(3));
        map.put(io.sentry.protocol.r.class, new io.sentry.clientreport.a(19));
        map.put(a4.class, new f(5));
        map.put(io.sentry.rrweb.a.class, new io.sentry.protocol.d0(9));
        map.put(io.sentry.rrweb.c.class, new io.sentry.protocol.d0(10));
        map.put(io.sentry.rrweb.g.class, new io.sentry.protocol.d0(12));
        map.put(io.sentry.rrweb.i.class, new io.sentry.protocol.d0(14));
        map.put(io.sentry.rrweb.j.class, new io.sentry.protocol.d0(16));
        map.put(io.sentry.rrweb.l.class, new io.sentry.protocol.d0(17));
        map.put(io.sentry.rrweb.m.class, new io.sentry.protocol.d0(18));
        map.put(io.sentry.protocol.t.class, new io.sentry.clientreport.a(20));
        map.put(io.sentry.protocol.u.class, new io.sentry.clientreport.a(21));
        map.put(b5.class, new f(7));
        map.put(h5.class, new f(8));
        map.put(i5.class, new f(9));
        map.put(io.sentry.protocol.v.class, new io.sentry.clientreport.a(22));
        map.put(p5.class, new f(10));
        map.put(q5.class, new f(11));
        map.put(r5.class, new f(12));
        map.put(t5.class, new f(15));
        map.put(x5.class, new f(18));
        map.put(io.sentry.protocol.x.class, new io.sentry.clientreport.a(24));
        map.put(io.sentry.protocol.y.class, new io.sentry.clientreport.a(25));
        map.put(s6.class, new f(19));
        map.put(io.sentry.protocol.z.class, new io.sentry.clientreport.a(26));
        map.put(io.sentry.protocol.a0.class, new io.sentry.clientreport.a(27));
        map.put(io.sentry.protocol.c0.class, new io.sentry.clientreport.a(28));
        map.put(r4.class, new f(6));
        map.put(io.sentry.protocol.e0.class, new io.sentry.protocol.d0(0));
        map.put(io.sentry.protocol.f0.class, new io.sentry.protocol.d0(1));
        map.put(c7.class, new f(21));
        map.put(e7.class, new f(22));
        map.put(g7.class, new f(23));
        map.put(h7.class, new f(24));
        map.put(io.sentry.protocol.i0.class, new io.sentry.protocol.d0(2));
        map.put(io.sentry.protocol.l.class, new io.sentry.clientreport.a(13));
        map.put(p7.class, new f(26));
        map.put(io.sentry.clientreport.b.class, new io.sentry.clientreport.a(0));
        map.put(io.sentry.protocol.k0.class, new io.sentry.protocol.d0(4));
        map.put(io.sentry.protocol.j0.class, new io.sentry.protocol.d0(3));
    }

    @Override // io.sentry.m1
    public final void a(Writer writer, Object obj) throws IOException {
        io.sentry.util.b.r(obj, "The entity is required.");
        q6 q6Var = this.a;
        z0 logger = q6Var.getLogger();
        q5 q5Var = q5.DEBUG;
        if (logger.k(q5Var)) {
            q6Var.getLogger().i(q5Var, "Serializing object: %s", f(obj, q6Var.isEnablePrettySerializationOutput()));
        }
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(writer, q6Var.getMaxDepth());
        ((sug) cVar.c).t(cVar, q6Var.getLogger(), obj);
        writer.flush();
    }

    @Override // io.sentry.m1
    public final Object b(Reader reader, Class cls) {
        Object objD0;
        q6 q6Var = this.a;
        try {
            j2 j2Var = new j2(reader);
            try {
                y1 y1Var = (y1) this.b.get(cls);
                if (y1Var != null) {
                    objD0 = cls.cast(y1Var.a(j2Var, q6Var.getLogger()));
                } else {
                    if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
                        j2Var.close();
                        return null;
                    }
                    objD0 = j2Var.D0();
                }
                j2Var.close();
                return objD0;
            } catch (Throwable th) {
                try {
                    j2Var.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e) {
            q6Var.getLogger().d(q5.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.m1
    public final io.sentry.internal.debugmeta.c c(BufferedInputStream bufferedInputStream) {
        q6 q6Var = this.a;
        try {
            return q6Var.getEnvelopeReader().a(bufferedInputStream);
        } catch (IOException e) {
            q6Var.getLogger().d(q5.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.m1
    public final String d(Map map) {
        return f(map, false);
    }

    @Override // io.sentry.m1
    public final void e(io.sentry.internal.debugmeta.c cVar, OutputStream outputStream) throws IOException {
        q6 q6Var = this.a;
        io.sentry.util.b.r(cVar, "The SentryEnvelope object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), c), 512);
        try {
            ((b5) cVar.b).serialize(new io.sentry.internal.debugmeta.c(bufferedWriter, q6Var.getMaxDepth()), q6Var.getLogger());
            bufferedWriter.write("\n");
            for (g5 g5Var : (Iterable) cVar.c) {
                try {
                    byte[] bArrG = g5Var.g();
                    g5Var.a.serialize(new io.sentry.internal.debugmeta.c(bufferedWriter, q6Var.getMaxDepth()), q6Var.getLogger());
                    bufferedWriter.write("\n");
                    bufferedWriter.flush();
                    outputStream.write(bArrG);
                    bufferedWriter.write("\n");
                } catch (Exception e) {
                    q6Var.getLogger().d(q5.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
            bufferedWriter.flush();
        } catch (Throwable th) {
            bufferedWriter.flush();
            throw th;
        }
    }

    public final String f(Object obj, boolean z) throws IOException {
        StringWriter stringWriter = new StringWriter();
        q6 q6Var = this.a;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(stringWriter, q6Var.getMaxDepth());
        if (z) {
            cVar.t("\t");
        }
        ((sug) cVar.c).t(cVar, q6Var.getLogger(), obj);
        return stringWriter.toString();
    }
}
