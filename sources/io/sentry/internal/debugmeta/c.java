package io.sentry.internal.debugmeta;

import android.content.Context;
import com.adjust.sdk.sig.r3;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import defpackage.gxc;
import defpackage.j09;
import defpackage.je9;
import defpackage.qc0;
import defpackage.r82;
import defpackage.sug;
import defpackage.uwc;
import defpackage.yg5;
import io.sentry.b5;
import io.sentry.clientreport.d;
import io.sentry.clientreport.e;
import io.sentry.clientreport.f;
import io.sentry.g5;
import io.sentry.h5;
import io.sentry.m3;
import io.sentry.p;
import io.sentry.p5;
import io.sentry.protocol.f0;
import io.sentry.protocol.u;
import io.sentry.protocol.w;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.z0;
import java.io.BufferedInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.Writer;
import java.lang.reflect.Field;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements a, z0, m3, f {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public c(z0 z0Var, int i) {
        this.a = i;
        switch (i) {
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                this.b = io.sentry.config.a.u(z0Var, "androidx.compose.ui.platform.TestTagElement");
                this.c = io.sentry.config.a.u(z0Var, "io.sentry.compose.SentryModifier$SentryTagModifierNodeElement");
                break;
            default:
                ClassLoader classLoader = c.class.getClassLoader();
                this.b = z0Var;
                this.c = io.sentry.util.b.d(classLoader);
                break;
        }
    }

    public static p l(p5 p5Var) {
        if (p5.Event.equals(p5Var)) {
            return p.Error;
        }
        if (p5.Session.equals(p5Var)) {
            return p.Session;
        }
        if (p5.Transaction.equals(p5Var)) {
            return p.Transaction;
        }
        if (p5.UserFeedback.equals(p5Var)) {
            return p.UserReport;
        }
        if (p5.Feedback.equals(p5Var)) {
            return p.Feedback;
        }
        if (p5.Profile.equals(p5Var)) {
            return p.Profile;
        }
        if (p5.ProfileChunk.equals(p5Var)) {
            return p.ProfileChunkUi;
        }
        if (p5.Attachment.equals(p5Var)) {
            return p.Attachment;
        }
        if (p5.CheckIn.equals(p5Var)) {
            return p.Monitor;
        }
        if (p5.ReplayVideo.equals(p5Var)) {
            return p.Replay;
        }
        if (p5.Log.equals(p5Var)) {
            return p.LogItem;
        }
        if (p5.Span.equals(p5Var)) {
            return p.Span;
        }
        return p5.TraceMetric.equals(p5Var) ? p.TraceMetric : p.Default;
    }

    public c A(boolean z) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        cVar.G();
        cVar.b();
        cVar.a.write(z ? "true" : "false");
        return this;
    }

    @Override // io.sentry.clientreport.f
    public void a(d dVar, p pVar) {
        f(dVar, pVar, 1L);
    }

    @Override // io.sentry.internal.debugmeta.a
    public List b() {
        switch (this.a) {
            case 0:
                z0 z0Var = (z0) this.b;
                ArrayList arrayList = new ArrayList();
                try {
                    Enumeration<URL> resources = ((ClassLoader) this.c).getResources("sentry-debug-meta.properties");
                    while (resources.hasMoreElements()) {
                        URL urlNextElement = resources.nextElement();
                        try {
                            InputStream inputStreamOpenStream = FirebasePerfUrlConnection.openStream(urlNextElement);
                            try {
                                Properties properties = new Properties();
                                properties.load(inputStreamOpenStream);
                                arrayList.add(properties);
                                z0Var.i(q5.INFO, "Debug Meta Data Properties loaded from %s", urlNextElement);
                                if (inputStreamOpenStream != null) {
                                    inputStreamOpenStream.close();
                                }
                            } catch (Throwable th) {
                                if (inputStreamOpenStream != null) {
                                    try {
                                        inputStreamOpenStream.close();
                                    } catch (Throwable th2) {
                                        th.addSuppressed(th2);
                                    }
                                    break;
                                }
                                throw th;
                            }
                        } catch (RuntimeException e) {
                            z0Var.c(q5.ERROR, e, "%s file is malformed.", urlNextElement);
                        }
                    }
                } catch (IOException e2) {
                    z0Var.c(q5.ERROR, e2, "Failed to load %s", "sentry-debug-meta.properties");
                }
                if (!arrayList.isEmpty()) {
                    return arrayList;
                }
                z0Var.i(q5.INFO, "No %s file was found.", "sentry-debug-meta.properties");
                return null;
            default:
                z0 z0Var2 = (z0) this.b;
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(((Context) this.c).getAssets().open("sentry-debug-meta.properties"));
                    try {
                        Properties properties2 = new Properties();
                        properties2.load(bufferedInputStream);
                        List listSingletonList = Collections.singletonList(properties2);
                        bufferedInputStream.close();
                        return listSingletonList;
                    } catch (Throwable th3) {
                        try {
                            bufferedInputStream.close();
                            break;
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (FileNotFoundException unused) {
                    z0Var2.i(q5.INFO, "%s file was not found.", "sentry-debug-meta.properties");
                    return null;
                } catch (IOException e3) {
                    z0Var2.d(q5.ERROR, "Error getting Proguard UUIDs.", e3);
                    return null;
                } catch (RuntimeException e4) {
                    z0Var2.c(q5.ERROR, e4, "%s file is malformed.", "sentry-debug-meta.properties");
                    return null;
                }
        }
    }

    @Override // io.sentry.z0
    public void c(q5 q5Var, Throwable th, String str, Object... objArr) {
        z0 z0Var = (z0) this.b;
        if (k(q5Var)) {
            z0Var.c(q5Var, th, str, objArr);
        }
    }

    @Override // io.sentry.z0
    public void d(q5 q5Var, String str, Throwable th) {
        z0 z0Var = (z0) this.b;
        if (k(q5Var)) {
            z0Var.d(q5Var, str, th);
        }
    }

    @Override // io.sentry.clientreport.f
    public void e(d dVar, c cVar) {
        if (cVar == null) {
            return;
        }
        try {
            Iterator it = ((Iterable) cVar.c).iterator();
            while (it.hasNext()) {
                g(dVar, (g5) it.next());
            }
        } catch (Throwable th) {
            ((q6) this.c).getLogger().c(q5.ERROR, th, "Unable to record lost envelope.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.f
    public void f(d dVar, p pVar, long j) {
        try {
            r(dVar.getReason(), pVar.getCategory(), Long.valueOf(j));
            n();
        } catch (Throwable th) {
            ((q6) this.c).getLogger().c(q5.ERROR, th, "Unable to record lost event.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.f
    public void g(d dVar, g5 g5Var) {
        q6 q6Var = (q6) this.c;
        if (g5Var == null) {
            return;
        }
        try {
            h5 h5Var = g5Var.a;
            p5 p5Var = h5Var.e;
            if (p5.ClientReport.equals(p5Var)) {
                try {
                    s(g5Var.f(q6Var.getSerializer()));
                    return;
                } catch (Exception unused) {
                    q6Var.getLogger().i(q5.ERROR, "Unable to restore counts from previous client report.", new Object[0]);
                    return;
                }
            }
            p pVarL = l(p5Var);
            if (pVarL.equals(p.Transaction)) {
                f0 f0VarH = g5Var.h(q6Var.getSerializer());
                if (f0VarH != null) {
                    ArrayList arrayList = f0VarH.H0;
                    r(dVar.getReason(), p.Span.getCategory(), Long.valueOf(((long) arrayList.size()) + 1));
                    arrayList.size();
                    n();
                }
                r(dVar.getReason(), pVarL.getCategory(), 1L);
                n();
                return;
            }
            if (pVarL.equals(p.LogItem)) {
                Integer num = h5Var.b;
                r(dVar.getReason(), pVarL.getCategory(), Long.valueOf(num != null ? num.intValue() : 1L));
                r(dVar.getReason(), p.LogByte.getCategory(), Long.valueOf(g5Var.g().length));
                n();
                return;
            }
            if (!pVarL.equals(p.TraceMetric)) {
                r(dVar.getReason(), pVarL.getCategory(), 1L);
                n();
            } else {
                Integer num2 = h5Var.b;
                r(dVar.getReason(), pVarL.getCategory(), Long.valueOf(num2 != null ? num2.intValue() : 1L));
                r(dVar.getReason(), p.TraceMetricByte.getCategory(), Long.valueOf(g5Var.g().length));
                n();
            }
        } catch (Throwable th) {
            q6Var.getLogger().c(q5.ERROR, th, "Unable to record lost envelope item.", new Object[0]);
        }
    }

    @Override // io.sentry.clientreport.f
    public c h(c cVar) {
        q6 q6Var = (q6) this.c;
        Date date = new Date();
        io.sentry.d dVar = (io.sentry.d) this.b;
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : ((Map) ((io.sentry.util.f) dVar.b).a()).entrySet()) {
            long andSet = ((AtomicLong) entry.getValue()).getAndSet(0L);
            Long lValueOf = Long.valueOf(andSet);
            if (andSet > 0) {
                arrayList.add(new e(((io.sentry.clientreport.c) entry.getKey()).a, ((io.sentry.clientreport.c) entry.getKey()).b, lValueOf));
            }
        }
        io.sentry.clientreport.b bVar = arrayList.isEmpty() ? null : new io.sentry.clientreport.b(date, arrayList);
        if (bVar == null) {
            return cVar;
        }
        try {
            q6Var.getLogger().i(q5.DEBUG, "Attaching client report to envelope.", new Object[0]);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = ((Iterable) cVar.c).iterator();
            while (it.hasNext()) {
                arrayList2.add((g5) it.next());
            }
            arrayList2.add(g5.b(q6Var.getSerializer(), bVar));
            return new c((b5) cVar.b, arrayList2);
        } catch (Throwable th) {
            q6Var.getLogger().c(q5.ERROR, th, "Unable to attach client report to envelope.", new Object[0]);
            return cVar;
        }
    }

    @Override // io.sentry.z0
    public void i(q5 q5Var, String str, Object... objArr) {
        z0 z0Var = (z0) this.b;
        if (k(q5Var)) {
            z0Var.i(q5Var, str, objArr);
        }
    }

    public c j() {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        cVar.G();
        cVar.b();
        int i = cVar.c;
        int[] iArrCopyOf = cVar.b;
        if (i == iArrCopyOf.length) {
            iArrCopyOf = Arrays.copyOf(iArrCopyOf, i * 2);
            cVar.b = iArrCopyOf;
        }
        int i2 = cVar.c;
        cVar.c = i2 + 1;
        iArrCopyOf[i2] = 3;
        cVar.a.write(123);
        return this;
    }

    @Override // io.sentry.z0
    public boolean k(q5 q5Var) {
        q6 q6Var = (q6) this.c;
        return q5Var != null && q6Var.isDebug() && q5Var.ordinal() >= q6Var.getDiagnosticLevel().ordinal();
    }

    public c m() {
        ((io.sentry.vendor.gson.stream.c) this.b).h(3, 5, '}');
        return this;
    }

    public void n() {
        ((q6) this.c).getOnDiscard();
    }

    public String o(j09 j09Var) {
        Field field;
        Field field2;
        j09Var.getClass();
        String name = j09Var.getClass().getName();
        try {
            if ("androidx.compose.ui.platform.TestTagElement".equals(name) && (field2 = (Field) this.b) != null) {
                return (String) field2.get(j09Var);
            }
            if ("io.sentry.compose.SentryModifier$SentryTagModifierNodeElement".equals(name) && (field = (Field) this.c) != null) {
                return (String) field.get(j09Var);
            }
            if (!(j09Var instanceof uwc)) {
                return null;
            }
            for (Map.Entry entry : ((uwc) j09Var).T0()) {
                gxc gxcVar = (gxc) entry.getKey();
                Object value = entry.getValue();
                String str = gxcVar.a;
                if ("SentryTag".equals(str) || "TestTag".equals(str)) {
                    if (value instanceof String) {
                        return (String) value;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
        }
    }

    public byte[] p() {
        byte[] bArr = (byte[]) this.b;
        if (bArr == null) {
            bArr = (byte[]) ((Callable) this.c).call();
            this.b = bArr;
        }
        return bArr != null ? bArr : new byte[0];
    }

    public c q(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        if (str == null) {
            r82.g("name == null");
            return null;
        }
        if (cVar.g != null) {
            r3.l();
            return null;
        }
        if (cVar.c != 0) {
            cVar.g = str;
            return this;
        }
        qc0.p("JsonWriter is closed.");
        return null;
    }

    public void r(String str, String str2, Long l) {
        AtomicLong atomicLong = (AtomicLong) ((Map) ((io.sentry.util.f) ((io.sentry.d) this.b).b).a()).get(new io.sentry.clientreport.c(str, str2));
        if (atomicLong != null) {
            atomicLong.addAndGet(l.longValue());
        }
    }

    public void s(io.sentry.clientreport.b bVar) {
        if (bVar == null) {
            return;
        }
        for (e eVar : bVar.b) {
            r(eVar.a, eVar.b, eVar.c);
        }
    }

    public void t(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        if (str == null || str.length() == 0) {
            cVar.d = null;
            cVar.e = ":";
        } else {
            cVar.d = str;
            cVar.e = ": ";
        }
    }

    public c u(double d) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        cVar.G();
        if (!cVar.f && (Double.isNaN(d) || Double.isInfinite(d))) {
            r3.j("Numeric values must be finite, but was ", d);
            return null;
        }
        cVar.b();
        cVar.a.append((CharSequence) Double.toString(d));
        return this;
    }

    public c v(long j) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        cVar.G();
        cVar.b();
        cVar.a.write(Long.toString(j));
        return this;
    }

    public c w(z0 z0Var, Object obj) throws IOException {
        ((sug) this.c).t(this, z0Var, obj);
        return this;
    }

    public c x(Boolean bool) throws IOException {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        if (bool == null) {
            cVar.u();
            return this;
        }
        cVar.G();
        cVar.b();
        cVar.a.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public c y(Number number) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        if (number == null) {
            cVar.u();
            return this;
        }
        cVar.G();
        String string = number.toString();
        if (!cVar.f && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            yg5.l(number, "Numeric values must be finite, but was ");
            return null;
        }
        cVar.b();
        cVar.a.append((CharSequence) string);
        return this;
    }

    public c z(String str) {
        io.sentry.vendor.gson.stream.c cVar = (io.sentry.vendor.gson.stream.c) this.b;
        if (str == null) {
            cVar.u();
            return this;
        }
        cVar.G();
        cVar.b();
        cVar.E(str);
        return this;
    }

    public /* synthetic */ c(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public c() {
        this.a = 12;
        this.c = "manual";
    }

    public c(Writer writer, int i) {
        this.a = 2;
        this.b = new io.sentry.vendor.gson.stream.c(writer);
        this.c = new sug(i, 23);
    }

    public c(String str, HashMap map) {
        this.a = 3;
        io.sentry.util.b.r(str, "url is required");
        try {
            this.b = URI.create(str).toURL();
            this.c = map;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException("Failed to compose the Sentry's server URL.", e);
        }
    }

    public c(q6 q6Var) {
        this.a = 10;
        this.c = q6Var;
        this.b = new io.sentry.d(9);
    }

    public /* synthetic */ c(int i, Object obj, Object obj2) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
    }

    public c(Context context, z0 z0Var) {
        this.a = 8;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
        this.b = z0Var;
    }

    public c(b5 b5Var, List list) {
        this.a = 6;
        this.b = b5Var;
        io.sentry.util.b.r(list, "SentryEnvelope items are required.");
        this.c = list;
    }

    public c(w wVar, u uVar, g5 g5Var) {
        this.a = 6;
        this.b = new b5(wVar, uVar, null);
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(g5Var);
        this.c = arrayList;
    }

    public c(Callable callable) {
        this.a = 7;
        this.c = callable;
    }
}
