package com.google.firebase.perf.session.gauges;

import android.content.Context;
import defpackage.ax2;
import defpackage.bx2;
import defpackage.ct;
import defpackage.dx2;
import defpackage.e4f;
import defpackage.fc2;
import defpackage.fj2;
import defpackage.gj2;
import defpackage.ht;
import defpackage.ij2;
import defpackage.ji2;
import defpackage.jj2;
import defpackage.jzb;
import defpackage.kr8;
import defpackage.lr8;
import defpackage.mw7;
import defpackage.n8a;
import defpackage.oye;
import defpackage.qae;
import defpackage.t46;
import defpackage.u2e;
import defpackage.u46;
import defpackage.ur9;
import defpackage.v2e;
import defpackage.v46;
import defpackage.w46;
import defpackage.x46;
import defpackage.y46;
import defpackage.zb0;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private zb0 applicationProcessState;
    private final ji2 configResolver;
    private final mw7 cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final mw7 gaugeManagerExecutor;
    private w46 gaugeMetadataManager;
    private final mw7 memoryGaugeCollector;
    private String sessionId;
    private final e4f transportManager;
    private static final ct logger = ct.d();
    private static final GaugeManager instance = new GaugeManager();

    private GaugeManager() {
        this(new mw7(new fc2(6)), e4f.H0, ji2.e(), null, new mw7(new fc2(7)), new mw7(new fc2(8)));
    }

    private static void collectGaugeMetricOnce(bx2 bx2Var, lr8 lr8Var, oye oyeVar) {
        int i;
        synchronized (bx2Var) {
            i = 1;
            try {
                bx2Var.b.schedule(new ax2(bx2Var, oyeVar, i), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                bx2.g.f("Unable to collect Cpu Metric: " + e.getMessage());
            }
        }
        synchronized (lr8Var) {
            try {
                lr8Var.a.schedule(new kr8(lr8Var, oyeVar, i), 0L, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                lr8.f.f("Unable to collect Memory Metric: " + e2.getMessage());
            }
        }
    }

    private long getCpuGaugeCollectionFrequencyMs(zb0 zb0Var) {
        gj2 gj2Var;
        long jLongValue;
        fj2 fj2Var;
        int iOrdinal = zb0Var.ordinal();
        if (iOrdinal == 1) {
            ji2 ji2Var = this.configResolver;
            ji2Var.getClass();
            synchronized (gj2.class) {
                gj2Var = gj2.l;
                if (gj2Var == null) {
                    gj2Var = new gj2();
                    gj2.l = gj2Var;
                }
            }
            ur9 ur9VarI = ji2Var.i(gj2Var);
            if (ur9VarI.b() && ji2.m(((Long) ur9VarI.a()).longValue())) {
                jLongValue = ((Long) ur9VarI.a()).longValue();
            } else {
                ur9 ur9Var = ji2Var.a.getLong("fpr_session_gauge_cpu_capture_frequency_fg_ms");
                if (ur9Var.b() && ji2.m(((Long) ur9Var.a()).longValue())) {
                    ji2Var.c.d(((Long) ur9Var.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) ur9Var.a()).longValue();
                } else {
                    ur9 ur9VarC = ji2Var.c(gj2Var);
                    if (ur9VarC.b() && ji2.m(((Long) ur9VarC.a()).longValue())) {
                        jLongValue = ((Long) ur9VarC.a()).longValue();
                    } else {
                        jLongValue = ji2Var.a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            ji2 ji2Var2 = this.configResolver;
            ji2Var2.getClass();
            synchronized (fj2.class) {
                fj2Var = fj2.l;
                if (fj2Var == null) {
                    fj2Var = new fj2();
                    fj2.l = fj2Var;
                }
            }
            ur9 ur9VarI2 = ji2Var2.i(fj2Var);
            if (ur9VarI2.b() && ji2.m(((Long) ur9VarI2.a()).longValue())) {
                jLongValue = ((Long) ur9VarI2.a()).longValue();
            } else {
                ur9 ur9Var2 = ji2Var2.a.getLong("fpr_session_gauge_cpu_capture_frequency_bg_ms");
                if (ur9Var2.b() && ji2.m(((Long) ur9Var2.a()).longValue())) {
                    ji2Var2.c.d(((Long) ur9Var2.a()).longValue(), "com.google.firebase.perf.SessionsCpuCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) ur9Var2.a()).longValue();
                } else {
                    ur9 ur9VarC2 = ji2Var2.c(fj2Var);
                    jLongValue = (ur9VarC2.b() && ji2.m(((Long) ur9VarC2.a()).longValue())) ? ((Long) ur9VarC2.a()).longValue() : 0L;
                }
            }
        }
        ct ctVar = bx2.g;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    private v46 getGaugeMetadata() {
        u46 u46VarT = v46.t();
        long j = this.gaugeMetadataManager.c.totalMem;
        u2e u2eVar = v2e.c;
        int iO = jzb.o(u2eVar.a(j));
        u46VarT.i();
        ((v46) u46VarT.b).u(iO);
        int iO2 = jzb.o(u2eVar.a(this.gaugeMetadataManager.a.maxMemory()));
        u46VarT.i();
        ((v46) u46VarT.b).v(iO2);
        int iO3 = jzb.o(v2e.a.a(this.gaugeMetadataManager.b.getMemoryClass()));
        u46VarT.i();
        ((v46) u46VarT.b).w(iO3);
        return (v46) u46VarT.h();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(zb0 zb0Var) {
        jj2 jj2Var;
        long jLongValue;
        ij2 ij2Var;
        int iOrdinal = zb0Var.ordinal();
        if (iOrdinal == 1) {
            ji2 ji2Var = this.configResolver;
            ji2Var.getClass();
            synchronized (jj2.class) {
                jj2Var = jj2.l;
                if (jj2Var == null) {
                    jj2Var = new jj2();
                    jj2.l = jj2Var;
                }
            }
            ur9 ur9VarI = ji2Var.i(jj2Var);
            if (ur9VarI.b() && ji2.m(((Long) ur9VarI.a()).longValue())) {
                jLongValue = ((Long) ur9VarI.a()).longValue();
            } else {
                ur9 ur9Var = ji2Var.a.getLong("fpr_session_gauge_memory_capture_frequency_fg_ms");
                if (ur9Var.b() && ji2.m(((Long) ur9Var.a()).longValue())) {
                    ji2Var.c.d(((Long) ur9Var.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyForegroundMs");
                    jLongValue = ((Long) ur9Var.a()).longValue();
                } else {
                    ur9 ur9VarC = ji2Var.c(jj2Var);
                    if (ur9VarC.b() && ji2.m(((Long) ur9VarC.a()).longValue())) {
                        jLongValue = ((Long) ur9VarC.a()).longValue();
                    } else {
                        jLongValue = ji2Var.a.isLastFetchFailed() ? 300L : 100L;
                    }
                }
            }
        } else if (iOrdinal != 2) {
            jLongValue = -1;
        } else {
            ji2 ji2Var2 = this.configResolver;
            ji2Var2.getClass();
            synchronized (ij2.class) {
                ij2Var = ij2.l;
                if (ij2Var == null) {
                    ij2Var = new ij2();
                    ij2.l = ij2Var;
                }
            }
            ur9 ur9VarI2 = ji2Var2.i(ij2Var);
            if (ur9VarI2.b() && ji2.m(((Long) ur9VarI2.a()).longValue())) {
                jLongValue = ((Long) ur9VarI2.a()).longValue();
            } else {
                ur9 ur9Var2 = ji2Var2.a.getLong("fpr_session_gauge_memory_capture_frequency_bg_ms");
                if (ur9Var2.b() && ji2.m(((Long) ur9Var2.a()).longValue())) {
                    ji2Var2.c.d(((Long) ur9Var2.a()).longValue(), "com.google.firebase.perf.SessionsMemoryCaptureFrequencyBackgroundMs");
                    jLongValue = ((Long) ur9Var2.a()).longValue();
                } else {
                    ur9 ur9VarC2 = ji2Var2.c(ij2Var);
                    jLongValue = (ur9VarC2.b() && ji2.m(((Long) ur9VarC2.a()).longValue())) ? ((Long) ur9VarC2.a()).longValue() : 0L;
                }
            }
        }
        ct ctVar = lr8.f;
        return jLongValue <= 0 ? INVALID_GAUGE_COLLECTION_FREQUENCY : jLongValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ bx2 lambda$new$0() {
        return new bx2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ lr8 lambda$new$1() {
        return new lr8();
    }

    private boolean startCollectingCpuMetrics(long j, oye oyeVar) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        bx2 bx2Var = (bx2) this.cpuGaugeCollector.get();
        long j2 = bx2Var.d;
        if (j2 == INVALID_GAUGE_COLLECTION_FREQUENCY || j2 == 0 || j <= 0) {
            return true;
        }
        ScheduledFuture scheduledFuture = bx2Var.e;
        if (scheduledFuture == null) {
            bx2Var.a(j, oyeVar);
            return true;
        }
        if (bx2Var.f == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bx2Var.e = null;
            bx2Var.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        bx2Var.a(j, oyeVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j, oye oyeVar) {
        if (j == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        lr8 lr8Var = (lr8) this.memoryGaugeCollector.get();
        ct ctVar = lr8.f;
        if (j <= 0) {
            lr8Var.getClass();
            return true;
        }
        ScheduledFuture scheduledFuture = lr8Var.d;
        if (scheduledFuture == null) {
            lr8Var.a(j, oyeVar);
            return true;
        }
        if (lr8Var.e == j) {
            return true;
        }
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            lr8Var.d = null;
            lr8Var.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        lr8Var.a(j, oyeVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, zb0 zb0Var) {
        x46 x46VarZ = y46.z();
        while (!((bx2) this.cpuGaugeCollector.get()).a.isEmpty()) {
            dx2 dx2Var = (dx2) ((bx2) this.cpuGaugeCollector.get()).a.poll();
            x46VarZ.i();
            ((y46) x46VarZ.b).s(dx2Var);
        }
        while (!((lr8) this.memoryGaugeCollector.get()).b.isEmpty()) {
            ht htVar = (ht) ((lr8) this.memoryGaugeCollector.get()).b.poll();
            x46VarZ.i();
            ((y46) x46VarZ.b).r(htVar);
        }
        x46VarZ.i();
        ((y46) x46VarZ.b).B(str);
        e4f e4fVar = this.transportManager;
        e4fVar.w.execute(new qae(e4fVar, (y46) x46VarZ.h(), zb0Var, 1));
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new w46(context);
    }

    public boolean logGaugeMetadata(String str, zb0 zb0Var) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        x46 x46VarZ = y46.z();
        x46VarZ.i();
        ((y46) x46VarZ.b).B(str);
        v46 gaugeMetadata = getGaugeMetadata();
        x46VarZ.i();
        ((y46) x46VarZ.b).A(gaugeMetadata);
        y46 y46Var = (y46) x46VarZ.h();
        e4f e4fVar = this.transportManager;
        e4fVar.w.execute(new qae(e4fVar, y46Var, zb0Var, 1));
        return true;
    }

    public void startCollectingGauges(n8a n8aVar, zb0 zb0Var) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(zb0Var, n8aVar.b);
        if (jStartCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.f("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        String str = n8aVar.a;
        this.sessionId = str;
        this.applicationProcessState = zb0Var;
        try {
            long j = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).scheduleAtFixedRate(new t46(this, str, zb0Var, 1), j, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            logger.f("Unable to start collecting Gauges: " + e.getMessage());
        }
    }

    public void stopCollectingGauges() {
        String str = this.sessionId;
        if (str == null) {
            return;
        }
        zb0 zb0Var = this.applicationProcessState;
        bx2 bx2Var = (bx2) this.cpuGaugeCollector.get();
        ScheduledFuture scheduledFuture = bx2Var.e;
        int i = 0;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            bx2Var.e = null;
            bx2Var.f = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        lr8 lr8Var = (lr8) this.memoryGaugeCollector.get();
        ScheduledFuture scheduledFuture2 = lr8Var.d;
        if (scheduledFuture2 != null) {
            scheduledFuture2.cancel(false);
            lr8Var.d = null;
            lr8Var.e = INVALID_GAUGE_COLLECTION_FREQUENCY;
        }
        ScheduledFuture scheduledFuture3 = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture3 != null) {
            scheduledFuture3.cancel(false);
        }
        ((ScheduledExecutorService) this.gaugeManagerExecutor.get()).schedule(new t46(this, str, zb0Var, i), 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = zb0.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    public GaugeManager(mw7 mw7Var, e4f e4fVar, ji2 ji2Var, w46 w46Var, mw7 mw7Var2, mw7 mw7Var3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = zb0.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = mw7Var;
        this.transportManager = e4fVar;
        this.configResolver = ji2Var;
        this.gaugeMetadataManager = w46Var;
        this.cpuGaugeCollector = mw7Var2;
        this.memoryGaugeCollector = mw7Var3;
    }

    private long startCollectingGauges(zb0 zb0Var, oye oyeVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(zb0Var);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, oyeVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(zb0Var);
        if (startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, oyeVar)) {
            return cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs);
        }
        return cpuGaugeCollectionFrequencyMs;
    }

    public void collectGaugeMetricOnce(oye oyeVar) {
        collectGaugeMetricOnce((bx2) this.cpuGaugeCollector.get(), (lr8) this.memoryGaugeCollector.get(), oyeVar);
    }
}
