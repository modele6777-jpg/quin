package io.sentry;

import defpackage.gi2;
import defpackage.vh2;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.Callable;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x4 implements j1 {
    public final SentryAndroidOptions b;
    public final io.sentry.transport.g c;
    public final io.sentry.logger.b e;
    public final io.sentry.metrics.a f;
    public final w4 d = new w4();
    public boolean a = true;

    public x4(SentryAndroidOptions sentryAndroidOptions) {
        this.b = sentryAndroidOptions;
        s1 transportFactory = sentryAndroidOptions.getTransportFactory();
        if (transportFactory instanceof j3) {
            transportFactory = new p2();
            sentryAndroidOptions.setTransportFactory(transportFactory);
        }
        c0 c0VarRetrieveParsedDsn = sentryAndroidOptions.retrieveParsedDsn();
        String sentryClientName = sentryAndroidOptions.getSentryClientName();
        URI uri = c0VarRetrieveParsedDsn.c;
        String string = uri.resolve(uri.getPath() + "/envelope/").toString();
        String str = c0VarRetrieveParsedDsn.b;
        String str2 = c0VarRetrieveParsedDsn.a;
        StringBuilder sb = new StringBuilder("Sentry sentry_version=7,sentry_client=");
        sb.append(sentryClientName);
        sb.append(",sentry_key=");
        sb.append(str);
        sb.append((str2 == null || str2.length() <= 0) ? "" : ",sentry_secret=".concat(str2));
        String string2 = sb.toString();
        HashMap map = new HashMap();
        map.put("User-Agent", sentryClientName);
        map.put("X-Sentry-Auth", string2);
        this.c = transportFactory.m(sentryAndroidOptions, new io.sentry.internal.debugmeta.c(string, map));
        if (sentryAndroidOptions.getLogs().a) {
            this.e = sentryAndroidOptions.getLogs().b.b(sentryAndroidOptions, this);
        } else {
            this.e = io.sentry.logger.e.b;
        }
        if (sentryAndroidOptions.getMetrics().a) {
            this.f = sentryAndroidOptions.getMetrics().b.mo19b(sentryAndroidOptions, this);
        } else {
            this.f = io.sentry.metrics.d.a;
        }
    }

    public static ArrayList r(l0 l0Var) {
        ArrayList arrayList = new ArrayList(l0Var.b);
        a aVar = l0Var.d;
        if (aVar != null) {
            arrayList.add(aVar);
        }
        a aVar2 = l0Var.e;
        if (aVar2 != null) {
            arrayList.add(aVar2);
        }
        a aVar3 = l0Var.f;
        if (aVar3 != null) {
            arrayList.add(aVar3);
        }
        a aVar4 = l0Var.g;
        if (aVar4 != null) {
            arrayList.add(aVar4);
        }
        return arrayList;
    }

    @Override // io.sentry.j1
    public final void a(boolean z) {
        long shutdownTimeoutMillis;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getLogger().i(q5.INFO, "Closing SentryClient.", new Object[0]);
        if (z) {
            shutdownTimeoutMillis = 0;
        } else {
            try {
                shutdownTimeoutMillis = sentryAndroidOptions.getShutdownTimeoutMillis();
            } catch (IOException e) {
                sentryAndroidOptions.getLogger().d(q5.WARNING, "Failed to close the connection to the Sentry Server.", e);
            }
        }
        e(shutdownTimeoutMillis);
        this.e.a(z);
        this.f.a(z);
        this.c.a(z);
        for (f0 f0Var : sentryAndroidOptions.getEventProcessors()) {
            if (f0Var instanceof Closeable) {
                try {
                    ((Closeable) f0Var).close();
                } catch (IOException e2) {
                    sentryAndroidOptions.getLogger().i(q5.WARNING, "Failed to close the event processor {}.", f0Var, e2);
                }
            }
        }
        this.a = false;
    }

    @Override // io.sentry.j1
    public final void b(c7 c7Var, l0 l0Var) {
        io.sentry.util.b.r(c7Var, "Session is required.");
        String str = c7Var.X;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (str == null || str.isEmpty()) {
            sentryAndroidOptions.getLogger().i(q5.WARNING, "Sessions can't be captured without setting a release.", new Object[0]);
            return;
        }
        try {
            m1 serializer = sentryAndroidOptions.getSerializer();
            io.sentry.protocol.u sdkVersion = sentryAndroidOptions.getSdkVersion();
            io.sentry.util.b.r(serializer, "Serializer is required.");
            h(new io.sentry.internal.debugmeta.c((io.sentry.protocol.w) null, sdkVersion, g5.e(serializer, c7Var)), l0Var);
        } catch (IOException e) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to capture session.", e);
        }
    }

    @Override // io.sentry.j1
    public final io.sentry.protocol.w c(s6 s6Var, e1 e1Var, l0 l0Var) {
        if (io.sentry.util.m.a()) {
            return io.sentry.protocol.w.b;
        }
        if (y(s6Var, l0Var)) {
            io.sentry.protocol.r rVar = s6Var.d;
            io.sentry.protocol.e eVar = s6Var.b;
            if (rVar == null) {
                s6Var.d = e1Var.h();
            }
            if (s6Var.w == null) {
                s6Var.w = e1Var.M();
            }
            if (s6Var.e == null) {
                s6Var.c(e1Var.B());
            } else {
                for (Map.Entry entry : e1Var.B().entrySet()) {
                    if (!s6Var.e.containsKey(entry.getKey())) {
                        s6Var.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new io.sentry.protocol.e(e1Var.F()).a.entrySet()) {
                if (!eVar.b(entry2.getKey())) {
                    eVar.l(entry2.getValue(), (String) entry2.getKey());
                }
            }
            o1 o1VarB = e1Var.b();
            if (eVar.j() == null) {
                if (o1VarB == null) {
                    eVar.w(m7.b(e1Var.x()));
                } else {
                    eVar.w(o1VarB.u());
                }
            }
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Capturing session replay: %s", s6Var.a);
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        io.sentry.protocol.w wVar2 = s6Var.a;
        if (wVar2 != null) {
            wVar = wVar2;
        }
        for (f0 f0Var : sentryAndroidOptions.getEventProcessors()) {
            try {
                s6Var = f0Var.b(s6Var, l0Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().c(q5.ERROR, th, "An exception occurred while processing replay event by processor: %s", f0Var.getClass().getName());
            }
            if (s6Var == null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Replay event was dropped by a processor: %s", f0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, p.Replay);
                break;
            }
        }
        if (s6Var != null) {
            sentryAndroidOptions.getBeforeSendReplay();
        }
        if (s6Var == null) {
            return io.sentry.protocol.w.b;
        }
        try {
            io.sentry.internal.debugmeta.c cVarQ = q(s6Var, l0Var.h, s(e1Var, l0Var, s6Var, null), io.sentry.hints.b.class.isInstance(l0Var.b("sentry:typeCheckHint")));
            l0Var.a();
            this.c.x0(cVarQ, l0Var);
            return wVar;
        } catch (IOException e) {
            sentryAndroidOptions.getLogger().c(q5.WARNING, e, "Capturing event %s failed.", wVar);
            return io.sentry.protocol.w.b;
        }
    }

    @Override // io.sentry.j1
    public final void d(s5 s5Var, e1 e1Var) {
        s5 s5VarV;
        if (io.sentry.util.m.a() || (s5VarV = v(s5Var, e1Var.N())) == null) {
            return;
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        s5 s5VarV2 = v(s5VarV, sentryAndroidOptions.getEventProcessors());
        if (s5VarV2 == null) {
            return;
        }
        sentryAndroidOptions.getLogs().getClass();
        this.e.c(s5VarV2);
    }

    @Override // io.sentry.j1
    public final void e(long j) {
        this.e.e(j);
        this.f.e(j);
        this.c.e(j);
    }

    @Override // io.sentry.j1
    public final io.sentry.android.core.internal.tombstone.b f() {
        return this.c.f();
    }

    @Override // io.sentry.j1
    public final boolean g() {
        return this.c.g();
    }

    @Override // io.sentry.j1
    public final io.sentry.protocol.w h(io.sentry.internal.debugmeta.c cVar, l0 l0Var) {
        try {
            l0Var.a();
            return x(cVar, l0Var);
        } catch (IOException e) {
            this.b.getLogger().d(q5.ERROR, "Failed to capture envelope.", e);
            return io.sentry.protocol.w.b;
        }
    }

    @Override // io.sentry.j1
    public final io.sentry.protocol.w i(io.sentry.protocol.f0 f0Var, k7 k7Var, e1 e1Var, l0 l0Var, u3 u3Var) {
        List listD;
        if (io.sentry.util.m.a()) {
            return io.sentry.protocol.w.b;
        }
        if (l0Var == null) {
            l0Var = new l0();
        }
        if (y(f0Var, l0Var) && (listD = e1Var.D()) != null) {
            l0Var.b.addAll(listD);
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Capturing transaction: %s", f0Var.a);
        List<j0> ignoredTransactions = sentryAndroidOptions.getIgnoredTransactions();
        String str = f0Var.E0;
        if (str != null && ignoredTransactions != null && !ignoredTransactions.isEmpty()) {
            Iterator<j0> it = ignoredTransactions.iterator();
            while (it.hasNext()) {
                if (it.next().a.equalsIgnoreCase(str)) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Transaction was dropped as transaction name %s is ignored", f0Var.E0);
                    io.sentry.clientreport.f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
                    io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                    clientReportRecorder.a(dVar, p.Transaction);
                    sentryAndroidOptions.getClientReportRecorder().f(dVar, p.Span, f0Var.H0.size() + 1);
                    return io.sentry.protocol.w.b;
                }
            }
            Iterator<j0> it2 = ignoredTransactions.iterator();
            while (it2.hasNext()) {
                Pattern pattern = it2.next().b;
                if (pattern == null ? false : pattern.matcher(str).matches()) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Transaction was dropped as transaction name %s is ignored", f0Var.E0);
                    io.sentry.clientreport.f clientReportRecorder2 = sentryAndroidOptions.getClientReportRecorder();
                    io.sentry.clientreport.d dVar2 = io.sentry.clientreport.d.EVENT_PROCESSOR;
                    clientReportRecorder2.a(dVar2, p.Transaction);
                    sentryAndroidOptions.getClientReportRecorder().f(dVar2, p.Span, f0Var.H0.size() + 1);
                    return io.sentry.protocol.w.b;
                }
            }
        }
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        io.sentry.protocol.w wVarX = f0Var.a;
        if (wVarX == null) {
            wVarX = wVar;
        }
        if (y(f0Var, l0Var)) {
            m(f0Var, e1Var, io.sentry.hints.d.class.isInstance(l0Var.b("sentry:typeCheckHint")));
            f0Var = w(f0Var, l0Var, e1Var.N());
            if (f0Var == null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Transaction was dropped by applyScope", new Object[0]);
            }
        }
        if (f0Var != null) {
            f0Var = w(f0Var, l0Var, sentryAndroidOptions.getEventProcessors());
        }
        io.sentry.protocol.f0 f0Var2 = f0Var;
        if (f0Var2 == null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Transaction was dropped by Event processors.", new Object[0]);
            return wVar;
        }
        ArrayList arrayList = f0Var2.H0;
        int size = arrayList.size();
        sentryAndroidOptions.getBeforeSendTransaction();
        int size2 = arrayList.size();
        if (size2 < size) {
            int i = size - size2;
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "%d spans were dropped by beforeSendTransaction.", Integer.valueOf(i));
            sentryAndroidOptions.getClientReportRecorder().f(io.sentry.clientreport.d.BEFORE_SEND, p.Span, i);
        }
        try {
            ArrayList arrayListR = r(l0Var);
            ArrayList arrayList2 = new ArrayList();
            Iterator it3 = arrayListR.iterator();
            while (it3.hasNext()) {
                ((a) it3.next()).getClass();
            }
            io.sentry.internal.debugmeta.c cVarN = n(f0Var2, arrayList2, null, k7Var, u3Var);
            l0Var.a();
            if (cVarN != null) {
                wVarX = x(cVarN, l0Var);
            }
        } catch (io.sentry.exception.c | IOException e) {
            sentryAndroidOptions.getLogger().c(q5.WARNING, e, "Capturing transaction %s failed.", wVarX);
            wVar = io.sentry.protocol.w.b;
            wVarX = wVar;
        }
        if (!wVarX.equals(wVar)) {
            e7 e7VarJ = f0Var2.b.j();
            if (e7VarJ != null) {
                sentryAndroidOptions.getReplayController().E(e7VarJ.a);
            }
            String str2 = f0Var2.E0;
            if (str2 != null && !str2.isEmpty()) {
                sentryAndroidOptions.getReplayController().W(str2);
            }
        }
        return wVarX;
    }

    @Override // io.sentry.j1
    public final boolean isEnabled() {
        return this.a;
    }

    @Override // io.sentry.j1
    public final io.sentry.protocol.w j(io.sentry.protocol.k kVar, e1 e1Var) {
        if (io.sentry.util.m.a()) {
            return io.sentry.protocol.w.b;
        }
        i5 i5Var = new i5();
        io.sentry.protocol.e eVar = i5Var.b;
        eVar.l(kVar, "feedback");
        l0 l0Var = new l0();
        if (kVar.f == null) {
            kVar.f = e1Var.H();
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Capturing feedback: %s", i5Var.a);
        if (y(i5Var, l0Var)) {
            if (i5Var.w == null) {
                i5Var.w = e1Var.M();
            }
            if (i5Var.e == null) {
                i5Var.c(e1Var.B());
            } else {
                for (Map.Entry entry : e1Var.B().entrySet()) {
                    if (!i5Var.e.containsKey(entry.getKey())) {
                        i5Var.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            for (Map.Entry entry2 : new io.sentry.protocol.e(e1Var.F()).a.entrySet()) {
                if (!eVar.b(entry2.getKey())) {
                    eVar.l(entry2.getValue(), (String) entry2.getKey());
                }
            }
            o1 o1VarB = e1Var.b();
            if (eVar.j() == null) {
                if (o1VarB == null) {
                    eVar.w(m7.b(e1Var.x()));
                } else {
                    eVar.w(o1VarB.u());
                }
            }
            i5Var = u(i5Var, l0Var, e1Var.N());
            if (i5Var == null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Feedback was dropped by applyScope", new Object[0]);
                return io.sentry.protocol.w.b;
            }
        }
        i5 i5VarU = u(i5Var, l0Var, sentryAndroidOptions.getEventProcessors());
        if (i5VarU != null) {
            sentryAndroidOptions.getBeforeSendFeedback();
        }
        if (i5VarU == null) {
            return io.sentry.protocol.w.b;
        }
        io.sentry.protocol.w wVar = io.sentry.protocol.w.b;
        io.sentry.protocol.w wVar2 = i5VarU.a;
        if (wVar2 == null) {
            wVar2 = wVar;
        }
        if (kVar.e == null) {
            sentryAndroidOptions.getReplayController().h(Boolean.FALSE);
            io.sentry.protocol.w wVarL = e1Var.l();
            if (!wVarL.equals(wVar)) {
                kVar.e = wVarL;
            }
        }
        try {
            io.sentry.internal.debugmeta.c cVarN = n(i5VarU, r(l0Var), null, s(e1Var, l0Var, i5VarU, i5VarU.K0), null);
            l0Var.a();
            return cVarN != null ? x(cVarN, l0Var) : wVar2;
        } catch (io.sentry.exception.c | IOException e) {
            sentryAndroidOptions.getLogger().c(q5.WARNING, e, "Capturing feedback %s failed.", wVar2);
            return io.sentry.protocol.w.b;
        }
    }

    @Override // io.sentry.j1
    public final io.sentry.protocol.w k(r3 r3Var) {
        io.sentry.util.b.r(r3Var, "profileChunk is required.");
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Capturing profile chunk: %s", r3Var.c);
        io.sentry.protocol.w wVar = r3Var.c;
        io.sentry.protocol.f fVarA = io.sentry.protocol.f.a(r3Var.a, sentryAndroidOptions);
        if (fVarA != null) {
            r3Var.a = fVarA;
        }
        try {
            return x(new io.sentry.internal.debugmeta.c(new b5(wVar, sentryAndroidOptions.getSdkVersion(), null), Collections.singletonList("application/x-perfetto-trace".equals(r3Var.y) ? g5.c(r3Var, sentryAndroidOptions.getSerializer()) : g5.d(r3Var, sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getProfilerConverter()))), null);
        } catch (io.sentry.exception.c e) {
            e = e;
            sentryAndroidOptions.getLogger().c(q5.WARNING, e, "Capturing profile chunk %s failed.", wVar);
            return io.sentry.protocol.w.b;
        } catch (IOException e2) {
            e = e2;
            sentryAndroidOptions.getLogger().c(q5.WARNING, e, "Capturing profile chunk %s failed.", wVar);
            return io.sentry.protocol.w.b;
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x02a0  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // io.sentry.j1
    public final io.sentry.protocol.w l(i5 i5Var, e1 e1Var, l0 l0Var) {
        c7 c7VarY;
        boolean z;
        String str;
        io.sentry.protocol.w wVar;
        q1 q1VarP;
        io.sentry.protocol.w wVarX;
        io.sentry.protocol.w wVarL;
        q1 q1VarP2;
        c cVar;
        io.sentry.protocol.w wVar2;
        io.sentry.protocol.j jVarJ;
        List listD;
        i5 i5VarT = i5Var;
        if (io.sentry.util.m.a()) {
            return io.sentry.protocol.w.b;
        }
        if (y(i5VarT, l0Var) && !io.sentry.hints.d.class.isInstance(l0Var.b("sentry:typeCheckHint")) && e1Var != null && (listD = e1Var.D()) != null) {
            l0Var.b.addAll(listD);
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        z0 logger = sentryAndroidOptions.getLogger();
        q5 q5Var = q5.DEBUG;
        logger.i(q5Var, "Capturing event: %s", i5VarT.a);
        Throwable thA = i5VarT.a();
        if (thA != null && sentryAndroidOptions.getIgnoredExceptionsForType().contains(thA.getClass())) {
            sentryAndroidOptions.getLogger().i(q5Var, "Event was dropped as the exception %s is ignored", thA.getClass());
            sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, p.Error);
            return io.sentry.protocol.w.b;
        }
        List<j0> ignoredErrors = sentryAndroidOptions.getIgnoredErrors();
        if (ignoredErrors != null && !ignoredErrors.isEmpty()) {
            HashSet<String> hashSet = new HashSet();
            io.sentry.protocol.p pVar = i5VarT.F0;
            if (pVar != null) {
                String str2 = pVar.b;
                if (str2 != null) {
                    hashSet.add(str2);
                }
                String str3 = pVar.a;
                if (str3 != null) {
                    hashSet.add(str3);
                }
            }
            Throwable thA2 = i5VarT.a();
            if (thA2 != null) {
                hashSet.add(thA2.toString());
            }
            Iterator<j0> it = ignoredErrors.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(it.next().a)) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", i5VarT.F0);
                    sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, p.Error);
                    return io.sentry.protocol.w.b;
                }
            }
            for (j0 j0Var : ignoredErrors) {
                for (String str4 : hashSet) {
                    Pattern pattern = j0Var.b;
                    if (pattern == null ? false : pattern.matcher(str4).matches()) {
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Event was dropped as it matched a string/pattern in ignoredErrors", i5VarT.F0);
                        sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, p.Error);
                        return io.sentry.protocol.w.b;
                    }
                }
            }
        }
        if (y(i5VarT, l0Var)) {
            if (e1Var != null) {
                m(i5VarT, e1Var, io.sentry.hints.d.class.isInstance(l0Var.b("sentry:typeCheckHint")));
                String str5 = i5VarT.K0;
                io.sentry.protocol.e eVar = i5VarT.b;
                if (str5 == null) {
                    i5VarT.K0 = e1Var.O();
                }
                if (i5VarT.L0 == null) {
                    List listL = e1Var.L();
                    i5VarT.L0 = listL != null ? new ArrayList(listL) : null;
                }
                if (e1Var.w() != null) {
                    i5VarT.J0 = e1Var.w();
                }
                o1 o1VarB = e1Var.b();
                if (eVar.j() == null) {
                    if (o1VarB == null) {
                        eVar.w(m7.b(e1Var.x()));
                    } else {
                        eVar.w(o1VarB.u());
                    }
                }
                if (eVar.g() == null && (jVarJ = e1Var.j()) != null) {
                    eVar.q(jVarJ);
                }
                i5VarT = t(i5VarT, l0Var, e1Var.N());
            }
            if (i5VarT == null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Event was dropped by applyScope", new Object[0]);
                return io.sentry.protocol.w.b;
            }
        }
        i5 i5VarT2 = t(i5VarT, l0Var, sentryAndroidOptions.getEventProcessors());
        if (i5VarT2 != null) {
            sentryAndroidOptions.getBeforeSend();
        }
        if (i5VarT2 != null) {
            try {
                if (sentryAndroidOptions.isEnableEventSizeLimiting() && !io.sentry.util.b.l(i5VarT2, sentryAndroidOptions)) {
                    sentryAndroidOptions.getLogger().i(q5.INFO, "Event %s exceeds %d bytes limit. Reducing size by dropping fields.", i5VarT2.a, Long.valueOf(q6.MAX_EVENT_SIZE_BYTES));
                    sentryAndroidOptions.getOnOversizedEvent();
                    List list = i5VarT2.X;
                    if (list != null && !list.isEmpty()) {
                        i5VarT2.X = null;
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Removed breadcrumbs to reduce size of event %s", i5VarT2.a);
                    }
                    if (!io.sentry.util.b.l(i5VarT2, sentryAndroidOptions)) {
                        io.sentry.util.b.u(i5VarT2, sentryAndroidOptions);
                        if (!io.sentry.util.b.l(i5VarT2, sentryAndroidOptions)) {
                            sentryAndroidOptions.getLogger().i(q5.WARNING, "Event %s still exceeds size limit after reducing all fields. Event may be rejected by server.", i5VarT2.a);
                        }
                    }
                }
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().d(q5.ERROR, "An error occurred while limiting event size. Event will be sent as-is.", th);
            }
        }
        if (i5VarT2 == null) {
            return io.sentry.protocol.w.b;
        }
        c7 c7VarY2 = e1Var != null ? e1Var.y(new com.adjust.sdk.sig.r3(11)) : null;
        if ((c7VarY2 != null && c7VarY2.g != b7.Ok) || !io.sentry.util.b.s(l0Var)) {
            c7VarY = null;
        } else if (e1Var != null) {
            c7VarY = e1Var.y(new gi2(this, i5VarT2, l0Var, 12));
        } else {
            sentryAndroidOptions.getLogger().i(q5.INFO, "Scope is null on client.captureEvent", new Object[0]);
            c7VarY = null;
        }
        io.sentry.util.k kVarA = sentryAndroidOptions.getSampleRate() == null ? null : io.sentry.util.n.a();
        if (sentryAndroidOptions.getSampleRate() != null && kVarA != null && sentryAndroidOptions.getSampleRate().doubleValue() < kVarA.c()) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Event %s was dropped due to sampling decision.", i5VarT2.a);
            sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.SAMPLE_RATE, p.Error);
            i5VarT2 = null;
        }
        if (c7VarY != null) {
            if (c7VarY2 != null) {
                b7 b7Var = c7VarY.g;
                b7 b7Var2 = b7.Crashed;
                z = (b7Var == b7Var2 && c7VarY2.g != b7Var2) || (c7VarY.c.get() > 0 && c7VarY2.c.get() <= 0);
            }
        }
        if (i5VarT2 == null && !z) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Not sending session update for dropped event as it did not cause the session health to change.", new Object[0]);
            return io.sentry.protocol.w.b;
        }
        io.sentry.protocol.w wVar3 = io.sentry.protocol.w.b;
        io.sentry.protocol.w wVar4 = (i5VarT2 == null || (wVar2 = i5VarT2.a) == null) ? wVar3 : wVar2;
        boolean zIsInstance = io.sentry.hints.b.class.isInstance(l0Var.b("sentry:typeCheckHint"));
        boolean z2 = io.sentry.hints.d.class.isInstance(l0Var.b("sentry:typeCheckHint")) && !io.sentry.android.core.w0.class.isInstance(l0Var.b("sentry:typeCheckHint"));
        if (i5VarT2 != null && !zIsInstance && !z2 && (i5VarT2.g() || i5VarT2.f() != null)) {
            sentryAndroidOptions.getSessionReplay().getClass();
            sentryAndroidOptions.getReplayController().h(Boolean.valueOf(i5VarT2.f() != null));
            if (e1Var != null && (wVarL = e1Var.l()) != null && !wVarL.equals(wVar3) && (q1VarP2 = e1Var.p()) != null && (cVar = q1VarP2.u().X) != null && !wVar3.equals(wVarL)) {
                cVar.a.put("sentry-replay_id", wVarL.a());
            }
        }
        if (i5VarT2 != null) {
            try {
                str = i5VarT2.K0;
            } catch (io.sentry.exception.c e) {
                e = e;
                sentryAndroidOptions.getLogger().c(q5.WARNING, e, "Capturing event %s failed.", wVar4);
                wVar = io.sentry.protocol.w.b;
            } catch (IOException e2) {
                e = e2;
                sentryAndroidOptions.getLogger().c(q5.WARNING, e, "Capturing event %s failed.", wVar4);
                wVar = io.sentry.protocol.w.b;
            }
        } else {
            str = null;
        }
        io.sentry.internal.debugmeta.c cVarN = n(i5VarT2, i5VarT2 != null ? r(l0Var) : null, c7VarY, s(e1Var, l0Var, i5VarT2, str), null);
        l0Var.a();
        wVar = wVar4;
        if (cVarN != null) {
            wVarX = x(cVarN, l0Var);
        }
        if (e1Var != null && (q1VarP = e1Var.p()) != null && io.sentry.hints.l.class.isInstance(l0Var.b("sentry:typeCheckHint"))) {
            Object objB = l0Var.b("sentry:typeCheckHint");
            if (objB instanceof io.sentry.hints.c) {
                wVar = wVarX;
                ((io.sentry.hints.c) objB).g(q1VarP.q());
                q1VarP.f(h7.ABORTED, false, l0Var);
            } else {
                wVar = wVarX;
                q1VarP.f(h7.ABORTED, false, null);
            }
        }
        wVar = wVarX;
        wVar = wVarX;
        wVar = wVarX;
        return wVar;
    }

    public final void m(v4 v4Var, e1 e1Var, boolean z) {
        if (e1Var != null) {
            if (v4Var.d == null) {
                v4Var.d = e1Var.h();
            }
            if (v4Var.w == null) {
                v4Var.w = e1Var.M();
            }
            if (v4Var.e == null) {
                v4Var.c(e1Var.B());
            } else {
                for (Map.Entry entry : e1Var.B().entrySet()) {
                    if (!v4Var.e.containsKey(entry.getKey())) {
                        v4Var.e.put((String) entry.getKey(), (String) entry.getValue());
                    }
                }
            }
            if (v4Var.X == null) {
                v4Var.X = new ArrayList(new ArrayList(e1Var.v()));
            } else if (!z) {
                Queue queueV = e1Var.v();
                List list = v4Var.X;
                if (list != null && !queueV.isEmpty()) {
                    list.addAll(queueV);
                    Collections.sort(list, this.d);
                }
            }
            if (v4Var.Z == null) {
                Map extras = e1Var.getExtras();
                v4Var.Z = extras != null ? new HashMap(extras) : null;
            } else {
                for (Map.Entry entry2 : e1Var.getExtras().entrySet()) {
                    if (!v4Var.Z.containsKey(entry2.getKey())) {
                        v4Var.Z.put((String) entry2.getKey(), entry2.getValue());
                    }
                }
            }
            io.sentry.protocol.e eVar = v4Var.b;
            for (Map.Entry entry3 : new io.sentry.protocol.e(e1Var.F()).a.entrySet()) {
                if (!eVar.b(entry3.getKey())) {
                    eVar.l(entry3.getValue(), (String) entry3.getKey());
                }
            }
        }
    }

    public final io.sentry.internal.debugmeta.c n(v4 v4Var, ArrayList arrayList, c7 c7Var, k7 k7Var, u3 u3Var) {
        io.sentry.protocol.w wVar;
        ArrayList arrayList2 = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (v4Var != null) {
            m1 serializer = sentryAndroidOptions.getSerializer();
            Charset charset = g5.d;
            io.sentry.util.b.r(serializer, "ISerializer is required.");
            io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new vh2(6, serializer, v4Var));
            arrayList2.add(new g5(new h5(p5.resolve(v4Var), new c5(cVar, 9), "application/json", null, null), new c5(cVar, 10)));
            wVar = v4Var.a;
        } else {
            wVar = null;
        }
        if (c7Var != null) {
            arrayList2.add(g5.e(sentryAndroidOptions.getSerializer(), c7Var));
        }
        if (u3Var != null) {
            long maxTraceFileSize = sentryAndroidOptions.getMaxTraceFileSize();
            m1 serializer2 = sentryAndroidOptions.getSerializer();
            Charset charset2 = g5.d;
            File file = u3Var.a;
            io.sentry.internal.debugmeta.c cVar2 = new io.sentry.internal.debugmeta.c(new d5(file, maxTraceFileSize, u3Var, serializer2));
            arrayList2.add(new g5(new h5(p5.Profile, new c5(cVar2, 7), "application-json", file.getName(), null), new c5(cVar2, 8)));
            if (wVar == null) {
                wVar = new io.sentry.protocol.w(u3Var.L0);
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                a aVar = (a) it.next();
                m1 serializer3 = sentryAndroidOptions.getSerializer();
                z0 logger = sentryAndroidOptions.getLogger();
                long maxAttachmentSize = sentryAndroidOptions.getMaxAttachmentSize();
                Charset charset3 = g5.d;
                io.sentry.internal.debugmeta.c cVar3 = new io.sentry.internal.debugmeta.c(new d5(aVar, maxAttachmentSize, serializer3, logger));
                arrayList2.add(new g5(new h5(p5.Attachment, new c5(cVar3, 4), aVar.e, aVar.d, aVar.f), new c5(cVar3, 5)));
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return new io.sentry.internal.debugmeta.c(new b5(wVar, sentryAndroidOptions.getSdkVersion(), k7Var), arrayList2);
    }

    public final io.sentry.internal.debugmeta.c o(t5 t5Var) {
        ArrayList arrayList = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        m1 serializer = sentryAndroidOptions.getSerializer();
        Charset charset = g5.d;
        io.sentry.util.b.r(serializer, "ISerializer is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new vh2(5, serializer, t5Var));
        arrayList.add(new g5(new h5(p5.Log, new c5(cVar, 2), "application/vnd.sentry.items.log+json", null, null, null, Integer.valueOf(((List) t5Var.b).size())), new c5(cVar, 3)));
        return new io.sentry.internal.debugmeta.c(new b5(null, sentryAndroidOptions.getSdkVersion(), null), arrayList);
    }

    public final io.sentry.internal.debugmeta.c p(x5 x5Var) {
        ArrayList arrayList = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        m1 serializer = sentryAndroidOptions.getSerializer();
        Charset charset = g5.d;
        io.sentry.util.b.r(serializer, "ISerializer is required.");
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new vh2(3, serializer, x5Var));
        arrayList.add(new g5(new h5(p5.TraceMetric, new c5(cVar, 6), "application/vnd.sentry.items.trace-metric+json", null, null, null, Integer.valueOf(x5Var.a.size())), new c5(cVar, 14)));
        return new io.sentry.internal.debugmeta.c(new b5(null, sentryAndroidOptions.getSdkVersion(), null), arrayList);
    }

    public final io.sentry.internal.debugmeta.c q(final s6 s6Var, final a4 a4Var, k7 k7Var, final boolean z) {
        ArrayList arrayList = new ArrayList();
        SentryAndroidOptions sentryAndroidOptions = this.b;
        final m1 serializer = sentryAndroidOptions.getSerializer();
        final z0 logger = sentryAndroidOptions.getLogger();
        Charset charset = g5.d;
        final File file = s6Var.E0;
        io.sentry.internal.debugmeta.c cVar = new io.sentry.internal.debugmeta.c(new Callable() { // from class: io.sentry.e5
            @Override // java.util.concurrent.Callable
            public final Object call() {
                m1 m1Var = serializer;
                s6 s6Var2 = s6Var;
                File file2 = file;
                z0 z0Var = logger;
                boolean z2 = z;
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, g5.d), 512);
                        try {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            m1Var.a(bufferedWriter, s6Var2);
                            linkedHashMap.put(p5.ReplayEvent.getItemType(), byteArrayOutputStream.toByteArray());
                            byteArrayOutputStream.reset();
                            a4 a4Var2 = a4Var;
                            if (a4Var2 != null) {
                                m1Var.a(bufferedWriter, a4Var2);
                                linkedHashMap.put(p5.ReplayRecording.getItemType(), byteArrayOutputStream.toByteArray());
                                byteArrayOutputStream.reset();
                            }
                            if (file2 != null && file2.exists()) {
                                byte[] bArrP = io.sentry.util.b.p(10485760L, file2.getPath());
                                if (bArrP.length > 0) {
                                    linkedHashMap.put(p5.ReplayVideo.getItemType(), bArrP);
                                }
                            }
                            byte[] bArrI = g5.i(linkedHashMap);
                            bufferedWriter.close();
                            byteArrayOutputStream.close();
                            if (file2 != null) {
                                if (z2) {
                                    io.sentry.util.b.g(file2.getParentFile());
                                    return bArrI;
                                }
                                file2.delete();
                            }
                            return bArrI;
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
                            byteArrayOutputStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } catch (Throwable th5) {
                    try {
                        z0Var.d(q5.ERROR, "Could not serialize replay recording", th5);
                        return null;
                    } finally {
                        if (file2 != null) {
                            if (z2) {
                                io.sentry.util.b.g(file2.getParentFile());
                            } else {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        });
        arrayList.add(new g5(new h5(p5.ReplayVideo, new c5(cVar, 13), null, null, null), new c5(cVar, 15)));
        return new io.sentry.internal.debugmeta.c(new b5(s6Var.a, sentryAndroidOptions.getSessionReplay().l, k7Var), arrayList);
    }

    public final k7 s(e1 e1Var, l0 l0Var, v4 v4Var, String str) {
        boolean zIsInstance = io.sentry.hints.b.class.isInstance(l0Var.b("sentry:typeCheckHint"));
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (zIsInstance) {
            if (v4Var != null) {
                c cVar = new c(sentryAndroidOptions.getLogger());
                io.sentry.protocol.e eVar = v4Var.b;
                e7 e7VarJ = eVar.j();
                cVar.d("sentry-trace_id", e7VarJ != null ? e7VarJ.a.a() : null);
                cVar.d("sentry-public_key", sentryAndroidOptions.retrieveParsedDsn().b);
                cVar.d("sentry-release", v4Var.f);
                cVar.d("sentry-environment", v4Var.g);
                cVar.d("sentry-org_id", sentryAndroidOptions.getEffectiveOrgId());
                cVar.d("sentry-transaction", str);
                if (cVar.f) {
                    cVar.c = null;
                }
                cVar.d("sentry-sampled", null);
                if (cVar.f) {
                    cVar.d = null;
                }
                Object objD = eVar.d("replay_id");
                if (objD != null && !objD.toString().equals(io.sentry.protocol.w.b.a())) {
                    cVar.d("sentry-replay_id", objD.toString());
                    eVar.a.remove("replay_id");
                }
                cVar.f = false;
                return cVar.f();
            }
        } else if (e1Var != null) {
            q1 q1VarP = e1Var.p();
            return q1VarP != null ? q1VarP.c() : ((c) e1Var.G(new y6(e1Var, sentryAndroidOptions)).e).f();
        }
        return null;
    }

    public final i5 t(i5 i5Var, l0 l0Var, List list) {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            try {
                boolean z = f0Var instanceof io.sentry.android.core.l0;
                boolean zIsInstance = io.sentry.hints.b.class.isInstance(l0Var.b("sentry:typeCheckHint"));
                if (zIsInstance && z) {
                    ((io.sentry.android.core.l0) f0Var).h(i5Var, l0Var);
                } else if (!zIsInstance && !z) {
                    i5Var = f0Var.h(i5Var, l0Var);
                }
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().c(q5.ERROR, th, "An exception occurred while processing event by processor: %s", f0Var.getClass().getName());
            }
            if (i5Var == null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Event was dropped by a processor: %s", f0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, p.Error);
                break;
            }
        }
        return i5Var;
    }

    public final i5 u(i5 i5Var, l0 l0Var, List list) {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            try {
                i5Var = f0Var.h(i5Var, l0Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().c(q5.ERROR, th, "An exception occurred while processing feedback event by processor: %s", f0Var.getClass().getName());
            }
            if (i5Var == null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Feedback event was dropped by a processor: %s", f0Var.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().a(io.sentry.clientreport.d.EVENT_PROCESSOR, p.Feedback);
                break;
            }
        }
        return i5Var;
    }

    public final s5 v(s5 s5Var, List list) {
        s5 s5VarU;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0 f0Var = (f0) it.next();
            try {
                s5VarU = f0Var.u(s5Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().c(q5.ERROR, th, "An exception occurred while processing log event by processor: %s", f0Var.getClass().getName());
                s5VarU = s5Var;
            }
            if (s5VarU == null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Log event was dropped by a processor: %s", f0Var.getClass().getName());
                io.sentry.clientreport.f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                clientReportRecorder.a(dVar, p.LogItem);
                sentryAndroidOptions.getClientReportRecorder().f(dVar, p.LogByte, io.sentry.util.d.a(sentryAndroidOptions.getSerializer(), sentryAndroidOptions.getLogger(), s5Var));
                return s5VarU;
            }
            s5Var = s5VarU;
        }
        return s5Var;
    }

    public final io.sentry.protocol.f0 w(io.sentry.protocol.f0 f0Var, l0 l0Var, List list) {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f0 f0Var2 = (f0) it.next();
            int size = f0Var.H0.size();
            try {
                f0Var = f0Var2.l(f0Var, l0Var);
            } catch (Throwable th) {
                sentryAndroidOptions.getLogger().c(q5.ERROR, th, "An exception occurred while processing transaction by processor: %s", f0Var2.getClass().getName());
            }
            int size2 = f0Var == null ? 0 : f0Var.H0.size();
            if (f0Var == null) {
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "Transaction was dropped by a processor: %s", f0Var2.getClass().getName());
                io.sentry.clientreport.f clientReportRecorder = sentryAndroidOptions.getClientReportRecorder();
                io.sentry.clientreport.d dVar = io.sentry.clientreport.d.EVENT_PROCESSOR;
                clientReportRecorder.a(dVar, p.Transaction);
                sentryAndroidOptions.getClientReportRecorder().f(dVar, p.Span, size + 1);
                break;
            }
            if (size2 < size) {
                int i = size - size2;
                sentryAndroidOptions.getLogger().i(q5.DEBUG, "%d spans were dropped by a processor: %s", Integer.valueOf(i), f0Var2.getClass().getName());
                sentryAndroidOptions.getClientReportRecorder().f(io.sentry.clientreport.d.EVENT_PROCESSOR, p.Span, i);
            }
        }
        return f0Var;
    }

    public final io.sentry.protocol.w x(io.sentry.internal.debugmeta.c cVar, l0 l0Var) {
        if (io.sentry.util.m.a()) {
            return io.sentry.protocol.w.b;
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        sentryAndroidOptions.getBeforeEnvelopeCallback();
        o5.d().c(sentryAndroidOptions.getLogger());
        io.sentry.transport.g gVar = this.c;
        if (l0Var == null) {
            gVar.getClass();
            gVar.x0(cVar, new l0());
        } else {
            gVar.x0(cVar, l0Var);
        }
        io.sentry.protocol.w wVar = ((b5) cVar.b).a;
        return wVar != null ? wVar : io.sentry.protocol.w.b;
    }

    public final boolean y(v4 v4Var, l0 l0Var) {
        if (io.sentry.util.b.s(l0Var)) {
            return true;
        }
        this.b.getLogger().i(q5.DEBUG, "Event was cached so not applying scope: %s", v4Var.a);
        return false;
    }
}
