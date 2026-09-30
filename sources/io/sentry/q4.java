package io.sentry;

import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.BuildConfig;
import defpackage.bwe;
import defpackage.qc0;
import io.sentry.android.core.SentryAndroidOptions;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class q4 {
    public static volatile h1 a = b3.a;
    public static volatile g1 b = z2.b;
    public static final e4 c = new e4(q6.empty());
    public static volatile boolean d = false;
    public static final Charset e = Charset.forName(Constants.ENCODING);
    public static final long f = System.currentTimeMillis();
    public static final io.sentry.util.a g = new io.sentry.util.a();

    public static void a() {
        io.sentry.util.a aVar = g;
        aVar.b();
        try {
            g1 g1VarB = b();
            b = z2.b;
            a.close();
            g1VarB.a(false);
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static g1 b() {
        if (d) {
            return b;
        }
        g1 g1Var = a.get();
        if (g1Var != null && !g1Var.s()) {
            return g1Var;
        }
        g1 g1VarA = b.A("getCurrentScopes");
        a.a(g1VarA);
        return g1VarA;
    }

    public static void c(io.sentry.android.core.x xVar, io.sentry.android.core.e eVar) {
        SentryAndroidOptions sentryAndroidOptions = new SentryAndroidOptions();
        try {
            eVar.d(sentryAndroidOptions);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().d(q5.ERROR, "Error in the 'OptionsConfiguration.configure' callback.", th);
        }
        io.sentry.util.a aVar = g;
        aVar.b();
        try {
            if (!SentryAndroidOptions.class.getName().equals("io.sentry.android.core.SentryAndroidOptions") && io.sentry.util.j.a) {
                throw new IllegalArgumentException("You are running Android. Please, use SentryAndroid.init. ".concat(SentryAndroidOptions.class.getName()));
            }
            if (g(sentryAndroidOptions)) {
                Boolean boolIsGlobalHubMode = sentryAndroidOptions.isGlobalHubMode();
                int i = 1;
                boolean zBooleanValue = boolIsGlobalHubMode != null ? boolIsGlobalHubMode.booleanValue() : true;
                sentryAndroidOptions.getLogger().i(q5.INFO, "GlobalHubMode: '%s'", String.valueOf(zBooleanValue));
                d = zBooleanValue;
                if (sentryAndroidOptions.getFatalLogger() instanceof v2) {
                    sentryAndroidOptions.setFatalLogger(new p2());
                }
                e4 e4Var = c;
                int i2 = 0;
                if (io.sentry.util.b.t(e4Var.l, sentryAndroidOptions, f())) {
                    if (f()) {
                        sentryAndroidOptions.getLogger().i(q5.WARNING, "Sentry has been already initialized. Previous configuration will be overwritten.", new Object[0]);
                    }
                    sentryAndroidOptions.activate();
                    b().a(true);
                    e4Var.l = sentryAndroidOptions;
                    Queue queue = e4Var.g;
                    e4Var.g = e4.a(sentryAndroidOptions.getMaxBreadcrumbs());
                    Iterator it = queue.iterator();
                    while (it.hasNext()) {
                        e4Var.i((g) it.next(), null);
                    }
                    b = new j4(new e4(sentryAndroidOptions), new e4(sentryAndroidOptions), e4Var);
                    if (sentryAndroidOptions.isDebug() && (sentryAndroidOptions.getLogger() instanceof v2)) {
                        sentryAndroidOptions.setLogger(new p2());
                    }
                    e(sentryAndroidOptions);
                    a.a(b);
                    d(sentryAndroidOptions);
                    e4Var.u = new x4(sentryAndroidOptions);
                    if (sentryAndroidOptions.getExecutorService().isClosed()) {
                        sentryAndroidOptions.setExecutorService(new k5(sentryAndroidOptions));
                    }
                    if (sentryAndroidOptions.getTimerExecutorService().isClosed()) {
                        sentryAndroidOptions.setTimerExecutorService(new k5(sentryAndroidOptions, 0));
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new o4(sentryAndroidOptions, i2));
                    } catch (RejectedExecutionException e2) {
                        sentryAndroidOptions.getLogger().d(q5.DEBUG, "Failed to call the executor. Lazy fields will not be loaded. Did you call Sentry.close()?", e2);
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new o2(i2, sentryAndroidOptions));
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().d(q5.DEBUG, "Failed to move previous session.", th2);
                    }
                    for (w1 w1Var : sentryAndroidOptions.getIntegrations()) {
                        try {
                            w1Var.R(sentryAndroidOptions);
                        } catch (Throwable th3) {
                            sentryAndroidOptions.getLogger().d(q5.WARNING, "Failed to register the integration " + w1Var.getClass().getName(), th3);
                        }
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new o4(sentryAndroidOptions, 2));
                    } catch (Throwable th4) {
                        sentryAndroidOptions.getLogger().d(q5.DEBUG, "Failed to notify options observers.", th4);
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new p3(sentryAndroidOptions));
                    } catch (Throwable th5) {
                        sentryAndroidOptions.getLogger().d(q5.DEBUG, "Failed to finalize previous session.", th5);
                    }
                    try {
                        sentryAndroidOptions.getExecutorService().submit(new o4(sentryAndroidOptions, i));
                    } catch (Throwable th6) {
                        sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to call the executor. App start profiling config will not be changed. Did you call Sentry.close()?", th6);
                    }
                    z0 logger = sentryAndroidOptions.getLogger();
                    q5 q5Var = q5.DEBUG;
                    logger.i(q5Var, "Using openTelemetryMode %s", sentryAndroidOptions.getOpenTelemetryMode());
                    sentryAndroidOptions.getLogger().i(q5Var, "Using span factory %s", sentryAndroidOptions.getSpanFactory().getClass().getName());
                    sentryAndroidOptions.getLogger().i(q5Var, "Using scopes storage %s", a.getClass().getName());
                } else {
                    sentryAndroidOptions.getLogger().i(q5.WARNING, "This init call has been ignored due to priority being too low.", new Object[0]);
                }
            }
            aVar.close();
        } catch (Throwable th7) {
            try {
                aVar.close();
            } catch (Throwable th8) {
                th7.addSuppressed(th8);
            }
            throw th7;
        }
    }

    public static void d(SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.cache.d cVar;
        z0 logger = sentryAndroidOptions.getLogger();
        q5 q5Var = q5.INFO;
        logger.i(q5Var, "Initializing SDK with DSN: '%s'", sentryAndroidOptions.getDsn());
        if (sentryAndroidOptions.getOutboxPath() == null) {
            logger.i(q5Var, "No outbox dir path is defined in options.", new Object[0]);
        }
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof io.sentry.transport.i)) {
            Charset charset = io.sentry.cache.c.w;
            String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
            int maxCacheItems = sentryAndroidOptions.getMaxCacheItems();
            if (cacheDirPath == null) {
                sentryAndroidOptions.getLogger().i(q5.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
                cVar = io.sentry.transport.i.a;
            } else {
                cVar = new io.sentry.cache.c(sentryAndroidOptions, cacheDirPath, maxCacheItems);
            }
            sentryAndroidOptions.setEnvelopeDiskCache(cVar);
        }
        String profilingTracesDirPath = sentryAndroidOptions.getProfilingTracesDirPath();
        if ((sentryAndroidOptions.isProfilingEnabled() || sentryAndroidOptions.isContinuousProfilingEnabled()) && profilingTracesDirPath != null) {
            File file = new File(profilingTracesDirPath);
            file.mkdirs();
            try {
                sentryAndroidOptions.getExecutorService().submit(new bwe(5, file));
            } catch (RejectedExecutionException e2) {
                sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to call the executor. Old profiles will not be deleted. Did you call Sentry.close()?", e2);
            }
        }
        io.sentry.internal.modules.a modulesLoader = sentryAndroidOptions.getModulesLoader();
        if (!sentryAndroidOptions.isSendModules()) {
            sentryAndroidOptions.setModulesLoader(io.sentry.internal.modules.e.a);
        } else if (modulesLoader instanceof io.sentry.internal.modules.e) {
            sentryAndroidOptions.setModulesLoader(new io.sentry.internal.modules.f(Arrays.asList(new io.sentry.internal.modules.c(sentryAndroidOptions.getLogger()), new io.sentry.internal.modules.f(sentryAndroidOptions.getLogger())), sentryAndroidOptions.getLogger()));
        }
        if (sentryAndroidOptions.getDebugMetaLoader() instanceof io.sentry.internal.debugmeta.b) {
            sentryAndroidOptions.setDebugMetaLoader(new io.sentry.internal.debugmeta.c(sentryAndroidOptions.getLogger(), 0));
        }
        List<Properties> listB = sentryAndroidOptions.getDebugMetaLoader().b();
        if (listB != null) {
            if (sentryAndroidOptions.getBundleIds().isEmpty()) {
                Iterator it = listB.iterator();
                while (it.hasNext()) {
                    String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Bundle IDs found: %s", property);
                    if (property != null) {
                        for (String str : property.split(",", -1)) {
                            sentryAndroidOptions.addBundleId(str);
                        }
                    }
                }
            }
            if (sentryAndroidOptions.getProguardUuid() == null) {
                Iterator it2 = listB.iterator();
                while (it2.hasNext()) {
                    String property2 = ((Properties) it2.next()).getProperty("io.sentry.ProguardUuids");
                    if (property2 != null) {
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Proguard UUID found: %s", property2);
                        sentryAndroidOptions.setProguardUuid(property2);
                        break;
                    }
                }
            }
            for (Properties properties : listB) {
                String property3 = properties.getProperty("io.sentry.build-tool");
                if (property3 != null) {
                    String property4 = properties.getProperty("io.sentry.build-tool-version");
                    if (property4 == null) {
                        property4 = "unknown";
                    }
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Build tool found: %s, version %s", property3, property4);
                    o5.d().b(property3, property4);
                    break;
                }
            }
            for (Properties properties2 : listB) {
                String property5 = properties2.getProperty("io.sentry.distribution.org-slug");
                String property6 = properties2.getProperty("io.sentry.distribution.project-slug");
                String property7 = properties2.getProperty("io.sentry.distribution.auth-token");
                String property8 = properties2.getProperty("io.sentry.distribution.build-configuration");
                String property9 = properties2.getProperty("io.sentry.distribution.install-groups-override");
                if (property5 != null || property6 != null || property7 != null || property8 != null || property9 != null) {
                    h6 distribution = sentryAndroidOptions.getDistribution();
                    if (property5 != null && !property5.isEmpty() && distribution.b.isEmpty()) {
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Distribution org slug found: %s", property5);
                        distribution.b = property5;
                    }
                    if (property6 != null && !property6.isEmpty() && distribution.c.isEmpty()) {
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Distribution project slug found: %s", property6);
                        distribution.c = property6;
                    }
                    if (property7 != null && !property7.isEmpty() && distribution.a.isEmpty()) {
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Distribution org auth token found", new Object[0]);
                        distribution.a = property7;
                    }
                    if (property8 != null && !property8.isEmpty() && distribution.d == null) {
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "Distribution build configuration found: %s", property8);
                        distribution.d = property8;
                    }
                    if (property9 != null && !property9.isEmpty() && distribution.e == null) {
                        String[] strArrSplit = property9.split(",", -1);
                        ArrayList arrayList = new ArrayList();
                        for (String str2 : strArrSplit) {
                            String strTrim = str2.trim();
                            if (!strTrim.isEmpty()) {
                                arrayList.add(strTrim);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Distribution install groups override found: %s", arrayList);
                            distribution.e = arrayList;
                            break;
                        }
                        break;
                    }
                    break;
                    break;
                    break;
                }
            }
        }
        if (sentryAndroidOptions.getThreadChecker() instanceof io.sentry.util.thread.b) {
            sentryAndroidOptions.setThreadChecker(io.sentry.util.thread.c.b);
        }
        if (sentryAndroidOptions.getPerformanceCollectors().isEmpty()) {
            sentryAndroidOptions.addPerformanceCollector(new x1());
        }
        if (sentryAndroidOptions.isEnableBackpressureHandling() && !io.sentry.util.j.a) {
            if (sentryAndroidOptions.getBackpressureMonitor() instanceof io.sentry.backpressure.c) {
                sentryAndroidOptions.setBackpressureMonitor(new io.sentry.backpressure.a(sentryAndroidOptions));
            }
            sentryAndroidOptions.getBackpressureMonitor().start();
        }
        if (!io.sentry.util.j.a && sentryAndroidOptions.isContinuousProfilingEnabled() && (sentryAndroidOptions.getContinuousProfiler() instanceof s2)) {
            try {
                if (sentryAndroidOptions.getProfilingTracesDirPath() == null) {
                    File file2 = new File(System.getProperty("java.io.tmpdir"), "sentry_profiling_traces");
                    if (file2.mkdirs() || file2.exists()) {
                        sentryAndroidOptions.setProfilingTracesDirPath(file2.getAbsolutePath());
                    } else {
                        io.sentry.android.replay.capture.v.a(file2.getAbsolutePath(), "Creating a fallback directory for profiling failed in ");
                    }
                }
                z0 logger2 = sentryAndroidOptions.getLogger();
                sentryAndroidOptions.getProfilingTracesHz();
                sentryAndroidOptions.getExecutorService();
                try {
                    Iterator it3 = ServiceLoader.load(io.sentry.profiling.a.class).iterator();
                    if ((it3.hasNext() ? it3.next() : null) != null) {
                        throw new ClassCastException();
                    }
                    logger2.i(q5.DEBUG, "No continuous profiler provider found, using NoOpContinuousProfiler", new Object[0]);
                    sentryAndroidOptions.getLogger().i(q5.WARNING, "Could not load profiler, profiling will be disabled. If you are using Spring or Spring Boot with the OTEL Agent profiler init will be retried.", new Object[0]);
                    sentryAndroidOptions.getContinuousProfiler();
                } catch (Throwable th) {
                    logger2.d(q5.ERROR, "Failed to load continuous profiler provider, using NoOpContinuousProfiler", th);
                }
            } catch (Exception e3) {
                sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to create default profiling traces directory", e3);
            }
        } else {
            sentryAndroidOptions.getContinuousProfiler();
        }
        if (!io.sentry.util.j.a && sentryAndroidOptions.isContinuousProfilingEnabled() && (sentryAndroidOptions.getProfilerConverter() instanceof w2)) {
            z0 logger3 = c.l.getLogger();
            try {
                Iterator it4 = ServiceLoader.load(io.sentry.profiling.b.class).iterator();
                if ((it4.hasNext() ? it4.next() : null) != null) {
                    throw new ClassCastException();
                }
                logger3.i(q5.DEBUG, "No profile converter provider found, using NoOpProfileConverter", new Object[0]);
                sentryAndroidOptions.getLogger().i(q5.WARNING, "Could not load profile converter. If you are using Spring or Spring Boot with the OTEL Agent, profile converter init will be retried.", new Object[0]);
                sentryAndroidOptions.getProfilerConverter();
            } catch (Throwable th2) {
                logger3.d(q5.ERROR, "Failed to load profile converter provider, using NoOpProfileConverter", th2);
            }
        } else {
            sentryAndroidOptions.getProfilerConverter();
        }
        sentryAndroidOptions.getLogger().i(q5.INFO, "Continuous profiler is enabled %s mode: %s", Boolean.valueOf(sentryAndroidOptions.isContinuousProfilingEnabled()), sentryAndroidOptions.getProfileLifecycle());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00af  */
    public static void e(SentryAndroidOptions sentryAndroidOptions) {
        h1 wVar;
        Class clsC;
        List list;
        v2 v2Var = v2.a;
        boolean z = io.sentry.util.j.a;
        if (!z) {
            if (z5.AUTO.equals(sentryAndroidOptions.getOpenTelemetryMode())) {
                if (io.sentry.util.g.a(v2Var, "io.sentry.opentelemetry.agent.AgentMarker")) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENT", new Object[0]);
                    sentryAndroidOptions.setOpenTelemetryMode(z5.AGENT);
                } else if (io.sentry.util.g.a(v2Var, "io.sentry.opentelemetry.agent.AgentlessMarker")) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS", new Object[0]);
                    sentryAndroidOptions.setOpenTelemetryMode(z5.AGENTLESS);
                } else if (io.sentry.util.g.a(v2Var, "io.sentry.opentelemetry.agent.AgentlessSpringMarker")) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "openTelemetryMode has been inferred from AUTO to AGENTLESS_SPRING", new Object[0]);
                    sentryAndroidOptions.setOpenTelemetryMode(z5.AGENTLESS_SPRING);
                }
            }
        }
        z5 z5Var = z5.OFF;
        int i = 1;
        if (z5Var == sentryAndroidOptions.getOpenTelemetryMode()) {
            sentryAndroidOptions.setSpanFactory(new h3(i));
        }
        a.close();
        sentryAndroidOptions.getScopesStorageFactory();
        if (z5Var == sentryAndroidOptions.getOpenTelemetryMode()) {
            a = new w();
        } else {
            if (z || !io.sentry.util.g.a(v2Var, "io.sentry.opentelemetry.OtelContextScopesStorage") || (clsC = io.sentry.util.g.c(v2Var, "io.sentry.opentelemetry.OtelContextScopesStorage", true)) == null) {
                wVar = new w();
            } else {
                try {
                    Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                    if (objNewInstance instanceof h1) {
                        wVar = (h1) objNewInstance;
                    } else {
                        wVar = new w();
                    }
                } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
                }
            }
            a = wVar;
        }
        if (io.sentry.util.j.a) {
            return;
        }
        z5 openTelemetryMode = sentryAndroidOptions.getOpenTelemetryMode();
        if (z5.OFF.equals(openTelemetryMode)) {
            list = Collections.EMPTY_LIST;
        } else {
            ConcurrentHashMap concurrentHashMap = io.sentry.util.o.a;
            ArrayList arrayList = new ArrayList();
            z5 z5Var2 = z5.AGENT;
            if (z5Var2 == openTelemetryMode || z5.AGENTLESS_SPRING == openTelemetryMode) {
                arrayList.add("auto.http.spring_jakarta.webmvc");
                arrayList.add("auto.http.spring.webmvc");
                arrayList.add("auto.http.spring7.webmvc");
                arrayList.add("auto.spring_jakarta.webflux");
                arrayList.add("auto.spring.webflux");
                arrayList.add("auto.spring7.webflux");
                arrayList.add("auto.db.jdbc");
                arrayList.add("auto.http.spring_jakarta.webclient");
                arrayList.add("auto.http.spring.webclient");
                arrayList.add("auto.http.spring7.webclient");
                arrayList.add("auto.http.spring_jakarta.restclient");
                arrayList.add("auto.http.spring.restclient");
                arrayList.add("auto.http.spring7.restclient");
                arrayList.add("auto.http.spring_jakarta.resttemplate");
                arrayList.add("auto.http.spring.resttemplate");
                arrayList.add("auto.http.spring7.resttemplate");
                arrayList.add("auto.http.openfeign");
                arrayList.add("auto.http.ktor-client");
                arrayList.add("auto.queue.spring_jakarta.kafka.producer");
                arrayList.add("auto.queue.spring_jakarta.kafka.consumer");
                arrayList.add("auto.queue.kafka.producer");
                arrayList.add("auto.queue.kafka.consumer");
            }
            if (z5Var2 == openTelemetryMode) {
                arrayList.add("auto.graphql.graphql");
                arrayList.add("auto.graphql.graphql22");
            }
            list = arrayList;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sentryAndroidOptions.addIgnoredSpanOrigin((String) it.next());
        }
    }

    public static boolean f() {
        return b().isEnabled();
    }

    public static boolean g(SentryAndroidOptions sentryAndroidOptions) {
        Properties properties;
        Double dValueOf;
        Double dValueOf2;
        Double dValueOf3;
        Properties propertiesB;
        Properties propertiesB2;
        if (sentryAndroidOptions.isEnableExternalConfiguration()) {
            p2 p2Var = new p2();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new io.sentry.config.e("sentry.", System.getProperties()));
            arrayList.add(new io.sentry.config.c());
            String property = System.getProperty("sentry.properties.file");
            if (property != null && (propertiesB2 = new io.sentry.android.core.d1(property, p2Var, true).b()) != null) {
                arrayList.add(new io.sentry.config.e(propertiesB2));
            }
            String str = System.getenv("SENTRY_PROPERTIES_FILE");
            if (str != null && (propertiesB = new io.sentry.android.core.d1(str, p2Var, true).b()) != null) {
                arrayList.add(new io.sentry.config.e(propertiesB));
            }
            Double dValueOf4 = null;
            try {
                InputStream resourceAsStream = io.sentry.util.b.d(io.sentry.config.a.class.getClassLoader()).getResourceAsStream("sentry.properties");
                if (resourceAsStream != null) {
                    try {
                        BufferedInputStream bufferedInputStream = new BufferedInputStream(resourceAsStream);
                        try {
                            properties = new Properties();
                            properties.load(bufferedInputStream);
                            bufferedInputStream.close();
                            resourceAsStream.close();
                        } catch (Throwable th) {
                            try {
                                bufferedInputStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        try {
                            resourceAsStream.close();
                        } catch (Throwable th4) {
                            th3.addSuppressed(th4);
                        }
                        throw th3;
                    }
                } else {
                    if (resourceAsStream != null) {
                        resourceAsStream.close();
                    }
                    properties = null;
                }
            } catch (IOException e2) {
                p2Var.c(q5.ERROR, e2, "Failed to load Sentry configuration from classpath resource: %s", "sentry.properties");
            }
            if (properties != null) {
                arrayList.add(new io.sentry.config.e(properties));
            }
            Properties propertiesB3 = new io.sentry.android.core.d1("sentry.properties", p2Var, false).b();
            if (propertiesB3 != null) {
                arrayList.add(new io.sentry.config.e(propertiesB3));
            }
            io.sentry.config.b bVar = new io.sentry.config.b(arrayList);
            z0 logger = sentryAndroidOptions.getLogger();
            h0 h0Var = new h0();
            h0Var.a = bVar.getProperty("dsn");
            h0Var.b = bVar.getProperty("environment");
            h0Var.c = bVar.getProperty(BuildConfig.BUILD_TYPE);
            h0Var.d = bVar.getProperty("dist");
            h0Var.e = bVar.getProperty("servername");
            h0Var.f = bVar.a("uncaught.handler.enabled");
            h0Var.y = bVar.a("uncaught.handler.print-stacktrace");
            String property2 = bVar.getProperty("sample-rate");
            if (property2 != null) {
                try {
                    dValueOf = Double.valueOf(property2);
                } catch (NumberFormatException unused) {
                    dValueOf = null;
                }
            } else {
                dValueOf = null;
            }
            h0Var.i = dValueOf;
            String property3 = bVar.getProperty("traces-sample-rate");
            if (property3 != null) {
                try {
                    dValueOf2 = Double.valueOf(property3);
                } catch (NumberFormatException unused2) {
                    dValueOf2 = null;
                }
            } else {
                dValueOf2 = null;
            }
            h0Var.j = dValueOf2;
            String property4 = bVar.getProperty("profiles-sample-rate");
            if (property4 != null) {
                try {
                    dValueOf3 = Double.valueOf(property4);
                } catch (NumberFormatException unused3) {
                    dValueOf3 = null;
                }
            } else {
                dValueOf3 = null;
            }
            h0Var.k = dValueOf3;
            h0Var.g = bVar.a("debug");
            h0Var.h = bVar.a("enable-deduplication");
            h0Var.z = bVar.a("send-client-reports");
            h0Var.Q = bVar.a("force-init");
            String property5 = bVar.getProperty("max-request-body-size");
            if (property5 != null) {
                h0Var.l = o6.valueOf(property5.toUpperCase(Locale.ROOT));
            }
            for (Map.Entry entry : ((ConcurrentHashMap) bVar.c()).entrySet()) {
                h0Var.m.put((String) entry.getKey(), (String) entry.getValue());
            }
            String property6 = bVar.getProperty("proxy.host");
            String property7 = bVar.getProperty("proxy.user");
            String property8 = bVar.getProperty("proxy.pass");
            String property9 = bVar.getProperty("proxy.port");
            if (property9 == null) {
                property9 = "80";
            }
            if (property6 != null) {
                n6 n6Var = new n6();
                n6Var.a = property6;
                n6Var.b = property9;
                n6Var.c = property7;
                n6Var.d = property8;
                h0Var.n = n6Var;
            }
            Iterator it = bVar.d("in-app-includes").iterator();
            while (it.hasNext()) {
                h0Var.p.add((String) it.next());
            }
            Iterator it2 = bVar.d("in-app-excludes").iterator();
            while (it2.hasNext()) {
                h0Var.o.add((String) it2.next());
            }
            List<String> listD = bVar.getProperty("trace-propagation-targets") != null ? bVar.d("trace-propagation-targets") : null;
            if (listD == null && bVar.getProperty("tracing-origins") != null) {
                listD = bVar.d("tracing-origins");
            }
            if (listD != null) {
                for (String str2 : listD) {
                    if (h0Var.q == null) {
                        h0Var.q = new CopyOnWriteArrayList();
                    }
                    if (!str2.isEmpty()) {
                        h0Var.q.add(str2);
                    }
                }
            }
            Iterator it3 = bVar.d("context-tags").iterator();
            while (it3.hasNext()) {
                h0Var.r.add((String) it3.next());
            }
            h0Var.s = bVar.getProperty("proguard-uuid");
            Iterator it4 = bVar.d("bundle-ids").iterator();
            while (it4.hasNext()) {
                h0Var.A.add((String) it4.next());
            }
            h0Var.t = bVar.b("idle-timeout");
            h0Var.u = bVar.b("shutdown-timeout-millis");
            h0Var.v = bVar.b("session-flush-timeout-millis");
            String property10 = bVar.getProperty("ignored-errors");
            h0Var.x = property10 != null ? Arrays.asList(property10.split(",")) : null;
            h0Var.B = bVar.a("enabled");
            h0Var.C = bVar.a("enable-pretty-serialization-output");
            h0Var.J = bVar.a("send-modules");
            h0Var.K = bVar.a("send-default-pii");
            String property11 = bVar.getProperty("ignored-checkins");
            h0Var.H = property11 != null ? Arrays.asList(property11.split(",")) : null;
            String property12 = bVar.getProperty("ignored-transactions");
            h0Var.I = property12 != null ? Arrays.asList(property12.split(",")) : null;
            h0Var.L = bVar.a("enable-backpressure-handling");
            h0Var.M = bVar.a("enable-database-transaction-tracing");
            h0Var.N = bVar.a("enable-cache-tracing");
            h0Var.O = bVar.a("enable-queue-tracing");
            h0Var.P = bVar.a("global-hub-mode");
            h0Var.R = bVar.a("capture-open-telemetry-events");
            h0Var.E = bVar.a("logs.enabled");
            h0Var.F = bVar.a("metrics.enabled");
            for (String str3 : bVar.d("ignored-exceptions-for-type")) {
                try {
                    Class<?> cls = Class.forName(str3);
                    if (Throwable.class.isAssignableFrom(cls)) {
                        h0Var.w.add(cls);
                    } else {
                        logger.i(q5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s does not extend Throwable", str3, str3);
                    }
                } catch (ClassNotFoundException unused4) {
                    logger.i(q5.WARNING, "Skipping setting %s as ignored-exception-for-type. Reason: %s class is not found", str3, str3);
                }
            }
            Long lB = bVar.b("cron.default-checkin-margin");
            Long lB2 = bVar.b("cron.default-max-runtime");
            String property13 = bVar.getProperty("cron.default-timezone");
            Long lB3 = bVar.b("cron.default-failure-issue-threshold");
            Long lB4 = bVar.b("cron.default-recovery-threshold");
            if (lB != null || lB2 != null || property13 != null || lB3 != null || lB4 != null) {
                g6 g6Var = new g6();
                g6Var.a = lB;
                g6Var.b = lB2;
                g6Var.c = property13;
                g6Var.d = lB3;
                g6Var.e = lB4;
                h0Var.X = g6Var;
            }
            h0Var.V = bVar.a("enable-strict-trace-continuation");
            h0Var.W = bVar.getProperty("org-id");
            h0Var.D = bVar.a("enable-spotlight");
            h0Var.G = bVar.getProperty("spotlight-connection-url");
            String property14 = bVar.getProperty("profile-session-sample-rate");
            if (property14 != null) {
                try {
                    dValueOf4 = Double.valueOf(property14);
                } catch (NumberFormatException unused5) {
                }
            }
            h0Var.S = dValueOf4;
            h0Var.T = bVar.getProperty("profiling-traces-dir-path");
            String property15 = bVar.getProperty("profile-lifecycle");
            if (property15 != null && !property15.isEmpty()) {
                h0Var.U = t3.valueOf(property15.toUpperCase());
            }
            sentryAndroidOptions.merge(h0Var);
        }
        String dsn = sentryAndroidOptions.getDsn();
        if (!sentryAndroidOptions.isEnabled() || (dsn != null && dsn.isEmpty())) {
            a();
            return false;
        }
        if (dsn != null) {
            sentryAndroidOptions.retrieveParsedDsn();
            return true;
        }
        qc0.j("DSN is required. Use empty string or set enabled to false in SentryOptions to disable SDK.");
        return false;
    }

    public static void h(io.sentry.protocol.i0 i0Var) {
        b().c(i0Var);
    }
}
