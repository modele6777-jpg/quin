package io.sentry;

import com.adjust.sdk.Constants;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class q6 {
    static final q5 DEFAULT_DIAGNOSTIC_LEVEL = q5.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    public static final long MAX_EVENT_SIZE_BYTES = 1048576;
    private q0 appStartExtender;
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private io.sentry.backpressure.b backpressureMonitor;
    private b6 beforeBreadcrumb;
    private c6 beforeEnvelopeCallback;
    private d6 beforeSend;
    private d6 beforeSendFeedback;
    private e6 beforeSendReplay;
    private f6 beforeSendTransaction;
    private String cacheDirPath;
    private boolean captureOpenTelemetryEvents;
    io.sentry.clientreport.f clientReportRecorder;
    private o compositePerformanceCollector;
    private t0 connectionStatusProvider;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;
    private u0 continuousProfiler;
    private g6 cron;
    private final io.sentry.util.f dateProvider;
    private long deadlineTimeout;
    private boolean debug;
    private io.sentry.internal.debugmeta.a debugMetaLoader;
    private i4 defaultScopeType;
    private final List<String> defaultTracePropagationTargets;
    private q5 diagnosticLevel;
    private String dist;
    private String distinctId;
    private h6 distribution;
    private v0 distributionController;
    private String dsn;
    private String dsnHash;
    private boolean enableAppStartProfiling;
    private boolean enableAutoSessionTracking;
    private boolean enableBackpressureHandling;
    private boolean enableCacheTracing;
    private boolean enableDatabaseTransactionTracing;
    private boolean enableDeduplication;
    private boolean enableEventSizeLimiting;
    private boolean enableExternalConfiguration;
    private boolean enableLegacyProfiling;
    private boolean enablePrettySerializationOutput;
    private boolean enableQueueTracing;
    private boolean enableScopePersistence;
    private boolean enableScreenTracking;
    private boolean enableShutdownHook;
    private boolean enableSpotlight;
    private boolean enableTimeToFullDisplayTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private io.sentry.cache.d envelopeDiskCache;
    private final io.sentry.util.f envelopeReader;
    private String environment;
    private k1 executorService;
    private final g0 experimental;
    private z0 fatalLogger;
    private l5 feedbackOptions;
    private boolean forceInit;
    private k0 fullyDisplayedReporter;
    private final List<io.sentry.internal.gestures.a> gestureTargetLocators;
    private Boolean globalHubMode;
    private Long idleTimeout;
    private List<j0> ignoredCheckIns;
    private List<j0> ignoredSpanOrigins;
    private List<j0> ignoredTransactions;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private u1 initPriority;
    private v1 instrumenter;
    private volatile l7 internalTracesSampler;
    protected final io.sentry.util.a lock;
    private z0 logger;
    private i6 logs;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxFeatureFlags;
    private int maxQueueSize;
    private o6 maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private j6 metrics;
    private io.sentry.internal.modules.a modulesLoader;
    private final List<f1> observers;
    private k6 onDiscard;
    private l6 onOversizedEvent;
    private z5 openTelemetryMode;
    private final List<a1> optionsObservers;
    private String orgId;
    private final io.sentry.util.f parsedDsn;
    private final List<b1> performanceCollectors;
    private boolean printUncaughtStackTrace;
    private t3 profileLifecycle;
    private Double profileSessionSampleRate;
    private d1 profilerConverter;
    private Double profilesSampleRate;
    private m6 profilesSampler;
    private String profilingTracesDirPath;
    private int profilingTracesHz;
    private String proguardUuid;
    private boolean propagateTraceparent;
    private n6 proxy;
    private int readTimeoutMillis;
    private String release;
    private y3 replayController;
    private Double sampleRate;
    private i1 scopesStorageFactory;
    private io.sentry.protocol.u sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private final io.sentry.util.f serializer;
    private String serverName;
    private u6 sessionReplay;
    private long sessionTrackingIntervalMillis;
    private n1 socketTagger;
    private p1 spanFactory;
    private String spotlightConnectionUrl;
    private final AtomicBoolean spotlightIntegrationLoaded;
    private SSLSocketFactory sslSocketFactory;
    private boolean startProfilerOnAppStart;
    private boolean strictTraceContinuation;
    private final Map<String, String> tags;
    private io.sentry.util.thread.a threadChecker;
    private k1 timerExecutorService;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private p6 tracesSampler;
    private r1 transactionProfiler;
    private s1 transportFactory;
    private io.sentry.transport.h transportGate;
    private t1 versionDetector;
    private final List<ComposeViewHierarchyExporter> viewHierarchyExporters;
    private final List<f0> eventProcessors = new CopyOnWriteArrayList();
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType = new CopyOnWriteArraySet();
    private List<j0> ignoredErrors = null;
    private final List<w1> integrations = new CopyOnWriteArrayList();
    private final Set<String> bundleIds = new CopyOnWriteArraySet();
    private long shutdownTimeoutMillis = 2000;
    private long flushTimeoutMillis = 15000;
    private long sessionFlushTimeoutMillis = 15000;

    /* JADX WARN: Code duplicated, block: B:17:0x02a6  */
    public q6(boolean z) {
        p1 h3Var;
        Class clsC;
        final int i = 0;
        this.parsedDsn = new io.sentry.util.f(new io.sentry.util.e(this) { // from class: io.sentry.a6
            public final /* synthetic */ q6 b;

            {
                this.b = this;
            }

            @Override // io.sentry.util.e
            public final Object c() {
                int i2 = i;
                q6 q6Var = this.b;
                switch (i2) {
                    case 0:
                        return q6Var.a();
                    case 1:
                        return new l2(q6Var);
                    default:
                        return q6Var.b();
                }
            }
        });
        v2 v2Var = v2.a;
        this.logger = v2Var;
        this.fatalLogger = v2Var;
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        final int i2 = 1;
        this.serializer = new io.sentry.util.f(new io.sentry.util.e(this) { // from class: io.sentry.a6
            public final /* synthetic */ q6 b;

            {
                this.b = this;
            }

            @Override // io.sentry.util.e
            public final Object c() {
                int i3 = i2;
                q6 q6Var = this.b;
                switch (i3) {
                    case 0:
                        return q6Var.a();
                    case 1:
                        return new l2(q6Var);
                    default:
                        return q6Var.b();
                }
            }
        });
        final int i3 = 2;
        this.envelopeReader = new io.sentry.util.f(new io.sentry.util.e(this) { // from class: io.sentry.a6
            public final /* synthetic */ q6 b;

            {
                this.b = this;
            }

            @Override // io.sentry.util.e
            public final Object c() {
                int i4 = i3;
                q6 q6Var = this.b;
                switch (i4) {
                    case 0:
                        return q6Var.a();
                    case 1:
                        return new l2(q6Var);
                    default:
                        return q6Var.b();
                }
            }
        });
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.maxFeatureFlags = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = j3.a;
        this.transportGate = io.sentry.transport.k.a;
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        d3 d3Var = d3.a;
        this.executorService = d3Var;
        this.timerExecutorService = d3Var;
        this.spotlightIntegrationLoaded = new AtomicBoolean(false);
        this.connectionTimeoutMillis = Constants.CONNECTION_TIMEOUT_VERIFY;
        this.readTimeoutMillis = Constants.CONNECTION_TIMEOUT_VERIFY;
        this.envelopeDiskCache = io.sentry.transport.i.a;
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.enableEventSizeLimiting = false;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = o6.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = p2.e;
        this.continuousProfiler = s2.a;
        this.profilerConverter = w2.a;
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.propagateTraceparent = false;
        this.strictTraceContinuation = false;
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new io.sentry.internal.debugmeta.c(this);
        this.modulesLoader = io.sentry.internal.modules.e.a;
        this.debugMetaLoader = io.sentry.internal.debugmeta.b.a;
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = v1.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.threadChecker = io.sentry.util.thread.b.a;
        this.traceOptionsRequests = true;
        this.enableDatabaseTransactionTracing = false;
        this.enableCacheTracing = false;
        this.enableQueueTracing = false;
        this.dateProvider = new io.sentry.util.f(new com.adjust.sdk.sig.r3(13));
        this.performanceCollectors = new ArrayList();
        this.compositePerformanceCollector = q2.a;
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = k0.b;
        this.appStartExtender = p2.a;
        this.connectionStatusProvider = new r2();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.enableSpotlight = false;
        this.enableScopePersistence = true;
        this.ignoredCheckIns = null;
        this.ignoredSpanOrigins = null;
        this.ignoredTransactions = null;
        this.backpressureMonitor = io.sentry.backpressure.c.a;
        this.enableBackpressureHandling = true;
        this.enableAppStartProfiling = false;
        this.spanFactory = h3.b;
        this.profilingTracesHz = 101;
        this.cron = null;
        this.replayController = p2.d;
        this.distributionController = p2.b;
        this.enableScreenTracking = true;
        this.defaultScopeType = i4.ISOLATION;
        this.initPriority = u1.MEDIUM;
        this.forceInit = false;
        this.globalHubMode = null;
        this.lock = new io.sentry.util.a();
        this.openTelemetryMode = z5.AUTO;
        this.captureOpenTelemetryEvents = false;
        this.versionDetector = k3.a;
        this.profileLifecycle = t3.MANUAL;
        this.startProfilerOnAppStart = false;
        this.enableLegacyProfiling = true;
        this.deadlineTimeout = 30000L;
        i6 i6Var = new i6();
        i6Var.a = false;
        i6Var.b = new io.sentry.logger.e();
        this.logs = i6Var;
        j6 j6Var = new j6();
        j6Var.a = true;
        j6Var.b = new io.sentry.metrics.d();
        this.metrics = j6Var;
        this.socketTagger = f3.a;
        this.distribution = new h6();
        io.sentry.protocol.u uVar = new io.sentry.protocol.u("sentry.java", "8.53.0");
        uVar.b = "8.53.0";
        this.experimental = new g0();
        u6 u6Var = new u6(6);
        u6Var.c = false;
        u6Var.f = t6.MEDIUM;
        u6Var.g = 1;
        u6Var.h = 30000L;
        u6Var.i = 5000L;
        u6Var.j = 3600000L;
        u6Var.k = true;
        u6Var.m = false;
        u6Var.n = l4.PIXEL_COPY;
        u6Var.o = false;
        List list = Collections.EMPTY_LIST;
        u6Var.p = list;
        u6Var.q = list;
        u6Var.r = true;
        List list2 = u6.u;
        u6Var.s = list2;
        u6Var.t = list2;
        if (!z) {
            ((CopyOnWriteArraySet) u6Var.a).add("android.widget.TextView");
            ((CopyOnWriteArraySet) u6Var.a).add("android.widget.ImageView");
            ((CopyOnWriteArraySet) u6Var.a).add("android.webkit.WebView");
            ((CopyOnWriteArraySet) u6Var.a).add("android.widget.VideoView");
            ((CopyOnWriteArraySet) u6Var.a).add("androidx.camera.view.PreviewView");
            ((CopyOnWriteArraySet) u6Var.a).add("androidx.media3.ui.PlayerView");
            ((CopyOnWriteArraySet) u6Var.a).add("com.google.android.exoplayer2.ui.PlayerView");
            ((CopyOnWriteArraySet) u6Var.a).add("com.google.android.exoplayer2.ui.StyledPlayerView");
            u6Var.l = uVar;
        }
        this.sessionReplay = u6Var;
        l5 l5Var = new l5();
        l5Var.a = false;
        l5Var.b = true;
        l5Var.c = false;
        l5Var.d = true;
        l5Var.e = true;
        l5Var.f = true;
        l5Var.g = false;
        this.feedbackOptions = l5Var;
        if (z) {
            return;
        }
        if (io.sentry.util.j.a || !io.sentry.util.g.a(v2Var, "io.sentry.opentelemetry.OtelSpanFactory") || (clsC = io.sentry.util.g.c(v2Var, "io.sentry.opentelemetry.OtelSpanFactory", true)) == null) {
            h3Var = new h3(i2);
        } else {
            try {
                Object objNewInstance = clsC.getDeclaredConstructor(null).newInstance(null);
                if (objNewInstance instanceof p1) {
                    h3Var = (p1) objNewInstance;
                } else {
                    h3Var = new h3(i2);
                }
            } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            }
        }
        setSpanFactory(h3Var);
        List<w1> list3 = this.integrations;
        UncaughtExceptionHandlerIntegration uncaughtExceptionHandlerIntegration = new UncaughtExceptionHandlerIntegration();
        uncaughtExceptionHandlerIntegration.d = false;
        list3.add(uncaughtExceptionHandlerIntegration);
        this.integrations.add(new ShutdownHookIntegration());
        this.eventProcessors.add(new m2(this));
        this.eventProcessors.add(new q(this));
        if (!io.sentry.util.j.a) {
            this.eventProcessors.add(new v6());
        }
        setSentryClientName("sentry.java/8.53.0");
        setSdkVersion(uVar);
        o5.d().b("maven:io.sentry:sentry", "8.53.0");
    }

    public static q6 empty() {
        return new q6(true);
    }

    public final /* synthetic */ c0 a() {
        return new c0(this.dsn);
    }

    public void activate() {
        if (this.executorService instanceof d3) {
            this.executorService = new k5(this);
        }
        if (this.timerExecutorService instanceof d3) {
            this.timerExecutorService = new k5(this, 0);
        }
        if (this.spotlightIntegrationLoaded.compareAndSet(false, true)) {
            try {
                this.integrations.add((w1) Class.forName("io.sentry.spotlight.SpotlightIntegration").getConstructor(null).newInstance(null));
            } catch (Throwable unused) {
            }
        }
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(f0 f0Var) {
        this.eventProcessors.add(f0Var);
    }

    public void addIgnoredCheckIn(String str) {
        List arrayList = this.ignoredCheckIns;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredCheckIns = arrayList;
        }
        arrayList.add(new j0(str));
    }

    public void addIgnoredError(String str) {
        List arrayList = this.ignoredErrors;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredErrors = arrayList;
        }
        arrayList.add(new j0(str));
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addIgnoredSpanOrigin(String str) {
        List arrayList = this.ignoredSpanOrigins;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredSpanOrigins = arrayList;
        }
        arrayList.add(new j0(str));
    }

    public void addIgnoredTransaction(String str) {
        List arrayList = this.ignoredTransactions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.ignoredTransactions = arrayList;
        }
        arrayList.add(new j0(str));
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(w1 w1Var) {
        this.integrations.add(w1Var);
    }

    public void addOptionsObserver(a1 a1Var) {
        this.optionsObservers.add(a1Var);
    }

    public void addPerformanceCollector(b1 b1Var) {
        this.performanceCollectors.add(b1Var);
    }

    public void addScopeObserver(f1 f1Var) {
        this.observers.add(f1Var);
    }

    public final /* synthetic */ d0 b() {
        return new d0((m1) this.serializer.a());
    }

    public boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public io.sentry.cache.g findPersistingScopeObserver() {
        for (f1 f1Var : this.observers) {
            if (f1Var instanceof io.sentry.cache.g) {
                return (io.sentry.cache.g) f1Var;
            }
        }
        return null;
    }

    public q0 getAppStartExtender() {
        return this.appStartExtender;
    }

    public io.sentry.backpressure.b getBackpressureMonitor() {
        return this.backpressureMonitor;
    }

    public b6 getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public c6 getBeforeEnvelopeCallback() {
        return null;
    }

    public d6 getBeforeSend() {
        return null;
    }

    public d6 getBeforeSendFeedback() {
        return null;
    }

    public e6 getBeforeSendReplay() {
        return null;
    }

    public f6 getBeforeSendTransaction() {
        return null;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    public String getCacheDirPathWithoutDsn() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.cacheDirPath;
    }

    public io.sentry.clientreport.f getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    public o getCompositePerformanceCollector() {
        return this.compositePerformanceCollector;
    }

    public t0 getConnectionStatusProvider() {
        return this.connectionStatusProvider;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    public u0 getContinuousProfiler() {
        return this.continuousProfiler;
    }

    public g6 getCron() {
        return this.cron;
    }

    public a5 getDateProvider() {
        return (a5) this.dateProvider.a();
    }

    public long getDeadlineTimeout() {
        return this.deadlineTimeout;
    }

    public io.sentry.internal.debugmeta.a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public i4 getDefaultScopeType() {
        return this.defaultScopeType;
    }

    public q5 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    public String getDistinctId() {
        return this.distinctId;
    }

    public h6 getDistribution() {
        return this.distribution;
    }

    public v0 getDistributionController() {
        return this.distributionController;
    }

    public String getDsn() {
        return this.dsn;
    }

    public String getEffectiveOrgId() {
        String str = this.orgId;
        if (str != null) {
            String strTrim = str.trim();
            if (!strTrim.isEmpty()) {
                return strTrim;
            }
        }
        try {
            return retrieveParsedDsn().d;
        } catch (Throwable unused) {
            return null;
        }
    }

    public io.sentry.cache.d getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public w0 getEnvelopeReader() {
        return (w0) this.envelopeReader.a();
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : "production";
    }

    public List<f0> getEventProcessors() {
        return this.eventProcessors;
    }

    public k1 getExecutorService() {
        return this.executorService;
    }

    public g0 getExperimental() {
        return this.experimental;
    }

    public z0 getFatalLogger() {
        return this.fatalLogger;
    }

    public l5 getFeedbackOptions() {
        return this.feedbackOptions;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    public k0 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<io.sentry.internal.gestures.a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    public List<j0> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public List<j0> getIgnoredErrors() {
        return this.ignoredErrors;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<j0> getIgnoredSpanOrigins() {
        return this.ignoredSpanOrigins;
    }

    public List<j0> getIgnoredTransactions() {
        return this.ignoredTransactions;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public u1 getInitPriority() {
        return this.initPriority;
    }

    public v1 getInstrumenter() {
        return this.instrumenter;
    }

    public List<w1> getIntegrations() {
        return this.integrations;
    }

    public l7 getInternalTracesSampler() {
        if (this.internalTracesSampler == null) {
            io.sentry.util.a aVar = this.lock;
            aVar.b();
            try {
                if (this.internalTracesSampler == null) {
                    this.internalTracesSampler = new l7(this);
                }
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
        return this.internalTracesSampler;
    }

    public z0 getLogger() {
        return this.logger;
    }

    public i6 getLogs() {
        return this.logs;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxFeatureFlags() {
        return this.maxFeatureFlags;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public o6 getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    public j6 getMetrics() {
        return this.metrics;
    }

    public io.sentry.internal.modules.a getModulesLoader() {
        return this.modulesLoader;
    }

    public k6 getOnDiscard() {
        return null;
    }

    public l6 getOnOversizedEvent() {
        return null;
    }

    public z5 getOpenTelemetryMode() {
        return this.openTelemetryMode;
    }

    public List<a1> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOrgId() {
        return this.orgId;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public List<b1> getPerformanceCollectors() {
        return this.performanceCollectors;
    }

    public t3 getProfileLifecycle() {
        return this.profileLifecycle;
    }

    public Double getProfileSessionSampleRate() {
        return this.profileSessionSampleRate;
    }

    public d1 getProfilerConverter() {
        return this.profilerConverter;
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public m6 getProfilesSampler() {
        return null;
    }

    public String getProfilingTracesDirPath() {
        String str = this.profilingTracesDirPath;
        if (str != null && !str.isEmpty()) {
            return this.dsnHash != null ? new File(this.profilingTracesDirPath, this.dsnHash).getAbsolutePath() : this.profilingTracesDirPath;
        }
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public int getProfilingTracesHz() {
        return this.profilingTracesHz;
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public n6 getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public y3 getReplayController() {
        return this.replayController;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<f1> getScopeObservers() {
        return this.observers;
    }

    public i1 getScopesStorageFactory() {
        return null;
    }

    public io.sentry.protocol.u getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public m1 getSerializer() {
        return (m1) this.serializer.a();
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionFlushTimeoutMillis() {
        return this.sessionFlushTimeoutMillis;
    }

    public u6 getSessionReplay() {
        return this.sessionReplay;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public n1 getSocketTagger() {
        return this.socketTagger;
    }

    public p1 getSpanFactory() {
        return this.spanFactory;
    }

    public String getSpotlightConnectionUrl() {
        return this.spotlightConnectionUrl;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public io.sentry.util.thread.a getThreadChecker() {
        return this.threadChecker;
    }

    public k1 getTimerExecutorService() {
        return this.timerExecutorService;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public p6 getTracesSampler() {
        return null;
    }

    public r1 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public s1 getTransportFactory() {
        return this.transportFactory;
    }

    public io.sentry.transport.h getTransportGate() {
        return this.transportGate;
    }

    public t1 getVersionDetector() {
        return this.versionDetector;
    }

    public final List<ComposeViewHierarchyExporter> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isCaptureOpenTelemetryEvents() {
        return this.captureOpenTelemetryEvents;
    }

    public boolean isContinuousProfilingEnabled() {
        Double d;
        return this.profilesSampleRate == null && (d = this.profileSessionSampleRate) != null && d.doubleValue() > 0.0d;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAppStartProfiling() {
        return (isProfilingEnabled() || isContinuousProfilingEnabled()) && this.enableAppStartProfiling;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableBackpressureHandling() {
        return this.enableBackpressureHandling;
    }

    public boolean isEnableCacheTracing() {
        return this.enableCacheTracing;
    }

    public boolean isEnableDatabaseTransactionTracing() {
        return this.enableDatabaseTransactionTracing;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableEventSizeLimiting() {
        return this.enableEventSizeLimiting;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableLegacyProfiling() {
        return this.enableLegacyProfiling;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableQueueTracing() {
        return this.enableQueueTracing;
    }

    public boolean isEnableScopePersistence() {
        return this.enableScopePersistence;
    }

    public boolean isEnableScreenTracking() {
        return this.enableScreenTracking;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableSpotlight() {
        return this.enableSpotlight;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isForceInit() {
        return this.forceInit;
    }

    public Boolean isGlobalHubMode() {
        return this.globalHubMode;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        Double d = this.profilesSampleRate;
        return d != null && d.doubleValue() > 0.0d;
    }

    public boolean isPropagateTraceparent() {
        return this.propagateTraceparent;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isStartProfilerOnAppStart() {
        return this.startProfilerOnAppStart;
    }

    public boolean isStrictTraceContinuation() {
        return this.strictTraceContinuation;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        if (getTracesSampleRate() != null) {
            return true;
        }
        getTracesSampler();
        return false;
    }

    public void loadLazyFields() {
        getSerializer();
        retrieveParsedDsn();
        getEnvelopeReader();
        getDateProvider();
    }

    public void merge(h0 h0Var) {
        String str = h0Var.a;
        if (str != null) {
            setDsn(str);
        }
        String str2 = h0Var.b;
        if (str2 != null) {
            setEnvironment(str2);
        }
        String str3 = h0Var.c;
        if (str3 != null) {
            setRelease(str3);
        }
        String str4 = h0Var.d;
        if (str4 != null) {
            setDist(str4);
        }
        String str5 = h0Var.e;
        if (str5 != null) {
            setServerName(str5);
        }
        n6 n6Var = h0Var.n;
        if (n6Var != null) {
            setProxy(n6Var);
        }
        Boolean bool = h0Var.f;
        if (bool != null) {
            setEnableUncaughtExceptionHandler(bool.booleanValue());
        }
        Boolean bool2 = h0Var.y;
        if (bool2 != null) {
            setPrintUncaughtStackTrace(bool2.booleanValue());
        }
        Double d = h0Var.i;
        if (d != null) {
            setSampleRate(d);
        }
        Double d2 = h0Var.j;
        if (d2 != null) {
            setTracesSampleRate(d2);
        }
        Double d3 = h0Var.k;
        if (d3 != null) {
            setProfilesSampleRate(d3);
        }
        Boolean bool3 = h0Var.g;
        if (bool3 != null) {
            setDebug(bool3.booleanValue());
        }
        Boolean bool4 = h0Var.h;
        if (bool4 != null) {
            setEnableDeduplication(bool4.booleanValue());
        }
        Boolean bool5 = h0Var.z;
        if (bool5 != null) {
            setSendClientReports(bool5.booleanValue());
        }
        Boolean bool6 = h0Var.Q;
        if (bool6 != null) {
            setForceInit(bool6.booleanValue());
        }
        for (Map.Entry entry : new HashMap(h0Var.m).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(h0Var.p).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(h0Var.o).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(h0Var.w).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (h0Var.q != null) {
            setTracePropagationTargets(new ArrayList(h0Var.q));
        }
        Iterator it4 = new ArrayList(h0Var.r).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        String str6 = h0Var.s;
        if (str6 != null) {
            setProguardUuid(str6);
        }
        Long l = h0Var.t;
        if (l != null) {
            setIdleTimeout(l);
        }
        Long l2 = h0Var.u;
        if (l2 != null) {
            setShutdownTimeoutMillis(l2.longValue());
        }
        Long l3 = h0Var.v;
        if (l3 != null) {
            setSessionFlushTimeoutMillis(l3.longValue());
        }
        Iterator it5 = h0Var.A.iterator();
        while (it5.hasNext()) {
            addBundleId((String) it5.next());
        }
        Boolean bool7 = h0Var.B;
        if (bool7 != null) {
            setEnabled(bool7.booleanValue());
        }
        Boolean bool8 = h0Var.C;
        if (bool8 != null) {
            setEnablePrettySerializationOutput(bool8.booleanValue());
        }
        Boolean bool9 = h0Var.J;
        if (bool9 != null) {
            setSendModules(bool9.booleanValue());
        }
        if (h0Var.H != null) {
            setIgnoredCheckIns(new ArrayList(h0Var.H));
        }
        if (h0Var.I != null) {
            setIgnoredTransactions(new ArrayList(h0Var.I));
        }
        if (h0Var.x != null) {
            setIgnoredErrors(new ArrayList(h0Var.x));
        }
        Boolean bool10 = h0Var.L;
        if (bool10 != null) {
            setEnableBackpressureHandling(bool10.booleanValue());
        }
        Boolean bool11 = h0Var.M;
        if (bool11 != null) {
            setEnableDatabaseTransactionTracing(bool11.booleanValue());
        }
        Boolean bool12 = h0Var.N;
        if (bool12 != null) {
            setEnableCacheTracing(bool12.booleanValue());
        }
        Boolean bool13 = h0Var.O;
        if (bool13 != null) {
            setEnableQueueTracing(bool13.booleanValue());
        }
        o6 o6Var = h0Var.l;
        if (o6Var != null) {
            setMaxRequestBodySize(o6Var);
        }
        Boolean bool14 = h0Var.K;
        if (bool14 != null) {
            setSendDefaultPii(bool14.booleanValue());
        }
        Boolean bool15 = h0Var.R;
        if (bool15 != null) {
            setCaptureOpenTelemetryEvents(bool15.booleanValue());
        }
        Boolean bool16 = h0Var.D;
        if (bool16 != null) {
            setEnableSpotlight(bool16.booleanValue());
        }
        String str7 = h0Var.G;
        if (str7 != null) {
            setSpotlightConnectionUrl(str7);
        }
        Boolean bool17 = h0Var.P;
        if (bool17 != null) {
            setGlobalHubMode(bool17);
        }
        if (h0Var.X != null) {
            g6 cron = getCron();
            g6 g6Var = h0Var.X;
            if (cron == null) {
                setCron(g6Var);
            } else {
                if (g6Var.a != null) {
                    g6 cron2 = getCron();
                    g6Var = h0Var.X;
                    cron2.a = g6Var.a;
                }
                if (g6Var.b != null) {
                    g6 cron3 = getCron();
                    g6Var = h0Var.X;
                    cron3.b = g6Var.b;
                }
                if (g6Var.c != null) {
                    g6 cron4 = getCron();
                    g6Var = h0Var.X;
                    cron4.c = g6Var.c;
                }
                if (g6Var.d != null) {
                    g6 cron5 = getCron();
                    g6Var = h0Var.X;
                    cron5.d = g6Var.d;
                }
                if (g6Var.e != null) {
                    getCron().e = h0Var.X.e;
                }
            }
        }
        if (h0Var.E != null) {
            getLogs().a = h0Var.E.booleanValue();
        }
        if (h0Var.F != null) {
            getMetrics().a = h0Var.F.booleanValue();
        }
        Double d4 = h0Var.S;
        if (d4 != null) {
            setProfileSessionSampleRate(d4);
        }
        String str8 = h0Var.T;
        if (str8 != null) {
            setProfilingTracesDirPath(str8);
        }
        t3 t3Var = h0Var.U;
        if (t3Var != null) {
            setProfileLifecycle(t3Var);
        }
        Boolean bool18 = h0Var.V;
        if (bool18 != null) {
            setStrictTraceContinuation(bool18.booleanValue());
        }
        String str9 = h0Var.W;
        if (str9 != null) {
            setOrgId(str9);
        }
    }

    public c0 retrieveParsedDsn() {
        return (c0) this.parsedDsn.a();
    }

    public void setAppStartExtender(q0 q0Var) {
        if (q0Var == null) {
            q0Var = p2.a;
        }
        this.appStartExtender = q0Var;
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBackpressureMonitor(io.sentry.backpressure.b bVar) {
        this.backpressureMonitor = bVar;
    }

    public void setBeforeBreadcrumb(b6 b6Var) {
        this.beforeBreadcrumb = b6Var;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setCaptureOpenTelemetryEvents(boolean z) {
        this.captureOpenTelemetryEvents = z;
    }

    public void setCompositePerformanceCollector(o oVar) {
        this.compositePerformanceCollector = oVar;
    }

    public void setConnectionStatusProvider(t0 t0Var) {
        this.connectionStatusProvider = t0Var;
    }

    public void setConnectionTimeoutMillis(int i) {
        this.connectionTimeoutMillis = i;
    }

    public void setContinuousProfiler(u0 u0Var) {
        if (this.continuousProfiler != s2.a || u0Var == null) {
            return;
        }
        this.continuousProfiler = u0Var;
    }

    public void setCron(g6 g6Var) {
        this.cron = g6Var;
    }

    public void setDateProvider(a5 a5Var) {
        this.dateProvider.b(a5Var);
    }

    public void setDeadlineTimeout(long j) {
        this.deadlineTimeout = j;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    public void setDebugMetaLoader(io.sentry.internal.debugmeta.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.debugmeta.b.a;
        }
        this.debugMetaLoader = aVar;
    }

    public void setDefaultScopeType(i4 i4Var) {
        this.defaultScopeType = i4Var;
    }

    public void setDiagnosticLevel(q5 q5Var) {
        if (q5Var == null) {
            q5Var = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = q5Var;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDistribution(h6 h6Var) {
        if (h6Var == null) {
            h6Var = new h6();
        }
        this.distribution = h6Var;
    }

    public void setDistributionController(v0 v0Var) {
        if (v0Var == null) {
            v0Var = p2.b;
        }
        this.distributionController = v0Var;
    }

    public void setDsn(String str) {
        String string = null;
        this.dsn = str != null ? str.trim() : null;
        io.sentry.util.f fVar = this.parsedDsn;
        io.sentry.util.a aVar = fVar.c;
        aVar.b();
        try {
            fVar.a = null;
            aVar.close();
            String str2 = this.dsn;
            z0 z0Var = this.logger;
            Charset charset = io.sentry.util.p.a;
            if (str2 != null && !str2.isEmpty()) {
                try {
                    string = new BigInteger(1, MessageDigest.getInstance("SHA-1").digest(str2.getBytes(io.sentry.util.p.a))).toString(16);
                } catch (NoSuchAlgorithmException e) {
                    z0Var.d(q5.INFO, "SHA-1 isn't available to calculate the hash.", e);
                } catch (Throwable th) {
                    z0Var.i(q5.INFO, "string: %s could not calculate its hash", th, str2);
                }
            }
            this.dsnHash = string;
        } catch (Throwable th2) {
            try {
                aVar.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public void setEnableAppStartProfiling(boolean z) {
        this.enableAppStartProfiling = z;
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableBackpressureHandling(boolean z) {
        this.enableBackpressureHandling = z;
    }

    public void setEnableCacheTracing(boolean z) {
        this.enableCacheTracing = z;
    }

    public void setEnableDatabaseTransactionTracing(boolean z) {
        this.enableDatabaseTransactionTracing = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableEventSizeLimiting(boolean z) {
        this.enableEventSizeLimiting = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableLegacyProfiling(boolean z) {
        this.enableLegacyProfiling = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableQueueTracing(boolean z) {
        this.enableQueueTracing = z;
    }

    public void setEnableScopePersistence(boolean z) {
        this.enableScopePersistence = z;
    }

    public void setEnableScreenTracking(boolean z) {
        this.enableScreenTracking = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableSpotlight(boolean z) {
        this.enableSpotlight = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(io.sentry.cache.d dVar) {
        if (dVar == null) {
            dVar = io.sentry.transport.i.a;
        }
        this.envelopeDiskCache = dVar;
    }

    public void setEnvelopeReader(w0 w0Var) {
        io.sentry.util.f fVar = this.envelopeReader;
        if (w0Var == null) {
            w0Var = t2.a;
        }
        fVar.b(w0Var);
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    public void setExecutorService(k1 k1Var) {
        if (k1Var != null) {
            this.executorService = k1Var;
        }
    }

    public void setFatalLogger(z0 z0Var) {
        if (z0Var == null) {
            z0Var = v2.a;
        }
        this.fatalLogger = z0Var;
    }

    public void setFeedbackOptions(l5 l5Var) {
        this.feedbackOptions = l5Var;
    }

    public void setFlushTimeoutMillis(long j) {
        this.flushTimeoutMillis = j;
    }

    public void setForceInit(boolean z) {
        this.forceInit = z;
    }

    public void setFullyDisplayedReporter(k0 k0Var) {
        this.fullyDisplayedReporter = k0Var;
    }

    public void setGestureTargetLocators(List<io.sentry.internal.gestures.a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setGlobalHubMode(Boolean bool) {
        this.globalHubMode = bool;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(new j0(str));
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setIgnoredErrors(List<String> list) {
        if (list == null) {
            this.ignoredErrors = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new j0(str));
            }
        }
        this.ignoredErrors = arrayList;
    }

    public void setIgnoredSpanOrigins(List<String> list) {
        if (list == null) {
            this.ignoredSpanOrigins = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new j0(str));
            }
        }
        this.ignoredSpanOrigins = arrayList;
    }

    public void setIgnoredTransactions(List<String> list) {
        if (list == null) {
            this.ignoredTransactions = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (str != null && !str.isEmpty()) {
                arrayList.add(new j0(str));
            }
        }
        this.ignoredTransactions = arrayList;
    }

    public void setInitPriority(u1 u1Var) {
        this.initPriority = u1Var;
    }

    @Deprecated
    public void setInstrumenter(v1 v1Var) {
        this.instrumenter = v1Var;
    }

    public void setLogger(z0 z0Var) {
        this.logger = z0Var == null ? v2.a : new io.sentry.internal.debugmeta.c(1, this, z0Var);
    }

    public void setLogs(i6 i6Var) {
        this.logs = i6Var;
    }

    public void setMaxAttachmentSize(long j) {
        this.maxAttachmentSize = j;
    }

    public void setMaxBreadcrumbs(int i) {
        this.maxBreadcrumbs = i;
    }

    public void setMaxCacheItems(int i) {
        this.maxCacheItems = i;
    }

    public void setMaxDepth(int i) {
        this.maxDepth = i;
    }

    public void setMaxFeatureFlags(int i) {
        this.maxFeatureFlags = i;
    }

    public void setMaxQueueSize(int i) {
        if (i > 0) {
            this.maxQueueSize = i;
        }
    }

    public void setMaxRequestBodySize(o6 o6Var) {
        this.maxRequestBodySize = o6Var;
    }

    public void setMaxSpans(int i) {
        this.maxSpans = i;
    }

    public void setMaxTraceFileSize(long j) {
        this.maxTraceFileSize = j;
    }

    public void setMetrics(j6 j6Var) {
        this.metrics = j6Var;
    }

    public void setModulesLoader(io.sentry.internal.modules.a aVar) {
        if (aVar == null) {
            aVar = io.sentry.internal.modules.e.a;
        }
        this.modulesLoader = aVar;
    }

    public void setOpenTelemetryMode(z5 z5Var) {
        this.openTelemetryMode = z5Var;
    }

    public void setOrgId(String str) {
        this.orgId = str;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfileLifecycle(t3 t3Var) {
        this.profileLifecycle = t3Var;
        if (t3Var != t3.TRACE || isTracingEnabled()) {
            return;
        }
        this.logger.i(q5.WARNING, "Profiling lifecycle is set to TRACE but tracing is disabled. Profiling will not be started automatically.", new Object[0]);
    }

    public void setProfileSessionSampleRate(Double d) {
        if (io.sentry.util.b.m(d, true)) {
            this.profileSessionSampleRate = d;
        } else {
            com.adjust.sdk.sig.r3.m(d, " is not valid. Use values between 0.0 and 1.0.", "The value ");
        }
    }

    public void setProfilerConverter(d1 d1Var) {
        this.profilerConverter = d1Var;
    }

    public void setProfilesSampleRate(Double d) {
        if (io.sentry.util.b.m(d, true)) {
            this.profilesSampleRate = d;
        } else {
            com.adjust.sdk.sig.r3.m(d, " is not valid. Use null to disable or values between 0.0 and 1.0.", "The value ");
        }
    }

    public void setProfilingTracesDirPath(String str) {
        this.profilingTracesDirPath = str;
    }

    public void setProfilingTracesHz(int i) {
        this.profilingTracesHz = i;
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setPropagateTraceparent(boolean z) {
        this.propagateTraceparent = z;
    }

    public void setProxy(n6 n6Var) {
        this.proxy = n6Var;
    }

    public void setReadTimeoutMillis(int i) {
        this.readTimeoutMillis = i;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setReplayController(y3 y3Var) {
        if (y3Var == null) {
            y3Var = p2.d;
        }
        this.replayController = y3Var;
    }

    public void setSampleRate(Double d) {
        if (io.sentry.util.b.m(d, true)) {
            this.sampleRate = d;
        } else {
            com.adjust.sdk.sig.r3.m(d, " is not valid. Use null to disable or values >= 0.0 and <= 1.0.", "The value ");
        }
    }

    public void setSdkVersion(io.sentry.protocol.u uVar) {
        io.sentry.protocol.u uVar2 = getSessionReplay().l;
        io.sentry.protocol.u uVar3 = this.sdkVersion;
        if (uVar3 != null && uVar2 != null && uVar3.equals(uVar2)) {
            getSessionReplay().l = uVar;
        }
        this.sdkVersion = uVar;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new io.sentry.internal.debugmeta.c(this);
        } else {
            this.clientReportRecorder = new io.sentry.hints.j();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(m1 m1Var) {
        io.sentry.util.f fVar = this.serializer;
        if (m1Var == null) {
            m1Var = e3.a;
        }
        fVar.b(m1Var);
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionFlushTimeoutMillis(long j) {
        this.sessionFlushTimeoutMillis = j;
    }

    public void setSessionReplay(u6 u6Var) {
        this.sessionReplay = u6Var;
    }

    public void setSessionTrackingIntervalMillis(long j) {
        this.sessionTrackingIntervalMillis = j;
    }

    public void setShutdownTimeoutMillis(long j) {
        this.shutdownTimeoutMillis = j;
    }

    public void setSocketTagger(n1 n1Var) {
        if (n1Var == null) {
            n1Var = f3.a;
        }
        this.socketTagger = n1Var;
    }

    public void setSpanFactory(p1 p1Var) {
        this.spanFactory = p1Var;
    }

    public void setSpotlightConnectionUrl(String str) {
        this.spotlightConnectionUrl = str;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setStartProfilerOnAppStart(boolean z) {
        this.startProfilerOnAppStart = z;
    }

    public void setStrictTraceContinuation(boolean z) {
        this.strictTraceContinuation = z;
    }

    public void setTag(String str, String str2) {
        if (str == null) {
            return;
        }
        Map<String, String> map = this.tags;
        if (str2 == null) {
            map.remove(str);
        } else {
            map.put(str, str2);
        }
    }

    public void setThreadChecker(io.sentry.util.thread.a aVar) {
        this.threadChecker = aVar;
    }

    public void setTimerExecutorService(k1 k1Var) {
        if (k1Var != null) {
            this.timerExecutorService = k1Var;
        }
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d) {
        if (io.sentry.util.b.m(d, true)) {
            this.tracesSampleRate = d;
        } else {
            com.adjust.sdk.sig.r3.m(d, " is not valid. Use null to disable or values between 0.0 and 1.0.", "The value ");
        }
    }

    public void setTransactionProfiler(r1 r1Var) {
        if (this.transactionProfiler != p2.e || r1Var == null) {
            return;
        }
        this.transactionProfiler = r1Var;
    }

    public void setTransportFactory(s1 s1Var) {
        if (s1Var == null) {
            s1Var = j3.a;
        }
        this.transportFactory = s1Var;
    }

    public void setTransportGate(io.sentry.transport.h hVar) {
        if (hVar == null) {
            hVar = io.sentry.transport.k.a;
        }
        this.transportGate = hVar;
    }

    public void setVersionDetector(t1 t1Var) {
        this.versionDetector = t1Var;
    }

    public void setViewHierarchyExporters(List<ComposeViewHierarchyExporter> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    public void setBeforeEnvelopeCallback(c6 c6Var) {
    }

    public void setBeforeSend(d6 d6Var) {
    }

    public void setBeforeSendFeedback(d6 d6Var) {
    }

    public void setBeforeSendReplay(e6 e6Var) {
    }

    public void setBeforeSendTransaction(f6 f6Var) {
    }

    public void setOnDiscard(k6 k6Var) {
    }

    public void setOnOversizedEvent(l6 l6Var) {
    }

    public void setProfilesSampler(m6 m6Var) {
    }

    public void setScopesStorageFactory(i1 i1Var) {
    }

    public void setTracesSampler(p6 p6Var) {
    }
}
