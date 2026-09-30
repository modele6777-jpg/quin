package com.google.firebase.perf.session;

import android.content.Context;
import com.google.firebase.perf.session.gauges.GaugeManager;
import defpackage.c0;
import defpackage.gb0;
import defpackage.hb0;
import defpackage.n8a;
import defpackage.tzc;
import defpackage.zb0;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class SessionManager extends hb0 {
    private static final SessionManager instance = new SessionManager();
    private final gb0 appStateMonitor;
    private final Set<WeakReference<tzc>> clients;
    private final GaugeManager gaugeManager;
    private n8a perfSession;
    private Future syncInitFuture;

    public SessionManager(GaugeManager gaugeManager, n8a n8aVar, gb0 gb0Var) {
        super(gb0.a());
        this.clients = new HashSet();
        this.gaugeManager = gaugeManager;
        this.perfSession = n8aVar;
        this.appStateMonitor = gb0Var;
        registerForAppState();
    }

    public static SessionManager getInstance() {
        return instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void lambda$setApplicationContext$0(Context context, n8a n8aVar) {
        this.gaugeManager.initializeGaugeMetadataManager(context);
        if (n8aVar.c) {
            this.gaugeManager.logGaugeMetadata(n8aVar.a, zb0.FOREGROUND);
        }
    }

    private void logGaugeMetadataIfCollectionEnabled(zb0 zb0Var) {
        n8a n8aVar = this.perfSession;
        if (n8aVar.c) {
            this.gaugeManager.logGaugeMetadata(n8aVar.a, zb0Var);
        }
    }

    private void startOrStopCollectingGauges(zb0 zb0Var) {
        n8a n8aVar = this.perfSession;
        boolean z = n8aVar.c;
        GaugeManager gaugeManager = this.gaugeManager;
        if (z) {
            gaugeManager.startCollectingGauges(n8aVar, zb0Var);
        } else {
            gaugeManager.stopCollectingGauges();
        }
    }

    public Future getSyncInitFuture() {
        return this.syncInitFuture;
    }

    public void initializeGaugeCollection() {
        zb0 zb0Var = zb0.FOREGROUND;
        logGaugeMetadataIfCollectionEnabled(zb0Var);
        startOrStopCollectingGauges(zb0Var);
    }

    @Override // defpackage.hb0, defpackage.fb0
    public void onUpdateAppState(zb0 zb0Var) {
        super.onUpdateAppState(zb0Var);
        if (this.appStateMonitor.E0) {
            return;
        }
        if (zb0Var == zb0.FOREGROUND) {
            updatePerfSession(n8a.c(UUID.randomUUID().toString()));
        } else if (this.perfSession.d()) {
            updatePerfSession(n8a.c(UUID.randomUUID().toString()));
        } else {
            startOrStopCollectingGauges(zb0Var);
        }
    }

    public final n8a perfSession() {
        return this.perfSession;
    }

    public void registerForSessionUpdates(WeakReference<tzc> weakReference) {
        synchronized (this.clients) {
            this.clients.add(weakReference);
        }
    }

    public void setApplicationContext(Context context) {
        this.syncInitFuture = Executors.newSingleThreadExecutor().submit(new c0(this, context, this.perfSession, 28));
    }

    public void setPerfSession(n8a n8aVar) {
        this.perfSession = n8aVar;
    }

    public void stopGaugeCollectionIfSessionRunningTooLong() {
        if (this.perfSession.d()) {
            this.gaugeManager.stopCollectingGauges();
        }
    }

    public void unregisterForSessionUpdates(WeakReference<tzc> weakReference) {
        synchronized (this.clients) {
            this.clients.remove(weakReference);
        }
    }

    public void updatePerfSession(n8a n8aVar) {
        if (n8aVar.a == this.perfSession.a) {
            return;
        }
        this.perfSession = n8aVar;
        synchronized (this.clients) {
            try {
                Iterator<WeakReference<tzc>> it = this.clients.iterator();
                while (it.hasNext()) {
                    tzc tzcVar = it.next().get();
                    if (tzcVar != null) {
                        tzcVar.a(n8aVar);
                    } else {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        logGaugeMetadataIfCollectionEnabled(this.appStateMonitor.Y);
        startOrStopCollectingGauges(this.appStateMonitor.Y);
    }

    private SessionManager() {
        this(GaugeManager.getInstance(), n8a.c(UUID.randomUUID().toString()), gb0.a());
    }
}
