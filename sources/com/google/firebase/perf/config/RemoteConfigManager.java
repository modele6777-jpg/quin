package com.google.firebase.perf.config;

import android.content.Context;
import android.content.pm.PackageManager;
import defpackage.bqb;
import defpackage.cqb;
import defpackage.ct;
import defpackage.gg5;
import defpackage.i1b;
import defpackage.m74;
import defpackage.ng5;
import defpackage.og5;
import defpackage.ur9;
import defpackage.vi2;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, ng5> allRcConfigMap;
    private final m74 cache;
    private final Executor executor;
    private gg5 firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private i1b firebaseRemoteConfigProvider;
    private final long rcmInitTimestamp;
    private final long remoteConfigFetchDelayInMs;
    private static final ct logger = ct.d();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = 43200000;

    private RemoteConfigManager() {
        this(m74.b(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, ((long) new Random().nextInt(RANDOM_CONFIG_FETCH_DELAY_MS)) + MIN_CONFIG_FETCH_DELAY_MS);
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private ng5 getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        ng5 ng5Var = this.allRcConfigMap.get(str);
        if (((og5) ng5Var).b != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", ((og5) ng5Var).d(), str);
        return ng5Var;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasLastFetchBecomeStale(long j) {
        return j - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    private boolean hasRemoteConfigFetchDelayElapsed(long j) {
        return j - this.rcmInitTimestamp >= this.remoteConfigFetchDelayInMs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.b());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.g("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasRemoteConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.a().e(this.executor, new cqb(this)).d(this.executor, new cqb(this));
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.b());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public ur9 getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return new ur9();
        }
        ng5 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new ur9(Boolean.valueOf(((og5) remoteConfigValue).a()));
            } catch (IllegalArgumentException unused) {
                og5 og5Var = (og5) remoteConfigValue;
                if (!og5Var.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", og5Var.d(), str);
                }
            }
        }
        return new ur9();
    }

    public long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public ur9 getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return new ur9();
        }
        ng5 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new ur9(Double.valueOf(((og5) remoteConfigValue).b()));
            } catch (IllegalArgumentException unused) {
                og5 og5Var = (og5) remoteConfigValue;
                if (!og5Var.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", og5Var.d(), str);
                }
            }
        }
        return new ur9();
    }

    public ur9 getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return new ur9();
        }
        ng5 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return new ur9(Long.valueOf(((og5) remoteConfigValue).c()));
            } catch (IllegalArgumentException unused) {
                og5 og5Var = (og5) remoteConfigValue;
                if (!og5Var.d().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", og5Var.d(), str);
                }
            }
        }
        return new ur9();
    }

    public <T> T getRemoteConfigValueOrDefault(String str, T t) {
        ng5 remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                if (t instanceof Boolean) {
                    return (T) Boolean.valueOf(((og5) remoteConfigValue).a());
                }
                if (t instanceof Double) {
                    return (T) Double.valueOf(((og5) remoteConfigValue).b());
                }
                if (!(t instanceof Long) && !(t instanceof Integer)) {
                    if (t instanceof String) {
                        return (T) ((og5) remoteConfigValue).d();
                    }
                    T t2 = (T) ((og5) remoteConfigValue).d();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t);
                        return t2;
                    } catch (IllegalArgumentException unused) {
                        t = t2;
                        og5 og5Var = (og5) remoteConfigValue;
                        if (!og5Var.d().isEmpty()) {
                            logger.b("Could not parse value: '%s' for key: '%s'.", og5Var.d(), str);
                        }
                        return t;
                    }
                }
                return (T) Long.valueOf(((og5) remoteConfigValue).c());
            } catch (IllegalArgumentException unused2) {
            }
        }
        return t;
    }

    public ur9 getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return new ur9();
        }
        ng5 remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? new ur9(((og5) remoteConfigValue).d()) : new ur9();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        i1b i1bVar;
        bqb bqbVar;
        if (this.firebaseRemoteConfig == null && (i1bVar = this.firebaseRemoteConfigProvider) != null && (bqbVar = (bqb) i1bVar.get()) != null) {
            this.firebaseRemoteConfig = bqbVar.b(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        gg5 gg5Var = this.firebaseRemoteConfig;
        return gg5Var == null || gg5Var.c().b == 1 || this.firebaseRemoteConfig.c().b == 2;
    }

    public void setFirebaseRemoteConfigProvider(i1b i1bVar) {
        this.firebaseRemoteConfigProvider = i1bVar;
    }

    public void syncConfigValues(Map<String, ng5> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        vi2 vi2VarN1 = vi2.n1();
        ConcurrentHashMap<String, ng5> concurrentHashMap = this.allRcConfigMap;
        vi2VarN1.getClass();
        ng5 ng5Var = concurrentHashMap.get("fpr_experiment_app_start_ttid");
        if (ng5Var == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.g("com.google.firebase.perf.ExperimentTTID", ((og5) ng5Var).a());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    public RemoteConfigManager(m74 m74Var, Executor executor, gg5 gg5Var, long j) {
        ConcurrentHashMap<String, ng5> concurrentHashMap;
        this.rcmInitTimestamp = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = m74Var;
        this.executor = executor;
        this.firebaseRemoteConfig = gg5Var;
        if (gg5Var == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(gg5Var.b());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.remoteConfigFetchDelayInMs = j;
    }
}
